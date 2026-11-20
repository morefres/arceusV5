package g0;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B!\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028G¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058G¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001c"}, d2 = {"Lg0/s;", "", "", "", "cameraIds", "Ln0/e2;", "compatibilityId", "<init>", "(Ljava/util/List;Ln0/e2;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", ve.a.f33391e, "Ljava/util/List;", "getCameraIds", "()Ljava/util/List;", j6.b.f21518e, "Ln0/e2;", "getCompatibilityId", "()Ln0/e2;", "c", "internalId", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> cameraIds;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final n0.e2 compatibilityId;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lg0/s$a;", "", "<init>", "()V", "", "", "cameraIds", "Ln0/e2;", "compatibilityId", "Lg0/s;", "c", "(Ljava/util/List;Ln0/e2;)Lg0/s;", "primaryCameraId", "secondaryCameraId", j6.b.f21518e, "(Ljava/lang/String;Ljava/lang/String;Ln0/e2;)Lg0/s;", "Ln0/e;", "primaryInfo", "secondaryInfo", "e", "(Ln0/e;Ln0/e;)Lg0/s;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: g0.s$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ s d(Companion companion, String str, String str2, n0.e2 e2Var, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                e2Var = null;
            }
            return companion.b(str, str2, e2Var);
        }

        @NotNull
        public final s a(@NotNull String primaryCameraId) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            return d(this, primaryCameraId, null, null, 6, null);
        }

        @NotNull
        public final s b(@NotNull String primaryCameraId, @Nullable String secondaryCameraId, @Nullable n0.e2 compatibilityId) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            List<String> p8 = kotlin.collections.p.p(primaryCameraId);
            if (secondaryCameraId != null) {
                p8.add(secondaryCameraId);
            }
            return c(p8, compatibilityId);
        }

        @NotNull
        public final s c(@NotNull List<String> cameraIds, @Nullable n0.e2 compatibilityId) {
            Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
            return new s(cameraIds, compatibilityId, null);
        }

        @NotNull
        public final s e(@NotNull n0.e primaryInfo, @Nullable n0.e secondaryInfo) {
            Intrinsics.checkNotNullParameter(primaryInfo, "primaryInfo");
            String e10 = secondaryInfo != null ? secondaryInfo.e() : null;
            n0.e2 b02 = primaryInfo.C().b0();
            Intrinsics.checkNotNullExpressionValue(b02, "getCompatibilityId(...)");
            String e11 = primaryInfo.e();
            Intrinsics.checkNotNullExpressionValue(e11, "getCameraId(...)");
            return b(e11, e10, b02);
        }

        public Companion() {
        }
    }

    public /* synthetic */ s(List list, n0.e2 e2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, e2Var);
    }

    @NotNull
    public static final s a(@NotNull String str) {
        return INSTANCE.a(str);
    }

    @NotNull
    public static final s b(@NotNull n0.e eVar, @Nullable n0.e eVar2) {
        return INSTANCE.e(eVar, eVar2);
    }

    @NotNull
    public final String c() {
        x2.g.j(this.cameraIds.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) CollectionsKt.d0(this.cameraIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return Intrinsics.c(this.cameraIds, sVar.cameraIds) && Intrinsics.c(this.compatibilityId, sVar.compatibilityId);
    }

    public int hashCode() {
        int hashCode = this.cameraIds.hashCode() * 31;
        n0.e2 e2Var = this.compatibilityId;
        return hashCode + (e2Var != null ? e2Var.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r1 == null) goto L6;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CameraIdentifier{cameraIds="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r11.cameraIds
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r9 = 62
            r10 = 0
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.m0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.append(r1)
            n0.e2 r1 = r11.compatibilityId
            if (r1 == 0) goto L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ", compatId="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L39
        L37:
            java.lang.String r1 = ""
        L39:
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.s.toString():java.lang.String");
    }

    public s(List<String> list, n0.e2 e2Var) {
        this.cameraIds = list;
        this.compatibilityId = e2Var;
        x2.g.b(!list.isEmpty(), "Camera ID set cannot be empty.");
    }
}
