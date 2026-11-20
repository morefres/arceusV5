package iv;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public abstract class s<T> {

    public class a extends s<Iterable<T>> {
        public a() {
        }

        @Override // iv.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                s.this.a(vVar, it.next());
            }
        }
    }

    public class b extends s<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // iv.s
        public void a(v vVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                s.this.a(vVar, Array.get(obj, i10));
            }
        }
    }

    public static final class c<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f21194a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final iv.h<T, RequestBody> f21195c;

        public c(Method method, int i10, iv.h<T, RequestBody> hVar) {
            this.f21194a = method;
            this.b = i10;
            this.f21195c = hVar;
        }

        @Override // iv.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                throw c0.p(this.f21194a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                vVar.l(this.f21195c.a(t8));
            } catch (IOException e10) {
                throw c0.q(this.f21194a, e10, this.b, "Unable to convert " + t8 + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class d<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f21196a;
        public final iv.h<T, String> b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f21197c;

        public d(String str, iv.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f21196a = str;
            this.b = hVar;
            this.f21197c = z10;
        }

        @Override // iv.s
        public void a(v vVar, T t8) {
            String a10;
            if (t8 == null || (a10 = this.b.a(t8)) == null) {
                return;
            }
            vVar.a(this.f21196a, a10, this.f21197c);
        }
    }

    public static final class e<T> extends s<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f21198a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final iv.h<T, String> f21199c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f21200d;

        public e(Method method, int i10, iv.h<T, String> hVar, boolean z10) {
            this.f21198a = method;
            this.b = i10;
            this.f21199c = hVar;
            this.f21200d = z10;
        }

        @Override // iv.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f21198a, this.b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f21198a, this.b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f21198a, this.b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String a10 = this.f21199c.a(value);
                if (a10 == null) {
                    throw c0.p(this.f21198a, this.b, "Field map value '" + value + "' converted to null by " + this.f21199c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                vVar.a(key, a10, this.f21200d);
            }
        }
    }

    public static final class f<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f21201a;
        public final iv.h<T, String> b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f21202c;

        public f(String str, iv.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f21201a = str;
            this.b = hVar;
            this.f21202c = z10;
        }

        @Override // iv.s
        public void a(v vVar, T t8) {
            String a10;
            if (t8 == null || (a10 = this.b.a(t8)) == null) {
                return;
            }
            vVar.b(this.f21201a, a10, this.f21202c);
        }
    }

    public static final class g<T> extends s<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f21203a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final iv.h<T, String> f21204c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f21205d;

        public g(Method method, int i10, iv.h<T, String> hVar, boolean z10) {
            this.f21203a = method;
            this.b = i10;
            this.f21204c = hVar;
            this.f21205d = z10;
        }

        @Override // iv.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f21203a, this.b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f21203a, this.b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f21203a, this.b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                vVar.b(key, this.f21204c.a(value), this.f21205d);
            }
        }
    }

    public static final class h extends s<Headers> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f21206a;
        public final int b;

        public h(Method method, int i10) {
            this.f21206a = method;
            this.b = i10;
        }

        @Override // iv.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Headers headers) {
            if (headers == null) {
                throw c0.p(this.f21206a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            vVar.c(headers);
        }
    }

    public static final class i<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f21207a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final Headers f21208c;

        /* renamed from: d, reason: collision with root package name */
        public final iv.h<T, RequestBody> f21209d;

        public i(Method method, int i10, Headers headers, iv.h<T, RequestBody> hVar) {
            this.f21207a = method;
            this.b = i10;
            this.f21208c = headers;
            this.f21209d = hVar;
        }

        @Override // iv.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                return;
            }
            try {
                vVar.d(this.f21208c, this.f21209d.a(t8));
            } catch (IOException e10) {
                throw c0.p(this.f21207a, this.b, "Unable to convert " + t8 + " to RequestBody", e10);
            }
        }
    }

    public static final class j<T> extends s<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f21210a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final iv.h<T, RequestBody> f21211c;

        /* renamed from: d, reason: collision with root package name */
        public final String f21212d;

        public j(Method method, int i10, iv.h<T, RequestBody> hVar, String str) {
            this.f21210a = method;
            this.b = i10;
            this.f21211c = hVar;
            this.f21212d = str;
        }

        @Override // iv.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f21210a, this.b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f21210a, this.b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f21210a, this.b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                vVar.d(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f21212d), this.f21211c.a(value));
            }
        }
    }

    public static final class k<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f21213a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21214c;

        /* renamed from: d, reason: collision with root package name */
        public final iv.h<T, String> f21215d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f21216e;

        public k(Method method, int i10, String str, iv.h<T, String> hVar, boolean z10) {
            this.f21213a = method;
            this.b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f21214c = str;
            this.f21215d = hVar;
            this.f21216e = z10;
        }

        @Override // iv.s
        public void a(v vVar, T t8) {
            if (t8 != null) {
                vVar.f(this.f21214c, this.f21215d.a(t8), this.f21216e);
                return;
            }
            throw c0.p(this.f21213a, this.b, "Path parameter \"" + this.f21214c + "\" value must not be null.", new Object[0]);
        }
    }

    public static final class l<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f21217a;
        public final iv.h<T, String> b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f21218c;

        public l(String str, iv.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f21217a = str;
            this.b = hVar;
            this.f21218c = z10;
        }

        @Override // iv.s
        public void a(v vVar, T t8) {
            String a10;
            if (t8 == null || (a10 = this.b.a(t8)) == null) {
                return;
            }
            vVar.g(this.f21217a, a10, this.f21218c);
        }
    }

    public static final class m<T> extends s<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f21219a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final iv.h<T, String> f21220c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f21221d;

        public m(Method method, int i10, iv.h<T, String> hVar, boolean z10) {
            this.f21219a = method;
            this.b = i10;
            this.f21220c = hVar;
            this.f21221d = z10;
        }

        @Override // iv.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f21219a, this.b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f21219a, this.b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f21219a, this.b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String a10 = this.f21220c.a(value);
                if (a10 == null) {
                    throw c0.p(this.f21219a, this.b, "Query map value '" + value + "' converted to null by " + this.f21220c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                vVar.g(key, a10, this.f21221d);
            }
        }
    }

    public static final class n<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final iv.h<T, String> f21222a;
        public final boolean b;

        public n(iv.h<T, String> hVar, boolean z10) {
            this.f21222a = hVar;
            this.b = z10;
        }

        @Override // iv.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                return;
            }
            vVar.g(this.f21222a.a(t8), null, this.b);
        }
    }

    public static final class o extends s<MultipartBody.Part> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f21223a = new o();

        @Override // iv.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, MultipartBody.Part part) {
            if (part != null) {
                vVar.e(part);
            }
        }
    }

    public static final class p extends s<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f21224a;
        public final int b;

        public p(Method method, int i10) {
            this.f21224a = method;
            this.b = i10;
        }

        @Override // iv.s
        public void a(v vVar, Object obj) {
            if (obj == null) {
                throw c0.p(this.f21224a, this.b, "@Url parameter is null.", new Object[0]);
            }
            vVar.m(obj);
        }
    }

    public static final class q<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f21225a;

        public q(Class<T> cls) {
            this.f21225a = cls;
        }

        @Override // iv.s
        public void a(v vVar, T t8) {
            vVar.h(this.f21225a, t8);
        }
    }

    public abstract void a(v vVar, T t8);

    public final s<Object> b() {
        return new b();
    }

    public final s<Iterable<T>> c() {
        return new a();
    }
}
