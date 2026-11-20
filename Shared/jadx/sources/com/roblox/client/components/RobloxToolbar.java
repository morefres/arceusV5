package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import bk.e;
import com.roblox.client.components.RobloxToolbar;
import dh.i;
import ek.q;
import gl.AndroidColorToken;
import rg.h0;
import rg.j0;
import rg.l0;
import rg.m0;

/* loaded from: classes2.dex */
public class RobloxToolbar extends Toolbar implements e.b {
    public TextView T;
    public TextView U;
    public ImageButton V;
    public ImageButton W;

    /* renamed from: a0, reason: collision with root package name */
    public Integer f9043a0;

    /* renamed from: b0, reason: collision with root package name */
    public Integer f9044b0;

    /* renamed from: c0, reason: collision with root package name */
    public d f9045c0;

    /* renamed from: d0, reason: collision with root package name */
    public f f9046d0;

    /* renamed from: e0, reason: collision with root package name */
    public g f9047e0;

    /* renamed from: f0, reason: collision with root package name */
    public e f9048f0;

    /* renamed from: g0, reason: collision with root package name */
    public d f9049g0;

    /* renamed from: h0, reason: collision with root package name */
    public ml.a f9050h0;

    /* renamed from: i0, reason: collision with root package name */
    public bk.c f9051i0;

    /* renamed from: j0, reason: collision with root package name */
    public gl.c f9052j0;

