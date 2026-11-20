package be;

import android.util.Log;
import java.util.List;

/* loaded from: classes2.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f3977a;
    public final /* synthetic */ ae.i0 b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f3978c;

    public k(l lVar, List list, ae.i0 i0Var) {
        this.f3978c = lVar;
        this.f3977a = list;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar;
        try {
            nVar = this.f3978c.f3981c;
            if (nVar.b(this.f3977a)) {
                l.d(this.f3978c, this.b);
            } else {
                l.c(this.f3978c, this.f3977a, this.b);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error checking verified files.", e10);
            this.b.a(-11);
        }
    }
}
