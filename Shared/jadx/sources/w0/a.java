package w0;

import java.util.ArrayDeque;
import w0.c;

/* loaded from: classes.dex */
public class a<T> implements c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f33605a;
    public final ArrayDeque<T> b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f33606c;

    /* renamed from: d, reason: collision with root package name */
    public final c.a<T> f33607d;

    public a(int i10) {
        this(i10, null);
    }

    @Override // w0.c
    public T a() {
        T removeLast;
        synchronized (this.f33606c) {
            removeLast = this.b.removeLast();
        }
        return removeLast;
    }

    @Override // w0.c
    public void b(T t8) {
        T a10;
        synchronized (this.f33606c) {
            try {
                a10 = this.b.size() >= this.f33605a ? a() : null;
                this.b.addFirst(t8);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c.a<T> aVar = this.f33607d;
        if (aVar == null || a10 == null) {
            return;
        }
        aVar.a(a10);
    }

    @Override // w0.c
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f33606c) {
            isEmpty = this.b.isEmpty();
        }
        return isEmpty;
    }

    public a(int i10, c.a<T> aVar) {
        this.f33606c = new Object();
        this.f33605a = i10;
        this.b = new ArrayDeque<>(i10);
        this.f33607d = aVar;
    }
}
