package kv;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import sm.h;
import wu.f;

/* loaded from: classes3.dex */
public final class d<T> extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public final h<T> f23172a;
    public final T b;

    public d(h<T> hVar, T t8) {
        this.f23172a = hVar;
        this.b = t8;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public MediaType get$contentType() {
        return b.f23169c;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(f fVar) {
        this.f23172a.toJson(fVar, (f) this.b);
    }
}
