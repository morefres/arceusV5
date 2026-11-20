package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8 f26036a;
    public final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa f26038d;

    public aa(qa qaVar, q8 q8Var, long j10, boolean z10) {
        this.f26036a = q8Var;
        this.b = j10;
        this.f26037c = z10;
        Objects.requireNonNull(qaVar);
        this.f26038d = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.f26038d;
        q8 q8Var = this.f26036a;
        qaVar.o(q8Var);
        qaVar.X(q8Var, this.b, false, this.f26037c);
    }
}
