package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzom;
import java.util.Map;

/* loaded from: classes.dex */
public final class pe {

    /* renamed from: a, reason: collision with root package name */
    public final long f26568a;
    public final com.google.android.gms.internal.measurement.y6 b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26569c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f26570d;

    /* renamed from: e, reason: collision with root package name */
    public final za f26571e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26572f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26573g;

    /* renamed from: h, reason: collision with root package name */
    public final long f26574h;

    /* renamed from: i, reason: collision with root package name */
    public final int f26575i;

    public /* synthetic */ pe(long j10, com.google.android.gms.internal.measurement.y6 y6Var, String str, Map map, za zaVar, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f26568a = j10;
        this.b = y6Var;
        this.f26569c = str;
        this.f26570d = map;
        this.f26571e = zaVar;
        this.f26572f = j11;
        this.f26573g = j12;
        this.f26574h = j13;
        this.f26575i = i10;
    }

    public final yd a() {
        return new yd(this.f26569c, this.f26570d, this.f26571e, null);
    }

    public final zzom b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f26570d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f26568a;
        com.google.android.gms.internal.measurement.y6 y6Var = this.b;
        String str = this.f26569c;
        za zaVar = this.f26571e;
        return new zzom(j10, y6Var.d(), str, bundle, zaVar.zza(), this.f26573g, "");
    }

    public final long c() {
        return this.f26568a;
    }

    public final com.google.android.gms.internal.measurement.y6 d() {
        return this.b;
    }

    public final String e() {
        return this.f26569c;
    }

    public final za f() {
        return this.f26571e;
    }

    public final long g() {
        return this.f26572f;
    }

    public final long h() {
        return this.f26574h;
    }

    public final int i() {
        return this.f26575i;
    }
}
