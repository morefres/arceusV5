package wg;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import ek.q;
import ek.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import nb.pa;
import rg.q0;
import rg.t0;
import rh.h;
import ti.g;
import wg.b;

/* loaded from: classes2.dex */
public class a implements b.a {

    /* renamed from: j, reason: collision with root package name */
    public static final Map<String, String> f34328j = rg.b.a(new Map.Entry[]{pa.a("en", "EN"), pa.a("ar", "AR"), pa.a("id", "ID"), pa.a("fr", "FR"), pa.a("de", "DE"), pa.a("hi", "HI"), pa.a("it", "IT"), pa.a("ja", "JA"), pa.a("ko", "KO"), pa.a("pl", "PL"), pa.a("pt", "PT"), pa.a("th", "TH"), pa.a("tr", "TR"), pa.a("vi", "VI"), pa.a("zh", "ZH-S"), pa.a("es", "ES-ES")});

    /* renamed from: k, reason: collision with root package name */
    public static a f34329k;

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f34330a;
    public int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f34331c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f34332d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f34333e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f34334f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f34335g = 0;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f34336h = Boolean.TRUE;

    /* renamed from: i, reason: collision with root package name */
    public List<NameValuePair> f34337i;

    public static a e() {
        a aVar = f34329k;
        if (aVar != null) {
            return aVar;
        }
        synchronized (a.class) {
            try {
                if (f34329k == null) {
                    f34329k = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f34329k;
    }

    public static void h(Context context) {
        z.a(context, "rate_me_maybe").edit().clear().apply();
        q.b("RateMeMaybe", "Cleared RateMeMaybe shared preferences.");
    }

    @Override // wg.b.a
    public void a(Activity activity) {
        if (h.a().d5()) {
            Uri.Builder buildUpon = Uri.parse(h.a().z0()).buildUpon();
            String str = f34328j.get(Locale.getDefault().getLanguage());
            if (str != null) {
                buildUpon.appendQueryParameter("Q_lang", str);
            }
            c.a(activity, buildUpon.build().toString());
        }
        SharedPreferences.Editor edit = this.f34330a.edit();
        edit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        edit.apply();
        if (h.a().l0()) {
            j("not_now");
        } else {
            f().q("Mobile-Ratings-NotNow-Tapped-Android");
        }
    }

    @Override // wg.b.a
    public void b(Context context) {
        SharedPreferences.Editor edit = this.f34330a.edit();
        edit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        edit.apply();
        AppRatingPromptHandler.k((j.b) context, context.getString(q0.f30449c));
        if (h.a().l0()) {
            j("yes");
        } else {
            f().q("Mobile-Ratings-Yes-Tapped-Android");
        }
    }

    @Override // wg.b.a
    public void c(Activity activity) {
        if (h.a().l0()) {
            j("close");
        }
        if (this.f34336h.booleanValue()) {
            d(true);
        } else {
            a(activity);
        }
    }

    @Override // wg.b.a
    public void d(boolean z10) {
        if (z10 || !h.a().l0()) {
            f().q("Mobile-Ratings-RemindMe-Tapped-Android");
        } else {
            j("remind");
        }
    }

    public final g f() {
        return g.b();
    }

    public void g(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f34337i = arrayList;
        arrayList.add(new NameValuePair("target", "mobile"));
        this.f34337i.add(new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, ""));
        this.f34337i.add(new NameValuePair("gameId", ""));
        this.f34337i.add(new NameValuePair("btn", ""));
        SharedPreferences a10 = z.a(context, "rate_me_maybe");
        this.f34330a = a10;
        SharedPreferences.Editor edit = a10.edit();
        if (!"2.746.1266".equals(this.f34330a.getString("CURRENT_APP_VERSION", ""))) {
            h(context);
            edit.putString("CURRENT_APP_VERSION", "2.746.1266");
        }
        if (this.f34330a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L) == 0) {
            edit.putLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", System.currentTimeMillis());
        }
        edit.putInt("PREF_TOTAL_LAUNCH_COUNT", this.f34330a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0) + 1);
        edit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", this.f34330a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0) + 1);
        edit.apply();
    }

    public void i(Activity activity, long j10, String str) {
        if (this.f34330a.getBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", false)) {
            return;
        }
        if (this.f34335g > this.f34330a.getInt("PREF_GAMES_PLAYED", 0)) {
            q.b("RateMeMaybe", "Hasn't played a number games higher than the minimum requested.");
            return;
        }
        if (this.f34334f > this.f34330a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            q.b("RateMeMaybe", "Hasn't played a game for more than the minimum time requested.");
            return;
        }
        SharedPreferences.Editor edit = this.f34330a.edit();
        int i10 = this.f34330a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f34330a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L);
        long j12 = this.f34330a.getLong("PREF_TIME_OF_LAST_PROMPT", 0L);
        int i11 = this.f34330a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        if (i10 < this.b || currentTimeMillis - j11 < this.f34331c * 86400000) {
            q.b("RateMeMaybe", "Not enough time until initial prompt.");
            edit.apply();
            return;
        }
        q.b("RateMeMaybe", "Enough time until initial prompt.");
        if (j12 != 0 && (i11 < this.f34332d || currentTimeMillis - j12 < this.f34333e * 86400000)) {
            q.b("RateMeMaybe", "User has seen a prompt recently || (Not enough launches since last prompt || Not enough time since last prompt)");
            edit.apply();
            return;
        }
        q.b("RateMeMaybe", "User has not seen a prompt || (Enough launches since last prompt && Enough time since last prompt)");
        if (h.a().l0()) {
            this.f34337i.set(1, new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, Long.toString(j10)));
            this.f34337i.set(2, new NameValuePair("gameId", str));
        }
        edit.putLong("PREF_TIME_OF_LAST_PROMPT", currentTimeMillis);
        edit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        edit.apply();
        l(activity);
    }

    public final void j(String str) {
        this.f34337i.set(3, new NameValuePair("btn", str));
        t0.i("appRatingPrompt", "tap", this.f34337i);
    }

    public void k(int i10, int i11, int i12, int i13, long j10, int i14) {
        this.b = i10;
        this.f34331c = i11;
        this.f34332d = i12;
        this.f34333e = i13;
        this.f34334f = j10;
        this.f34335g = i14;
    }

    public final void l(Activity activity) {
        FragmentManager l12 = ((j.b) activity).l1();
        if (l12.n0("rmmFragment") != null) {
            return;
        }
        b bVar = new b();
        bVar.x2(this);
        try {
            bVar.t2(l12, "rmmFragment");
            if (!h.a().l0()) {
                f().q("Mobile-Ratings-Shown-Android");
            } else {
                this.f34337i.set(3, new NameValuePair("btn", ""));
                t0.i("appRatingPrompt", "impression", this.f34337i);
            }
        } catch (IllegalStateException e10) {
            q.e("RateMeMaybe", "Exception: " + e10.getMessage());
        }
    }

    public void m(long j10) {
        SharedPreferences.Editor edit = this.f34330a.edit();
        if (j10 > this.f34330a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            edit.putLong("PREF_LONGEST_GAME_DURATION", j10);
        }
        edit.putInt("PREF_GAMES_PLAYED", this.f34330a.getInt("PREF_GAMES_PLAYED", 0) + 1);
        edit.apply();
    }
}
