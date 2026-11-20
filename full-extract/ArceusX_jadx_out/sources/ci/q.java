package ci;

import android.os.AsyncTask;
import ci.c;

/* loaded from: classes2.dex */
public class q extends AsyncTask<Void, Void, j> {

    /* renamed from: a, reason: collision with root package name */
    public j f4973a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f4974c;

    /* renamed from: d, reason: collision with root package name */
    public c.a[] f4975d;

    /* renamed from: e, reason: collision with root package name */
    public String f4976e;

    /* renamed from: f, reason: collision with root package name */
    public m f4977f;

    /* renamed from: g, reason: collision with root package name */
    public int f4978g;

    /* renamed from: h, reason: collision with root package name */
    public int f4979h;

    public q(String str, String str2, c.a[] aVarArr, m mVar) {
        this(str, str2, aVarArr, mVar, null);
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j doInBackground(Void... voidArr) {
        j l10 = c.l(this.b, this.f4974c, this.f4975d, this.f4976e, this.f4978g, this.f4979h);
        this.f4973a = l10;
        return l10;
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(j jVar) {
        super.onPostExecute(jVar);
        m mVar = this.f4977f;
        if (mVar != null) {
            mVar.a(this.f4973a);
        }
    }

    public q(String str, String str2, c.a[] aVarArr, m mVar, String str3) {
        this(str, str2, aVarArr, mVar, str3, -1, -1);
    }

    public q(String str, String str2, c.a[] aVarArr, m mVar, String str3, int i10, int i11) {
        this.f4978g = -1;
        this.f4979h = -1;
        this.f4977f = mVar;
        this.b = str;
        this.f4974c = str2;
        this.f4975d = aVarArr;
        this.f4976e = str3;
        if (str2 == null) {
            this.f4974c = "";
        }
        this.f4978g = i10;
        this.f4979h = i11;
    }
}
