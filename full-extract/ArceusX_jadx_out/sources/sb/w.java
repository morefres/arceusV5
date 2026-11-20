package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w<TResult, TContinuationResult> implements g<TContinuationResult>, f, e, h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f31028a;
    public final c b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f31029c;

    public w(@NonNull Executor executor, @NonNull c cVar, @NonNull n0 n0Var) {
        this.f31028a = executor;
        this.b = cVar;
        this.f31029c = n0Var;
    }

    @Override // sb.e
    public final void a() {
        this.f31029c.r();
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        this.f31028a.execute(new v(this, task));
    }

    @Override // sb.f
    public final void onFailure(@NonNull Exception exc) {
        this.f31029c.p(exc);
    }

    @Override // sb.g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f31029c.q(tcontinuationresult);
    }

    @Override // sb.h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
