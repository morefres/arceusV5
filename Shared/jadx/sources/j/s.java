package j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Calendar;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public class s {

    /* renamed from: d, reason: collision with root package name */
    public static s f21396d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21397a;
    public final LocationManager b;

    /* renamed from: c, reason: collision with root package name */
    public final a f21398c = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21399a;
        public long b;
    }

    public s(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f21397a = context;
        this.b = locationManager;
    }

    public static s a(@NonNull Context context) {
        if (f21396d == null) {
            Context applicationContext = context.getApplicationContext();
            f21396d = new s(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f21396d;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location c10 = l2.g.b(this.f21397a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c11 = l2.g.b(this.f21397a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c11 == null || c10 == null) ? c11 != null ? c11 : c10 : c11.getTime() > c10.getTime() ? c11 : c10;
    }

    public final Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f21398c;
        if (e()) {
            return aVar.f21399a;
        }
        Location b = b();
        if (b != null) {
            f(b);
            return aVar.f21399a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    public final boolean e() {
        return this.f21398c.b > System.currentTimeMillis();
    }

    public final void f(@NonNull Location location) {
        long j10;
        a aVar = this.f21398c;
        long currentTimeMillis = System.currentTimeMillis();
        r b = r.b();
        b.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b.f21395c == 1;
        long j11 = b.b;
        long j12 = b.f21394a;
        b.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = b.b;
        if (j11 == -1 || j12 == -1) {
            j10 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis > j12) {
                j11 = j13;
            } else if (currentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        }
        aVar.f21399a = z10;
        aVar.b = j10;
    }
}
