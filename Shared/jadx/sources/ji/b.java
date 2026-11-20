package ji;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import rh.h;

/* loaded from: classes2.dex */
public class b extends ih.b {

    /* renamed from: f, reason: collision with root package name */
    public d f21773f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.f().b(new C0382b());
        }
    }

    /* renamed from: ji.b$b, reason: collision with other inner class name */
    public class C0382b implements ih.c {

        /* renamed from: ji.b$b$a */
        public class a extends AsyncTask<Void, Void, Void> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ih.a f21776a;

            public a(ih.a aVar) {
                this.f21776a = aVar;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(Void... voidArr) {
                Socket socket = b.this.f21773f.f21779c;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e10) {
                        Log.w("InfluxV2Queue", "[Close-connection-item] Error closing socket: " + e10.getMessage());
                    }
                    b.this.f21773f.f21779c = null;
                }
                b.this.f21773f = null;
                return null;
            }

            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Void r12) {
                ih.a aVar = this.f21776a;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        @Override // ih.c
        public void a(ih.a aVar) {
            if (b.this.f21773f == null) {
                return;
            }
            Log.d("InfluxV2Queue", "fireAction: Close the existing socket...");
            new a(aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }

        @Override // ih.c
        public boolean b() {
            return true;
        }

        public C0382b() {
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f21777a = new b();
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public String f21778a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public Socket f21779c;

        /* renamed from: d, reason: collision with root package name */
        public int f21780d;

        public d() {
        }
    }

    public static b f() {
        return c.f21777a;
    }

    public d g() {
        d dVar = this.f21773f;
        if (dVar != null && dVar.f21779c != null) {
            return dVar;
        }
        String o32 = h.a().o3();
        int N3 = h.a().N3();
        int J3 = h.a().J3();
        d dVar2 = new d();
        this.f21773f = dVar2;
        dVar2.f21778a = o32;
        dVar2.b = N3;
        dVar2.f21780d = J3;
        try {
            Log.d("InfluxV2Queue", "getSocketInfo: Create a socket to " + o32 + ":" + N3 + "...");
            Socket socket = new Socket(InetAddress.getByName(o32), N3);
            d dVar3 = this.f21773f;
            dVar3.f21779c = socket;
            if (dVar3.f21780d > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                Log.d("InfluxV2Queue", "Schedule a special close-connection item with delay=" + this.f21773f.f21780d + "s...");
                handler.postDelayed(new a(), ((long) this.f21773f.f21780d) * 1000);
            }
            return this.f21773f;
        } catch (IOException e10) {
            Log.w("InfluxV2Queue", "Error creating the socket: " + e10.getMessage());
            return this.f21773f;
        }
    }
}
