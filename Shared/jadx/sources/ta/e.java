package ta;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.google.android.gms.tasks.Task;
import k9.a;
import k9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l9.n;
import l9.q;
import l9.u;
import l9.v;
import org.jetbrains.annotations.NotNull;
import sa.o;
import sb.k;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$B%\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\r\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\r\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001dJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001d¨\u0006%"}, d2 = {"Lta/e;", "Lk9/e;", "Lk9/a$d$c;", "Lsa/o;", "Landroid/content/Context;", "context", "Lk9/a$a;", "Lta/d;", "clientBuilder", "<init>", "(Landroid/content/Context;Lk9/a$a;)V", "(Landroid/content/Context;)V", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "request", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;", "k", "(Lcom/google/android/gms/identitycredentials/GetCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;", "l", "(Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;", "Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;", "s", "(Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;)Lcom/google/android/gms/tasks/Task;", "", "Lcom/google/android/gms/identitycredentials/ClearExportResponse;", "clearExport", "(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;", "exportCredentialsToDeviceSetup", "Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupResponse;", "importCredentialsForDeviceSetup", "Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;", "getCredentialTransferCapabilities", j6.b.f21518e, "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends k9.e<a.d.c> implements o {

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a.g<ta.d> f32079l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f32080m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final k9.a<a.d.c> f32081n;

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J?\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"ta/e$a", "Lk9/a$a;", "Lta/d;", "Lk9/a$d$c;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Ln9/d;", "commonSettings", "apiOptions", "Ll9/e;", "connectedListener", "Ll9/n;", "connectionFailedListener", "c", "(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Lk9/a$d$c;Ll9/e;Ll9/n;)Lta/d;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends a.AbstractC0393a<ta.d, a.d.c> {
        @Override // k9.a.AbstractC0393a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ta.d b(Context context, Looper looper, n9.d commonSettings, a.d.c apiOptions, l9.e connectedListener, n connectionFailedListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(commonSettings, "commonSettings");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(connectedListener, "connectedListener");
            Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
            return new ta.d(context, looper, commonSettings, connectedListener, connectionFailedListener);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ta/e$c", "Lta/c;", "Lcom/google/android/gms/common/api/Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;", "result", "", "S0", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends ta.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<CreateCredentialHandle> f32082a;

        public c(k<CreateCredentialHandle> kVar) {
            this.f32082a = kVar;
        }

        @Override // ta.c, ta.a
        public void S0(Status status, CreateCredentialHandle result) {
            Intrinsics.checkNotNullParameter(status, "status");
            v.a(status, result, this.f32082a);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ta/e$d", "Lta/c;", "Lcom/google/android/gms/common/api/Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;", "result", "", "G1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends ta.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<PendingGetCredentialHandle> f32083a;

        public d(k<PendingGetCredentialHandle> kVar) {
            this.f32083a = kVar;
        }

        @Override // ta.c, ta.a
        public void G1(Status status, PendingGetCredentialHandle result) {
            Intrinsics.checkNotNullParameter(status, "status");
            v.a(status, result, this.f32083a);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ta/e$e", "Lta/c;", "Lcom/google/android/gms/common/api/Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;", "result", "", "b1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ta.e$e, reason: collision with other inner class name */
    public static final class BinderC0577e extends ta.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k<SignalCredentialStateResponse> f32084a;

        public BinderC0577e(k<SignalCredentialStateResponse> kVar) {
            this.f32084a = kVar;
        }

        @Override // ta.c, ta.a
        public void b1(Status status, SignalCredentialStateResponse result) {
            Intrinsics.checkNotNullParameter(status, "status");
            v.a(status, result, this.f32084a);
        }
    }

    static {
        a.g<ta.d> gVar = new a.g<>();
        f32079l = gVar;
        a aVar = new a();
        f32080m = aVar;
        f32081n = new k9.a<>("IdentityCredentials.API", aVar, gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NonNull Context context) {
        super(context, f32081n, a.d.Ko, e.a.f22460c);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void P(CreateCredentialRequest createCredentialRequest, ta.d dVar, k kVar) {
        ((b) dVar.getService()).x(new c(kVar), createCredentialRequest, gb.g.a(dVar.getContext()));
    }

    public static final void Q(GetCredentialRequest getCredentialRequest, ta.d dVar, k kVar) {
        ((b) dVar.getService()).Z1(new d(kVar), getCredentialRequest, gb.g.a(dVar.getContext()));
    }

    public static final void R(SignalCredentialStateRequest signalCredentialStateRequest, ta.d dVar, k kVar) {
        ((b) dVar.getService()).m2(new BinderC0577e(kVar), signalCredentialStateRequest, gb.g.a(dVar.getContext()));
    }

    @Override // sa.o
    @NotNull
    public Task<PendingGetCredentialHandle> k(@NonNull final GetCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task z10 = z(u.c().d(gb.d.f18435a).b(new q() { // from class: ta.h
            @Override // l9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                e.Q(GetCredentialRequest.this, (d) obj, (k) obj2);
            }
        }).e(32701).a());
        Intrinsics.checkNotNullExpressionValue(z10, "doRead(...)");
        return z10;
    }

    @Override // sa.o
    @NotNull
    public Task<CreateCredentialHandle> l(@NonNull final CreateCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task D = D(u.c().d(gb.d.f18439f).b(new q() { // from class: ta.f
            @Override // l9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                e.P(CreateCredentialRequest.this, (d) obj, (k) obj2);
            }
        }).e(32704).a());
        Intrinsics.checkNotNullExpressionValue(D, "doWrite(...)");
        return D;
    }

    @Override // sa.o
    @NotNull
    public Task<SignalCredentialStateResponse> s(@NonNull final SignalCredentialStateRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Task D = D(u.c().d(gb.d.f18443j).b(new q() { // from class: ta.g
            @Override // l9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                e.R(SignalCredentialStateRequest.this, (d) obj, (k) obj2);
            }
        }).e(32709).a());
        Intrinsics.checkNotNullExpressionValue(D, "doWrite(...)");
        return D;
    }
}
