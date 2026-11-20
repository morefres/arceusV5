package f1;

import android.annotation.SuppressLint;
import f1.c2;
import f1.g;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class s {

    public static abstract class a {
        public abstract s a();

        public a b(x2.a<c2.a> aVar) {
            c2.a f10 = c().f();
            aVar.accept(f10);
            f(f10.a());
            return this;
        }

        @SuppressLint({"KotlinPropertyAccess"})
        public abstract c2 c();

        public abstract a d(f1.a aVar);

        public abstract a e(int i10);

        public abstract a f(c2 c2Var);
    }

    public static a a() {
        return new g.b().e(-1).d(f1.a.a().a()).f(c2.a().a());
    }

    public static String e(int i10) {
        return i10 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    public static int f(int i10) {
        return Objects.equals(e(i10), "audio/mp4a-latm") ? 2 : -1;
    }

    public static int g(int i10) {
        return i10 != 1 ? 0 : 1;
    }

    public static String h(int i10) {
        return i10 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    public abstract f1.a b();

    public abstract int c();

    public abstract c2 d();

    public abstract a i();
}
