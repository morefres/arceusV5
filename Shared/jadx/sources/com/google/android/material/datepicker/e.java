package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e<S> extends com.google.android.material.datepicker.m<S> {

    /* renamed from: t0, reason: collision with root package name */
    public static final Object f7901t0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: u0, reason: collision with root package name */
    public static final Object f7902u0 = "NAVIGATION_PREV_TAG";

    /* renamed from: v0, reason: collision with root package name */
    public static final Object f7903v0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: w0, reason: collision with root package name */
    public static final Object f7904w0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: g0, reason: collision with root package name */
    public int f7905g0;

    /* renamed from: h0, reason: collision with root package name */
    public DateSelector<S> f7906h0;

    /* renamed from: i0, reason: collision with root package name */
    public CalendarConstraints f7907i0;

    /* renamed from: j0, reason: collision with root package name */
    public DayViewDecorator f7908j0;

    /* renamed from: k0, reason: collision with root package name */
    public Month f7909k0;

    /* renamed from: l0, reason: collision with root package name */
    public l f7910l0;

    /* renamed from: m0, reason: collision with root package name */
    public com.google.android.material.datepicker.b f7911m0;

    /* renamed from: n0, reason: collision with root package name */
    public RecyclerView f7912n0;

    /* renamed from: o0, reason: collision with root package name */
    public RecyclerView f7913o0;

    /* renamed from: p0, reason: collision with root package name */
    public View f7914p0;

    /* renamed from: q0, reason: collision with root package name */
    public View f7915q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f7916r0;

    /* renamed from: s0, reason: collision with root package name */
    public View f7917s0;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.k f7918a;

        public a(com.google.android.material.datepicker.k kVar) {
            this.f7918a = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int f22 = e.this.s2().f2() - 1;
            if (f22 >= 0) {
                e.this.v2(this.f7918a.D(f22));
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7919a;

        public b(int i10) {
            this.f7919a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f7913o0.C1(this.f7919a);
        }
    }

    public class c extends androidx.core.view.a {
        public c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull y2.p pVar) {
            super.g(view, pVar);
            pVar.n0(null);
        }
    }

    public class d extends n {
        public final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void R1(@NonNull RecyclerView.b0 b0Var, @NonNull int[] iArr) {
            if (this.I == 0) {
                iArr[0] = e.this.f7913o0.getWidth();
                iArr[1] = e.this.f7913o0.getWidth();
            } else {
                iArr[0] = e.this.f7913o0.getHeight();
                iArr[1] = e.this.f7913o0.getHeight();
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$e, reason: collision with other inner class name */
    public class C0126e implements m {
        public C0126e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.e.m
        public void a(long j10) {
            if (e.this.f7907i0.m().V0(j10)) {
                e.this.f7906h0.h3(j10);
                Iterator<com.google.android.material.datepicker.l<S>> it = e.this.f7965f0.iterator();
                while (it.hasNext()) {
                    it.next().a(e.this.f7906h0.a3());
                }
                e.this.f7913o0.getAdapter().j();
                if (e.this.f7912n0 != null) {
                    e.this.f7912n0.getAdapter().j();
                }
            }
        }
    }

    public class f extends androidx.core.view.a {
        public f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull y2.p pVar) {
            super.g(view, pVar);
            pVar.G0(false);
        }
    }

    public class g extends RecyclerView.p {

        /* renamed from: a, reason: collision with root package name */
        public final Calendar f7923a = p.i();
        public final Calendar b = p.i();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.b0 b0Var) {
            if ((recyclerView.getAdapter() instanceof q) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                q qVar = (q) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (x2.c<Long, Long> cVar : e.this.f7906h0.P1()) {
                    Long l10 = cVar.f35015a;
                    if (l10 != null && cVar.b != null) {
                        this.f7923a.setTimeInMillis(l10.longValue());
                        this.b.setTimeInMillis(cVar.b.longValue());
                        int E = qVar.E(this.f7923a.get(1));
                        int E2 = qVar.E(this.b.get(1));
                        View H = gridLayoutManager.H(E);
                        View H2 = gridLayoutManager.H(E2);
                        int l32 = E / gridLayoutManager.l3();
                        int l33 = E2 / gridLayoutManager.l3();
                        int i10 = l32;
                        while (i10 <= l33) {
                            if (gridLayoutManager.H(gridLayoutManager.l3() * i10) != null) {
                                canvas.drawRect((i10 != l32 || H == null) ? 0 : H.getLeft() + (H.getWidth() / 2), r9.getTop() + e.this.f7911m0.f7893d.c(), (i10 != l33 || H2 == null) ? recyclerView.getWidth() : H2.getLeft() + (H2.getWidth() / 2), r9.getBottom() - e.this.f7911m0.f7893d.b(), e.this.f7911m0.f7897h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    public class h extends androidx.core.view.a {
        public h() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull y2.p pVar) {
            super.g(view, pVar);
            pVar.x0(e.this.f7917s0.getVisibility() == 0 ? e.this.e0(ic.i.f20546u) : e.this.e0(ic.i.f20544s));
        }
    }

    public class i extends RecyclerView.v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.k f7926a;
        public final /* synthetic */ MaterialButton b;

        public i(com.google.android.material.datepicker.k kVar, MaterialButton materialButton) {
            this.f7926a = kVar;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void a(@NonNull RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(@NonNull RecyclerView recyclerView, int i10, int i11) {
            int d22 = i10 < 0 ? e.this.s2().d2() : e.this.s2().f2();
            e.this.f7909k0 = this.f7926a.D(d22);
            this.b.setText(this.f7926a.E(d22));
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.y2();
        }
    }

    public class k implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.k f7929a;

        public k(com.google.android.material.datepicker.k kVar) {
            this.f7929a = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int d22 = e.this.s2().d2() + 1;
            if (d22 < e.this.f7913o0.getAdapter().e()) {
                e.this.v2(this.f7929a.D(d22));
            }
        }
    }

    public enum l {
        DAY,
        YEAR
    }

    public interface m {
        void a(long j10);
    }

    public static int q2(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(ic.d.Q);
    }

    public static int r2(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(ic.d.X) + resources.getDimensionPixelOffset(ic.d.Y) + resources.getDimensionPixelOffset(ic.d.W);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(ic.d.S);
        int i10 = com.google.android.material.datepicker.j.f7950g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(ic.d.Q) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ic.d.V)) + resources.getDimensionPixelOffset(ic.d.O);
    }

    @NonNull
    public static <T> e<T> t2(@NonNull DateSelector<T> dateSelector, int i10, @NonNull CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        e<T> eVar = new e<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.q());
        eVar.O1(bundle);
        return eVar;
    }

    @Override // androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.f7905g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f7906h0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f7907i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7908j0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f7909k0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.c
    @NonNull
    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(w(), this.f7905g0);
        this.f7911m0 = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month r8 = this.f7907i0.r();
        if (com.google.android.material.datepicker.g.J2(contextThemeWrapper)) {
            i10 = ic.h.f20521r;
            i11 = 1;
        } else {
            i10 = ic.h.f20519p;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        inflate.setMinimumHeight(r2(I1()));
        GridView gridView = (GridView) inflate.findViewById(ic.f.f20501y);
        o0.m0(gridView, new c());
        int o8 = this.f7907i0.o();
        gridView.setAdapter((ListAdapter) (o8 > 0 ? new com.google.android.material.datepicker.d(o8) : new com.google.android.material.datepicker.d()));
        gridView.setNumColumns(r8.f7882d);
        gridView.setEnabled(false);
        this.f7913o0 = (RecyclerView) inflate.findViewById(ic.f.B);
        this.f7913o0.setLayoutManager(new d(w(), i11, false, i11));
        this.f7913o0.setTag(f7901t0);
        com.google.android.material.datepicker.k kVar = new com.google.android.material.datepicker.k(contextThemeWrapper, this.f7906h0, this.f7907i0, this.f7908j0, new C0126e());
        this.f7913o0.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(ic.g.f20504c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(ic.f.C);
        this.f7912n0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f7912n0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f7912n0.setAdapter(new q(this));
            this.f7912n0.j(l2());
        }
        if (inflate.findViewById(ic.f.f20496t) != null) {
            k2(inflate, kVar);
        }
        if (!com.google.android.material.datepicker.g.J2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.o().b(this.f7913o0);
        }
        this.f7913o0.t1(kVar.F(this.f7909k0));
        x2();
        return inflate;
    }

    @Override // androidx.fragment.app.c
    public void b1(@NonNull Bundle bundle) {
        super.b1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7905g0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f7906h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7907i0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f7908j0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7909k0);
    }

    @Override // com.google.android.material.datepicker.m
    public boolean b2(@NonNull com.google.android.material.datepicker.l<S> lVar) {
        return super.b2(lVar);
    }

    public final void k2(@NonNull View view, @NonNull com.google.android.material.datepicker.k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(ic.f.f20496t);
        materialButton.setTag(f7904w0);
        o0.m0(materialButton, new h());
        View findViewById = view.findViewById(ic.f.f20498v);
        this.f7914p0 = findViewById;
        findViewById.setTag(f7902u0);
        View findViewById2 = view.findViewById(ic.f.f20497u);
        this.f7915q0 = findViewById2;
        findViewById2.setTag(f7903v0);
        this.f7916r0 = view.findViewById(ic.f.C);
        this.f7917s0 = view.findViewById(ic.f.f20500x);
        w2(l.DAY);
        materialButton.setText(this.f7909k0.u());
        this.f7913o0.n(new i(kVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f7915q0.setOnClickListener(new k(kVar));
        this.f7914p0.setOnClickListener(new a(kVar));
    }

    @NonNull
    public final RecyclerView.p l2() {
        return new g();
    }

    public CalendarConstraints m2() {
        return this.f7907i0;
    }

    public com.google.android.material.datepicker.b n2() {
        return this.f7911m0;
    }

    public Month o2() {
        return this.f7909k0;
    }

    public DateSelector<S> p2() {
        return this.f7906h0;
    }

    @NonNull
    public LinearLayoutManager s2() {
        return (LinearLayoutManager) this.f7913o0.getLayoutManager();
    }

    public final void u2(int i10) {
        this.f7913o0.post(new b(i10));
    }

    public void v2(Month month) {
        com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) this.f7913o0.getAdapter();
        int F = kVar.F(month);
        int F2 = F - kVar.F(this.f7909k0);
        boolean z10 = Math.abs(F2) > 3;
        boolean z11 = F2 > 0;
        this.f7909k0 = month;
        if (z10 && z11) {
            this.f7913o0.t1(F - 3);
            u2(F);
        } else if (!z10) {
            u2(F);
        } else {
            this.f7913o0.t1(F + 3);
            u2(F);
        }
    }

    public void w2(l lVar) {
        this.f7910l0 = lVar;
        if (lVar == l.YEAR) {
            this.f7912n0.getLayoutManager().C1(((q) this.f7912n0.getAdapter()).E(this.f7909k0.f7881c));
            this.f7916r0.setVisibility(0);
            this.f7917s0.setVisibility(8);
            this.f7914p0.setVisibility(8);
            this.f7915q0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f7916r0.setVisibility(8);
            this.f7917s0.setVisibility(0);
            this.f7914p0.setVisibility(0);
            this.f7915q0.setVisibility(0);
            v2(this.f7909k0);
        }
    }

    public final void x2() {
        o0.m0(this.f7913o0, new f());
    }

    public void y2() {
        l lVar = this.f7910l0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            w2(l.DAY);
        } else if (lVar == l.DAY) {
            w2(lVar2);
        }
    }
}
