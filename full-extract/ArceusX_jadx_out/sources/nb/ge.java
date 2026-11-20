package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ge implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26268a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f26269c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ he f26270d;

    public ge(he heVar, String str, String str2, Bundle bundle) {
        this.f26268a = str;
        this.b = str2;
        this.f26269c = bundle;
        Objects.requireNonNull(heVar);
        this.f26270d = heVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        me meVar = this.f26270d.f26289a;
        ve N0 = meVar.N0();
        long a10 = meVar.e().a();
        String str = this.f26268a;
        meVar.i((zzbg) n9.m.l(N0.R(str, this.b, this.f26269c, "auto", a10, false, true)), str);
    }
}
