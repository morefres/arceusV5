package p9;

import android.content.Context;
import bb.f;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import k9.a;
import k9.e;
import l9.u;
import n9.q;
import n9.r;
import sb.k;

/* loaded from: classes.dex */
public final class d extends k9.e implements q {

    /* renamed from: k, reason: collision with root package name */
    public static final a.g f28523k;

    /* renamed from: l, reason: collision with root package name */
    public static final a.AbstractC0393a f28524l;

    /* renamed from: m, reason: collision with root package name */
    public static final k9.a f28525m;

    static {
        a.g gVar = new a.g();
        f28523k = gVar;
        c cVar = new c();
        f28524l = cVar;
        f28525m = new k9.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, r rVar) {
        super(context, (k9.a<r>) f28525m, rVar, e.a.f22460c);
    }

    @Override // n9.q
    public final Task<Void> c(final TelemetryData telemetryData) {
        u.a c10 = u.c();
        c10.d(f.f3946a);
        c10.c(false);
        c10.b(new l9.q() { // from class: p9.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                a.g gVar = d.f28523k;
                ((a) ((e) obj).getService()).u2(TelemetryData.this);
                ((k) obj2).c(null);
            }
        });
        return y(c10.a());
    }
}
