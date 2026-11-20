package ek;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rg.a1;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", j6.b.f21518e, "()Z", "Lqh/h;", "", "logTag", "", ve.a.f33391e, "(Lqh/h;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class v {
    public static final void a(@NotNull qh.h hVar, @NotNull String logTag) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        if (rh.h.a().R4()) {
            q.h(logTag, "Requesting Persona SDK module download immediately.");
            qh.h.m("personasdk");
        } else {
            q.h(logTag, "Deferring Persona SDK module download.");
            qh.h.l("personasdk");
        }
    }

    public static final boolean b() {
        return rh.h.a().b1() ? (t.h() || t.j() || t.k() || a1.t0()) ? false : true : (t.h() || t.j() || t.k()) ? false : true;
    }
}
