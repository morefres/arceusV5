package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class q9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26590a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa f26593e;

    public q9(qa qaVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f26590a = atomicReference;
        this.b = str2;
        this.f26591c = str3;
        this.f26592d = z10;
        Objects.requireNonNull(qaVar);
        this.f26593e = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26593e.f26328a.J().g0(this.f26590a, null, this.b, this.f26591c, this.f26592d);
    }
}
