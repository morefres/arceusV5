package qi;

import ci.k;
import ek.q;
import ek.y;
import iv.d;
import iv.f;
import iv.x;
import java.util.Locale;
import oi.g;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: qi.a$a, reason: collision with other inner class name */
    public class C0519a implements f<ResponseBody> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29863a;

        public C0519a(g gVar) {
            this.f29863a = gVar;
        }

        @Override // iv.f
        public void a(d<ResponseBody> dVar, Throwable th2) {
            a.this.b(this.f29863a);
        }

        @Override // iv.f
        public void b(d<ResponseBody> dVar, x<ResponseBody> xVar) {
            a.this.c(y.a(xVar), xVar.b(), this.f29863a);
        }
    }

    public void a(String str, String str2, String str3, g gVar) {
        if (gVar != null) {
            gVar.a(oi.f.b(str), oi.f.b(str2), str3);
        }
    }

    public void b(g gVar) {
        q.h("rbx.locale", " api failure");
        a(null, null, null, gVar);
    }

    public void c(String str, int i10, g gVar) {
        String a10;
        String c10;
        q.h("rbx.locale", "response: " + str + " ,response code:" + i10);
        String str2 = null;
        if (i10 == 200) {
            try {
                ri.a aVar = new ri.a(new JSONObject(str));
                String b = aVar.b();
                a10 = aVar.a();
                str2 = b;
                c10 = aVar.c();
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            q.h("rbx.locale", "loginSignUpLocale = " + str2);
            q.h("rbx.locale", "generalExperienceLocale = " + a10);
            q.h("rbx.locale", "ugcLocale = " + c10);
            a(str2, a10, c10, gVar);
        }
        q.h("rbx.locale", "response code != 200, response code = " + i10);
        c10 = null;
        a10 = null;
        q.h("rbx.locale", "loginSignUpLocale = " + str2);
        q.h("rbx.locale", "generalExperienceLocale = " + a10);
        q.h("rbx.locale", "ugcLocale = " + c10);
        a(str2, a10, c10, gVar);
    }

    public void d(Locale locale, g gVar) {
        if (locale == null) {
            q.h("rbx.locale", "device locale null");
            a(null, null, null, gVar);
            return;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        q.h("rbx.locale", "deviceLocale: " + language + "-" + country);
        tk.g.d().e(k.a().b()).a(language + "-" + country).F(new C0519a(gVar));
    }
}
