package va;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import k9.a;

@VisibleForTesting
/* loaded from: classes.dex */
public abstract class b extends l9.u implements l9.d {

    /* renamed from: d, reason: collision with root package name */
    public sb.k f33358d;

    public b() {
        super(null, false, 28902);
    }

    @Override // l9.d
    public final void b(Status status) {
        n9.m.b(!status.A3(), "Failed result must not be success.");
        String y32 = status.y3();
        if (y32 == null) {
            y32 = "";
        }
        this.f33358d.b(d.a(status, y32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l9.u
    public final /* bridge */ /* synthetic */ void d(a.b bVar, sb.k kVar) {
        a0 a0Var = (a0) ((e0) bVar).getService();
        this.f33358d = kVar;
        h(a0Var);
    }

    public abstract void h(a0 a0Var);

    @Override // l9.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void a(Status status) {
        if (status.A3()) {
            this.f33358d.c(null);
        } else {
            this.f33358d.b(d.a(status, "User Action indexing error, please try again."));
        }
    }
}
