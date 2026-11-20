package d6;

import android.content.Context;
import b6.NetworkState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Ld6/n;", "", "Landroid/content/Context;", "context", "Lh6/b;", "taskExecutor", "Ld6/h;", "", "batteryChargingTracker", "Ld6/c;", "batteryNotLowTracker", "Lb6/h;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;Lh6/b;Ld6/h;Ld6/c;Ld6/h;Ld6/h;)V", ve.a.f33391e, "Landroid/content/Context;", "c", "()Landroid/content/Context;", j6.b.f21518e, "Ld6/h;", "()Ld6/h;", "Ld6/c;", "()Ld6/c;", rl.d.f30696a, "e", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h<Boolean> batteryChargingTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c batteryNotLowTracker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final h<NetworkState> networkStateTracker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<Boolean> storageNotLowTracker;

    public n(@NotNull Context context, @NotNull h6.b taskExecutor, @NotNull h<Boolean> batteryChargingTracker, @NotNull c batteryNotLowTracker, @Nullable h<NetworkState> hVar, @NotNull h<Boolean> storageNotLowTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.context = context;
        this.batteryChargingTracker = batteryChargingTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = hVar;
        this.storageNotLowTracker = storageNotLowTracker;
    }

    @NotNull
    public final h<Boolean> a() {
        return this.batteryChargingTracker;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final c getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final h<NetworkState> d() {
        return this.networkStateTracker;
    }

    @NotNull
    public final h<Boolean> e() {
        return this.storageNotLowTracker;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ n(android.content.Context r8, h6.b r9, d6.h r10, d6.c r11, d6.h r12, d6.h r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "getApplicationContext(...)"
            if (r0 == 0) goto L14
            d6.a r0 = new d6.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            d6.c r0 = new d6.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L41
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r0 >= r5) goto L3e
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            d6.h r0 = d6.j.a(r0, r9)
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r5 = r0
            goto L42
        L41:
            r5 = r12
        L42:
            r0 = r14 & 32
            if (r0 == 0) goto L57
            d6.l r0 = new d6.l
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L5b
        L57:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L5b:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.n.<init>(android.content.Context, h6.b, d6.h, d6.c, d6.h, d6.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
