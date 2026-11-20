package fb;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f17078a = new AtomicReference();

    public final void a() {
        b bVar = (b) this.f17078a.get();
        if (bVar != null) {
            bVar.b();
        }
    }
}
