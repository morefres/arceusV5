package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import e4.m0;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends h implements FragmentManager.o {

    /* renamed from: t, reason: collision with root package name */
    public final FragmentManager f2358t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2359u;

    /* renamed from: v, reason: collision with root package name */
    public int f2360v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2361w;

    public a(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.y0(), fragmentManager.A0() != null ? fragmentManager.A0().getContext().getClassLoader() : null);
        this.f2360v = -1;
        this.f2361w = false;
        this.f2358t = fragmentManager;
    }

    public void A() {
        for (int size = this.f2485c.size() - 1; size >= 0; size--) {
            h.a aVar = this.f2485c.get(size);
            c cVar = aVar.b;
            if (cVar != null) {
                cVar.f2424o = this.f2361w;
                cVar.T1(true);
                cVar.S1(FragmentManager.o1(this.f2490h));
                cVar.W1(this.f2499q, this.f2498p);
            }
            switch (aVar.f2502a) {
                case 1:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.r1(cVar, true);
                    this.f2358t.j1(cVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2502a);
                case 3:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.l(cVar);
                    break;
                case 4:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.x1(cVar);
                    break;
                case 5:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.r1(cVar, true);
                    this.f2358t.K0(cVar);
                    break;
                case 6:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.q(cVar);
                    break;
                case 7:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.r1(cVar, true);
                    this.f2358t.B(cVar);
                    break;
                case 8:
                    this.f2358t.v1(null);
                    break;
                case 9:
                    this.f2358t.v1(cVar);
                    break;
                case 10:
                    aVar.f2509i = cVar.U;
                    this.f2358t.u1(cVar, aVar.f2508h);
                    break;
            }
        }
    }

    public c B(ArrayList<c> arrayList, c cVar) {
        c cVar2 = cVar;
        int i10 = 0;
        while (i10 < this.f2485c.size()) {
            h.a aVar = this.f2485c.get(i10);
            int i11 = aVar.f2502a;
            if (i11 != 1) {
                if (i11 == 2) {
                    c cVar3 = aVar.b;
                    int i12 = cVar3.A;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        c cVar4 = arrayList.get(size);
                        if (cVar4.A == i12) {
                            if (cVar4 == cVar3) {
                                z10 = true;
                            } else {
                                if (cVar4 == cVar2) {
                                    this.f2485c.add(i10, new h.a(9, cVar4, true));
                                    i10++;
                                    cVar2 = null;
                                }
                                h.a aVar2 = new h.a(3, cVar4, true);
                                aVar2.f2504d = aVar.f2504d;
                                aVar2.f2506f = aVar.f2506f;
                                aVar2.f2505e = aVar.f2505e;
                                aVar2.f2507g = aVar.f2507g;
                                this.f2485c.add(i10, aVar2);
                                arrayList.remove(cVar4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f2485c.remove(i10);
                        i10--;
                    } else {
                        aVar.f2502a = 1;
                        aVar.f2503c = true;
                        arrayList.add(cVar3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.b);
                    c cVar5 = aVar.b;
                    if (cVar5 == cVar2) {
                        this.f2485c.add(i10, new h.a(9, cVar5));
                        i10++;
                        cVar2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f2485c.add(i10, new h.a(9, cVar2, true));
                        aVar.f2503c = true;
                        i10++;
                        cVar2 = aVar.b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.b);
            i10++;
        }
        return cVar2;
    }

    public String C() {
        return this.f2493k;
    }

    public void D() {
        if (this.f2501s != null) {
            for (int i10 = 0; i10 < this.f2501s.size(); i10++) {
                this.f2501s.get(i10).run();
            }
            this.f2501s = null;
        }
    }

    public c E(ArrayList<c> arrayList, c cVar) {
        for (int size = this.f2485c.size() - 1; size >= 0; size--) {
            h.a aVar = this.f2485c.get(size);
            int i10 = aVar.f2502a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            cVar = null;
                            break;
                        case 9:
                            cVar = aVar.b;
                            break;
                        case 10:
                            aVar.f2509i = aVar.f2508h;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return cVar;
    }

    @Override // androidx.fragment.app.FragmentManager.o
    public boolean a(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2491i) {
            return true;
        }
        this.f2358t.k(this);
        return true;
    }

    @Override // androidx.fragment.app.h
    public int g() {
        return w(false, true);
    }

    @Override // androidx.fragment.app.h
    public int h() {
        return w(true, true);
    }

    @Override // androidx.fragment.app.h
    public void i() {
        k();
        this.f2358t.g0(this, false);
    }

    @Override // androidx.fragment.app.h
    public void j() {
        k();
        this.f2358t.g0(this, true);
    }

    @Override // androidx.fragment.app.h
    public void l(int i10, c cVar, String str, int i11) {
        super.l(i10, cVar, str, i11);
        cVar.f2431v = this.f2358t;
    }

    @Override // androidx.fragment.app.h
    @NonNull
    public h m(@NonNull c cVar) {
        FragmentManager fragmentManager = cVar.f2431v;
        if (fragmentManager == null || fragmentManager == this.f2358t) {
            return super.m(cVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + cVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.h
    @NonNull
    public h t(@NonNull c cVar) {
        FragmentManager fragmentManager = cVar.f2431v;
        if (fragmentManager == null || fragmentManager == this.f2358t) {
            return super.t(cVar);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + cVar.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2360v >= 0) {
            sb2.append(" #");
            sb2.append(this.f2360v);
        }
        if (this.f2493k != null) {
            sb2.append(" ");
            sb2.append(this.f2493k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void u(int i10) {
        if (this.f2491i) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f2485c.size();
            for (int i11 = 0; i11 < size; i11++) {
                h.a aVar = this.f2485c.get(i11);
                c cVar = aVar.b;
                if (cVar != null) {
                    cVar.f2430u += i10;
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.f2430u);
                    }
                }
            }
        }
    }

    public void v() {
        int size = this.f2485c.size() - 1;
        while (size >= 0) {
            h.a aVar = this.f2485c.get(size);
            if (aVar.f2503c) {
                if (aVar.f2502a == 8) {
                    aVar.f2503c = false;
                    this.f2485c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.b.A;
                    aVar.f2502a = 2;
                    aVar.f2503c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        h.a aVar2 = this.f2485c.get(i11);
                        if (aVar2.f2503c && aVar2.b.A == i10) {
                            this.f2485c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public int w(boolean z10, boolean z11) {
        if (this.f2359u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new m0("FragmentManager"));
            x("  ", printWriter);
            printWriter.close();
        }
        this.f2359u = true;
        if (this.f2491i) {
            this.f2360v = this.f2358t.o();
        } else {
            this.f2360v = -1;
        }
        if (z11) {
            this.f2358t.d0(this, z10);
        }
        return this.f2360v;
    }

    public void x(String str, PrintWriter printWriter) {
        y(str, printWriter, true);
    }

    public void y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2493k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2360v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2359u);
            if (this.f2490h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2490h));
            }
            if (this.f2486d != 0 || this.f2487e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2486d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2487e));
            }
            if (this.f2488f != 0 || this.f2489g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2488f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2489g));
            }
            if (this.f2494l != 0 || this.f2495m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2494l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2495m);
            }
            if (this.f2496n != 0 || this.f2497o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2496n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2497o);
            }
        }
        if (this.f2485c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2485c.size();
        for (int i10 = 0; i10 < size; i10++) {
            h.a aVar = this.f2485c.get(i10);
            switch (aVar.f2502a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2502a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z10) {
                if (aVar.f2504d != 0 || aVar.f2505e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2504d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2505e));
                }
                if (aVar.f2506f != 0 || aVar.f2507g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2506f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2507g));
                }
            }
        }
    }

    public void z() {
        int size = this.f2485c.size();
        for (int i10 = 0; i10 < size; i10++) {
            h.a aVar = this.f2485c.get(i10);
            c cVar = aVar.b;
            if (cVar != null) {
                cVar.f2424o = this.f2361w;
                cVar.T1(false);
                cVar.S1(this.f2490h);
                cVar.W1(this.f2498p, this.f2499q);
            }
            switch (aVar.f2502a) {
                case 1:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.r1(cVar, false);
                    this.f2358t.l(cVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2502a);
                case 3:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.j1(cVar);
                    break;
                case 4:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.K0(cVar);
                    break;
                case 5:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.r1(cVar, false);
                    this.f2358t.x1(cVar);
                    break;
                case 6:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.B(cVar);
                    break;
                case 7:
                    cVar.N1(aVar.f2504d, aVar.f2505e, aVar.f2506f, aVar.f2507g);
                    this.f2358t.r1(cVar, false);
                    this.f2358t.q(cVar);
                    break;
                case 8:
                    this.f2358t.v1(cVar);
                    break;
                case 9:
                    this.f2358t.v1(null);
                    break;
                case 10:
                    aVar.f2508h = cVar.U;
                    this.f2358t.u1(cVar, aVar.f2509i);
                    break;
            }
        }
    }
}
