package com.roblox.protocols.webview;

import androidx.annotation.Keep;
import j6.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rl.d;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\b\u0010\tJ(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/roblox/protocols/webview/DomainAllowListChecker;", "", "<init>", "()V", "", "targetUrl", "contextUrl", "", "isKnownTrustedDomain", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;", "callback", "", "checkDomainAllowList", "(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;)V", "enableDomainAllowListChecker", "()Z", "Callback", ve.a.f33391e, "robloxengine_commonDefaultProtectionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomainAllowListChecker {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DomainAllowListChecker f9782a = new DomainAllowListChecker();

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;", "", "", "result", "", "onResult", "(I)V", "Lcom/roblox/protocols/webview/DomainAllowListChecker$a;", "(Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V", "robloxengine_commonDefaultProtectionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Callback {
        default void onResult(int result) {
            pt.a<a> b = a.b();
            onResult((a) ((result < 0 || result >= b.size()) ? a.f9783a : b.get(result)));
        }

        void onResult(@NotNull a result);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/roblox/protocols/webview/DomainAllowListChecker$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, b.f21518e, "c", d.f30696a, "robloxengine_commonDefaultProtectionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9783a = new a("Unknown", 0);
        public static final a b = new a("FirstParty", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f9784c = new a("SecondParty", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f9785d = new a("ThirdParty", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f9786e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ pt.a f9787f;

        static {
            a[] a10 = a();
            f9786e = a10;
            f9787f = pt.b.a(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f9783a, b, f9784c, f9785d};
        }

        @NotNull
        public static pt.a<a> b() {
            return f9787f;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9786e.clone();
        }
    }

    public final native void checkDomainAllowList(@NotNull String targetUrl, @NotNull String contextUrl, @NotNull Callback callback);

    public final native boolean enableDomainAllowListChecker();

    public final native boolean isKnownTrustedDomain(@NotNull String targetUrl, @NotNull String contextUrl);
}
