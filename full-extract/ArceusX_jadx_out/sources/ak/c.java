package ak;

import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;
import java.io.PrintWriter;
import ji.b;

/* loaded from: classes2.dex */
public class c extends AsyncTask<Void, Void, d> {

    /* renamed from: a, reason: collision with root package name */
    public String f579a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public String f580c;

    /* renamed from: d, reason: collision with root package name */
    public a f581d;

    public c(String str, int i10, String str2, a aVar) {
        this.f581d = aVar;
        this.f579a = str;
        this.f580c = str2;
        this.b = i10;
        if (str2 == null) {
            this.f580c = "";
        }
    }

    public static d c(b.d dVar, String str) {
        d dVar2 = new d(dVar.f21778a, dVar.b);
        dVar2.a(str);
        try {
            PrintWriter printWriter = new PrintWriter(dVar.f21779c.getOutputStream(), true);
            if (printWriter.checkError()) {
                dVar2.b(false);
                return dVar2;
            }
            printWriter.println(str);
            printWriter.flush();
            dVar2.a("");
            return dVar2;
        } catch (Exception e10) {
            Log.w("RbxTcpRequest", "Error sending influx data over TCP = " + e10.getMessage());
            dVar2.b(false);
            return dVar2;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d doInBackground(Void... voidArr) {
        b.d g10 = ji.b.f().g();
        if (g10 == null || g10.f21779c == null) {
            d dVar = new d(this.f579a, this.b);
            dVar.a(this.f580c);
            dVar.b(false);
            return dVar;
        }
        d c10 = c(g10, this.f580c);
        if (g10.f21780d == 0) {
            try {
                Log.d("RbxTcpRequest", "doInBackground: timeToLive is 0. Close socket immediately...");
                g10.f21779c.close();
                return c10;
            } catch (IOException e10) {
                Log.w("RbxTcpRequest", "Error closing the socket: " + e10.getMessage());
            }
        }
        return c10;
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(d dVar) {
        super.onPostExecute(dVar);
        if (dVar == null) {
            dVar = new d(this.f579a, this.b);
            dVar.b(false);
        }
        a aVar = this.f581d;
        if (aVar != null) {
            aVar.a(dVar);
        }
    }
}
