package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g0<TResult, TContinuationResult> implements g<TContinuationResult>, f, e, h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f31000a;
    public final j b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f31001c;

    public g0(@NonNull Executor executor, @NonNull j jVar, @NonNull n0 n0Var) {
        this.f31000a = executor;
        this.b = jVar;
        this.f31001c = n0Var;
    }

    @Override // sb.e
    public final void a() {
        this.f31001c.r();
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        this.f31000a.execute(new f0(this, task));
    }

    @Override // sb.f
    public final void onFailure(@NonNull Exception exc) {
        this.f31001c.p(exc);
    }

    @Override // sb.g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f31001c.q(tcontinuationresult);
    }

    @Override // sb.h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
