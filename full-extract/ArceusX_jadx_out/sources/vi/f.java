package vi;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.ViewCompat;
import com.roblox.client.components.RobloxToolbar;
import ek.q;
import ek.t;
import rg.e2;
import rg.l0;
import rg.m0;
import rg.o0;
import rg.q0;
import rg.t0;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.fragment.app.c f33438a;
    public MenuItem b;

    /* renamed from: c, reason: collision with root package name */
    public Menu f33439c;

    /* renamed from: d, reason: collision with root package name */
    public RobloxToolbar f33440d;

    /* renamed from: e, reason: collision with root package name */
    public e f33441e;

    public class a implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchView f33442a;

        /* renamed from: vi.f$a$a, reason: collision with other inner class name */
        public class RunnableC0617a implements Runnable {
            public RunnableC0617a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                dh.h.b(f.this.f33440d, f.this.i());
            }
        }

        public a(SearchView searchView) {
            this.f33442a = searchView;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            f fVar = f.this;
            fVar.m(fVar.f33439c, f.this.b, true);
            f fVar2 = f.this;
            fVar2.l(fVar2.f33441e.d(), "searchClose");
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            if (f.this.f33440d != null) {
                this.f33442a.post(new RunnableC0617a());
            }
            f fVar = f.this;
            fVar.m(fVar.f33439c, f.this.b, false);
            f fVar2 = f.this;
            fVar2.l(fVar2.f33441e.d(), "searchOpen");
            return true;
        }
    }

    public class b implements SearchView.m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SearchView f33444a;

        public b(SearchView searchView) {
            this.f33444a = searchView;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            return f.this.f33441e.a(str);
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            return f.this.f33441e.b(this.f33444a, str);
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            q.h("SearchMenuOption", "... onFocusChange: hasFocus = " + z10);
            if (z10) {
                return;
            }
            if (f.this.f33438a != null) {
                e2.h(f.this.f33438a.p());
            }
            f.this.b.collapseActionView();
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33446a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f33446a = iArr;
            try {
                iArr[ml.a.f24590c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33446a[ml.a.f24592e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33446a[ml.a.f24591d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface e extends bk.c {
        boolean a(String str);

        boolean b(SearchView searchView, String str);

        String c();

        int d();
    }

    public f(androidx.fragment.app.c cVar) {
        this.f33438a = cVar;
    }

    public final int i() {
        int i10 = d.f33446a[this.f33441e.getTheme().ordinal()];
        return i10 != 1 ? i10 != 2 ? l0.f30340o : l0.f30339n : l0.f30341p;
    }

    public final int j() {
        int i10 = d.f33446a[this.f33441e.getTheme().ordinal()];
        return i10 != 1 ? i10 != 2 ? l0.A : l0.f30351z : l0.B;
    }

    public MenuItem k(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.f30437c, menu);
        MenuItem findItem = menu.findItem(m0.f30357c);
        this.b = findItem;
        findItem.setIcon(this.f33438a.S().getDrawable(j()));
        q();
        return this.b;
    }

    public final void l(int i10, String str) {
        q.h("SearchMenuOption", "reportEvents: searchType = " + i10 + ", buttonEvent = " + str);
        if (i10 == 1) {
            t0.e("nativeMain", str, "users");
            return;
        }
        if (i10 == 2) {
            t0.e("nativeMain", str, "games");
        } else if (i10 == 3) {
            t0.e("nativeMain", str, "catalog");
        } else {
            if (i10 != 4) {
                return;
            }
            t0.d("nativeMain|friends", str);
        }
    }

    public final void m(Menu menu, MenuItem menuItem, boolean z10) {
        if (menu != null) {
            for (int i10 = 0; i10 < menu.size(); i10++) {
                MenuItem item = menu.getItem(i10);
                if (item != menuItem) {
                    item.setVisible(z10);
                }
            }
        }
    }

    public void n(Menu menu) {
        this.f33439c = menu;
    }

    public void o(e eVar) {
        this.f33441e = eVar;
    }

    public void p(RobloxToolbar robloxToolbar) {
        this.f33440d = robloxToolbar;
    }

    public final void q() {
        SearchView searchView = (SearchView) this.b.getActionView();
        this.b.setOnActionExpandListener(new a(searchView));
        EditText editText = (EditText) searchView.findViewById(i.f.I);
        editText.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        editText.setHintTextColor(-7829368);
        dh.e.d(editText, editText.getContext(), "SourceSansPro-Regular.ttf");
        searchView.findViewById(i.f.H).setBackgroundResource(l0.f30338m);
        searchView.setQueryHint(searchView.getContext().getString(q0.I1));
        searchView.setOnQueryTextListener(new b(searchView));
        editText.setOnFocusChangeListener(new c());
    }

    public void r() {
        ((SearchView) this.b.getActionView()).setQueryHint(this.f33441e.c());
        boolean z10 = (t.j() && this.f33441e.d() == 2) ? false : true;
        this.b.setVisible(z10);
        this.b.setEnabled(z10);
    }
}
