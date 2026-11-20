package w2;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public class e implements Spannable {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f33669d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Spannable f33670a;
    public final a b;

    /* renamed from: c, reason: collision with root package name */
    public final PrecomputedText f33671c;

    public a a() {
        return this.b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f33670a;
        if (b.a(spannable)) {
            return c.a(spannable);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f33670a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f33670a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f33670a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f33670a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f33671c.getSpans(i10, i11, cls) : (T[]) this.f33670a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f33670a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f33670a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f33671c.removeSpan(obj);
        } else {
            this.f33670a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f33671c.setSpan(obj, i10, i11, i12);
        } else {
            this.f33670a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f33670a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f33670a.toString();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f33672a;
        public final TextDirectionHeuristic b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33673c;

        /* renamed from: d, reason: collision with root package name */
        public final int f33674d;

        /* renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f33675e;

        /* renamed from: w2.e$a$a, reason: collision with other inner class name */
        public static class C0629a {

            /* renamed from: a, reason: collision with root package name */
            public final TextPaint f33676a;

            /* renamed from: c, reason: collision with root package name */
            public int f33677c = 1;

            /* renamed from: d, reason: collision with root package name */
            public int f33678d = 1;
            public TextDirectionHeuristic b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0629a(TextPaint textPaint) {
                this.f33676a = textPaint;
            }

            public a a() {
                return new a(this.f33676a, this.b, this.f33677c, this.f33678d);
            }

            public C0629a b(int i10) {
                this.f33677c = i10;
                return this;
            }

            public C0629a c(int i10) {
                this.f33678d = i10;
                return this;
            }

            public C0629a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f33675e = d.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f33675e = null;
            }
            this.f33672a = textPaint;
            this.b = textDirectionHeuristic;
            this.f33673c = i10;
            this.f33674d = i11;
        }

        public boolean a(a aVar) {
            if (this.f33673c == aVar.b() && this.f33674d == aVar.c() && this.f33672a.getTextSize() == aVar.e().getTextSize() && this.f33672a.getTextScaleX() == aVar.e().getTextScaleX() && this.f33672a.getTextSkewX() == aVar.e().getTextSkewX() && this.f33672a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f33672a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f33672a.getFlags() == aVar.e().getFlags() && this.f33672a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f33672a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f33672a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f33673c;
        }

        public int c() {
            return this.f33674d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.f33672a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.b == aVar.d();
        }

        public int hashCode() {
            return x2.b.b(Float.valueOf(this.f33672a.getTextSize()), Float.valueOf(this.f33672a.getTextScaleX()), Float.valueOf(this.f33672a.getTextSkewX()), Float.valueOf(this.f33672a.getLetterSpacing()), Integer.valueOf(this.f33672a.getFlags()), this.f33672a.getTextLocales(), this.f33672a.getTypeface(), Boolean.valueOf(this.f33672a.isElegantTextHeight()), this.b, Integer.valueOf(this.f33673c), Integer.valueOf(this.f33674d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f33672a.getTextSize());
            sb2.append(", textScaleX=" + this.f33672a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f33672a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f33672a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f33672a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f33672a.getTextLocales());
            sb2.append(", typeface=" + this.f33672a.getTypeface());
            sb2.append(", variationSettings=" + this.f33672a.getFontVariationSettings());
            sb2.append(", textDir=" + this.b);
            sb2.append(", breakStrategy=" + this.f33673c);
            sb2.append(", hyphenationFrequency=" + this.f33674d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f33672a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.f33673c = params.getBreakStrategy();
            this.f33674d = params.getHyphenationFrequency();
            this.f33675e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
