package ci;

import android.os.AsyncTask;
import androidx.annotation.NonNull;
import ci.c;

/* loaded from: classes2.dex */
public abstract class a extends AsyncTask<Void, Void, j> {

    /* renamed from: a, reason: collision with root package name */
    public j f4939a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public c.a[] f4940c;

    /* renamed from: d, reason: collision with root package name */
    public l f4941d;

    /* renamed from: e, reason: collision with root package name */
    public String f4942e = null;

    /* renamed from: f, reason: collision with root package name */
    public String f4943f = null;

    /* renamed from: g, reason: collision with root package name */
    public fi.d<j> f4944g;

    public a(String str, l lVar, c.a[] aVarArr) {
        this.f4941d = lVar;
        this.b = str;
        this.f4940c = aVarArr;
        g(new fi.c());
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j doInBackground(Void... voidArr) {
        this.f4939a = c.j(this.b, this.f4942e, this.f4940c, this.f4943f);
        do {
            fi.d<j> dVar = this.f4944g;
            if (dVar == null || !dVar.c(this.f4939a) || !this.f4944g.a()) {
                return this.f4939a;
            }
            if (this.f4944g.b() > 0) {
                try {
                    Thread.sleep(this.f4944g.b());
                } catch (InterruptedException e10) {
                    ek.q.h("rbx.httprequest", "Thread sleep error: " + e10.getMessage());
                }
            }
            this.f4939a = c.j(this.b, this.f4942e, this.f4940c, this.f4943f);
            this.f4944g.retry();
            f();
        } while (!c());
        return null;
    }

    public void b() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public boolean c() {
        return isCancelled();
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(j jVar) {
        super.onPostExecute(jVar);
        l lVar = this.f4941d;
        if (lVar != null) {
            lVar.b(this.f4939a);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Void... voidArr) {
        super.onProgressUpdate(voidArr);
        l lVar = this.f4941d;
        if (lVar != null) {
            lVar.a(this.f4939a);
        }
    }

    public void f() {
        publishProgress(new Void[0]);
    }

    public void g(@NonNull fi.d<j> dVar) {
        this.f4944g = dVar;
    }
}
