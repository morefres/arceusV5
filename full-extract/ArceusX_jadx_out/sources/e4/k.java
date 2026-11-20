package e4;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.C0702e1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes.dex */
public class k extends androidx.fragment.app.c implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: f0, reason: collision with root package name */
    public Handler f15637f0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f15646o0;

    /* renamed from: q0, reason: collision with root package name */
    public Dialog f15648q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f15649r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f15650s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f15651t0;

    /* renamed from: g0, reason: collision with root package name */
    public Runnable f15638g0 = new a();

    /* renamed from: h0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f15639h0 = new b();

    /* renamed from: i0, reason: collision with root package name */
    public DialogInterface.OnDismissListener f15640i0 = new c();

    /* renamed from: j0, reason: collision with root package name */
    public int f15641j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    public int f15642k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f15643l0 = true;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f15644m0 = true;

    /* renamed from: n0, reason: collision with root package name */
    public int f15645n0 = -1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.e0<android.view.s> f15647p0 = new d();

    /* renamed from: u0, reason: collision with root package name */
    public boolean f15652u0 = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f15640i0.onDismiss(k.this.f15648q0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (k.this.f15648q0 != null) {
                k kVar = k.this;
                kVar.onCancel(kVar.f15648q0);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (k.this.f15648q0 != null) {
                k kVar = k.this;
                kVar.onDismiss(kVar.f15648q0);
            }
        }
    }

    public class d implements android.view.e0<android.view.s> {
        public d() {
        }

        @Override // android.view.e0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(android.view.s sVar) {
            if (sVar == null || !k.this.f15644m0) {
                return;
            }
            View J1 = k.this.J1();
            if (J1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (k.this.f15648q0 != null) {
                if (FragmentManager.N0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + k.this.f15648q0);
                }
                k.this.f15648q0.setContentView(J1);
            }
        }
    }

    public class e extends r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f15657a;

        public e(r rVar) {
            this.f15657a = rVar;
        }

        @Override // e4.r
        public View d(int i10) {
            return this.f15657a.e() ? this.f15657a.d(i10) : k.this.l2(i10);
        }

        @Override // e4.r
        public boolean e() {
            return this.f15657a.e() || k.this.m2();
        }
    }

    @Override // androidx.fragment.app.c
    public void C0(@NonNull Context context) {
        super.C0(context);
        l0().j(this.f15647p0);
        if (this.f15651t0) {
            return;
        }
        this.f15650s0 = false;
    }

    @Override // androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        this.f15637f0 = new Handler();
        this.f15644m0 = this.A == 0;
        if (bundle != null) {
            this.f15641j0 = bundle.getInt("android:style", 0);
            this.f15642k0 = bundle.getInt("android:theme", 0);
            this.f15643l0 = bundle.getBoolean("android:cancelable", true);
            this.f15644m0 = bundle.getBoolean("android:showsDialog", this.f15644m0);
            this.f15645n0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.c
    public void M0() {
        super.M0();
        Dialog dialog = this.f15648q0;
        if (dialog != null) {
            this.f15649r0 = true;
            dialog.setOnDismissListener(null);
            this.f15648q0.dismiss();
            if (!this.f15650s0) {
                onDismiss(this.f15648q0);
            }
            this.f15648q0 = null;
            this.f15652u0 = false;
        }
    }

    @Override // androidx.fragment.app.c
    public void N0() {
        super.N0();
        if (!this.f15651t0 && !this.f15650s0) {
            this.f15650s0 = true;
        }
        l0().n(this.f15647p0);
    }

    @Override // androidx.fragment.app.c
    @NonNull
    public LayoutInflater O0(Bundle bundle) {
        LayoutInflater O0 = super.O0(bundle);
        if (this.f15644m0 && !this.f15646o0) {
            n2(bundle);
            if (FragmentManager.N0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f15648q0;
            if (dialog != null) {
                return O0.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.N0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f15644m0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return O0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return O0;
    }

    @Override // androidx.fragment.app.c
    public void b1(@NonNull Bundle bundle) {
        super.b1(bundle);
        Dialog dialog = this.f15648q0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f15641j0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f15642k0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f15643l0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f15644m0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f15645n0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.c
    public void c1() {
        super.c1();
        Dialog dialog = this.f15648q0;
        if (dialog != null) {
            this.f15649r0 = false;
            dialog.show();
            View decorView = this.f15648q0.getWindow().getDecorView();
            android.view.View.b(decorView, this);
            C0702e1.a(decorView, this);
            d5.m.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.c
    public void d1() {
        super.d1();
        Dialog dialog = this.f15648q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void e2() {
        g2(false, false, false);
    }

    @Override // androidx.fragment.app.c
    public void f1(Bundle bundle) {
        Bundle bundle2;
        super.f1(bundle);
        if (this.f15648q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f15648q0.onRestoreInstanceState(bundle2);
    }

    public void f2() {
        g2(true, false, false);
    }

    public final void g2(boolean z10, boolean z11, boolean z12) {
        if (this.f15650s0) {
            return;
        }
        this.f15650s0 = true;
        this.f15651t0 = false;
        Dialog dialog = this.f15648q0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f15648q0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f15637f0.getLooper()) {
                    onDismiss(this.f15648q0);
                } else {
                    this.f15637f0.post(this.f15638g0);
                }
            }
        }
        this.f15649r0 = true;
        if (this.f15645n0 >= 0) {
            if (z12) {
                L().e1(this.f15645n0, 1);
            } else {
                L().b1(this.f15645n0, 1, z10);
            }
            this.f15645n0 = -1;
            return;
        }
        androidx.fragment.app.h r8 = L().r();
        r8.s(true);
        r8.m(this);
        if (z12) {
            r8.i();
        } else if (z10) {
            r8.h();
        } else {
            r8.g();
        }
    }

    public Dialog h2() {
        return this.f15648q0;
    }

    public boolean i2() {
        return this.f15644m0;
    }

    public int j2() {
        return this.f15642k0;
    }

    @Override // androidx.fragment.app.c
    @NonNull
    public r k() {
        return new e(super.k());
    }

    @NonNull
    public Dialog k2(Bundle bundle) {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new e.w(I1(), j2());
    }

    public View l2(int i10) {
        Dialog dialog = this.f15648q0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.c
    public void m1(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.m1(layoutInflater, viewGroup, bundle);
        if (this.K != null || this.f15648q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f15648q0.onRestoreInstanceState(bundle2);
    }

    public boolean m2() {
        return this.f15652u0;
    }

    public final void n2(Bundle bundle) {
        if (this.f15644m0 && !this.f15652u0) {
            try {
                this.f15646o0 = true;
                Dialog k22 = k2(bundle);
                this.f15648q0 = k22;
                if (this.f15644m0) {
                    s2(k22, this.f15641j0);
                    Context w5 = w();
                    if (w5 instanceof Activity) {
                        this.f15648q0.setOwnerActivity((Activity) w5);
                    }
                    this.f15648q0.setCancelable(this.f15643l0);
                    this.f15648q0.setOnCancelListener(this.f15639h0);
                    this.f15648q0.setOnDismissListener(this.f15640i0);
                    this.f15652u0 = true;
                } else {
                    this.f15648q0 = null;
                }
                this.f15646o0 = false;
            } catch (Throwable th2) {
                this.f15646o0 = false;
                throw th2;
            }
        }
    }

    @NonNull
    public final Dialog o2() {
        Dialog h22 = h2();
        if (h22 != null) {
            return h22;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }

    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (this.f15649r0) {
            return;
        }
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        g2(true, true, false);
    }

    public void p2(boolean z10) {
        this.f15643l0 = z10;
        Dialog dialog = this.f15648q0;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void q2(boolean z10) {
        this.f15644m0 = z10;
    }

    public void r2(int i10, int i11) {
        if (FragmentManager.N0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i10 + ", " + i11);
        }
        this.f15641j0 = i10;
        if (i10 == 2 || i10 == 3) {
            this.f15642k0 = R.style.Theme.Panel;
        }
        if (i11 != 0) {
            this.f15642k0 = i11;
        }
    }

    public void s2(@NonNull Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void t2(@NonNull FragmentManager fragmentManager, String str) {
        this.f15650s0 = false;
        this.f15651t0 = true;
        androidx.fragment.app.h r8 = fragmentManager.r();
        r8.s(true);
        r8.d(this, str);
        r8.g();
    }

    @Override // androidx.fragment.app.c
    @Deprecated
    public void z0(Bundle bundle) {
        super.z0(bundle);
    }
}
