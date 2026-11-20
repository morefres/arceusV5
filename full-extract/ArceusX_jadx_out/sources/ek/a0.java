package ek;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.roblox.client.personasdk.BuildConfig;
import gt.n;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/content/Context;", "", rl.d.f30696a, "(Landroid/content/Context;)Z", "c", "", "deeplinkUriFormat", "webUriFormat", j6.b.f21518e, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "uri", ve.a.f33391e, "(Landroid/content/Context;Ljava/lang/String;)Z", "utils_googleRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a0 {
    public static final boolean a(Context context, String str) {
        Object b;
        boolean z10;
        try {
            n.Companion companion = gt.n.INSTANCE;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(1208483840);
            if (BuildConfig.STORE_PACKAGE.length() > 0) {
                intent.setPackage(BuildConfig.STORE_PACKAGE);
            }
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            if (queryIntentActivities.isEmpty()) {
                z10 = false;
            } else {
                context.startActivity(intent);
                z10 = true;
            }
            b = gt.n.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        Throwable e10 = gt.n.e(b);
        if (e10 != null) {
            q.f("PackageUtils", "Error while trying to launch activity using URI " + str, e10);
            b = Boolean.FALSE;
        }
        return ((Boolean) b).booleanValue();
    }

    public static final boolean b(Context context, String str, String str2) {
        Locale locale = Locale.ROOT;
        String format = String.format(locale, str, Arrays.copyOf(new Object[]{context.getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String format2 = String.format(locale, str2, Arrays.copyOf(new Object[]{context.getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return a(context, format) || a(context, format2);
    }

    public static final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return b(context, "https://spdmteam.com/%s", "https://spdmteam.com/%s");
    }

    public static final boolean d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return b(context, "https://spdmteam.com/%s", "https://spdmteam.com/%s");
    }
}
