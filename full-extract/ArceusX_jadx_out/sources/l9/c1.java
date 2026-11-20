package l9;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f23289a;

    public c1(f1 f1Var) {
        this.f23289a = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e1 e1Var;
        e1Var = this.f23289a.f23318g;
        e1Var.c(new ConnectionResult(4));
    }
}
