package z3;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class j extends e {

    /* renamed from: g, reason: collision with root package name */
    public static Paint f37760g;

    /* renamed from: f, reason: collision with root package name */
    public TextPaint f37761f;

    public j(@NonNull i iVar) {
        super(iVar);
    }

    @NonNull
    public static Paint e() {
        if (f37760g == null) {
            TextPaint textPaint = new TextPaint();
            f37760g = textPaint;
            textPaint.setColor(androidx.emoji2.text.c.c().d());
            f37760g.setStyle(Paint.Style.FILL);
        }
        return f37760g;
    }

    public final TextPaint c(CharSequence charSequence, int i10, int i11, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f37761f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f37761f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    public void d(Canvas canvas, TextPaint textPaint, float f10, float f11, float f12, float f13) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f10, f12, f11, f13, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @NonNull Paint paint) {
        TextPaint c10 = c(charSequence, i10, i11, paint);
        if (c10 != null && c10.bgColor != 0) {
            d(canvas, c10, f10, f10 + b(), i12, i14);
        }
        Paint paint2 = c10;
        if (androidx.emoji2.text.c.c().j()) {
            canvas.drawRect(f10, i12, f10 + b(), i14, e());
        }
        i a10 = a();
        float f11 = i13;
        if (paint2 == null) {
            paint2 = paint;
        }
        a10.a(canvas, f10, f11, paint2);
    }
}
