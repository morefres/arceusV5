package ts;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: x, reason: collision with root package name */
    public static final float[] f32473x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* renamed from: a, reason: collision with root package name */
    public final int f32474a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32475c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32476d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32477e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32478f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32479g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32480h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32481i;

    /* renamed from: j, reason: collision with root package name */
    public final int f32482j;

    /* renamed from: k, reason: collision with root package name */
    public final int f32483k;

    /* renamed from: l, reason: collision with root package name */
    public final int f32484l;

    /* renamed from: m, reason: collision with root package name */
    public final int f32485m;

    /* renamed from: n, reason: collision with root package name */
    public final Typeface f32486n;

    /* renamed from: o, reason: collision with root package name */
    public final Typeface f32487o;

    /* renamed from: p, reason: collision with root package name */
    public final int f32488p;

    /* renamed from: q, reason: collision with root package name */
    public final int f32489q;

    /* renamed from: r, reason: collision with root package name */
    public final int f32490r;

    /* renamed from: s, reason: collision with root package name */
    public final int f32491s;

    /* renamed from: t, reason: collision with root package name */
    public final Typeface f32492t;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f32493u;

    /* renamed from: v, reason: collision with root package name */
    public final int f32494v;

    /* renamed from: w, reason: collision with root package name */
    public final int f32495w;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f32496a;

        /* renamed from: c, reason: collision with root package name */
        public int f32497c;

        /* renamed from: d, reason: collision with root package name */
        public int f32498d;

        /* renamed from: e, reason: collision with root package name */
        public int f32499e;

        /* renamed from: f, reason: collision with root package name */
        public int f32500f;

        /* renamed from: g, reason: collision with root package name */
        public int f32501g;

        /* renamed from: h, reason: collision with root package name */
        public int f32502h;

        /* renamed from: i, reason: collision with root package name */
        public int f32503i;

        /* renamed from: j, reason: collision with root package name */
        public int f32504j;

        /* renamed from: k, reason: collision with root package name */
        public int f32505k;

        /* renamed from: l, reason: collision with root package name */
        public int f32506l;

        /* renamed from: m, reason: collision with root package name */
        public int f32507m;

        /* renamed from: n, reason: collision with root package name */
        public Typeface f32508n;

        /* renamed from: o, reason: collision with root package name */
        public Typeface f32509o;

        /* renamed from: p, reason: collision with root package name */
        public int f32510p;

        /* renamed from: q, reason: collision with root package name */
        public int f32511q;

        /* renamed from: s, reason: collision with root package name */
        public int f32513s;

        /* renamed from: t, reason: collision with root package name */
        public Typeface f32514t;

        /* renamed from: u, reason: collision with root package name */
        public float[] f32515u;

        /* renamed from: v, reason: collision with root package name */
        public int f32516v;
        public boolean b = true;

        /* renamed from: r, reason: collision with root package name */
        public int f32512r = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f32517w = -1;

        @NonNull
        public a A(int i10) {
            this.f32501g = i10;
            return this;
        }

        @NonNull
        public a B(int i10) {
            this.f32507m = i10;
            return this;
        }

        @NonNull
        public a C(int i10) {
            this.f32512r = i10;
            return this;
        }

        @NonNull
        public a D(int i10) {
            this.f32517w = i10;
            return this;
        }

        @NonNull
        public a x(int i10) {
            this.f32497c = i10;
            return this;
        }

        @NonNull
        public a y(int i10) {
            this.f32498d = i10;
            return this;
        }

        @NonNull
        public c z() {
            return new c(this);
        }
    }

    public c(@NonNull a aVar) {
        this.f32474a = aVar.f32496a;
        this.b = aVar.b;
        this.f32475c = aVar.f32497c;
        this.f32476d = aVar.f32498d;
        this.f32477e = aVar.f32499e;
        this.f32478f = aVar.f32500f;
        this.f32479g = aVar.f32501g;
        this.f32480h = aVar.f32502h;
        this.f32481i = aVar.f32503i;
        this.f32482j = aVar.f32504j;
        this.f32483k = aVar.f32505k;
        this.f32484l = aVar.f32506l;
        this.f32485m = aVar.f32507m;
        this.f32486n = aVar.f32508n;
        this.f32487o = aVar.f32509o;
        this.f32488p = aVar.f32510p;
        this.f32489q = aVar.f32511q;
        this.f32490r = aVar.f32512r;
        this.f32491s = aVar.f32513s;
        this.f32492t = aVar.f32514t;
        this.f32493u = aVar.f32515u;
        this.f32494v = aVar.f32516v;
        this.f32495w = aVar.f32517w;
    }

    @NonNull
    public static a i(@NonNull Context context) {
        zs.b a10 = zs.b.a(context);
        return new a().B(a10.b(8)).x(a10.b(24)).y(a10.b(4)).A(a10.b(1)).C(a10.b(1)).D(a10.b(4));
    }

    public void a(@NonNull Paint paint) {
        int i10 = this.f32477e;
        if (i10 == 0) {
            i10 = zs.a.a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
    }

    public void b(@NonNull Paint paint) {
        int i10 = this.f32482j;
        if (i10 == 0) {
            i10 = this.f32481i;
        }
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f32487o;
        if (typeface == null) {
            typeface = this.f32486n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f32489q;
            if (i11 <= 0) {
                i11 = this.f32488p;
            }
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f32489q;
        if (i12 <= 0) {
            i12 = this.f32488p;
        }
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void c(@NonNull Paint paint) {
        int i10 = this.f32481i;
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f32486n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f32488p;
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f32488p;
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void d(@NonNull Paint paint) {
        int i10 = this.f32491s;
        if (i10 == 0) {
            i10 = zs.a.a(paint.getColor(), 75);
        }
        paint.setColor(i10);
        paint.setStyle(Paint.Style.FILL);
        int i11 = this.f32490r;
        if (i11 >= 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public void e(@NonNull Paint paint, int i10) {
        Typeface typeface = this.f32492t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.f32493u;
        if (fArr == null) {
            fArr = f32473x;
        }
        if (fArr == null || fArr.length < i10) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i10), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i10 - 1]);
    }

    public void f(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.b);
        int i10 = this.f32474a;
        if (i10 != 0) {
            textPaint.setColor(i10);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void g(@NonNull Paint paint) {
        int i10 = this.f32478f;
        if (i10 == 0) {
            i10 = paint.getColor();
        }
        paint.setColor(i10);
        int i11 = this.f32479g;
        if (i11 != 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public void h(@NonNull Paint paint) {
        int i10 = this.f32494v;
        if (i10 == 0) {
            i10 = zs.a.a(paint.getColor(), 25);
        }
        paint.setColor(i10);
        paint.setStyle(Paint.Style.FILL);
        int i11 = this.f32495w;
        if (i11 >= 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public int j() {
        return this.f32475c;
    }

    public int k() {
        int i10 = this.f32476d;
        return i10 == 0 ? (int) ((this.f32475c * 0.25f) + 0.5f) : i10;
    }

    public int l(int i10) {
        int min = Math.min(this.f32475c, i10) / 2;
        int i11 = this.f32480h;
        return (i11 == 0 || i11 > min) ? min : i11;
    }

    public int m(@NonNull Paint paint) {
        int i10 = this.f32483k;
        return i10 != 0 ? i10 : zs.a.a(paint.getColor(), 25);
    }

    public int n(@NonNull Paint paint) {
        int i10 = this.f32484l;
        if (i10 == 0) {
            i10 = this.f32483k;
        }
        return i10 != 0 ? i10 : zs.a.a(paint.getColor(), 25);
    }

    public int o() {
        return this.f32485m;
    }
}
