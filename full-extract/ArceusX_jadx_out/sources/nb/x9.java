package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class x9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f26813a;
    public final /* synthetic */ qa b;

    public x9(qa qaVar, Boolean bool) {
        this.f26813a = bool;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.W(this.f26813a, true);
    }
}
