package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public class c {
    public static String a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String d10 = d(j10);
        if (z10) {
            d10 = String.format(context.getString(ic.i.f20542q), d10);
        }
        return z11 ? String.format(context.getString(ic.i.f20541p), d10) : z12 ? String.format(context.getString(ic.i.f20538m), d10) : d10;
    }

    public static String b(long j10) {
        return c(j10, Locale.getDefault());
    }

    public static String c(long j10, Locale locale) {
        return p.d(locale).format(new Date(j10));
    }

    public static String d(long j10) {
        return i(j10) ? b(j10) : g(j10);
    }

    public static String e(Context context, int i10) {
        return p.g().get(1) == i10 ? String.format(context.getString(ic.i.f20539n), Integer.valueOf(i10)) : String.format(context.getString(ic.i.f20540o), Integer.valueOf(i10));
    }

    public static String f(long j10) {
        return p.k(Locale.getDefault()).format(new Date(j10));
    }

    public static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    public static String h(long j10, Locale locale) {
        return p.l(locale).format(new Date(j10));
    }

    public static boolean i(long j10) {
        Calendar g10 = p.g();
        Calendar i10 = p.i();
        i10.setTimeInMillis(j10);
        return g10.get(1) == i10.get(1);
    }
}
