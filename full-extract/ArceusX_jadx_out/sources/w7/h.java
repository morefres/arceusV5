package w7;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;
import w7.b;
import w7.e;
import w7.g;

/* loaded from: classes.dex */
public class h {

    /* renamed from: i, reason: collision with root package name */
    public static HashSet<String> f34025i;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f34026a;
    public float b;

    /* renamed from: c, reason: collision with root package name */
    public w7.g f34027c;

    /* renamed from: d, reason: collision with root package name */
    public C0635h f34028d;

    /* renamed from: e, reason: collision with root package name */
    public Stack<C0635h> f34029e;

    /* renamed from: f, reason: collision with root package name */
    public Stack<g.j0> f34030f;

    /* renamed from: g, reason: collision with root package name */
    public Stack<Matrix> f34031g;

    /* renamed from: h, reason: collision with root package name */
    public b.q f34032h = null;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34033a;
        public static final /* synthetic */ int[] b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f34034c;

        static {
            int[] iArr = new int[g.e0.d.values().length];
            f34034c = iArr;
            try {
                iArr[g.e0.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34034c[g.e0.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34034c[g.e0.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[g.e0.c.values().length];
            b = iArr2;
            try {
                iArr2[g.e0.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[g.e0.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[g.e0.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[e.a.values().length];
            f34033a = iArr3;
            try {
                iArr3[e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34033a[e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34033a[e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34033a[e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34033a[e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34033a[e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34033a[e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34033a[e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public class b implements g.x {
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f34036c;

        /* renamed from: h, reason: collision with root package name */
        public boolean f34041h;

        /* renamed from: a, reason: collision with root package name */
        public List<c> f34035a = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public c f34037d = null;

        /* renamed from: e, reason: collision with root package name */
        public boolean f34038e = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f34039f = true;

        /* renamed from: g, reason: collision with root package name */
        public int f34040g = -1;

        public b(g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.h(this);
            if (this.f34041h) {
                this.f34037d.b(this.f34035a.get(this.f34040g));
                this.f34035a.set(this.f34040g, this.f34037d);
                this.f34041h = false;
            }
            c cVar = this.f34037d;
            if (cVar != null) {
                this.f34035a.add(cVar);
            }
        }

        @Override // w7.g.x
        public void a(float f10, float f11, float f12, float f13) {
            this.f34037d.a(f10, f11);
            this.f34035a.add(this.f34037d);
            this.f34037d = h.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f34041h = false;
        }

        @Override // w7.g.x
        public void b(float f10, float f11) {
            if (this.f34041h) {
                this.f34037d.b(this.f34035a.get(this.f34040g));
                this.f34035a.set(this.f34040g, this.f34037d);
                this.f34041h = false;
            }
            c cVar = this.f34037d;
            if (cVar != null) {
                this.f34035a.add(cVar);
            }
            this.b = f10;
            this.f34036c = f11;
            this.f34037d = h.this.new c(f10, f11, 0.0f, 0.0f);
            this.f34040g = this.f34035a.size();
        }

        @Override // w7.g.x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f34039f || this.f34038e) {
                this.f34037d.a(f10, f11);
                this.f34035a.add(this.f34037d);
                this.f34038e = false;
            }
            this.f34037d = h.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f34041h = false;
        }

        @Override // w7.g.x
        public void close() {
            this.f34035a.add(this.f34037d);
            e(this.b, this.f34036c);
            this.f34041h = true;
        }

        @Override // w7.g.x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f34038e = true;
            this.f34039f = false;
            c cVar = this.f34037d;
            h.h(cVar.f34043a, cVar.b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f34039f = true;
            this.f34041h = false;
        }

        @Override // w7.g.x
        public void e(float f10, float f11) {
            this.f34037d.a(f10, f11);
            this.f34035a.add(this.f34037d);
            h hVar = h.this;
            c cVar = this.f34037d;
            this.f34037d = hVar.new c(f10, f11, f10 - cVar.f34043a, f11 - cVar.b);
            this.f34041h = false;
        }

        public List<c> f() {
            return this.f34035a;
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public float f34043a;
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f34044c;

        /* renamed from: d, reason: collision with root package name */
        public float f34045d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f34046e = false;

        public c(float f10, float f11, float f12, float f13) {
            this.f34044c = 0.0f;
            this.f34045d = 0.0f;
            this.f34043a = f10;
            this.b = f11;
            double sqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (sqrt != 0.0d) {
                this.f34044c = (float) (f12 / sqrt);
                this.f34045d = (float) (f13 / sqrt);
            }
        }

        public void a(float f10, float f11) {
            float f12 = f10 - this.f34043a;
            float f13 = f11 - this.b;
            double sqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (sqrt != 0.0d) {
                f12 = (float) (f12 / sqrt);
                f13 = (float) (f13 / sqrt);
            }
            float f14 = this.f34044c;
            if (f12 != (-f14) || f13 != (-this.f34045d)) {
                this.f34044c = f14 + f12;
                this.f34045d += f13;
            } else {
                this.f34046e = true;
                this.f34044c = -f13;
                this.f34045d = f12;
            }
        }

        public void b(c cVar) {
            float f10 = cVar.f34044c;
            float f11 = this.f34044c;
            if (f10 == (-f11)) {
                float f12 = cVar.f34045d;
                if (f12 == (-this.f34045d)) {
                    this.f34046e = true;
                    this.f34044c = -f12;
                    this.f34045d = cVar.f34044c;
                    return;
                }
            }
            this.f34044c = f11 + f10;
            this.f34045d += cVar.f34045d;
        }

        public String toString() {
            return "(" + this.f34043a + "," + this.b + " " + this.f34044c + "," + this.f34045d + ")";
        }
    }

    public class d implements g.x {

        /* renamed from: a, reason: collision with root package name */
        public Path f34048a = new Path();
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f34049c;

        public d(g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.h(this);
        }

        @Override // w7.g.x
        public void a(float f10, float f11, float f12, float f13) {
            this.f34048a.quadTo(f10, f11, f12, f13);
            this.b = f12;
            this.f34049c = f13;
        }

        @Override // w7.g.x
        public void b(float f10, float f11) {
            this.f34048a.moveTo(f10, f11);
            this.b = f10;
            this.f34049c = f11;
        }

        @Override // w7.g.x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f34048a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.b = f14;
            this.f34049c = f15;
        }

        @Override // w7.g.x
        public void close() {
            this.f34048a.close();
        }

        @Override // w7.g.x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            h.h(this.b, this.f34049c, f10, f11, f12, z10, z11, f13, f14, this);
            this.b = f13;
            this.f34049c = f14;
        }

        @Override // w7.g.x
        public void e(float f10, float f11) {
            this.f34048a.lineTo(f10, f11);
            this.b = f10;
            this.f34049c = f11;
        }

        public Path f() {
            return this.f34048a;
        }
    }

    public class e extends f {

        /* renamed from: e, reason: collision with root package name */
        public Path f34051e;

        public e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f34051e = path;
        }

        @Override // w7.h.f, w7.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                if (h.this.f34028d.b) {
                    str2 = str;
                    h.this.f34026a.drawTextOnPath(str2, this.f34051e, this.b, this.f34053c, h.this.f34028d.f34060d);
                } else {
                    str2 = str;
                }
                if (h.this.f34028d.f34059c) {
                    h.this.f34026a.drawTextOnPath(str2, this.f34051e, this.b, this.f34053c, h.this.f34028d.f34061e);
                }
            } else {
                str2 = str;
            }
            this.b += h.this.f34028d.f34060d.measureText(str2);
        }
    }

    public class f extends j {
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f34053c;

        public f(float f10, float f11) {
            super(h.this, null);
            this.b = f10;
            this.f34053c = f11;
        }

        @Override // w7.h.j
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f34028d.b) {
                    h.this.f34026a.drawText(str, this.b, this.f34053c, h.this.f34028d.f34060d);
                }
                if (h.this.f34028d.f34059c) {
                    h.this.f34026a.drawText(str, this.b, this.f34053c, h.this.f34028d.f34061e);
                }
            }
            this.b += h.this.f34028d.f34060d.measureText(str);
        }
    }

    public class g extends j {
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f34055c;

        /* renamed from: d, reason: collision with root package name */
        public Path f34056d;

        public g(float f10, float f11, Path path) {
            super(h.this, null);
            this.b = f10;
            this.f34055c = f11;
            this.f34056d = path;
        }

        @Override // w7.h.j
        public boolean a(g.y0 y0Var) {
            if (!(y0Var instanceof g.z0)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // w7.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                h.this.f34028d.f34060d.getTextPath(str2, 0, str.length(), this.b, this.f34055c, path);
                this.f34056d.addPath(path);
            } else {
                str2 = str;
            }
            this.b += h.this.f34028d.f34060d.measureText(str2);
        }
    }

    public class i extends j {
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f34066c;

        /* renamed from: d, reason: collision with root package name */
        public RectF f34067d;

        public i(float f10, float f11) {
            super(h.this, null);
            this.f34067d = new RectF();
            this.b = f10;
            this.f34066c = f11;
        }

        @Override // w7.h.j
        public boolean a(g.y0 y0Var) {
            if (!(y0Var instanceof g.z0)) {
                return true;
            }
            g.z0 z0Var = (g.z0) y0Var;
            g.n0 p8 = y0Var.f33972a.p(z0Var.f34022o);
            if (p8 == null) {
                h.F("TextPath path reference '%s' not found", z0Var.f34022o);
                return false;
            }
            g.v vVar = (g.v) p8;
            Path f10 = h.this.new d(vVar.f34006o).f();
            Matrix matrix = vVar.f33961n;
            if (matrix != null) {
                f10.transform(matrix);
            }
            RectF rectF = new RectF();
            f10.computeBounds(rectF, true);
            this.f34067d.union(rectF);
            return false;
        }

        @Override // w7.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f34028d.f34060d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.b, this.f34066c);
                this.f34067d.union(rectF);
            }
            this.b += h.this.f34028d.f34060d.measureText(str);
        }
    }

    public abstract class j {
        public j() {
        }

        public boolean a(g.y0 y0Var) {
            return true;
        }

        public abstract void b(String str);

        public /* synthetic */ j(h hVar, a aVar) {
            this();
        }
    }

    public h(Canvas canvas, float f10) {
        this.f34026a = canvas;
        this.b = f10;
    }

    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static synchronized void V() {
        synchronized (h.class) {
            HashSet<String> hashSet = new HashSet<>();
            f34025i = hashSet;
            hashSet.add("Structure");
            f34025i.add("BasicStructure");
            f34025i.add("ConditionalProcessing");
            f34025i.add("Image");
            f34025i.add("Style");
            f34025i.add("ViewportAttribute");
            f34025i.add("Shape");
            f34025i.add("BasicText");
            f34025i.add("PaintAttribute");
            f34025i.add("BasicPaintAttribute");
            f34025i.add("OpacityAttribute");
            f34025i.add("BasicGraphicsAttribute");
            f34025i.add("Marker");
            f34025i.add("Gradient");
            f34025i.add("Pattern");
            f34025i.add("Clip");
            f34025i.add("BasicClip");
            f34025i.add("Mask");
            f34025i.add("View");
        }
    }

    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, g.x xVar) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            xVar.e(f15, f16);
            return;
        }
        float abs = Math.abs(f12);
        float abs2 = Math.abs(f13);
        double radians = Math.toRadians(f14 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d10 = (f10 - f15) / 2.0d;
        double d11 = (f11 - f16) / 2.0d;
        double d12 = (cos * d10) + (sin * d11);
        double d13 = ((-sin) * d10) + (cos * d11);
        double d14 = abs * abs;
        double d15 = abs2 * abs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d16 / d14) + (d17 / d15);
        if (d18 > 0.99999d) {
            double sqrt = Math.sqrt(d18) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d14 = abs * abs;
            d15 = abs2 * abs2;
        }
        double d19 = z10 == z11 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double sqrt2 = d19 * Math.sqrt(d23);
        double d24 = abs;
        double d25 = abs2;
        double d26 = ((d24 * d13) / d25) * sqrt2;
        double d27 = (-((d25 * d12) / d24)) * sqrt2;
        double d28 = ((f10 + f15) / 2.0d) + ((cos * d26) - (sin * d27));
        double d29 = ((f11 + f16) / 2.0d) + (sin * d26) + (cos * d27);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d30 * d30) + (d31 * d31);
        double acos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
        double v5 = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z11 && v5 > 0.0d) {
            v5 -= 6.283185307179586d;
        } else if (z11 && v5 < 0.0d) {
            v5 += 6.283185307179586d;
        }
        float[] i10 = i(acos % 6.283185307179586d, v5 % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(i10);
        i10[i10.length - 2] = f15;
        i10[i10.length - 1] = f16;
        for (int i11 = 0; i11 < i10.length; i11 += 6) {
            xVar.c(i10[i11], i10[i11 + 1], i10[i11 + 2], i10[i11 + 3], i10[i11 + 4], i10[i11 + 5]);
        }
    }

    public static float[] i(double d10, double d11) {
        int ceil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ceil;
        double d13 = d12 / 2.0d;
        double sin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < ceil) {
            double d14 = d10 + (i10 * d12);
            double cos = Math.cos(d14);
            double sin2 = Math.sin(d14);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (cos - (sin * sin2));
            fArr2[i11 + 1] = (float) (sin2 + (cos * sin));
            double d15 = d14 + d12;
            double cos2 = Math.cos(d15);
            double sin3 = Math.sin(d15);
            fArr2[i11 + 2] = (float) ((sin * sin3) + cos2);
            fArr2[i11 + 3] = (float) (sin3 - (sin * cos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) cos2;
            i11 += 6;
            fArr2[i12] = (float) sin3;
            i10++;
            fArr = fArr2;
            ceil = ceil;
        }
        return fArr;
    }

    public static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    public static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    public static int x(int i10, float f10) {
        int i11 = 255;
        int round = Math.round(((i10 >> 24) & 255) * f10);
        if (round < 0) {
            i11 = 0;
        } else if (round <= 255) {
            i11 = round;
        }
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (i11 << 24);
    }

    public static void y(String str, Object... objArr) {
    }

    public final boolean A() {
        Boolean bool = this.f34028d.f34058a.A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void A0(g.n0 n0Var) {
        if (n0Var instanceof g.t) {
            return;
        }
        S0();
        u(n0Var);
        if (n0Var instanceof g.f0) {
            x0((g.f0) n0Var);
        } else if (n0Var instanceof g.e1) {
            E0((g.e1) n0Var);
        } else if (n0Var instanceof g.s0) {
            B0((g.s0) n0Var);
        } else if (n0Var instanceof g.m) {
            q0((g.m) n0Var);
        } else if (n0Var instanceof g.o) {
            r0((g.o) n0Var);
        } else if (n0Var instanceof g.v) {
            t0((g.v) n0Var);
        } else if (n0Var instanceof g.b0) {
            w0((g.b0) n0Var);
        } else if (n0Var instanceof g.d) {
            o0((g.d) n0Var);
        } else if (n0Var instanceof g.i) {
            p0((g.i) n0Var);
        } else if (n0Var instanceof g.q) {
            s0((g.q) n0Var);
        } else if (n0Var instanceof g.a0) {
            v0((g.a0) n0Var);
        } else if (n0Var instanceof g.z) {
            u0((g.z) n0Var);
        } else if (n0Var instanceof g.w0) {
            D0((g.w0) n0Var);
        }
        R0();
    }

    public final void B(g.k0 k0Var, Path path) {
        g.o0 o0Var = this.f34028d.f34058a.b;
        if (o0Var instanceof g.u) {
            g.n0 p8 = this.f34027c.p(((g.u) o0Var).f34003a);
            if (p8 instanceof g.y) {
                L(k0Var, path, (g.y) p8);
                return;
            }
        }
        this.f34026a.drawPath(path, this.f34028d.f34060d);
    }

    public final void B0(g.s0 s0Var) {
        y("Switch render", new Object[0]);
        W0(this.f34028d, s0Var);
        if (A()) {
            Matrix matrix = s0Var.f33967o;
            if (matrix != null) {
                this.f34026a.concat(matrix);
            }
            p(s0Var);
            boolean m02 = m0();
            K0(s0Var);
            if (m02) {
                j0(s0Var);
            }
            U0(s0Var);
        }
    }

    public final void C(Path path) {
        C0635h c0635h = this.f34028d;
        if (c0635h.f34058a.L != g.e0.i.NonScalingStroke) {
            this.f34026a.drawPath(path, c0635h.f34061e);
            return;
        }
        Matrix matrix = this.f34026a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f34026a.setMatrix(new Matrix());
        Shader shader = this.f34028d.f34061e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f34026a.drawPath(path2, this.f34028d.f34061e);
        this.f34026a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void C0(g.t0 t0Var, g.b bVar) {
        y("Symbol render", new Object[0]);
        if (bVar.f33846c == 0.0f || bVar.f33847d == 0.0f) {
            return;
        }
        w7.e eVar = t0Var.f33980o;
        if (eVar == null) {
            eVar = w7.e.f33809e;
        }
        W0(this.f34028d, t0Var);
        C0635h c0635h = this.f34028d;
        c0635h.f34062f = bVar;
        if (!c0635h.f34058a.f33893v.booleanValue()) {
            g.b bVar2 = this.f34028d.f34062f;
            O0(bVar2.f33845a, bVar2.b, bVar2.f33846c, bVar2.f33847d);
        }
        g.b bVar3 = t0Var.f33996p;
        if (bVar3 != null) {
            this.f34026a.concat(o(this.f34028d.f34062f, bVar3, eVar));
            this.f34028d.f34063g = t0Var.f33996p;
        } else {
            Canvas canvas = this.f34026a;
            g.b bVar4 = this.f34028d.f34062f;
            canvas.translate(bVar4.f33845a, bVar4.b);
        }
        boolean m02 = m0();
        F0(t0Var, true);
        if (m02) {
            j0(t0Var);
        }
        U0(t0Var);
    }

    public final float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    public final void D0(g.w0 w0Var) {
        y("Text render", new Object[0]);
        W0(this.f34028d, w0Var);
        if (A()) {
            Matrix matrix = w0Var.f34012s;
            if (matrix != null) {
                this.f34026a.concat(matrix);
            }
            List<g.p> list = w0Var.f33841o;
            float f10 = 0.0f;
            float f11 = (list == null || list.size() == 0) ? 0.0f : w0Var.f33841o.get(0).f(this);
            List<g.p> list2 = w0Var.f33842p;
            float h10 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f33842p.get(0).h(this);
            List<g.p> list3 = w0Var.f33843q;
            float f12 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f33843q.get(0).f(this);
            List<g.p> list4 = w0Var.f33844r;
            if (list4 != null && list4.size() != 0) {
                f10 = w0Var.f33844r.get(0).h(this);
            }
            g.e0.f O = O();
            if (O != g.e0.f.Start) {
                float n10 = n(w0Var);
                if (O == g.e0.f.Middle) {
                    n10 /= 2.0f;
                }
                f11 -= n10;
            }
            if (w0Var.f33960h == null) {
                i iVar = new i(f11, h10);
                E(w0Var, iVar);
                RectF rectF = iVar.f34067d;
                w0Var.f33960h = new g.b(rectF.left, rectF.top, rectF.width(), iVar.f34067d.height());
            }
            U0(w0Var);
            r(w0Var);
            p(w0Var);
            boolean m02 = m0();
            E(w0Var, new f(f11 + f12, h10 + f10));
            if (m02) {
                j0(w0Var);
            }
        }
    }

    public final void E(g.y0 y0Var, j jVar) {
        if (A()) {
            Iterator<g.n0> it = y0Var.f33937i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                g.n0 next = it.next();
                if (next instanceof g.c1) {
                    jVar.b(T0(((g.c1) next).f33857c, z10, !it.hasNext()));
                } else {
                    l0(next, jVar);
                }
                z10 = false;
            }
        }
    }

    public final void E0(g.e1 e1Var) {
        y("Use render", new Object[0]);
        g.p pVar = e1Var.f33927s;
        if (pVar == null || !pVar.j()) {
            g.p pVar2 = e1Var.f33928t;
            if (pVar2 == null || !pVar2.j()) {
                W0(this.f34028d, e1Var);
                if (A()) {
                    g.n0 p8 = e1Var.f33972a.p(e1Var.f33924p);
                    if (p8 == null) {
                        F("Use reference '%s' not found", e1Var.f33924p);
                        return;
                    }
                    Matrix matrix = e1Var.f33967o;
                    if (matrix != null) {
                        this.f34026a.concat(matrix);
                    }
                    g.p pVar3 = e1Var.f33925q;
                    float f10 = pVar3 != null ? pVar3.f(this) : 0.0f;
                    g.p pVar4 = e1Var.f33926r;
                    this.f34026a.translate(f10, pVar4 != null ? pVar4.h(this) : 0.0f);
                    p(e1Var);
                    boolean m02 = m0();
                    i0(e1Var);
                    if (p8 instanceof g.f0) {
                        g.b f02 = f0(null, null, e1Var.f33927s, e1Var.f33928t);
                        S0();
                        y0((g.f0) p8, f02);
                        R0();
                    } else if (p8 instanceof g.t0) {
                        g.p pVar5 = e1Var.f33927s;
                        if (pVar5 == null) {
                            pVar5 = new g.p(100.0f, g.d1.percent);
                        }
                        g.p pVar6 = e1Var.f33928t;
                        if (pVar6 == null) {
                            pVar6 = new g.p(100.0f, g.d1.percent);
                        }
                        g.b f03 = f0(null, null, pVar5, pVar6);
                        S0();
                        C0((g.t0) p8, f03);
                        R0();
                    } else {
                        A0(p8);
                    }
                    h0();
                    if (m02) {
                        j0(e1Var);
                    }
                    U0(e1Var);
                }
            }
        }
    }

    public final void F0(g.j0 j0Var, boolean z10) {
        if (z10) {
            i0(j0Var);
        }
        Iterator<g.n0> it = j0Var.getChildren().iterator();
        while (it.hasNext()) {
            A0(it.next());
        }
        if (z10) {
            h0();
        }
    }

    public final void G(g.y0 y0Var, StringBuilder sb2) {
        Iterator<g.n0> it = y0Var.f33937i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            g.n0 next = it.next();
            if (next instanceof g.y0) {
                G((g.y0) next, sb2);
            } else if (next instanceof g.c1) {
                sb2.append(T0(((g.c1) next).f33857c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public void G0(w7.g gVar, w7.f fVar) {
        g.b bVar;
        w7.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f34027c = gVar;
        g.f0 m10 = gVar.m();
        if (m10 == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.e()) {
            g.l0 i10 = this.f34027c.i(fVar.f33832e);
            if (i10 == null || !(i10 instanceof g.f1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", fVar.f33832e));
                return;
            }
            g.f1 f1Var = (g.f1) i10;
            bVar = f1Var.f33996p;
            if (bVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.f33832e));
                return;
            }
            eVar = f1Var.f33980o;
        } else {
            bVar = fVar.f() ? fVar.f33831d : m10.f33996p;
            eVar = fVar.c() ? fVar.b : m10.f33980o;
        }
        if (fVar.b()) {
            gVar.a(fVar.f33829a);
        }
        if (fVar.d()) {
            b.q qVar = new b.q();
            this.f34032h = qVar;
            qVar.f33796a = gVar.i(fVar.f33830c);
        }
        N0();
        u(m10);
        S0();
        g.b bVar2 = new g.b(fVar.f33833f);
        g.p pVar = m10.f33933s;
        if (pVar != null) {
            bVar2.f33846c = pVar.e(this, bVar2.f33846c);
        }
        g.p pVar2 = m10.f33934t;
        if (pVar2 != null) {
            bVar2.f33847d = pVar2.e(this, bVar2.f33847d);
        }
        z0(m10, bVar2, bVar, eVar);
        R0();
        if (fVar.b()) {
            gVar.b();
        }
    }

    public final void H(g.j jVar, String str) {
        g.n0 p8 = jVar.f33972a.p(str);
        if (p8 == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(p8 instanceof g.j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (p8 == jVar) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        g.j jVar2 = (g.j) p8;
        if (jVar.f33953i == null) {
            jVar.f33953i = jVar2.f33953i;
        }
        if (jVar.f33954j == null) {
            jVar.f33954j = jVar2.f33954j;
        }
        if (jVar.f33955k == null) {
            jVar.f33955k = jVar2.f33955k;
        }
        if (jVar.f33952h.isEmpty()) {
            jVar.f33952h = jVar2.f33952h;
        }
        try {
            if (jVar instanceof g.m0) {
                I((g.m0) jVar, (g.m0) p8);
            } else {
                J((g.q0) jVar, (g.q0) p8);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f33956l;
        if (str2 != null) {
            H(jVar, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(w7.g.r r12, w7.h.c r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h.H0(w7.g$r, w7.h$c):void");
    }

    public final void I(g.m0 m0Var, g.m0 m0Var2) {
        if (m0Var.f33968m == null) {
            m0Var.f33968m = m0Var2.f33968m;
        }
        if (m0Var.f33969n == null) {
            m0Var.f33969n = m0Var2.f33969n;
        }
        if (m0Var.f33970o == null) {
            m0Var.f33970o = m0Var2.f33970o;
        }
        if (m0Var.f33971p == null) {
            m0Var.f33971p = m0Var2.f33971p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0(w7.g.l r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h.I0(w7.g$l):void");
    }

    public final void J(g.q0 q0Var, g.q0 q0Var2) {
        if (q0Var.f33985m == null) {
            q0Var.f33985m = q0Var2.f33985m;
        }
        if (q0Var.f33986n == null) {
            q0Var.f33986n = q0Var2.f33986n;
        }
        if (q0Var.f33987o == null) {
            q0Var.f33987o = q0Var2.f33987o;
        }
        if (q0Var.f33988p == null) {
            q0Var.f33988p = q0Var2.f33988p;
        }
        if (q0Var.f33989q == null) {
            q0Var.f33989q = q0Var2.f33989q;
        }
    }

    public final void J0(g.s sVar, g.k0 k0Var, g.b bVar) {
        float f10;
        float f11;
        y("Mask render", new Object[0]);
        Boolean bool = sVar.f33997o;
        if (bool == null || !bool.booleanValue()) {
            g.p pVar = sVar.f34001s;
            float e10 = pVar != null ? pVar.e(this, 1.0f) : 1.2f;
            g.p pVar2 = sVar.f34002t;
            float e11 = pVar2 != null ? pVar2.e(this, 1.0f) : 1.2f;
            f10 = e10 * bVar.f33846c;
            f11 = e11 * bVar.f33847d;
        } else {
            g.p pVar3 = sVar.f34001s;
            f10 = pVar3 != null ? pVar3.f(this) : bVar.f33846c;
            g.p pVar4 = sVar.f34002t;
            f11 = pVar4 != null ? pVar4.h(this) : bVar.f33847d;
        }
        if (f10 == 0.0f || f11 == 0.0f) {
            return;
        }
        S0();
        C0635h M = M(sVar);
        this.f34028d = M;
        M.f34058a.f33884m = Float.valueOf(1.0f);
        boolean m02 = m0();
        this.f34026a.save();
        Boolean bool2 = sVar.f33998p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f34026a.translate(bVar.f33845a, bVar.b);
            this.f34026a.scale(bVar.f33846c, bVar.f33847d);
        }
        F0(sVar, false);
        this.f34026a.restore();
        if (m02) {
            k0(k0Var, bVar);
        }
        R0();
    }

    public final void K(g.y yVar, String str) {
        g.n0 p8 = yVar.f33972a.p(str);
        if (p8 == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(p8 instanceof g.y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (p8 == yVar) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        g.y yVar2 = (g.y) p8;
        if (yVar.f34013q == null) {
            yVar.f34013q = yVar2.f34013q;
        }
        if (yVar.f34014r == null) {
            yVar.f34014r = yVar2.f34014r;
        }
        if (yVar.f34015s == null) {
            yVar.f34015s = yVar2.f34015s;
        }
        if (yVar.f34016t == null) {
            yVar.f34016t = yVar2.f34016t;
        }
        if (yVar.f34017u == null) {
            yVar.f34017u = yVar2.f34017u;
        }
        if (yVar.f34018v == null) {
            yVar.f34018v = yVar2.f34018v;
        }
        if (yVar.f34019w == null) {
            yVar.f34019w = yVar2.f34019w;
        }
        if (yVar.f33937i.isEmpty()) {
            yVar.f33937i = yVar2.f33937i;
        }
        if (yVar.f33996p == null) {
            yVar.f33996p = yVar2.f33996p;
        }
        if (yVar.f33980o == null) {
            yVar.f33980o = yVar2.f33980o;
        }
        String str2 = yVar2.f34020x;
        if (str2 != null) {
            K(yVar, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0(g.s0 s0Var) {
        Set<String> b10;
        String language = Locale.getDefault().getLanguage();
        w7.g.k();
        for (g.n0 n0Var : s0Var.getChildren()) {
            if (n0Var instanceof g.g0) {
                g.g0 g0Var = (g.g0) n0Var;
                if (g0Var.c() == null && ((b10 = g0Var.b()) == null || (!b10.isEmpty() && b10.contains(language)))) {
                    Set<String> g10 = g0Var.g();
                    if (g10 != null) {
                        if (f34025i == null) {
                            V();
                        }
                        if (!g10.isEmpty() && f34025i.containsAll(g10)) {
                        }
                    }
                    Set<String> l10 = g0Var.l();
                    if (l10 != null) {
                        l10.isEmpty();
                    } else {
                        Set<String> m10 = g0Var.m();
                        if (m10 == null) {
                            A0(n0Var);
                            return;
                        }
                        m10.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(w7.g.k0 r21, android.graphics.Path r22, w7.g.y r23) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h.L(w7.g$k0, android.graphics.Path, w7.g$y):void");
    }

    public final void L0(g.z0 z0Var) {
        y("TextPath render", new Object[0]);
        W0(this.f34028d, z0Var);
        if (A() && Y0()) {
            g.n0 p8 = z0Var.f33972a.p(z0Var.f34022o);
            if (p8 == null) {
                F("TextPath reference '%s' not found", z0Var.f34022o);
                return;
            }
            g.v vVar = (g.v) p8;
            Path f10 = new d(vVar.f34006o).f();
            Matrix matrix = vVar.f33961n;
            if (matrix != null) {
                f10.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(f10, false);
            g.p pVar = z0Var.f34023p;
            float e10 = pVar != null ? pVar.e(this, pathMeasure.getLength()) : 0.0f;
            g.e0.f O = O();
            if (O != g.e0.f.Start) {
                float n10 = n(z0Var);
                if (O == g.e0.f.Middle) {
                    n10 /= 2.0f;
                }
                e10 -= n10;
            }
            r((g.k0) z0Var.e());
            boolean m02 = m0();
            E(z0Var, new e(f10, e10, 0.0f));
            if (m02) {
                j0(z0Var);
            }
        }
    }

    public final C0635h M(g.n0 n0Var) {
        C0635h c0635h = new C0635h();
        V0(c0635h, g.e0.a());
        return N(n0Var, c0635h);
    }

    public final boolean M0() {
        return this.f34028d.f34058a.f33884m.floatValue() < 1.0f || this.f34028d.f34058a.G != null;
    }

    public final C0635h N(g.n0 n0Var, C0635h c0635h) {
        int i10;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i10 = 0;
            if (n0Var instanceof g.l0) {
                arrayList.add(0, (g.l0) n0Var);
            }
            Object obj = n0Var.b;
            if (obj == null) {
                break;
            }
            n0Var = (g.n0) obj;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            W0(c0635h, (g.l0) obj2);
        }
        C0635h c0635h2 = this.f34028d;
        c0635h.f34063g = c0635h2.f34063g;
        c0635h.f34062f = c0635h2.f34062f;
        return c0635h;
    }

    public final void N0() {
        this.f34028d = new C0635h();
        this.f34029e = new Stack<>();
        V0(this.f34028d, g.e0.a());
        C0635h c0635h = this.f34028d;
        c0635h.f34062f = null;
        c0635h.f34064h = false;
        this.f34029e.push(new C0635h(c0635h));
        this.f34031g = new Stack<>();
        this.f34030f = new Stack<>();
    }

    public final g.e0.f O() {
        g.e0.f fVar;
        g.e0 e0Var = this.f34028d.f34058a;
        if (e0Var.f33891t == g.e0.h.LTR || (fVar = e0Var.f33892u) == g.e0.f.Middle) {
            return e0Var.f33892u;
        }
        g.e0.f fVar2 = g.e0.f.Start;
        return fVar == fVar2 ? g.e0.f.End : fVar2;
    }

    public final void O0(float f10, float f11, float f12, float f13) {
        float f14 = f12 + f10;
        float f15 = f13 + f11;
        g.c cVar = this.f34028d.f34058a.f33894w;
        if (cVar != null) {
            f10 += cVar.f33856d.f(this);
            f11 += this.f34028d.f34058a.f33894w.f33854a.h(this);
            f14 -= this.f34028d.f34058a.f33894w.b.f(this);
            f15 -= this.f34028d.f34058a.f33894w.f33855c.h(this);
        }
        this.f34026a.clipRect(f10, f11, f14, f15);
    }

    public final Path.FillType P() {
        g.e0.a aVar = this.f34028d.f34058a.F;
        return (aVar == null || aVar != g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void P0(C0635h c0635h, boolean z10, g.o0 o0Var) {
        int i10;
        g.e0 e0Var = c0635h.f34058a;
        float floatValue = (z10 ? e0Var.f33875d : e0Var.f33877f).floatValue();
        if (o0Var instanceof g.f) {
            i10 = ((g.f) o0Var).f33930a;
        } else if (!(o0Var instanceof g.C0634g)) {
            return;
        } else {
            i10 = c0635h.f34058a.f33885n.f33930a;
        }
        int x10 = x(i10, floatValue);
        if (z10) {
            c0635h.f34060d.setColor(x10);
        } else {
            c0635h.f34061e.setColor(x10);
        }
    }

    public float Q() {
        return this.f34028d.f34060d.getTextSize();
    }

    public final void Q0(boolean z10, g.c0 c0Var) {
        if (z10) {
            if (W(c0Var.f33964e, 2147483648L)) {
                C0635h c0635h = this.f34028d;
                g.e0 e0Var = c0635h.f34058a;
                g.o0 o0Var = c0Var.f33964e.H;
                e0Var.b = o0Var;
                c0635h.b = o0Var != null;
            }
            if (W(c0Var.f33964e, 4294967296L)) {
                this.f34028d.f34058a.f33875d = c0Var.f33964e.I;
            }
            if (W(c0Var.f33964e, 6442450944L)) {
                C0635h c0635h2 = this.f34028d;
                P0(c0635h2, z10, c0635h2.f34058a.b);
                return;
            }
            return;
        }
        if (W(c0Var.f33964e, 2147483648L)) {
            C0635h c0635h3 = this.f34028d;
            g.e0 e0Var2 = c0635h3.f34058a;
            g.o0 o0Var2 = c0Var.f33964e.H;
            e0Var2.f33876e = o0Var2;
            c0635h3.f34059c = o0Var2 != null;
        }
        if (W(c0Var.f33964e, 4294967296L)) {
            this.f34028d.f34058a.f33877f = c0Var.f33964e.I;
        }
        if (W(c0Var.f33964e, 6442450944L)) {
            C0635h c0635h4 = this.f34028d;
            P0(c0635h4, z10, c0635h4.f34058a.f33876e);
        }
    }

    public float R() {
        return this.f34028d.f34060d.getTextSize() / 2.0f;
    }

    public final void R0() {
        this.f34026a.restore();
        this.f34028d = this.f34029e.pop();
    }

    public g.b S() {
        C0635h c0635h = this.f34028d;
        g.b bVar = c0635h.f34063g;
        return bVar != null ? bVar : c0635h.f34062f;
    }

    public final void S0() {
        this.f34026a.save();
        this.f34029e.push(this.f34028d);
        this.f34028d = new C0635h(this.f34028d);
    }

    public float T() {
        return this.b;
    }

    public final String T0(String str, boolean z10, boolean z11) {
        if (this.f34028d.f34064h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z10) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    public final Path.FillType U() {
        g.e0.a aVar = this.f34028d.f34058a.f33874c;
        return (aVar == null || aVar != g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void U0(g.k0 k0Var) {
        if (k0Var.b == null || k0Var.f33960h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f34031g.peek().invert(matrix)) {
            g.b bVar = k0Var.f33960h;
            float f10 = bVar.f33845a;
            float f11 = bVar.b;
            float b10 = bVar.b();
            g.b bVar2 = k0Var.f33960h;
            float f12 = bVar2.b;
            float b11 = bVar2.b();
            float c10 = k0Var.f33960h.c();
            g.b bVar3 = k0Var.f33960h;
            float[] fArr = {f10, f11, b10, f12, b11, c10, bVar3.f33845a, bVar3.c()};
            matrix.preConcat(this.f34026a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            g.k0 k0Var2 = (g.k0) this.f34030f.peek();
            g.b bVar4 = k0Var2.f33960h;
            if (bVar4 == null) {
                k0Var2.f33960h = g.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.e(g.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    public final void V0(C0635h c0635h, g.e0 e0Var) {
        if (W(e0Var, 4096L)) {
            c0635h.f34058a.f33885n = e0Var.f33885n;
        }
        if (W(e0Var, 2048L)) {
            c0635h.f34058a.f33884m = e0Var.f33884m;
        }
        if (W(e0Var, 1L)) {
            c0635h.f34058a.b = e0Var.b;
            g.o0 o0Var = e0Var.b;
            c0635h.b = (o0Var == null || o0Var == g.f.f33929c) ? false : true;
        }
        if (W(e0Var, 4L)) {
            c0635h.f34058a.f33875d = e0Var.f33875d;
        }
        if (W(e0Var, 6149L)) {
            P0(c0635h, true, c0635h.f34058a.b);
        }
        if (W(e0Var, 2L)) {
            c0635h.f34058a.f33874c = e0Var.f33874c;
        }
        if (W(e0Var, 8L)) {
            c0635h.f34058a.f33876e = e0Var.f33876e;
            g.o0 o0Var2 = e0Var.f33876e;
            c0635h.f34059c = (o0Var2 == null || o0Var2 == g.f.f33929c) ? false : true;
        }
        if (W(e0Var, 16L)) {
            c0635h.f34058a.f33877f = e0Var.f33877f;
        }
        if (W(e0Var, 6168L)) {
            P0(c0635h, false, c0635h.f34058a.f33876e);
        }
        if (W(e0Var, 34359738368L)) {
            c0635h.f34058a.L = e0Var.L;
        }
        if (W(e0Var, 32L)) {
            g.e0 e0Var2 = c0635h.f34058a;
            g.p pVar = e0Var.f33878g;
            e0Var2.f33878g = pVar;
            c0635h.f34061e.setStrokeWidth(pVar.c(this));
        }
        if (W(e0Var, 64L)) {
            c0635h.f34058a.f33879h = e0Var.f33879h;
            int i10 = a.b[e0Var.f33879h.ordinal()];
            if (i10 == 1) {
                c0635h.f34061e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                c0635h.f34061e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                c0635h.f34061e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e0Var, 128L)) {
            c0635h.f34058a.f33880i = e0Var.f33880i;
            int i11 = a.f34034c[e0Var.f33880i.ordinal()];
            if (i11 == 1) {
                c0635h.f34061e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                c0635h.f34061e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                c0635h.f34061e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e0Var, 256L)) {
            c0635h.f34058a.f33881j = e0Var.f33881j;
            c0635h.f34061e.setStrokeMiter(e0Var.f33881j.floatValue());
        }
        if (W(e0Var, 512L)) {
            c0635h.f34058a.f33882k = e0Var.f33882k;
        }
        if (W(e0Var, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) {
            c0635h.f34058a.f33883l = e0Var.f33883l;
        }
        Typeface typeface = null;
        if (W(e0Var, 1536L)) {
            g.p[] pVarArr = c0635h.f34058a.f33882k;
            if (pVarArr == null) {
                c0635h.f34061e.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float c10 = c0635h.f34058a.f33882k[i13 % length].c(this);
                    fArr[i13] = c10;
                    f10 += c10;
                }
                if (f10 == 0.0f) {
                    c0635h.f34061e.setPathEffect(null);
                } else {
                    float c11 = c0635h.f34058a.f33883l.c(this);
                    if (c11 < 0.0f) {
                        c11 = (c11 % f10) + f10;
                    }
                    c0635h.f34061e.setPathEffect(new DashPathEffect(fArr, c11));
                }
            }
        }
        if (W(e0Var, Http2Stream.EMIT_BUFFER_SIZE)) {
            float Q = Q();
            c0635h.f34058a.f33887p = e0Var.f33887p;
            c0635h.f34060d.setTextSize(e0Var.f33887p.e(this, Q));
            c0635h.f34061e.setTextSize(e0Var.f33887p.e(this, Q));
        }
        if (W(e0Var, 8192L)) {
            c0635h.f34058a.f33886o = e0Var.f33886o;
        }
        if (W(e0Var, 32768L)) {
            if (e0Var.f33888q.intValue() == -1 && c0635h.f34058a.f33888q.intValue() > 100) {
                g.e0 e0Var3 = c0635h.f34058a;
                e0Var3.f33888q = Integer.valueOf(e0Var3.f33888q.intValue() - 100);
            } else if (e0Var.f33888q.intValue() != 1 || c0635h.f34058a.f33888q.intValue() >= 900) {
                c0635h.f34058a.f33888q = e0Var.f33888q;
            } else {
                g.e0 e0Var4 = c0635h.f34058a;
                e0Var4.f33888q = Integer.valueOf(e0Var4.f33888q.intValue() + 100);
            }
        }
        if (W(e0Var, 65536L)) {
            c0635h.f34058a.f33889r = e0Var.f33889r;
        }
        if (W(e0Var, 106496L)) {
            if (c0635h.f34058a.f33886o != null && this.f34027c != null) {
                w7.g.k();
                for (String str : c0635h.f34058a.f33886o) {
                    g.e0 e0Var5 = c0635h.f34058a;
                    typeface = t(str, e0Var5.f33888q, e0Var5.f33889r);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                g.e0 e0Var6 = c0635h.f34058a;
                typeface = t("serif", e0Var6.f33888q, e0Var6.f33889r);
            }
            c0635h.f34060d.setTypeface(typeface);
            c0635h.f34061e.setTypeface(typeface);
        }
        if (W(e0Var, 131072L)) {
            c0635h.f34058a.f33890s = e0Var.f33890s;
            Paint paint = c0635h.f34060d;
            g.e0.EnumC0633g enumC0633g = e0Var.f33890s;
            g.e0.EnumC0633g enumC0633g2 = g.e0.EnumC0633g.LineThrough;
            paint.setStrikeThruText(enumC0633g == enumC0633g2);
            Paint paint2 = c0635h.f34060d;
            g.e0.EnumC0633g enumC0633g3 = e0Var.f33890s;
            g.e0.EnumC0633g enumC0633g4 = g.e0.EnumC0633g.Underline;
            paint2.setUnderlineText(enumC0633g3 == enumC0633g4);
            c0635h.f34061e.setStrikeThruText(e0Var.f33890s == enumC0633g2);
            c0635h.f34061e.setUnderlineText(e0Var.f33890s == enumC0633g4);
        }
        if (W(e0Var, 68719476736L)) {
            c0635h.f34058a.f33891t = e0Var.f33891t;
        }
        if (W(e0Var, 262144L)) {
            c0635h.f34058a.f33892u = e0Var.f33892u;
        }
        if (W(e0Var, 524288L)) {
            c0635h.f34058a.f33893v = e0Var.f33893v;
        }
        if (W(e0Var, 2097152L)) {
            c0635h.f34058a.f33895x = e0Var.f33895x;
        }
        if (W(e0Var, 4194304L)) {
            c0635h.f34058a.f33896y = e0Var.f33896y;
        }
        if (W(e0Var, 8388608L)) {
            c0635h.f34058a.f33897z = e0Var.f33897z;
        }
        if (W(e0Var, 16777216L)) {
            c0635h.f34058a.A = e0Var.A;
        }
        if (W(e0Var, 33554432L)) {
            c0635h.f34058a.B = e0Var.B;
        }
        if (W(e0Var, 1048576L)) {
            c0635h.f34058a.f33894w = e0Var.f33894w;
        }
        if (W(e0Var, 268435456L)) {
            c0635h.f34058a.E = e0Var.E;
        }
        if (W(e0Var, 536870912L)) {
            c0635h.f34058a.F = e0Var.F;
        }
        if (W(e0Var, 1073741824L)) {
            c0635h.f34058a.G = e0Var.G;
        }
        if (W(e0Var, 67108864L)) {
            c0635h.f34058a.C = e0Var.C;
        }
        if (W(e0Var, 134217728L)) {
            c0635h.f34058a.D = e0Var.D;
        }
        if (W(e0Var, 8589934592L)) {
            c0635h.f34058a.J = e0Var.J;
        }
        if (W(e0Var, 17179869184L)) {
            c0635h.f34058a.K = e0Var.K;
        }
        if (W(e0Var, 137438953472L)) {
            c0635h.f34058a.M = e0Var.M;
        }
    }

    public final boolean W(g.e0 e0Var, long j10) {
        return (e0Var.f33873a & j10) != 0;
    }

    public final void W0(C0635h c0635h, g.l0 l0Var) {
        c0635h.f34058a.b(l0Var.b == null);
        g.e0 e0Var = l0Var.f33964e;
        if (e0Var != null) {
            V0(c0635h, e0Var);
        }
        if (this.f34027c.n()) {
            for (b.p pVar : this.f34027c.d()) {
                if (w7.b.l(this.f34032h, pVar.f33794a, l0Var)) {
                    V0(c0635h, pVar.b);
                }
            }
        }
        g.e0 e0Var2 = l0Var.f33965f;
        if (e0Var2 != null) {
            V0(c0635h, e0Var2);
        }
    }

    public final void X(boolean z10, g.b bVar, g.m0 m0Var) {
        float e10;
        float f10;
        float e11;
        float f11;
        String str = m0Var.f33956l;
        if (str != null) {
            H(m0Var, str);
        }
        Boolean bool = m0Var.f33953i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0635h c0635h = this.f34028d;
        Paint paint = z10 ? c0635h.f34060d : c0635h.f34061e;
        if (z11) {
            g.b S = S();
            g.p pVar = m0Var.f33968m;
            float f12 = pVar != null ? pVar.f(this) : 0.0f;
            g.p pVar2 = m0Var.f33969n;
            e10 = pVar2 != null ? pVar2.h(this) : 0.0f;
            g.p pVar3 = m0Var.f33970o;
            float f13 = pVar3 != null ? pVar3.f(this) : S.f33846c;
            g.p pVar4 = m0Var.f33971p;
            f11 = f13;
            f10 = f12;
            e11 = pVar4 != null ? pVar4.h(this) : 0.0f;
        } else {
            g.p pVar5 = m0Var.f33968m;
            float e12 = pVar5 != null ? pVar5.e(this, 1.0f) : 0.0f;
            g.p pVar6 = m0Var.f33969n;
            e10 = pVar6 != null ? pVar6.e(this, 1.0f) : 0.0f;
            g.p pVar7 = m0Var.f33970o;
            float e13 = pVar7 != null ? pVar7.e(this, 1.0f) : 1.0f;
            g.p pVar8 = m0Var.f33971p;
            f10 = e12;
            e11 = pVar8 != null ? pVar8.e(this, 1.0f) : 0.0f;
            f11 = e13;
        }
        float f14 = e10;
        S0();
        this.f34028d = M(m0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f33845a, bVar.b);
            matrix.preScale(bVar.f33846c, bVar.f33847d);
        }
        Matrix matrix2 = m0Var.f33954j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m0Var.f33952h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f34028d.b = false;
                return;
            } else {
                this.f34028d.f34059c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<g.n0> it = m0Var.f33952h.iterator();
        float f15 = -1.0f;
        while (it.hasNext()) {
            g.d0 d0Var = (g.d0) it.next();
            Float f16 = d0Var.f33862h;
            float floatValue = f16 != null ? f16.floatValue() : 0.0f;
            if (i10 == 0 || floatValue >= f15) {
                fArr[i10] = floatValue;
                f15 = floatValue;
            } else {
                fArr[i10] = f15;
            }
            S0();
            W0(this.f34028d, d0Var);
            g.e0 e0Var = this.f34028d.f34058a;
            g.f fVar = (g.f) e0Var.C;
            if (fVar == null) {
                fVar = g.f.b;
            }
            iArr[i10] = x(fVar.f33930a, e0Var.D.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f11 && f14 == e11) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.k kVar = m0Var.f33955k;
        if (kVar != null) {
            if (kVar == g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f14, f11, e11, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f34028d.f34058a.f33875d.floatValue()));
    }

    public final void X0() {
        int i10;
        g.e0 e0Var = this.f34028d.f34058a;
        g.o0 o0Var = e0Var.J;
        if (o0Var instanceof g.f) {
            i10 = ((g.f) o0Var).f33930a;
        } else if (!(o0Var instanceof g.C0634g)) {
            return;
        } else {
            i10 = e0Var.f33885n.f33930a;
        }
        Float f10 = e0Var.K;
        if (f10 != null) {
            i10 = x(i10, f10.floatValue());
        }
        this.f34026a.drawColor(i10);
    }

    public final Path Y(g.d dVar) {
        g.p pVar = dVar.f33859o;
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        g.p pVar2 = dVar.f33860p;
        float h10 = pVar2 != null ? pVar2.h(this) : 0.0f;
        float c10 = dVar.f33861q.c(this);
        float f11 = f10 - c10;
        float f12 = h10 - c10;
        float f13 = f10 + c10;
        float f14 = h10 + c10;
        if (dVar.f33960h == null) {
            float f15 = 2.0f * c10;
            dVar.f33960h = new g.b(f11, f12, f15, f15);
        }
        float f16 = c10 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f12);
        float f17 = f10 + f16;
        float f18 = h10 - f16;
        path.cubicTo(f17, f12, f13, f18, f13, h10);
        float f19 = h10 + f16;
        path.cubicTo(f13, f19, f17, f14, f10, f14);
        float f20 = f10 - f16;
        path.cubicTo(f20, f14, f11, f19, f11, h10);
        path.cubicTo(f11, f18, f20, f12, f10, f12);
        path.close();
        return path;
    }

    public final boolean Y0() {
        Boolean bool = this.f34028d.f34058a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path Z(g.i iVar) {
        g.p pVar = iVar.f33943o;
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        g.p pVar2 = iVar.f33944p;
        float h10 = pVar2 != null ? pVar2.h(this) : 0.0f;
        float f11 = iVar.f33945q.f(this);
        float h11 = iVar.f33946r.h(this);
        float f12 = f10 - f11;
        float f13 = h10 - h11;
        float f14 = f10 + f11;
        float f15 = h10 + h11;
        if (iVar.f33960h == null) {
            iVar.f33960h = new g.b(f12, f13, f11 * 2.0f, 2.0f * h11);
        }
        float f16 = f11 * 0.5522848f;
        float f17 = h11 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f13);
        float f18 = f10 + f16;
        float f19 = h10 - f17;
        path.cubicTo(f18, f13, f14, f19, f14, h10);
        float f20 = h10 + f17;
        path.cubicTo(f14, f20, f18, f15, f10, f15);
        float f21 = f10 - f16;
        path.cubicTo(f21, f15, f12, f20, f12, h10);
        path.cubicTo(f12, f19, f21, f13, f10, f13);
        path.close();
        return path;
    }

    public final Path a0(g.q qVar) {
        g.p pVar = qVar.f33981o;
        float f10 = pVar == null ? 0.0f : pVar.f(this);
        g.p pVar2 = qVar.f33982p;
        float h10 = pVar2 == null ? 0.0f : pVar2.h(this);
        g.p pVar3 = qVar.f33983q;
        float f11 = pVar3 == null ? 0.0f : pVar3.f(this);
        g.p pVar4 = qVar.f33984r;
        float h11 = pVar4 != null ? pVar4.h(this) : 0.0f;
        if (qVar.f33960h == null) {
            qVar.f33960h = new g.b(Math.min(f10, f11), Math.min(h10, h11), Math.abs(f11 - f10), Math.abs(h11 - h10));
        }
        Path path = new Path();
        path.moveTo(f10, h10);
        path.lineTo(f11, h11);
        return path;
    }

    public final Path b0(g.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f34021o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = zVar.f34021o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (zVar instanceof g.a0) {
            path.close();
        }
        if (zVar.f33960h == null) {
            zVar.f33960h = m(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Path c0(w7.g.b0 r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h.c0(w7.g$b0):android.graphics.Path");
    }

    public final Path d0(g.w0 w0Var) {
        List<g.p> list = w0Var.f33841o;
        float f10 = 0.0f;
        float f11 = (list == null || list.size() == 0) ? 0.0f : w0Var.f33841o.get(0).f(this);
        List<g.p> list2 = w0Var.f33842p;
        float h10 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f33842p.get(0).h(this);
        List<g.p> list3 = w0Var.f33843q;
        float f12 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f33843q.get(0).f(this);
        List<g.p> list4 = w0Var.f33844r;
        if (list4 != null && list4.size() != 0) {
            f10 = w0Var.f33844r.get(0).h(this);
        }
        if (this.f34028d.f34058a.f33892u != g.e0.f.Start) {
            float n10 = n(w0Var);
            if (this.f34028d.f34058a.f33892u == g.e0.f.Middle) {
                n10 /= 2.0f;
            }
            f11 -= n10;
        }
        if (w0Var.f33960h == null) {
            i iVar = new i(f11, h10);
            E(w0Var, iVar);
            RectF rectF = iVar.f34067d;
            w0Var.f33960h = new g.b(rectF.left, rectF.top, rectF.width(), iVar.f34067d.height());
        }
        Path path = new Path();
        E(w0Var, new g(f11 + f12, h10 + f10, path));
        return path;
    }

    public final void e0(boolean z10, g.b bVar, g.q0 q0Var) {
        float f10;
        float e10;
        float f11;
        String str = q0Var.f33956l;
        if (str != null) {
            H(q0Var, str);
        }
        Boolean bool = q0Var.f33953i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0635h c0635h = this.f34028d;
        Paint paint = z10 ? c0635h.f34060d : c0635h.f34061e;
        if (z11) {
            g.p pVar = new g.p(50.0f, g.d1.percent);
            g.p pVar2 = q0Var.f33985m;
            float f12 = pVar2 != null ? pVar2.f(this) : pVar.f(this);
            g.p pVar3 = q0Var.f33986n;
            float h10 = pVar3 != null ? pVar3.h(this) : pVar.h(this);
            g.p pVar4 = q0Var.f33987o;
            e10 = pVar4 != null ? pVar4.c(this) : pVar.c(this);
            f10 = f12;
            f11 = h10;
        } else {
            g.p pVar5 = q0Var.f33985m;
            float e11 = pVar5 != null ? pVar5.e(this, 1.0f) : 0.5f;
            g.p pVar6 = q0Var.f33986n;
            float e12 = pVar6 != null ? pVar6.e(this, 1.0f) : 0.5f;
            g.p pVar7 = q0Var.f33987o;
            f10 = e11;
            e10 = pVar7 != null ? pVar7.e(this, 1.0f) : 0.5f;
            f11 = e12;
        }
        S0();
        this.f34028d = M(q0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f33845a, bVar.b);
            matrix.preScale(bVar.f33846c, bVar.f33847d);
        }
        Matrix matrix2 = q0Var.f33954j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q0Var.f33952h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f34028d.b = false;
                return;
            } else {
                this.f34028d.f34059c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<g.n0> it = q0Var.f33952h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            g.d0 d0Var = (g.d0) it.next();
            Float f14 = d0Var.f33862h;
            float floatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || floatValue >= f13) {
                fArr[i10] = floatValue;
                f13 = floatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f34028d, d0Var);
            g.e0 e0Var = this.f34028d.f34058a;
            g.f fVar = (g.f) e0Var.C;
            if (fVar == null) {
                fVar = g.f.b;
            }
            iArr[i10] = x(fVar.f33930a, e0Var.D.floatValue());
            i10++;
            R0();
        }
        if (e10 == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.k kVar = q0Var.f33955k;
        if (kVar != null) {
            if (kVar == g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, e10, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f34028d.f34058a.f33875d.floatValue()));
    }

    public final g.b f0(g.p pVar, g.p pVar2, g.p pVar3, g.p pVar4) {
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        float h10 = pVar2 != null ? pVar2.h(this) : 0.0f;
        g.b S = S();
        return new g.b(f10, h10, pVar3 != null ? pVar3.f(this) : S.f33846c, pVar4 != null ? pVar4.h(this) : S.f33847d);
    }

    @TargetApi(19)
    public final Path g0(g.k0 k0Var, boolean z10) {
        Path d02;
        Path j10;
        this.f34029e.push(this.f34028d);
        C0635h c0635h = new C0635h(this.f34028d);
        this.f34028d = c0635h;
        W0(c0635h, k0Var);
        if (!A() || !Y0()) {
            this.f34028d = this.f34029e.pop();
            return null;
        }
        if (k0Var instanceof g.e1) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            g.e1 e1Var = (g.e1) k0Var;
            g.n0 p8 = k0Var.f33972a.p(e1Var.f33924p);
            if (p8 == null) {
                F("Use reference '%s' not found", e1Var.f33924p);
                this.f34028d = this.f34029e.pop();
                return null;
            }
            if (!(p8 instanceof g.k0)) {
                this.f34028d = this.f34029e.pop();
                return null;
            }
            d02 = g0((g.k0) p8, false);
            if (d02 == null) {
                return null;
            }
            if (e1Var.f33960h == null) {
                e1Var.f33960h = m(d02);
            }
            Matrix matrix = e1Var.f33967o;
            if (matrix != null) {
                d02.transform(matrix);
            }
        } else if (k0Var instanceof g.l) {
            g.l lVar = (g.l) k0Var;
            if (k0Var instanceof g.v) {
                d02 = new d(((g.v) k0Var).f34006o).f();
                if (k0Var.f33960h == null) {
                    k0Var.f33960h = m(d02);
                }
            } else {
                d02 = k0Var instanceof g.b0 ? c0((g.b0) k0Var) : k0Var instanceof g.d ? Y((g.d) k0Var) : k0Var instanceof g.i ? Z((g.i) k0Var) : k0Var instanceof g.z ? b0((g.z) k0Var) : null;
            }
            if (d02 == null) {
                return null;
            }
            if (lVar.f33960h == null) {
                lVar.f33960h = m(d02);
            }
            Matrix matrix2 = lVar.f33961n;
            if (matrix2 != null) {
                d02.transform(matrix2);
            }
            d02.setFillType(P());
        } else {
            if (!(k0Var instanceof g.w0)) {
                F("Invalid %s element found in clipPath definition", k0Var.n());
                return null;
            }
            g.w0 w0Var = (g.w0) k0Var;
            d02 = d0(w0Var);
            if (d02 == null) {
                return null;
            }
            Matrix matrix3 = w0Var.f34012s;
            if (matrix3 != null) {
                d02.transform(matrix3);
            }
            d02.setFillType(P());
        }
        if (this.f34028d.f34058a.E != null && (j10 = j(k0Var, k0Var.f33960h)) != null) {
            d02.op(j10, Path.Op.INTERSECT);
        }
        this.f34028d = this.f34029e.pop();
        return d02;
    }

    public final void h0() {
        this.f34030f.pop();
        this.f34031g.pop();
    }

    public final void i0(g.j0 j0Var) {
        this.f34030f.push(j0Var);
        this.f34031g.push(this.f34026a.getMatrix());
    }

    @TargetApi(19)
    public final Path j(g.k0 k0Var, g.b bVar) {
        Path g02;
        g.n0 p8 = k0Var.f33972a.p(this.f34028d.f34058a.E);
        if (p8 == null) {
            F("ClipPath reference '%s' not found", this.f34028d.f34058a.E);
            return null;
        }
        g.e eVar = (g.e) p8;
        this.f34029e.push(this.f34028d);
        this.f34028d = M(eVar);
        Boolean bool = eVar.f33872p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(bVar.f33845a, bVar.b);
            matrix.preScale(bVar.f33846c, bVar.f33847d);
        }
        Matrix matrix2 = eVar.f33967o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (g.n0 n0Var : eVar.f33937i) {
            if ((n0Var instanceof g.k0) && (g02 = g0((g.k0) n0Var, true)) != null) {
                path.op(g02, Path.Op.UNION);
            }
        }
        if (this.f34028d.f34058a.E != null) {
            if (eVar.f33960h == null) {
                eVar.f33960h = m(path);
            }
            Path j10 = j(eVar, eVar.f33960h);
            if (j10 != null) {
                path.op(j10, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f34028d = this.f34029e.pop();
        return path;
    }

    public final void j0(g.k0 k0Var) {
        k0(k0Var, k0Var.f33960h);
    }

    public final List<c> k(g.q qVar) {
        g.p pVar = qVar.f33981o;
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        g.p pVar2 = qVar.f33982p;
        float h10 = pVar2 != null ? pVar2.h(this) : 0.0f;
        g.p pVar3 = qVar.f33983q;
        float f11 = pVar3 != null ? pVar3.f(this) : 0.0f;
        g.p pVar4 = qVar.f33984r;
        float h11 = pVar4 != null ? pVar4.h(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f12 = f11 - f10;
        float f13 = h11 - h10;
        arrayList.add(new c(f10, h10, f12, f13));
        arrayList.add(new c(f11, h11, f12, f13));
        return arrayList;
    }

    public final void k0(g.k0 k0Var, g.b bVar) {
        if (this.f34028d.f34058a.G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f34026a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f34026a.saveLayer(null, paint2, 31);
            g.s sVar = (g.s) this.f34027c.p(this.f34028d.f34058a.G);
            J0(sVar, k0Var, bVar);
            this.f34026a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f34026a.saveLayer(null, paint3, 31);
            J0(sVar, k0Var, bVar);
            this.f34026a.restore();
            this.f34026a.restore();
        }
        R0();
    }

    public final List<c> l(g.z zVar) {
        int length = zVar.f34021o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = zVar.f34021o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = zVar.f34021o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f34043a, f13 - cVar.b);
            f10 = f12;
            f11 = f13;
        }
        if (!(zVar instanceof g.a0)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = zVar.f34021o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f34043a, f15 - cVar.b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    public final void l0(g.n0 n0Var, j jVar) {
        float f10;
        float f11;
        float f12;
        g.e0.f O;
        if (jVar.a((g.y0) n0Var)) {
            if (n0Var instanceof g.z0) {
                S0();
                L0((g.z0) n0Var);
                R0();
                return;
            }
            if (!(n0Var instanceof g.v0)) {
                if (n0Var instanceof g.u0) {
                    S0();
                    g.u0 u0Var = (g.u0) n0Var;
                    W0(this.f34028d, u0Var);
                    if (A()) {
                        r((g.k0) u0Var.e());
                        g.n0 p8 = n0Var.f33972a.p(u0Var.f34004o);
                        if (p8 == null || !(p8 instanceof g.y0)) {
                            F("Tref reference '%s' not found", u0Var.f34004o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            G((g.y0) p8, sb2);
                            if (sb2.length() > 0) {
                                jVar.b(sb2.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            g.v0 v0Var = (g.v0) n0Var;
            W0(this.f34028d, v0Var);
            if (A()) {
                List<g.p> list = v0Var.f33841o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float f13 = 0.0f;
                if (z11) {
                    float f14 = !z10 ? ((f) jVar).b : v0Var.f33841o.get(0).f(this);
                    List<g.p> list2 = v0Var.f33842p;
                    f11 = (list2 == null || list2.size() == 0) ? ((f) jVar).f34053c : v0Var.f33842p.get(0).h(this);
                    List<g.p> list3 = v0Var.f33843q;
                    f12 = (list3 == null || list3.size() == 0) ? 0.0f : v0Var.f33843q.get(0).f(this);
                    List<g.p> list4 = v0Var.f33844r;
                    if (list4 != null && list4.size() != 0) {
                        f13 = v0Var.f33844r.get(0).h(this);
                    }
                    f10 = f13;
                    f13 = f14;
                } else {
                    f10 = 0.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                }
                if (z10 && (O = O()) != g.e0.f.Start) {
                    float n10 = n(v0Var);
                    if (O == g.e0.f.Middle) {
                        n10 /= 2.0f;
                    }
                    f13 -= n10;
                }
                r((g.k0) v0Var.e());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.b = f13 + f12;
                    fVar.f34053c = f11 + f10;
                }
                boolean m02 = m0();
                E(v0Var, jVar);
                if (m02) {
                    j0(v0Var);
                }
            }
            R0();
        }
    }

    public final g.b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new g.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final boolean m0() {
        g.n0 p8;
        if (!M0()) {
            return false;
        }
        this.f34026a.saveLayerAlpha(null, w(this.f34028d.f34058a.f33884m.floatValue()), 31);
        this.f34029e.push(this.f34028d);
        C0635h c0635h = new C0635h(this.f34028d);
        this.f34028d = c0635h;
        String str = c0635h.f34058a.G;
        if (str != null && ((p8 = this.f34027c.p(str)) == null || !(p8 instanceof g.s))) {
            F("Mask reference '%s' not found", this.f34028d.f34058a.G);
            this.f34028d.f34058a.G = null;
        }
        return true;
    }

    public final float n(g.y0 y0Var) {
        k kVar = new k(this, null);
        E(y0Var, kVar);
        return kVar.b;
    }

    public final c n0(c cVar, c cVar2, c cVar3) {
        float D = D(cVar2.f34044c, cVar2.f34045d, cVar2.f34043a - cVar.f34043a, cVar2.b - cVar.b);
        if (D == 0.0f) {
            D = D(cVar2.f34044c, cVar2.f34045d, cVar3.f34043a - cVar2.f34043a, cVar3.b - cVar2.b);
        }
        if (D > 0.0f || (D == 0.0f && (cVar2.f34044c > 0.0f || cVar2.f34045d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f34044c = -cVar2.f34044c;
        cVar2.f34045d = -cVar2.f34045d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix o(w7.g.b r10, w7.g.b r11, w7.e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            w7.e$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f33846c
            float r2 = r11.f33846c
            float r1 = r1 / r2
            float r2 = r10.f33847d
            float r3 = r11.f33847d
            float r2 = r2 / r3
            float r3 = r11.f33845a
            float r3 = -r3
            float r4 = r11.b
            float r4 = -r4
            w7.e r5 = w7.e.f33808d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f33845a
            float r10 = r10.b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            w7.e$b r5 = r12.b()
            w7.e$b r6 = w7.e.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f33846c
            float r2 = r2 / r1
            float r5 = r10.f33847d
            float r5 = r5 / r1
            int[] r6 = w7.h.a.f34033a
            w7.e$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f33846c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f33846c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            w7.e$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f33847d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f33847d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f33845a
            float r10 = r10.b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h.o(w7.g$b, w7.g$b, w7.e):android.graphics.Matrix");
    }

    public final void o0(g.d dVar) {
        y("Circle render", new Object[0]);
        g.p pVar = dVar.f33861q;
        if (pVar == null || pVar.j()) {
            return;
        }
        W0(this.f34028d, dVar);
        if (A() && Y0()) {
            Matrix matrix = dVar.f33961n;
            if (matrix != null) {
                this.f34026a.concat(matrix);
            }
            Path Y = Y(dVar);
            U0(dVar);
            r(dVar);
            p(dVar);
            boolean m02 = m0();
            if (this.f34028d.b) {
                B(dVar, Y);
            }
            if (this.f34028d.f34059c) {
                C(Y);
            }
            if (m02) {
                j0(dVar);
            }
        }
    }

    public final void p(g.k0 k0Var) {
        q(k0Var, k0Var.f33960h);
    }

    public final void p0(g.i iVar) {
        y("Ellipse render", new Object[0]);
        g.p pVar = iVar.f33945q;
        if (pVar == null || iVar.f33946r == null || pVar.j() || iVar.f33946r.j()) {
            return;
        }
        W0(this.f34028d, iVar);
        if (A() && Y0()) {
            Matrix matrix = iVar.f33961n;
            if (matrix != null) {
                this.f34026a.concat(matrix);
            }
            Path Z = Z(iVar);
            U0(iVar);
            r(iVar);
            p(iVar);
            boolean m02 = m0();
            if (this.f34028d.b) {
                B(iVar, Z);
            }
            if (this.f34028d.f34059c) {
                C(Z);
            }
            if (m02) {
                j0(iVar);
            }
        }
    }

    public final void q(g.k0 k0Var, g.b bVar) {
        Path j10;
        if (this.f34028d.f34058a.E == null || (j10 = j(k0Var, bVar)) == null) {
            return;
        }
        this.f34026a.clipPath(j10);
    }

    public final void q0(g.m mVar) {
        y("Group render", new Object[0]);
        W0(this.f34028d, mVar);
        if (A()) {
            Matrix matrix = mVar.f33967o;
            if (matrix != null) {
                this.f34026a.concat(matrix);
            }
            p(mVar);
            boolean m02 = m0();
            F0(mVar, true);
            if (m02) {
                j0(mVar);
            }
            U0(mVar);
        }
    }

    public final void r(g.k0 k0Var) {
        g.o0 o0Var = this.f34028d.f34058a.b;
        if (o0Var instanceof g.u) {
            z(true, k0Var.f33960h, (g.u) o0Var);
        }
        g.o0 o0Var2 = this.f34028d.f34058a.f33876e;
        if (o0Var2 instanceof g.u) {
            z(false, k0Var.f33960h, (g.u) o0Var2);
        }
    }

    public final void r0(g.o oVar) {
        g.p pVar;
        String str;
        y("Image render", new Object[0]);
        g.p pVar2 = oVar.f33976s;
        if (pVar2 == null || pVar2.j() || (pVar = oVar.f33977t) == null || pVar.j() || (str = oVar.f33973p) == null) {
            return;
        }
        w7.e eVar = oVar.f33980o;
        if (eVar == null) {
            eVar = w7.e.f33809e;
        }
        Bitmap s8 = s(str);
        if (s8 == null) {
            w7.g.k();
            return;
        }
        g.b bVar = new g.b(0.0f, 0.0f, s8.getWidth(), s8.getHeight());
        W0(this.f34028d, oVar);
        if (A() && Y0()) {
            Matrix matrix = oVar.f33978u;
            if (matrix != null) {
                this.f34026a.concat(matrix);
            }
            g.p pVar3 = oVar.f33974q;
            float f10 = pVar3 != null ? pVar3.f(this) : 0.0f;
            g.p pVar4 = oVar.f33975r;
            this.f34028d.f34062f = new g.b(f10, pVar4 != null ? pVar4.h(this) : 0.0f, oVar.f33976s.f(this), oVar.f33977t.f(this));
            if (!this.f34028d.f34058a.f33893v.booleanValue()) {
                g.b bVar2 = this.f34028d.f34062f;
                O0(bVar2.f33845a, bVar2.b, bVar2.f33846c, bVar2.f33847d);
            }
            oVar.f33960h = this.f34028d.f34062f;
            U0(oVar);
            p(oVar);
            boolean m02 = m0();
            X0();
            this.f34026a.save();
            this.f34026a.concat(o(this.f34028d.f34062f, bVar, eVar));
            this.f34026a.drawBitmap(s8, 0.0f, 0.0f, new Paint(this.f34028d.f34058a.M != g.e0.e.optimizeSpeed ? 2 : 0));
            this.f34026a.restore();
            if (m02) {
                j0(oVar);
            }
        }
    }

    public final Bitmap s(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    public final void s0(g.q qVar) {
        y("Line render", new Object[0]);
        W0(this.f34028d, qVar);
        if (A() && Y0() && this.f34028d.f34059c) {
            Matrix matrix = qVar.f33961n;
            if (matrix != null) {
                this.f34026a.concat(matrix);
            }
            Path a02 = a0(qVar);
            U0(qVar);
            r(qVar);
            p(qVar);
            boolean m02 = m0();
            C(a02);
            I0(qVar);
            if (m02) {
                j0(qVar);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r6.equals("sans-serif") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface t(java.lang.String r6, java.lang.Integer r7, w7.g.e0.b r8) {
        /*
            r5 = this;
            w7.g$e0$b r0 = w7.g.e0.b.Italic
            r1 = 0
            r2 = 1
            if (r8 != r0) goto L8
            r8 = r2
            goto L9
        L8:
            r8 = r1
        L9:
            int r7 = r7.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 2
            r4 = 3
            if (r7 <= r0) goto L19
            if (r8 == 0) goto L17
            r7 = r4
            goto L1e
        L17:
            r7 = r2
            goto L1e
        L19:
            if (r8 == 0) goto L1d
            r7 = r3
            goto L1e
        L1d:
            r7 = r1
        L1e:
            r6.getClass()
            int r8 = r6.hashCode()
            r0 = -1
            switch(r8) {
                case -1536685117: goto L57;
                case -1431958525: goto L4c;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r1 = r0
            goto L60
        L2b:
            java.lang.String r8 = "cursive"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L34
            goto L29
        L34:
            r1 = 4
            goto L60
        L36:
            java.lang.String r8 = "serif"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L3f
            goto L29
        L3f:
            r1 = r4
            goto L60
        L41:
            java.lang.String r8 = "fantasy"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L4a
            goto L29
        L4a:
            r1 = r3
            goto L60
        L4c:
            java.lang.String r8 = "monospace"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L55
            goto L29
        L55:
            r1 = r2
            goto L60
        L57:
            java.lang.String r8 = "sans-serif"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L60
            goto L29
        L60:
            switch(r1) {
                case 0: goto L81;
                case 1: goto L7a;
                case 2: goto L73;
                case 3: goto L6c;
                case 4: goto L65;
                default: goto L63;
            }
        L63:
            r6 = 0
            return r6
        L65:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L6c:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L73:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L7a:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L81:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h.t(java.lang.String, java.lang.Integer, w7.g$e0$b):android.graphics.Typeface");
    }

    public final void t0(g.v vVar) {
        y("Path render", new Object[0]);
        if (vVar.f34006o == null) {
            return;
        }
        W0(this.f34028d, vVar);
        if (A() && Y0()) {
            C0635h c0635h = this.f34028d;
            if (c0635h.f34059c || c0635h.b) {
                Matrix matrix = vVar.f33961n;
                if (matrix != null) {
                    this.f34026a.concat(matrix);
                }
                Path f10 = new d(vVar.f34006o).f();
                if (vVar.f33960h == null) {
                    vVar.f33960h = m(f10);
                }
                U0(vVar);
                r(vVar);
                p(vVar);
                boolean m02 = m0();
                if (this.f34028d.b) {
                    f10.setFillType(U());
                    B(vVar, f10);
                }
                if (this.f34028d.f34059c) {
                    C(f10);
                }
                I0(vVar);
                if (m02) {
                    j0(vVar);
                }
            }
        }
    }

    public final void u(g.n0 n0Var) {
        Boolean bool;
        if ((n0Var instanceof g.l0) && (bool = ((g.l0) n0Var).f33963d) != null) {
            this.f34028d.f34064h = bool.booleanValue();
        }
    }

    public final void u0(g.z zVar) {
        y("PolyLine render", new Object[0]);
        W0(this.f34028d, zVar);
        if (A() && Y0()) {
            C0635h c0635h = this.f34028d;
            if (c0635h.f34059c || c0635h.b) {
                Matrix matrix = zVar.f33961n;
                if (matrix != null) {
                    this.f34026a.concat(matrix);
                }
                if (zVar.f34021o.length < 2) {
                    return;
                }
                Path b02 = b0(zVar);
                U0(zVar);
                b02.setFillType(U());
                r(zVar);
                p(zVar);
                boolean m02 = m0();
                if (this.f34028d.b) {
                    B(zVar, b02);
                }
                if (this.f34028d.f34059c) {
                    C(b02);
                }
                I0(zVar);
                if (m02) {
                    j0(zVar);
                }
            }
        }
    }

    public final void v0(g.a0 a0Var) {
        y("Polygon render", new Object[0]);
        W0(this.f34028d, a0Var);
        if (A() && Y0()) {
            C0635h c0635h = this.f34028d;
            if (c0635h.f34059c || c0635h.b) {
                Matrix matrix = a0Var.f33961n;
                if (matrix != null) {
                    this.f34026a.concat(matrix);
                }
                if (a0Var.f34021o.length < 2) {
                    return;
                }
                Path b02 = b0(a0Var);
                U0(a0Var);
                r(a0Var);
                p(a0Var);
                boolean m02 = m0();
                if (this.f34028d.b) {
                    B(a0Var, b02);
                }
                if (this.f34028d.f34059c) {
                    C(b02);
                }
                I0(a0Var);
                if (m02) {
                    j0(a0Var);
                }
            }
        }
    }

    public final void w0(g.b0 b0Var) {
        y("Rect render", new Object[0]);
        g.p pVar = b0Var.f33850q;
        if (pVar == null || b0Var.f33851r == null || pVar.j() || b0Var.f33851r.j()) {
            return;
        }
        W0(this.f34028d, b0Var);
        if (A() && Y0()) {
            Matrix matrix = b0Var.f33961n;
            if (matrix != null) {
                this.f34026a.concat(matrix);
            }
            Path c02 = c0(b0Var);
            U0(b0Var);
            r(b0Var);
            p(b0Var);
            boolean m02 = m0();
            if (this.f34028d.b) {
                B(b0Var, c02);
            }
            if (this.f34028d.f34059c) {
                C(c02);
            }
            if (m02) {
                j0(b0Var);
            }
        }
    }

    public final void x0(g.f0 f0Var) {
        z0(f0Var, f0(f0Var.f33931q, f0Var.f33932r, f0Var.f33933s, f0Var.f33934t), f0Var.f33996p, f0Var.f33980o);
    }

    public final void y0(g.f0 f0Var, g.b bVar) {
        z0(f0Var, bVar, f0Var.f33996p, f0Var.f33980o);
    }

    public final void z(boolean z10, g.b bVar, g.u uVar) {
        g.n0 p8 = this.f34027c.p(uVar.f34003a);
        if (p8 == null) {
            F("%s reference '%s' not found", z10 ? "Fill" : "Stroke", uVar.f34003a);
            g.o0 o0Var = uVar.b;
            if (o0Var != null) {
                P0(this.f34028d, z10, o0Var);
                return;
            } else if (z10) {
                this.f34028d.b = false;
                return;
            } else {
                this.f34028d.f34059c = false;
                return;
            }
        }
        if (p8 instanceof g.m0) {
            X(z10, bVar, (g.m0) p8);
        } else if (p8 instanceof g.q0) {
            e0(z10, bVar, (g.q0) p8);
        } else if (p8 instanceof g.c0) {
            Q0(z10, (g.c0) p8);
        }
    }

    public final void z0(g.f0 f0Var, g.b bVar, g.b bVar2, w7.e eVar) {
        y("Svg render", new Object[0]);
        if (bVar.f33846c == 0.0f || bVar.f33847d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f0Var.f33980o) == null) {
            eVar = w7.e.f33809e;
        }
        W0(this.f34028d, f0Var);
        if (A()) {
            C0635h c0635h = this.f34028d;
            c0635h.f34062f = bVar;
            if (!c0635h.f34058a.f33893v.booleanValue()) {
                g.b bVar3 = this.f34028d.f34062f;
                O0(bVar3.f33845a, bVar3.b, bVar3.f33846c, bVar3.f33847d);
            }
            q(f0Var, this.f34028d.f34062f);
            if (bVar2 != null) {
                this.f34026a.concat(o(this.f34028d.f34062f, bVar2, eVar));
                this.f34028d.f34063g = f0Var.f33996p;
            } else {
                Canvas canvas = this.f34026a;
                g.b bVar4 = this.f34028d.f34062f;
                canvas.translate(bVar4.f33845a, bVar4.b);
            }
            boolean m02 = m0();
            X0();
            F0(f0Var, true);
            if (m02) {
                j0(f0Var);
            }
            U0(f0Var);
        }
    }

    public class k extends j {
        public float b;

        public k() {
            super(h.this, null);
            this.b = 0.0f;
        }

        @Override // w7.h.j
        public void b(String str) {
            this.b += h.this.f34028d.f34060d.measureText(str);
        }

        public /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* renamed from: w7.h$h, reason: collision with other inner class name */
    public class C0635h {

        /* renamed from: a, reason: collision with root package name */
        public g.e0 f34058a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f34059c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f34060d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f34061e;

        /* renamed from: f, reason: collision with root package name */
        public g.b f34062f;

        /* renamed from: g, reason: collision with root package name */
        public g.b f34063g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f34064h;

        public C0635h() {
            Paint paint = new Paint();
            this.f34060d = paint;
            paint.setFlags(193);
            this.f34060d.setHinting(0);
            this.f34060d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f34060d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f34061e = paint3;
            paint3.setFlags(193);
            this.f34061e.setHinting(0);
            this.f34061e.setStyle(Paint.Style.STROKE);
            this.f34061e.setTypeface(typeface);
            this.f34058a = g.e0.a();
        }

        public C0635h(C0635h c0635h) {
            this.b = c0635h.b;
            this.f34059c = c0635h.f34059c;
            this.f34060d = new Paint(c0635h.f34060d);
            this.f34061e = new Paint(c0635h.f34061e);
            g.b bVar = c0635h.f34062f;
            if (bVar != null) {
                this.f34062f = new g.b(bVar);
            }
            g.b bVar2 = c0635h.f34063g;
            if (bVar2 != null) {
                this.f34063g = new g.b(bVar2);
            }
            this.f34064h = c0635h.f34064h;
            try {
                this.f34058a = (g.e0) c0635h.f34058a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f34058a = g.e0.a();
            }
        }
    }
}
