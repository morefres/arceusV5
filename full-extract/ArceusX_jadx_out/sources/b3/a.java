package b3;

import android.graphics.drawable.ColorDrawable;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: p, reason: collision with root package name */
    public final ColorDrawable f3707p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3708q;

    /* renamed from: r, reason: collision with root package name */
    public int f3709r;

    public a(int i10) {
        super(i10);
        this.f3707p = new ColorDrawable();
        this.f3709r = 0;
    }

    @Override // b3.b
    public void a(int i10) {
        if (this.f3708q) {
            return;
        }
        q(i10);
    }

    @Override // b3.b
    public boolean g() {
        return true;
    }

    public void p(int i10) {
        this.f3708q = true;
        q(i10);
    }

    public final void q(int i10) {
        if (this.f3709r != i10) {
            this.f3709r = i10;
            this.f3707p.setColor(i10);
            i(this.f3707p);
        }
    }

    public a(int i10, int i11) {
        this(i10);
        p(i11);
    }
}
