package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.Map;
import o5.c0;
import o5.q;

/* loaded from: classes.dex */
public class d extends q {
    public static final String[] Q = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final TypeEvaluator<Matrix> R = new a();
    public static final Property<ImageView, Matrix> S = new b(Matrix.class, "animatedTransform");

    public class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    public class b extends Property<ImageView, Matrix> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            h.a(imageView, matrix);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27614a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f27614a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27614a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o5.d$d, reason: collision with other inner class name */
    public static class C0482d extends AnimatorListenerAdapter implements q.h {

        /* renamed from: a, reason: collision with root package name */
        public final ImageView f27615a;
        public final Matrix b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f27616c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f27617d = true;

        public C0482d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f27615a = imageView;
            this.b = matrix;
            this.f27616c = matrix2;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            c();
        }

        public final void c() {
            Matrix matrix = (Matrix) this.f27615a.getTag(l.f27657d);
            if (matrix != null) {
                h.a(this.f27615a, matrix);
                this.f27615a.setTag(l.f27657d, null);
            }
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            if (this.f27617d) {
                e(this.b);
            }
        }

        public final void e(Matrix matrix) {
            this.f27615a.setTag(l.f27657d, matrix);
            h.a(this.f27615a, this.f27616c);
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            this.f27617d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            e((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            c();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            this.f27617d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f27617d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f27617d = false;
        }
    }

    private void B0(d0 d0Var, boolean z10) {
        View view = d0Var.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = d0Var.f27618a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix = z10 ? (Matrix) imageView.getTag(l.f27657d) : null;
            if (matrix == null) {
                matrix = D0(imageView);
            }
            map.put("android:changeImageTransform:matrix", matrix);
        }
    }

    public static Matrix C0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f10 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f11 = intrinsicHeight;
        float max = Math.max(width / f10, height / f11);
        int round = Math.round((width - (f10 * max)) / 2.0f);
        int round2 = Math.round((height - (f11 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    @NonNull
    public static Matrix D0(@NonNull ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i10 = c.f27614a[imageView.getScaleType().ordinal()];
        return i10 != 1 ? i10 != 2 ? new Matrix(imageView.getImageMatrix()) : C0(imageView) : G0(imageView);
    }

    public static Matrix G0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    public final ObjectAnimator E0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) S, (TypeEvaluator) new c0.b(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @NonNull
    public final ObjectAnimator F0(@NonNull ImageView imageView) {
        Property<ImageView, Matrix> property = S;
        TypeEvaluator<Matrix> typeEvaluator = R;
        Matrix matrix = i.f27648a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    @Override // o5.q
    @NonNull
    public String[] V() {
        return Q;
    }

    @Override // o5.q
    public boolean Y() {
        return true;
    }

    @Override // o5.q
    public void j(@NonNull d0 d0Var) {
        B0(d0Var, false);
    }

    @Override // o5.q
    public void o(@NonNull d0 d0Var) {
        B0(d0Var, true);
    }

    @Override // o5.q
    public Animator s(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        if (d0Var == null || d0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) d0Var.f27618a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) d0Var2.f27618a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) d0Var.f27618a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) d0Var2.f27618a.get("android:changeImageTransform:matrix");
        boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z10) {
            return null;
        }
        ImageView imageView = (ImageView) d0Var2.b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return F0(imageView);
        }
        if (matrix == null) {
            matrix = i.f27648a;
        }
        if (matrix2 == null) {
            matrix2 = i.f27648a;
        }
        S.set(imageView, matrix);
        ObjectAnimator E0 = E0(imageView, matrix, matrix2);
        C0482d c0482d = new C0482d(imageView, matrix, matrix2);
        E0.addListener(c0482d);
        E0.addPauseListener(c0482d);
        c(c0482d);
        return E0;
    }
}
