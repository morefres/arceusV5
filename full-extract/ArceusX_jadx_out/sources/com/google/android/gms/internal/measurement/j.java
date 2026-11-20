package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Double f6593a;

    public j(Double d10) {
        if (d10 == null) {
            this.f6593a = Double.valueOf(Double.NaN);
        } else {
            this.f6593a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q a() {
        return new j(this.f6593a);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, u4 u4Var, List list) {
        if ("toString".equals(str)) {
            return new u(zzc());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzc(), str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f6593a.equals(((j) obj).f6593a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6593a.hashCode();
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        Double d10 = this.f6593a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal a10 = i.a(BigDecimal.valueOf(d10.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((a10.scale() > 0 ? a10.precision() : a10.scale()) - 1);
        String format = decimalFormat.format(a10);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : a10.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double zzd() {
        return this.f6593a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean zze() {
        Double d10 = this.f6593a;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator zzf() {
        return null;
    }
}
