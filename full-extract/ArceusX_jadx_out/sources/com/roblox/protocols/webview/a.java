package com.roblox.protocols.webview;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class a implements ll.b {

    /* renamed from: a, reason: collision with root package name */
    public Handler f9796a = new Handler(Looper.getMainLooper());
    public d b;

    /* renamed from: com.roblox.protocols.webview.a$a, reason: collision with other inner class name */
    public class RunnableC0158a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ll.a f9797a;

        public RunnableC0158a(ll.a aVar) {
            this.f9797a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.f(this.f9797a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ll.a f9798a;

        public b(ll.a aVar) {
            this.f9798a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.d(this.f9798a);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.e();
        }
    }

    public interface d {
        void d(ll.a aVar);

        void e();

        void f(ll.a aVar);
    }

    public a(d dVar) {
        this.b = dVar;
    }

    @Override // ll.b
    public void a(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4) {
        String str5 = str2;
        if (str5 == null) {
            str5 = "";
        }
        Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        boolean z10 = true;
        Boolean bool5 = Boolean.FALSE;
        if (bool3 == null || bool3.booleanValue()) {
            z10 = false;
        }
        this.f9796a.post(new b(new ll.a(str, str5, valueOf, bool5, Boolean.valueOf(z10), Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false), Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false))));
    }

    @Override // ll.b
    public void b(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2) {
        this.f9796a.post(new RunnableC0158a(new ll.a(str, str2, bool, null, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }

    @Override // ll.b
    public void c() {
        this.f9796a.post(new c());
    }
}
