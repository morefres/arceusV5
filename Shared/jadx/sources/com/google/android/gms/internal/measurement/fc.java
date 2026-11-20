package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class fc implements ad {
    public static final mc b = new dc();

    /* renamed from: a, reason: collision with root package name */
    public final mc f6492a;

    public fc() {
        bb c10 = bb.c();
        wc wcVar = wc.f6918c;
        ec ecVar = new ec(c10, b);
        Charset charset = qb.f6799a;
        this.f6492a = ecVar;
    }

    @Override // com.google.android.gms.internal.measurement.ad
    public final zc a(Class cls) {
        ld ldVar = bd.f6438a;
        if (!gb.class.isAssignableFrom(cls)) {
            wc wcVar = wc.f6918c;
        }
        lc b10 = this.f6492a.b(cls);
        if (b10.zza()) {
            wc wcVar2 = wc.f6918c;
            return sc.g(bd.a(), ua.a(), b10.zzb());
        }
        wc wcVar3 = wc.f6918c;
        return rc.y(cls, b10, uc.a(), ac.a(), bd.a(), b10.zzc() + (-1) != 1 ? ua.a() : null, kc.a());
    }
}
