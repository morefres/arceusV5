package z3;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class e extends ReplacementSpan {

    @NonNull
    public final i b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f37748a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f37749c = -1;

    /* renamed from: d, reason: collision with root package name */
    public short f37750d = -1;

    /* renamed from: e, reason: collision with root package name */
    public float f37751e = 1.0f;

    public e(@NonNull i iVar) {
        x2.g.h(iVar, "rasterizer cannot be null");
        this.b = iVar;
    }

    @NonNull
    public final i a() {
        return this.b;
    }

    public final int b() {
        return this.f37749c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f37748a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f37748a;
        this.f37751e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.b.e();
        this.f37750d = (short) (this.b.e() * this.f37751e);
        short i12 = (short) (this.b.i() * this.f37751e);
        this.f37749c = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f37748a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
