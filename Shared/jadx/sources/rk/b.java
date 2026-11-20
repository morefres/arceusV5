package rk;

import android.util.Log;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f30683a;
    public HashMap<String, a> b = new HashMap<>();

    public interface a {
        void a(rk.a aVar);
    }

    /* renamed from: rk.b$b, reason: collision with other inner class name */
    public class C0538b implements a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            aVar.a(b.this.c(aVar.f().optString("functionName", "")), null);
        }

        public C0538b() {
        }
    }

    public b(String str) {
        this.f30683a = str;
        d("supports", new C0538b());
    }

    public void a(rk.a aVar) {
        String d10 = aVar.d();
        a aVar2 = this.b.get(d10);
        if (aVar2 != null) {
            aVar2.a(aVar);
            return;
        }
        Log.e("RBHybridModule", "Cannot find function " + d10 + " in module " + this.f30683a);
        aVar.a(false, null);
    }

    public String b() {
        return this.f30683a;
    }

    public boolean c(String str) {
        return this.b.containsKey(str);
    }

    public void d(String str, a aVar) {
        this.b.put(str, aVar);
    }
}
