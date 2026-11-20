package bi;

import android.content.res.Resources;
import android.os.LocaleList;
import android.util.Log;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "eligibleCountries", "", j6.b.f21518e, "(Ljava/util/Set;)Z", ve.a.f33391e, "()Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {
    @NotNull
    public static final String a() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
        if (locales.isEmpty()) {
            return "";
        }
        String country = locales.get(0).getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return country;
    }

    public static final boolean b(@NotNull Set<String> eligibleCountries) {
        Intrinsics.checkNotNullParameter(eligibleCountries, "eligibleCountries");
        String a10 = a();
        boolean contains = eligibleCountries.contains(a10);
        Log.i("PgsUtils", "Device country: " + a10 + ", eligible: " + contains);
        return contains;
    }
}
