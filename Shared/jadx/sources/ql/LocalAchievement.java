package ql;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lql/l;", "", "", "codeName", "Ljava/time/Instant;", "createdTs", "<init>", "(Ljava/lang/String;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "Ljava/time/Instant;", "()Ljava/time/Instant;", "Lql/m;", "c", "Lql/m;", "()Lql/m;", "origin", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: ql.l, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class LocalAchievement {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String codeName;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Instant createdTs;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m origin;

    public LocalAchievement(@NotNull String codeName, @NotNull Instant createdTs) {
        Intrinsics.checkNotNullParameter(codeName, "codeName");
        Intrinsics.checkNotNullParameter(createdTs, "createdTs");
        this.codeName = codeName;
        this.createdTs = createdTs;
        this.origin = m.f29895a;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final String getCodeName() {
        return this.codeName;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final Instant getCreatedTs() {
        return this.createdTs;
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final m getOrigin() {
        return this.origin;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalAchievement)) {
            return false;
        }
        LocalAchievement localAchievement = (LocalAchievement) other;
        return Intrinsics.c(this.codeName, localAchievement.codeName) && Intrinsics.c(this.createdTs, localAchievement.createdTs);
    }

    public int hashCode() {
        return (this.codeName.hashCode() * 31) + this.createdTs.hashCode();
    }

    @NotNull
    public String toString() {
        return "LocalAchievement(codeName=" + this.codeName + ", createdTs=" + this.createdTs + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LocalAchievement(java.lang.String r1, java.time.Instant r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            java.time.Instant r2 = java.time.Instant.now()
            java.lang.String r3 = "now(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.LocalAchievement.<init>(java.lang.String, java.time.Instant, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
