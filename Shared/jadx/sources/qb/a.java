package qb;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import k9.f;
import n9.c;
import n9.m;

/* loaded from: classes.dex */
public class a extends n9.e<f> implements pb.f {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f29618i = 0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29619e;

    /* renamed from: f, reason: collision with root package name */
    public final n9.d f29620f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f29621g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f29622h;

    public a(@NonNull Context context, @NonNull Looper looper, boolean z10, @NonNull n9.d dVar, @NonNull Bundle bundle, @NonNull f.a aVar, @NonNull f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f29619e = true;
        this.f29620f = dVar;
        this.f29621g = bundle;
        this.f29622h = dVar.k();
    }

    @NonNull
    public static Bundle g(@NonNull n9.d dVar) {
        dVar.j();
        Integer k10 = dVar.k();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (k10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", k10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // pb.f
    public final void a() {
        connect(new c.d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pb.f
    public final void c(e eVar) {
        m.m(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c10 = this.f29620f.c();
            ((f) getService()).u2(new zai(1, new zat(c10, ((Integer) m.l(this.f29622h)).intValue(), "<<default account>>".equals(c10.name) ? d9.b.b(getContext()).c() : null)), eVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.F(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // n9.c
    @NonNull
    public final /* synthetic */ IInterface createServiceInterface(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // n9.c
    @NonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f29620f.g())) {
            this.f29621g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f29620f.g());
        }
        return this.f29621g;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return j9.h.f21609a;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // n9.c, k9.a.f
    public final boolean requiresSignIn() {
        return this.f29619e;
    }
}
