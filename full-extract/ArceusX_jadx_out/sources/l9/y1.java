package l9;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f23399a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f23400c;

    public y1(z1 z1Var, i iVar, String str) {
        this.f23399a = iVar;
        this.b = str;
        Objects.requireNonNull(z1Var);
        this.f23400c = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        z1 z1Var = this.f23400c;
        if (z1Var.k() > 0) {
            i iVar = this.f23399a;
            if (z1Var.l() != null) {
                bundle = z1Var.l().getBundle(this.b);
            } else {
                bundle = null;
            }
            iVar.f(bundle);
        }
        if (z1Var.k() >= 2) {
            this.f23399a.j();
        }
        if (z1Var.k() >= 3) {
            this.f23399a.h();
        }
        if (z1Var.k() >= 4) {
            this.f23399a.k();
        }
        if (z1Var.k() >= 5) {
            this.f23399a.g();
        }
    }
}
