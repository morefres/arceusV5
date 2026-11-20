package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f30994a;
    public final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public f f30995c;

    public c0(@NonNull Executor executor, @NonNull f fVar) {
        this.f30994a = executor;
        this.f30995c = fVar;
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        if (task.isSuccessful() || task.l()) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.f30995c == null) {
                    return;
                }
                this.f30994a.execute(new b0(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sb.h0
    public final void zzc() {
        synchronized (this.b) {
            this.f30995c = null;
        }
    }
}
