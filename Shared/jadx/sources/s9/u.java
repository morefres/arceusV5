package s9;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k9.a;
import k9.e;
import l9.p;
import l9.u;

/* loaded from: classes.dex */
public final class u extends k9.e implements r9.c {

    /* renamed from: k, reason: collision with root package name */
    public static final a.g f30986k;

    /* renamed from: l, reason: collision with root package name */
    public static final a.AbstractC0393a f30987l;

    /* renamed from: m, reason: collision with root package name */
    public static final k9.a f30988m;

    static {
        a.g gVar = new a.g();
        f30986k = gVar;
        p pVar = new p();
        f30987l = pVar;
        f30988m = new k9.a("ModuleInstall.API", pVar, gVar);
    }

    public u(Context context) {
        super(context, (k9.a<a.d.c>) f30988m, a.d.Ko, e.a.f22460c);
    }

    public static final ApiFeatureRequest P(boolean z10, k9.h... hVarArr) {
        n9.m.m(hVarArr, "Requested APIs must not be null.");
        n9.m.b(hVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (k9.h hVar : hVarArr) {
            n9.m.m(hVar, "Requested API must not be null.");
        }
        return ApiFeatureRequest.w3(Arrays.asList(hVarArr), z10);
    }

    @Override // r9.c
    public final Task<ModuleInstallResponse> a(r9.d dVar) {
        final ApiFeatureRequest a10 = ApiFeatureRequest.a(dVar);
        final r9.a b = dVar.b();
        Executor c10 = dVar.c();
        if (a10.v3().isEmpty()) {
            return sb.m.f(new ModuleInstallResponse(0));
        }
        if (b == null) {
            u.a c11 = l9.u.c();
            c11.d(bb.k.f3949a);
            c11.c(true);
            c11.e(27304);
            c11.b(new l9.q() { // from class: s9.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // l9.q
                public final void accept(Object obj, Object obj2) {
                    ((h) ((v) obj).getService()).v2(new r(u.this, (sb.k) obj2), a10, null);
                }
            });
            return z(c11.a());
        }
        n9.m.l(b);
        l9.k J = c10 == null ? J(b, r9.a.class.getSimpleName()) : l9.l.b(b, c10, r9.a.class.getSimpleName());
        final c cVar = new c(J);
        final AtomicReference atomicReference = new AtomicReference();
        l9.q qVar = new l9.q() { // from class: s9.k
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((v) obj).getService()).v2(new s(u.this, atomicReference, (sb.k) obj2, b), a10, cVar);
            }
        };
        l9.q qVar2 = new l9.q() { // from class: s9.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((v) obj).getService()).w2(new t(u.this, (sb.k) obj2), cVar);
            }
        };
        p.a a11 = l9.p.a();
        a11.g(J);
        a11.d(bb.k.f3949a);
        a11.c(true);
        a11.b(qVar);
        a11.f(qVar2);
        a11.e(27305);
        return A(a11.a()).o(new sb.j() { // from class: s9.m
            @Override // sb.j
            public final Task then(Object obj) {
                a.g gVar = u.f30986k;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? sb.m.f((ModuleInstallResponse) atomicReference2.get()) : sb.m.e(new k9.b(Status.f5768m));
            }
        });
    }

    @Override // r9.c
    public final Task<ModuleAvailabilityResponse> n(k9.h... hVarArr) {
        final ApiFeatureRequest P = P(false, hVarArr);
        if (P.v3().isEmpty()) {
            return sb.m.f(new ModuleAvailabilityResponse(true, 0));
        }
        u.a c10 = l9.u.c();
        c10.d(bb.k.f3949a);
        c10.e(27301);
        c10.c(false);
        c10.b(new l9.q() { // from class: s9.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((v) obj).getService()).u2(new q(u.this, (sb.k) obj2), P);
            }
        });
        return z(c10.a());
    }
}
