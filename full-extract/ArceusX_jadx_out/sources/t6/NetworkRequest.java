package t6;

import k6.Extras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lt6/o;", "", "", "url", "method", "Lt6/n;", "headers", "Lt6/p;", "body", "Lk6/l;", "extras", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lt6/n;Lt6/p;Lk6/l;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", ve.a.f33391e, "Ljava/lang/String;", rl.d.f30696a, j6.b.f21518e, "c", "Lt6/n;", "()Lt6/n;", "Lt6/p;", "()Lt6/p;", "e", "Lk6/l;", "getExtras", "()Lk6/l;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: t6.o, reason: from toString */
/* loaded from: classes.dex */
public final class NetworkRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String url;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String method;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final NetworkHeaders headers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final p body;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Extras extras;

    public NetworkRequest(@NotNull String str, @NotNull String str2, @NotNull NetworkHeaders networkHeaders, @Nullable p pVar, @NotNull Extras extras) {
        this.url = str;
        this.method = str2;
        this.headers = networkHeaders;
        this.body = pVar;
        this.extras = extras;
    }

    @Nullable
    /* renamed from: a, reason: from getter */
    public final p getBody() {
        return this.body;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final NetworkHeaders getHeaders() {
        return this.headers;
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRequest)) {
            return false;
        }
        NetworkRequest networkRequest = (NetworkRequest) other;
        return Intrinsics.c(this.url, networkRequest.url) && Intrinsics.c(this.method, networkRequest.method) && Intrinsics.c(this.headers, networkRequest.headers) && Intrinsics.c(this.body, networkRequest.body) && Intrinsics.c(this.extras, networkRequest.extras);
    }

    public int hashCode() {
        int hashCode = ((((this.url.hashCode() * 31) + this.method.hashCode()) * 31) + this.headers.hashCode()) * 31;
        p pVar = this.body;
        return ((hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31) + this.extras.hashCode();
    }

    @NotNull
    public String toString() {
        return "NetworkRequest(url=" + this.url + ", method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + ", extras=" + this.extras + ')';
    }
}
