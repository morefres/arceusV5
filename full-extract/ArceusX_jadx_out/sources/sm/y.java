package sm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sm.h;
import sm.m;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final h.e f31554a = new c();
    public static final sm.h<Boolean> b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final sm.h<Byte> f31555c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final sm.h<Character> f31556d = new f();

    /* renamed from: e, reason: collision with root package name */
    public static final sm.h<Double> f31557e = new g();

    /* renamed from: f, reason: collision with root package name */
    public static final sm.h<Float> f31558f = new h();

    /* renamed from: g, reason: collision with root package name */
    public static final sm.h<Integer> f31559g = new i();

    /* renamed from: h, reason: collision with root package name */
    public static final sm.h<Long> f31560h = new j();

    /* renamed from: i, reason: collision with root package name */
    public static final sm.h<Short> f31561i = new k();

    /* renamed from: j, reason: collision with root package name */
    public static final sm.h<String> f31562j = new a();

    public class a extends sm.h<String> {
        @Override // sm.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(sm.m mVar) {
            return mVar.r();
        }

        @Override // sm.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, String str) {
            tVar.M(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31563a;

        static {
            int[] iArr = new int[m.c.values().length];
            f31563a = iArr;
            try {
                iArr[m.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31563a[m.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31563a[m.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31563a[m.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31563a[m.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31563a[m.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class c implements h.e {
        @Override // sm.h.e
        public sm.h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return y.b;
            }
            if (type == Byte.TYPE) {
                return y.f31555c;
            }
            if (type == Character.TYPE) {
                return y.f31556d;
            }
            if (type == Double.TYPE) {
                return y.f31557e;
            }
            if (type == Float.TYPE) {
                return y.f31558f;
            }
            if (type == Integer.TYPE) {
                return y.f31559g;
            }
            if (type == Long.TYPE) {
                return y.f31560h;
            }
            if (type == Short.TYPE) {
                return y.f31561i;
            }
            if (type == Boolean.class) {
                return y.b.nullSafe();
            }
            if (type == Byte.class) {
                return y.f31555c.nullSafe();
            }
            if (type == Character.class) {
                return y.f31556d.nullSafe();
            }
            if (type == Double.class) {
                return y.f31557e.nullSafe();
            }
            if (type == Float.class) {
                return y.f31558f.nullSafe();
            }
            if (type == Integer.class) {
                return y.f31559g.nullSafe();
            }
            if (type == Long.class) {
                return y.f31560h.nullSafe();
            }
            if (type == Short.class) {
                return y.f31561i.nullSafe();
            }
            if (type == String.class) {
                return y.f31562j.nullSafe();
            }
            if (type == Object.class) {
                return new m(wVar).nullSafe();
            }
            Class<?> g10 = a0.g(type);
            sm.h<?> d10 = um.c.d(wVar, type, g10);
            if (d10 != null) {
                return d10;
            }
            if (g10.isEnum()) {
                return new l(g10).nullSafe();
            }
            return null;
        }
    }

    public class d extends sm.h<Boolean> {
        @Override // sm.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(sm.m mVar) {
            return Boolean.valueOf(mVar.h());
        }

        @Override // sm.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Boolean bool) {
            tVar.U(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    public class e extends sm.h<Byte> {
        @Override // sm.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(sm.m mVar) {
            return Byte.valueOf((byte) y.a(mVar, "a byte", -128, 255));
        }

        @Override // sm.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Byte b) {
            tVar.H(b.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    public class f extends sm.h<Character> {
        @Override // sm.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(sm.m mVar) {
            String r8 = mVar.r();
            if (r8.length() <= 1) {
                return Character.valueOf(r8.charAt(0));
            }
            throw new sm.j(String.format("Expected %s but was %s at path %s", "a char", '\"' + r8 + '\"', mVar.getPath()));
        }

        @Override // sm.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Character ch2) {
            tVar.M(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    public class g extends sm.h<Double> {
        @Override // sm.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(sm.m mVar) {
            return Double.valueOf(mVar.j());
        }

        @Override // sm.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Double d10) {
            tVar.F(d10.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    public class h extends sm.h<Float> {
        @Override // sm.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(sm.m mVar) {
            float j10 = (float) mVar.j();
            if (mVar.g() || !Float.isInfinite(j10)) {
                return Float.valueOf(j10);
            }
            throw new sm.j("JSON forbids NaN and infinities: " + j10 + " at path " + mVar.getPath());
        }

        @Override // sm.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Float f10) {
            f10.getClass();
            tVar.L(f10);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    public class i extends sm.h<Integer> {
        @Override // sm.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(sm.m mVar) {
            return Integer.valueOf(mVar.l());
        }

        @Override // sm.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Integer num) {
            tVar.H(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    public class j extends sm.h<Long> {
        @Override // sm.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(sm.m mVar) {
            return Long.valueOf(mVar.m());
        }

        @Override // sm.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Long l10) {
            tVar.H(l10.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    public class k extends sm.h<Short> {
        @Override // sm.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(sm.m mVar) {
            return Short.valueOf((short) y.a(mVar, "a short", -32768, 32767));
        }

        @Override // sm.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, Short sh2) {
            tVar.H(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    public static final class l<T extends Enum<T>> extends sm.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f31564a;
        public final String[] b;

        /* renamed from: c, reason: collision with root package name */
        public final T[] f31565c;

        /* renamed from: d, reason: collision with root package name */
        public final m.b f31566d;

        public l(Class<T> cls) {
            this.f31564a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f31565c = enumConstants;
                this.b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f31565c;
                    if (i10 >= tArr.length) {
                        this.f31566d = m.b.a(this.b);
                        return;
                    } else {
                        String name = tArr[i10].name();
                        this.b[i10] = um.c.m(name, cls.getField(name));
                        i10++;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in " + cls.getName(), e10);
            }
        }

        @Override // sm.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(sm.m mVar) {
            int H = mVar.H(this.f31566d);
            if (H != -1) {
                return this.f31565c[H];
            }
            String path = mVar.getPath();
            throw new sm.j("Expected one of " + Arrays.asList(this.b) + " but was " + mVar.r() + " at path " + path);
        }

        @Override // sm.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(t tVar, T t8) {
            tVar.M(this.b[t8.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f31564a.getName() + ")";
        }
    }

    public static final class m extends sm.h<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final w f31567a;
        public final sm.h<List> b;

        /* renamed from: c, reason: collision with root package name */
        public final sm.h<Map> f31568c;

        /* renamed from: d, reason: collision with root package name */
        public final sm.h<String> f31569d;

        /* renamed from: e, reason: collision with root package name */
        public final sm.h<Double> f31570e;

        /* renamed from: f, reason: collision with root package name */
        public final sm.h<Boolean> f31571f;

        public m(w wVar) {
            this.f31567a = wVar;
            this.b = wVar.c(List.class);
            this.f31568c = wVar.c(Map.class);
            this.f31569d = wVar.c(String.class);
            this.f31570e = wVar.c(Double.class);
            this.f31571f = wVar.c(Boolean.class);
        }

        public final Class<?> a(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // sm.h
        public Object fromJson(sm.m mVar) {
            switch (b.f31563a[mVar.u().ordinal()]) {
                case 1:
                    return this.b.fromJson(mVar);
                case 2:
                    return this.f31568c.fromJson(mVar);
                case 3:
                    return this.f31569d.fromJson(mVar);
                case 4:
                    return this.f31570e.fromJson(mVar);
                case 5:
                    return this.f31571f.fromJson(mVar);
                case 6:
                    return mVar.o();
                default:
                    throw new IllegalStateException("Expected a value but was " + mVar.u() + " at path " + mVar.getPath());
            }
        }

        @Override // sm.h
        public void toJson(t tVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f31567a.e(a(cls), um.c.f33030a).toJson(tVar, (t) obj);
            } else {
                tVar.c();
                tVar.g();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(sm.m mVar, String str, int i10, int i11) {
        int l10 = mVar.l();
        if (l10 < i10 || l10 > i11) {
            throw new sm.j(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(l10), mVar.getPath()));
        }
        return l10;
    }
}
