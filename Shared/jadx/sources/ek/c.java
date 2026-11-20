package ek;

import android.content.Context;
import android.os.AsyncTask;
import ek.a;

/* loaded from: classes2.dex */
public class c implements a.InterfaceC0298a {
    public static String b;

    /* renamed from: c, reason: collision with root package name */
    public static ne.e0<String> f16036c = ne.e0.H();

    /* renamed from: a, reason: collision with root package name */
    public boolean f16037a = false;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f16038a = new c();
    }

    public static String d() {
        String str;
        if (!rh.h.a().v5()) {
            return b;
        }
        if (!dk.c.c().n() && (str = b) != null) {
            return str;
        }
        b = null;
        return "";
    }

    public static c g() {
        return a.f16038a;
    }

    @Override // ek.a.InterfaceC0298a
    public void a(String str) {
        b = str;
    }

    public void c() {
        b = null;
        this.f16037a = false;
    }

    public void e(Context context) {
        f(context, null);
    }

    public void f(Context context, final a.InterfaceC0298a interfaceC0298a) {
        if (rh.h.a().v5() && dk.c.c().n()) {
            return;
        }
        if (!this.f16037a) {
            this.f16037a = true;
            new ek.a(context, new a.InterfaceC0298a() { // from class: ek.b
                @Override // ek.a.InterfaceC0298a
                public final void a(String str) {
                    c.this.h(interfaceC0298a, str);
                }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else if (interfaceC0298a != null) {
            interfaceC0298a.a(b);
        }
    }

    public final /* synthetic */ void h(a.InterfaceC0298a interfaceC0298a, String str) {
        a(str);
        if (interfaceC0298a != null) {
            interfaceC0298a.a(str);
        }
    }
}
