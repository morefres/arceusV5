package eb;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d3 extends f3 {

    /* renamed from: a, reason: collision with root package name */
    public int f15779a = 0;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f15780c;

    public d3(m3 m3Var) {
        this.f15780c = m3Var;
        this.b = m3Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15779a < this.b;
    }

    @Override // eb.h3
    public final byte zza() {
        int i10 = this.f15779a;
        if (i10 >= this.b) {
            throw new NoSuchElementException();
        }
        this.f15779a = i10 + 1;
        return this.f15780c.c(i10);
    }
}
