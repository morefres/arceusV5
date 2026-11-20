package we;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final r f34290a;
    public final List<c> b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f34291c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList<c> f34292a = new ArrayList<>();
        public r b = r.b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f34293c = null;

        public b a(pe.n nVar, int i10, String str, String str2) {
            ArrayList<c> arrayList = this.f34292a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new c(nVar, i10, str, str2));
            return this;
        }

        public t b() {
            if (this.f34292a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f34293c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            t tVar = new t(this.b, Collections.unmodifiableList(this.f34292a), this.f34293c);
            this.f34292a = null;
            return tVar;
        }

        public final boolean c(int i10) {
            ArrayList<c> arrayList = this.f34292a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                c cVar = arrayList.get(i11);
                i11++;
                if (cVar.a() == i10) {
                    return true;
                }
            }
            return false;
        }

        public b d(r rVar) {
            if (this.f34292a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.b = rVar;
            return this;
        }

        public b e(int i10) {
            if (this.f34292a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f34293c = Integer.valueOf(i10);
            return this;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final pe.n f34294a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final String f34295c;

        /* renamed from: d, reason: collision with root package name */
        public final String f34296d;

        public int a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f34294a == cVar.f34294a && this.b == cVar.b && this.f34295c.equals(cVar.f34295c) && this.f34296d.equals(cVar.f34296d);
        }

        public int hashCode() {
            return Objects.hash(this.f34294a, Integer.valueOf(this.b), this.f34295c, this.f34296d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f34294a, Integer.valueOf(this.b), this.f34295c, this.f34296d);
        }

        public c(pe.n nVar, int i10, String str, String str2) {
            this.f34294a = nVar;
            this.b = i10;
            this.f34295c = str;
            this.f34296d = str2;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f34290a.equals(tVar.f34290a) && this.b.equals(tVar.b) && Objects.equals(this.f34291c, tVar.f34291c);
    }

    public int hashCode() {
        return Objects.hash(this.f34290a, this.b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f34290a, this.b, this.f34291c);
    }

    public t(r rVar, List<c> list, Integer num) {
        this.f34290a = rVar;
        this.b = list;
        this.f34291c = num;
    }
}
