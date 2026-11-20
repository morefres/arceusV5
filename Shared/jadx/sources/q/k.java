package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;
import q.r0;

/* loaded from: classes.dex */
public final class k {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static k f29321c;

    /* renamed from: a, reason: collision with root package name */
    public r0 f29322a;

    public class a implements r0.c {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f29323a = {i.e.R, i.e.P, i.e.f19841a};
        public final int[] b = {i.e.f19854o, i.e.B, i.e.f19859t, i.e.f19855p, i.e.f19856q, i.e.f19858s, i.e.f19857r};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f29324c = {i.e.O, i.e.Q, i.e.f19850k, i.e.K, i.e.L, i.e.M, i.e.N};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f29325d = {i.e.f19862w, i.e.f19848i, i.e.f19861v};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f29326e = {i.e.J, i.e.S};

        /* renamed from: f, reason: collision with root package name */
        public final int[] f29327f = {i.e.f19842c, i.e.f19846g, i.e.f19843d, i.e.f19847h};

        @Override // q.r0.c
        public Drawable a(@NonNull r0 r0Var, @NonNull Context context, int i10) {
            if (i10 == i.e.f19849j) {
                return new LayerDrawable(new Drawable[]{r0Var.i(context, i.e.f19848i), r0Var.i(context, i.e.f19850k)});
            }
            if (i10 == i.e.f19864y) {
                return l(r0Var, context, i.d.f19838i);
            }
            if (i10 == i.e.f19863x) {
                return l(r0Var, context, i.d.f19839j);
            }
            if (i10 == i.e.f19865z) {
                return l(r0Var, context, i.d.f19840k);
            }
            return null;
        }

        @Override // q.r0.c
        public ColorStateList b(@NonNull Context context, int i10) {
            if (i10 == i.e.f19852m) {
                return k.a.a(context, i.c.f19827e);
            }
            if (i10 == i.e.I) {
                return k.a.a(context, i.c.f19830h);
            }
            if (i10 == i.e.H) {
                return k(context);
            }
            if (i10 == i.e.f19845f) {
                return j(context);
            }
            if (i10 == i.e.b) {
                return g(context);
            }
            if (i10 == i.e.f19844e) {
                return i(context);
            }
            if (i10 == i.e.D || i10 == i.e.E) {
                return k.a.a(context, i.c.f19829g);
            }
            if (f(this.b, i10)) {
                return v0.e(context, i.a.f19821y);
            }
            if (f(this.f29326e, i10)) {
                return k.a.a(context, i.c.f19826d);
            }
            if (f(this.f29327f, i10)) {
                return k.a.a(context, i.c.f19825c);
            }
            if (i10 == i.e.A) {
                return k.a.a(context, i.c.f19828f);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
        @Override // q.r0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean c(@androidx.annotation.NonNull android.content.Context r7, int r8, @androidx.annotation.NonNull android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = q.k.a()
                int[] r1 = r6.f29323a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = i.a.f19821y
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4e
            L15:
                int[] r1 = r6.f29324c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = i.a.f19819w
                goto L11
            L20:
                int[] r1 = r6.f29325d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r8 = r5
            L30:
                r5 = r2
                goto L4e
            L32:
                int r1 = i.e.f19860u
                if (r8 != r1) goto L45
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r5
                goto L30
            L45:
                int r1 = i.e.f19851l
                if (r8 != r1) goto L4a
                goto L2d
            L4a:
                r1 = r0
                r8 = r3
                r5 = r8
                goto L13
            L4e:
                if (r5 == 0) goto L65
                android.graphics.drawable.Drawable r9 = r9.mutate()
                int r7 = q.v0.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = q.k.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L64
                r9.setAlpha(r0)
            L64:
                return r2
            L65:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: q.k.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // q.r0.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == i.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // q.r0.c
        public boolean e(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            if (i10 == i.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), v0.c(context, i.a.f19821y), k.b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), v0.c(context, i.a.f19821y), k.b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), v0.c(context, i.a.f19819w), k.b);
                return true;
            }
            if (i10 != i.e.f19864y && i10 != i.e.f19863x && i10 != i.e.f19865z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), v0.b(context, i.a.f19821y), k.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), v0.c(context, i.a.f19819w), k.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), v0.c(context, i.a.f19819w), k.b);
            return true;
        }

        public final boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(@NonNull Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(@NonNull Context context, int i10) {
            int c10 = v0.c(context, i.a.f19820x);
            return new ColorStateList(new int[][]{v0.b, v0.f29460e, v0.f29458c, v0.f29464i}, new int[]{v0.b(context, i.a.f19818v), androidx.core.graphics.c.h(c10, i10), androidx.core.graphics.c.h(c10, i10), i10});
        }

        public final ColorStateList i(@NonNull Context context) {
            return h(context, v0.c(context, i.a.f19817u));
        }

        public final ColorStateList j(@NonNull Context context) {
            return h(context, v0.c(context, i.a.f19818v));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e10 = v0.e(context, i.a.A);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = v0.b;
                iArr2[0] = v0.b(context, i.a.A);
                iArr[1] = v0.f29461f;
                iArr2[1] = v0.c(context, i.a.f19819w);
                iArr[2] = v0.f29464i;
                iArr2[2] = v0.c(context, i.a.A);
            } else {
                int[] iArr3 = v0.b;
                iArr[0] = iArr3;
                iArr2[0] = e10.getColorForState(iArr3, 0);
                iArr[1] = v0.f29461f;
                iArr2[1] = v0.c(context, i.a.f19819w);
                iArr[2] = v0.f29464i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(@NonNull r0 r0Var, @NonNull Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable i11 = r0Var.i(context, i.e.F);
            Drawable i12 = r0Var.i(context, i.e.G);
            if ((i11 instanceof BitmapDrawable) && i11.getIntrinsicWidth() == dimensionPixelSize && i11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) i11;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i11.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((i12 instanceof BitmapDrawable) && i12.getIntrinsicWidth() == dimensionPixelSize && i12.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i12;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i12.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i12.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = k.b;
            }
            mutate.setColorFilter(k.e(i10, mode));
        }
    }

    public static synchronized k b() {
        k kVar;
        synchronized (k.class) {
            try {
                if (f29321c == null) {
                    h();
                }
                kVar = f29321c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter k10;
        synchronized (k.class) {
            k10 = r0.k(i10, mode);
        }
        return k10;
    }

    public static synchronized void h() {
        synchronized (k.class) {
            if (f29321c == null) {
                k kVar = new k();
                f29321c = kVar;
                kVar.f29322a = r0.g();
                f29321c.f29322a.t(new a());
            }
        }
    }

    public static void i(Drawable drawable, y0 y0Var, int[] iArr) {
        r0.v(drawable, y0Var, iArr);
    }

    public synchronized Drawable c(@NonNull Context context, int i10) {
        return this.f29322a.i(context, i10);
    }

    public synchronized Drawable d(@NonNull Context context, int i10, boolean z10) {
        return this.f29322a.j(context, i10, z10);
    }

    public synchronized ColorStateList f(@NonNull Context context, int i10) {
        return this.f29322a.l(context, i10);
    }

    public synchronized void g(@NonNull Context context) {
        this.f29322a.r(context);
    }
}
