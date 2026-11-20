package vs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class b implements LeadingMarginSpan {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f33537f = false;

    /* renamed from: a, reason: collision with root package name */
    public ts.c f33538a;
    public final Paint b = g.a();

    /* renamed from: c, reason: collision with root package name */
    public final RectF f33539c = g.c();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f33540d = g.b();

    /* renamed from: e, reason: collision with root package name */
    public final int f33541e;

    public b(@NonNull ts.c cVar, int i10) {
        this.f33538a = cVar;
        this.f33541e = i10;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        int i18;
        if (z10 && zs.c.b(i15, charSequence, this)) {
            this.b.set(paint);
            this.f33538a.g(this.b);
            int save = canvas.save();
            try {
                int j10 = this.f33538a.j();
                int l10 = this.f33538a.l((int) ((this.b.descent() - this.b.ascent()) + 0.5f));
                int i19 = (j10 - l10) / 2;
                if (f33537f) {
                    int width = i11 < 0 ? i10 - (layout.getWidth() - (j10 * this.f33541e)) : (j10 * this.f33541e) - i10;
                    int i20 = i10 + (i19 * i11);
                    int i21 = (i11 * l10) + i20;
                    int i22 = i11 * width;
                    i17 = Math.min(i20, i21) + i22;
                    i18 = Math.max(i20, i21) + i22;
                } else {
                    if (i11 <= 0) {
                        i10 -= j10;
                    }
                    i17 = i10 + i19;
                    i18 = i17 + l10;
                }
                int descent = (i13 + ((int) (((this.b.descent() + this.b.ascent()) / 2.0f) + 0.5f))) - (l10 / 2);
                int i23 = l10 + descent;
                int i24 = this.f33541e;
                if (i24 != 0 && i24 != 1) {
                    this.f33540d.set(i17, descent, i18, i23);
                    this.b.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.f33540d, this.b);
                    canvas.restoreToCount(save);
                }
                this.f33539c.set(i17, descent, i18, i23);
                this.b.setStyle(this.f33541e == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                canvas.drawOval(this.f33539c, this.b);
                canvas.restoreToCount(save);
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f33538a.j();
    }
}
