package wa;

import android.content.Context;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class r implements x8.b {

    /* renamed from: a, reason: collision with root package name */
    public final x8.b f34187a;
    public final x8.b b;

    public r(Context context) {
        this.f34187a = new p(context, j9.d.f());
        this.b = l.c(context);
    }

    public static /* synthetic */ Task a(r rVar, Task task) {
        if (!task.isSuccessful() && !task.l()) {
            Exception exception = task.getException();
            if (exception instanceof k9.b) {
                int b = ((k9.b) exception).b();
                if (b == 43001 || b == 43002 || b == 43003 || b == 17) {
                    return rVar.b.j();
                }
                if (b == 43000) {
                    return sb.m.e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (b == 15) {
                    return sb.m.e(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // x8.b
    public final Task<x8.c> j() {
        return this.f34187a.j().j(new sb.c() { // from class: wa.q
            @Override // sb.c
            public final Object then(Task task) {
                return r.a(r.this, task);
            }
        });
    }
}
