package uf;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import uf.h;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, rf.e<?>> f32689a;
    public final Map<Class<?>, rf.g<?>> b;

    /* renamed from: c, reason: collision with root package name */
    public final rf.e<Object> f32690c;

    public static final class a implements sf.b<a> {

        /* renamed from: d, reason: collision with root package name */
        public static final rf.e<Object> f32691d = new rf.e() { // from class: uf.g
            @Override // rf.b
            public final void encode(Object obj, rf.f fVar) {
                h.a.a(obj, fVar);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, rf.e<?>> f32692a = new HashMap();
        public final Map<Class<?>, rf.g<?>> b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public rf.e<Object> f32693c = f32691d;

        public static /* synthetic */ void a(Object obj, rf.f fVar) {
            throw new rf.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h b() {
            return new h(new HashMap(this.f32692a), new HashMap(this.b), this.f32693c);
        }

        @NonNull
        public a c(@NonNull sf.a aVar) {
            aVar.configure(this);
            return this;
        }

        @Override // sf.b
        @NonNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public <U> a registerEncoder(@NonNull Class<U> cls, @NonNull rf.e<? super U> eVar) {
            this.f32692a.put(cls, eVar);
            this.b.remove(cls);
            return this;
        }
    }

    public h(Map<Class<?>, rf.e<?>> map, Map<Class<?>, rf.g<?>> map2, rf.e<Object> eVar) {
        this.f32689a = map;
        this.b = map2;
        this.f32690c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(@NonNull Object obj, @NonNull OutputStream outputStream) {
        new f(outputStream, this.f32689a, this.b, this.f32690c).n(obj);
    }

    @NonNull
    public byte[] c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
