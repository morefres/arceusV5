package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f30990a;
    public final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public OnCompleteListener f30991c;

    public a0(@NonNull Executor executor, @NonNull OnCompleteListener onCompleteListener) {
        this.f30990a = executor;
        this.f30991c = onCompleteListener;
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        synchronized (this.b) {
            try {
                if (this.f30991c == null) {
                    return;
                }
                this.f30990a.execute(new z(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sb.h0
    public final void zzc() {
        synchronized (this.b) {
            this.f30991c = null;
        }
    }
}
