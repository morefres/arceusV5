package d9;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final q9.a f14442c = new q9.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f14443a;
    public final l9.t b = new l9.t(null);

    public e(String str) {
        this.f14443a = n9.m.f(str);
    }

    public static k9.i a(String str) {
        if (str == null) {
            return k9.j.a(new Status(4), null);
        }
        e eVar = new e(str);
        new Thread(eVar).start();
        return eVar.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f5768m;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f14443a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f5766k;
            } else {
                f14442c.b("Unable to revoke access!", new Object[0]);
            }
            f14442c.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f14442c.b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f14442c.b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.b.h(status);
    }
}
