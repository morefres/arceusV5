package hi;

import ek.q;
import org.json.JSONObject;
import rk.b;

/* loaded from: classes2.dex */
public class h extends rk.b {

    public class a implements b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            JSONObject jSONObject;
            String str;
            String str2;
            boolean z10;
            String b;
            JSONObject f10 = aVar.f();
            if (f10 != null) {
                jSONObject = f10.optJSONObject("params");
                if (jSONObject != null) {
                    str = jSONObject.optString("feature", null);
                    str2 = jSONObject.optString("urlPath", null);
                    q.i("Navigation", str + " " + str2);
                    if (str != null || (b = b(str)) == null) {
                        z10 = false;
                    } else {
                        oh.g gVar = new oh.g(b);
                        gVar.i(str2);
                        if (jSONObject != null) {
                            gVar.h(jSONObject);
                        }
                        ev.c.d().j(gVar);
                        z10 = true;
                    }
                    aVar.a(z10, null);
                }
                str = null;
            } else {
                jSONObject = null;
                str = null;
            }
            str2 = str;
            q.i("Navigation", str + " " + str2);
            if (str != null) {
            }
            z10 = false;
            aVar.a(z10, null);
        }

        public final String b(String str) {
            if ("Settings".equals(str)) {
                return "SETTINGS_TAG";
            }
            if ("Friends".equals(str)) {
                return "FRIENDS_TAG";
            }
            if ("Games".equals(str)) {
                return "GAMES_TAG";
            }
            if ("Home".equals(str)) {
                return "HOME_TAG";
            }
            if ("Messages".equals(str)) {
                return "MESSAGES_TAG";
            }
            if ("Avatar".equals(str)) {
                return "AVATAR_EDITOR_TAG";
            }
            if ("Abuse Report".equals(str)) {
                return "ABUSE_REPORT_TAG";
            }
            if ("Friend Finder".equals(str)) {
                return "FRIEND_FINDER_TAG";
            }
            if ("Universal Friends".equals(str)) {
                return "UNIVERSAL_FRIENDS_TAG";
            }
            if ("GameDetails".equals(str)) {
                return "GAME_DETAILS_TAG";
            }
            if ("CaptchaSuccess".equals(str)) {
                return "CAPTCHA_SUCCESS_TAG";
            }
            if ("CaptchaShown".equals(str)) {
                return "CAPTCHA_SHOWN_TAG";
            }
            return null;
        }

        public a() {
        }
    }

    public class b implements b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            JSONObject f10 = aVar.f();
            if (f10 != null) {
                long optLong = f10.optLong("userId", -1L);
                oh.g gVar = new oh.g("PROFILE_TAG");
                gVar.i(oh.g.c(optLong));
                ev.c.d().j(gVar);
                aVar.a(true, null);
            }
        }

        public b() {
        }
    }

    public h() {
        super("Navigation");
        d("navigateToFeature", new a());
        d("openUserProfile", new b());
    }
}
