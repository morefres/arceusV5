package va;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.zzg;
import java.util.Queue;

@VisibleForTesting
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final zzg f33373a;
    public final sb.k b = new sb.k();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f33374c;

    public l0(m0 m0Var, zzg zzgVar) {
        this.f33374c = m0Var;
        this.f33373a = zzgVar;
    }

    public final Task a() {
        return this.b.a();
    }

    public final void d() {
        Queue queue;
        int i10;
        k9.e eVar;
        queue = this.f33374c.f33376c;
        synchronized (queue) {
            i10 = this.f33374c.f33377d;
            n9.m.p(i10 == 0);
            this.f33374c.f33377d = 1;
        }
        eVar = this.f33374c.f33375a;
        eVar.D(new k0(this, null)).d(this.f33374c, new sb.f() { // from class: va.h0
            @Override // sb.f
            public final void onFailure(Exception exc) {
                l0.this.e(exc);
            }
        });
    }

    public final /* synthetic */ void e(Exception exc) {
        Queue queue;
        Queue queue2;
        l0 l0Var;
        Queue queue3;
        Queue queue4;
        queue = this.f33374c.f33376c;
        synchronized (queue) {
            try {
                queue2 = this.f33374c.f33376c;
                if (queue2.peek() == this) {
                    queue3 = this.f33374c.f33376c;
                    queue3.remove();
                    this.f33374c.f33377d = 0;
                    queue4 = this.f33374c.f33376c;
                    l0Var = (l0) queue4.peek();
                } else {
                    l0Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b.d(exc);
        if (l0Var != null) {
            l0Var.d();
        }
    }
}
