package vs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class k implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    public final ts.c f33554a;
    public final Rect b = g.b();

    /* renamed from: c, reason: collision with root package name */
    public final Paint f33555c = g.a();

    public k(@NonNull ts.c cVar) {
        this.f33554a = cVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        int i18 = i12 + ((i14 - i12) / 2);
        this.f33555c.set(paint);
        this.f33554a.h(this.f33555c);
        int strokeWidth = (int) ((((int) (this.f33555c.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i11 > 0) {
            i17 = canvas.getWidth();
        } else {
            i17 = i10;
            i10 -= canvas.getWidth();
        }
        this.b.set(i10, i18 - strokeWidth, i17, i18 + strokeWidth);
        canvas.drawRect(this.b, this.f33555c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
