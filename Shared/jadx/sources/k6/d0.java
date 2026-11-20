package k6;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR\u0013\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lk6/d0;", "", "<init>", "()V", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lk6/s;", ve.a.f33391e, "(Landroid/content/Context;)Lk6/s;", "c", "Lkotlinx/atomicfu/AtomicRef;", "reference", "coil_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f22360a = new d0();
    public static final /* synthetic */ AtomicReference b = new AtomicReference(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lk6/d0$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lk6/s;", ve.a.f33391e, "(Landroid/content/Context;)Lk6/s;", "coil_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        s a(@NotNull Context context);
    }

    @NotNull
    public static final s a(@NotNull Context context) {
        d0 d0Var = f22360a;
        Object obj = d0Var.b().get();
        s sVar = obj instanceof s ? (s) obj : null;
        return sVar == null ? d0Var.c(context) : sVar;
    }

    public final /* synthetic */ AtomicReference b() {
        return b;
    }

    public final s c(Context context) {
        s sVar;
        a aVar;
        AtomicReference b10 = b();
        s sVar2 = null;
        while (true) {
            Object obj = b10.get();
            if (obj instanceof s) {
                sVar = sVar2;
                sVar2 = (s) obj;
            } else {
                if (sVar2 == null) {
                    a aVar2 = obj instanceof a ? (a) obj : null;
                    if (aVar2 == null || (sVar2 = aVar2.a(context)) == null) {
                        a a10 = g0.a(context);
                        if (a10 != null) {
                            sVar2 = a10.a(context);
                        } else {
                            aVar = f0.f22363a;
                            sVar2 = aVar.a(context);
                        }
                    }
                }
                sVar = sVar2;
            }
            if (p1.t.a(b10, obj, sVar2)) {
                Intrinsics.d(sVar2, "null cannot be cast to non-null type coil3.ImageLoader");
                return sVar2;
            }
            sVar2 = sVar;
        }
    }
}
