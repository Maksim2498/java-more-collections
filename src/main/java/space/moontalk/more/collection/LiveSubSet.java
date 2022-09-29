package space.moontalk.more.collection;

import java.util.Set;

import org.jetbrains.annotations.NotNull;

public interface LiveSubSet<T extends C, C> extends LiveSubCollection<T, C>,
                                                    Set<T> {
    @NotNull Set<C> getSet();
}
