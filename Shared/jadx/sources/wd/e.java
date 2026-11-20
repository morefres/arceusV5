package wd;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;
import sb.k;
import xd.i;
import xd.j;

/* loaded from: classes2.dex */
public final class e extends j {
    public final /* synthetic */ k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f34188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, k kVar, k kVar2) {
        super(kVar);
        this.b = kVar2;
        this.f34188c = gVar;
    }

    @Override // xd.j
    public final void a() {
        i iVar;
        String str;
        String str2;
        String str3;
        try {
            xd.f fVar = (xd.f) this.f34188c.f34192a.e();
            str2 = this.f34188c.b;
            Bundle bundle = new Bundle();
            Map a10 = h.a();
            bundle.putInt("playcore_version_code", ((Integer) a10.get("java")).intValue());
            if (a10.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) a10.get("native")).intValue());
            }
            if (a10.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) a10.get("unity")).intValue());
            }
            g gVar = this.f34188c;
            k kVar = this.b;
            str3 = gVar.b;
            fVar.r1(str2, bundle, new com.google.android.play.core.review.c(gVar, kVar, str3));
        } catch (RemoteException e10) {
            g gVar2 = this.f34188c;
            iVar = g.f34191c;
            str = gVar2.b;
            iVar.b(e10, "error requesting in-app review for %s", str);
            this.b.d(new RuntimeException(e10));
        }
    }
}
