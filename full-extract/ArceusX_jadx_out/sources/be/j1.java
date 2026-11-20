package be;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f3976a = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (l1 l1Var : this.f3976a) {
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", l1Var.a());
            bundle.putLong("event_timestamp", l1Var.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void b(int i10) {
        this.f3976a.add(l1.c(i10, System.currentTimeMillis()));
    }
}
