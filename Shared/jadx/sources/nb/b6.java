package nb;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class b6 extends xd {
    public b6(me meVar) {
        super(meVar);
    }

    @Override // nb.xd
    public final boolean l() {
        return false;
    }

    public final boolean m() {
        j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f26328a.d().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public final void n(String str, yd ydVar, com.google.android.gms.internal.measurement.y6 y6Var, y5 y5Var) {
        b6 b6Var;
        String str2;
        URL url;
        byte[] d10;
        h();
        j();
        try {
            url = new URI(ydVar.a()).toURL();
            this.b.K0();
            d10 = y6Var.d();
            b6Var = this;
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            b6Var = this;
            str2 = str;
        }
        try {
            this.f26328a.b().w(new a6(b6Var, str2, url, d10, ydVar.b(), y5Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            b6Var.f26328a.a().o().c("Failed to parse URL. Not uploading MeasurementBatch. appId", w5.x(str2), ydVar.a());
        }
    }

    public final void o(c6 c6Var, Map map, y5 y5Var) {
        b6 b6Var;
        URL url;
        h();
        j();
        n9.m.l(c6Var);
        n9.m.l(y5Var);
        zd C0 = this.b.C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) z4.f26866f.b(null)).encodedAuthority((String) z4.f26869g.b(null)).path("config/app/".concat(String.valueOf(c6Var.r0()))).appendQueryParameter("platform", "android");
        C0.f26328a.w().A();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            url = new URI(uri).toURL();
            b6Var = this;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            b6Var = this;
        }
        try {
            this.f26328a.b().w(new a6(b6Var, c6Var.o0(), url, null, map, y5Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            b6Var.f26328a.a().o().c("Failed to parse config URL. Not fetching. appId", w5.x(c6Var.o0()), uri);
        }
    }
}
