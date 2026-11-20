package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f30997a;
    public final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public g f30998c;

    public e0(@NonNull Executor executor, @NonNull g gVar) {
        this.f30997a = executor;
        this.f30998c = gVar;
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        if (task.isSuccessful()) {
            synchronized (this.b) {
                try {
                    if (this.f30998c == null) {
                        return;
                    }
                    this.f30997a.execute(new d0(this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // sb.h0
    public final void zzc() {
        synchronized (this.b) {
            this.f30998c = null;
        }
    }
}
