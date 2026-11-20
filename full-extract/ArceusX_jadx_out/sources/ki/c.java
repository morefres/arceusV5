package ki;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.e0;
import android.view.s;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.y;
import com.roblox.client.startup.MainGameActivity;
import ek.q;
import rg.m0;
import rg.n0;
import rh.h;
import uh.u0;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: g, reason: collision with root package name */
    public static final int f22668g = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout();

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup f22669a;
    public View b;

    /* renamed from: c, reason: collision with root package name */
    public View f22670c;

    /* renamed from: d, reason: collision with root package name */
    public View f22671d;

    /* renamed from: e, reason: collision with root package name */
    public u0 f22672e = u0.APP;

    /* renamed from: f, reason: collision with root package name */
    public Rect f22673f;

    public class a implements e0<Rect> {
        public a() {
        }

        @Override // android.view.e0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            if (rect != null) {
                c.this.f22673f = rect;
                c.this.d();
            }
        }
    }

    public final void d() {
        if (this.f22672e == u0.EXPERIENCE) {
            e(0, 0, 0, 0);
            return;
        }
        Rect rect = this.f22673f;
        if (rect != null) {
            e(rect.top, rect.left, rect.right, rect.bottom);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        if (this.f22669a == null) {
            return;
        }
        q.b("AppInsetViewAdapter", "Insets: " + i10 + ", " + i11 + ", " + i12 + ", " + i13 + ", mode: " + this.f22672e);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22669a.getLayoutParams();
        boolean z10 = layoutParams.topMargin != i10;
        boolean z11 = layoutParams.rightMargin != i12;
        boolean z12 = layoutParams.bottomMargin != i13;
        if (z10 || z11 || z12) {
            layoutParams.topMargin = i10;
            layoutParams.rightMargin = i12;
            layoutParams.bottomMargin = i13;
            this.f22669a.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        if (z10) {
            layoutParams2.height = i10;
            this.b.setLayoutParams(layoutParams2);
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f22670c.getLayoutParams();
        if (z11) {
            layoutParams3.width = i12;
            this.f22670c.setLayoutParams(layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f22671d.getLayoutParams();
        if (z12) {
            layoutParams4.height = i13;
            this.f22671d.setLayoutParams(layoutParams4);
        }
    }

    public Insets f(Insets insets) {
        return Insets.NONE;
    }

    public ViewGroup g() {
        return this.f22669a;
    }

    public final View h(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(n0.f30421p, (ViewGroup) null);
        this.f22669a = (ViewGroup) inflate.findViewById(m0.O);
        this.b = inflate.findViewById(m0.Q);
        this.f22670c = inflate.findViewById(m0.P);
        this.f22671d = inflate.findViewById(m0.N);
        return inflate;
    }

    public View i(LayoutInflater layoutInflater, androidx.fragment.app.c cVar) {
        q.b("AppInsetViewAdapter", "inflate: Fragment = " + cVar);
        View h10 = h(layoutInflater);
        if (cVar != null) {
            e4.q p8 = cVar.p();
            if (p8 instanceof com.roblox.client.b) {
                n(cVar, ((com.roblox.client.b) p8).G1());
                return h10;
            }
            if (p8 instanceof MainGameActivity) {
                n(cVar, ((MainGameActivity) p8).getAppInsetManager());
            }
        }
        return h10;
    }

    public View j(LayoutInflater layoutInflater, com.roblox.client.b bVar) {
        q.b("AppInsetViewAdapter", "inflate: Activity = " + bVar);
        View h10 = h(layoutInflater);
        if (bVar != null) {
            n(bVar, bVar.G1());
        }
        return h10;
    }

    public final /* synthetic */ WindowInsetsCompat k(View view, WindowInsetsCompat windowInsetsCompat) {
        int i10 = f22668g;
        Insets insets = windowInsetsCompat.getInsets(i10);
        this.f22673f = new Rect(insets.left, insets.top, insets.right, insets.bottom);
        d();
        if (this.f22672e != u0.EXPERIENCE) {
            insets = f(insets);
        }
        return new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(i10, insets).build();
    }

    public void l(int i10) {
        View view = this.b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public final void m() {
        ViewGroup viewGroup = this.f22669a;
        if (viewGroup == null) {
            return;
        }
        o0.A0(viewGroup, new y() { // from class: ki.b
            @Override // androidx.core.view.y
            public final WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat k10;
                k10 = c.this.k(view, windowInsetsCompat);
                return k10;
            }
        });
        o0.j0(this.f22669a);
    }

    public final void n(s sVar, @NonNull ki.a aVar) {
        if (h.a().p5()) {
            m();
        } else {
            aVar.b().i(sVar, new a());
        }
    }

    public void o(u0 u0Var) {
        ViewGroup viewGroup;
        this.f22672e = u0Var;
        d();
        if (!h.a().p5() || (viewGroup = this.f22669a) == null) {
            return;
        }
        o0.j0(viewGroup);
    }
}
