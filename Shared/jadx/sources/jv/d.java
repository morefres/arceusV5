package jv;

import jg.a0;
import jg.f;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class d<T> extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public final f f22170a;
    public final a0<T> b;

    /* renamed from: c, reason: collision with root package name */
    public final T f22171c;

    public d(f fVar, a0<T> a0Var, T t8) {
        this.f22170a = fVar;
        this.b = a0Var;
        this.f22171c = t8;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public MediaType getMediaType() {
        return b.f22166d;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(wu.f fVar) {
        b.c(fVar, this.f22170a, this.b, this.f22171c);
    }
}
