package va;

import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.appindexing.internal.zza;
import com.google.firebase.appindexing.internal.zzg;
import java.util.Queue;
import k9.a;

@VisibleForTesting
/* loaded from: classes.dex */
public final class k0 extends l9.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f33371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l0 l0Var, j0 j0Var) {
        super(null, false, 28901);
        this.f33371d = l0Var;
    }

    @Override // l9.u
    public final /* bridge */ /* synthetic */ void d(a.b bVar, sb.k kVar) {
        zzg zzgVar;
        Queue queue;
        Queue queue2;
        Queue queue3;
        sb.k kVar2;
        Queue queue4;
        int i10;
        Queue queue5;
        lf.d dVar = (lf.d) ((p0) bVar).getService();
        i0 i0Var = new i0(this, kVar);
        zzgVar = this.f33371d.f33373a;
        zza o02 = dVar.o0(i0Var, zzgVar);
        int i11 = o02 == null ? 2 : o02.f8731f;
        boolean z10 = true;
        l0 l0Var = null;
        if (i11 == 3) {
            if (q0.b(4)) {
                Log.i("AppIndex", "Queue was full. API call will be retried.");
            }
            if (kVar.e(null)) {
                queue4 = this.f33371d.f33374c.f33376c;
                synchronized (queue4) {
                    try {
                        m0 m0Var = this.f33371d.f33374c;
                        i10 = m0Var.f33377d;
                        if (i10 == 0) {
                            queue5 = m0Var.f33376c;
                            l0Var = (l0) queue5.peek();
                            n9.m.p(l0Var == this.f33371d);
                        } else {
                            m0Var.f33377d = 2;
                        }
                    } finally {
                    }
                }
            }
        } else {
            if (i11 != 1) {
                String str = "API call failed. Status code: " + i11;
                if (q0.b(6)) {
                    Log.e("AppIndex", str);
                }
                if (kVar.e(null)) {
                    kVar2 = this.f33371d.b;
                    kVar2.b(new v8.c("Indexing error."));
                }
            }
            queue = this.f33371d.f33374c.f33376c;
            synchronized (queue) {
                queue2 = this.f33371d.f33374c.f33376c;
                if (((l0) queue2.poll()) != this.f33371d) {
                    z10 = false;
                }
                n9.m.p(z10);
                queue3 = this.f33371d.f33374c.f33376c;
                l0Var = (l0) queue3.peek();
                this.f33371d.f33374c.f33377d = 0;
            }
        }
        if (l0Var != null) {
            l0Var.d();
        }
    }
}
