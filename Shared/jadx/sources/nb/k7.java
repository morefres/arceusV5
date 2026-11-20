package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26395a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26396c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i8 f26398e;

    public k7(i8 i8Var, String str, String str2, String str3, long j10) {
        this.f26395a = str;
        this.b = str2;
        this.f26396c = str3;
        this.f26397d = j10;
        Objects.requireNonNull(i8Var);
        this.f26398e = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f26395a;
        if (str == null) {
            i8 i8Var = this.f26398e;
            i8Var.z2().t0(this.b, null);
        } else {
            bb bbVar = new bb(this.f26396c, str, this.f26397d);
            i8 i8Var2 = this.f26398e;
            i8Var2.z2().t0(this.b, bbVar);
        }
    }
}
