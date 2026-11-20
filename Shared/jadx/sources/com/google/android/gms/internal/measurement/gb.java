package com.google.android.gms.internal.measurement;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.internal.measurement.cb;
import com.google.android.gms.internal.measurement.gb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class gb<MessageType extends gb<MessageType, BuilderType>, BuilderType extends cb<MessageType, BuilderType>> extends r9<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected md zzc = md.a();

    public static pb A() {
        return xc.b();
    }

    public static pb B(pb pbVar) {
        int size = pbVar.size();
        return pbVar.w(size + size);
    }

    public static final boolean D(gb gbVar, boolean z10) {
        byte byteValue = ((Byte) gbVar.E(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean a10 = wc.a().b(gbVar.getClass()).a(gbVar);
        if (z10) {
            gbVar.E(2, true != a10 ? null : gbVar, null);
        }
        return a10;
    }

    public static gb t(Class cls) {
        Map map = zzd;
        gb gbVar = (gb) map.get(cls);
        if (gbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                gbVar = (gb) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (gbVar != null) {
            return gbVar;
        }
        gb gbVar2 = (gb) ((gb) sd.h(cls)).E(6, null, null);
        if (gbVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, gbVar2);
        return gbVar2;
    }

    public static void u(Class cls, gb gbVar) {
        gbVar.l();
        zzd.put(cls, gbVar);
    }

    public static Object v(oc ocVar, String str, Object[] objArr) {
        return new yc(ocVar, str, objArr);
    }

    public static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static nb x() {
        return hb.b();
    }

    public static ob y() {
        return cc.b();
    }

    public static ob z(ob obVar) {
        int size = obVar.size();
        return obVar.w(size + size);
    }

    public abstract Object E(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.oc
    public final int a() {
        if (k()) {
            int j10 = j(null);
            if (j10 >= 0) {
                return j10;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(j10);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int j11 = j(null);
        if (j11 >= 0) {
            this.zzb = (this.zzb & EditorInfoCompat.IME_FLAG_FORCE_ASCII) | j11;
            return j11;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(j11);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.oc
    public final void c(ma maVar) {
        wc.a().b(getClass()).e(this, na.M(maVar));
    }

    @Override // com.google.android.gms.internal.measurement.oc
    public final /* synthetic */ nc e() {
        return (cb) E(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return wc.a().b(getClass()).f(this, (gb) obj);
    }

    @Override // com.google.android.gms.internal.measurement.pc
    public final boolean f() {
        return D(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.r9
    public final int g(zc zcVar) {
        if (k()) {
            int zze = zcVar.zze(this);
            if (zze >= 0) {
                return zze;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(zze).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(zze);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zze2 = zcVar.zze(this);
        if (zze2 >= 0) {
            this.zzb = (this.zzb & EditorInfoCompat.IME_FLAG_FORCE_ASCII) | zze2;
            return zze2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(zze2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(zze2);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.pc
    public final /* synthetic */ oc h() {
        return (gb) E(6, null, null);
    }

    public final int hashCode() {
        if (k()) {
            return o();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int o8 = o();
        this.zza = o8;
        return o8;
    }

    public final int j(zc zcVar) {
        return wc.a().b(getClass()).zze(this);
    }

    public final boolean k() {
        return (this.zzb & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0;
    }

    public final void l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final gb n() {
        return (gb) E(4, null, null);
    }

    public final int o() {
        return wc.a().b(getClass()).zzc(this);
    }

    public final void p() {
        wc.a().b(getClass()).c(this);
        l();
    }

    public final cb q() {
        return (cb) E(5, null, null);
    }

    public final cb r() {
        cb cbVar = (cb) E(5, null, null);
        cbVar.v(this);
        return cbVar;
    }

    public final void s(int i10) {
        this.zzb = (this.zzb & EditorInfoCompat.IME_FLAG_FORCE_ASCII) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return qc.a(this, super.toString());
    }
}
