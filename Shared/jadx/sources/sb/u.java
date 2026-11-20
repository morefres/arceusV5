package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f31025a;
    public final c b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f31026c;

    public u(@NonNull Executor executor, @NonNull c cVar, @NonNull n0 n0Var) {
        this.f31025a = executor;
        this.b = cVar;
        this.f31026c = n0Var;
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        this.f31025a.execute(new t(this, task));
    }

    @Override // sb.h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
