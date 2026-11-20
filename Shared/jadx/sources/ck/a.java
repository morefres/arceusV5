package ck;

import ek.q;
import ek.y;
import iv.d;
import iv.f;
import iv.x;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import tk.g;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: ck.a$a, reason: collision with other inner class name */
    public class C0107a implements f<ResponseBody> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bk.a f5008a;

        public C0107a(bk.a aVar) {
            this.f5008a = aVar;
        }

        @Override // iv.f
        public void a(d<ResponseBody> dVar, Throwable th2) {
            a.this.b(this.f5008a);
        }

        @Override // iv.f
        public void b(d<ResponseBody> dVar, x<ResponseBody> xVar) {
            a.this.c(y.a(xVar), xVar.b(), this.f5008a);
        }
    }

    public void a(bk.a aVar, String str) {
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public void b(bk.a aVar) {
        q.h("rbx.accountsettings", " api failure");
        a(aVar, null);
    }

    public void c(String str, int i10, bk.a aVar) {
        String str2 = null;
        if (i10 == 200) {
            try {
                str2 = new b(new JSONObject(str)).a();
            } catch (JSONException e10) {
                e10.printStackTrace();
                q.d("JSONException thrown while parsing response to fetch user theme from server. Exception message: " + e10.getMessage());
            }
        } else {
            q.h("rbx.accountsettings", "response code != 200, response code = " + i10);
        }
        a(aVar, str2);
    }

    public void d(long j10, bk.a aVar) {
        g.d().h().a(j10).F(new C0107a(aVar));
    }
}
