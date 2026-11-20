package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26015a;
    public final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1 f26016c;

    public a(y1 y1Var, String str, long j10) {
        this.f26015a = str;
        this.b = j10;
        Objects.requireNonNull(y1Var);
        this.f26016c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26016c.l(this.f26015a, this.b);
    }
}
