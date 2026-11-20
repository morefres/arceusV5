package com.roblox.client.game;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.d1;
import androidx.core.view.o0;
import backtraceio.library.breadcrumbs.BacktraceBreadcrumbs;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.game.ExperienceSession;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import ek.q;
import java.util.Iterator;
import java.util.List;
import rg.e2;
import rh.h;
import uh.j0;

/* loaded from: classes2.dex */
public class b extends vh.a implements ViewTreeObserver.OnGlobalLayoutListener, ComponentCallbacks {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9131c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9132d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9133e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9134f;

    /* renamed from: g, reason: collision with root package name */
    public lk.b f9135g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f9136h;

    /* renamed from: i, reason: collision with root package name */
    public ExperienceSession.f f9137i;

    /* renamed from: j, reason: collision with root package name */
    public NativeTextBoxInfo f9138j;

    /* renamed from: k, reason: collision with root package name */
    public d f9139k;

    /* renamed from: l, reason: collision with root package name */
    public Handler f9140l;

    /* renamed from: m, reason: collision with root package name */
    public long f9141m;

    /* renamed from: n, reason: collision with root package name */
    public int f9142n;

    /* renamed from: o, reason: collision with root package name */
    public int f9143o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9144p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9145q;

    /* renamed from: r, reason: collision with root package name */
    public int f9146r;

    /* renamed from: s, reason: collision with root package name */
    public int f9147s;

    /* renamed from: t, reason: collision with root package name */
    public C0145b f9148t;

    public class a extends d1.b {

        /* renamed from: c, reason: collision with root package name */
        public int f9149c;

        public a(int i10) {
            super(i10);
            this.f9149c = 0;
        }

        @Override // androidx.core.view.d1.b
        public void b(@NonNull d1 d1Var) {
            super.b(d1Var);
            if (!h.a().V4() || (d1Var.d() & WindowInsetsCompat.Type.ime()) == 0) {
                return;
            }
            b.this.f9144p = false;
            if (b.this.f9135g != null) {
                b bVar = b.this;
                bVar.D(bVar.f9135g, b.this.g());
            }
        }

