package kv;

import iv.h;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import sm.t;
import wu.e;

/* loaded from: classes3.dex */
public final class b<T> implements h<T, RequestBody> {

    /* renamed from: c, reason: collision with root package name */
    public static final MediaType f23169c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final sm.h<T> f23170a;
    public final boolean b;

    public b(sm.h<T> hVar, boolean z10) {
        this.f23170a = hVar;
        this.b = z10;
    }

    @Override // iv.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(T t8) {
        if (this.b) {
            return new d(this.f23170a, t8);
        }
        e eVar = new e();
        this.f23170a.toJson(t.q(eVar), (t) t8);
        return RequestBody.create(f23169c, eVar.G2());
    }
}
