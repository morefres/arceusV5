package ld;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import ed.b;
import ed.c;
import ic.k;
import q.b0;

/* loaded from: classes2.dex */
public class a extends b0 {
    public a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public static boolean t(Context context) {
        return b.b(context, ic.b.f20396f0, true);
    }

    public static int u(@NonNull Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f20761u4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(k.f20770v4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int w(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    public static boolean x(@NonNull Context context, @NonNull Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f20761u4, i10, i11);
        int w5 = w(context, obtainStyledAttributes, k.f20778w4, k.f20786x4);
        obtainStyledAttributes.recycle();
        return w5 != -1;
    }

    public final void s(@NonNull Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, k.f20725q4);
        int w5 = w(getContext(), obtainStyledAttributes, k.f20743s4, k.f20752t4);
        obtainStyledAttributes.recycle();
        if (w5 >= 0) {
            setLineHeight(w5);
        }
    }

    @Override // q.b0, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (t(context)) {
            s(context.getTheme(), i10);
        }
    }

    public final void v(AttributeSet attributeSet, int i10, int i11) {
        int u8;
        Context context = getContext();
        if (t(context)) {
            Resources.Theme theme = context.getTheme();
            if (x(context, theme, attributeSet, i10, i11) || (u8 = u(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            s(theme, u8);
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(md.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        v(attributeSet, i10, 0);
    }
}
