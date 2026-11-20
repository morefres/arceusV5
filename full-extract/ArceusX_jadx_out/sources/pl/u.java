package pl;

import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class u {
    public int b;

    /* renamed from: a, reason: collision with root package name */
    public ServerSocket f28685a = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28687d = false;

    /* renamed from: c, reason: collision with root package name */
    public ExecutorService f28686c = Executors.newSingleThreadExecutor();

    public int b() {
        return this.b;
    }

    public final /* synthetic */ void c() {
        while (this.f28687d) {
            try {
                f(this.f28685a.accept());
            } catch (SocketException e10) {
                if (this.f28687d) {
                    Log.e("MagicLoginSocketHelperServer", "SocketException while accepting connection: " + e10.toString());
                    return;
                }
                return;
            } catch (IOException e11) {
                Log.e("MagicLoginSocketHelperServer", "IOException while accepting connection: " + e11.toString());
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(10:10|(1:12)|13|14|(1:18)|19|20|21|22|23)|13|14|(2:16|18)|19|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        android.util.Log.e("MagicLoginSocketHelperServer", "RejectedExecutionException while starting executor: " + r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void d() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f28687d     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.util.concurrent.ExecutorService r0 = r4.f28686c     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L15
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1b
            goto L15
        L12:
            r0 = move-exception
            goto La0
        L15:
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.lang.Throwable -> L12
            r4.f28686c = r0     // Catch: java.lang.Throwable -> L12
        L1b:
            java.net.ServerSocket r0 = r4.f28685a     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L2b java.net.BindException -> L2d
            if (r0 == 0) goto L2f
            boolean r0 = r0.isClosed()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L2b java.net.BindException -> L2d
            if (r0 != 0) goto L2f
            java.net.ServerSocket r0 = r4.f28685a     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L2b java.net.BindException -> L2d
            r0.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L2b java.net.BindException -> L2d
            goto L2f
        L2b:
            r0 = move-exception
            goto L68
        L2d:
            r0 = move-exception
            goto L84
        L2f:
            java.net.ServerSocket r0 = new java.net.ServerSocket     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L2b java.net.BindException -> L2d
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L2b java.net.BindException -> L2d
            r4.f28685a = r0     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L2b java.net.BindException -> L2d
            int r0 = r0.getLocalPort()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L2b java.net.BindException -> L2d
            r4.b = r0     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L2b java.net.BindException -> L2d
            r0 = 1
            r4.f28687d = r0     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L2b java.net.BindException -> L2d
            java.util.concurrent.ExecutorService r0 = r4.f28686c     // Catch: java.lang.Throwable -> L12 java.util.concurrent.RejectedExecutionException -> L4b
            pl.t r1 = new pl.t     // Catch: java.lang.Throwable -> L12 java.util.concurrent.RejectedExecutionException -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L12 java.util.concurrent.RejectedExecutionException -> L4b
            r0.execute(r1)     // Catch: java.lang.Throwable -> L12 java.util.concurrent.RejectedExecutionException -> L4b
            goto L66
        L4b:
            r0 = move-exception
            java.lang.String r1 = "MagicLoginSocketHelperServer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r2.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "RejectedExecutionException while starting executor: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r2.append(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L12
            android.util.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L12
        L66:
            monitor-exit(r4)
            return
        L68:
            java.lang.String r1 = "MagicLoginSocketHelperServer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r2.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "IOException while creating server socket: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r2.append(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L12
            android.util.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            return
        L84:
            java.lang.String r1 = "MagicLoginSocketHelperServer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r2.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "BindException while creating server socket: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r2.append(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L12
            android.util.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            return
        La0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.u.d():void");
    }

    public synchronized void e() {
        this.f28687d = false;
        ServerSocket serverSocket = this.f28685a;
        if (serverSocket != null && !serverSocket.isClosed()) {
            try {
                this.f28685a.close();
            } catch (IOException e10) {
                Log.e("MagicLoginSocketHelperServer", "IOException while closing server socket: " + e10.toString());
            }
        }
        this.b = 0;
    }

    public void f(Socket socket) {
        try {
            String readUTF = new DataInputStream(socket.getInputStream()).readUTF();
            socket.close();
            try {
                JSONObject jSONObject = new JSONObject(readUTF);
                jSONObject.put(lm.a.l(), lm.a.d());
                MessageBus f10 = MessageBus.f();
                if (f10 != null) {
                    f10.l(lm.a.m(), jSONObject);
                } else {
                    Log.e("MagicLoginSocketHelperServer", "Magic Login could not find message bus on connectionInit");
                }
            } catch (JSONException e10) {
                Log.e("MagicLoginSocketHelperServer", "JSONException while handling connectionInit: " + e10.toString());
            }
        } catch (SocketException e11) {
            Log.e("MagicLoginSocketHelperServer", "SocketException while transferring data: " + e11.toString());
        } catch (IOException e12) {
            Log.e("MagicLoginSocketHelperServer", "IOException while transferring data: " + e12.toString());
        }
    }
}
