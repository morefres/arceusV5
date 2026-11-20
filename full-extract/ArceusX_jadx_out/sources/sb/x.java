package sb;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f31030a;

    public x(y yVar) {
        this.f31030a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        e eVar;
        e eVar2;
        obj = this.f31030a.b;
        synchronized (obj) {
            try {
                y yVar = this.f31030a;
                eVar = yVar.f31032c;
                if (eVar != null) {
                    eVar2 = yVar.f31032c;
                    eVar2.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
