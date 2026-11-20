package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final b f3103a;
    public a b = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3104a = 0;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f3105c;

        /* renamed from: d, reason: collision with root package name */
        public int f3106d;

        /* renamed from: e, reason: collision with root package name */
        public int f3107e;

        public void a(int i10) {
            this.f3104a = i10 | this.f3104a;
        }

        public boolean b() {
            int i10 = this.f3104a;
            if ((i10 & 7) != 0 && (i10 & c(this.f3106d, this.b)) == 0) {
                return false;
            }
            int i11 = this.f3104a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f3106d, this.f3105c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f3104a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f3107e, this.b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f3104a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f3107e, this.f3105c) << 12)) != 0;
        }

        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        public void d() {
            this.f3104a = 0;
        }

        public void e(int i10, int i11, int i12, int i13) {
            this.b = i10;
            this.f3105c = i11;
            this.f3106d = i12;
            this.f3107e = i13;
        }
    }

    public interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    public t(b bVar) {
        this.f3103a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int c10 = this.f3103a.c();
        int d10 = this.f3103a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f3103a.a(i10);
            this.b.e(c10, d10, this.f3103a.b(a10), this.f3103a.e(a10));
            if (i12 != 0) {
                this.b.d();
                this.b.a(i12);
                if (this.b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.b.d();
                this.b.a(i13);
                if (this.b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        this.b.e(this.f3103a.c(), this.f3103a.d(), this.f3103a.b(view), this.f3103a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.b.d();
        this.b.a(i10);
        return this.b.b();
    }
}
