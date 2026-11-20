package wa;

import android.content.Context;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f34174a;

    public /* synthetic */ j(l lVar, i iVar) {
        this.f34174a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        long a10 = this.f34174a.a();
        if (a10 == -1 || u9.h.c().a() <= a10) {
            return;
        }
        context = this.f34174a.f34176a;
        l.e(context);
    }
}
