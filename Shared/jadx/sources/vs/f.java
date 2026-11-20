package vs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    public final ts.c f33545a;
    public final Rect b = g.b();

    /* renamed from: c, reason: collision with root package name */
    public final Paint f33546c = g.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f33547d;

    public f(@NonNull ts.c cVar, int i10) {
        this.f33545a = cVar;
        this.f33547d = i10;
    }

    public final void a(TextPaint textPaint) {
        this.f33545a.e(textPaint, this.f33547d);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        int i18 = this.f33547d;
        if ((i18 == 1 || i18 == 2) && zs.c.a(i16, charSequence, this)) {
            this.f33546c.set(paint);
            this.f33545a.d(this.f33546c);
            float strokeWidth = this.f33546c.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i19 = (int) ((i14 - strokeWidth) + 0.5f);
                if (i11 > 0) {
                    i17 = canvas.getWidth();
                } else {
                    i17 = i10;
                    i10 -= canvas.getWidth();
                }
                this.b.set(i10, i19, i17, i14);
                canvas.drawRect(this.b, this.f33546c);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
