package wn;

import android.content.Context;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import androidx.core.app.NotificationCompat;
import gt.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lwn/b0;", "Lwn/m;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", ve.a.f33391e, "()Ljava/lang/Boolean;", j6.b.f21518e, "Landroid/content/Context;", "Lwn/n;", "m", "()Lwn/n;", NotificationCompat.CATEGORY_STATUS, "device_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b0 implements m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    public b0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Boolean a() {
        Object b;
        try {
            n.Companion companion = gt.n.INSTANCE;
            Object systemService = this.context.getSystemService("audio");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            boolean z10 = true;
            if (audioManager.getMode() != 1 && audioManager.getMode() != 2) {
                z10 = false;
            }
            b = gt.n.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        if (gt.n.g(b)) {
            b = null;
        }
        return (Boolean) b;
    }

    public final Boolean b() {
        Object b;
        try {
            n.Companion companion = gt.n.INSTANCE;
            Object systemService = this.context.getSystemService("phone");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            b = gt.n.b(Boolean.valueOf(((TelephonyManager) systemService).getCallState() != 0));
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        if (gt.n.g(b)) {
            b = null;
        }
        return (Boolean) b;
    }

    @Override // wn.m
    @NotNull
    public n m() {
        Boolean a10 = a();
        Boolean b = b();
        Boolean bool = Boolean.TRUE;
        return (Intrinsics.c(a10, bool) || Intrinsics.c(b, bool)) ? n.b : (a10 == null && b == null) ? n.f34456d : n.f34455c;
    }
}
