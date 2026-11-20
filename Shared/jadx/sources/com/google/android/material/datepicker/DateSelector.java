package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Collection;

/* loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    @NonNull
    String K1(Context context);

    @NonNull
    String L0(@NonNull Context context);

    boolean L2();

    @NonNull
    Collection<x2.c<Long, Long>> P1();

    int R0(Context context);

    @NonNull
    Collection<Long> T2();

    S a3();

    void h3(long j10);

    @NonNull
    View v2(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull l<S> lVar);
}
