package hi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.TextUtils;
import androidx.appcompat.app.a;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import ek.t;
import org.json.JSONObject;
import rg.q0;
import rg.t0;
import rk.b;

/* loaded from: classes2.dex */
public class o extends rk.b {

    public class a implements b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            JSONObject f10 = aVar.f();
            String optString = f10.optString(Text.type);
            String optString2 = f10.optString("link");
            ti.g.b().q("Android-AppMain-GameShare-ChooserShown");
            if (TextUtils.isEmpty(optString2) || optString == null) {
                b(aVar.c(), q0.H0);
                aVar.a(false, null);
                return;
            }
            String obj = Html.fromHtml(optString, 63).toString();
            String obj2 = Html.fromHtml(optString2, 63).toString();
            String string = aVar.c().getString(q0.f30513x0, obj);
            t0.x("", obj2);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string + " " + obj2);
            intent.putExtra("android.intent.extra.SUBJECT", string);
            if (!t.a(aVar.c(), intent)) {
                b(aVar.c(), q0.G0);
                aVar.a(false, null);
                return;
            }
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.PICK_ACTIVITY");
            intent2.putExtra("android.intent.extra.INTENT", intent);
            ((Activity) aVar.c()).startActivityForResult(intent2, 20103);
            aVar.a(true, null);
        }

        public final void b(Context context, int i10) {
            a.C0009a c0009a = new a.C0009a(context);
            c0009a.h(context.getString(i10));
            c0009a.j(q0.f30503u, null);
            c0009a.a().show();
        }

        public a() {
        }
    }

    public o() {
        super("Social");
        d("presentShareDialog", new a());
    }
}
