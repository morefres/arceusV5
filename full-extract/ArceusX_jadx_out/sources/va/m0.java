package va;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.zzg;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

@VisibleForTesting
/* loaded from: classes.dex */
public final class m0 implements OnCompleteListener, Executor {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final k9.e f33375a;

    @NonNull
    public final Handler b;

    /* renamed from: c, reason: collision with root package name */
    public final Queue f33376c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f33377d = 0;

    public m0(@NonNull k9.e eVar) {
        this.f33375a = eVar;
        this.b = new e(eVar.I());
    }

    public final Task d(zzg zzgVar) {
        boolean isEmpty;
        l0 l0Var = new l0(this, zzgVar);
        Task a10 = l0Var.a();
        a10.c(this, this);
        synchronized (this.f33376c) {
            isEmpty = this.f33376c.isEmpty();
            this.f33376c.add(l0Var);
        }
        if (isEmpty) {
            l0Var.d();
        }
        return a10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        l0 l0Var;
        synchronized (this.f33376c) {
            try {
                if (this.f33377d == 2) {
                    l0Var = (l0) this.f33376c.peek();
                    n9.m.p(l0Var != null);
                } else {
                    l0Var = null;
                }
                this.f33377d = 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (l0Var != null) {
            l0Var.d();
        }
    }
}
