package o5;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class k0 extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f27653d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f27654e = true;

    public static class a {
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // o5.j0
    @SuppressLint({"NewApi"})
    public void g(@NonNull View view, @NonNull Matrix matrix) {
        if (f27653d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f27653d = false;
            }
        }
    }

    @Override // o5.j0
    @SuppressLint({"NewApi"})
    public void h(@NonNull View view, @NonNull Matrix matrix) {
        if (f27654e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f27654e = false;
            }
        }
    }
}
