package bk;

import android.view.e0;
import android.view.s;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public b f4299a;

    public class a implements e0<ml.a> {
        public a() {
        }

        @Override // android.view.e0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ml.a aVar) {
            b bVar = e.this.f4299a;
            if (aVar == null) {
                aVar = dk.c.f14953k;
            }
            bVar.a0(aVar);
        }
    }

    public interface b {
        void a0(ml.a aVar);
    }

    public e(b bVar) {
        this.f4299a = bVar;
    }

    public void b(s sVar) {
        dk.c.c().h().i(sVar, new a());
    }
}
