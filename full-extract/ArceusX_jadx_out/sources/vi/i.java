package vi;

import androidx.appcompat.widget.SearchView;
import oh.k;
import rg.q0;
import vi.f;

/* loaded from: classes2.dex */
public class i implements f.e {

    /* renamed from: a, reason: collision with root package name */
    public com.roblox.client.c f33448a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33449c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33450d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33451e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33452f;

    /* renamed from: g, reason: collision with root package name */
    public bk.c f33453g = new bk.f();

    public i(com.roblox.client.c cVar) {
        this.f33448a = cVar;
        this.f33449c = cVar.e0(q0.F1);
        this.f33450d = this.f33448a.e0(q0.H1);
        this.f33451e = this.f33448a.e0(q0.E1);
        this.f33452f = this.f33448a.e0(q0.G1);
    }

    @Override // vi.f.e
    public boolean a(String str) {
        return false;
    }

    @Override // vi.f.e
    public boolean b(SearchView searchView, String str) {
        ev.c.d().j(new k(d(), str));
        searchView.onActionViewCollapsed();
        return true;
    }

    @Override // vi.f.e
    public String c() {
        int d10 = d();
        if (d10 != 1) {
            if (d10 == 3) {
                return this.f33451e;
            }
            if (d10 != 4) {
                return d10 != 5 ? this.f33449c : this.f33452f;
            }
        }
        return this.f33450d;
    }

    @Override // vi.f.e
    public int d() {
        String e10 = e();
        if (e10 != null) {
            if (e10.contains("profile") || e10.contains("friends") || e10.contains("users")) {
                return 1;
            }
            if (e10.contains("games")) {
                return 2;
            }
            if (e10.contains("catalog")) {
                return 3;
            }
            if (e10.contains("groups")) {
                return 5;
            }
        }
        return 2;
    }

    public final String e() {
        String str = this.b;
        return str != null ? str : this.f33448a.d3();
    }

    public void f(String str) {
        this.b = str;
    }

    @Override // bk.c
    public ml.a getTheme() {
        return this.f33453g.getTheme();
    }
}
