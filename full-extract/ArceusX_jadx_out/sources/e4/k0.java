package e4;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.a1;
import android.view.b1;
import android.view.c1;
import android.view.l;
import android.view.t0;
import androidx.annotation.NonNull;
import k4.CreationExtras;

/* loaded from: classes.dex */
public class k0 implements android.view.j, d5.i, c1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.c f15658a;
    public final b1 b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f15659c;

    /* renamed from: d, reason: collision with root package name */
    public a1.c f15660d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.u f15661e = null;

    /* renamed from: f, reason: collision with root package name */
    public d5.h f15662f = null;

    public k0(@NonNull androidx.fragment.app.c cVar, @NonNull b1 b1Var, @NonNull Runnable runnable) {
        this.f15658a = cVar;
        this.b = b1Var;
        this.f15659c = runnable;
    }

    @Override // android.view.j
    @NonNull
    public a1.c W() {
        Application application;
        a1.c W = this.f15658a.W();
        if (!W.equals(this.f15658a.Y)) {
            this.f15660d = W;
            return W;
        }
        if (this.f15660d == null) {
            Context applicationContext = this.f15658a.I1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            androidx.fragment.app.c cVar = this.f15658a;
            this.f15660d = new t0(application, cVar, cVar.t());
        }
        return this.f15660d;
    }

    @Override // android.view.j
    @NonNull
    public CreationExtras Y() {
        Application application;
        Context applicationContext = this.f15658a.I1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        k4.b bVar = new k4.b();
        if (application != null) {
            bVar.c(a1.a.f2563h, application);
        }
        bVar.c(android.view.o0.f2645a, this.f15658a);
        bVar.c(android.view.o0.b, this);
        if (this.f15658a.t() != null) {
            bVar.c(android.view.o0.f2646c, this.f15658a.t());
        }
        return bVar;
    }

    @Override // android.view.s
    @NonNull
    public android.view.l a() {
        c();
        return this.f15661e;
    }

    public void b(@NonNull l.a aVar) {
        this.f15661e.j(aVar);
    }

    public void c() {
        if (this.f15661e == null) {
            this.f15661e = new android.view.u(this);
            d5.h a10 = d5.h.a(this);
            this.f15662f = a10;
            a10.c();
            this.f15659c.run();
        }
    }

    public boolean d() {
        return this.f15661e != null;
    }

    public void e(Bundle bundle) {
        this.f15662f.d(bundle);
    }

    public void f(@NonNull Bundle bundle) {
        this.f15662f.e(bundle);
    }

    public void g(@NonNull l.b bVar) {
        this.f15661e.o(bVar);
    }

    @Override // android.view.c1
    @NonNull
    public b1 v() {
        c();
        return this.b;
    }

    @Override // d5.i
    @NonNull
    public d5.f z() {
        c();
        return this.f15662f.getSavedStateRegistry();
    }
}
