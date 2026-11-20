package q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CheckedTextView f29311a;
    public ColorStateList b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f29312c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29313d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29314e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29315f;

    public i(@NonNull CheckedTextView checkedTextView) {
        this.f29311a = checkedTextView;
    }

    public void a() {
        Drawable a10 = d3.c.a(this.f29311a);
        if (a10 != null) {
            if (this.f29313d || this.f29314e) {
                Drawable mutate = q2.a.r(a10).mutate();
                if (this.f29313d) {
                    q2.a.o(mutate, this.b);
                }
                if (this.f29314e) {
                    q2.a.p(mutate, this.f29312c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f29311a.getDrawableState());
                }
                this.f29311a.setCheckMarkDrawable(mutate);
            }
        }
    }

    public ColorStateList b() {
        return this.b;
    }

    public PorterDuff.Mode c() {
        return this.f29312c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005d, B:11:0x0065, B:12:0x0070, B:14:0x0078, B:21:0x0040, B:23:0x0048, B:25:0x0050), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005d, B:11:0x0065, B:12:0x0070, B:14:0x0078, B:21:0x0040, B:23:0x0048, B:25:0x0050), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CheckedTextView r0 = r10.f29311a
            android.content.Context r0 = r0.getContext()
            int[] r1 = i.j.R0
            r2 = 0
            q.a1 r1 = q.a1.v(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.f29311a
            android.content.Context r4 = r3.getContext()
            int[] r5 = i.j.R0
            android.content.res.TypedArray r7 = r1.r()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.o0.k0(r3, r4, r5, r6, r7, r8, r9)
            int r11 = i.j.T0     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r1.s(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L40
            int r11 = i.j.T0     // Catch: java.lang.Throwable -> L3d
            int r11 = r1.n(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L40
            android.widget.CheckedTextView r12 = r10.f29311a     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L40
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L40
            android.graphics.drawable.Drawable r11 = k.a.b(r0, r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L40
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L40
            goto L5d
        L3d:
            r0 = move-exception
            r11 = r0
            goto L8d
        L40:
            int r11 = i.j.S0     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r1.s(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5d
            int r11 = i.j.S0     // Catch: java.lang.Throwable -> L3d
            int r11 = r1.n(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5d
            android.widget.CheckedTextView r12 = r10.f29311a     // Catch: java.lang.Throwable -> L3d
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L3d
            android.graphics.drawable.Drawable r11 = k.a.b(r0, r11)     // Catch: java.lang.Throwable -> L3d
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L3d
        L5d:
            int r11 = i.j.U0     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r1.s(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L70
            android.widget.CheckedTextView r11 = r10.f29311a     // Catch: java.lang.Throwable -> L3d
            int r12 = i.j.U0     // Catch: java.lang.Throwable -> L3d
            android.content.res.ColorStateList r12 = r1.c(r12)     // Catch: java.lang.Throwable -> L3d
            d3.c.b(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L70:
            int r11 = i.j.V0     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r1.s(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L89
            android.widget.CheckedTextView r11 = r10.f29311a     // Catch: java.lang.Throwable -> L3d
            int r12 = i.j.V0     // Catch: java.lang.Throwable -> L3d
            r0 = -1
            int r12 = r1.k(r12, r0)     // Catch: java.lang.Throwable -> L3d
            r0 = 0
            android.graphics.PorterDuff$Mode r12 = q.k0.e(r12, r0)     // Catch: java.lang.Throwable -> L3d
            d3.c.c(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L89:
            r1.x()
            return
        L8d:
            r1.x()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: q.i.d(android.util.AttributeSet, int):void");
    }

    public void e() {
        if (this.f29315f) {
            this.f29315f = false;
        } else {
            this.f29315f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f29313d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f29312c = mode;
        this.f29314e = true;
        a();
    }
}
