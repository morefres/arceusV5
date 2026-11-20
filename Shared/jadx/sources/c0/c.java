package c0;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u0004*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lc0/c;", "", "<init>", "()V", "", rl.d.f30696a, "()Z", "c", "", "vendor", j6.b.f21518e, "(Ljava/lang/String;)Z", "other", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;)Z", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f4444a = new c();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (kotlin.text.x.E("Spreadtrum", r1, true) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 1
            if (r0 < r1) goto L13
            java.lang.String r0 = "Spreadtrum"
            java.lang.String r1 = c0.b.a()
            boolean r0 = kotlin.text.x.E(r0, r1, r2)
            if (r0 != 0) goto L4c
        L13:
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r4 = r0.toLowerCase(r3)
            java.lang.String r5 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r6 = "ums"
            r7 = 0
            r8 = 2
            r9 = 0
            boolean r4 = kotlin.text.x.T(r4, r6, r7, r8, r9)
            if (r4 != 0) goto L4c
            c0.c r4 = c0.c.f4444a
            boolean r4 = r4.c()
            if (r4 == 0) goto L4b
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = r0.toLowerCase(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.String r1 = "sp"
            boolean r0 = kotlin.text.x.T(r0, r1, r7, r8, r9)
            if (r0 == 0) goto L4b
            goto L4c
        L4b:
            return r7
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.c.d():boolean");
    }

    public final boolean a(String str, String str2) {
        return x.E(str, str2, true);
    }

    public final boolean b(String vendor) {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (a(MANUFACTURER, vendor)) {
            return true;
        }
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        return a(BRAND, vendor);
    }

    public final boolean c() {
        return b("Itel");
    }
}
