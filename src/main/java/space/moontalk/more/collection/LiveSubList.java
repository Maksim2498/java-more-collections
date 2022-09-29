package space.moontalk.more.collection;

import java.util.List;

import org.jetbrains.annotations.NotNull;

public interface LiveSubList<T extends C, C> extends LiveSubCollection<T, C>,
                                                     List<T> {
    @NotNull List<C> getList();
}
