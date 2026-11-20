package rl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lrl/e;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lrl/g;", "reason", "", "cause", "<init>", "(Lrl/g;Ljava/lang/Throwable;)V", ve.a.f33391e, "Lrl/g;", "()Lrl/g;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g reason;

    public /* synthetic */ e(g gVar, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? null : th2);
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final g getReason() {
        return this.reason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(@org.jetbrains.annotations.NotNull rl.g r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
        /*
            r1 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto Ld
            java.lang.String r0 = r3.getMessage()
            if (r0 != 0) goto L11
        Ld:
            java.lang.String r0 = r2.name()
        L11:
            r1.<init>(r0, r3)
            r1.reason = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rl.e.<init>(rl.g, java.lang.Throwable):void");
    }
}
