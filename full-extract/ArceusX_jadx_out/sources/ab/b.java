package ab;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.tasks.Task;
import k9.a;
import k9.e;

/* loaded from: classes.dex */
public final class b extends k9.e implements e9.b {

    /* renamed from: k, reason: collision with root package name */
    public static final a.g f290k;

    /* renamed from: l, reason: collision with root package name */
    public static final a.AbstractC0393a f291l;

    /* renamed from: m, reason: collision with root package name */
    public static final k9.a f292m;

    static {
        a.g gVar = new a.g();
        f290k = gVar;
        u uVar = new u();
        f291l = uVar;
        f292m = new k9.a("Blockstore.API", uVar, gVar);
    }

    public b(@NonNull Context context) {
        super(context, (k9.a<a.d.c>) f292m, a.d.Ko, e.a.f22460c);
    }

    @Override // e9.b
    public final Task<RetrieveBytesResponse> e(final RetrieveBytesRequest retrieveBytesRequest) {
        n9.m.m(retrieveBytesRequest, "RetrieveBytesRequest cannot be null");
        return z(l9.u.c().d(c.f299h).b(new l9.q() { // from class: ab.t
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).getService()).v2(new w(b.this, (sb.k) obj2), retrieveBytesRequest);
            }
        }).c(false).e(1668).a());
    }

    @Override // e9.b
    public final Task<Integer> h(final StoreBytesData storeBytesData) {
        return D(l9.u.c().d(c.f295d, c.f297f).b(new l9.q() { // from class: ab.r
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).getService()).w2(new v(b.this, (sb.k) obj2), storeBytesData);
            }
        }).e(1645).c(false).a());
    }

    @Override // e9.b
    public final Task<Boolean> i(final DeleteBytesRequest deleteBytesRequest) {
        n9.m.m(deleteBytesRequest, "DeleteBytesRequest cannot be null");
        return D(l9.u.c().d(c.f298g).b(new l9.q() { // from class: ab.q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).getService()).t2(new x(b.this, (sb.k) obj2), deleteBytesRequest);
            }
        }).c(false).e(1669).a());
    }

    @Override // e9.b
    public final Task<Boolean> p() {
        return z(l9.u.c().d(c.f296e).b(new l9.q() { // from class: ab.s
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).getService()).u2(new y(b.this, (sb.k) obj2));
            }
        }).c(false).e(1651).a());
    }
}
