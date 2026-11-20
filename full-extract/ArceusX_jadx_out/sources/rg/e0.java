package rg;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.greenrobot.eventbus.ThreadMode;
import ug.c0;

/* loaded from: classes2.dex */
public class e0 extends com.roblox.client.c {
    @Override // com.roblox.client.c
    public c0.b I3() {
        return c0.b.f32714g;
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(n0.f30423r, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(m0.E);
        frameLayout.addView(super.J0(layoutInflater, frameLayout, bundle));
        return viewGroup2;
    }

    @Override // com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
        ev.c.d().n(this);
        Dialog h22 = h2();
        if (h22 != null) {
            Window window = h22.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void d1() {
        ev.c.d().p(this);
        super.d1();
    }

    @ev.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(oh.f fVar) {
        if (i2()) {
            h2().dismiss();
        }
    }

    @ev.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(oh.g gVar) {
        if (i2()) {
            h2().dismiss();
        }
    }
}
