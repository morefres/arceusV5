package ya;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import k9.a;
import k9.e;

/* loaded from: classes.dex */
public final class o extends k9.e implements z8.c {

    /* renamed from: l, reason: collision with root package name */
    public static final a.g f36561l;

    /* renamed from: m, reason: collision with root package name */
    public static final a.AbstractC0393a f36562m;

    /* renamed from: n, reason: collision with root package name */
    public static final k9.a f36563n;

    /* renamed from: k, reason: collision with root package name */
    public final String f36564k;

    static {
        a.g gVar = new a.g();
        f36561l = gVar;
        j jVar = new j();
        f36562m = jVar;
        f36563n = new k9.a("Auth.Api.Identity.SignIn.API", jVar, gVar);
    }

    public o(@NonNull Context context, @NonNull z8.l lVar) {
        super(context, (k9.a<z8.l>) f36563n, lVar, e.a.f22460c);
        this.f36564k = r.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void P(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, p pVar, sb.k kVar) {
        ((h0) pVar.getService()).u2(new n(this, kVar), getPhoneNumberHintIntentRequest, this.f36564k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void Q(p pVar, sb.k kVar) {
        ((h0) pVar.getService()).w2(new l(this, kVar), this.f36564k);
    }

    @Override // z8.c
    public final Task<PendingIntent> b(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        n9.m.l(getSignInIntentRequest);
        GetSignInIntentRequest.a A3 = GetSignInIntentRequest.A3(getSignInIntentRequest);
        A3.f(this.f36564k);
        final GetSignInIntentRequest a10 = A3.a();
        return z(l9.u.c().d(q.f36570f).b(new l9.q() { // from class: ya.i
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h0) ((p) obj).getService()).v2(new m(o.this, (sb.k) obj2), (GetSignInIntentRequest) n9.m.l(a10));
            }
        }).e(1555).a());
    }

    @Override // z8.c
    public final SignInCredential d(Intent intent) {
        if (intent == null) {
            throw new k9.b(Status.f5768m);
        }
        Status status = (Status) o9.c.b(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
        if (status == null) {
            throw new k9.b(Status.f5770o);
        }
        if (!status.A3()) {
            throw new k9.b(status);
        }
        SignInCredential signInCredential = (SignInCredential) o9.c.b(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new k9.b(Status.f5768m);
    }

    @Override // z8.c
    public final String o(Intent intent) {
        if (intent == null) {
            throw new k9.b(Status.f5768m);
        }
        Status status = (Status) o9.c.b(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
        if (status == null) {
            throw new k9.b(Status.f5770o);
        }
        if (!status.A3()) {
            throw new k9.b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new k9.b(Status.f5768m);
    }

    @Override // z8.c
    public final Task<PendingIntent> q(@NonNull final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        n9.m.l(getPhoneNumberHintIntentRequest);
        return z(l9.u.c().d(q.f36572h).b(new l9.q() { // from class: ya.f
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                o.this.P(getPhoneNumberHintIntentRequest, (p) obj, (sb.k) obj2);
            }
        }).e(1653).a());
    }

    @Override // z8.c
    public final Task<Void> r() {
        G().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<k9.f> it = k9.f.b().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        l9.f.a();
        return D(l9.u.c().d(q.b).b(new l9.q() { // from class: ya.g
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                o.this.Q((p) obj, (sb.k) obj2);
            }
        }).c(false).e(1554).a());
    }

    @Override // z8.c
    public final Task<BeginSignInResult> t(@NonNull BeginSignInRequest beginSignInRequest) {
        n9.m.l(beginSignInRequest);
        BeginSignInRequest.a C3 = BeginSignInRequest.C3(beginSignInRequest);
        C3.h(this.f36564k);
        final BeginSignInRequest a10 = C3.a();
        return z(l9.u.c().d(new Feature("auth_api_credentials_begin_sign_in", 8L)).b(new l9.q() { // from class: ya.h
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h0) ((p) obj).getService()).t2(new k(o.this, (sb.k) obj2), (BeginSignInRequest) n9.m.l(a10));
            }
        }).c(false).e(1553).a());
    }
}
