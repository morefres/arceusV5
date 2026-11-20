package he;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0343b f19344a = EnumC0343b.NOT_READY;
    public T b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19345a;

        static {
            int[] iArr = new int[EnumC0343b.values().length];
            f19345a = iArr;
            try {
                iArr[EnumC0343b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19345a[EnumC0343b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: he.b$b, reason: collision with other inner class name */
    public enum EnumC0343b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T b();

    public final T d() {
        this.f19344a = EnumC0343b.DONE;
        return null;
    }

    public final boolean e() {
        this.f19344a = EnumC0343b.FAILED;
        this.b = b();
        if (this.f19344a == EnumC0343b.DONE) {
            return false;
        }
        this.f19344a = EnumC0343b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        n.r(this.f19344a != EnumC0343b.FAILED);
        int i10 = a.f19345a[this.f19344a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19344a = EnumC0343b.NOT_READY;
        T t8 = (T) i.a(this.b);
        this.b = null;
        return t8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
