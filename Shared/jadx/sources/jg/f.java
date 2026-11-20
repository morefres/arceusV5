package jg;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class f {
    public static final jg.e A = jg.e.f21691d;
    public static final String B = null;
    public static final jg.d C = jg.c.f21684a;
    public static final z D = y.f21757a;
    public static final z E = y.b;

    /* renamed from: z, reason: collision with root package name */
    public static final x f21695z = null;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<TypeToken<?>, a0<?>>> f21696a;
    public final ConcurrentMap<TypeToken<?>, a0<?>> b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstructorConstructor f21697c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f21698d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b0> f21699e;

    /* renamed from: f, reason: collision with root package name */
    public final Excluder f21700f;

    /* renamed from: g, reason: collision with root package name */
    public final jg.d f21701g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<Type, h<?>> f21702h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f21703i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f21704j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21705k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21706l;

    /* renamed from: m, reason: collision with root package name */
    public final jg.e f21707m;

    /* renamed from: n, reason: collision with root package name */
    public final x f21708n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f21709o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f21710p;

    /* renamed from: q, reason: collision with root package name */
    public final String f21711q;

    /* renamed from: r, reason: collision with root package name */
    public final int f21712r;

    /* renamed from: s, reason: collision with root package name */
    public final int f21713s;

    /* renamed from: t, reason: collision with root package name */
    public final v f21714t;

    /* renamed from: u, reason: collision with root package name */
    public final List<b0> f21715u;

    /* renamed from: v, reason: collision with root package name */
    public final List<b0> f21716v;

    /* renamed from: w, reason: collision with root package name */
    public final z f21717w;

    /* renamed from: x, reason: collision with root package name */
    public final z f21718x;

    /* renamed from: y, reason: collision with root package name */
    public final List<w> f21719y;

    public class a extends a0<Number> {
        public a() {
        }

        @Override // jg.a0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, Number number) {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            double doubleValue = number.doubleValue();
            f.d(doubleValue);
            jsonWriter.value(doubleValue);
        }
    }

    public class b extends a0<Number> {
        public b() {
        }

        @Override // jg.a0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, Number number) {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            float floatValue = number.floatValue();
            f.d(floatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(floatValue);
            }
            jsonWriter.value(number);
        }
    }

    public class c extends a0<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // jg.a0
        public Number read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.nextLong());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, Number number) {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    public class d extends a0<AtomicLong> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f21722a;

        public d(a0 a0Var) {
            this.f21722a = a0Var;
        }

        @Override // jg.a0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicLong read(JsonReader jsonReader) {
            return new AtomicLong(((Number) this.f21722a.read(jsonReader)).longValue());
        }

        @Override // jg.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, AtomicLong atomicLong) {
            this.f21722a.write(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    public class e extends a0<AtomicLongArray> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f21723a;

        public e(a0 a0Var) {
            this.f21723a = a0Var;
        }

        @Override // jg.a0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray read(JsonReader jsonReader) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f21723a.read(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // jg.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f21723a.write(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: jg.f$f, reason: collision with other inner class name */
    public static class C0380f<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public a0<T> f21724a = null;

        public void a(a0<T> a0Var) {
            if (this.f21724a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f21724a = a0Var;
        }

        public final a0<T> delegate() {
            a0<T> a0Var = this.f21724a;
            if (a0Var != null) {
                return a0Var;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public a0<T> getSerializationDelegate() {
            return delegate();
        }

        @Override // jg.a0
        public T read(JsonReader jsonReader) {
            return delegate().read(jsonReader);
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, T t8) {
            delegate().write(jsonWriter, t8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f() {
        /*
            r22 = this;
            com.google.gson.internal.Excluder r1 = com.google.gson.internal.Excluder.DEFAULT
            jg.d r2 = jg.f.C
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            jg.e r8 = jg.f.A
            jg.x r9 = jg.f.f21695z
            jg.v r12 = jg.v.f21748a
            java.lang.String r13 = jg.f.B
            java.util.List r16 = java.util.Collections.EMPTY_LIST
            jg.z r19 = jg.f.D
            jg.z r20 = jg.f.E
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r10 = 0
            r11 = 1
            r14 = 2
            r15 = 2
            r17 = r16
            r18 = r16
            r21 = r16
            r0 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.f.<init>():void");
    }

    public static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new u("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new u(e10);
            } catch (IOException e11) {
                throw new m(e11);
            }
        }
    }

    public static a0<AtomicLong> b(a0<Number> a0Var) {
        return new d(a0Var).nullSafe();
    }

    public static a0<AtomicLongArray> c(a0<Number> a0Var) {
        return new e(a0Var).nullSafe();
    }

    public static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static a0<Number> q(v vVar) {
        return vVar == v.f21748a ? TypeAdapters.LONG : new c();
    }

    public l A(Object obj) {
        return obj == null ? n.f21745a : B(obj, obj.getClass());
    }

    public l B(Object obj, Type type) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        w(obj, type, jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    public final a0<Number> e(boolean z10) {
        return z10 ? TypeAdapters.DOUBLE : new a();
    }

    public final a0<Number> f(boolean z10) {
        return z10 ? TypeAdapters.FLOAT : new b();
    }

    public <T> T g(JsonReader jsonReader, TypeToken<T> typeToken) {
        boolean z10;
        x strictness = jsonReader.getStrictness();
        x xVar = this.f21708n;
        if (xVar != null) {
            jsonReader.setStrictness(xVar);
        } else if (jsonReader.getStrictness() == x.LEGACY_STRICT) {
            jsonReader.setStrictness(x.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        jsonReader.peek();
                        z10 = false;
                        try {
                            a0<T> n10 = n(typeToken);
                            T read = n10.read(jsonReader);
                            Class wrap = Primitives.wrap(typeToken.getRawType());
                            if (read != null && !wrap.isInstance(read)) {
                                throw new ClassCastException("Type adapter '" + n10 + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + read.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            return read;
                        } catch (EOFException e10) {
                            e = e10;
                            if (!z10) {
                                throw new u(e);
                            }
                            jsonReader.setStrictness(strictness);
                            return null;
                        }
                    } catch (EOFException e11) {
                        e = e11;
                        z10 = true;
                    }
                } catch (IOException e12) {
                    throw new u(e12);
                }
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e13.getMessage(), e13);
            } catch (IllegalStateException e14) {
                throw new u(e14);
            }
        } finally {
            jsonReader.setStrictness(strictness);
        }
    }

    public <T> T h(Reader reader, TypeToken<T> typeToken) {
        JsonReader r8 = r(reader);
        T t8 = (T) g(r8, typeToken);
        a(t8, r8);
        return t8;
    }

    public <T> T i(String str, TypeToken<T> typeToken) {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), typeToken);
    }

    public <T> T j(String str, Class<T> cls) {
        return (T) i(str, TypeToken.get((Class) cls));
    }

    public <T> T k(String str, Type type) {
        return (T) i(str, TypeToken.get(type));
    }

    public <T> T l(l lVar, TypeToken<T> typeToken) {
        if (lVar == null) {
            return null;
        }
        return (T) g(new JsonTreeReader(lVar), typeToken);
    }

    public <T> T m(l lVar, Type type) {
        return (T) l(lVar, TypeToken.get(type));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r2.a(r4);
        r0.put(r7, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> jg.a0<T> n(com.google.gson.reflect.TypeToken<T> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap<com.google.gson.reflect.TypeToken<?>, jg.a0<?>> r0 = r6.b
            java.lang.Object r0 = r0.get(r7)
            jg.a0 r0 = (jg.a0) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, jg.a0<?>>> r0 = r6.f21696a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, jg.a0<?>>> r1 = r6.f21696a
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            jg.a0 r1 = (jg.a0) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            jg.f$f r2 = new jg.f$f     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List<jg.b0> r3 = r6.f21699e     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            jg.b0 r4 = (jg.b0) r4     // Catch: java.lang.Throwable -> L58
            jg.a0 r4 = r4.create(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.a(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, jg.a0<?>>> r2 = r6.f21696a
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap<com.google.gson.reflect.TypeToken<?>, jg.a0<?>> r7 = r6.b
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.13.2) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, jg.a0<?>>> r0 = r6.f21696a
            r0.remove()
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.f.n(com.google.gson.reflect.TypeToken):jg.a0");
    }

    public <T> a0<T> o(Class<T> cls) {
        return n(TypeToken.get((Class) cls));
    }

    public <T> a0<T> p(b0 b0Var, TypeToken<T> typeToken) {
        Objects.requireNonNull(b0Var, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        if (this.f21698d.isClassJsonAdapterFactory(typeToken, b0Var)) {
            b0Var = this.f21698d;
        }
        boolean z10 = false;
        for (b0 b0Var2 : this.f21699e) {
            if (z10) {
                a0<T> create = b0Var2.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            } else if (b0Var2 == b0Var) {
                z10 = true;
            }
        }
        if (!z10) {
            return n(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    public JsonReader r(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        x xVar = this.f21708n;
        if (xVar == null) {
            xVar = x.LEGACY_STRICT;
        }
        jsonReader.setStrictness(xVar);
        return jsonReader;
    }

    public JsonWriter s(Writer writer) {
        if (this.f21705k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setFormattingStyle(this.f21707m);
        jsonWriter.setHtmlSafe(this.f21706l);
        x xVar = this.f21708n;
        if (xVar == null) {
            xVar = x.LEGACY_STRICT;
        }
        jsonWriter.setStrictness(xVar);
        jsonWriter.setSerializeNulls(this.f21703i);
        return jsonWriter;
    }

    public String t(Object obj) {
        return obj == null ? v(n.f21745a) : u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f21703i + ",factories:" + this.f21699e + ",instanceCreators:" + this.f21697c + "}";
    }

    public String u(Object obj, Type type) {
        StringBuilder sb2 = new StringBuilder();
        x(obj, type, sb2);
        return sb2.toString();
    }

    public String v(l lVar) {
        StringBuilder sb2 = new StringBuilder();
        z(lVar, sb2);
        return sb2.toString();
    }

    public void w(Object obj, Type type, JsonWriter jsonWriter) {
        a0 n10 = n(TypeToken.get(type));
        x strictness = jsonWriter.getStrictness();
        x xVar = this.f21708n;
        if (xVar != null) {
            jsonWriter.setStrictness(xVar);
        } else if (jsonWriter.getStrictness() == x.LEGACY_STRICT) {
            jsonWriter.setStrictness(x.LENIENT);
        }
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f21706l);
        jsonWriter.setSerializeNulls(this.f21703i);
        try {
            try {
                try {
                    n10.write(jsonWriter, obj);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                throw new m(e11);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void x(Object obj, Type type, Appendable appendable) {
        try {
            w(obj, type, s(Streams.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public void y(l lVar, JsonWriter jsonWriter) {
        x strictness = jsonWriter.getStrictness();
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f21706l);
        jsonWriter.setSerializeNulls(this.f21703i);
        x xVar = this.f21708n;
        if (xVar != null) {
            jsonWriter.setStrictness(xVar);
        } else if (jsonWriter.getStrictness() == x.LEGACY_STRICT) {
            jsonWriter.setStrictness(x.LENIENT);
        }
        try {
            try {
                Streams.write(lVar, jsonWriter);
            } catch (IOException e10) {
                throw new m(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void z(l lVar, Appendable appendable) {
        try {
            y(lVar, s(Streams.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public f(Excluder excluder, jg.d dVar, Map<Type, h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, jg.e eVar, x xVar, boolean z14, boolean z15, v vVar, String str, int i10, int i11, List<b0> list, List<b0> list2, List<b0> list3, z zVar, z zVar2, List<w> list4) {
        this.f21696a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f21700f = excluder;
        this.f21701g = dVar;
        this.f21702h = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map, z15, list4);
        this.f21697c = constructorConstructor;
        this.f21703i = z10;
        this.f21704j = z11;
        this.f21705k = z12;
        this.f21706l = z13;
        this.f21707m = eVar;
        this.f21708n = xVar;
        this.f21709o = z14;
        this.f21710p = z15;
        this.f21714t = vVar;
        this.f21711q = str;
        this.f21712r = i10;
        this.f21713s = i11;
        this.f21715u = list;
        this.f21716v = list2;
        this.f21717w = zVar;
        this.f21718x = zVar2;
        this.f21719y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(ObjectTypeAdapter.getFactory(zVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.STRING_FACTORY);
        arrayList.add(TypeAdapters.INTEGER_FACTORY);
        arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.BYTE_FACTORY);
        arrayList.add(TypeAdapters.SHORT_FACTORY);
        a0<Number> q10 = q(vVar);
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, q10));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, e(z14)));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, f(z14)));
        arrayList.add(NumberTypeAdapter.getFactory(zVar2));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, b(q10)));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, c(q10)));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
        arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
        arrayList.add(TypeAdapters.newFactory(LazilyParsedNumber.class, TypeAdapters.LAZILY_PARSED_NUMBER));
        arrayList.add(TypeAdapters.URL_FACTORY);
        arrayList.add(TypeAdapters.URI_FACTORY);
        arrayList.add(TypeAdapters.UUID_FACTORY);
        arrayList.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList.add(TypeAdapters.LOCALE_FACTORY);
        arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList.add(DefaultDateTypeAdapter.DEFAULT_STYLE_FACTORY);
        arrayList.add(TypeAdapters.CALENDAR_FACTORY);
        if (SqlTypesSupport.SUPPORTS_SQL_TYPES) {
            arrayList.add(SqlTypesSupport.TIME_FACTORY);
            arrayList.add(SqlTypesSupport.DATE_FACTORY);
            arrayList.add(SqlTypesSupport.TIMESTAMP_FACTORY);
        }
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CLASS_FACTORY);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f21698d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.ENUM_FACTORY);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f21699e = Collections.unmodifiableList(arrayList);
    }
}
