package wm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lwu/f;", "", "str", rl.d.f30696a, "(Lwu/f;Ljava/lang/String;)Lwu/f;", "Lwu/g;", j6.b.f21518e, "(Lwu/g;)Ljava/lang/String;", "Lwu/h;", "bytes", "c", "(Lwu/f;Lwu/h;)Lwu/f;", ve.a.f33391e, "(Lwu/g;)Lwu/h;", "wf1-workflow-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {
    @NotNull
    public static final wu.h a(@NotNull wu.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.I1(gVar.readInt());
    }

    @NotNull
    public static final String b(@NotNull wu.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return a(gVar).P();
    }

    @NotNull
    public static final wu.f c(@NotNull wu.f fVar, @NotNull wu.h bytes) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        fVar.writeInt(bytes.I()).s2(bytes);
        return fVar;
    }

    @NotNull
    public static final wu.f d(@NotNull wu.f fVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return c(fVar, wu.h.INSTANCE.d(str));
    }
}
