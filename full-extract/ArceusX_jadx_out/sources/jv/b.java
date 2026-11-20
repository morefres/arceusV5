package jv;

import com.google.gson.stream.JsonWriter;
import iv.h;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import jg.a0;
import jg.f;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import wu.e;

/* loaded from: classes2.dex */
public final class b<T> implements h<T, RequestBody> {

    /* renamed from: d, reason: collision with root package name */
    public static final MediaType f22166d = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final f f22167a;
    public final a0<T> b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22168c;

    public b(f fVar, a0<T> a0Var, boolean z10) {
        this.f22167a = fVar;
        this.b = a0Var;
        this.f22168c = z10;
    }

    public static <T> void c(wu.f fVar, f fVar2, a0<T> a0Var, T t8) {
        JsonWriter s8 = fVar2.s(new OutputStreamWriter(fVar.l3(), StandardCharsets.UTF_8));
        a0Var.write(s8, t8);
        s8.close();
    }

    @Override // iv.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(T t8) {
        if (this.f22168c) {
            return new d(this.f22167a, this.b, t8);
        }
        e eVar = new e();
        c(eVar, this.f22167a, this.b, t8);
        return RequestBody.create(f22166d, eVar.G2());
    }
}
