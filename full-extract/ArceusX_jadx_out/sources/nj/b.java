package nj;

import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import androidx.core.view.PointerIconCompat;
import hj.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rg.q0;
import rh.h;
import zl.t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b\u001f\u00103j\u0002\b4j\u0002\b)j\u0002\b5j\u0002\b&j\u0002\b0j\u0002\b6j\u0002\b#j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@¨\u0006A"}, d2 = {"Lnj/b;", "", "", "id", "", "nameId", "importance", "description", "", "isFlagEnabled", "useDefaultChannelAttributes", "Landroid/net/Uri;", "ringtoneUri", "Landroid/media/AudioAttributes;", "ringtoneAttributes", "", "vibrationPattern", "Lnj/c;", "group", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/Integer;ZZLandroid/net/Uri;Landroid/media/AudioAttributes;[JLnj/c;)V", ve.a.f33391e, "Ljava/lang/String;", "getId", "()Ljava/lang/String;", j6.b.f21518e, "I", "h", "()I", "c", "e", rl.d.f30696a, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Z", "q", "()Z", "f", "n", "g", "Landroid/net/Uri;", "l", "()Landroid/net/Uri;", "Landroid/media/AudioAttributes;", "j", "()Landroid/media/AudioAttributes;", "i", "[J", "o", "()[J", "Lnj/c;", "()Lnj/c;", "k", "m", "p", "r", "s", t.f38095d, "u", "v", "w", "x", "y", "z", "A", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {
    public static final b A;
    public static final /* synthetic */ b[] B;
    public static final /* synthetic */ pt.a C;

    /* renamed from: k, reason: collision with root package name */
    public static final b f27143k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f27144l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f27145m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f27146n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f27147o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f27148p;

    /* renamed from: q, reason: collision with root package name */
    public static final b f27149q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f27150r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f27151s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f27152t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f27153u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f27154v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f27155w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f27156x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f27157y;

    /* renamed from: z, reason: collision with root package name */
    public static final b f27158z;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* renamed from: b, reason: from kotlin metadata */
    public final int nameId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int importance;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isFlagEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean useDefaultChannelAttributes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Uri ringtoneUri;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AudioAttributes ringtoneAttributes;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final long[] vibrationPattern;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final c group;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        c cVar = c.f27168c;
        int i10 = 488;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i11 = 3;
        Integer num = null;
        boolean z10 = false;
        Uri uri = null;
        AudioAttributes audioAttributes = null;
        long[] jArr = null;
        f27143k = new b("CONNECTION_REQUEST_RECEIVED", 0, "channel_connection_request_received", q0.f30474k0, i11, num, h.a().t0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f27144l = new b("CONNECTION_REQUEST_ACCEPTED", 1, "channel_connection_request_accepted", q0.f30471j0, i11, num, h.a().t0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f27145m = new b("EXPERIENCE_INVITE", 2, "channel_exp_invite", q0.f30456e0, i11, num, h.a().t0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f27146n = new b("PARTY_INVITE", 3, "channel_party_invite", q0.f30477l0, i11, num, h.a().t0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f27147o = new b("CHAT", 4, "channel_chat", q0.f30450c0, i11, num, h.a().t0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        int i12 = 488;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        Integer num2 = null;
        boolean z11 = false;
        Uri uri2 = null;
        AudioAttributes audioAttributes2 = null;
        long[] jArr2 = null;
        f27148p = new b("FRIEND_PRESENCE", 5, "channel_friend_presence", q0.f30468i0, 4, num2, h.a().t0() && h.a().T(), z11, uri2, audioAttributes2, jArr2, cVar, i12, defaultConstructorMarker2);
        c cVar2 = c.f27169d;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        int i13 = 3;
        Integer num3 = null;
        boolean z12 = false;
        Uri uri3 = null;
        AudioAttributes audioAttributes3 = null;
        long[] jArr3 = null;
        f27149q = new b("EXPERIENCE_EVENTS", 6, "channel_experience_events", q0.f30453d0, i13, num3, h.a().t0(), z12, uri3, audioAttributes3, jArr3, cVar2, 488, defaultConstructorMarker3);
        f27150r = new b("RECOMMENDED_EXPERIENCES", 7, "channel_recommended", q0.f30480m0, i13, num3, false, z12, uri3, audioAttributes3, jArr3, cVar2, 472, defaultConstructorMarker3);
        c cVar3 = c.f27170e;
        int i14 = 3;
        f27151s = new b("ANNOUNCEMENTS", 8, "channel_announcements", q0.f30447b0, i14, num2, h.a().t0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f27152t = new b("FORUM_REPLIES", 9, "channel_forum_replies", q0.f30465h0, i14, num2, h.a().t0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f27153u = new b("FORUM_COMMENTS", 10, "channel_forum_comments", q0.f30459f0, i14, num2, h.a().t0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f27154v = new b("FORUM_POST_SUBSCRIPTIONS", 11, "channel_forum_post_subscriptions", q0.f30462g0, i14, num2, h.a().t0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        String str = "ROBLOX_COMMUNITY_EVENTS";
        f27155w = new b(str, 12, "channel_virtual_event", q0.f30483n0, i13, num3, h.a().t0(), z12, uri3, audioAttributes3, jArr3, c.f27171f, 488, defaultConstructorMarker3);
        int i15 = 13;
        int i16 = 1;
        String str2 = "DND";
        String str3 = "channel_dnd";
        f27156x = new b(str2, i15, str3, q0.f30475k1, i16, Integer.valueOf(q0.f30457e1), h.a().t0(), z11, uri2, audioAttributes2, jArr2, null, 992, defaultConstructorMarker2);
        f27157y = new b("SECURITY", 14, "channel_security", q0.f30490p1, 5, Integer.valueOf(q0.f30463g1), false, z12, uri3, audioAttributes3, jArr3, null, PointerIconCompat.TYPE_TEXT, defaultConstructorMarker3);
        int i17 = 15;
        int i18 = 4;
        boolean z13 = false;
        String str4 = "CALLS";
        String str5 = "channel_calls";
        f27158z = new b(str4, i17, str5, q0.f30469i1, i18, Integer.valueOf(q0.f30454d1), z13, z11, RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build(), n.b, 0 == true ? 1 : 0, 528, defaultConstructorMarker2);
        int i19 = q0.f30487o1;
        int i20 = q0.f30460f1;
        String str6 = "OTHER";
        String str7 = "channel_others";
        A = new b(str6, 16, str7, i19, 3, Integer.valueOf(i20), h.a().t0(), false, null, null, 0 == true ? 1 : 0, null, 992, null);
        b[] a10 = a();
        B = a10;
        C = pt.b.a(a10);
    }

    public b(String str, int i10, String str2, int i11, int i12, Integer num, boolean z10, boolean z11, Uri uri, AudioAttributes audioAttributes, long[] jArr, c cVar) {
        this.id = str2;
        this.nameId = i11;
        this.importance = i12;
        this.description = num;
        this.isFlagEnabled = z10;
        this.useDefaultChannelAttributes = z11;
        this.ringtoneUri = uri;
        this.ringtoneAttributes = audioAttributes;
        this.vibrationPattern = jArr;
        this.group = cVar;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f27143k, f27144l, f27145m, f27146n, f27147o, f27148p, f27149q, f27150r, f27151s, f27152t, f27153u, f27154v, f27155w, f27156x, f27157y, f27158z, A};
    }

    @NotNull
    public static pt.a<b> c() {
        return C;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) B.clone();
    }

    @Nullable
    /* renamed from: b, reason: from getter */
    public final Integer getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: d, reason: from getter */
    public final c getGroup() {
        return this.group;
    }

    /* renamed from: e, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    /* renamed from: h, reason: from getter */
    public final int getNameId() {
        return this.nameId;
    }

    @Nullable
    /* renamed from: j, reason: from getter */
    public final AudioAttributes getRingtoneAttributes() {
        return this.ringtoneAttributes;
    }

    @Nullable
    /* renamed from: l, reason: from getter */
    public final Uri getRingtoneUri() {
        return this.ringtoneUri;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getUseDefaultChannelAttributes() {
        return this.useDefaultChannelAttributes;
    }

    @Nullable
    /* renamed from: o, reason: from getter */
    public final long[] getVibrationPattern() {
        return this.vibrationPattern;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsFlagEnabled() {
        return this.isFlagEnabled;
    }

    public /* synthetic */ b(String str, int i10, String str2, int i11, int i12, Integer num, boolean z10, boolean z11, Uri uri, AudioAttributes audioAttributes, long[] jArr, c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, i11, i12, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? true : z11, (i13 & 64) != 0 ? null : uri, (i13 & 128) != 0 ? null : audioAttributes, (i13 & 256) != 0 ? null : jArr, (i13 & 512) != 0 ? null : cVar);
    }
}
