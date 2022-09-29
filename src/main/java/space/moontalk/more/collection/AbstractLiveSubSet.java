package space.moontalk.more.collection;

import java.util.Set;

import org.jetbrains.annotations.NotNull;

public abstract class AbstractLiveSubSet<T extends C, C> extends    AbstractLiveSubCollection<T, C>
                                                         implements LiveSubSet<T, C> {
    public AbstractLiveSubSet(@NotNull Set<C> set) {
        super(set);
    }

    @Override
    public @NotNull Set<C> getSet() {
        return (Set<C>) getCollection();
    }
}
