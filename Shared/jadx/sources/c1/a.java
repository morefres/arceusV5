package c1;

import android.hardware.camera2.params.SessionConfiguration;
import c1.d;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final List<d> f4446a;

    public a(List<d> list) {
        this.f4446a = list;
    }

    @Override // c1.d
    public d.a a(SessionConfiguration sessionConfiguration) {
        Iterator<d> it = this.f4446a.iterator();
        while (it.hasNext()) {
            d.a a10 = it.next().a(sessionConfiguration);
            if (a10.a() != 0) {
                return a10;
            }
        }
        return new d.a(0, 0, 0L);
    }
}
