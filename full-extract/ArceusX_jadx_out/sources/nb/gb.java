package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb f26264a;
    public final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jb f26265c;

    public gb(jb jbVar, bb bbVar, long j10) {
        this.f26264a = bbVar;
        this.b = j10;
        Objects.requireNonNull(jbVar);
        this.f26265c = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb jbVar = this.f26265c;
        jbVar.C(this.f26264a, false, this.b);
        jbVar.f26336e = null;
        jbVar.f26328a.J().u(null);
    }
}
