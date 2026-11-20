package wn;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import gt.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwn/t;", "Lwn/d;", "Landroid/content/Context;", "context", "Lwn/m;", "phoneCallMonitor", "<init>", "(Landroid/content/Context;Lwn/m;)V", "Lwn/c;", ve.a.f33391e, "()Lwn/c;", "", j6.b.f21518e, "()J", "Landroid/content/Context;", "Lwn/m;", "device_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final m phoneCallMonitor;

    public t(@NotNull Context context, @NotNull m phoneCallMonitor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(phoneCallMonitor, "phoneCallMonitor");
        this.context = context;
        this.phoneCallMonitor = phoneCallMonitor;
    }

    @Override // wn.d
    @NotNull
    public DeviceMetrics a() {
        Object b;
        Object b10;
        Object b11;
        Object b12;
        try {
            n.Companion companion = gt.n.INSTANCE;
            b = gt.n.b(Long.valueOf(SystemClock.elapsedRealtime()));
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        if (gt.n.g(b)) {
            b = null;
        }
        Long l10 = (Long) b;
        try {
            b10 = gt.n.b(Long.valueOf(b()));
        } catch (Throwable th3) {
            n.Companion companion3 = gt.n.INSTANCE;
            b10 = gt.n.b(gt.o.a(th3));
        }
        if (gt.n.g(b10)) {
            b10 = null;
        }
        Long l11 = (Long) b10;
        try {
            b11 = gt.n.b(Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes()));
        } catch (Throwable th4) {
            n.Companion companion4 = gt.n.INSTANCE;
            b11 = gt.n.b(gt.o.a(th4));
        }
        Long l12 = (Long) (gt.n.g(b11) ? null : b11);
        try {
            b12 = gt.n.b(this.phoneCallMonitor.m());
        } catch (Throwable th5) {
            n.Companion companion5 = gt.n.INSTANCE;
            b12 = gt.n.b(gt.o.a(th5));
        }
        n nVar = n.f34456d;
        if (gt.n.g(b12)) {
            b12 = nVar;
        }
        return new DeviceMetrics(l10, l11, l12, (n) b12);
    }

    public final long b() {
        Object systemService = this.context.getSystemService("activity");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
