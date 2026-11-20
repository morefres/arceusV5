package tf;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import rf.f;
import rf.g;
import rf.h;

/* loaded from: classes2.dex */
public final class d implements sf.b<d> {

    /* renamed from: e, reason: collision with root package name */
    public static final rf.e<Object> f32169e = new rf.e() { // from class: tf.a
        @Override // rf.b
        public final void encode(Object obj, f fVar) {
            d.b(obj, fVar);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final g<String> f32170f = new g() { // from class: tf.b
        @Override // rf.b
        public final void encode(Object obj, h hVar) {
            hVar.add((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final g<Boolean> f32171g = new g() { // from class: tf.c
        @Override // rf.b
        public final void encode(Object obj, h hVar) {
            hVar.add(((Boolean) obj).booleanValue());
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static final b f32172h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, rf.e<?>> f32173a = new HashMap();
    public final Map<Class<?>, g<?>> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public rf.e<Object> f32174c = f32169e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32175d = false;

    public class a implements rf.a {
        public a() {
        }

        @Override // rf.a
        public void a(@NonNull Object obj, @NonNull Writer writer) {
            e eVar = new e(writer, d.this.f32173a, d.this.b, d.this.f32174c, d.this.f32175d);
            eVar.c(obj, false);
            eVar.k();
        }

        @Override // rf.a
        public String b(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    public static final class b implements g<Date> {

        /* renamed from: a, reason: collision with root package name */
        public static final DateFormat f32177a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f32177a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // rf.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(@NonNull Date date, @NonNull h hVar) {
            hVar.add(f32177a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        l(String.class, f32170f);
        l(Boolean.class, f32171g);
        l(Date.class, f32172h);
    }

    public static /* synthetic */ void b(Object obj, f fVar) {
        throw new rf.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    public rf.a h() {
        return new a();
    }

    @NonNull
    public d i(@NonNull sf.a aVar) {
        aVar.configure(this);
        return this;
    }

    @NonNull
    public d j(boolean z10) {
        this.f32175d = z10;
        return this;
    }

    @Override // sf.b
    @NonNull
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public <T> d registerEncoder(@NonNull Class<T> cls, @NonNull rf.e<? super T> eVar) {
        this.f32173a.put(cls, eVar);
        this.b.remove(cls);
        return this;
    }

    @NonNull
    public <T> d l(@NonNull Class<T> cls, @NonNull g<? super T> gVar) {
        this.b.put(cls, gVar);
        this.f32173a.remove(cls);
        return this;
    }
}
