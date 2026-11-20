package e4;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<androidx.fragment.app.c> f15613a = new ArrayList<>();
    public final HashMap<String, androidx.fragment.app.g> b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, Bundle> f15614c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public d0 f15615d;

    public void A(@NonNull d0 d0Var) {
        this.f15615d = d0Var;
    }

    public Bundle B(@NonNull String str, Bundle bundle) {
        return bundle != null ? this.f15614c.put(str, bundle) : this.f15614c.remove(str);
    }

    public void a(@NonNull androidx.fragment.app.c cVar) {
        if (this.f15613a.contains(cVar)) {
            throw new IllegalStateException("Fragment already added: " + cVar);
        }
        synchronized (this.f15613a) {
            this.f15613a.add(cVar);
        }
        cVar.f2421l = true;
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(@NonNull String str) {
        return this.b.get(str) != null;
    }

    public void d(int i10) {
        for (androidx.fragment.app.g gVar : this.b.values()) {
            if (gVar != null) {
                gVar.s(i10);
            }
        }
    }

    public void e(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.g gVar : this.b.values()) {
                printWriter.print(str);
                if (gVar != null) {
                    androidx.fragment.app.c k10 = gVar.k();
                    printWriter.println(k10);
                    k10.l(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f15613a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                androidx.fragment.app.c cVar = this.f15613a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
            }
        }
    }

    public androidx.fragment.app.c f(@NonNull String str) {
        androidx.fragment.app.g gVar = this.b.get(str);
        if (gVar != null) {
            return gVar.k();
        }
        return null;
    }

    public androidx.fragment.app.c g(int i10) {
        for (int size = this.f15613a.size() - 1; size >= 0; size--) {
            androidx.fragment.app.c cVar = this.f15613a.get(size);
            if (cVar != null && cVar.f2435z == i10) {
                return cVar;
            }
        }
        for (androidx.fragment.app.g gVar : this.b.values()) {
            if (gVar != null) {
                androidx.fragment.app.c k10 = gVar.k();
                if (k10.f2435z == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    public androidx.fragment.app.c h(String str) {
        if (str != null) {
            for (int size = this.f15613a.size() - 1; size >= 0; size--) {
                androidx.fragment.app.c cVar = this.f15613a.get(size);
                if (cVar != null && str.equals(cVar.B)) {
                    return cVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (androidx.fragment.app.g gVar : this.b.values()) {
            if (gVar != null) {
                androidx.fragment.app.c k10 = gVar.k();
                if (str.equals(k10.B)) {
                    return k10;
                }
            }
        }
        return null;
    }

    public androidx.fragment.app.c i(@NonNull String str) {
        androidx.fragment.app.c n10;
        for (androidx.fragment.app.g gVar : this.b.values()) {
            if (gVar != null && (n10 = gVar.k().n(str)) != null) {
                return n10;
            }
        }
        return null;
    }

    public int j(@NonNull androidx.fragment.app.c cVar) {
        View view;
        View view2;
        ViewGroup viewGroup = cVar.J;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f15613a.indexOf(cVar);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            androidx.fragment.app.c cVar2 = this.f15613a.get(i10);
            if (cVar2.J == viewGroup && (view2 = cVar2.K) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f15613a.size()) {
                return -1;
            }
            androidx.fragment.app.c cVar3 = this.f15613a.get(indexOf);
            if (cVar3.J == viewGroup && (view = cVar3.K) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    @NonNull
    public List<androidx.fragment.app.g> k() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.g gVar : this.b.values()) {
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    @NonNull
    public List<androidx.fragment.app.c> l() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.g gVar : this.b.values()) {
            if (gVar != null) {
                arrayList.add(gVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @NonNull
    public HashMap<String, Bundle> m() {
        return this.f15614c;
    }

    public androidx.fragment.app.g n(@NonNull String str) {
        return this.b.get(str);
    }

    @NonNull
    public List<androidx.fragment.app.c> o() {
        ArrayList arrayList;
        if (this.f15613a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f15613a) {
            arrayList = new ArrayList(this.f15613a);
        }
        return arrayList;
    }

    public d0 p() {
        return this.f15615d;
    }

    public Bundle q(@NonNull String str) {
        return this.f15614c.get(str);
    }

    public void r(@NonNull androidx.fragment.app.g gVar) {
        androidx.fragment.app.c k10 = gVar.k();
        if (c(k10.f2415f)) {
            return;
        }
        this.b.put(k10.f2415f, gVar);
        if (k10.F) {
            if (k10.E) {
                this.f15615d.e(k10);
            } else {
                this.f15615d.o(k10);
            }
            k10.F = false;
        }
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k10);
        }
    }

    public void s(@NonNull androidx.fragment.app.g gVar) {
        androidx.fragment.app.c k10 = gVar.k();
        if (k10.E) {
            this.f15615d.o(k10);
        }
        if (this.b.get(k10.f2415f) == gVar && this.b.put(k10.f2415f, null) != null && FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    public void t() {
        ArrayList<androidx.fragment.app.c> arrayList = this.f15613a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            androidx.fragment.app.c cVar = arrayList.get(i10);
            i10++;
            androidx.fragment.app.g gVar = this.b.get(cVar.f2415f);
            if (gVar != null) {
                gVar.m();
            }
        }
        for (androidx.fragment.app.g gVar2 : this.b.values()) {
            if (gVar2 != null) {
                gVar2.m();
                androidx.fragment.app.c k10 = gVar2.k();
                if (k10.f2422m && !k10.s0()) {
                    if (k10.f2424o && !this.f15614c.containsKey(k10.f2415f)) {
                        B(k10.f2415f, gVar2.q());
                    }
                    s(gVar2);
                }
            }
        }
    }

    public void u(@NonNull androidx.fragment.app.c cVar) {
        synchronized (this.f15613a) {
            this.f15613a.remove(cVar);
        }
        cVar.f2421l = false;
    }

    public void v() {
        this.b.clear();
    }

    public void w(List<String> list) {
        this.f15613a.clear();
        if (list != null) {
            for (String str : list) {
                androidx.fragment.app.c f10 = f(str);
                if (f10 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                }
                a(f10);
            }
        }
    }

    public void x(@NonNull HashMap<String, Bundle> hashMap) {
        this.f15614c.clear();
        this.f15614c.putAll(hashMap);
    }

    @NonNull
    public ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.b.size());
        for (androidx.fragment.app.g gVar : this.b.values()) {
            if (gVar != null) {
                androidx.fragment.app.c k10 = gVar.k();
                B(k10.f2415f, gVar.q());
                arrayList.add(k10.f2415f);
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + k10.b);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> z() {
        synchronized (this.f15613a) {
            try {
                if (this.f15613a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f15613a.size());
                ArrayList<androidx.fragment.app.c> arrayList2 = this.f15613a;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    androidx.fragment.app.c cVar = arrayList2.get(i10);
                    i10++;
                    androidx.fragment.app.c cVar2 = cVar;
                    arrayList.add(cVar2.f2415f);
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + cVar2.f2415f + "): " + cVar2);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
