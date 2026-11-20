package h6;

import java.util.concurrent.Executor;
import ju.l0;
import ju.v1;

/* loaded from: classes.dex */
public interface b {
    Executor a();

    default l0 b() {
        return v1.b(c());
    }

    a c();

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
