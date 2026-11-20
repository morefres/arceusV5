package hi;

import ek.q;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import rk.b;

/* loaded from: classes2.dex */
public class b extends rk.b {

    public class a implements b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            String optString = aVar.f().optString("placeID");
            if (optString == null) {
                aVar.a(false, null);
                return;
            }
            q.i("rbx.hybrid", "ShareGameToChat.execute() " + optString);
            aVar.a(true, null);
        }

        public a() {
        }
    }

    /* renamed from: hi.b$b, reason: collision with other inner class name */
    public class C0346b implements b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            JSONObject optJSONObject;
            ArrayList arrayList = new ArrayList();
            JSONObject f10 = aVar.f();
            if (f10 != null && (optJSONObject = f10.optJSONObject("params")) != null) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("userIds");
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    long optLong = optJSONArray.optLong(i10, -1L);
                    if (optLong != -1) {
                        arrayList.add(Long.valueOf(optLong));
                    }
                }
            }
            if (arrayList.size() <= 0) {
                aVar.a(false, null);
            } else {
                ev.c.d().j(new oh.f(-1L, ((Long) arrayList.get(0)).longValue()));
                aVar.a(true, null);
            }
        }

        public C0346b() {
        }
    }

    public b() {
        super("Chat");
        d("startChatConversation", new C0346b());
        d("shareGameToChat", new a());
    }
}
