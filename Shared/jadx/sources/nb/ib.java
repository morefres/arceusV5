package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ib implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jb f26312a;

    public ib(jb jbVar) {
        Objects.requireNonNull(jbVar);
        this.f26312a = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26312a.E(null);
    }
}
