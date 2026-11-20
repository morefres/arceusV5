package g6;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f6.j0;
import f6.k0;
import f6.o1;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public class e0 implements x5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final String f18364d = x5.w.i("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    public final h6.b f18365a;
    public final e6.a b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f18366c;

    @SuppressLint({"LambdaLast"})
    public e0(WorkDatabase workDatabase, e6.a aVar, h6.b bVar) {
        this.b = aVar;
        this.f18365a = bVar;
        this.f18366c = workDatabase.c0();
    }

    public static /* synthetic */ Void b(e0 e0Var, UUID uuid, x5.k kVar, Context context) {
        e0Var.getClass();
        String uuid2 = uuid.toString();
        j0 k10 = e0Var.f18366c.k(uuid2);
        if (k10 == null || k10.state.b()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        e0Var.b.a(uuid2, kVar);
        context.startService(androidx.work.impl.foreground.a.c(context, o1.a(k10), kVar));
        return null;
    }

    @Override // x5.l
    public ne.x<Void> a(final Context context, final UUID uuid, final x5.k kVar) {
        return x5.u.f(this.f18365a.c(), "setForegroundAsync", new Function0() { // from class: g6.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e0.b(e0.this, uuid, kVar, context);
            }
        });
    }
}
