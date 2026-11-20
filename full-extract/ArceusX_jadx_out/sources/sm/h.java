package sm;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import sm.m;

/* loaded from: classes2.dex */
public abstract class h<T> {

    public class a extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f31446a;

        public a(h hVar) {
            this.f31446a = hVar;
        }

        @Override // sm.h
        public T fromJson(m mVar) {
            return (T) this.f31446a.fromJson(mVar);
        }

        @Override // sm.h
        public boolean isLenient() {
            return this.f31446a.isLenient();
        }

        @Override // sm.h
        public void toJson(t tVar, T t8) {
            boolean j10 = tVar.j();
            tVar.B(true);
            try {
                this.f31446a.toJson(tVar, (t) t8);
            } finally {
                tVar.B(j10);
            }
        }

        public String toString() {
            return this.f31446a + ".serializeNulls()";
        }
    }

    public class b extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f31447a;

        public b(h hVar) {
            this.f31447a = hVar;
        }

        @Override // sm.h
        public T fromJson(m mVar) {
            boolean g10 = mVar.g();
            mVar.L(true);
            try {
                return (T) this.f31447a.fromJson(mVar);
            } finally {
                mVar.L(g10);
            }
        }

        @Override // sm.h
        public boolean isLenient() {
            return true;
        }

        @Override // sm.h
        public void toJson(t tVar, T t8) {
            boolean l10 = tVar.l();
            tVar.y(true);
            try {
                this.f31447a.toJson(tVar, (t) t8);
            } finally {
                tVar.y(l10);
            }
        }

        public String toString() {
            return this.f31447a + ".lenient()";
        }
    }

    public class c extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f31448a;

        public c(h hVar) {
            this.f31448a = hVar;
        }

        @Override // sm.h
        public T fromJson(m mVar) {
            boolean e10 = mVar.e();
            mVar.I(true);
            try {
                return (T) this.f31448a.fromJson(mVar);
            } finally {
                mVar.I(e10);
            }
        }

        @Override // sm.h
        public boolean isLenient() {
            return this.f31448a.isLenient();
        }

        @Override // sm.h
        public void toJson(t tVar, T t8) {
            this.f31448a.toJson(tVar, (t) t8);
        }

        public String toString() {
            return this.f31448a + ".failOnUnknown()";
        }
    }

    public class d extends h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f31449a;
        public final /* synthetic */ String b;

        public d(h hVar, String str) {
            this.f31449a = hVar;
            this.b = str;
        }

        @Override // sm.h
        public T fromJson(m mVar) {
            return (T) this.f31449a.fromJson(mVar);
        }

        @Override // sm.h
        public boolean isLenient() {
            return this.f31449a.isLenient();
        }

        @Override // sm.h
        public void toJson(t tVar, T t8) {
            String h10 = tVar.h();
            tVar.x(this.b);
            try {
                this.f31449a.toJson(tVar, (t) t8);
            } finally {
                tVar.x(h10);
            }
        }

        public String toString() {
            return this.f31449a + ".indent(\"" + this.b + "\")";
        }
    }

    public interface e {
        h<?> create(Type type, Set<? extends Annotation> set, w wVar);
    }

    public final h<T> failOnUnknown() {
        return new c(this);
    }

    public abstract T fromJson(m mVar);

    public final T fromJson(wu.g gVar) {
        return fromJson(m.s(gVar));
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new q(obj));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public h<T> indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    public final h<T> lenient() {
        return new b(this);
    }

    public final h<T> nonNull() {
        return this instanceof um.a ? this : new um.a(this);
    }

    public final h<T> nullSafe() {
        return this instanceof um.b ? this : new um.b(this);
    }

    public final h<T> serializeNulls() {
        return new a(this);
    }

    public abstract void toJson(t tVar, T t8);

    public final void toJson(wu.f fVar, T t8) {
        toJson(t.q(fVar), (t) t8);
    }

    public final Object toJsonValue(T t8) {
        s sVar = new s();
        try {
            toJson((t) sVar, (s) t8);
            return sVar.Z();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final T fromJson(String str) {
        m s8 = m.s(new wu.e().A0(str));
        T fromJson = fromJson(s8);
        if (isLenient() || s8.u() == m.c.END_DOCUMENT) {
            return fromJson;
        }
        throw new j("JSON document was not fully consumed.");
    }

    public final String toJson(T t8) {
        wu.e eVar = new wu.e();
        try {
            toJson((wu.f) eVar, (wu.e) t8);
            return eVar.S2();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
