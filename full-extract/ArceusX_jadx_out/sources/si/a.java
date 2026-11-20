package si;

import android.content.Context;
import android.os.Build;
import bk.b;
import dh.d;
import dj.a0;
import dj.m;
import ek.t;
import hj.r;
import k2.n;
import rh.h;

/* loaded from: classes2.dex */
public class a extends dh.d {

    /* renamed from: d, reason: collision with root package name */
    public Context f31396d;

    /* renamed from: e, reason: collision with root package name */
    public long f31397e;

    /* renamed from: f, reason: collision with root package name */
    public String f31398f;

    /* renamed from: g, reason: collision with root package name */
    public d f31399g;

    /* renamed from: si.a$a, reason: collision with other inner class name */
    public class C0558a implements d.a {

        /* renamed from: si.a$a$a, reason: collision with other inner class name */
        public class C0559a implements b.InterfaceC0086b {
            public C0559a() {
            }

            @Override // bk.b.InterfaceC0086b
            public void a(ml.a aVar) {
                a.this.d("UserSelectedTheme");
            }
        }

        public C0558a() {
        }

        @Override // dh.d.a
        public void start() {
            new bk.b().b(new C0559a());
        }
    }

    public class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f31402a;
        public long b;

        public b(String str, long j10) {
            this.f31402a = str;
            this.b = j10;
        }

        @Override // dh.d.a
        public void start() {
            if (a.this.f31396d != null) {
                if (t.g()) {
                    if (h.a().H1()) {
                        a0.R(a.this.f31396d).K(this.b, true);
                    } else {
                        m F0 = m.F0(a.this.f31396d);
                        if (F0 != null) {
                            if (h.a().n3() && h.a().q()) {
                                F0.m1(this.b, this.f31402a, true);
                            } else {
                                F0.A0(this.b, this.f31402a, true);
                            }
                        }
                    }
                } else if (t.i()) {
                    if (h.a().D5()) {
                        gj.b.a(a.this.f31396d);
                        throw null;
                    }
                    gj.a.a(a.this.f31396d);
                }
            }
            a.this.d("GrantPendingPurchases");
        }
    }

    public class c implements d.a {
        @Override // dh.d.a
        public void start() {
            if (a.this.f31396d != null) {
                if (!n.f(a.this.f31396d).a() && Build.VERSION.SDK_INT >= 33) {
                    a.this.d("PushNotificationRegistration");
                    return;
                } else if (n.f(a.this.f31396d).a()) {
                    r.k().z(a.this.f31396d, true);
                }
            }
            a.this.d("PushNotificationRegistration");
        }

        public c() {
        }
    }

    public interface d {
        void a();
    }

    public a(Context context, String str, long j10, String str2) {
        super(str);
        this.f31396d = context;
        this.f31397e = j10;
        this.f31398f = str2;
        a(new c());
        a(new C0558a());
        a(new b(this.f31398f, this.f31397e));
    }

    @Override // dh.d
    public void b() {
        d dVar = this.f31399g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void g(d dVar) {
        this.f31399g = dVar;
    }
}
