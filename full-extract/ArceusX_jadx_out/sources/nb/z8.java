package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class z8 extends w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa f26923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(qa qaVar, l8 l8Var) {
        super(l8Var);
        Objects.requireNonNull(qaVar);
        this.f26923e = qaVar;
    }

    @Override // nb.w
    public final void a() {
        final qa B = this.f26923e.f26328a.B();
        Objects.requireNonNull(B);
        new Thread(new Runnable() { // from class: nb.y8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qa.this.u0();
            }
        }).start();
    }
}
