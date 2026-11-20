package ga;

import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public final class w extends a {

    /* renamed from: a, reason: collision with root package name */
    public final sb.k f18432a;

    public w(sb.k kVar) {
        this.f18432a = kVar;
    }

    @Override // ga.a, ga.e
    public final void z0(DataHolder dataHolder) {
        int y32 = dataHolder.y3();
        if (y32 == 0 || y32 == 3) {
            this.f18432a.c(new da.b(new ea.a(dataHolder), y32 == 3));
        } else {
            da.f.b(this.f18432a, y32);
            dataHolder.close();
        }
    }
}
