package mr;

import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<g.c<kp.b>> f24833a;
    public final dt.i<or.c> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<sm.w> f24834c;

    public k6(dt.i<g.c<kp.b>> iVar, dt.i<or.c> iVar2, dt.i<sm.w> iVar3) {
        this.f24833a = iVar;
        this.b = iVar2;
        this.f24834c = iVar3;
    }

    public static k6 a(dt.i<g.c<kp.b>> iVar, dt.i<or.c> iVar2, dt.i<sm.w> iVar3) {
        return new k6(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.inquiry.ui.k c(g.c<kp.b> cVar, or.c cVar2, sm.w wVar, String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return new com.withpersona.sdk2.inquiry.ui.k(cVar, cVar2, wVar, str, str2, str3, str4, map);
    }

    public com.withpersona.sdk2.inquiry.ui.k b(String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return c(this.f24833a.get(), this.b.get(), this.f24834c.get(), str, str2, str3, str4, map);
    }
}
