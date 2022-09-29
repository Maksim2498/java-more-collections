package space.moontalk.more.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;

import lombok.AllArgsConstructor;
import lombok.val;

@AllArgsConstructor
public abstract class AbstractLiveSubCollection<T extends C, C> implements LiveSubCollection<T, C> {
    private final @NotNull Collection<C> collection;

    @Override
    public @NotNull Collection<C> getCollection() {
        return collection;
    }

    @Override
    public int size() {
        return collect().size();
    }

    @Override
    public boolean isEmpty() {
        return collect().isEmpty();
    }

    @Override
    public boolean contains(@UnknownNullability Object object) {
        return collect().contains(object);
    }

    @Override
    public @NotNull Iterator<T> iterator() {
        return new FilteringIterator();
    }

    @Override
    public @NotNull Object[] toArray() {
        return collect().toArray();
    }

    @Override
    public <A> @NotNull A[] toArray(@NotNull A[] array) {
        return collect().toArray(array);
    }

    @Override
    public boolean add(@UnknownNullability T object) {
        return belongs(object) ? collection.add(object) : false;
    }

    @Override
    public boolean remove(@UnknownNullability Object object) {
        return belongs(object) ? collection.remove(object) : false;
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> collection) {
        return collect().containsAll(collection);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends T> collection) {
        var changed = false;

        for (val object : collection) 
            if (belongs(object) && this.collection.add(object)) 
                changed = true;

        return changed;
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> collection) {
        var changed = false;

        for (val object : collection)
            if (remove(object))
                changed = true;

        return changed;
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> collection) {
        collection = collection.stream().filter(object -> belongs(object))
                                        .collect(Collectors.toList());

        return this.collection.retainAll(collection);
    }

    @Override
    public void clear() {
        val collection = collect();

        for (val object : collection)
            this.collection.remove(object);
    }

    @SuppressWarnings("unchecked")
    protected @NotNull Collection<T> collect() {
        return collection.stream().filter(object -> belongs(object))
                                  .map(object -> (T) object)
                                  .collect(Collectors.toList());
    }

    private class FilteringIterator implements Iterator<T> {
        private final @NotNull  Iterator<C> iterator = collection.iterator();
        private       @Nullable C           next;

        public FilteringIterator() {
            updateNext();
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        @SuppressWarnings("unchecked")
        public @UnknownNullability T next() {
            val next = this.next;
            updateNext();
            return (T) next;
        }

        private void updateNext() {
            next = null;

            while (iterator.hasNext()) {
                val next = iterator.next();

                if (belongs(next)) {
                    this.next = next;
                    break;
                }
            }
        }
    }
}
