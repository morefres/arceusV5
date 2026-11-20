package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Calendar f7880a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7881c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7882d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7883e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7884f;

    /* renamed from: g, reason: collision with root package name */
    public String f7885g;

    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.j(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar c10 = p.c(calendar);
        this.f7880a = c10;
        this.b = c10.get(2);
        this.f7881c = c10.get(1);
        this.f7882d = c10.getMaximum(7);
        this.f7883e = c10.getActualMaximum(5);
        this.f7884f = c10.getTimeInMillis();
    }

    @NonNull
    public static Month j(int i10, int i11) {
        Calendar i12 = p.i();
        i12.set(1, i10);
        i12.set(2, i11);
        return new Month(i12);
    }

    @NonNull
    public static Month n(long j10) {
        Calendar i10 = p.i();
        i10.setTimeInMillis(j10);
        return new Month(i10);
    }

    @NonNull
    public static Month o() {
        return new Month(p.g());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Month month) {
        return this.f7880a.compareTo(month.f7880a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.b == month.b && this.f7881c == month.f7881c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.f7881c)});
    }

    public int q(int i10) {
        int i11 = this.f7880a.get(7);
        if (i10 <= 0) {
            i10 = this.f7880a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f7882d : i12;
    }

    public long r(int i10) {
        Calendar c10 = p.c(this.f7880a);
        c10.set(5, i10);
        return c10.getTimeInMillis();
    }

    public int s(long j10) {
        Calendar c10 = p.c(this.f7880a);
        c10.setTimeInMillis(j10);
        return c10.get(5);
    }

    @NonNull
    public String u() {
        if (this.f7885g == null) {
            this.f7885g = c.f(this.f7880a.getTimeInMillis());
        }
        return this.f7885g;
    }

    public long v() {
        return this.f7880a.getTimeInMillis();
    }

    @NonNull
    public Month w(int i10) {
        Calendar c10 = p.c(this.f7880a);
        c10.add(2, i10);
        return new Month(c10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f7881c);
        parcel.writeInt(this.b);
    }

    public int x(@NonNull Month month) {
        if (this.f7880a instanceof GregorianCalendar) {
            return ((month.f7881c - this.f7881c) * 12) + (month.b - this.b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
