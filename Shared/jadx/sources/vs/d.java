package vs;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class d extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final ts.c f33544a;

    public d(@NonNull ts.c cVar) {
        this.f33544a = cVar;
    }

    public final void a(TextPaint textPaint) {
        this.f33544a.c(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
        textPaint.bgColor = this.f33544a.m(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
