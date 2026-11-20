package l9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import k9.i;

/* loaded from: classes.dex */
public final class x implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f23394a;
    public final /* synthetic */ z b;

    public x(z zVar, BasePendingResult basePendingResult) {
        this.b = zVar;
        this.f23394a = basePendingResult;
    }

    @Override // k9.i.a
    public final void a(Status status) {
        Map map;
        map = this.b.f23401a;
        map.remove(this.f23394a);
    }
}
