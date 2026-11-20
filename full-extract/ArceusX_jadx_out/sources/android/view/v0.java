package android.view;

import android.os.Handler;
import android.os.Looper;
import android.view.l;
import androidx.core.app.NotificationCompat;
import j6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/v0;", "", "Landroidx/lifecycle/s;", "provider", "<init>", "(Landroidx/lifecycle/s;)V", "", "c", "()V", b.f21518e, "e", d.f30696a, "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "f", "(Landroidx/lifecycle/l$a;)V", "Landroidx/lifecycle/u;", ve.a.f33391e, "Landroidx/lifecycle/u;", "registry", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/v0$a;", "Landroidx/lifecycle/v0$a;", "lastDispatchRunnable", "Landroidx/lifecycle/l;", "()Landroidx/lifecycle/l;", "lifecycle", "lifecycle-service"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u registry;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public a lastDispatchRunnable;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/v0$a;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/u;", "registry", "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Landroidx/lifecycle/u;Landroidx/lifecycle/l$a;)V", "", "run", "()V", ve.a.f33391e, "Landroidx/lifecycle/u;", b.f21518e, "Landroidx/lifecycle/l$a;", "getEvent", "()Landroidx/lifecycle/l$a;", "", "c", "Z", "wasExecuted", "lifecycle-service"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final u registry;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final l.a event;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean wasExecuted;

        public a(@NotNull u registry, @NotNull l.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.registry = registry;
            this.event = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.j(this.event);
            this.wasExecuted = true;
        }
    }

    public v0(@NotNull s provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.registry = new u(provider);
        this.handler = new Handler(Looper.getMainLooper());
    }

    @NotNull
    public l a() {
        return this.registry;
    }

    public void b() {
        f(l.a.ON_START);
    }

    public void c() {
        f(l.a.ON_CREATE);
    }

    public void d() {
        f(l.a.ON_STOP);
        f(l.a.ON_DESTROY);
    }

    public void e() {
        f(l.a.ON_START);
    }

    public final void f(l.a event) {
        a aVar = this.lastDispatchRunnable;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.registry, event);
        this.lastDispatchRunnable = aVar2;
        this.handler.postAtFrontOfQueue(aVar2);
    }
}
