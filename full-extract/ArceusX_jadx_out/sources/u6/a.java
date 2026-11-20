package u6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.NetworkRequest;
import t6.NetworkResponse;
import t6.b;
import x6.Options;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu6/a;", "Lt6/b;", "<init>", "()V", "Lt6/q;", "cacheResponse", "Lt6/o;", "networkRequest", "Lx6/p;", "options", "Lt6/b$b;", ve.a.f33391e, "(Lt6/q;Lt6/o;Lx6/p;Lmt/b;)Ljava/lang/Object;", "networkResponse", "Lt6/b$c;", j6.b.f21518e, "(Lt6/q;Lt6/o;Lt6/q;Lx6/p;Lmt/b;)Ljava/lang/Object;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements t6.b {
    @Override // t6.b
    @Nullable
    public Object a(@NotNull NetworkResponse networkResponse, @NotNull NetworkRequest networkRequest, @NotNull Options options, @NotNull mt.b<? super b.ReadResult> bVar) {
        return new b.ReadResult(networkResponse);
    }

    @Override // t6.b
    @Nullable
    public Object b(@Nullable NetworkResponse networkResponse, @NotNull NetworkRequest networkRequest, @NotNull NetworkResponse networkResponse2, @NotNull Options options, @NotNull mt.b<? super b.WriteResult> bVar) {
        return (networkResponse2.getCode() != 304 || networkResponse == null) ? new b.WriteResult(networkResponse2) : new b.WriteResult(NetworkResponse.b(networkResponse2, 0, 0L, 0L, e.d(networkResponse.getHeaders(), networkResponse2.getHeaders()), null, null, 39, null));
    }
}
