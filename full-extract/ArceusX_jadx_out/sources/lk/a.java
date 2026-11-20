package lk;

import android.content.Context;
import com.roblox.engine.jni.NativeGLInterface;
import ek.q;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public Context f23475a;
    public b b;

    /* renamed from: c, reason: collision with root package name */
    public C0413a f23476c;

    /* renamed from: lk.a$a, reason: collision with other inner class name */
    public static class C0413a {

        /* renamed from: a, reason: collision with root package name */
        public int f23477a;
    }

    public a(Context context, C0413a c0413a) {
        this.f23475a = context;
        this.f23476c = c0413a;
    }

    public final void a(int i10, int i11, int i12, int i13, int i14) {
        q.i("rbx.glview.layout", "doUpdateAppUISizes() vw:" + i10 + " status:" + i11 + " tbh:" + i12 + " bm:" + i13 + " rm:" + i14);
        NativeGLInterface.updateAppUISizes(i10, i11, i12, i13, i14);
    }

    public abstract b b();

    public void c(b bVar, boolean z10) {
        a aVar;
        b bVar2;
        if (bVar != null && (z10 || (bVar2 = this.b) == null || !bVar2.equals(bVar))) {
            this.b = bVar;
            try {
                float e10 = cl.a.e(this.f23475a);
                int f10 = f(bVar.f23479a.right, e10);
                int f11 = f(bVar.f23483f, e10);
                int i10 = bVar.f23482e;
                if (i10 > 0) {
                    aVar = this;
                    aVar.e(true, 0, f11, f10, f(i10, e10));
                } else {
                    aVar = this;
                    aVar.e(false, 0, f11, f10, 0);
                }
                if (g()) {
                    return;
                }
                int f12 = f(bVar.f23480c, e10);
                int f13 = f(bVar.f23484g, e10);
                int f14 = f(bVar.f23481d, e10);
                C0413a c0413a = aVar.f23476c;
                aVar.a(f10, f13, c0413a != null ? c0413a.f23477a : 0, f12, f14);
            } catch (Exception e11) {
                q.e("rbx.glview.layout", "onGlobalLayout() exception:" + e11.getMessage());
            }
        }
    }

    public void d(boolean z10) {
        c(b(), z10);
    }

    public void e(boolean z10, int i10, int i11, int i12, int i13) {
        q.i("rbx.glview.layout", "onUpdateKeyboardSize() v:" + z10 + " x:" + i10 + " y:" + i11 + " w:" + i12 + " h:" + i13);
        NativeGLInterface.updateKeyboardSize(z10, i10, i11, i12, i13);
    }

    public final int f(int i10, float f10) {
        return (int) ((i10 / f10) + 0.5d);
    }

    public boolean g() {
        return false;
    }
}
