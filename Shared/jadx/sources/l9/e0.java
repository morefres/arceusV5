package l9;

import l9.c;

/* loaded from: classes.dex */
public final class e0 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f23292a;

    public e0(f fVar) {
        this.f23292a = fVar;
    }

    @Override // l9.c.a
    public final void a(boolean z10) {
        f fVar = this.f23292a;
        fVar.f23309s.sendMessage(fVar.f23309s.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
