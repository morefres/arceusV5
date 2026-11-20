package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Month f7865a;

    @NonNull
    public final Month b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final DateValidator f7866c;

    /* renamed from: d, reason: collision with root package name */
    public Month f7867d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7868e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7869f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7870g;

    public interface DateValidator extends Parcelable {
        boolean V0(long j10);
    }

    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final long f7871f = p.a(Month.j(1900, 0).f7884f);

        /* renamed from: g, reason: collision with root package name */
        public static final long f7872g = p.a(Month.j(2100, 11).f7884f);

        /* renamed from: a, reason: collision with root package name */
        public long f7873a;
        public long b;

        /* renamed from: c, reason: collision with root package name */
        public Long f7874c;

        /* renamed from: d, reason: collision with root package name */
        public int f7875d;

        /* renamed from: e, reason: collision with root package name */
        public DateValidator f7876e;

        public b(@NonNull CalendarConstraints calendarConstraints) {
            this.f7873a = f7871f;
            this.b = f7872g;
            this.f7876e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f7873a = calendarConstraints.f7865a.f7884f;
            this.b = calendarConstraints.b.f7884f;
            this.f7874c = Long.valueOf(calendarConstraints.f7867d.f7884f);
            this.f7875d = calendarConstraints.f7868e;
            this.f7876e = calendarConstraints.f7866c;
        }

        @NonNull
        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f7876e);
            Month n10 = Month.n(this.f7873a);
            Month n11 = Month.n(this.b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f7874c;
            return new CalendarConstraints(n10, n11, dateValidator, l10 == null ? null : Month.n(l10.longValue()), this.f7875d, null);
        }

        @NonNull
        public b b(long j10) {
            this.f7874c = Long.valueOf(j10);
            return this;
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10, a aVar) {
        this(month, month2, dateValidator, month3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f7865a.equals(calendarConstraints.f7865a) && this.b.equals(calendarConstraints.b) && x2.b.a(this.f7867d, calendarConstraints.f7867d) && this.f7868e == calendarConstraints.f7868e && this.f7866c.equals(calendarConstraints.f7866c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7865a, this.b, this.f7867d, Integer.valueOf(this.f7868e), this.f7866c});
    }

    public Month k(Month month) {
        return month.compareTo(this.f7865a) < 0 ? this.f7865a : month.compareTo(this.b) > 0 ? this.b : month;
    }

    public DateValidator m() {
        return this.f7866c;
    }

    @NonNull
    public Month n() {
        return this.b;
    }

    public int o() {
        return this.f7868e;
    }

    public int p() {
        return this.f7870g;
    }

    public Month q() {
        return this.f7867d;
    }

    @NonNull
    public Month r() {
        return this.f7865a;
    }

    public int s() {
        return this.f7869f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7865a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.f7867d, 0);
        parcel.writeParcelable(this.f7866c, 0);
        parcel.writeInt(this.f7868e);
    }

    public CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f7865a = month;
        this.b = month2;
        this.f7867d = month3;
        this.f7868e = i10;
        this.f7866c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > p.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f7870g = month.x(month2) + 1;
        this.f7869f = (month2.f7881c - month.f7881c) + 1;
    }
}
