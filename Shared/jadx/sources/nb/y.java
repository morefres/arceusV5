package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26817a;
    public final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1 f26818c;

    public y(y1 y1Var, String str, long j10) {
        this.f26817a = str;
        this.b = j10;
        Objects.requireNonNull(y1Var);
        this.f26818c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26818c.m(this.f26817a, this.b);
    }
}
