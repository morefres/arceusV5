package nb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26401a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f26402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc f26405f;

    public kb(tc tcVar, String str, String str2, zzr zzrVar, boolean z10, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26401a = str;
        this.b = str2;
        this.f26402c = zzrVar;
        this.f26403d = z10;
        this.f26404e = x1Var;
        Objects.requireNonNull(tcVar);
        this.f26405f = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            tc tcVar = this.f26405f;
            d5 N = tcVar.N();
            if (N == null) {
                g7 g7Var = tcVar.f26328a;
                g7Var.a().o().c("Failed to get user properties; not connected to service", this.f26401a, this.b);
                g7Var.C().f0(this.f26404e, bundle2);
                return;
            }
            zzr zzrVar = this.f26402c;
            n9.m.l(zzrVar);
            List<zzpl> Y1 = N.Y1(this.f26401a, this.b, this.f26403d, zzrVar);
            String[] strArr = ve.f26743i;
            bundle = new Bundle();
            if (Y1 != null) {
                for (zzpl zzplVar : Y1) {
                    String str = zzplVar.f7491j;
                    if (str != null) {
                        bundle.putString(zzplVar.f7488g, str);
                    } else {
                        Long l10 = zzplVar.f7490i;
                        if (l10 != null) {
                            bundle.putLong(zzplVar.f7488g, l10.longValue());
                        } else {
                            Double d10 = zzplVar.f7493l;
                            if (d10 != null) {
                                bundle.putDouble(zzplVar.f7488g, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    tcVar.J();
                    g7 g7Var2 = tcVar.f26328a;
                    g7Var2.C().f0(this.f26404e, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f26405f.f26328a.a().o().c("Failed to get user properties; remote exception", this.f26401a, e10);
                    tc tcVar2 = this.f26405f;
                    tcVar2.f26328a.C().f0(this.f26404e, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                tc tcVar3 = this.f26405f;
                tcVar3.f26328a.C().f0(this.f26404e, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            tc tcVar32 = this.f26405f;
            tcVar32.f26328a.C().f0(this.f26404e, bundle2);
            throw th;
        }
    }
}
