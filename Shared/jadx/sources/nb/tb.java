package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class tb extends w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f26689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(tc tcVar, l8 l8Var) {
        super(l8Var);
        Objects.requireNonNull(tcVar);
        this.f26689e = tcVar;
    }

    @Override // nb.w
    public final void a() {
        tc tcVar = this.f26689e;
        tcVar.h();
        if (tcVar.W()) {
            tcVar.f26328a.a().w().a("Inactivity, disconnecting from the service");
            tcVar.A();
        }
    }
}
