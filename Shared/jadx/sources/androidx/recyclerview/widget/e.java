package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final b f2964a;

    /* renamed from: e, reason: collision with root package name */
    public View f2967e;

    /* renamed from: d, reason: collision with root package name */
    public int f2966d = 0;
    public final a b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final List<View> f2965c = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f2968a = 0;
        public a b;

        public void a(int i10) {
            if (i10 < 64) {
                this.f2968a &= ~(1 << i10);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public int b(int i10) {
            a aVar = this.b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f2968a) : Long.bitCount(this.f2968a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f2968a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f2968a);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f2968a & (1 << i10)) != 0;
            }
            c();
            return this.b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f2968a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f2968a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.b != null) {
                c();
                this.b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f2968a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f2968a = j12;
            long j13 = j10 - 1;
            this.f2968a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f2968a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 < 64) {
                this.f2968a |= 1 << i10;
            } else {
                c();
                this.b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.f2968a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.f2968a);
        }
    }

    public interface b {
        View a(int i10);

        void addView(View view, int i10);

        void b(View view);

        int c();

        RecyclerView.f0 d(View view);

        void e(int i10);

        void f();

        int g(View view);

        void h(View view);

        void i(int i10);

        void j(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    public e(b bVar) {
        this.f2964a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int c10 = i10 < 0 ? this.f2964a.c() : h(i10);
        this.b.e(c10, z10);
        if (z10) {
            l(view);
        }
        this.f2964a.addView(view, c10);
    }

    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int c10 = i10 < 0 ? this.f2964a.c() : h(i10);
        this.b.e(c10, z10);
        if (z10) {
            l(view);
        }
        this.f2964a.j(view, c10, layoutParams);
    }

    public void d(int i10) {
        int h10 = h(i10);
        this.b.f(h10);
        this.f2964a.e(h10);
    }

    public View e(int i10) {
        int size = this.f2965c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f2965c.get(i11);
            RecyclerView.f0 d10 = this.f2964a.d(view);
            if (d10.n() == i10 && !d10.u() && !d10.w()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i10) {
        return this.f2964a.a(h(i10));
    }

    public int g() {
        return this.f2964a.c() - this.f2965c.size();
    }

    public final int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int c10 = this.f2964a.c();
        int i11 = i10;
        while (i11 < c10) {
            int b10 = i10 - (i11 - this.b.b(i11));
            if (b10 == 0) {
                while (this.b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public View i(int i10) {
        return this.f2964a.a(i10);
    }

    public int j() {
        return this.f2964a.c();
    }

    public void k(View view) {
        int g10 = this.f2964a.g(view);
        if (g10 >= 0) {
            this.b.h(g10);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f2965c.add(view);
        this.f2964a.b(view);
    }

    public int m(View view) {
        int g10 = this.f2964a.g(view);
        if (g10 == -1 || this.b.d(g10)) {
            return -1;
        }
        return g10 - this.b.b(g10);
    }

    public boolean n(View view) {
        return this.f2965c.contains(view);
    }

    public void o() {
        this.b.g();
        for (int size = this.f2965c.size() - 1; size >= 0; size--) {
            this.f2964a.h(this.f2965c.get(size));
            this.f2965c.remove(size);
        }
        this.f2964a.f();
    }

    public void p(View view) {
        int i10 = this.f2966d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f2966d = 1;
            this.f2967e = view;
            int g10 = this.f2964a.g(view);
            if (g10 >= 0) {
                if (this.b.f(g10)) {
                    t(view);
                }
                this.f2964a.i(g10);
            }
            this.f2966d = 0;
            this.f2967e = null;
        } catch (Throwable th2) {
            this.f2966d = 0;
            this.f2967e = null;
            throw th2;
        }
    }

    public void q(int i10) {
        int i11 = this.f2966d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int h10 = h(i10);
            View a10 = this.f2964a.a(h10);
            if (a10 != null) {
                this.f2966d = 1;
                this.f2967e = a10;
                if (this.b.f(h10)) {
                    t(a10);
                }
                this.f2964a.i(h10);
            }
            this.f2966d = 0;
            this.f2967e = null;
        } catch (Throwable th2) {
            this.f2966d = 0;
            this.f2967e = null;
            throw th2;
        }
    }

    public boolean r(View view) {
        int i10 = this.f2966d;
        if (i10 == 1) {
            if (this.f2967e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f2966d = 2;
            int g10 = this.f2964a.g(view);
            if (g10 == -1) {
                t(view);
                return true;
            }
            if (!this.b.d(g10)) {
                return false;
            }
            this.b.f(g10);
            t(view);
            this.f2964a.i(g10);
            return true;
        } finally {
            this.f2966d = 0;
        }
    }

    public void s(View view) {
        int g10 = this.f2964a.g(view);
        if (g10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.b.d(g10)) {
            this.b.a(g10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f2965c.remove(view)) {
            return false;
        }
        this.f2964a.h(view);
        return true;
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.f2965c.size();
    }
}
