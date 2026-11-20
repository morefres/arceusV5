package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b f8386a;
    public final b b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8387c;

    /* renamed from: d, reason: collision with root package name */
    public int f8388d;

    /* renamed from: e, reason: collision with root package name */
    public int f8389e;

    /* renamed from: f, reason: collision with root package name */
    public int f8390f;

    /* renamed from: g, reason: collision with root package name */
    public int f8391g;

    public class a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f8388d = i10;
        this.f8389e = i11;
        this.f8390f = i12;
        this.f8387c = i13;
        this.f8391g = g(i10);
        this.f8386a = new b(59);
        this.b = new b(i13 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return f(resources, charSequence, "%02d");
    }

    public static String f(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int g(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f8388d == timeModel.f8388d && this.f8389e == timeModel.f8389e && this.f8387c == timeModel.f8387c && this.f8390f == timeModel.f8390f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8387c), Integer.valueOf(this.f8388d), Integer.valueOf(this.f8389e), Integer.valueOf(this.f8390f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8388d);
        parcel.writeInt(this.f8389e);
        parcel.writeInt(this.f8390f);
        parcel.writeInt(this.f8387c);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
