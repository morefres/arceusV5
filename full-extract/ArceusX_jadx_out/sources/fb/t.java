package fb;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final l f17140a;
    public final sb.k b;

    public t(l lVar, sb.k kVar) {
        this.f17140a = lVar;
        this.b = kVar;
    }

    public final void a(k9.e eVar) {
        this.f17140a.a(eVar).c(t1.a(), new OnCompleteListener() { // from class: fb.s
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                t.this.c(task);
            }
        });
    }

    public final void b(Exception exc) {
        this.b.b(exc);
    }

    public final /* synthetic */ void c(Task task) {
        if (task.isSuccessful()) {
            this.b.c(task.getResult());
            return;
        }
        sb.k kVar = this.b;
        Exception exception = task.getException();
        b1.a(exception);
        kVar.b(exception);
    }
}
