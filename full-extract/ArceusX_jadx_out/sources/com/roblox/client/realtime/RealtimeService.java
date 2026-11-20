package com.roblox.client.realtime;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import ek.q;
import ev.j;
import oh.e;
import org.greenrobot.eventbus.ThreadMode;
import rg.e2;
import ti.h;

/* loaded from: classes2.dex */
public class RealtimeService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public volatile Looper f9379d;

    /* renamed from: e, reason: collision with root package name */
    public volatile c f9380e;

    /* renamed from: a, reason: collision with root package name */
    public final int f9377a = 10;
    public final int b = 20;

    /* renamed from: c, reason: collision with root package name */
    public final int f9378c = 30;

    /* renamed from: f, reason: collision with root package name */
    public final IBinder f9381f = new b();

    /* renamed from: g, reason: collision with root package name */
    public BroadcastReceiver f9382g = new a();

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public boolean f9383a;
        public boolean b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean j10 = e2.j(context);
            if (this.b) {
                this.f9383a = j10;
                this.b = false;
            } else if (j10 != this.f9383a) {
                this.f9383a = j10;
                ev.c.d().j(new e(j10));
            }
        }

        public a() {
            this.f9383a = false;
            this.b = true;
        }
    }

    public class b extends Binder {
        public b() {
        }
    }

    public final class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.arg1;
            if (i10 == 10) {
                RealtimeService.this.h();
                return;
            }
            if (i10 == 20) {
                RealtimeService.this.i();
            } else if (i10 == 30) {
                RealtimeService.this.i();
                getLooper().quit();
            }
        }
    }

    public static long c() {
        return qj.a.a();
    }

    public static boolean d() {
        return qj.a.b();
    }

    public final void e(long j10) {
        if (h.e().g() != -1) {
            Message obtainMessage = this.f9380e.obtainMessage();
            obtainMessage.arg1 = 10;
            this.f9380e.sendMessageDelayed(obtainMessage, j10);
        }
    }

    public final void f() {
        Message obtainMessage = this.f9380e.obtainMessage();
        obtainMessage.arg1 = 20;
        this.f9380e.sendMessage(obtainMessage);
    }

    public final void g() {
        Message obtainMessage = this.f9380e.obtainMessage();
        obtainMessage.arg1 = 30;
        this.f9380e.sendMessage(obtainMessage);
    }

    public final void h() {
    }

    public final void i() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        registerReceiver(this.f9382g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        ev.c.d().n(this);
        e(0L);
        return this.f9381f;
    }

    @j(threadMode = ThreadMode.POSTING)
    public void onConnectivityChangeEvent(e eVar) {
        q.i("RealtimeService", "RealtimeService.onConnectivityChangeEvent() " + eVar.a());
        if (eVar.a()) {
            e(0L);
        } else {
            f();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        hm.a.c(this);
        HandlerThread handlerThread = new HandlerThread("RealtimeService");
        handlerThread.start();
        this.f9379d = handlerThread.getLooper();
        this.f9380e = new c(this.f9379d);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        ev.c.d().p(this);
        unregisterReceiver(this.f9382g);
        g();
        return super.onUnbind(intent);
    }
}
