package d0;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import n0.k3;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14208a;
    public boolean b = false;

    public n(k3 k3Var) {
        this.f14208a = k3Var.b(AutoFlashUnderExposedQuirk.class) != null;
    }

    public void a() {
        this.b = false;
    }

    public void b() {
        this.b = true;
    }

    public boolean c(int i10) {
        return this.b && i10 == 0 && this.f14208a;
    }
}
