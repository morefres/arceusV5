package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class cd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26141a;
    public final /* synthetic */ ld b;

    public cd(ld ldVar, long j10) {
        this.f26141a = j10;
        Objects.requireNonNull(ldVar);
        this.b = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.r(this.f26141a);
    }
}
