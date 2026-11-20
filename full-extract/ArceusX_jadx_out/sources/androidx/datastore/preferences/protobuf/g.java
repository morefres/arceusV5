package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class g implements Iterable<Byte>, Serializable {
    public static final g b = new j(z.f2211d);

    /* renamed from: c, reason: collision with root package name */
    public static final f f1975c;

    /* renamed from: d, reason: collision with root package name */
    public static final Comparator<g> f1976d;

    /* renamed from: a, reason: collision with root package name */
    public int f1977a = 0;

    public class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public int f1978a = 0;
        public final int b;

        public a() {
            this.b = g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.g.InterfaceC0029g
        public byte c() {
            int i10 = this.f1978a;
            if (i10 >= this.b) {
                throw new NoSuchElementException();
            }
            this.f1978a = i10 + 1;
            return g.this.i(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1978a < this.b;
        }
    }

    public class b implements Comparator<g> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            InterfaceC0029g it = gVar.iterator();
            InterfaceC0029g it2 = gVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(g.y(it.c())).compareTo(Integer.valueOf(g.y(it2.c())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(gVar.size()).compareTo(Integer.valueOf(gVar2.size()));
        }
    }

    public static abstract class c implements InterfaceC0029g {
        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(c());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d implements f {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static final class e extends j {

        /* renamed from: f, reason: collision with root package name */
        public final int f1980f;

        /* renamed from: g, reason: collision with root package name */
        public final int f1981g;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            g.d(i10, i10 + i11, bArr.length);
            this.f1980f = i10;
            this.f1981g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j
        public int E() {
            return this.f1980f;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public byte b(int i10) {
            g.c(i10, size());
            return this.f1983e[this.f1980f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public void h(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f1983e, E() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public byte i(int i10) {
            return this.f1983e[this.f1980f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f1981g;
        }
    }

    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0029g extends Iterator<Byte> {
        byte c();
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.datastore.preferences.protobuf.j f1982a;
        public final byte[] b;

        public /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public g a() {
            this.f1982a.c();
            return new j(this.b);
        }

        public androidx.datastore.preferences.protobuf.j b() {
            return this.f1982a;
        }

        public h(int i10) {
            byte[] bArr = new byte[i10];
            this.b = bArr;
            this.f1982a = androidx.datastore.preferences.protobuf.j.f0(bArr);
        }
    }

    public static abstract class i extends g {
        public /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        public i() {
        }
    }

    public static class j extends i {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f1983e;

        public j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f1983e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final void C(androidx.datastore.preferences.protobuf.f fVar) {
            fVar.a(this.f1983e, E(), size());
        }

        public final boolean D(g gVar, int i10, int i11) {
            if (i11 > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > gVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + gVar.size());
            }
            if (!(gVar instanceof j)) {
                return gVar.u(i10, i12).equals(u(0, i11));
            }
            j jVar = (j) gVar;
            byte[] bArr = this.f1983e;
            byte[] bArr2 = jVar.f1983e;
            int E = E() + i11;
            int E2 = E();
            int E3 = jVar.E() + i10;
            while (E2 < E) {
                if (bArr[E2] != bArr2[E3]) {
                    return false;
                }
                E2++;
                E3++;
            }
            return true;
        }

        public int E() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte b(int i10) {
            return this.f1983e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int t8 = t();
            int t10 = jVar.t();
            if (t8 == 0 || t10 == 0 || t8 == t10) {
                return D(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public void h(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f1983e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte i(int i10) {
            return this.f1983e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final androidx.datastore.preferences.protobuf.h m() {
            return androidx.datastore.preferences.protobuf.h.k(this.f1983e, E(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int p(int i10, int i11, int i12) {
            return z.h(i10, this.f1983e, E() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f1983e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final g u(int i10, int i11) {
            int d10 = g.d(i10, i11, size());
            return d10 == 0 ? g.b : new e(this.f1983e, E() + i10, d10);
        }
    }

    public static final class k implements f {
        public k() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f1975c = androidx.datastore.preferences.protobuf.d.c() ? new k(aVar) : new d(aVar);
        f1976d = new b();
    }

    public static g A(byte[] bArr) {
        return new j(bArr);
    }

    public static g B(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public static void c(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public static int d(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static g e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static g f(byte[] bArr, int i10, int i11) {
        d(i10, i10 + i11, bArr.length);
        return new j(f1975c.a(bArr, i10, i11));
    }

    public static g g(String str) {
        return new j(str.getBytes(z.b));
    }

    public static h l(int i10) {
        return new h(i10, null);
    }

    public static int y(byte b10) {
        return b10 & 255;
    }

    public abstract void C(androidx.datastore.preferences.protobuf.f fVar);

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public abstract void h(byte[] bArr, int i10, int i11, int i12);

    public final int hashCode() {
        int i10 = this.f1977a;
        if (i10 == 0) {
            int size = size();
            i10 = p(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f1977a = i10;
        }
        return i10;
    }

    public abstract byte i(int i10);

    @Override // java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC0029g iterator() {
        return new a();
    }

    public abstract androidx.datastore.preferences.protobuf.h m();

    public abstract int p(int i10, int i11, int i12);

    public abstract int size();

    public final int t() {
        return this.f1977a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), z());
    }

    public abstract g u(int i10, int i11);

    public final byte[] v() {
        int size = size();
        if (size == 0) {
            return z.f2211d;
        }
        byte[] bArr = new byte[size];
        h(bArr, 0, 0, size);
        return bArr;
    }

    public final String z() {
        if (size() <= 50) {
            return l1.a(this);
        }
        return l1.a(u(0, 47)) + "...";
    }
}
