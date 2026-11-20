package iv;

import okhttp3.Request;

/* loaded from: classes2.dex */
public interface d<T> extends Cloneable {
    void F(f<T> fVar);

    void cancel();

    /* renamed from: clone */
    d<T> m73clone();

    x<T> execute();

    boolean isCanceled();

    Request request();
}
