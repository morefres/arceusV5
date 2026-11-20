package fb;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final m f17095a;

    public h(m mVar) {
        this.f17095a = mVar;
    }

    public static h a(Application application) {
        return new h(o.a(application));
    }

    public final Task b(final g gVar) {
        Objects.requireNonNull(gVar);
        return this.f17095a.a(new l() { // from class: fb.f
            @Override // fb.l
            public final /* synthetic */ Task a(k9.e eVar) {
                return g.this.a(eVar);
            }
        });
    }
}
