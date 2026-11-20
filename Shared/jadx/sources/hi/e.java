package hi;

import android.os.Bundle;
import com.roblox.client.shortcuts.PinShortcutHandler;
import ek.q;
import org.json.JSONObject;
import rk.b;
import uh.k0;

/* loaded from: classes2.dex */
public class e extends rk.b {

    public class a implements b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            JSONObject f10 = aVar.f();
            if (f10 != null) {
                JSONObject optJSONObject = f10.optJSONObject("request");
                if ("RequestGame".equals(optJSONObject.optString("requestType"))) {
                    try {
                        k0 a10 = k0.a(Long.valueOf(Long.parseLong(optJSONObject.optString(PinShortcutHandler.EXTRA_PLACE_ID))), null, null, null, null, null, null, null, "WebView", null, null, null, null, null, null, null, null);
                        Bundle bundle = new Bundle();
                        bundle.putBundle("game_init_params", k0.O(a10));
                        ti.e.c().f(101, bundle);
                        aVar.a(true, null);
                        return;
                    } catch (NumberFormatException unused) {
                        q.k("rbx.hybrid", "Unsupported launchGame request");
                    }
                }
            }
            q.k("rbx.hybrid", "launchGame request failed");
            aVar.a(false, null);
        }

        public a() {
        }
    }

    public e() {
        super("Game");
        d("launchGame", new a());
    }
}
