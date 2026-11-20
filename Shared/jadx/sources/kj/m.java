package kj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\b\u0016\u0018\u0000 ;2\u00020\u0001:\u0001\u001bB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014B/\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0016B-\b\u0017\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010 R(\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010\u001f\u0012\u0004\b+\u0010,\u001a\u0004\b(\u0010 \"\u0004\b)\u0010*R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001c\u001a\u0004\b6\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001c\u001a\u0004\b:\u0010\u001e¨\u0006<"}, d2 = {"Lkj/m;", "Lkj/j0;", "", "notificationId", "", "time", "senderName", "senderDisplayName", "senderId", "conversationId", "conversationGuid", "conversationTitle", "conversationType", "messageId", "messageContent", "category", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkj/f0;", "metadata", "(Lkj/f0;)V", "categoryName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "", "H", "(Ljava/lang/String;)Z", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "J", "()J", "c", "G", rl.d.f30696a, "getSenderDisplayName", "e", "F", "f", "A", "setConversationId", "(J)V", "getConversationId$annotations", "()V", "g", "z", "setConversationGuid", "(Ljava/lang/String;)V", "h", "B", "i", "C", "j", "E", "k", "D", "l", "y", "m", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class m implements j0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String notificationId;

    /* renamed from: b, reason: from kotlin metadata */
    public final long time;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String senderName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String senderDisplayName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long senderId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long conversationId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String conversationGuid;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String conversationTitle;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String conversationType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String messageId;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String messageContent;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String category;

    public m(@NotNull String notificationId, long j10, @Nullable String str, @Nullable String str2, long j11, long j12, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        this.notificationId = notificationId;
        this.time = j10;
        this.senderName = str;
        this.senderDisplayName = str2;
        this.senderId = j11;
        this.conversationId = j12;
        this.conversationGuid = str3;
        this.conversationTitle = str4;
        this.conversationType = str5;
        this.messageId = str6;
        this.messageContent = str7;
        this.category = str8;
    }

    public static final String n() {
        return "ChatNewMessageNotification senderName is null or empty";
    }

    public static final String o() {
        return "ChatNewMessageNotification senderId <= 0";
    }

    public static final String p() {
        return "ChatNewMessageNotification conversationType is invalid";
    }

    public static final String q() {
        return "ChatNewMessageNotification category is null or empty";
    }

    public static final String r() {
        return "ChatNewMessageNotification date is null or empty";
    }

    public static final String s() {
        return "ChatNewMessageNotification conversationTitle is null or empty";
    }

    public static final String t() {
        return "ChatNewMessageNotification conversationGuid is null or empty";
    }

    public static final String u() {
        return "ChatNewMessageNotification conversationId is null or empty";
    }

    public static final String v() {
        return "ChatNewMessageNotification messageId is null or empty";
    }

    public static final String w() {
        return "ChatNewMessageNotification messageContent is null or empty";
    }

    public static final String x() {
        return "ChatNewMessageNotification conversationType is null or empty";
    }

    /* renamed from: A, reason: from getter */
    public final long getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* renamed from: B, reason: from getter */
    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    @Nullable
    /* renamed from: C, reason: from getter */
    public final String getConversationType() {
        return this.conversationType;
    }

    @Nullable
    /* renamed from: D, reason: from getter */
    public final String getMessageContent() {
        return this.messageContent;
    }

    @Nullable
    /* renamed from: E, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: F, reason: from getter */
    public final long getSenderId() {
        return this.senderId;
    }

    @Nullable
    /* renamed from: G, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    public final boolean H(String conversationType) {
        return Intrinsics.c(conversationType, "OneToOneConversation") || Intrinsics.c(conversationType, "MultiUserConversation");
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

    @Nullable
    /* renamed from: y, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* renamed from: z, reason: from getter */
    public final String getConversationGuid() {
        return this.conversationGuid;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ m(java.lang.String r21, long r22, java.lang.String r24, java.lang.String r25, long r26, long r28, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r20 = this;
            r0 = r36
            r1 = r0 & 2
            r2 = -1
            if (r1 == 0) goto La
            r6 = r2
            goto Lc
        La:
            r6 = r22
        Lc:
            r1 = r0 & 4
            r4 = 0
            if (r1 == 0) goto L13
            r8 = r4
            goto L15
        L13:
            r8 = r24
        L15:
            r1 = r0 & 8
            if (r1 == 0) goto L1b
            r9 = r4
            goto L1d
        L1b:
            r9 = r25
        L1d:
            r1 = r0 & 16
            if (r1 == 0) goto L23
            r10 = r2
            goto L25
        L23:
            r10 = r26
        L25:
            r1 = r0 & 32
            if (r1 == 0) goto L2b
            r12 = r2
            goto L2d
        L2b:
            r12 = r28
        L2d:
            r1 = r0 & 64
            if (r1 == 0) goto L33
            r14 = r4
            goto L35
        L33:
            r14 = r30
        L35:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3c
            r16 = r4
            goto L3e
        L3c:
            r16 = r32
        L3e:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L45
            r17 = r4
            goto L47
        L45:
            r17 = r33
        L47:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L4e
            r18 = r4
            goto L50
        L4e:
            r18 = r34
        L50:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L5d
            r19 = r4
            r5 = r21
            r15 = r31
            r4 = r20
            goto L65
        L5d:
            r19 = r35
            r4 = r20
            r5 = r21
            r15 = r31
        L65:
            r4.<init>(r5, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.m.<init>(java.lang.String, long, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(@org.jetbrains.annotations.NotNull kj.PushNotificationMetadata r19) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.m.<init>(kj.f0):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String notificationId) {
        this(notificationId, 0L, null, null, 0L, 0L, str2, str3, null, null, null, str, 1854, null);
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@Nullable String str, long j10, @Nullable String str2, @NotNull String notificationId) {
        this(notificationId, 0L, null, null, 0L, j10, null, str2, null, null, null, str, 1886, null);
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
    }
}
