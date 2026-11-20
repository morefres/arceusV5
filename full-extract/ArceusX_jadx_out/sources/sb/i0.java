package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31002a = new Object();
    public Queue b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31003c;

    public final void a(@NonNull h0 h0Var) {
        synchronized (this.f31002a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(h0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@NonNull Task task) {
        h0 h0Var;
        synchronized (this.f31002a) {
            if (this.b != null && !this.f31003c) {
                this.f31003c = true;
                while (true) {
                    synchronized (this.f31002a) {
                        try {
                            h0Var = (h0) this.b.poll();
                            if (h0Var == null) {
                                this.f31003c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    h0Var.b(task);
                }
            }
        }
    }
}
