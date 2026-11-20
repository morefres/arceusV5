package th;

import android.content.Context;
import android.content.DialogInterface;
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
import ti.h;
import ug.c0;

/* loaded from: classes2.dex */
public class g extends com.roblox.client.c {

    /* renamed from: g1, reason: collision with root package name */
    public boolean f32210g1 = false;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f32211h1 = false;

    /* renamed from: i1, reason: collision with root package name */
    public TextView f32212i1;

    /* renamed from: j1, reason: collision with root package name */
    public FrameLayout f32213j1;

    /* renamed from: k1, reason: collision with root package name */
    public ImageView f32214k1;

    /* renamed from: l1, reason: collision with root package name */
    public bk.d f32215l1;

    /* renamed from: m1, reason: collision with root package name */
    public bk.d f32216m1;

    /* renamed from: n1, reason: collision with root package name */
    public bk.d f32217n1;

    /* renamed from: o1, reason: collision with root package name */
    public RobloxToolbar.c f32218o1;

    public class a implements h.d {
        public a() {
        }

        @Override // ti.h.d
        public void a(boolean z10, int i10) {
            g.this.P3();
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32220a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f32220a = iArr;
            try {
                iArr[ml.a.f24591d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32220a[ml.a.f24590c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c implements bk.d {

        /* renamed from: a, reason: collision with root package name */
        public final int f32221a;

        public c(Context context) {
            this.f32221a = context.getResources().getColor(j0.f30313k);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            if (b.f32220a[aVar.ordinal()] != 1) {
                return this.f32221a;
            }
            return -1;
        }
    }

    public static class d implements bk.d {

        /* renamed from: a, reason: collision with root package name */
        public final int f32222a;
        public final int b;

        public d(Context context) {
            this.f32222a = context.getResources().getColor(j0.f30312j);
            this.b = context.getResources().getColor(j0.f30310h);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            return b.f32220a[aVar.ordinal()] != 1 ? this.f32222a : this.b;
        }
    }

    public static class e implements bk.d {

        /* renamed from: a, reason: collision with root package name */
        public final int f32223a;
        public final int b;

        public e(Context context) {
            this.f32223a = context.getResources().getColor(j0.f30314l);
            this.b = context.getResources().getColor(j0.f30308f);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            return b.f32220a[aVar.ordinal()] != 1 ? this.f32223a : this.b;
        }
    }

    @Override // com.roblox.client.c
    public c0.b I3() {
        return c0.b.f32717j;
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View J0 = super.J0(layoutInflater, viewGroup, bundle);
        this.f32215l1 = new e(w());
        this.f32216m1 = new d(w());
        this.f32217n1 = new c(w());
        this.f32218o1 = new RobloxToolbar.c();
        O3(layoutInflater);
        Bundle t8 = t();
        if (t8 != null) {
            if (t8.getBoolean("showRobux", false)) {
                this.f32210g1 = true;
                P3();
                N3();
            } else if (t8.getBoolean("showPremium", false)) {
                this.f32211h1 = true;
                this.f32212i1.setText(q0.f30518z);
            }
        }
        Q3(dk.c.c().g());
        return J0;
    }

    public final /* synthetic */ void L3(q qVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        if (this.f32211h1) {
            e2();
        } else {
            N3();
        }
    }

    public final /* synthetic */ void M3(View view) {
        e2();
    }

    public final void N3() {
        ti.h.e().m(new a(), new ci.h());
    }

    public final void O3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(n0.F, this.Q0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(m0.f30373k);
        this.f32214k1 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: th.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.this.M3(view);
            }
        });
        this.f32212i1 = (TextView) frameLayout.findViewById(m0.f30387r);
        this.f32213j1 = (FrameLayout) frameLayout.findViewById(m0.f30389s);
    }

    public void P3() {
        if (this.f32210g1 && p0()) {
            this.f32212i1.setText(g0(q0.f30496r1, cj.q.a(dk.c.c().f())));
        }
    }

    public final void Q3(ml.a aVar) {
        this.f32213j1.setBackgroundColor(this.f32211h1 ? this.f32216m1.a(aVar) : this.f32215l1.a(aVar));
        this.f32212i1.setTextColor(this.f32217n1.a(aVar));
        this.f32214k1.setImageResource(this.f32218o1.a(aVar));
    }

    @Override // com.roblox.client.c
    public void Y2(p pVar) {
        super.Y2(pVar);
        final q p8 = p();
        if (p8 != null) {
            p8.runOnUiThread(new Runnable() { // from class: th.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.L3(p8);
                }
            });
        }
    }

    @Override // com.roblox.client.c, rg.x0, bk.e.b
    public void a0(ml.a aVar) {
        super.a0(aVar);
        Q3(aVar);
    }

    @Override // com.roblox.client.c
    public String c3() {
        return this.f32211h1 ? "buildersClub" : this.f32210g1 ? "robux" : super.c3();
    }

    @Override // e4.k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (ti.h.e().f()) {
            return;
        }
        if (this.f32211h1 || this.f32210g1) {
            t0.d(c3(), "close");
        }
    }
}
