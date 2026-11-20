package tf;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import rf.f;
import rf.g;
import rf.h;

/* loaded from: classes2.dex */
public final class e implements f, h {

    /* renamed from: a, reason: collision with root package name */
    public e f32178a = null;
    public boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    public final JsonWriter f32179c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, rf.e<?>> f32180d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, g<?>> f32181e;

    /* renamed from: f, reason: collision with root package name */
    public final rf.e<Object> f32182f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32183g;

    public e(@NonNull Writer writer, @NonNull Map<Class<?>, rf.e<?>> map, @NonNull Map<Class<?>, g<?>> map2, rf.e<Object> eVar, boolean z10) {
        this.f32179c = new JsonWriter(writer);
        this.f32180d = map;
        this.f32181e = map2;
        this.f32182f = eVar;
        this.f32183g = z10;
    }

    @NonNull
    public e a(int i10) {
        o();
        this.f32179c.value(i10);
        return this;
    }

    @NonNull
    public e b(long j10) {
        o();
        this.f32179c.value(j10);
        return this;
    }

    @NonNull
    public e c(Object obj, boolean z10) {
        if (z10 && j(obj)) {
            throw new rf.c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f32179c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f32179c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f32179c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    c(it.next(), false);
                }
                this.f32179c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f32179c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new rf.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f32179c.endObject();
                return this;
            }
            rf.e<?> eVar = this.f32180d.get(obj.getClass());
            if (eVar != null) {
                return l(eVar, obj, z10);
            }
            g<?> gVar = this.f32181e.get(obj.getClass());
            if (gVar != null) {
                gVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return l(this.f32182f, obj, z10);
            }
            add(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return i((byte[]) obj);
        }
        this.f32179c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f32179c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                b(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f32179c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f32179c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                c(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                c(obj2, false);
            }
        }
        this.f32179c.endArray();
        return this;
    }

    @Override // rf.h
    @NonNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e add(String str) {
        o();
        this.f32179c.value(str);
        return this;
    }

    @NonNull
    public e e(@NonNull String str, int i10) {
        o();
        this.f32179c.name(str);
        return a(i10);
    }

    @NonNull
    public e f(@NonNull String str, long j10) {
        o();
        this.f32179c.name(str);
        return b(j10);
    }

    @NonNull
    public e g(@NonNull String str, Object obj) {
        return this.f32183g ? n(str, obj) : m(str, obj);
    }

    @Override // rf.h
    @NonNull
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e add(boolean z10) {
        o();
        this.f32179c.value(z10);
        return this;
    }

    @NonNull
    public e i(byte[] bArr) {
        o();
        if (bArr == null) {
            this.f32179c.nullValue();
            return this;
        }
        this.f32179c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final boolean j(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void k() {
        o();
        this.f32179c.flush();
    }

    public e l(rf.e<Object> eVar, Object obj, boolean z10) {
        if (!z10) {
            this.f32179c.beginObject();
        }
        eVar.encode(obj, this);
        if (!z10) {
            this.f32179c.endObject();
        }
        return this;
    }

    public final e m(@NonNull String str, Object obj) {
        o();
        this.f32179c.name(str);
        if (obj != null) {
            return c(obj, false);
        }
        this.f32179c.nullValue();
        return this;
    }

    public final e n(@NonNull String str, Object obj) {
        if (obj == null) {
            return this;
        }
        o();
        this.f32179c.name(str);
        return c(obj, false);
    }

    public final void o() {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f32178a;
        if (eVar != null) {
            eVar.o();
            this.f32178a.b = false;
            this.f32178a = null;
            this.f32179c.endObject();
        }
    }

    @Override // rf.f
    @NonNull
    public f add(@NonNull rf.d dVar, Object obj) {
        return g(dVar.b(), obj);
    }

    @Override // rf.f
    @NonNull
    public f add(@NonNull rf.d dVar, int i10) {
        return e(dVar.b(), i10);
    }

    @Override // rf.f
    @NonNull
    public f add(@NonNull rf.d dVar, long j10) {
        return f(dVar.b(), j10);
    }
}
