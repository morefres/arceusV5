package ek;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import q8.a;

/* loaded from: classes2.dex */
public class a extends AsyncTask<Void, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    public Context f16034a;
    public InterfaceC0298a b;

    /* renamed from: ek.a$a, reason: collision with other inner class name */
    public interface InterfaceC0298a {
        void a(String str);
    }

    public a(Context context, InterfaceC0298a interfaceC0298a) {
        this.f16034a = context;
        this.b = interfaceC0298a;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        a.C0516a c0516a;
        try {
            c0516a = q8.a.a(this.f16034a);
        } catch (j9.e | j9.f | IOException unused) {
            c0516a = null;
        }
        String a10 = c0516a != null ? c0516a.b() ? "00000000-0000-0000-0000-000000000000" : c0516a.a() : "";
        q.h("AdvertisingIdAsyncTask", "advertisingId:" + a10);
        return a10;
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        this.b.a(str);
    }
}
