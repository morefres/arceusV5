package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class xb extends w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f26815e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(tc tcVar, l8 l8Var) {
        super(l8Var);
        Objects.requireNonNull(tcVar);
        this.f26815e = tcVar;
    }

    @Override // nb.w
    public final void a() {
        this.f26815e.f26328a.a().r().a("Tasks have been queued for a long time");
    }
}
