package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public class k<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f31005a = new n0();

    public k() {
    }

    @NonNull
    public Task<TResult> a() {
        return this.f31005a;
    }

    public void b(@NonNull Exception exc) {
        this.f31005a.p(exc);
    }

    public void c(TResult tresult) {
        this.f31005a.q(tresult);
    }

    public boolean d(@NonNull Exception exc) {
        return this.f31005a.s(exc);
    }

    public boolean e(TResult tresult) {
        return this.f31005a.t(tresult);
    }

    public k(@NonNull a aVar) {
        aVar.b(new j0(this));
    }
}
