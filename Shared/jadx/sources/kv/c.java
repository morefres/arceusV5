package kv;

import iv.h;
import okhttp3.ResponseBody;
import sm.j;
import sm.m;
import wu.g;

/* loaded from: classes3.dex */
public final class c<T> implements h<ResponseBody, T> {
    public static final wu.h b = wu.h.c("EFBBBF");

    /* renamed from: a, reason: collision with root package name */
    public final sm.h<T> f23171a;

    public c(sm.h<T> hVar) {
        this.f23171a = hVar;
    }

    @Override // iv.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(ResponseBody responseBody) {
        g source = responseBody.getSource();
        try {
            if (source.b1(0L, b)) {
                source.skip(r1.I());
            }
            m s8 = m.s(source);
            T fromJson = this.f23171a.fromJson(s8);
            if (s8.u() != m.c.END_DOCUMENT) {
                throw new j("JSON document was not fully consumed.");
            }
            responseBody.close();
            return fromJson;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }
}
