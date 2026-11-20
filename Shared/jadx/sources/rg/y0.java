package rg;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ug.c0;

/* loaded from: classes2.dex */
public class y0 extends com.roblox.client.c {

    /* renamed from: g1, reason: collision with root package name */
    public View f30615g1;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e4.q p8 = y0.this.p();
            if (p8 != null) {
                p8.l1().a1();
            }
        }
    }

    @Override // e4.k, androidx.fragment.app.c
    public void C0(Context context) {
        super.C0(context);
        ek.q.b("RobloxModalWebFragment", "onAttach.");
    }

    @Override // com.roblox.client.c
    public void D3(boolean z10) {
        super.D3(z10);
        View view = this.f30615g1;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
    }

    @Override // com.roblox.client.c
    public void H3(ll.a aVar) {
        super.H3(aVar);
        ek.q.b("RobloxModalWebFragment", "updateWebView.");
    }

    @Override // com.roblox.client.c
    public c0.b I3() {
        return c0.b.f32716i;
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View J0 = super.J0(layoutInflater, viewGroup, bundle);
        ek.q.b("RobloxModalWebFragment", "onCreate.");
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.enableTransitionType(3);
        this.f30615g1 = J0;
        ((LinearLayout) J0).setLayoutTransition(layoutTransition);
        LinearLayout linearLayout = (LinearLayout) J0.findViewById(m0.f30396v0);
        linearLayout.setVisibility(0);
        linearLayout.findViewById(m0.f30394u0).setOnClickListener(new a());
        float f10 = S().getDisplayMetrics().widthPixels;
        float f11 = S().getDisplayMetrics().heightPixels;
        ek.q.b("RobloxModalWebFragment", "widthInPixels: " + f10 + ". heightInPixels: " + f11 + ".");
        int P1 = rh.h.a().P1() + linearLayout.getHeight();
        int E2 = rh.h.a().E2();
        int applyDimension = (int) TypedValue.applyDimension(1, (float) P1, S().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, (float) E2, S().getDisplayMetrics());
        ek.q.b("RobloxModalWebFragment", "minWidthInDip: " + applyDimension2 + ". minHeightInDip: " + applyDimension + ".");
        Point J3 = J3(f10, f11, applyDimension2, applyDimension, E2, P1);
        if (J3 != null) {
            ek.q.b("RobloxModalWebFragment", "width: " + J3.x + ". height: " + J3.y + ".");
            J0.setLayoutParams(new FrameLayout.LayoutParams(J3.x, J3.y, 17));
        }
        D3(this.X0);
        return J0;
    }

    public final Point J3(float f10, float f11, int i10, int i11, int i12, int i13) {
        if (f10 < i12 || f11 < i13) {
            return null;
        }
        int i14 = (int) (0.9f * f10);
        if (i14 > i12) {
            i12 = i14;
        }
        int i15 = (int) (0.8f * f11);
        if (i15 > i13) {
            i13 = i15;
        }
        if (i11 > f11) {
            i11 = i13;
        }
        if (i10 > f10) {
            i10 = i12;
        }
        return new Point(i10, i11);
    }

    @Override // e4.k, androidx.fragment.app.c
    public void N0() {
        super.N0();
        ek.q.b("RobloxModalWebFragment", "onDetach.");
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public void V0() {
        super.V0();
        ek.q.b("RobloxModalWebFragment", "onPause.");
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public void a1() {
        super.a1();
        ek.q.b("RobloxModalWebFragment", "onResume.");
    }

    @Override // com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void z0(Bundle bundle) {
        super.z0(bundle);
        ek.q.b("RobloxModalWebFragment", "onActivityCreated.");
    }
}
