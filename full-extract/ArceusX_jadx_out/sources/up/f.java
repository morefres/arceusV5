package up;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ym.a0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lup/f;", "", "<init>", "()V", "Lup/c;", "flags", "Lokhttp3/Interceptor;", j6.b.f21518e, "(Lup/c;)Lokhttp3/Interceptor;", ve.a.f33391e, "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lup/f$a;", "", "<init>", "()V", "", "Lym/a0;", ve.a.f33391e, "()Ljava/util/Set;", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: up.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<a0<?>> a() {
            return p0.c(p.INSTANCE);
        }

        public Companion() {
        }
    }

    public static final Response c(c cVar, Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        RequestBody body = request.body();
        if ((!Intrinsics.c(CollectionsKt.o0(request.url().pathSegments()), "transition") && !Intrinsics.c(CollectionsKt.o0(request.url().pathSegments()), "government-id-classification")) || body == null || !cVar.getIsSandboxModeEnabled()) {
            return chain.proceed(request);
        }
        String a10 = c.INSTANCE.a(cVar.getDebugForcedStatus());
        MediaType contentType = body.getContentType();
        String subtype = contentType != null ? contentType.subtype() : null;
        if (Intrinsics.c(subtype, "form-data")) {
            MultipartBody multipartBody = (MultipartBody) body;
            MultipartBody.Builder type = new MultipartBody.Builder(null, 1, null).setType(multipartBody.type());
            Iterator<T> it = multipartBody.parts().iterator();
            while (it.hasNext()) {
                type.addPart((MultipartBody.Part) it.next());
            }
            return chain.proceed(request.newBuilder().method(request.method(), type.addFormDataPart("meta[workflowInitialVariables][debugForcedStatus]", a10).build()).build());
        }
        if (!Intrinsics.c(subtype, "json")) {
            return chain.proceed(request);
        }
        wu.e eVar = new wu.e();
        body.writeTo(eVar);
        JSONObject jSONObject = new JSONObject(eVar.S2());
        JSONObject optJSONObject = jSONObject.optJSONObject("meta");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        optJSONObject.put("workflowInitialVariables", new JSONObject().put("debugForcedStatus", a10));
        jSONObject.put("meta", optJSONObject);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return chain.proceed(request.newBuilder().method(request.method(), companion.create(jSONObject2, body.getContentType())).build());
    }

    @NotNull
    public static final Set<a0<?>> d() {
        return INSTANCE.a();
    }

    @NotNull
    public final Interceptor b(@NotNull final c flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new Interceptor() { // from class: up.e
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response c10;
                c10 = f.c(c.this, chain);
                return c10;
            }
        };
    }
}
