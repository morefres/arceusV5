package on;

import java.util.Iterator;

/* loaded from: classes3.dex */
public class t {

    public static class a implements Iterable<s> {

        /* renamed from: a, reason: collision with root package name */
        public final s f28006a;
        public final s b;

        @Override // java.lang.Iterable
        public Iterator<s> iterator() {
            return new b(this.f28006a, this.b);
        }

        public a(s sVar, s sVar2) {
            this.f28006a = sVar;
            this.b = sVar2;
        }
    }

    public static class b implements Iterator<s> {

        /* renamed from: a, reason: collision with root package name */
        public s f28007a;
        public final s b;

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s next() {
            s sVar = this.f28007a;
            this.f28007a = sVar.f();
            return sVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            s sVar = this.f28007a;
            return (sVar == null || sVar == this.b) ? false : true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        public b(s sVar, s sVar2) {
            this.f28007a = sVar;
            this.b = sVar2;
        }
    }

    public static Iterable<s> a(s sVar, s sVar2) {
        return new a(sVar.f(), sVar2);
    }
}
