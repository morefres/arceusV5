package kj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lkj/q;", "Lkj/j0;", "", "notificationId", "", "time", "username", "userId", "<init>", "(Ljava/lang/String;JLjava/lang/String;J)V", "Lkj/f0;", "metadata", "(Lkj/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "J", "()J", "c", "j", rl.d.f30696a, "i", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: kj.q, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class FriendRequestAcceptedNotification implements j0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String notificationId;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final long time;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String username;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final long userId;

    public FriendRequestAcceptedNotification(@NotNull String notificationId, long j10, @Nullable String str, long j11) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        this.notificationId = notificationId;
        this.time = j10;
        this.username = str;
        this.userId = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f() {
        return "FriendRequestAcceptedNotification username is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g() {
        return "FriendRequestAcceptedNotification userId <= 0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h() {
        return "FriendRequestAcceptedNotification date is null or empty";
    }

    @Override // kj.j0
    /* renamed from: a, reason: from getter */
    public long getTime() {
        return this.time;
    }

    @Override // kj.j0
    @NotNull
    /* renamed from: b, reason: from getter */
    public String getNotificationId() {
        return this.notificationId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendRequestAcceptedNotification)) {
            return false;
        }
        FriendRequestAcceptedNotification friendRequestAcceptedNotification = (FriendRequestAcceptedNotification) other;
        return Intrinsics.c(this.notificationId, friendRequestAcceptedNotification.notificationId) && this.time == friendRequestAcceptedNotification.time && Intrinsics.c(this.username, friendRequestAcceptedNotification.username) && this.userId == friendRequestAcceptedNotification.userId;
    }

    public int hashCode() {
        int hashCode = ((this.notificationId.hashCode() * 31) + Long.hashCode(this.time)) * 31;
        String str = this.username;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.userId);
    }

    /* renamed from: i, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @Nullable
    /* renamed from: j, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    public String toString() {
        return "FriendRequestAcceptedNotification(notificationId=" + this.notificationId + ", time=" + this.time + ", username=" + this.username + ", userId=" + this.userId + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FriendRequestAcceptedNotification(@org.jetbrains.annotations.NotNull kj.PushNotificationMetadata r9) {
        /*
            r8 = this;
            java.lang.String r0 = "metadata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r2 = r9.getNotificationId()
            org.json.JSONObject r0 = r9.getDetail()
            java.lang.String r1 = "EventDate"
            java.lang.String r0 = kj.w.a(r0, r1)
            if (r0 == 0) goto L1b
            long r0 = ek.g.a(r0)
        L19:
            r3 = r0
            goto L1e
        L1b:
            r0 = -1
            goto L19
        L1e:
            org.json.JSONObject r0 = r9.getDetail()
            java.lang.String r1 = "AccepterUserName"
            java.lang.String r5 = kj.w.a(r0, r1)
            org.json.JSONObject r9 = r9.getDetail()
            java.lang.String r0 = "AccepterUserId"
            long r6 = r9.optLong(r0)
            r1 = r8
            r1.<init>(r2, r3, r5, r6)
            java.lang.String r9 = r1.username
            r0 = 0
            r2 = 1
            if (r9 == 0) goto L45
            int r9 = r9.length()
            if (r9 != 0) goto L43
            goto L45
        L43:
            r9 = r0
            goto L46
        L45:
            r9 = r2
        L46:
            r9 = r9 ^ r2
            kj.n r3 = new kj.n
            r3.<init>()
            kj.w.b(r9, r3)
            long r3 = r1.userId
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L59
            r9 = r2
            goto L5a
        L59:
            r9 = r0
        L5a:
            kj.o r3 = new kj.o
            r3.<init>()
            kj.w.b(r9, r3)
            long r3 = r8.getTime()
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L6b
            r0 = r2
        L6b:
            kj.p r9 = new kj.p
            r9.<init>()
            kj.w.b(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.FriendRequestAcceptedNotification.<init>(kj.f0):void");
    }
}
