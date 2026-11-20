package iv;

import iv.s;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f21241a;
    public final Method b;

    /* renamed from: c, reason: collision with root package name */
    public final HttpUrl f21242c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21243d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21244e;

    /* renamed from: f, reason: collision with root package name */
    public final Headers f21245f;

    /* renamed from: g, reason: collision with root package name */
    public final MediaType f21246g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21247h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f21248i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f21249j;

    /* renamed from: k, reason: collision with root package name */
    public final s<?>[] f21250k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21251l;

    public static final class a {

        /* renamed from: y, reason: collision with root package name */
        public static final Pattern f21252y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z, reason: collision with root package name */
        public static final Pattern f21253z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a, reason: collision with root package name */
        public final y f21254a;
        public final Class<?> b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f21255c;

        /* renamed from: d, reason: collision with root package name */
        public final Annotation[] f21256d;

        /* renamed from: e, reason: collision with root package name */
        public final Annotation[][] f21257e;

        /* renamed from: f, reason: collision with root package name */
        public final Type[] f21258f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f21259g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f21260h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f21261i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f21262j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f21263k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f21264l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f21265m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f21266n;

        /* renamed from: o, reason: collision with root package name */
        public String f21267o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f21268p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f21269q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f21270r;

        /* renamed from: s, reason: collision with root package name */
        public String f21271s;

        /* renamed from: t, reason: collision with root package name */
        public Headers f21272t;

        /* renamed from: u, reason: collision with root package name */
        public MediaType f21273u;

        /* renamed from: v, reason: collision with root package name */
        public Set<String> f21274v;

        /* renamed from: w, reason: collision with root package name */
        public s<?>[] f21275w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f21276x;

        public a(y yVar, Class<?> cls, Method method) {
            this.f21254a = yVar;
            this.b = cls;
            this.f21255c = method;
            this.f21256d = method.getAnnotations();
            this.f21258f = method.getGenericParameterTypes();
            this.f21257e = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public static Set<String> h(String str) {
            Matcher matcher = f21252y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public w b() {
            for (Annotation annotation : this.f21256d) {
                e(annotation);
            }
            if (this.f21267o == null) {
                throw c0.n(this.f21255c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f21268p) {
                if (this.f21270r) {
                    throw c0.n(this.f21255c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f21269q) {
                    throw c0.n(this.f21255c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f21257e.length;
            this.f21275w = new s[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f21275w[i11] = f(i11, this.f21258f[i11], this.f21257e[i11], i11 == i10);
                i11++;
            }
            if (this.f21271s == null && !this.f21266n) {
                throw c0.n(this.f21255c, "Missing either @%s URL or @Url parameter.", this.f21267o);
            }
            boolean z10 = this.f21269q;
            if (!z10 && !this.f21270r && !this.f21268p && this.f21261i) {
                throw c0.n(this.f21255c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f21259g) {
                throw c0.n(this.f21255c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f21270r || this.f21260h) {
                return new w(this);
            }
            throw c0.n(this.f21255c, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final Headers c(String[] strArr, boolean z10) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw c0.n(this.f21255c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f21273u = MediaType.get(trim);
                    } catch (IllegalArgumentException e10) {
                        throw c0.o(this.f21255c, e10, "Malformed content type: %s", trim);
                    }
                } else if (z10) {
                    builder.addUnsafeNonAscii(substring, trim);
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        public final void d(String str, String str2, boolean z10) {
            String str3 = this.f21267o;
            if (str3 != null) {
                throw c0.n(this.f21255c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f21267o = str;
            this.f21268p = z10;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f21252y.matcher(substring).find()) {
                    throw c0.n(this.f21255c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f21271s = str2;
            this.f21274v = h(str2);
        }

        public final void e(Annotation annotation) {
            if (annotation instanceof lv.b) {
                d("DELETE", ((lv.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof lv.f) {
                d("GET", ((lv.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof lv.g) {
                d("HEAD", ((lv.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof lv.n) {
                d("PATCH", ((lv.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof lv.o) {
                d("POST", ((lv.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof lv.p) {
                d("PUT", ((lv.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof lv.m) {
                d("OPTIONS", ((lv.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof lv.h) {
                lv.h hVar = (lv.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof lv.k) {
                lv.k kVar = (lv.k) annotation;
                String[] value = kVar.value();
                if (value.length == 0) {
                    throw c0.n(this.f21255c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f21272t = c(value, kVar.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof lv.l) {
                if (this.f21269q) {
                    throw c0.n(this.f21255c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f21270r = true;
            } else if (annotation instanceof lv.e) {
                if (this.f21270r) {
                    throw c0.n(this.f21255c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f21269q = true;
            }
        }

        public final s<?> f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            s<?> sVar;
            if (annotationArr != null) {
                sVar = null;
                for (Annotation annotation : annotationArr) {
                    s<?> g10 = g(i10, type, annotationArr, annotation);
                    if (g10 != null) {
                        if (sVar != null) {
                            throw c0.p(this.f21255c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        sVar = g10;
                    }
                }
            } else {
                sVar = null;
            }
            if (sVar != null) {
                return sVar;
            }
            if (z10) {
                try {
                    if (c0.h(type) == mt.b.class) {
                        this.f21276x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw c0.p(this.f21255c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        public final s<?> g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof lv.y) {
                j(i10, type);
                if (this.f21266n) {
                    throw c0.p(this.f21255c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f21262j) {
                    throw c0.p(this.f21255c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f21263k) {
                    throw c0.p(this.f21255c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f21264l) {
                    throw c0.p(this.f21255c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f21265m) {
                    throw c0.p(this.f21255c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f21271s != null) {
                    throw c0.p(this.f21255c, i10, "@Url cannot be used with @%s URL", this.f21267o);
                }
                this.f21266n = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new s.p(this.f21255c, i10);
                }
                throw c0.p(this.f21255c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof lv.s) {
                j(i10, type);
                if (this.f21263k) {
                    throw c0.p(this.f21255c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f21264l) {
                    throw c0.p(this.f21255c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f21265m) {
                    throw c0.p(this.f21255c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f21266n) {
                    throw c0.p(this.f21255c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f21271s == null) {
                    throw c0.p(this.f21255c, i10, "@Path can only be used with relative url on @%s", this.f21267o);
                }
                this.f21262j = true;
                lv.s sVar = (lv.s) annotation;
                String value = sVar.value();
                i(i10, value);
                return new s.k(this.f21255c, i10, value, this.f21254a.j(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof lv.t) {
                j(i10, type);
                lv.t tVar = (lv.t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> h10 = c0.h(type);
                this.f21263k = true;
                if (!Iterable.class.isAssignableFrom(h10)) {
                    if (!h10.isArray()) {
                        return new s.l(value2, this.f21254a.j(type, annotationArr), encoded);
                    }
                    return new s.l(value2, this.f21254a.j(a(h10.getComponentType()), annotationArr), encoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.l(value2, this.f21254a.j(c0.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                }
                throw c0.p(this.f21255c, i10, h10.getSimpleName() + " must include generic type (e.g., " + h10.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof lv.v) {
                j(i10, type);
                boolean encoded2 = ((lv.v) annotation).encoded();
                Class<?> h11 = c0.h(type);
                this.f21264l = true;
                if (!Iterable.class.isAssignableFrom(h11)) {
                    if (!h11.isArray()) {
                        return new s.n(this.f21254a.j(type, annotationArr), encoded2);
                    }
                    return new s.n(this.f21254a.j(a(h11.getComponentType()), annotationArr), encoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.n(this.f21254a.j(c0.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                }
                throw c0.p(this.f21255c, i10, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof lv.u) {
                j(i10, type);
                Class<?> h12 = c0.h(type);
                this.f21265m = true;
                if (!Map.class.isAssignableFrom(h12)) {
                    throw c0.p(this.f21255c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type i11 = c0.i(type, h12, Map.class);
                if (!(i11 instanceof ParameterizedType)) {
                    throw c0.p(this.f21255c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) i11;
                Type g10 = c0.g(0, parameterizedType);
                if (String.class == g10) {
                    return new s.m(this.f21255c, i10, this.f21254a.j(c0.g(1, parameterizedType), annotationArr), ((lv.u) annotation).encoded());
                }
                throw c0.p(this.f21255c, i10, "@QueryMap keys must be of type String: " + g10, new Object[0]);
            }
            if (annotation instanceof lv.i) {
                j(i10, type);
                lv.i iVar = (lv.i) annotation;
                String value3 = iVar.value();
                Class<?> h13 = c0.h(type);
                if (!Iterable.class.isAssignableFrom(h13)) {
                    if (!h13.isArray()) {
                        return new s.f(value3, this.f21254a.j(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                    }
                    return new s.f(value3, this.f21254a.j(a(h13.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.f(value3, this.f21254a.j(c0.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                }
                throw c0.p(this.f21255c, i10, h13.getSimpleName() + " must include generic type (e.g., " + h13.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof lv.j) {
                if (type == Headers.class) {
                    return new s.h(this.f21255c, i10);
                }
                j(i10, type);
                Class<?> h14 = c0.h(type);
                if (!Map.class.isAssignableFrom(h14)) {
                    throw c0.p(this.f21255c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type i12 = c0.i(type, h14, Map.class);
                if (!(i12 instanceof ParameterizedType)) {
                    throw c0.p(this.f21255c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) i12;
                Type g11 = c0.g(0, parameterizedType2);
                if (String.class == g11) {
                    return new s.g(this.f21255c, i10, this.f21254a.j(c0.g(1, parameterizedType2), annotationArr), ((lv.j) annotation).allowUnsafeNonAsciiValues());
                }
                throw c0.p(this.f21255c, i10, "@HeaderMap keys must be of type String: " + g11, new Object[0]);
            }
            if (annotation instanceof lv.c) {
                j(i10, type);
                if (!this.f21269q) {
                    throw c0.p(this.f21255c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                lv.c cVar = (lv.c) annotation;
                String value4 = cVar.value();
                boolean encoded3 = cVar.encoded();
                this.f21259g = true;
                Class<?> h15 = c0.h(type);
                if (!Iterable.class.isAssignableFrom(h15)) {
                    if (!h15.isArray()) {
                        return new s.d(value4, this.f21254a.j(type, annotationArr), encoded3);
                    }
                    return new s.d(value4, this.f21254a.j(a(h15.getComponentType()), annotationArr), encoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.d(value4, this.f21254a.j(c0.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                }
                throw c0.p(this.f21255c, i10, h15.getSimpleName() + " must include generic type (e.g., " + h15.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof lv.d) {
                j(i10, type);
                if (!this.f21269q) {
                    throw c0.p(this.f21255c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> h16 = c0.h(type);
                if (!Map.class.isAssignableFrom(h16)) {
                    throw c0.p(this.f21255c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type i13 = c0.i(type, h16, Map.class);
                if (!(i13 instanceof ParameterizedType)) {
                    throw c0.p(this.f21255c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) i13;
                Type g12 = c0.g(0, parameterizedType3);
                if (String.class == g12) {
                    h j10 = this.f21254a.j(c0.g(1, parameterizedType3), annotationArr);
                    this.f21259g = true;
                    return new s.e(this.f21255c, i10, j10, ((lv.d) annotation).encoded());
                }
                throw c0.p(this.f21255c, i10, "@FieldMap keys must be of type String: " + g12, new Object[0]);
            }
            if (!(annotation instanceof lv.q)) {
                if (annotation instanceof lv.r) {
                    j(i10, type);
                    if (!this.f21270r) {
                        throw c0.p(this.f21255c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f21260h = true;
                    Class<?> h17 = c0.h(type);
                    if (!Map.class.isAssignableFrom(h17)) {
                        throw c0.p(this.f21255c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type i14 = c0.i(type, h17, Map.class);
                    if (!(i14 instanceof ParameterizedType)) {
                        throw c0.p(this.f21255c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) i14;
                    Type g13 = c0.g(0, parameterizedType4);
                    if (String.class == g13) {
                        Type g14 = c0.g(1, parameterizedType4);
                        if (MultipartBody.Part.class.isAssignableFrom(c0.h(g14))) {
                            throw c0.p(this.f21255c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new s.j(this.f21255c, i10, this.f21254a.h(g14, annotationArr, this.f21256d), ((lv.r) annotation).encoding());
                    }
                    throw c0.p(this.f21255c, i10, "@PartMap keys must be of type String: " + g13, new Object[0]);
                }
                if (annotation instanceof lv.a) {
                    j(i10, type);
                    if (this.f21269q || this.f21270r) {
                        throw c0.p(this.f21255c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f21261i) {
                        throw c0.p(this.f21255c, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        h h18 = this.f21254a.h(type, annotationArr, this.f21256d);
                        this.f21261i = true;
                        return new s.c(this.f21255c, i10, h18);
                    } catch (RuntimeException e10) {
                        throw c0.q(this.f21255c, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof lv.x)) {
                    return null;
                }
                j(i10, type);
                Class<?> a10 = a(c0.h(type));
                for (int i15 = i10 - 1; i15 >= 0; i15--) {
                    s<?> sVar2 = this.f21275w[i15];
                    if ((sVar2 instanceof s.q) && ((s.q) sVar2).f21225a.equals(a10)) {
                        throw c0.p(this.f21255c, i10, "@Tag type " + a10.getName() + " is duplicate of " + t.b.a(this.f21255c, i15) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new s.q(a10);
            }
            j(i10, type);
            if (!this.f21270r) {
                throw c0.p(this.f21255c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            lv.q qVar = (lv.q) annotation;
            this.f21260h = true;
            String value5 = qVar.value();
            Class<?> h19 = c0.h(type);
            if (value5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(h19)) {
                    if (h19.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(h19.getComponentType())) {
                            return s.o.f21223a.b();
                        }
                        throw c0.p(this.f21255c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (MultipartBody.Part.class.isAssignableFrom(h19)) {
                        return s.o.f21223a;
                    }
                    throw c0.p(this.f21255c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (MultipartBody.Part.class.isAssignableFrom(c0.h(c0.g(0, (ParameterizedType) type)))) {
                        return s.o.f21223a.c();
                    }
                    throw c0.p(this.f21255c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw c0.p(this.f21255c, i10, h19.getSimpleName() + " must include generic type (e.g., " + h19.getSimpleName() + "<String>)", new Object[0]);
            }
            Headers of2 = Headers.of("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(h19)) {
                if (!h19.isArray()) {
                    if (MultipartBody.Part.class.isAssignableFrom(h19)) {
                        throw c0.p(this.f21255c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new s.i(this.f21255c, i10, of2, this.f21254a.h(type, annotationArr, this.f21256d));
                }
                Class<?> a11 = a(h19.getComponentType());
                if (MultipartBody.Part.class.isAssignableFrom(a11)) {
                    throw c0.p(this.f21255c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new s.i(this.f21255c, i10, of2, this.f21254a.h(a11, annotationArr, this.f21256d)).b();
            }
            if (type instanceof ParameterizedType) {
                Type g15 = c0.g(0, (ParameterizedType) type);
                if (MultipartBody.Part.class.isAssignableFrom(c0.h(g15))) {
                    throw c0.p(this.f21255c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new s.i(this.f21255c, i10, of2, this.f21254a.h(g15, annotationArr, this.f21256d)).c();
            }
            throw c0.p(this.f21255c, i10, h19.getSimpleName() + " must include generic type (e.g., " + h19.getSimpleName() + "<String>)", new Object[0]);
        }

        public final void i(int i10, String str) {
            if (!f21253z.matcher(str).matches()) {
                throw c0.p(this.f21255c, i10, "@Path parameter name must match %s. Found: %s", f21252y.pattern(), str);
            }
            if (!this.f21274v.contains(str)) {
                throw c0.p(this.f21255c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f21271s, str);
            }
        }

        public final void j(int i10, Type type) {
            if (c0.j(type)) {
                throw c0.p(this.f21255c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public w(a aVar) {
        this.f21241a = aVar.b;
        this.b = aVar.f21255c;
        this.f21242c = aVar.f21254a.f21280c;
        this.f21243d = aVar.f21267o;
        this.f21244e = aVar.f21271s;
        this.f21245f = aVar.f21272t;
        this.f21246g = aVar.f21273u;
        this.f21247h = aVar.f21268p;
        this.f21248i = aVar.f21269q;
        this.f21249j = aVar.f21270r;
        this.f21250k = aVar.f21275w;
        this.f21251l = aVar.f21276x;
    }

    public static w b(y yVar, Class<?> cls, Method method) {
        return new a(yVar, cls, method).b();
    }

    public Request a(Object obj, Object[] objArr) {
        s<?>[] sVarArr = this.f21250k;
        int length = objArr.length;
        if (length != sVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + sVarArr.length + ")");
        }
        v vVar = new v(this.f21243d, this.f21242c, this.f21244e, this.f21245f, this.f21246g, this.f21247h, this.f21248i, this.f21249j);
        if (this.f21251l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            sVarArr[i10].a(vVar, objArr[i10]);
        }
        return vVar.k().tag((Class<? super Class>) o.class, (Class) new o(this.f21241a, obj, this.b, arrayList)).build();
    }
}
