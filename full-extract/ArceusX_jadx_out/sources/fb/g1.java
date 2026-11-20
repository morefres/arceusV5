package fb;

import java.util.Arrays;

/* loaded from: classes.dex */
public class g1 extends h1 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f17093a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17094c;

    public g1(int i10) {
        f1.a(i10, "initialCapacity");
        this.f17093a = new Object[i10];
        this.b = 0;
    }

    public final g1 b(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f17093a;
        int i10 = this.b;
        this.b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final void c(int i10) {
        int length = this.f17093a.length;
        int a10 = h1.a(length, this.b + i10);
        if (a10 > length || this.f17094c) {
            this.f17093a = Arrays.copyOf(this.f17093a, a10);
            this.f17094c = false;
        }
    }
}
