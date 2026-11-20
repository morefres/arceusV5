package com.roblox.client.qrscanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import l2.b;
import rg.l0;

/* loaded from: classes2.dex */
public class CustomViewfinderView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final float f9370a;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9371c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9372d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9373e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9374f;

    /* renamed from: g, reason: collision with root package name */
    public int f9375g;

    /* renamed from: h, reason: collision with root package name */
    public int f9376h;

    public CustomViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9370a = 16.0f;
        this.b = 16.0f;
        this.f9371c = 400;
        this.f9372d = 80;
        this.f9373e = a(16.0f, context);
        this.f9374f = a(16.0f, context);
    }

    public final int a(float f10, Context context) {
        return (int) (f10 * (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    public final void b(Canvas canvas, Context context) {
        Rect e10 = e(context);
        int i10 = e10.left;
        int i11 = e10.top;
        int width = e10.width();
        Paint paint = new Paint();
        paint.setColor(2130706432);
        float f10 = i11;
        canvas.drawRect(0.0f, 0.0f, this.f9375g, f10, paint);
        float f11 = i11 + width;
        canvas.drawRect(0.0f, f10, i10, f11, paint);
        canvas.drawRect(i10 + width, f10, this.f9375g, f11, paint);
        canvas.drawRect(0.0f, f11, this.f9375g, this.f9376h, paint);
    }

    public final void c(Canvas canvas, Context context, int i10, Rect rect) {
        Drawable f10 = b.f(context, i10);
        f10.setBounds(rect);
        f10.draw(canvas);
    }

    public final void d(Canvas canvas, Context context) {
        Rect e10 = e(context);
        int i10 = e10.left;
        int i11 = e10.top;
        int width = e10.width();
        Rect rect = new Rect();
        rect.set(i10, i11, this.f9373e + i10, this.f9374f + i11);
        c(canvas, context, l0.f30330e, rect);
        int i12 = i10 + width;
        rect.set(i12 - this.f9373e, i11, i12, this.f9374f + i11);
        c(canvas, context, l0.f30332g, rect);
        int i13 = i11 + width;
        rect.set(i10, i13 - this.f9374f, this.f9373e + i10, i13);
        c(canvas, context, l0.f30329d, rect);
        rect.set(i12 - this.f9373e, i13 - this.f9374f, i12, i13);
        c(canvas, context, l0.f30331f, rect);
    }

    public final Rect e(Context context) {
        int a10 = a(80.0f, context);
        int a11 = a(400.0f, context);
        int i10 = this.f9375g;
        int i11 = i10 - (a10 * 2);
        if (i11 > a11) {
            a10 = (i10 - a11) / 2;
        } else {
            a11 = i11;
        }
        int i12 = (this.f9376h - a11) / 2;
        return new Rect(a10, i12, a10 + a11, a11 + i12);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Context context = getContext();
        this.f9375g = getWidth();
        this.f9376h = getHeight();
        b(canvas, context);
        d(canvas, context);
    }
}
