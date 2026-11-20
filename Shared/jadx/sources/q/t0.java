package q;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f29428a = 0;
    public int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f29429c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* renamed from: d, reason: collision with root package name */
    public int f29430d = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* renamed from: e, reason: collision with root package name */
    public int f29431e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f29432f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29433g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29434h = false;

    public int a() {
        return this.f29433g ? this.f29428a : this.b;
    }

    public int b() {
        return this.f29428a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f29433g ? this.b : this.f29428a;
    }

    public void e(int i10, int i11) {
        this.f29434h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f29431e = i10;
            this.f29428a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f29432f = i11;
            this.b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f29433g) {
            return;
        }
        this.f29433g = z10;
        if (!this.f29434h) {
            this.f29428a = this.f29431e;
            this.b = this.f29432f;
            return;
        }
        if (z10) {
            int i10 = this.f29430d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f29431e;
            }
            this.f29428a = i10;
            int i11 = this.f29429c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f29432f;
            }
            this.b = i11;
            return;
        }
        int i12 = this.f29429c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f29431e;
        }
        this.f29428a = i12;
        int i13 = this.f29430d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f29432f;
        }
        this.b = i13;
    }

    public void g(int i10, int i11) {
        this.f29429c = i10;
        this.f29430d = i11;
        this.f29434h = true;
        if (this.f29433g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f29428a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f29428a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.b = i11;
        }
    }
}
