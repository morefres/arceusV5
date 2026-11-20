package ji;

import ak.d;
import android.os.Build;
import java.security.SecureRandom;
import java.util.ArrayList;
import rh.h;

/* loaded from: classes2.dex */
public class a implements ih.c {

    /* renamed from: g, reason: collision with root package name */
    public static int f21766g;

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f21767a;
    public StringBuilder b;

    /* renamed from: c, reason: collision with root package name */
    public String f21768c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21769d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f21770e = 0;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<String> f21771f = new ArrayList<>();

    /* renamed from: ji.a$a, reason: collision with other inner class name */
    public class C0381a implements ak.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ih.a f21772a;

        public C0381a(ih.a aVar) {
            this.f21772a = aVar;
        }

        @Override // ak.a
        public void a(d dVar) {
            ih.a aVar = this.f21772a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public a(String str) {
        this.f21767a = null;
        this.b = null;
        this.f21768c = "";
        this.f21768c = str;
        this.b = new StringBuilder();
        this.f21767a = new StringBuilder();
    }

    public static void h() {
        f21766g = new SecureRandom().nextInt(100);
    }

    public static boolean k() {
        return f21766g < h.a().K();
    }

    @Override // ih.c
    public void a(ih.a aVar) {
        if (this.f21769d || k()) {
            if (this.f21770e == 0) {
                this.f21770e = i();
            }
            new ak.b(h.a().o3(), h.a().N3(), j(), new C0381a(aVar)).d();
        } else if (aVar != null) {
            aVar.a();
        }
    }

    @Override // ih.c
    public boolean b() {
        return h.a().o3() != null;
    }

    public a c(String str, long j10) {
        StringBuilder sb2 = this.f21767a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(j10);
        sb2.append("i,");
        return this;
    }

    public a d(String str, Object obj) {
        StringBuilder sb2 = this.f21767a;
        sb2.append(str);
        sb2.append("=");
        sb2.append('\"');
        sb2.append(obj);
        sb2.append('\"');
        sb2.append(",");
        return this;
    }

    public a e(String str, boolean z10) {
        StringBuilder sb2 = this.f21767a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(z10);
        sb2.append(",");
        return this;
    }

    public a f(String str, Object obj) {
        StringBuilder sb2 = this.b;
        sb2.append(str);
        sb2.append('=');
        sb2.append(obj.toString().replace(" ", "\\ ").replace(",", "\\,"));
        sb2.append(",");
        return this;
    }

    public ih.c g() {
        b.f().b(this);
        return this;
    }

    public final long i() {
        return System.currentTimeMillis() * 1000000;
    }

    public String j() {
        f("appVersion", "2.746.1266");
        d("deviceType", Build.MODEL);
        f("deviceOSVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        f("platform", "Android");
        f("reporter", "App");
        if (this.f21770e == 0) {
            this.f21770e = i();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f21771f.size(); i10++) {
            sb2.append(this.f21771f.get(i10));
        }
        return ((CharSequence) sb2) + this.f21768c + "," + l(this.b.toString()) + " " + l(this.f21767a.toString()) + " " + this.f21770e + "\n";
    }

    public final String l(String str) {
        int lastIndexOf = str.lastIndexOf(",");
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    public a m(boolean z10) {
        this.f21769d = z10;
        return this;
    }
}
