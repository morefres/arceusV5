package nb;

import java.util.Map;

/* loaded from: classes.dex */
public final class z5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final y5 f26915a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f26916c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26917d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26918e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f26919f;

    public /* synthetic */ z5(String str, y5 y5Var, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        n9.m.l(y5Var);
        this.f26915a = y5Var;
        this.b = i10;
        this.f26916c = th2;
        this.f26917d = bArr;
        this.f26918e = str;
        this.f26919f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26915a.a(this.f26918e, this.b, this.f26916c, this.f26917d, this.f26919f);
    }
}
