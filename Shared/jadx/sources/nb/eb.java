package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class eb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jb f26193a;

    public eb(jb jbVar) {
        Objects.requireNonNull(jbVar);
        this.f26193a = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb jbVar = this.f26193a;
        jbVar.f26336e = jbVar.D();
    }
}
