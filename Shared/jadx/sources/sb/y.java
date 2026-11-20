package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class y implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f31031a;
    public final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public e f31032c;

    public y(@NonNull Executor executor, @NonNull e eVar) {
        this.f31031a = executor;
        this.f31032c = eVar;
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        if (task.l()) {
            synchronized (this.b) {
                try {
                    if (this.f31032c == null) {
                        return;
                    }
                    this.f31031a.execute(new x(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // sb.h0
    public final void zzc() {
        synchronized (this.b) {
            this.f31032c = null;
        }
    }
}