        @Override // androidx.core.view.d1.b
        @NonNull
        public WindowInsetsCompat d(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<d1> list) {
            d1 d1Var;
            Iterator<d1> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    d1Var = null;
                    break;
                }
                d1Var = it.next();
                if ((d1Var.d() & WindowInsetsCompat.Type.ime()) != 0) {
                    break;
                }
            }
            if (d1Var != null) {
                b.this.f9146r = this.f9149c + ((int) ((r6.f9147s - this.f9149c) * d1Var.c()));
                b bVar = b.this;
                bVar.x(bVar.f9146r);
            }
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.d1.b
        @NonNull
        public d1.a e(@NonNull d1 d1Var, @NonNull d1.a aVar) {
            if (h.a().V4() && (d1Var.d() & WindowInsetsCompat.Type.ime()) != 0) {
                b.this.f9144p = true;
            }
            this.f9149c = b.this.f9146r;
            return aVar;
        }
    }

    /* renamed from: com.roblox.client.game.b$b, reason: collision with other inner class name */
    public class C0145b extends dh.b<c> {

        /* renamed from: com.roblox.client.game.b$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f9147s == b.this.f9146r) {
                    q.b("rbx.glview.text", "Y Shift animated successfully!");
                    return;
                }
                q.b("rbx.glview.text", "The Y shift wasn't animated in time, force set!");
                b bVar = b.this;
                bVar.f9146r = bVar.f9147s;
                b bVar2 = b.this;
                bVar2.x(bVar2.f9147s);
            }
        }

        public C0145b(String str) {
            super(str);
        }

        @Override // dh.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(c cVar) {
            b.this.f9140l.post(new a());
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f9153a;

        public c(int i10) {
            this.f9153a = i10;
        }
    }

    public class d extends dh.b<NativeTextBoxInfo> {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NativeTextBoxInfo f9155a;

            public a(NativeTextBoxInfo nativeTextBoxInfo) {
                this.f9155a = nativeTextBoxInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.z("positioning native textbox: (" + this.f9155a.f9709x + ", " + this.f9155a.f9710y + ") align: (" + this.f9155a.xAlignment + ", " + this.f9155a.yAlignment + ")");
                b bVar = b.this;
                bVar.D(bVar.f9135g, b.this.g());
                b.this.N(this.f9155a);
                b.this.M(this.f9155a);
                b.this.b.requestFocus();
            }
        }

        public d(String str) {
            super(str);
        }

        @Override // dh.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(NativeTextBoxInfo nativeTextBoxInfo) {
            b.this.f9140l.post(new a(nativeTextBoxInfo));
        }
    }

    public b(RbxKeyboard rbxKeyboard, j0 j0Var, ExperienceSession.f fVar) {
        super(rbxKeyboard);
        this.f9131c = false;
        this.f9132d = 12;
        this.f9133e = 10;
        this.f9134f = BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES;
        this.f9139k = new d("rbx.glview.text");
        this.f9142n = 0;
        this.f9143o = 0;
        this.f9144p = false;
        this.f9145q = false;
        this.f9146r = 0;
        this.f9147s = 0;
        this.f9148t = new C0145b("rbx.glview.text");
        this.f9136h = j0Var;
        this.f9137i = fVar;
        this.f9140l = new Handler(Looper.getMainLooper());
    }

    public final float A(float f10, float f11) {
        return f10 * f11;
    }

    public void B() {
        FrameLayout k10 = this.f9136h.k();
        int width = k10.getWidth();
        int height = k10.getHeight();
        z("Lock screen: (" + width + ", " + height + ")");
        C(k10, width, height);
    }

    public final void C(View view, int i10, int i11) {
        boolean z10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean z11 = true;
        if (layoutParams.width != i10) {
            layoutParams.width = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (layoutParams.height != i11) {
            layoutParams.height = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            view.setLayoutParams(layoutParams);
        }
    }

    public final void D(lk.b bVar, float f10) {
        if (bVar.f23482e > 10) {
            NativeTextBoxInfo nativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
            float f11 = nativeGetTextBoxInfo != null ? nativeGetTextBoxInfo.f9709x : 0.0f;
            float f12 = nativeGetTextBoxInfo != null ? nativeGetTextBoxInfo.f9710y : 0.0f;
            float f13 = nativeGetTextBoxInfo != null ? nativeGetTextBoxInfo.width : 0.0f;
            float f14 = nativeGetTextBoxInfo != null ? nativeGetTextBoxInfo.height : 0.0f;
            float f15 = nativeGetTextBoxInfo != null ? nativeGetTextBoxInfo.fontSize : 0.0f;
            z("textbox pos/size/fontSize: (" + f11 + ", " + f12 + ", " + f13 + ", " + f14 + ", " + f15 + ")");
            float A = A(f14 + f12, f10);
            float A2 = A >= ((float) bVar.b) ? bVar.f23483f - A(f12 + f15, f10) : bVar.f23483f - A;
            float A3 = A(12.0f, f10);
            int i10 = (int) (A2 - A3);
            z("margin:" + A3 + " delta:" + A2 + " adjustment:" + i10);
            if (h.a().a4()) {
                J(Math.min(0, i10));
            } else if (i10 < 0) {
                J(i10);
            }
        } else if (h.a().p1()) {
            x(0);
        }
        if (h.a().V4()) {
            E(bVar, f10);
        }
    }

    public void E(lk.b bVar, float f10) {
        float F;
        boolean z10 = bVar.f23482e > 10;
        if (h.a().V4()) {
            F = F(bVar.f23483f - (this.f9144p ? 0 : this.f9146r), f10);
        } else {
            F = F(bVar.f23483f, f10);
        }
        int i10 = (int) F;
        int F2 = (int) F(bVar.f23479a.right, f10);
        int F3 = (int) F(bVar.f23482e, f10);
        q.i("rbx.glview.text", "onUpdateKeyboardSize() v:" + z10 + " x:0 y:" + i10 + " w:" + F2 + " h:" + F3);
        if (z10) {
            NativeGLInterface.updateKeyboardSize(true, 0, i10, F2, F3);
        } else {
            NativeGLInterface.updateKeyboardSize(false, 0, i10, F2, 0);
        }
    }

    public final float F(int i10, float f10) {
        return (i10 / f10) + 0.5f;
    }

    public void G() {
        o0.H0(this.f9136h.k(), null);
    }

    public void H() {
        C(this.f9136h.k(), -1, -1);
    }

    public final void I(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.f9139k.e(nativeTextBoxInfo, h.a().C5());
        }
    }

    public final void J(int i10) {
        this.f9148t.e(new c(i10), h.a().q1());
        this.f9147s = i10;
    }

    public void K(long j10) {
        this.f9141m = j10;
    }

    public final void L(float f10, float f11, float f12, float f13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        float g10 = g();
        float A = A(f10, g10);
        float A2 = A(f11, g10);
        float A3 = A(f12, g10);
        float A4 = A(f13, g10);
        layoutParams.topMargin = (int) A2;
        layoutParams.width = (int) A3;
        layoutParams.height = (int) A4;
        layoutParams.leftMargin = (int) A;
        this.b.setLayoutParams(layoutParams);
    }

    public final void M(NativeTextBoxInfo nativeTextBoxInfo) {
        L(nativeTextBoxInfo.f9709x, nativeTextBoxInfo.f9710y, nativeTextBoxInfo.width, nativeTextBoxInfo.height);
        float g10 = g();
        this.b.setPadding((int) A(nativeTextBoxInfo.paddingLeft, g10), (int) A(nativeTextBoxInfo.paddingTop, g10), (int) A(nativeTextBoxInfo.paddingRight, g10), (int) A(nativeTextBoxInfo.paddingBottom, g10));
    }

    public final void N(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.b.l(nativeTextBoxInfo);
            this.b.m(nativeTextBoxInfo.font, nativeTextBoxInfo.fontSize, g());
        }
    }

    @Override // uh.x0
    public void a() {
        if (h.a().p1()) {
            q.b("rbx.glview.text", "hideKeyboard()");
        }
        J(0);
        this.b.e();
        this.f9138j = null;
    }

    @Override // uh.x0
    public void b(long j10, boolean z10, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        this.f9138j = nativeTextBoxInfo;
        B();
        q.b("rbx.glview.text", "showKeyboard() " + str);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES)});
        this.b.setCurrentTextBox(j10);
        if (h.a().F2()) {
            this.b.i(nativeTextBoxInfo, str);
        }
        this.b.setText(str);
        if (z10) {
            NativeTextBoxInfo nativeTextBoxInfo2 = this.f9138j;
            if (nativeTextBoxInfo2 != null) {
                L(0.0f, -150.0f, nativeTextBoxInfo2.width, nativeTextBoxInfo2.height);
            } else {
                L(0.0f, -150.0f, -1.0f, 10.0f);
            }
            I(this.f9138j);
        }
        this.b.setVisibility(0);
        this.b.requestFocus();
        if (!h.a().h0()) {
            e2.k(this.b, 2);
        } else if (nativeTextBoxInfo == null || nativeTextBoxInfo.editable) {
            e2.k(this.b, 2);
        }
        RbxKeyboard rbxKeyboard = this.b;
        rbxKeyboard.setSelection(rbxKeyboard.getText().length());
        j();
    }

    @Override // uh.x0
    public void c() {
        NativeTextBoxInfo nativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeGetTextBoxInfo != null) {
            q.b("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeGetTextBoxInfo.f9709x + " y:" + nativeGetTextBoxInfo.f9710y + " width:" + nativeGetTextBoxInfo.width + " height:" + nativeGetTextBoxInfo.height + " fontSize:" + nativeGetTextBoxInfo.fontSize);
            I(nativeGetTextBoxInfo);
        }
        this.f9138j = nativeGetTextBoxInfo;
    }

    @Override // uh.x0
    public void d(String str) {
        i(str);
    }

    @Override // uh.x0
    public void e() {
        RbxKeyboard rbxKeyboard = this.b;
        if (rbxKeyboard != null) {
            rbxKeyboard.h();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        q.h("rbx.glview.text", "Configuration change detected");
        H();
        if (!h.a().p1()) {
            NativeGLInterface.nativeReleaseFocus(h());
            a();
        } else {
            this.f9142n = this.f9136h.r().getWidth();
            this.f9143o = this.f9136h.r().getHeight();
            x(0);
            this.f9146r = 0;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        lk.b a10 = this.f9137i.a();
        if (a10 == null) {
            return;
        }
        lk.b bVar = this.f9135g;
        if (bVar == null || !bVar.equals(a10)) {
            this.f9135g = a10;
            if (h.a().p1()) {
                q.b("rbx.glview.text", "onGlobalLayout()");
                InputMethodManager inputMethodManager = (InputMethodManager) f().getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
                    FrameLayout k10 = this.f9136h.k();
                    int width = k10.getWidth();
                    int height = k10.getHeight();
                    if (width != this.f9142n || height != this.f9143o) {
                        this.f9142n = width;
                        this.f9143o = height;
                        B();
                    }
                }
            }
            q.b("rbx.glview.text", String.format("Keyboard height: %d", Integer.valueOf(a10.f23482e)));
            boolean z10 = this.f9145q;
            boolean z11 = a10.f23482e > 10;
            this.f9145q = z11;
            if (z10 && !z11) {
                q.b("rbx.glview.text", "Remove view shift on keyboard close");
                J(0);
            }
            float g10 = g();
            D(a10, g10);
            if (h.a().V4()) {
                return;
            }
            E(a10, g10);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public void x(int i10) {
        FrameLayout k10 = this.f9136h.k();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k10.getLayoutParams();
        if (layoutParams.topMargin != i10) {
            layoutParams.topMargin = i10;
            k10.setLayoutParams(layoutParams);
        }
    }

    public void y() {
        o0.H0(this.f9136h.k(), new a(1));
    }

    public final void z(String str) {
    }
}
