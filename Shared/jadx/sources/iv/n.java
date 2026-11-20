package iv;

import iv.c0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public abstract class n<ResponseT, ReturnT> extends z<ReturnT> {

    /* renamed from: a, reason: collision with root package name */
    public final w f21158a;
    public final Call.Factory b;

    /* renamed from: c, reason: collision with root package name */
    public final h<ResponseBody, ResponseT> f21159c;

    public static final class a<ResponseT, ReturnT> extends n<ResponseT, ReturnT> {

        /* renamed from: d, reason: collision with root package name */
        public final e<ResponseT, ReturnT> f21160d;

        public a(w wVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(wVar, factory, hVar);
            this.f21160d = eVar;
        }

        @Override // iv.n
        public ReturnT c(d<ResponseT> dVar, Object[] objArr) {
            return this.f21160d.b(dVar);
        }
    }

    public static final class b<ResponseT> extends n<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f21161d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f21162e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f21163f;

        public b(w wVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar, boolean z10, boolean z11) {
            super(wVar, factory, hVar);
            this.f21161d = eVar;
            this.f21162e = z10;
            this.f21163f = z11;
        }

        @Override // iv.n
        public Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> b = this.f21161d.b(dVar);
            mt.b bVar = (mt.b) objArr[objArr.length - 1];
            try {
                return this.f21163f ? p.d(b, bVar) : this.f21162e ? p.b(b, bVar) : p.a(b, bVar);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th2) {
                return p.e(th2, bVar);
            }
        }
    }

    public static final class c<ResponseT> extends n<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f21164d;

        public c(w wVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(wVar, factory, hVar);
            this.f21164d = eVar;
        }

        @Override // iv.n
        public Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> b = this.f21164d.b(dVar);
            mt.b bVar = (mt.b) objArr[objArr.length - 1];
            try {
                return p.c(b, bVar);
            } catch (Exception e10) {
                return p.e(e10, bVar);
            }
        }
    }

    public n(w wVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar) {
        this.f21158a = wVar;
        this.b = factory;
        this.f21159c = hVar;
    }

    public static <ResponseT, ReturnT> e<ResponseT, ReturnT> d(y yVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (e<ResponseT, ReturnT>) yVar.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw c0.o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> h<ResponseBody, ResponseT> e(y yVar, Method method, Type type) {
        try {
            return yVar.i(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw c0.o(method, e10, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> n<ResponseT, ReturnT> f(y yVar, Method method, w wVar) {
        Type genericReturnType;
        boolean z10;
        boolean z11;
        boolean m10;
        boolean z12 = wVar.f21251l;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f10 = c0.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (c0.h(f10) == x.class && (f10 instanceof ParameterizedType)) {
                f10 = c0.g(0, (ParameterizedType) f10);
                m10 = false;
                z10 = true;
            } else {
                if (c0.h(f10) == d.class) {
                    throw c0.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", c0.g(0, (ParameterizedType) f10));
                }
                m10 = c0.m(f10);
                z10 = false;
            }
            genericReturnType = new c0.b(null, d.class, f10);
            annotations = b0.a(annotations);
            z11 = m10;
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
            z11 = false;
        }
        e d10 = d(yVar, method, genericReturnType, annotations);
        Type a10 = d10.a();
        if (a10 == Response.class) {
            throw c0.n(method, "'" + c0.h(a10).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (a10 == x.class) {
            throw c0.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (wVar.f21243d.equals("HEAD") && !Void.class.equals(a10) && !c0.m(a10)) {
            throw c0.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        h e10 = e(yVar, method, a10);
        Call.Factory factory = yVar.b;
        return !z12 ? new a(wVar, factory, e10, d10) : z10 ? new c(wVar, factory, e10, d10) : new b(wVar, factory, e10, d10, false, z11);
    }

    @Override // iv.z
    public final ReturnT a(Object obj, Object[] objArr) {
        return c(new q(this.f21158a, obj, objArr, this.b, this.f21159c), objArr);
    }

    public abstract ReturnT c(d<ResponseT> dVar, Object[] objArr);
}
