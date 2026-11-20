package vo;

import android.content.Context;
import android.net.Uri;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Lvo/e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lvo/a;", "c", "(Landroid/content/Context;)Lvo/a;", "", "url", ve.a.f33391e, "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri;", j6.b.f21518e, "(Ljava/lang/String;)Landroid/net/Uri;", "", "Ljava/util/List;", "CHROME_PACKAGES", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f33497a = new e();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<String> CHROME_PACKAGES = kotlin.collections.o.d("com.android.chrome");

    @NotNull
    public final String a(@NotNull String url) {
        String host;
        Intrinsics.checkNotNullParameter(url, "url");
        Uri b = b(url);
        if (b == null || (host = b.getHost()) == null) {
            return "withpersona.com";
        }
        int port = b.getPort();
        if (port == -1) {
            return host;
        }
        return host + ":" + port;
    }

    public final Uri b(String url) {
        String queryParameter = Uri.parse(url).getQueryParameter("redirect_uri");
        if (queryParameter == null) {
            return null;
        }
        String decode = URLDecoder.decode(queryParameter, Charsets.UTF_8.name());
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return Uri.parse(decode);
    }

    @NotNull
    public final BrowserSelection c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String d10 = w.c.d(context, CHROME_PACKAGES, true);
        if (d10 != null) {
            return new BrowserSelection(d10, w.c.e(context, d10));
        }
        String c10 = w.c.c(context, null);
        return new BrowserSelection(c10, c10 != null && w.c.e(context, c10));
    }
}
