package z2;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: z2.a$a, reason: collision with other inner class name */
    public static class C0684a {
        public static Interpolator a(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        public static Interpolator b(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f10, float f11, float f12, float f13) {
        return C0684a.a(f10, f11, f12, f13);
    }

    public static Interpolator b(Path path) {
        return C0684a.b(path);
    }
}
