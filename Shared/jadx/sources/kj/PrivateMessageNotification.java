package kj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001d¨\u0006&"}, d2 = {"Lkj/c0;", "Lkj/j0;", "", "notificationId", "", "time", "authorUserName", "authorUserId", "bodyPreview", "messageId", "<init>", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;J)V", "Lkj/f0;", "metadata", "(Lkj/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "J", "()J", "c", "n", rl.d.f30696a, "m", "e", "getBodyPreview", "f", "o", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: kj.c0, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class PrivateMessageNotification implements j0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String notificationId;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final long time;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String authorUserName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final long authorUserId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String bodyPreview;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final long messageId;

    public PrivateMessageNotification(@NotNull String notificationId, long j10, @Nullable String str, long j11, @Nullable String str2, long j12) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        this.notificationId = notificationId;
        this.time = j10;
        this.authorUserName = str;
        this.authorUserId = j11;
        this.bodyPreview = str2;
        this.messageId = j12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h() {
        return "PrivateMessageNotification authorUserName is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i() {
        return "PrivateMessageNotification authorUserId <= 0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j() {
        return "PrivateMessageNotification date is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k() {
        return "PrivateMessageNotification bodyPreview is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l() {
        return "PrivateMessageNotification messageId <= 0";
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
        if (!(other instanceof PrivateMessageNotification)) {
            return false;
        }
        PrivateMessageNotification privateMessageNotification = (PrivateMessageNotification) other;
        return Intrinsics.c(this.notificationId, privateMessageNotification.notificationId) && this.time == privateMessageNotification.time && Intrinsics.c(this.authorUserName, privateMessageNotification.authorUserName) && this.authorUserId == privateMessageNotification.authorUserId && Intrinsics.c(this.bodyPreview, privateMessageNotification.bodyPreview) && this.messageId == privateMessageNotification.messageId;
    }

    public int hashCode() {
        int hashCode = ((this.notificationId.hashCode() * 31) + Long.hashCode(this.time)) * 31;
        String str = this.authorUserName;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.authorUserId)) * 31;
        String str2 = this.bodyPreview;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.messageId);
    }

    /* renamed from: m, reason: from getter */
    public final long getAuthorUserId() {
        return this.authorUserId;
    }

    @Nullable
    /* renamed from: n, reason: from getter */
    public final String getAuthorUserName() {
        return this.authorUserName;
    }

    /* renamed from: o, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @NotNull
    public String toString() {
        return "PrivateMessageNotification(notificationId=" + this.notificationId + ", time=" + this.time + ", authorUserName=" + this.authorUserName + ", authorUserId=" + this.authorUserId + ", bodyPreview=" + this.bodyPreview + ", messageId=" + this.messageId + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PrivateMessageNotification(@org.jetbrains.annotations.NotNull kj.PushNotificationMetadata r12) {
        /*
            r11 = this;
            java.lang.String r0 = "metadata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r2 = r12.getNotificationId()
            org.json.JSONObject r0 = r12.getDetail()
            java.lang.String r1 = "AuthorUserName"
            java.lang.String r5 = kj.w.a(r0, r1)
            org.json.JSONObject r0 = r12.getDetail()
            java.lang.String r1 = "AuthorUserId"
            long r6 = r0.optLong(r1)
            org.json.JSONObject r0 = r12.getDetail()
            java.lang.String r1 = "BodyPreview"
            java.lang.String r8 = kj.w.a(r0, r1)
            org.json.JSONObject r0 = r12.getDetail()
            java.lang.String r1 = "MessageId"
            long r9 = r0.optLong(r1)
            org.json.JSONObject r12 = r12.getDetail()
            java.lang.String r0 = "EventDate"
            java.lang.String r12 = kj.w.a(r12, r0)
            if (r12 == 0) goto L44
            long r0 = ek.g.a(r12)
        L41:
            r3 = r0
            r1 = r11
            goto L47
        L44:
            r0 = -1
            goto L41
        L47:
            r1.<init>(r2, r3, r5, r6, r8, r9)
            java.lang.String r12 = r1.authorUserName
            r0 = 0
            r2 = 1
            if (r12 == 0) goto L59
            int r12 = r12.length()
            if (r12 != 0) goto L57
            goto L59
        L57:
            r12 = r0
            goto L5a
        L59:
            r12 = r2
        L5a:
            r12 = r12 ^ r2
            kj.x r3 = new kj.x
            r3.<init>()
            kj.w.b(r12, r3)
            long r3 = r1.authorUserId
            r5 = 0
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 <= 0) goto L6d
            r12 = r2
            goto L6e
        L6d:
            r12 = r0
        L6e:
            kj.y r3 = new kj.y
            r3.<init>()
            kj.w.b(r12, r3)
            long r3 = r11.getTime()
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 <= 0) goto L80
            r12 = r2
            goto L81
        L80:
            r12 = r0
        L81:
            kj.z r3 = new kj.z
            r3.<init>()
            kj.w.b(r12, r3)
            java.lang.String r12 = r1.bodyPreview
            if (r12 == 0) goto L96
            int r12 = r12.length()
            if (r12 != 0) goto L94
            goto L96
        L94:
            r12 = r0
            goto L97
        L96:
            r12 = r2
        L97:
            r12 = r12 ^ r2
            kj.a0 r3 = new kj.a0
            r3.<init>()
            kj.w.b(r12, r3)
            long r3 = r1.messageId
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 <= 0) goto La7
            r0 = r2
        La7:
            kj.b0 r12 = new kj.b0
            r12.<init>()
            kj.w.b(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.PrivateMessageNotification.<init>(kj.f0):void");
    }
}
