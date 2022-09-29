package space.moontalk.more.collection;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnknownNullability;

// In progress:

public abstract class AbstractLiveSubList<T extends C, C> extends    AbstractLiveSubCollection<T, C>
                                                          implements LiveSubList<T, C> {
    public AbstractLiveSubList(@NotNull List<C> list) {
        super(list);
    }

    @Override
    public @NotNull List<C> getList() {
        return (List<C>) getCollection();
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends T> collection) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public @UnknownNullability T get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public @UnknownNullability T set(int index, @UnknownNullability T element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(int index, @UnknownNullability T element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public @UnknownNullability T remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(@UnknownNullability Object object) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int lastIndexOf(@UnknownNullability Object object) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public @NotNull ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public @NotNull ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public @NotNull List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }
}
