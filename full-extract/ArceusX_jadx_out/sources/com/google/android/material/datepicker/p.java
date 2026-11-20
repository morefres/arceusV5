package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import androidx.core.view.MotionEventCompat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicReference<o> f7969a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar i10 = i();
        i10.setTimeInMillis(j10);
        return c(i10).getTimeInMillis();
    }

    @TargetApi(MotionEventCompat.AXIS_DISTANCE)
    public static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static Calendar c(Calendar calendar) {
        Calendar j10 = j(calendar);
        Calendar i10 = i();
        i10.set(j10.get(1), j10.get(2), j10.get(5));
        return i10;
    }

    @TargetApi(MotionEventCompat.AXIS_DISTANCE)
    public static DateFormat d(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    public static o e() {
        o oVar = f7969a.get();
        return oVar == null ? o.c() : oVar;
    }

    public static TimeZone f() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar g() {
        Calendar a10 = e().a();
        a10.set(11, 0);
        a10.set(12, 0);
        a10.set(13, 0);
        a10.set(14, 0);
        a10.setTimeZone(f());
        return a10;
    }

    @TargetApi(MotionEventCompat.AXIS_DISTANCE)
    public static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar i() {
        return j(null);
    }

    public static Calendar j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(f());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    @TargetApi(MotionEventCompat.AXIS_DISTANCE)
    public static DateFormat k(Locale locale) {
        return b("yMMMM", locale);
    }

    @TargetApi(MotionEventCompat.AXIS_DISTANCE)
    public static DateFormat l(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}
