package fb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.games_v2.zzs;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y1 extends e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f17149a;

    public y1(a2 a2Var, sb.k kVar) {
        this.f17149a = kVar;
        Objects.requireNonNull(a2Var);
    }

    @Override // fb.f2
    public final void t0(Status status, zzs zzsVar) {
        if (zzsVar == null) {
            this.f17149a.b(new k9.b(status));
        } else {
            this.f17149a.c(zzsVar);
        }
    }
}
