package uh;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32975a;
    public Rect b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f32976c;

    public class a implements android.view.e0<Rect> {
        public a() {
        }

        @Override // android.view.e0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            ek.q.b("SafeAreaInsetsObserver", String.format("New cutout insets: %s", String.valueOf(rect)));
            y0.this.b = rect;
            y0.this.h();
        }
    }

    public class b implements android.view.e0<Rect> {
        public b() {
        }

        @Override // android.view.e0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            y0.this.f32976c = rect;
            y0.this.h();
        }
    }

    public class c implements android.view.e0<Rect> {
        public c() {
        }

        @Override // android.view.e0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            ek.q.b("SafeAreaInsetsObserver", String.format("New cutout insets: %s", String.valueOf(rect)));
            if (rect == null) {
                om.a.b().a(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            Rect g10 = y0.this.g(new RectF(rect), cl.a.e(y0.this.f32975a));
            om.a.b().a(g10.left, g10.top, g10.right, g10.bottom);
        }
    }

    public y0(Context context) {
        this.f32975a = context;
    }

    public final int f(float f10, float f11) {
        return (int) ((f10 / f11) + 0.5d);
    }

    public final Rect g(RectF rectF, float f10) {
        return new Rect(f(rectF.left, f10), f(rectF.top, f10), f(rectF.right, f10), f(rectF.bottom, f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.y0.h():void");
    }

    public void i(android.view.s sVar, android.view.a0<Rect> a0Var) {
        if (!rh.h.a().E0()) {
            a0Var.i(sVar, new c());
            return;
        }
        a0Var.i(sVar, new a());
        if (sVar instanceof com.roblox.client.b) {
            (rh.h.a().a1() ? ((com.roblox.client.b) sVar).G1().d() : ((com.roblox.client.b) sVar).G1().b()).i(sVar, new b());
        }
    }
}
