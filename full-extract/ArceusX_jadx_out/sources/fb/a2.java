package fb;

import android.content.Context;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.tasks.Task;
import k9.a;
import k9.e;

/* loaded from: classes.dex */
public final class a2 extends k9.e implements w1 {

    /* renamed from: k, reason: collision with root package name */
    public static final a.g f17066k;

    /* renamed from: l, reason: collision with root package name */
    public static final a.AbstractC0393a f17067l;

    /* renamed from: m, reason: collision with root package name */
    public static final k9.a f17068m;

    static {
        a.g gVar = new a.g();
        f17066k = gVar;
        x1 x1Var = new x1();
        f17067l = x1Var;
        f17068m = new k9.a("GamesConnect.API", x1Var, gVar);
    }

    public a2(Context context, p1 p1Var) {
        super(context, (k9.a<p1>) f17068m, p1Var, e.a.f22460c);
    }

    @Override // fb.w1
    public final Task f(final zzq zzqVar, boolean z10) {
        l9.u a10 = l9.u.c().b(new l9.q() { // from class: fb.z1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((g2) ((b2) obj).getService()).t2(new y1(a2.this, (sb.k) obj2), zzqVar);
            }
        }).e(6737).c(z10).a();
        return z10 ? D(a10) : y(a10);
    }
}
