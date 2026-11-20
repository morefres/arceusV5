package he;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t {

    public static class a<T> implements s<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final s<T> f19399a;
        public volatile transient boolean b;

        /* renamed from: c, reason: collision with root package name */
        public transient T f19400c;

        public a(s<T> sVar) {
            this.f19399a = (s) n.l(sVar);
        }

        @Override // he.s
        public T get() {
            if (!this.b) {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            T t8 = this.f19399a.get();
                            this.f19400c = t8;
                            this.b = true;
                            return t8;
                        }
                    } finally {
                    }
                }
            }
            return (T) i.a(this.f19400c);
        }

        public String toString() {
            Object obj;
            if (this.b) {
                String valueOf = String.valueOf(this.f19400c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(valueOf);
                sb2.append(">");
                obj = sb2.toString();
            } else {
                obj = this.f19399a;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(valueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    public static class b<T> implements s<T> {

        /* renamed from: a, reason: collision with root package name */
        public volatile s<T> f19401a;
        public volatile boolean b;

        /* renamed from: c, reason: collision with root package name */
        public T f19402c;

        public b(s<T> sVar) {
            this.f19401a = (s) n.l(sVar);
        }

        @Override // he.s
        public T get() {
            if (!this.b) {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            s<T> sVar = this.f19401a;
                            Objects.requireNonNull(sVar);
                            T t8 = sVar.get();
                            this.f19402c = t8;
                            this.b = true;
                            this.f19401a = null;
                            return t8;
                        }
                    } finally {
                    }
                }
            }
            return (T) i.a(this.f19402c);
        }

        public String toString() {
            Object obj = this.f19401a;
            if (obj == null) {
                String valueOf = String.valueOf(this.f19402c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(valueOf);
                sb2.append(">");
                obj = sb2.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(valueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    public static class c<T> implements s<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final T f19403a;

        public c(T t8) {
            this.f19403a = t8;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return j.a(this.f19403a, ((c) obj).f19403a);
            }
            return false;
        }

        @Override // he.s
        public T get() {
            return this.f19403a;
        }

        public int hashCode() {
            return j.b(this.f19403a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f19403a);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Suppliers.ofInstance(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static <T> s<T> a(s<T> sVar) {
        return ((sVar instanceof b) || (sVar instanceof a)) ? sVar : sVar instanceof Serializable ? new a(sVar) : new b(sVar);
    }

    public static <T> s<T> b(T t8) {
        return new c(t8);
    }
}
