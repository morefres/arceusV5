package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import m9.h;
import n9.m;
import o9.b;

@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new h();

    /* renamed from: p, reason: collision with root package name */
    public static final a f5798p = new com.google.android.gms.common.data.a(new String[0], null);

    /* renamed from: f, reason: collision with root package name */
    public final int f5799f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f5800g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f5801h;

    /* renamed from: i, reason: collision with root package name */
    public final CursorWindow[] f5802i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5803j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f5804k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f5805l;

    /* renamed from: m, reason: collision with root package name */
    public int f5806m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5807n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5808o = true;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f5809a;
        public final ArrayList b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f5810c = new HashMap();
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f5799f = i10;
        this.f5800g = strArr;
        this.f5802i = cursorWindowArr;
        this.f5803j = i11;
        this.f5804k = bundle;
    }

    public int A3(int i10) {
        int length;
        int i11 = 0;
        m.p(i10 >= 0 && i10 < this.f5806m);
        while (true) {
            int[] iArr = this.f5805l;
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            if (i10 < iArr[i11]) {
                i11--;
                break;
            }
            i11++;
        }
        return i11 == length ? i11 - 1 : i11;
    }

    public boolean B3(@NonNull String str) {
        return this.f5801h.containsKey(str);
    }

    public boolean C3(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5802i[i11].isNull(i10, this.f5801h.getInt(str));
    }

    public final float D3(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5802i[i11].getFloat(i10, this.f5801h.getInt(str));
    }

    public final void E3() {
        this.f5801h = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f5800g;
            if (i11 >= strArr.length) {
                break;
            }
            this.f5801h.putInt(strArr[i11], i11);
            i11++;
        }
        this.f5805l = new int[this.f5802i.length];
        int i12 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f5802i;
            if (i10 >= cursorWindowArr.length) {
                this.f5806m = i12;
                return;
            }
            this.f5805l[i10] = i12;
            i12 += this.f5802i[i10].getNumRows() - (i12 - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    public final void F3(String str, int i10) {
        Bundle bundle = this.f5801h;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i10 < 0 || i10 >= this.f5806m) {
            throw new CursorIndexOutOfBoundsException(i10, this.f5806m);
        }
    }

    public boolean a(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5802i[i11].getLong(i10, this.f5801h.getInt(str)) == 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f5807n) {
                    this.f5807n = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f5802i;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        try {
            if (this.f5808o && this.f5802i.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public int getCount() {
        return this.f5806m;
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f5807n;
        }
        return z10;
    }

    public int v3(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5802i[i11].getInt(i10, this.f5801h.getInt(str));
    }

    public long w3(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5802i[i11].getLong(i10, this.f5801h.getInt(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String[] strArr = this.f5800g;
        int a10 = b.a(parcel);
        b.w(parcel, 1, strArr, false);
        b.y(parcel, 2, this.f5802i, i10, false);
        b.n(parcel, 3, y3());
        b.f(parcel, 4, x3(), false);
        b.n(parcel, 1000, this.f5799f);
        b.b(parcel, a10);
        if ((i10 & 1) != 0) {
            close();
        }
    }

    public Bundle x3() {
        return this.f5804k;
    }

    public int y3() {
        return this.f5803j;
    }

    @NonNull
    public String z3(@NonNull String str, int i10, int i11) {
        F3(str, i10);
        return this.f5802i[i11].getString(i10, this.f5801h.getInt(str));
    }
}
