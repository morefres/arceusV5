package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class j extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f7950g = p.i().getMaximum(4);

    /* renamed from: h, reason: collision with root package name */
    public static final int f7951h = (p.i().getMaximum(5) + p.i().getMaximum(7)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final Month f7952a;
    public final DateSelector<?> b;

    /* renamed from: c, reason: collision with root package name */
    public Collection<Long> f7953c;

    /* renamed from: d, reason: collision with root package name */
    public b f7954d;

    /* renamed from: e, reason: collision with root package name */
    public final CalendarConstraints f7955e;

    /* renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f7956f;

    public j(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f7952a = month;
        this.b = dateSelector;
        this.f7955e = calendarConstraints;
        this.f7956f = dayViewDecorator;
        this.f7953c = dateSelector.T2();
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.f7952a.q(this.f7955e.o());
    }

    public final String c(Context context, long j10) {
        return c.a(context, j10, l(j10), k(j10), g(j10));
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > m()) {
            return null;
        }
        return Long.valueOf(this.f7952a.r(n(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = ic.h.f20517n
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.f7952a
            int r2 = r8.f7883e
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.o(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void f(Context context) {
        if (this.f7954d == null) {
            this.f7954d = new b(context);
        }
    }

    public boolean g(long j10) {
        Iterator<x2.c<Long, Long>> it = this.b.P1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().b;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f7951h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f7952a.f7882d;
    }

    public boolean h(int i10) {
        return i10 % this.f7952a.f7882d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(int i10) {
        return (i10 + 1) % this.f7952a.f7882d == 0;
    }

    public final boolean j(long j10) {
        Iterator<Long> it = this.b.T2().iterator();
        while (it.hasNext()) {
            if (p.a(j10) == p.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean k(long j10) {
        Iterator<x2.c<Long, Long>> it = this.b.P1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f35015a;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(long j10) {
        return p.g().getTimeInMillis() == j10;
    }

    public int m() {
        return (b() + this.f7952a.f7883e) - 1;
    }

    public int n(int i10) {
        return (i10 - b()) + 1;
    }

    public final void o(TextView textView, long j10, int i10) {
        boolean z10;
        a aVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String c10 = c(context, j10);
        textView.setContentDescription(c10);
        boolean V0 = this.f7955e.m().V0(j10);
        if (V0) {
            textView.setEnabled(true);
            z10 = j(j10);
            textView.setSelected(z10);
            aVar = z10 ? this.f7954d.b : l(j10) ? this.f7954d.f7892c : this.f7954d.f7891a;
        } else {
            z10 = false;
            textView.setEnabled(false);
            aVar = this.f7954d.f7896g;
        }
        boolean z11 = z10;
        DayViewDecorator dayViewDecorator = this.f7956f;
        if (dayViewDecorator == null || i10 == -1) {
            aVar.d(textView);
            return;
        }
        Month month = this.f7952a;
        int i11 = month.f7881c;
        int i12 = month.b;
        aVar.e(textView, dayViewDecorator.a(context, i11, i12, i10, V0, z11), this.f7956f.m(context, i11, i12, i10, V0, z11));
        textView.setCompoundDrawables(this.f7956f.g(context, i11, i12, i10, V0, z11), this.f7956f.j(context, i11, i12, i10, V0, z11), this.f7956f.i(context, i11, i12, i10, V0, z11), this.f7956f.f(context, i11, i12, i10, V0, z11));
        textView.setContentDescription(this.f7956f.k(context, i11, i12, i10, V0, z11, c10));
    }

    public final void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.n(j10).equals(this.f7952a)) {
            int s8 = this.f7952a.s(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(s8) - materialCalendarGridView.getFirstVisiblePosition()), j10, s8);
        }
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f7953c.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.b;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.T2().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.f7953c = this.b.T2();
        }
    }

    public boolean r(int i10) {
        return i10 >= b() && i10 <= m();
    }
}
