package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class dd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26166a;
    public final /* synthetic */ ld b;

    public dd(ld ldVar, long j10) {
        this.f26166a = j10;
        Objects.requireNonNull(ldVar);
        this.b = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.s(this.f26166a);
    }
}
