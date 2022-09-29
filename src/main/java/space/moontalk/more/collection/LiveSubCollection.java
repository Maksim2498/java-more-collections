package space.moontalk.more.collection;

import java.util.Collection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface LiveSubCollection<T extends C, C> extends Collection<T> {
    boolean belongs(@Nullable Object object);
    @NotNull Collection<C> getCollection();
}
