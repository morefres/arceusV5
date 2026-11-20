package wd;

import android.os.Bundle;
import sb.k;
import xd.i;
import xd.t;

/* loaded from: classes2.dex */
public class f extends xd.g {

    /* renamed from: a, reason: collision with root package name */
    public final i f34189a;
    public final k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f34190c;

    public f(g gVar, i iVar, k kVar) {
        this.f34190c = gVar;
        this.f34189a = iVar;
        this.b = kVar;
    }

    public void l(Bundle bundle) {
        t tVar = this.f34190c.f34192a;
        if (tVar != null) {
            tVar.u(this.b);
        }
        this.f34189a.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
