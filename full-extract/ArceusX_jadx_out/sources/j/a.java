package j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import o.b;

/* loaded from: classes.dex */
public abstract class a {

    public interface b {
        void onMenuVisibilityChanged(boolean z10);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract void m(Configuration configuration);

    public void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(CharSequence charSequence);

    public abstract o.b u(b.a aVar);

    /* renamed from: j.a$a, reason: collision with other inner class name */
    public static class C0371a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f21294a;

        public C0371a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21294a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f20024t);
            this.f21294a = obtainStyledAttributes.getInt(i.j.f20029u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0371a(int i10, int i11) {
            super(i10, i11);
            this.f21294a = 8388627;
        }

        public C0371a(C0371a c0371a) {
            super((ViewGroup.MarginLayoutParams) c0371a);
            this.f21294a = 0;
            this.f21294a = c0371a.f21294a;
        }

        public C0371a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21294a = 0;
        }
    }
}
