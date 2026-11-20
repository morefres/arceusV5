package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;

/* loaded from: classes2.dex */
public class k extends RecyclerView.h<b> {

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final CalendarConstraints f7957d;

    /* renamed from: e, reason: collision with root package name */
    public final DateSelector<?> f7958e;

    /* renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f7959f;

    /* renamed from: g, reason: collision with root package name */
    public final e.m f7960g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7961h;

    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f7962a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f7962a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f7962a.getAdapter().r(i10)) {
                k.this.f7960g.a(this.f7962a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.f0 {

        /* renamed from: u, reason: collision with root package name */
        public final TextView f7963u;

        /* renamed from: v, reason: collision with root package name */
        public final MaterialCalendarGridView f7964v;

        public b(@NonNull LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(ic.f.f20499w);
            this.f7963u = textView;
            o0.n0(textView, true);
            this.f7964v = (MaterialCalendarGridView) linearLayout.findViewById(ic.f.f20495s);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public k(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, e.m mVar) {
        Month r8 = calendarConstraints.r();
        Month n10 = calendarConstraints.n();
        Month q10 = calendarConstraints.q();
        if (r8.compareTo(q10) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (q10.compareTo(n10) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f7961h = (j.f7950g * e.q2(context)) + (g.J2(context) ? e.q2(context) : 0);
        this.f7957d = calendarConstraints;
        this.f7958e = dateSelector;
        this.f7959f = dayViewDecorator;
        this.f7960g = mVar;
        A(true);
    }

    @NonNull
    public Month D(int i10) {
        return this.f7957d.r().w(i10);
    }

    @NonNull
    public CharSequence E(int i10) {
        return D(i10).u();
    }

    public int F(@NonNull Month month) {
        return this.f7957d.r().x(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void r(@NonNull b bVar, int i10) {
        Month w5 = this.f7957d.r().w(i10);
        bVar.f7963u.setText(w5.u());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f7964v.findViewById(ic.f.f20495s);
        if (materialCalendarGridView.getAdapter() == null || !w5.equals(materialCalendarGridView.getAdapter().f7952a)) {
            j jVar = new j(w5, this.f7958e, this.f7957d, this.f7959f);
            materialCalendarGridView.setNumColumns(w5.f7882d);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public b t(@NonNull ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ic.h.f20520q, viewGroup, false);
        if (!g.J2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.r(-1, this.f7961h));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f7957d.p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i10) {
        return this.f7957d.r().w(i10).v();
    }
}
