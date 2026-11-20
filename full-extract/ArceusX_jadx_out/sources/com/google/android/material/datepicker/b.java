package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f7891a;

    @NonNull
    public final a b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f7892c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final a f7893d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final a f7894e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final a f7895f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final a f7896g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Paint f7897h;

    public b(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ed.b.d(context, ic.b.f20419z, e.class.getCanonicalName()), ic.k.f20625f3);
        this.f7891a = a.a(context, obtainStyledAttributes.getResourceId(ic.k.f20661j3, 0));
        this.f7896g = a.a(context, obtainStyledAttributes.getResourceId(ic.k.f20643h3, 0));
        this.b = a.a(context, obtainStyledAttributes.getResourceId(ic.k.f20652i3, 0));
        this.f7892c = a.a(context, obtainStyledAttributes.getResourceId(ic.k.f20670k3, 0));
        ColorStateList a10 = ed.c.a(context, obtainStyledAttributes, ic.k.f20679l3);
        this.f7893d = a.a(context, obtainStyledAttributes.getResourceId(ic.k.f20697n3, 0));
        this.f7894e = a.a(context, obtainStyledAttributes.getResourceId(ic.k.f20688m3, 0));
        this.f7895f = a.a(context, obtainStyledAttributes.getResourceId(ic.k.f20706o3, 0));
        Paint paint = new Paint();
        this.f7897h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
