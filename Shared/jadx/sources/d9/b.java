package d9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final Lock f14439c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static b f14440d;

    /* renamed from: a, reason: collision with root package name */
    public final Lock f14441a = new ReentrantLock();
    public final SharedPreferences b;

    public b(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    public static b b(@NonNull Context context) {
        n9.m.l(context);
        Lock lock = f14439c;
        lock.lock();
        try {
            if (f14440d == null) {
                f14440d = new b(context.getApplicationContext());
            }
            b bVar = f14440d;
            lock.unlock();
            return bVar;
        } catch (Throwable th2) {
            f14439c.unlock();
            throw th2;
        }
    }

    public static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f14441a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.f14441a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g11) && (g10 = g(i("googleSignInAccount", g11))) != null) {
            try {
                return GoogleSignInAccount.E3(g10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions d() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g11) && (g10 = g(i("googleSignInOptions", g11))) != null) {
            try {
                return GoogleSignInOptions.D3(g10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        n9.m.l(googleSignInAccount);
        n9.m.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.F3());
        n9.m.l(googleSignInAccount);
        n9.m.l(googleSignInOptions);
        String F3 = googleSignInAccount.F3();
        h(i("googleSignInAccount", F3), googleSignInAccount.G3());
        h(i("googleSignInOptions", F3), googleSignInOptions.H3());
    }

    public final String g(@NonNull String str) {
        this.f14441a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.f14441a.unlock();
        }
    }

    public final void h(@NonNull String str, @NonNull String str2) {
        this.f14441a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.f14441a.unlock();
        }
    }
}
