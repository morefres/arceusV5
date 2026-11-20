package i9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public w f20352c;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f20355f;

    /* renamed from: a, reason: collision with root package name */
    public int f20351a = 0;
    public final Messenger b = new Messenger(new cb.f(Looper.getMainLooper(), new Handler.Callback() { // from class: i9.s
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            v vVar = v.this;
            synchronized (vVar) {
                try {
                    y yVar = (y) vVar.f20354e.get(i10);
                    if (yVar == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        return true;
                    }
                    vVar.f20354e.remove(i10);
                    vVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        yVar.c(new z(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    yVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    public final Queue f20353d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f20354e = new SparseArray();

    public /* synthetic */ v(b0 b0Var, u uVar) {
        this.f20355f = b0Var;
    }

    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    public final synchronized void b(int i10, String str, Throwable th2) {
        Context context;
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f20351a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f20351a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f20351a = 4;
            b0 b0Var = this.f20355f;
            t9.a b = t9.a.b();
            context = b0Var.f20324a;
            b.c(context, this);
            z zVar = new z(i10, str, th2);
            Iterator it = this.f20353d.iterator();
            while (it.hasNext()) {
                ((y) it.next()).c(zVar);
            }
            this.f20353d.clear();
            for (int i12 = 0; i12 < this.f20354e.size(); i12++) {
                ((y) this.f20354e.valueAt(i12)).c(zVar);
            }
            this.f20354e.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f20355f.b;
        scheduledExecutorService.execute(new Runnable() { // from class: i9.p
            @Override // java.lang.Runnable
            public final void run() {
                final y yVar;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                while (true) {
                    final v vVar = v.this;
                    synchronized (vVar) {
                        try {
                            if (vVar.f20351a != 2) {
                                return;
                            }
                            if (vVar.f20353d.isEmpty()) {
                                vVar.f();
                                return;
                            }
                            yVar = (y) vVar.f20353d.poll();
                            vVar.f20354e.put(yVar.f20357a, yVar);
                            scheduledExecutorService2 = vVar.f20355f.b;
                            scheduledExecutorService2.schedule(new Runnable() { // from class: i9.t
                                @Override // java.lang.Runnable
                                public final void run() {
                                    v.this.e(yVar.f20357a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } finally {
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(yVar)));
                    }
                    b0 b0Var = vVar.f20355f;
                    Messenger messenger = vVar.b;
                    int i10 = yVar.f20358c;
                    context = b0Var.f20324a;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = yVar.f20357a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", yVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", yVar.f20359d);
                    obtain.setData(bundle);
                    try {
                        vVar.f20352c.a(obtain);
                    } catch (RemoteException e10) {
                        vVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void d() {
        if (this.f20351a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i10) {
        y yVar = (y) this.f20354e.get(i10);
        if (yVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f20354e.remove(i10);
            yVar.c(new z(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        Context context;
        try {
            if (this.f20351a == 2 && this.f20353d.isEmpty() && this.f20354e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f20351a = 3;
                b0 b0Var = this.f20355f;
                t9.a b = t9.a.b();
                context = b0Var.f20324a;
                b.c(context, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean g(y yVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i10 = this.f20351a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f20353d.add(yVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f20353d.add(yVar);
            c();
            return true;
        }
        this.f20353d.add(yVar);
        n9.m.p(this.f20351a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f20351a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            t9.a b = t9.a.b();
            context = this.f20355f.f20324a;
            if (b.a(context, intent, this, 1)) {
                scheduledExecutorService = this.f20355f.b;
                scheduledExecutorService.schedule(new Runnable() { // from class: i9.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f20355f.b;
        scheduledExecutorService.execute(new Runnable() { // from class: i9.o
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = v.this;
                IBinder iBinder2 = iBinder;
                synchronized (vVar) {
                    if (iBinder2 == null) {
                        vVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        vVar.f20352c = new w(iBinder2);
                        vVar.f20351a = 2;
                        vVar.c();
                    } catch (RemoteException e10) {
                        vVar.a(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f20355f.b;
        scheduledExecutorService.execute(new Runnable() { // from class: i9.r
            @Override // java.lang.Runnable
            public final void run() {
                v.this.a(2, "Service disconnected");
            }
        });
    }
}
