package l9;

import com.google.android.gms.signin.internal.zak;

/* loaded from: classes.dex */
public final class d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zak f23291a;
    public final /* synthetic */ f1 b;

    public d1(f1 f1Var, zak zakVar) {
        this.b = f1Var;
        this.f23291a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f1.t2(this.b, this.f23291a);
    }
}
