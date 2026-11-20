package ad;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: n, reason: collision with root package name */
    public static final int f375n = 1;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f376a;
    public final TextPaint b;

    /* renamed from: c, reason: collision with root package name */
    public final int f377c;

    /* renamed from: e, reason: collision with root package name */
    public int f379e;

    /* renamed from: l, reason: collision with root package name */
    public boolean f386l;

    /* renamed from: d, reason: collision with root package name */
    public int f378d = 0;

    /* renamed from: f, reason: collision with root package name */
    public Layout.Alignment f380f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    public int f381g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public float f382h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f383i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f384j = f375n;

    /* renamed from: k, reason: collision with root package name */
    public boolean f385k = true;

    /* renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f387m = null;

    public static class a extends Exception {
    }

    public k(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f376a = charSequence;
        this.b = textPaint;
        this.f377c = i10;
        this.f379e = charSequence.length();
    }

    @NonNull
    public static k b(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, int i10) {
        return new k(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f376a == null) {
            this.f376a = "";
        }
        int max = Math.max(0, this.f377c);
        CharSequence charSequence = this.f376a;
        if (this.f381g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, max, this.f387m);
        }
        int min = Math.min(charSequence.length(), this.f379e);
        this.f379e = min;
        if (this.f386l && this.f381g == 1) {
            this.f380f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f378d, min, this.b, max);
        obtain.setAlignment(this.f380f);
        obtain.setIncludePad(this.f385k);
        obtain.setTextDirection(this.f386l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f387m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f381g);
        float f10 = this.f382h;
        if (f10 != 0.0f || this.f383i != 1.0f) {
            obtain.setLineSpacing(f10, this.f383i);
        }
        if (this.f381g > 1) {
            obtain.setHyphenationFrequency(this.f384j);
        }
        return obtain.build();
    }

    @NonNull
    public k c(@NonNull Layout.Alignment alignment) {
        this.f380f = alignment;
        return this;
    }

    @NonNull
    public k d(TextUtils.TruncateAt truncateAt) {
        this.f387m = truncateAt;
        return this;
    }

    @NonNull
    public k e(int i10) {
        this.f384j = i10;
        return this;
    }

    @NonNull
    public k f(boolean z10) {
        this.f385k = z10;
        return this;
    }

    public k g(boolean z10) {
        this.f386l = z10;
        return this;
    }

    @NonNull
    public k h(float f10, float f11) {
        this.f382h = f10;
        this.f383i = f11;
        return this;
    }

    @NonNull
    public k i(int i10) {
        this.f381g = i10;
        return this;
    }

    @NonNull
    public k j(l lVar) {
        return this;
    }
}
