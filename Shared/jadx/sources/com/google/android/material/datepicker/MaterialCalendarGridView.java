package com.google.android.material.datepicker;

import ad.r;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.o0;
import java.util.Calendar;

/* loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f7878a;
    public final boolean b;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull y2.p pVar) {
            super.g(view, pVar);
            pVar.n0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int d(@NonNull View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public static boolean e(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    public final void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().m());
        } else if (i10 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j getAdapter2() {
        return (j) super.getAdapter();
    }

    public final View c(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int a10;
        int d10;
        int a11;
        int d11;
        int width;
        int i10;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        j adapter = materialCalendarGridView.getAdapter();
        DateSelector<?> dateSelector = adapter.b;
        b bVar = adapter.f7954d;
        int max = Math.max(adapter.b(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(adapter.m(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        for (x2.c<Long, Long> cVar : dateSelector.P1()) {
            Long l10 = cVar.f35015a;
            if (l10 == null) {
                materialCalendarGridView = this;
            } else if (cVar.b != null) {
                Long l11 = l10;
                long longValue = l11.longValue();
                Long l12 = cVar.b;
                long longValue2 = l12.longValue();
                if (!e(item, item2, l11, l12)) {
                    boolean h10 = r.h(materialCalendarGridView);
                    if (longValue < item.longValue()) {
                        d10 = adapter.h(max) ? 0 : !h10 ? materialCalendarGridView.c(max - 1).getRight() : materialCalendarGridView.c(max - 1).getLeft();
                        a10 = max;
                    } else {
                        materialCalendarGridView.f7878a.setTimeInMillis(longValue);
                        a10 = adapter.a(materialCalendarGridView.f7878a.get(5));
                        d10 = d(materialCalendarGridView.c(a10));
                    }
                    if (longValue2 > item2.longValue()) {
                        d11 = adapter.i(min) ? materialCalendarGridView.getWidth() : !h10 ? materialCalendarGridView.c(min).getRight() : materialCalendarGridView.c(min).getLeft();
                        a11 = min;
                    } else {
                        materialCalendarGridView.f7878a.setTimeInMillis(longValue2);
                        a11 = adapter.a(materialCalendarGridView.f7878a.get(5));
                        d11 = d(materialCalendarGridView.c(a11));
                    }
                    int itemId = (int) adapter.getItemId(a10);
                    int i11 = max;
                    int i12 = min;
                    int itemId2 = (int) adapter.getItemId(a11);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View c10 = materialCalendarGridView.c(numColumns);
                        int top = c10.getTop() + bVar.f7891a.c();
                        j jVar = adapter;
                        int bottom = c10.getBottom() - bVar.f7891a.b();
                        if (h10) {
                            int i13 = a11 > numColumns2 ? 0 : d11;
                            width = numColumns > a10 ? getWidth() : d10;
                            i10 = i13;
                        } else {
                            i10 = numColumns > a10 ? 0 : d10;
                            width = a11 > numColumns2 ? getWidth() : d11;
                        }
                        canvas.drawRect(i10, top, width, bottom, bVar.f7897h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = jVar;
                    }
                    materialCalendarGridView = this;
                    max = i11;
                    min = i12;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.b) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, EditorInfoCompat.IME_FLAG_FORCE_ASCII));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7878a = p.i();
        if (g.J2(getContext())) {
            setNextFocusLeftId(ic.f.f20478a);
            setNextFocusRightId(ic.f.f20480d);
        }
        this.b = g.L2(getContext());
        o0.m0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof j)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), j.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
