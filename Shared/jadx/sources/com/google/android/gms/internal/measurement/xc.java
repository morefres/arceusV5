package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class xc extends t9 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f6978d;

    /* renamed from: e, reason: collision with root package name */
    public static final xc f6979e;
    public Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public int f6980c;

    static {
        Object[] objArr = new Object[0];
        f6978d = objArr;
        f6979e = new xc(objArr, 0, false);
    }

    public xc(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.b = objArr;
        this.f6980c = i10;
    }

    public static xc b() {
        return f6979e;
    }

    private static int d(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void x(int i10) {
        if (i10 < 0 || i10 >= this.f6980c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f6980c)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[d(length)];
            System.arraycopy(this.b, 0, objArr2, 0, i10);
            System.arraycopy(this.b, i10, objArr2, i12, this.f6980c - i10);
            this.b = objArr2;
        }
        this.b[i10] = obj;
        this.f6980c++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i10) {
        int length = this.b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = d(length);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    public final String e(int i10) {
        return v9.a(this.f6980c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        x(i10);
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        x(i10);
        Object[] objArr = this.b;
        Object obj = objArr[i10];
        if (i10 < this.f6980c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f6980c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        x(i10);
        Object[] objArr = this.b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6980c;
    }

    @Override // com.google.android.gms.internal.measurement.pb
    public final /* bridge */ /* synthetic */ pb w(int i10) {
        if (i10 >= this.f6980c) {
            return new xc(i10 == 0 ? f6978d : Arrays.copyOf(this.b, i10), this.f6980c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f6980c;
        int length = this.b.length;
        if (i10 == length) {
            this.b = Arrays.copyOf(this.b, d(length));
        }
        Object[] objArr = this.b;
        int i11 = this.f6980c;
        this.f6980c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
