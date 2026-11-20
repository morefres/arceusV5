package vk;

import android.os.Handler;
import android.os.Looper;
import iv.e;
import iv.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class c extends e.a {

    /* renamed from: a, reason: collision with root package name */
    public Executor f33459a;

    public class a implements e<Object, iv.d<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f33460a;

        public a(Type type) {
            this.f33460a = type;
        }

        @Override // iv.e
        public Type a() {
            return this.f33460a;
        }

        @Override // iv.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public iv.d<Object> b(iv.d<Object> dVar) {
            return new vk.b(c.this.f33459a, dVar);
        }
    }

    public static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f33461a;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f33461a.post(runnable);
        }

        public b() {
            this.f33461a = new Handler(Looper.getMainLooper());
        }
    }

    public c(Executor executor) {
        this.f33459a = executor;
    }

    public static c e() {
        return new c(new b());
    }

    @Override // iv.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != iv.d.class) {
            return null;
        }
        return new a(e.a.b(0, (ParameterizedType) type));
    }
}
