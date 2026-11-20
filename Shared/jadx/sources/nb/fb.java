package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class fb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26221a;
    public final /* synthetic */ jb b;

    public fb(jb jbVar, long j10) {
        this.f26221a = j10;
        Objects.requireNonNull(jbVar);
        this.b = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb jbVar = this.b;
        jbVar.f26328a.M().k(this.f26221a);
        jbVar.f26336e = null;
    }
}
