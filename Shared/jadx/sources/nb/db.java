package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class db implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb f26158a;
    public final /* synthetic */ bb b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jb f26161e;

    public db(jb jbVar, bb bbVar, bb bbVar2, long j10, boolean z10) {
        this.f26158a = bbVar;
        this.b = bbVar2;
        this.f26159c = j10;
        this.f26160d = z10;
        Objects.requireNonNull(jbVar);
        this.f26161e = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26161e.B(this.f26158a, this.b, this.f26159c, this.f26160d, null);
    }
}