    /* renamed from: k0, reason: collision with root package name */
    public i f9053k0;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9054a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f9054a = iArr;
            try {
                iArr[ml.a.f24591d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9054a[ml.a.f24590c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements d {
        @Override // com.roblox.client.components.RobloxToolbar.d
        public int a(ml.a aVar) {
            int i10 = a.f9054a[aVar.ordinal()];
            return i10 != 1 ? i10 != 2 ? l0.f30339n : l0.f30341p : l0.f30340o;
        }
    }

    public static class c implements d {
        @Override // com.roblox.client.components.RobloxToolbar.d
        public int a(ml.a aVar) {
            int i10 = a.f9054a[aVar.ordinal()];
            return i10 != 1 ? i10 != 2 ? l0.f30342q : l0.f30344s : l0.f30343r;
        }
    }

    public interface d {
        int a(ml.a aVar);
    }

    public static class e {
        public String a(ml.a aVar) {
            int i10 = a.f9054a[aVar.ordinal()];
            return (i10 == 1 || i10 == 2) ? "BuilderSans-Medium.otf" : "SourceSansPro-Regular.ttf";
        }
    }

    public interface f {
        int a(ml.a aVar);

        int b(ml.a aVar);
    }

    public static class g {
        public String a(ml.a aVar) {
            int i10 = a.f9054a[aVar.ordinal()];
            return (i10 == 1 || i10 == 2) ? "BuilderSans-Bold.otf" : "SourceSansPro-Semibold.ttf";
        }
    }

    public static class h implements f {
        @Override // com.roblox.client.components.RobloxToolbar.f
        public int a(ml.a aVar) {
            int i10 = a.f9054a[aVar.ordinal()];
            return i10 != 1 ? i10 != 2 ? j0.f30304a : j0.f30315m : j0.f30309g;
        }

        @Override // com.roblox.client.components.RobloxToolbar.f
        public int b(ml.a aVar) {
            return a.f9054a[aVar.ordinal()] != 2 ? j0.f30317o : j0.f30309g;
        }
    }

    public RobloxToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9043a0 = null;
        this.f9044b0 = null;
        this.f9052j0 = gl.b.tokens;
        X();
    }

    private void X() {
        this.f9051i0 = new bk.f();
        this.f9045c0 = new b();
        this.f9046d0 = new h();
        this.f9047e0 = new g();
        this.f9048f0 = new e();
        this.f9049g0 = new c();
    }

    private String getSubTitleFont() {
        return this.f9048f0.a(this.f9051i0.getTheme());
    }

    private String getTitleFont() {
        return this.f9047e0.a(this.f9051i0.getTheme());
    }

    public final void U() {
        ImageButton imageButton = new ImageButton(getContext(), null, h0.f30299a);
        this.V = imageButton;
        imageButton.setVisibility(8);
        Toolbar.g gVar = new Toolbar.g(-2, -2);
        gVar.f21294a = GravityCompat.END;
        addView(this.V, gVar);
    }

    public final int V(ml.a aVar) {
        if (aVar == null) {
            aVar = this.f9051i0.getTheme();
        }
        return this.f9049g0.a(aVar);
    }

    public final int W(ml.a aVar) {
        if (aVar == null) {
            aVar = this.f9051i0.getTheme();
        }
        return this.f9045c0.a(aVar);
    }

    public final void Y() {
        if (this.W == null) {
            this.W = (ImageButton) findViewById(m0.f30382o0);
        }
    }

    public final void Z() {
        if (this.V == null) {
            ImageButton imageButton = (ImageButton) findViewById(m0.f30384p0);
            this.V = imageButton;
            if (imageButton == null) {
                U();
            }
        }
    }

    @Override // bk.e.b
    public void a0(ml.a aVar) {
        if (aVar == this.f9050h0) {
            return;
        }
        this.f9050h0 = aVar;
        int backgroundColor = getBackgroundColor();
        int foregroundColor = getForegroundColor();
        setBackgroundColor(backgroundColor);
        setTitleTextColor(foregroundColor);
        setSubtitleTextColor(foregroundColor);
        e0(this.T, getTitleFont());
        e0(this.U, getSubTitleFont());
        ImageButton imageButton = this.W;
        g0(imageButton != null && imageButton.getVisibility() == 0);
        ImageButton imageButton2 = this.V;
        if (imageButton2 == null || imageButton2.getVisibility() != 0) {
            return;
        }
        f0(true);
    }

    public final void b0() {
        if (this.U == null) {
            TextView textView = (TextView) findViewById(m0.f30386q0);
            this.U = textView;
            textView.setVisibility(0);
            Integer num = this.f9044b0;
            if (num != null) {
                this.U.setTextColor(num.intValue());
            }
            e0(this.U, getSubTitleFont());
        }
    }

    public final void c0() {
        if (this.T == null) {
            TextView textView = (TextView) findViewById(m0.f30388r0);
            this.T = textView;
            textView.setVisibility(0);
            Integer num = this.f9043a0;
            if (num != null) {
                this.T.setTextColor(num.intValue());
            }
            e0(this.T, getTitleFont());
        }
    }

    public final /* synthetic */ void d0() {
        setBackgroundColor(getBackgroundColor());
    }

    public final void e0(TextView textView, String str) {
        if (textView == null || dh.e.f(textView, str, getContext())) {
            return;
        }
        dh.e.d(textView, getContext(), str);
    }

    public final void f0(boolean z10) {
        this.V.setImageResource(V(this.f9050h0));
        this.V.setVisibility(z10 ? 0 : 8);
    }

    public final void g0(boolean z10) {
        ImageButton imageButton = this.W;
        if (imageButton != null) {
            if (!z10) {
                imageButton.setVisibility(8);
            } else {
                imageButton.setImageResource(W(this.f9050h0));
                this.W.setVisibility(0);
            }
        }
    }

    public int getBackgroundColor() {
        if (this.f9052j0.c()) {
            ml.a theme = this.f9051i0.getTheme();
            AndroidColorToken b10 = this.f9052j0.b("Common.NavigationBar");
            if (b10 != null) {
                int c10 = b10.c(theme);
                q.h("rbx.theme", "RobloxToolbar: using token color for Common.NavigationBar theme=" + theme + " argb=" + Integer.toHexString(c10));
                return c10;
            }
            q.k("rbx.theme", "RobloxToolbar: token key not found: Common.NavigationBar, falling back to resource color");
        }
        return getResources().getColor(this.f9046d0.a(this.f9051i0.getTheme()));
    }

    public int getForegroundColor() {
        return getResources().getColor(this.f9046d0.b(this.f9051i0.getTheme()));
    }

    public void h0(View.OnClickListener onClickListener) {
        Z();
        if (this.V != null) {
            K(0, getContentInsetEnd());
            J(0, getContentInsetRight());
            setContentInsetStartWithNavigation(0);
        }
        f0(onClickListener != null);
        this.V.setOnClickListener(onClickListener);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i iVar = new i(this.f9052j0, new Runnable() { // from class: dh.g
            @Override // java.lang.Runnable
            public final void run() {
                RobloxToolbar.this.d0();
            }
        });
        this.f9053k0 = iVar;
        iVar.b();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f9053k0;
        if (iVar != null) {
            iVar.c();
            this.f9053k0 = null;
        }
    }

    public void setCloseButtonGravity(int i10) {
        Z();
        ImageButton imageButton = this.V;
        if (imageButton != null) {
            Toolbar.g gVar = (Toolbar.g) imageButton.getLayoutParams();
            if (gVar != null) {
                gVar.f21294a = i10;
                this.V.setLayoutParams(gVar);
            } else {
                Toolbar.g gVar2 = new Toolbar.g(-2, -2);
                gVar2.f21294a = i10;
                this.V.setLayoutParams(gVar2);
            }
        }
    }

    public void setDesignFoundations(gl.c cVar) {
        this.f9052j0 = cVar;
    }

    public void setIconDelegate(d dVar) {
        this.f9045c0 = dVar;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        Y();
        ImageButton imageButton = this.W;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
            g0(onClickListener != null);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        b0();
        this.U.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitleTextColor(int i10) {
        this.f9044b0 = Integer.valueOf(i10);
        TextView textView = this.U;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setThemeChooser(bk.c cVar) {
        this.f9051i0 = cVar;
    }

    public void setThemeColorDelegate(f fVar) {
        this.f9046d0 = fVar;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i10) {
        c0();
        this.T.setText(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(int i10) {
        this.f9043a0 = Integer.valueOf(i10);
        TextView textView = this.T;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        c0();
        this.T.setText(charSequence);
    }
}
