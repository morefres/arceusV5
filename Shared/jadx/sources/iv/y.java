package iv;

import iv.b;
import iv.e;
import iv.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<Method, Object> f21279a = new ConcurrentHashMap<>();
    public final Call.Factory b;

    /* renamed from: c, reason: collision with root package name */
    public final HttpUrl f21280c;

    /* renamed from: d, reason: collision with root package name */
    public final List<h.a> f21281d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21282e;

    /* renamed from: f, reason: collision with root package name */
    public final List<e.a> f21283f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21284g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f21285h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f21286i;

    public class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f21287a = new Object[0];
        public final /* synthetic */ Class b;

        public a(Class cls) {
            this.b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f21287a;
            }
            u uVar = t.b;
            return uVar.c(method) ? uVar.b(method, this.b, obj, objArr) : y.this.c(this.b, method).a(obj, objArr);
        }
    }

    public y(Call.Factory factory, HttpUrl httpUrl, List<h.a> list, int i10, List<e.a> list2, int i11, Executor executor, boolean z10) {
        this.b = factory;
        this.f21280c = httpUrl;
        this.f21281d = list;
        this.f21282e = i10;
        this.f21283f = list2;
        this.f21284g = i11;
        this.f21285h = executor;
        this.f21286i = z10;
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr) {
        return e(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        k(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public z<?> c(Class<?> cls, Method method) {
        while (true) {
            Object obj = this.f21279a.get(method);
            if (obj instanceof z) {
                return (z) obj;
            }
            if (obj == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    try {
                        obj = this.f21279a.putIfAbsent(method, obj2);
                        if (obj == null) {
                            try {
                                z<?> b10 = z.b(this, cls, method);
                                this.f21279a.put(method, b10);
                                return b10;
                            } catch (Throwable th2) {
                                this.f21279a.remove(method);
                                throw th2;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (obj) {
                try {
                    Object obj3 = this.f21279a.get(method);
                    if (obj3 != null) {
                        return (z) obj3;
                    }
                } finally {
                }
            }
        }
    }

    public b d() {
        return new b(this);
    }

    public e<?, ?> e(e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f21283f.indexOf(aVar) + 1;
        int size = this.f21283f.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            e<?, ?> a10 = this.f21283f.get(i10).a(type, annotationArr, this);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f21283f.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f21283f.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f21283f.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, RequestBody> f(h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f21281d.indexOf(aVar) + 1;
        int size = this.f21281d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            h<T, RequestBody> hVar = (h<T, RequestBody>) this.f21281d.get(i10).c(type, annotationArr, annotationArr2, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f21281d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f21281d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f21281d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<ResponseBody, T> g(h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f21281d.indexOf(aVar) + 1;
        int size = this.f21281d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            h<ResponseBody, T> hVar = (h<ResponseBody, T>) this.f21281d.get(i10).d(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f21281d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f21281d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f21281d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, RequestBody> h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return f(null, type, annotationArr, annotationArr2);
    }

    public <T> h<ResponseBody, T> i(Type type, Annotation[] annotationArr) {
        return g(null, type, annotationArr);
    }

    public <T> h<T, String> j(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f21281d.size();
        for (int i10 = 0; i10 < size; i10++) {
            h<T, String> hVar = (h<T, String>) this.f21281d.get(i10).e(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        return b.d.f21132a;
    }

    public final void k(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f21286i) {
            u uVar = t.b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!uVar.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    c(cls, method);
                }
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Call.Factory f21289a;
        public HttpUrl b;

        /* renamed from: c, reason: collision with root package name */
        public final List<h.a> f21290c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final List<e.a> f21291d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public Executor f21292e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f21293f;

        public b() {
        }

        public b a(e.a aVar) {
            List<e.a> list = this.f21291d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(h.a aVar) {
            List<h.a> list = this.f21290c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return d(HttpUrl.get(str));
        }

        public b d(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            if ("".equals(httpUrl.pathSegments().get(r0.size() - 1))) {
                this.b = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public y e() {
            if (this.b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory factory = this.f21289a;
            if (factory == null) {
                factory = new OkHttpClient();
            }
            Call.Factory factory2 = factory;
            Executor executor = this.f21292e;
            if (executor == null) {
                executor = t.f21226a;
            }
            Executor executor2 = executor;
            c cVar = t.f21227c;
            ArrayList arrayList = new ArrayList(this.f21291d);
            List<? extends e.a> a10 = cVar.a(executor2);
            arrayList.addAll(a10);
            List<? extends h.a> b = cVar.b();
            int size = b.size();
            ArrayList arrayList2 = new ArrayList(this.f21290c.size() + 1 + size);
            arrayList2.add(new iv.b());
            arrayList2.addAll(this.f21290c);
            arrayList2.addAll(b);
            return new y(factory2, this.b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), a10.size(), executor2, this.f21293f);
        }

        public b f(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f21289a = factory;
            return this;
        }

        public b g(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return f(okHttpClient);
        }

        public b(y yVar) {
            this.f21289a = yVar.b;
            this.b = yVar.f21280c;
            int size = yVar.f21281d.size() - yVar.f21282e;
            for (int i10 = 1; i10 < size; i10++) {
                this.f21290c.add(yVar.f21281d.get(i10));
            }
            int size2 = yVar.f21283f.size() - yVar.f21284g;
            for (int i11 = 0; i11 < size2; i11++) {
                this.f21291d.add(yVar.f21283f.get(i11));
            }
            this.f21292e = yVar.f21285h;
            this.f21293f = yVar.f21286i;
        }
    }
}
