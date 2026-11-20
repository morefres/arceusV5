package zl;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import e3.k0;
import e3.l0;
import e3.o0;
import e3.p0;
import e3.r0;
import e3.t0;
import ek.u;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import zl.m;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    public static final String f38095d = "t";

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<e3.o> f38096a;
    public final m b = new m();

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f38097c = Executors.newSingleThreadExecutor();

    public class a implements e3.p<l0, f3.n> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f38098a;
        public final /* synthetic */ String b;

        public a(d dVar, String str) {
            this.f38098a = dVar;
            this.b = str;
        }

        @Override // e3.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull f3.n nVar) {
            Log.e(t.f38095d, "Error getting credentials: ", nVar);
            if (nVar instanceof f3.o) {
                this.f38098a.b(2, nVar.getMessage());
                return;
            }
            if (nVar instanceof f3.l) {
                this.f38098a.b(1, nVar.getMessage());
                return;
            }
            if (nVar instanceof f3.s) {
                this.f38098a.b(6, nVar.getMessage());
            } else if (nVar instanceof f3.r) {
                this.f38098a.b(7, nVar.getMessage());
            } else {
                this.f38098a.b(0, nVar.getMessage());
            }
        }

        @Override // e3.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(l0 l0Var) {
            e3.m credential = l0Var.getCredential();
            if (credential instanceof t0) {
                this.f38098a.a(((t0) credential).getAuthenticationResponseJson(), this.b);
                return;
            }
            if (!(credential instanceof r0)) {
                this.f38098a.b(0, "Unexpected GetCredentialResponse");
                return;
            }
            r0 r0Var = (r0) credential;
            String id2 = r0Var.getId();
            String password = r0Var.getPassword();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("username", id2);
                jSONObject.put("password", password);
                this.f38098a.a(jSONObject.toString(), this.b);
            } catch (JSONException e10) {
                this.f38098a.b(4, e10.getMessage());
            }
        }
    }

    public class b implements e3.p<e3.c, f3.f> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f38100a;

        public b(d dVar) {
            this.f38100a = dVar;
        }

        @Override // e3.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull f3.f fVar) {
            Log.e(t.f38095d, "Error registering credentials ", fVar);
            if (fVar instanceof h3.a) {
                if (((h3.a) fVar).getDomError() instanceof g3.l) {
                    this.f38100a.b(11, fVar.getMessage());
                    return;
                } else {
                    this.f38100a.b(0, fVar.getMessage());
                    return;
                }
            }
            if (fVar instanceof f3.d) {
                this.f38100a.b(1, fVar.getMessage());
                return;
            }
            if (fVar instanceof f3.g) {
                this.f38100a.b(2, fVar.getMessage());
                return;
            }
            Log.w(t.f38095d, "Unexpected exception type " + fVar.getClass().getName());
            this.f38100a.b(0, fVar.getMessage());
        }

        @Override // e3.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(e3.c cVar) {
            if (cVar instanceof e3.j) {
                this.f38100a.a(((e3.j) cVar).getRegistrationResponseJson(), "FIDO2");
            } else if (cVar instanceof e3.h) {
                this.f38100a.a("", "password");
            } else {
                this.f38100a.b(0, "Unexpected CreateCredentialResponse");
            }
        }
    }

    public static class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        public final d f38101a;

        public c(d dVar) {
            this.f38101a = dVar;
        }

        @Override // zl.m.a
        public void a(String str, String str2) {
            this.f38101a.a(str, str2);
        }

        @Override // zl.m.a
        public void b(int i10, String str) {
            this.f38101a.b(i10, str);
        }
    }

    public interface d {
        void a(String str, String str2);

        void b(int i10, String str);
    }

    public void b(Activity activity, JSONObject jSONObject, String str, d dVar) {
        try {
            if (str.equals("keystore")) {
                this.b.m(activity, jSONObject, new c(dVar));
                return;
            }
            e3.b e10 = e(jSONObject, str);
            if (e10 != null) {
                c(activity, e10, dVar, i(activity));
            } else {
                dVar.b(0, "");
            }
        } catch (IllegalArgumentException e11) {
            e = e11;
            dVar.b(3, e.getMessage());
        } catch (JSONException e12) {
            e = e12;
            dVar.b(3, e.getMessage());
        }
    }

    public void c(Activity activity, e3.b bVar, d dVar, e3.o oVar) {
        oVar.a(activity, bVar, new CancellationSignal(), this.f38097c, new b(dVar));
    }

    public void d(Activity activity, JSONObject jSONObject, d dVar) {
        try {
            if (jSONObject.optString("credentialType").equals("keystore")) {
                this.b.t(activity, jSONObject, new c(dVar));
            }
        } catch (Exception e10) {
            dVar.b(0, e10.getMessage());
        }
    }

    public e3.b e(@NonNull JSONObject jSONObject, @NonNull String str) {
        e3.b gVar;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("CredentialType not set!");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("parameters");
        if (str.equals("FIDO2") && n()) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("publicKey");
            gVar = rh.h.a().D0() ? new e3.i(jSONObject3.toString(), null, false, null, false, jSONObject2.optBoolean("isSilentPasskeyUpgrade")) : new e3.i(jSONObject3.toString());
        } else {
            gVar = str.equals("password") ? new e3.g(jSONObject2.getString("username"), jSONObject2.getString("password")) : null;
        }
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Invalid create credential request!");
    }

    public void f(Activity activity, JSONObject jSONObject, d dVar) {
        d dVar2;
        Throwable th2;
        try {
            if (jSONObject.optString("credentialType").equals("keystore")) {
                try {
                    this.b.y(activity, jSONObject, new c(dVar));
                    return;
                } catch (IllegalArgumentException | JSONException e10) {
                    th2 = e10;
                    dVar2 = dVar;
                    dVar2.b(3, th2.getMessage());
                }
            }
            k0 j10 = j(jSONObject);
            try {
                if (j10 != null) {
                    g(activity, j10, h(jSONObject), dVar, i(activity));
                } else {
                    dVar.b(0, "");
                }
            } catch (IllegalArgumentException e11) {
                e = e11;
                th2 = e;
                dVar2.b(3, th2.getMessage());
            } catch (JSONException e12) {
                e = e12;
                th2 = e;
                dVar2.b(3, th2.getMessage());
            }
        } catch (IllegalArgumentException e13) {
            e = e13;
            dVar2 = dVar;
            th2 = e;
            dVar2.b(3, th2.getMessage());
        } catch (JSONException e14) {
            e = e14;
            dVar2 = dVar;
            th2 = e;
            dVar2.b(3, th2.getMessage());
        }
    }

    public void g(Activity activity, k0 k0Var, String str, d dVar, e3.o oVar) {
        oVar.c(activity, k0Var, new CancellationSignal(), this.f38097c, new a(dVar, str));
    }

    public String h(JSONObject jSONObject) {
        return (jSONObject.has("credentialType") || !(jSONObject.has("FIDO2") || jSONObject.has("password"))) ? "FIDO2" : "all";
    }

    public final e3.o i(Activity activity) {
        WeakReference<e3.o> weakReference = this.f38096a;
        if (weakReference == null || weakReference.get() == null) {
            this.f38096a = new WeakReference<>(e3.o.create(activity));
        }
        return this.f38096a.get();
    }

    public k0 j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        o0 o0Var;
        k0.a aVar = new k0.a();
        if (h(jSONObject).equalsIgnoreCase("FIDO2")) {
            jSONObject2 = jSONObject.getJSONObject("parameters");
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("FIDO2");
            if (jSONObject.has("password")) {
                if (rh.h.a().y0()) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("password");
                    String optString = optJSONObject2 == null ? "" : optJSONObject2.optString("username");
                    HashSet hashSet = new HashSet();
                    if (optString.length() > 0) {
                        hashSet.add(optString);
                    }
                    o0Var = new o0(hashSet);
                } else {
                    o0Var = new o0();
                }
                aVar.a(o0Var);
            }
            jSONObject2 = optJSONObject;
        }
        if (jSONObject2 != null && n()) {
            aVar.a(new p0(jSONObject2.getJSONObject("publicKey").toString()));
            if (rh.h.a().t3()) {
                aVar.c(jSONObject2.optBoolean("deviceBoundOnly"));
            }
        }
        return aVar.b();
    }

    public boolean k(@NonNull Context context) {
        return rh.h.a().c2() ? ek.k.a(context) ? Build.VERSION.SDK_INT >= 34 && ek.l.a(context, 263000000) : n() || m() : n() || m();
    }

    public boolean l(Activity activity) {
        return u.a(activity);
    }

    public boolean m() {
        return true;
    }

    public boolean n() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
