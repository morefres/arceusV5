package th;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import cj.p;
import com.roblox.client.components.RobloxToolbar;
import e4.q;
import rg.j0;
import rg.m0;
import rg.n0;
import rg.q0;
import rg.t0;
import rg.y1;
import ti.h;
import ug.c0;

/* loaded from: classes2.dex */
public class j extends y1 {
    public boolean C0 = false;
    public boolean D0 = false;
    public boolean E0 = false;
    public TextView F0;
    public FrameLayout G0;
    public ImageView H0;
    public bk.d I0;
    public bk.d J0;
    public bk.d K0;
    public RobloxToolbar.c L0;

    public class a implements h.d {
        public a() {
        }

        @Override // ti.h.d
        public void a(boolean z10, int i10) {
            j.this.o3();
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32227a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f32227a = iArr;
            try {
                iArr[ml.a.f24591d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32227a[ml.a.f24590c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c implements bk.d {

        /* renamed from: a, reason: collision with root package name */
        public final int f32228a;

        public c(Context context) {
            this.f32228a = context.getResources().getColor(j0.f30313k);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            if (b.f32227a[aVar.ordinal()] != 1) {
                return this.f32228a;
            }
            return -1;
        }
    }

    public static class d implements bk.d {

        /* renamed from: a, reason: collision with root package name */
        public final int f32229a;
        public final int b;

        public d(Context context) {
            this.f32229a = context.getResources().getColor(j0.f30312j);
            this.b = context.getResources().getColor(j0.f30310h);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            return b.f32227a[aVar.ordinal()] != 1 ? this.f32229a : this.b;
        }
    }

    public static class e implements bk.d {

        /* renamed from: a, reason: collision with root package name */
        public final int f32230a;
        public final int b;

        public e(Context context) {
            this.f32230a = context.getResources().getColor(j0.f30314l);
            this.b = context.getResources().getColor(j0.f30308f);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            return b.f32227a[aVar.ordinal()] != 1 ? this.f32230a : this.b;
        }
    }

    private void j3() {
        p().l1().a1();
    }

    private void m3() {
        ti.h.e().m(new a(), new ci.h());
    }

    private void n3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(n0.F, this.f30626o0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(m0.f30373k);
        this.H0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: th.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.this.l3(view);
            }
        });
        this.F0 = (TextView) frameLayout.findViewById(m0.f30387r);
        this.G0 = (FrameLayout) frameLayout.findViewById(m0.f30389s);
    }

    private void p3(ml.a aVar) {
        if (!rh.h.a().F0()) {
            this.G0.setBackgroundColor(this.D0 ? this.J0.a(aVar) : this.I0.a(aVar));
            this.F0.setTextColor(this.K0.a(aVar));
            this.H0.setImageResource(this.L0.a(aVar));
            return;
        }
        FrameLayout frameLayout = this.G0;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(this.D0 ? this.J0.a(aVar) : this.I0.a(aVar));
        }
        TextView textView = this.F0;
        if (textView != null) {
            textView.setTextColor(this.K0.a(aVar));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            imageView.setImageResource(this.L0.a(aVar));
        }
    }

    @Override // rg.y1
    public String F2() {
        return this.D0 ? "buildersClub" : this.C0 ? "robux" : super.F2();
    }

    @Override // rg.y1, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        View J0 = super.J0(layoutInflater, viewGroup, bundle);
        this.I0 = new e(w());
        this.J0 = new d(w());
        this.K0 = new c(w());
        this.L0 = new RobloxToolbar.c();
        if (rh.h.a().F0()) {
            Bundle t8 = t();
            if (t8 != null) {
                this.C0 = t8.getBoolean("showRobux", false);
                this.D0 = t8.getBoolean("showPremium", false);
                this.E0 = t8.getBoolean("hideNativeHeader", false);
            }
            if (!this.E0) {
                n3(layoutInflater);
            }
            if (this.C0) {
                o3();
                m3();
            } else if (this.D0 && (textView = this.F0) != null) {
                textView.setText(q0.f30518z);
            }
        } else {
            n3(layoutInflater);
            Bundle t10 = t();
            if (t10 != null) {
                if (t10.getBoolean("showRobux", false)) {
                    this.C0 = true;
                    o3();
                    m3();
                } else if (t10.getBoolean("showPremium", false)) {
                    this.D0 = true;
                    this.F0.setText(q0.f30518z);
                }
            }
        }
        p3(dk.c.c().g());
        return J0;
    }

    @Override // rg.y1, androidx.fragment.app.c
    public void M0() {
        if (!ti.h.e().f() && (this.D0 || this.C0)) {
            t0.d(F2(), "close");
        }
        super.M0();
    }

    @Override // rg.y1
    public c0.b g3() {
        return c0.b.f32718k;
    }

    public final /* synthetic */ void k3(q qVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        if (this.D0) {
            j3();
        } else {
            m3();
        }
    }

    public final /* synthetic */ void l3(View view) {
        j3();
    }

    public void o3() {
        if (!rh.h.a().F0()) {
            if (this.C0 && p0()) {
                this.F0.setText(g0(q0.f30496r1, cj.q.a(dk.c.c().f())));
                return;
            }
            return;
        }
        if (this.C0 && p0() && this.F0 != null) {
            this.F0.setText(g0(q0.f30496r1, cj.q.a(dk.c.c().f())));
        }
    }

    @Override // rg.y1
    public void x2(p pVar) {
        super.x2(pVar);
        final q p8 = p();
        if (p8 != null) {
            p8.runOnUiThread(new Runnable() { // from class: th.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.k3(p8);
                }
            });
        }
    }
}
