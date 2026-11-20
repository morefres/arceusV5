package hi;

import android.text.TextUtils;
import ek.q;
import rk.b;

/* loaded from: classes2.dex */
public class g extends rk.b {

    public class a implements b.a {
        public a() {
        }

        @Override // rk.b.a
        public void a(rk.a aVar) {
            b(aVar, ev.c.d());
        }

        public void b(rk.a aVar, ev.c cVar) {
            q.i("rbx.locale", "RBHybridModuleLocalization LanguageChangeTrigger.execute() " + aVar.f());
            String optString = aVar.f().optString("newRobloxLanguageValue");
            if (TextUtils.isEmpty(optString)) {
                aVar.a(false, null);
                return;
            }
            q.i("rbx.locale", "newRobloxLocaleValue " + optString);
            oi.f b = oi.f.b(optString);
            if (b != null) {
                cVar.j(new oh.a(b));
            }
            aVar.a(true, null);
        }
    }

    public g() {
        super("Localization");
        d("languageChangeTrigger", new a());
    }
}
