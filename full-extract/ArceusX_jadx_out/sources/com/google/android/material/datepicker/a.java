package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Rect f7886a;
    public final ColorStateList b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f7887c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f7888d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7889e;

    /* renamed from: f, reason: collision with root package name */
    public final hd.k f7890f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, hd.k kVar, @NonNull Rect rect) {
        x2.g.d(rect.left);
        x2.g.d(rect.top);
        x2.g.d(rect.right);
        x2.g.d(rect.bottom);
        this.f7886a = rect;
        this.b = colorStateList2;
        this.f7887c = colorStateList;
        this.f7888d = colorStateList3;
        this.f7889e = i10;
        this.f7890f = kVar;
    }

    @NonNull
    public static a a(@NonNull Context context, int i10) {
        x2.g.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, ic.k.f20715p3);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(ic.k.f20724q3, 0), obtainStyledAttributes.getDimensionPixelOffset(ic.k.f20742s3, 0), obtainStyledAttributes.getDimensionPixelOffset(ic.k.f20733r3, 0), obtainStyledAttributes.getDimensionPixelOffset(ic.k.f20751t3, 0));
        ColorStateList a10 = ed.c.a(context, obtainStyledAttributes, ic.k.f20760u3);
        ColorStateList a11 = ed.c.a(context, obtainStyledAttributes, ic.k.f20803z3);
        ColorStateList a12 = ed.c.a(context, obtainStyledAttributes, ic.k.f20785x3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ic.k.f20794y3, 0);
        hd.k m10 = hd.k.b(context, obtainStyledAttributes.getResourceId(ic.k.f20769v3, 0), obtainStyledAttributes.getResourceId(ic.k.f20777w3, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    public int b() {
        return this.f7886a.bottom;
    }

    public int c() {
        return this.f7886a.top;
    }

    public void d(@NonNull TextView textView) {
        e(textView, null, null);
    }

    public void e(@NonNull TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        hd.g gVar = new hd.g();
        hd.g gVar2 = new hd.g();
        gVar.setShapeAppearanceModel(this.f7890f);
        gVar2.setShapeAppearanceModel(this.f7890f);
        if (colorStateList == null) {
            colorStateList = this.f7887c;
        }
        gVar.a0(colorStateList);
        gVar.h0(this.f7889e, this.f7888d);
        if (colorStateList2 == null) {
            colorStateList2 = this.b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f7886a;
        o0.q0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
