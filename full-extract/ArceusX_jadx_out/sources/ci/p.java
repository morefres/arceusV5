package ci;

import android.content.Context;
import iv.x;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public class p {

    public class a implements iv.f<ResponseBody> {
        @Override // iv.f
        public void a(iv.d<ResponseBody> dVar, Throwable th2) {
        }

        @Override // iv.f
        public void b(iv.d<ResponseBody> dVar, x<ResponseBody> xVar) {
        }
    }

    public static void a(Context context, String str) {
        tk.g.d().f().a(new yk.a(new hj.x().a(context, hj.r.k().n(context)), str)).F(new a());
    }
}
