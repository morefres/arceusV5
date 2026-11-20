package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public class d extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f7898d = 4;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Calendar f7899a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7900c;

    public d() {
        Calendar i10 = p.i();
        this.f7899a = i10;
        this.b = i10.getMaximum(7);
        this.f7900c = i10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public final int b(int i10) {
        int i11 = i10 + this.f7900c;
        int i12 = this.b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ic.h.f20518o, viewGroup, false);
        }
        this.f7899a.set(7, b(i10));
        textView.setText(this.f7899a.getDisplayName(7, f7898d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(ic.i.f20537l), this.f7899a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public d(int i10) {
        Calendar i11 = p.i();
        this.f7899a = i11;
        this.b = i11.getMaximum(7);
        this.f7900c = i10;
    }
}
