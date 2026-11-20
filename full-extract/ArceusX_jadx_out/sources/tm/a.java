package tm;

import java.lang.Enum;
import java.util.Arrays;
import sm.h;
import sm.j;
import sm.m;
import sm.t;
import um.c;

/* loaded from: classes2.dex */
public final class a<T extends Enum<T>> extends h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<T> f32319a;
    public final String[] b;

    /* renamed from: c, reason: collision with root package name */
    public final T[] f32320c;

    /* renamed from: d, reason: collision with root package name */
    public final m.b f32321d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f32322e;

    /* renamed from: f, reason: collision with root package name */
    public final T f32323f;

    public a(Class<T> cls, T t8, boolean z10) {
        this.f32319a = cls;
        this.f32323f = t8;
        this.f32322e = z10;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.f32320c = enumConstants;
            this.b = new String[enumConstants.length];
            int i10 = 0;
            while (true) {
                T[] tArr = this.f32320c;
                if (i10 >= tArr.length) {
                    this.f32321d = m.b.a(this.b);
                    return;
                } else {
                    String name = tArr[i10].name();
                    this.b[i10] = c.m(name, cls.getField(name));
                    i10++;
                }
            }
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Missing field in " + cls.getName(), e10);
        }
    }

    public static <T extends Enum<T>> a<T> a(Class<T> cls) {
        return new a<>(cls, null, false);
    }

    @Override // sm.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T fromJson(m mVar) {
        int H = mVar.H(this.f32321d);
        if (H != -1) {
            return this.f32320c[H];
        }
        String path = mVar.getPath();
        if (this.f32322e) {
            if (mVar.u() == m.c.STRING) {
                mVar.P();
                return this.f32323f;
            }
            throw new j("Expected a string but was " + mVar.u() + " at path " + path);
        }
        throw new j("Expected one of " + Arrays.asList(this.b) + " but was " + mVar.r() + " at path " + path);
    }

    @Override // sm.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void toJson(t tVar, T t8) {
        if (t8 == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.M(this.b[t8.ordinal()]);
    }

    public a<T> d(T t8) {
        return new a<>(this.f32319a, t8, true);
    }

    public String toString() {
        return "EnumJsonAdapter(" + this.f32319a.getName() + ")";
    }
}
