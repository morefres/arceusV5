package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26559a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26560c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa f26561d;

    public p9(qa qaVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f26559a = atomicReference;
        this.b = str2;
        this.f26560c = str3;
        Objects.requireNonNull(qaVar);
        this.f26561d = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26561d.f26328a.J().e0(this.f26559a, null, this.b, this.f26560c);
    }
}
