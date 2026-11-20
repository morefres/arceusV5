package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.s1;
import com.google.crypto.tink.shaded.protobuf.u.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    public static final u<?> f8635d = new u<>(true);

    /* renamed from: a, reason: collision with root package name */
    public final j1<T, Object> f8636a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8637c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8638a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[s1.b.values().length];
            b = iArr;
            try {
                iArr[s1.b.f8603c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[s1.b.f8604d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[s1.b.f8605e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[s1.b.f8606f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[s1.b.f8607g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[s1.b.f8608h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[s1.b.f8609i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[s1.b.f8610j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[s1.b.f8612l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[s1.b.f8613m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[s1.b.f8611k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[s1.b.f8614n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[s1.b.f8615o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[s1.b.f8617q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[s1.b.f8618r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[s1.b.f8619s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[s1.b.f8620t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[s1.b.f8616p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[s1.c.values().length];
            f8638a = iArr2;
            try {
                iArr2[s1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f8638a[s1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f8638a[s1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f8638a[s1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f8638a[s1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f8638a[s1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f8638a[s1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f8638a[s1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f8638a[s1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        boolean f();

        s1.b g();

        int getNumber();

        s0.a i(s0.a aVar, s0 s0Var);

        s1.c k();

        boolean m();
    }

    public u() {
        this.f8636a = j1.r();
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int d(s1.b bVar, int i10, Object obj) {
        int U = k.U(i10);
        if (bVar == s1.b.f8612l) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    public static int e(s1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return k.j(((Double) obj).doubleValue());
            case 2:
                return k.r(((Float) obj).floatValue());
            case 3:
                return k.y(((Long) obj).longValue());
            case 4:
                return k.Y(((Long) obj).longValue());
            case 5:
                return k.w(((Integer) obj).intValue());
            case 6:
                return k.p(((Long) obj).longValue());
            case 7:
                return k.n(((Integer) obj).intValue());
            case 8:
                return k.e(((Boolean) obj).booleanValue());
            case 9:
                return k.t((s0) obj);
            case 10:
                return obj instanceof d0 ? k.B((d0) obj) : k.G((s0) obj);
            case 11:
                return obj instanceof h ? k.h((h) obj) : k.T((String) obj);
            case 12:
                return obj instanceof h ? k.h((h) obj) : k.f((byte[]) obj);
            case 13:
                return k.W(((Integer) obj).intValue());
            case 14:
                return k.L(((Integer) obj).intValue());
            case 15:
                return k.N(((Long) obj).longValue());
            case 16:
                return k.P(((Integer) obj).intValue());
            case 17:
                return k.R(((Long) obj).longValue());
            case 18:
                return obj instanceof a0.c ? k.l(((a0.c) obj).getNumber()) : k.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        s1.b g10 = bVar.g();
        int number = bVar.getNumber();
        if (!bVar.f()) {
            return d(g10, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.m()) {
            int i11 = 0;
            while (i10 < size) {
                i11 += d(g10, number, list.get(i10));
                i10++;
            }
            return i11;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i12 = 0;
        while (i10 < size) {
            i12 += e(g10, list.get(i10));
            i10++;
        }
        return k.U(number) + i12 + k.W(i12);
    }

    public static <T extends b<T>> u<T> h() {
        return (u<T>) f8635d;
    }

    public static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.k() != s1.c.MESSAGE) {
            return true;
        }
        if (!key.f()) {
            return q(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!q(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean q(Object obj) {
        if (obj instanceof t0) {
            return ((t0) obj).isInitialized();
        }
        if (obj instanceof d0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean r(s1.b bVar, Object obj) {
        a0.a(obj);
        switch (a.f8638a[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof h) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof a0.c)) {
                }
                break;
            case 9:
                if ((obj instanceof s0) || (obj instanceof d0)) {
                }
                break;
        }
        return false;
    }

    public static <T extends b<T>> u<T> w() {
        return new u<>();
    }

    public void a(T t8, Object obj) {
        List list;
        if (!t8.f()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t8, obj);
        Object i10 = i(t8);
        if (i10 == null) {
            list = new ArrayList();
            this.f8636a.s(t8, list);
        } else {
            list = (List) i10;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u<T> clone() {
        u<T> w5 = w();
        int l10 = this.f8636a.l();
        for (int i10 = 0; i10 < l10; i10++) {
            Map.Entry<T, Object> k10 = this.f8636a.k(i10);
            w5.x(k10.getKey(), k10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f8636a.n()) {
            w5.x(entry.getKey(), entry.getValue());
        }
        w5.f8637c = this.f8637c;
        return w5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f8636a.equals(((u) obj).f8636a);
        }
        return false;
    }

    public Iterator<Map.Entry<T, Object>> g() {
        return m() ? Collections.emptyIterator() : this.f8637c ? new d0.c(this.f8636a.i().iterator()) : this.f8636a.i().iterator();
    }

    public int hashCode() {
        return this.f8636a.hashCode();
    }

    public Object i(T t8) {
        Object obj = this.f8636a.get(t8);
        return obj instanceof d0 ? ((d0) obj).f() : obj;
    }

    public int j() {
        int l10 = this.f8636a.l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            i10 += k(this.f8636a.k(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.f8636a.n().iterator();
        while (it.hasNext()) {
            i10 += k(it.next());
        }
        return i10;
    }

    public final int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.k() != s1.c.MESSAGE || key.f() || key.m()) ? f(key, value) : value instanceof d0 ? k.z(entry.getKey().getNumber(), (d0) value) : k.D(entry.getKey().getNumber(), (s0) value);
    }

    public int l() {
        int l10 = this.f8636a.l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            Map.Entry<T, Object> k10 = this.f8636a.k(i11);
            i10 += f(k10.getKey(), k10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f8636a.n()) {
            i10 += f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public boolean m() {
        return this.f8636a.isEmpty();
    }

    public boolean n() {
        return this.b;
    }

    public boolean o() {
        int l10 = this.f8636a.l();
        for (int i10 = 0; i10 < l10; i10++) {
            if (!p(this.f8636a.k(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f8636a.n().iterator();
        while (it.hasNext()) {
            if (!p(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return m() ? Collections.emptyIterator() : this.f8637c ? new d0.c(this.f8636a.entrySet().iterator()) : this.f8636a.entrySet().iterator();
    }

    public void t() {
        if (this.b) {
            return;
        }
        int l10 = this.f8636a.l();
        for (int i10 = 0; i10 < l10; i10++) {
            Map.Entry<T, Object> k10 = this.f8636a.k(i10);
            if (k10.getValue() instanceof y) {
                ((y) k10.getValue()).K();
            }
        }
        this.f8636a.q();
        this.b = true;
    }

    public void u(u<T> uVar) {
        int l10 = uVar.f8636a.l();
        for (int i10 = 0; i10 < l10; i10++) {
            v(uVar.f8636a.k(i10));
        }
        Iterator<Map.Entry<T, Object>> it = uVar.f8636a.n().iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public final void v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof d0;
        if (key.f()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object i10 = i(key);
            if (i10 == null) {
                i10 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) i10).add(c(it.next()));
            }
            this.f8636a.s(key, i10);
            return;
        }
        if (key.k() != s1.c.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f8636a.s(key, c(value));
            return;
        }
        Object i11 = i(key);
        if (i11 == null) {
            this.f8636a.s(key, c(value));
            if (z10) {
                this.f8637c = true;
                return;
            }
            return;
        }
        if (z10) {
            value = ((d0) value).f();
        }
        this.f8636a.s(key, key.i(((s0) i11).a(), (s0) value).build());
    }

    public void x(T t8, Object obj) {
        if (!t8.f()) {
            y(t8, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                y(t8, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof d0) {
            this.f8637c = true;
        }
        this.f8636a.s(t8, obj);
    }

    public final void y(T t8, Object obj) {
        if (!r(t8.g(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t8.getNumber()), t8.g().a(), obj.getClass().getName()));
        }
    }

    public u(boolean z10) {
        this(j1.r());
        t();
    }

    public u(j1<T, Object> j1Var) {
        this.f8636a = j1Var;
        t();
    }
}
