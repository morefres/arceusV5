package jv;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import iv.h;
import jg.a0;
import jg.f;
import jg.m;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class c<T> implements h<ResponseBody, T> {

    /* renamed from: a, reason: collision with root package name */
    public final f f22169a;
    public final a0<T> b;

    public c(f fVar, a0<T> a0Var) {
        this.f22169a = fVar;
        this.b = a0Var;
    }

    @Override // iv.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(ResponseBody responseBody) {
        JsonReader r8 = this.f22169a.r(responseBody.charStream());
        try {
            T read = this.b.read(r8);
            if (r8.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new m("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
