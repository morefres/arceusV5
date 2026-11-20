package oi;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import ek.q;
import java.util.Locale;
import oi.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    public c f27869f;

    /* renamed from: g, reason: collision with root package name */
    public oi.c f27870g;

    /* renamed from: h, reason: collision with root package name */
    public Connection f27871h;

    /* renamed from: a, reason: collision with root package name */
    public f f27865a = null;
    public f b = null;

    /* renamed from: c, reason: collision with root package name */
    public Locale f27866c = null;

    /* renamed from: d, reason: collision with root package name */
    public f f27867d = null;

    /* renamed from: e, reason: collision with root package name */
    public String f27868e = null;

    /* renamed from: i, reason: collision with root package name */
    public c.a f27872i = new a();

    public class a implements c.a {
        public a() {
        }

        @Override // oi.c.a
        public oi.c a(Context context) {
            return new d(context);
        }
    }

    /* renamed from: oi.b$b, reason: collision with other inner class name */
    public static final class C0488b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27874a = new b();
    }

    public enum c {
        LOCALE_MODE_LOGIN_SIGN_UP,
        LOCALE_MODE_GENERAL_EXPERIENCE
    }

    public static Locale b(String str) {
        if (!str.contains("_")) {
            return new Locale(str);
        }
        String[] split = str.split("_");
        return new Locale(split[0], split[1]);
    }

    public static b f() {
        return C0488b.f27874a;
    }

    @NonNull
    public final f c() {
        Locale e10 = e();
        if (e10 != null) {
            String country = e10.getCountry();
            String language = e10.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                if (!TextUtils.isEmpty(country)) {
                    language = language + "_" + country;
                }
                f a10 = f.a(language);
                return a10 != null ? a10 : f.f27879d;
            }
        }
        return f.f27879d;
    }

    @NonNull
    public f d(Context context) {
        f fVar = this.b;
        if (fVar != null) {
            return fVar;
        }
        f c10 = h(context).c();
        return c10 == null ? c() : c10;
    }

    public Locale e() {
        return this.f27866c;
    }

    public c g() {
        return this.f27869f;
    }

    public final oi.c h(Context context) {
        if (this.f27870g == null) {
            this.f27870g = this.f27872i.a(context);
        }
        return this.f27870g;
    }

    public String i(Context context) {
        String str = this.f27868e;
        if (str == null && context != null) {
            q.i("rbx.locale", "mUGCLocaleCode is Empty");
            f d10 = h(context).d();
            if (d10 != null) {
                str = d10.d();
            }
            if (str == null) {
                q.h("rbx.locale", "No stored value for mUGCLocaleCode. Use English");
                str = f.f27879d.d();
            }
        }
        q.i("rbx.locale", "mUGCLocaleCode value is: " + str);
        return str;
    }

    public f j() {
        return this.f27865a;
    }

    public boolean k(f fVar) {
        return this.f27865a.equals(fVar);
    }

    public final /* synthetic */ void l(Context context, JSONObject jSONObject) {
        f b;
        try {
            String string = jSONObject.getString("localeId");
            if (string == null || string.isEmpty() || (b = f.b(string)) == null || f().k(b)) {
                return;
            }
            q.h("rbx.locale", "Receive new locale value from LUA " + b.d() + " " + b.c());
            o(b, context);
            r(b);
            t(context, string);
            n(b, context);
        } catch (JSONException unused) {
            q.e("MessageBus", "Failed to get QR code image userId");
        }
    }

    public void m(final Context context) {
        this.f27871h = MessageBus.f().t("Locale.RobloxLocaleIdChanged", new Callback() { // from class: oi.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                b.this.l(context, jSONObject);
            }
        });
    }

    public boolean n(f fVar, Context context) {
        if (fVar == null) {
            return false;
        }
        boolean k10 = k(fVar);
        boolean z10 = !k10;
        if (!k10 && context != null) {
            h(context).f(fVar);
            w(context, fVar);
        }
        return z10;
    }

    public void o(f fVar, Context context) {
        p(fVar);
        h(context).b(this.b);
    }

    public void p(f fVar) {
        this.b = fVar;
    }

    public void q(Locale locale) {
        this.f27866c = locale;
    }

    public void r(f fVar) {
        this.f27867d = fVar;
    }

    public void s(c cVar) {
        this.f27869f = cVar;
    }

    public void t(Context context, String str) {
        this.f27868e = str;
        h(context).a(this.f27868e);
    }

    public void u(Context context) {
        f fVar = this.f27865a;
        if (fVar == null) {
            q.h("rbx.locale", "mUserLocale is empty");
            fVar = h(context).e();
            if (fVar == null) {
                q.h("rbx.locale", "No stored value for mUserLocale.");
                fVar = c();
            }
        }
        q.h("rbx.locale", "Updating App configuration based on locale = " + fVar);
        w(context, fVar);
    }

    public final Context v(Context context, String str, Resources resources, Configuration configuration) {
        Locale b = b(str);
        Locale.setDefault(b);
        configuration.setLocale(b);
        configuration.setLayoutDirection(b);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context.createConfigurationContext(configuration);
    }

    public final Context w(Context context, f fVar) {
        this.f27865a = fVar;
        String c10 = fVar.c();
        Resources resources = context.getResources();
        return v(context, c10, resources, resources.getConfiguration());
    }
}
