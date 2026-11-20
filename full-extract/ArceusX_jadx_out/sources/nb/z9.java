package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class z9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8 f26924a;
    public final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa f26926d;

    public z9(qa qaVar, q8 q8Var, long j10, boolean z10) {
        this.f26924a = q8Var;
        this.b = j10;
        this.f26925c = z10;
        Objects.requireNonNull(qaVar);
        this.f26926d = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.f26926d;
        q8 q8Var = this.f26924a;
        qaVar.o(q8Var);
        qaVar.X(q8Var, this.b, true, this.f26925c);
    }
}
