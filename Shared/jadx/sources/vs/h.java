package vs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class h implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    public final ts.c f33550a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f33551c = g.a();

    /* renamed from: d, reason: collision with root package name */
    public int f33552d;

    public h(@NonNull ts.c cVar, @NonNull String str) {
        this.f33550a = cVar;
        this.b = str;
    }

    public static void a(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            h[] hVarArr = (h[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), h.class);
            if (hVarArr != null) {
                TextPaint paint = textView.getPaint();
                for (h hVar : hVarArr) {
                    hVar.f33552d = (int) (paint.measureText(hVar.b) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (z10 && zs.c.b(i15, charSequence, this)) {
            this.f33551c.set(paint);
            this.f33550a.g(this.f33551c);
            int measureText = (int) (this.f33551c.measureText(this.b) + 0.5f);
            int j10 = this.f33550a.j();
            if (measureText > j10) {
                this.f33552d = measureText;
                j10 = measureText;
            } else {
                this.f33552d = 0;
            }
            canvas.drawText(this.b, i11 > 0 ? (i10 + (j10 * i11)) - measureText : i10 + (i11 * j10) + (j10 - measureText), i13, this.f33551c);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return Math.max(this.f33552d, this.f33550a.j());
    }
}
