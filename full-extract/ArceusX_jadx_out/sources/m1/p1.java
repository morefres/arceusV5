package m1;

import android.media.MediaFormat;
import android.util.Size;
import m1.d;
import n0.a4;

/* loaded from: classes.dex */
public abstract class p1 implements n {

    public static abstract class a {
        public abstract p1 a();

        public abstract a b(int i10);

        public abstract a c(int i10);

        public abstract a d(int i10);

        public abstract a e(q1 q1Var);

        public abstract a f(int i10);

        public abstract a g(int i10);

        public abstract a h(a4 a4Var);

        public abstract a i(String str);

        public abstract a j(int i10);

        public abstract a k(Size size);
    }

    public static a d() {
        return new d.b().j(-1).g(1).d(2130708361).e(q1.f24197a);
    }

    @Override // m1.n
    public MediaFormat a() {
        Size l10 = l();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(b(), l10.getWidth(), l10.getHeight());
        createVideoFormat.setInteger("color-format", g());
        createVideoFormat.setInteger("bitrate", e());
        createVideoFormat.setInteger("frame-rate", i());
        if (i() != f()) {
            createVideoFormat.setInteger("operating-rate", f());
            createVideoFormat.setInteger("priority", 0);
        }
        createVideoFormat.setInteger("i-frame-interval", j());
        if (k() != -1) {
            createVideoFormat.setInteger("profile", k());
        }
        q1 h10 = h();
        if (h10.c() != 0) {
            createVideoFormat.setInteger("color-standard", h10.c());
        }
        if (h10.d() != 0) {
            createVideoFormat.setInteger("color-transfer", h10.d());
        }
        if (h10.b() != 0) {
            createVideoFormat.setInteger("color-range", h10.b());
        }
        return createVideoFormat;
    }

    @Override // m1.n
    public abstract String b();

    @Override // m1.n
    public abstract a4 c();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract q1 h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract Size l();

    public abstract a m();
}
