package nb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.sdk_base.referrer.Payload;

/* loaded from: classes.dex */
public final class cf {

    /* renamed from: a, reason: collision with root package name */
    public final g7 f26144a;

    public cf(g7 g7Var) {
        this.f26144a = g7Var;
    }

    public final void a() {
        g7 g7Var = this.f26144a;
        g7Var.b().h();
        if (e()) {
            if (d()) {
                g7Var.x().f26392x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString(Payload.SOURCE, "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                g7Var.B().t("auto", "_cmpx", bundle);
            } else {
                String a10 = g7Var.x().f26392x.a();
                if (TextUtils.isEmpty(a10)) {
                    g7Var.a().p().a("Cache still valid but referrer not found");
                } else {
                    long a11 = g7Var.x().f26393y.a() / 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (a11 - 1) * 3600000);
                    Object obj = pair.first;
                    g7Var.B().t(obj == null ? Payload.TYPE_APP : (String) obj, "_cmp", (Bundle) pair.second);
                }
                g7Var.x().f26392x.b(null);
            }
            g7Var.x().f26393y.b(0L);
        }
    }

    public final void b(String str, Bundle bundle) {
        String uri;
        g7 g7Var = this.f26144a;
        g7Var.b().h();
        if (g7Var.g()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        g7Var.x().f26392x.b(uri);
        g7Var.x().f26393y.b(g7Var.e().a());
    }

    public final void c() {
        if (e() && d()) {
            this.f26144a.x().f26392x.b(null);
        }
    }

    public final boolean d() {
        if (!e()) {
            return false;
        }
        g7 g7Var = this.f26144a;
        return g7Var.e().a() - g7Var.x().f26393y.a() > g7Var.w().D(null, z4.f26882k0);
    }

    public final boolean e() {
        return this.f26144a.x().f26393y.a() > 0;
    }
}
