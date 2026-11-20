package ki;

import android.graphics.Rect;
import android.view.View;
import android.view.a0;
import android.view.d0;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.y;
import rh.h;

/* loaded from: classes2.dex */
public class a implements y {

    /* renamed from: a, reason: collision with root package name */
    public d0<Rect> f22665a = new d0<>();
    public d0<Rect> b = new d0<>();

    /* renamed from: c, reason: collision with root package name */
    public d0<Rect> f22666c = new d0<>();

    @Override // androidx.core.view.y
    public WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
        Rect rect = new Rect();
        if (h.a().x1()) {
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.displayCutout());
            rect.set(insets.left, insets.top, insets.right, insets.bottom);
        } else {
            rect.top = windowInsetsCompat.getSystemWindowInsetTop();
            rect.left = windowInsetsCompat.getSystemWindowInsetLeft();
            rect.right = windowInsetsCompat.getSystemWindowInsetRight();
            rect.bottom = windowInsetsCompat.getSystemWindowInsetBottom();
        }
        this.f22665a.o(rect);
        if (h.a().a1()) {
            Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            Rect rect2 = new Rect();
            rect2.left = insets2.left;
            rect2.top = insets2.top;
            rect2.right = insets2.right;
            rect2.bottom = insets2.bottom;
            this.f22666c.o(rect2);
        }
        Insets insets3 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout());
        Rect rect3 = new Rect();
        rect3.left = insets3.left;
        rect3.top = insets3.top;
        rect3.right = insets3.right;
        rect3.bottom = insets3.bottom;
        this.b.o(rect3);
        return windowInsetsCompat;
    }

    public a0<Rect> a() {
        return this.b;
    }

    public d0<Rect> b() {
        return this.f22665a;
    }

    public Rect c() {
        return this.f22665a.f();
    }

    public a0<Rect> d() {
        return this.f22666c;
    }

    public void e(View view) {
        o0.A0(view, this);
    }
}
