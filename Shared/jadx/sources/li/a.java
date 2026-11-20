package li;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import ek.q;

/* loaded from: classes2.dex */
public class a extends nk.a {
    public static Context d() {
        return RobloxApplication.f();
    }

    @Override // nk.a
    public String a() {
        String i10 = oi.b.f().i(d());
        if (i10 == null) {
            return c();
        }
        q.i("rbx.locale", "ugcLocaleCode : " + i10);
        return i10;
    }

    @Override // nk.a
    public String b() {
        return d().getResources().getConfiguration().getLocales().get(0).toString();
    }

    @Override // nk.a
    public String c() {
        return oi.b.f().j().d();
    }
}
