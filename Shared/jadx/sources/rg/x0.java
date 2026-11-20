package rg;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a;
import bk.e;

/* loaded from: classes2.dex */
public class x0 extends e4.k implements e.b {
    public bk.e F0;

    /* renamed from: v0, reason: collision with root package name */
    public final String f30605v0 = "dialogHeight";

    /* renamed from: w0, reason: collision with root package name */
    public final String f30606w0 = "dialogWidth";

    /* renamed from: x0, reason: collision with root package name */
    public final String f30607x0 = "dialogGravity";

    /* renamed from: y0, reason: collision with root package name */
    public final String f30608y0 = "dialogOffsetY";

    /* renamed from: z0, reason: collision with root package name */
    public final String f30609z0 = "dialogOffsetX";
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public int E0 = 0;
    public ki.c G0 = w2();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30610a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f30610a = iArr;
            try {
                iArr[ml.a.f24590c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30610a[ml.a.f24592e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30610a[ml.a.f24591d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        Bundle t8 = t();
        if (t8 != null) {
            this.A0 = t8.getInt("dialogHeight", 0);
            this.B0 = t8.getInt("dialogWidth", 0);
            this.C0 = t8.getInt("dialogGravity", 0);
            this.D0 = t8.getInt("dialogOffsetY", 0);
            this.E0 = t8.getInt("dialogOffsetX", 0);
        }
    }

    public void T(int i10) {
        e4.q p8 = p();
        if (p8 instanceof com.roblox.client.b) {
            ((com.roblox.client.b) p8).T(i10);
        }
    }

    public void V(String str) {
        e4.q p8 = p();
        if (p8 instanceof com.roblox.client.b) {
            ((com.roblox.client.b) p8).V(str);
        }
    }

    public void a0(ml.a aVar) {
        ek.q.b("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + aVar);
        if (this.G0 != null) {
            int i10 = a.f30610a[aVar.ordinal()];
            this.G0.l(i10 != 1 ? i10 != 2 ? S().getColor(j0.f30309g) : S().getColor(j0.f30304a) : S().getColor(j0.f30315m));
        }
    }

    @Override // e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
    }

    @Override // e4.k, androidx.fragment.app.c
    public void d1() {
        super.d1();
    }

    @Override // androidx.fragment.app.c
    public void e1(@NonNull View view, Bundle bundle) {
        super.e1(view, bundle);
        bk.e eVar = new bk.e(this);
        this.F0 = eVar;
        eVar.b(k0());
    }

    public boolean u2() {
        e4.q p8 = p();
        if (p8 instanceof com.roblox.client.a) {
            return ((com.roblox.client.a) p8).N1();
        }
        ek.q.k("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
        return false;
    }

    public synchronized void v2(CharSequence charSequence) {
        e4.q p8 = p();
        if (p8 == null) {
            return;
        }
        androidx.appcompat.app.a a10 = new a.C0009a(p8).a();
        TextView textView = new TextView(p8);
        String string = p8.getString(q0.W);
        int indexOf = charSequence.toString().indexOf(string);
        fk.b.b(textView, charSequence.toString(), new fk.c(p8, null, string, indexOf, indexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        a10.x(textView, 150, 100, 150, 100);
        a10.setCanceledOnTouchOutside(true);
        try {
            a10.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public ki.c w2() {
        return null;
    }

    public View x2(LayoutInflater layoutInflater, View view) {
        ki.c cVar = this.G0;
        if (cVar == null) {
            return view;
        }
        View i10 = cVar.i(layoutInflater, this);
        this.G0.g().addView(view);
        return i10;
    }

    public void y2(int i10, int i11) {
        e4.q p8 = p();
        if (p8 instanceof com.roblox.client.b) {
            ((com.roblox.client.b) p8).K1(i10, i11);
        }
    }

    @Override // e4.k, androidx.fragment.app.c
    public void z0(Bundle bundle) {
        super.z0(bundle);
        Dialog h22 = h2();
        if (h22 != null) {
            Window window = h22.getWindow();
            if (window != null) {
                int i10 = this.A0;
                if (i10 != 0) {
                    int i11 = this.B0;
                    if (i11 == 0) {
                        i11 = -2;
                    }
                    window.setLayout(i11, i10);
                }
                window.setGravity(this.C0);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.y = this.D0;
                attributes.x = this.E0;
                window.setAttributes(attributes);
            }
            h22.setCanceledOnTouchOutside(true);
        }
    }

    public void z2(String str, int i10) {
        e4.q p8 = p();
        if (p8 instanceof com.roblox.client.b) {
            ((com.roblox.client.b) p8).L1(str, i10);
        }
    }
}
