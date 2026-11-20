package e4;

import android.util.Log;
import android.view.a1;
import android.view.b1;
import android.view.x0;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d0 extends x0 {

    /* renamed from: i, reason: collision with root package name */
    public static final a1.c f15601i = new a();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15604e;
    public final HashMap<String, androidx.fragment.app.c> b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, d0> f15602c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, b1> f15603d = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f15605f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15606g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15607h = false;

    public class a implements a1.c {
        @Override // androidx.lifecycle.a1.c
        @NonNull
        public <T extends x0> T c(@NonNull Class<T> cls) {
            return new d0(true);
        }
    }

    public d0(boolean z10) {
        this.f15604e = z10;
    }

    @NonNull
    public static d0 k(b1 b1Var) {
        return (d0) new a1(b1Var, f15601i).b(d0.class);
    }

    @Override // android.view.x0
    public void d() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f15605f = true;
    }

    public void e(@NonNull androidx.fragment.app.c cVar) {
        if (this.f15607h) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.containsKey(cVar.f2415f)) {
                return;
            }
            this.b.put(cVar.f2415f, cVar);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + cVar);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.b.equals(d0Var.b) && this.f15602c.equals(d0Var.f15602c) && this.f15603d.equals(d0Var.f15603d)) {
                return true;
            }
        }
        return false;
    }

    public void f(@NonNull androidx.fragment.app.c cVar, boolean z10) {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + cVar);
        }
        h(cVar.f2415f, z10);
    }

    public void g(@NonNull String str, boolean z10) {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z10);
    }

    public final void h(@NonNull String str, boolean z10) {
        d0 d0Var = this.f15602c.get(str);
        if (d0Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(d0Var.f15602c.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    d0Var.g((String) obj, true);
                }
            }
            d0Var.d();
            this.f15602c.remove(str);
        }
        b1 b1Var = this.f15603d.get(str);
        if (b1Var != null) {
            b1Var.a();
            this.f15603d.remove(str);
        }
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.f15602c.hashCode()) * 31) + this.f15603d.hashCode();
    }

    public androidx.fragment.app.c i(String str) {
        return this.b.get(str);
    }

    @NonNull
    public d0 j(@NonNull androidx.fragment.app.c cVar) {
        d0 d0Var = this.f15602c.get(cVar.f2415f);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(this.f15604e);
        this.f15602c.put(cVar.f2415f, d0Var2);
        return d0Var2;
    }

    @NonNull
    public Collection<androidx.fragment.app.c> l() {
        return new ArrayList(this.b.values());
    }

    @NonNull
    public b1 m(@NonNull androidx.fragment.app.c cVar) {
        b1 b1Var = this.f15603d.get(cVar.f2415f);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1();
        this.f15603d.put(cVar.f2415f, b1Var2);
        return b1Var2;
    }

    public boolean n() {
        return this.f15605f;
    }

    public void o(@NonNull androidx.fragment.app.c cVar) {
        if (this.f15607h) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(cVar.f2415f) == null || !FragmentManager.N0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + cVar);
        }
    }

    public void p(boolean z10) {
        this.f15607h = z10;
    }

    public boolean q(@NonNull androidx.fragment.app.c cVar) {
        if (this.b.containsKey(cVar.f2415f)) {
            return this.f15604e ? this.f15605f : !this.f15606g;
        }
        return true;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<androidx.fragment.app.c> it = this.b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f15602c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f15603d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
