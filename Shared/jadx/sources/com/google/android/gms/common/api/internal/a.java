package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import k9.a;
import k9.a.b;
import k9.f;
import k9.n;
import l9.d;
import n9.m;

/* loaded from: classes.dex */
public abstract class a<R extends n, A extends a.b> extends BasePendingResult<R> implements d<R> {

    /* renamed from: o, reason: collision with root package name */
    public final a.c<A> f5790o;

    /* renamed from: p, reason: collision with root package name */
    public final k9.a<?> f5791p;

    public a(@NonNull k9.a<?> aVar, @NonNull f fVar) {
        super((f) m.m(fVar, "GoogleApiClient must not be null"));
        m.m(aVar, "Api must not be null");
        this.f5790o = aVar.b();
        this.f5791p = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l9.d
    public /* bridge */ /* synthetic */ void a(@NonNull Object obj) {
        super.h((n) obj);
    }

    @Override // l9.d
    public final void b(@NonNull Status status) {
        m.b(!status.A3(), "Failed result must not be success");
        R e10 = e(status);
        h(e10);
        o(e10);
    }

    public abstract void n(@NonNull A a10);

    public void o(@NonNull R r8) {
    }

    public final void p(@NonNull A a10) {
        try {
            n(a10);
        } catch (DeadObjectException e10) {
            q(e10);
            throw e10;
        } catch (RemoteException e11) {
            q(e11);
        }
    }

    public final void q(@NonNull RemoteException remoteException) {
        b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }
}
