package eb;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class n1 extends c2 {
    public static final Object b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public Object f15829a;

    public n1(Object obj) {
        this.f15829a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15829a != b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f15829a;
        Object obj2 = b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f15829a = obj2;
        return obj;
    }
}
