package iv;

import iv.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class b extends h.a {

    public static final class a implements h<ResponseBody, ResponseBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f21129a = new a();

        @Override // iv.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody a(ResponseBody responseBody) {
            try {
                return c0.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: iv.b$b, reason: collision with other inner class name */
    public static final class C0369b implements h<RequestBody, RequestBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0369b f21130a = new C0369b();

        @Override // iv.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RequestBody a(RequestBody requestBody) {
            return requestBody;
        }
    }

    public static final class c implements h<ResponseBody, ResponseBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f21131a = new c();

        @Override // iv.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    public static final class d implements h<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f21132a = new d();

        @Override // iv.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements h<ResponseBody, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f21133a = new e();

        @Override // iv.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Unit a(ResponseBody responseBody) {
            responseBody.close();
            return Unit.f22894a;
        }
    }

    public static final class f implements h<ResponseBody, Void> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f21134a = new f();

        @Override // iv.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // iv.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        if (RequestBody.class.isAssignableFrom(c0.h(type))) {
            return C0369b.f21130a;
        }
        return null;
    }

    @Override // iv.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (type == ResponseBody.class) {
            return c0.l(annotationArr, lv.w.class) ? c.f21131a : a.f21129a;
        }
        if (type == Void.class) {
            return f.f21134a;
        }
        if (c0.m(type)) {
            return e.f21133a;
        }
        return null;
    }
}
