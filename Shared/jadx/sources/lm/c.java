package lm;

import com.roblox.universalapp.externalcontentsharing.JNIExternalContentSharingProtocol;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, d2 = {"Llm/c;", "", "<init>", "()V", "", j6.b.f21518e, "()Ljava/lang/String;", "c", ve.a.f33391e, rl.d.f30696a, "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getGetShareTextIdDelegate", "()Lkotlin/jvm/functions/Function0;", "setGetShareTextIdDelegate", "(Lkotlin/jvm/functions/Function0;)V", "getShareTextIdDelegate", "getGetShareUrlIdDelegate", "setGetShareUrlIdDelegate", "getShareUrlIdDelegate", "getGetShareImageIdDelegate", "setGetShareImageIdDelegate", "getShareImageIdDelegate", "e", "getGetShareVideoIdDelegate", "setGetShareVideoIdDelegate", "getShareVideoIdDelegate", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f23542a = new c();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getShareTextIdDelegate = b.f23547a;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getShareUrlIdDelegate = C0415c.f23548a;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getShareImageIdDelegate = a.f23546a;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getShareVideoIdDelegate = d.f23549a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23546a = new a();

        public a() {
            super(0, JNIExternalContentSharingProtocol.class, "getShareImageId", "getShareImageId()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIExternalContentSharingProtocol.getShareImageId();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends k implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23547a = new b();

        public b() {
            super(0, JNIExternalContentSharingProtocol.class, "getShareTextId", "getShareTextId()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIExternalContentSharingProtocol.getShareTextId();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: lm.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C0415c extends k implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0415c f23548a = new C0415c();

        public C0415c() {
            super(0, JNIExternalContentSharingProtocol.class, "getShareUrlId", "getShareUrlId()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIExternalContentSharingProtocol.getShareUrlId();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d extends k implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f23549a = new d();

        public d() {
            super(0, JNIExternalContentSharingProtocol.class, "getShareVideoId", "getShareVideoId()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIExternalContentSharingProtocol.getShareVideoId();
        }
    }

    @NotNull
    public static final String a() {
        return getShareImageIdDelegate.invoke();
    }

    @NotNull
    public static final String b() {
        return getShareTextIdDelegate.invoke();
    }

    @NotNull
    public static final String c() {
        return getShareUrlIdDelegate.invoke();
    }

    @NotNull
    public static final String d() {
        return getShareVideoIdDelegate.invoke();
    }
}
