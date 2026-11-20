package fb;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.internal.games_v2.zzs;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class f0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f17090a;
    public final ga.o b;

    /* renamed from: c, reason: collision with root package name */
    public final n f17091c;

    public f0(Application application, ga.o oVar, n nVar) {
        this.f17090a = application;
        this.b = oVar;
        this.f17091c = nVar;
    }

    @Override // fb.c0
    public final Task a(final zzq zzqVar) {
        final boolean z10 = false;
        if (zzqVar.zzc() == 0 && !w9.a.a(this.f17090a)) {
            z10 = true;
        }
        Task f10 = c().f(zzqVar, z10);
        final sb.k kVar = new sb.k();
        f10.i(t1.a(), new sb.c() { // from class: fb.e0
            @Override // sb.c
            public final /* synthetic */ Object then(Task task) {
                return f0.this.b(zzqVar, z10, task);
            }
        }).c(t1.a(), new OnCompleteListener() { // from class: fb.d0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                sb.k kVar2 = sb.k.this;
                if (task.isSuccessful()) {
                    kVar2.e(g0.a(((zzs) task.getResult()).zza()));
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof k9.b) {
                    kVar2.e(g0.b(((k9.b) exception).a()));
                } else {
                    b1.a(exception);
                    kVar2.d(exception);
                }
            }
        });
        return kVar.a();
    }

    public final /* synthetic */ Task b(zzq zzqVar, boolean z10, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if ((exception instanceof k9.b) && ((k9.b) exception).b() == 20) {
                s0.a("GamesAuthenticator", "Service connection suspended during the first sign-in attempt. Trying again.");
                return c().f(zzqVar, z10);
            }
        }
        return task;
    }

    public final w1 c() {
        Activity d10 = this.b.d();
        if (d10 != null) {
            return v1.a(d10, this.f17091c.b);
        }
        n nVar = this.f17091c;
        return v1.a(nVar.f17119a, nVar.b);
    }
}
