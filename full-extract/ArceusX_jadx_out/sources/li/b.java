package li;

import android.content.Context;
import ek.q;
import iv.d;
import iv.f;
import iv.x;
import okhttp3.ResponseBody;
import ti.h;
import tk.g;

/* loaded from: classes2.dex */
public class b implements pk.a {

    /* renamed from: a, reason: collision with root package name */
    public static String f23469a;

    public class a implements f<ResponseBody> {
        public a() {
        }

        @Override // iv.f
        public void a(d<ResponseBody> dVar, Throwable th2) {
        }

        @Override // iv.f
        public void b(d<ResponseBody> dVar, x<ResponseBody> xVar) {
            q.b("rbx.jni", "sendSessionReport() success:" + xVar.g());
        }
    }

    public b(Context context) {
        f23469a = context.getFilesDir().getAbsolutePath();
    }

    @Override // pk.a
    public String a() {
        return f23469a;
    }

    @Override // pk.a
    public void b(String str, String str2) {
        long j10;
        try {
            j10 = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            q.k("rbx.jni", "sendSessionReport() could not parse placeId");
            j10 = -1;
        }
        g.d().a().a(j10, str).F(new a());
    }

    @Override // pk.a
    public String c() {
        return Long.toString(h.e().g());
    }

    @Override // pk.a
    public String d() {
        return dk.c.c().k();
    }

    @Override // pk.a
    public String e() {
        return "2.746.1266";
    }

    @Override // pk.a
    public void f(String str, String str2, String str3, long j10) {
        try {
            Long.parseLong(str3);
        } catch (NumberFormatException unused) {
        }
    }
}
