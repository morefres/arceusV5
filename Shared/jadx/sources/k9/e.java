package k9;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import k9.a;
import k9.a.d;
import l9.a0;
import l9.f1;
import l9.j0;
import l9.k;
import l9.o0;
import n9.d;

/* loaded from: classes.dex */
public abstract class e<O extends a.d> implements g<O> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22451a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final k9.a f22452c;

    /* renamed from: d, reason: collision with root package name */
    public final a.d f22453d;

    /* renamed from: e, reason: collision with root package name */
    public final l9.b f22454e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f22455f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22456g;

    /* renamed from: h, reason: collision with root package name */
    public final f f22457h;

    /* renamed from: i, reason: collision with root package name */
    public final l9.s f22458i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final l9.f f22459j;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public static final a f22460c = new C0395a().a();

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final l9.s f22461a;

        @NonNull
        public final Looper b;

        /* renamed from: k9.e$a$a, reason: collision with other inner class name */
        public static class C0395a {

            /* renamed from: a, reason: collision with root package name */
            public l9.s f22462a;
            public Looper b;

            /* JADX WARN: Multi-variable type inference failed */
            @NonNull
            public a a() {
                if (this.f22462a == null) {
                    this.f22462a = new l9.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.f22462a, this.b);
            }

            @NonNull
            public C0395a b(@NonNull l9.s sVar) {
                n9.m.m(sVar, "StatusExceptionMapper must not be null.");
                this.f22462a = sVar;
                return this;
            }
        }

        public a(l9.s sVar, Account account, Looper looper) {
            this.f22461a = sVar;
            this.b = looper;
        }
    }

    public e(@NonNull Activity activity, @NonNull k9.a<O> aVar, @NonNull O o8, @NonNull a aVar2) {
        this(activity, activity, aVar, o8, aVar2);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends a.b> Task<Void> A(@NonNull l9.p<A, ?> pVar) {
        n9.m.l(pVar);
        n9.m.m(pVar.f23356a.b(), "Listener has already been released.");
        n9.m.m(pVar.b.a(), "Listener has already been released.");
        return this.f22459j.y(this, pVar.f23356a, pVar.b, pVar.f23357c);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public Task<Boolean> B(@NonNull k.a<?> aVar, int i10) {
        n9.m.m(aVar, "Listener key cannot be null.");
        return this.f22459j.z(this, aVar, i10);
    }

    @NonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends n, A>> T C(@NonNull T t8) {
        N(1, t8);
        return t8;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> D(@NonNull l9.u<A, TResult> uVar) {
        return O(1, uVar);
    }

    public String E(@NonNull Context context) {
        return null;
    }

    @NonNull
    public O F() {
        return (O) this.f22453d;
    }

    @NonNull
    public Context G() {
        return this.f22451a;
    }

    public String H() {
        return this.b;
    }

    @NonNull
    public Looper I() {
        return this.f22455f;
    }

    @NonNull
    public <L> l9.k<L> J(@NonNull L l10, @NonNull String str) {
        return l9.l.a(l10, this.f22455f, str);
    }

    public final int K() {
        return this.f22456g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f L(Looper looper, j0 j0Var) {
        n9.d a10 = x().a();
        a.f a11 = ((a.AbstractC0393a) n9.m.l(this.f22452c.a())).a(this.f22451a, looper, a10, this.f22453d, j0Var, j0Var);
        String H = H();
        if (H != null && (a11 instanceof n9.c)) {
            ((n9.c) a11).setAttributionTag(H);
        }
        if (H != null && (a11 instanceof l9.m)) {
            ((l9.m) a11).d(H);
        }
        return a11;
    }

    public final f1 M(Context context, Handler handler) {
        return new f1(context, handler, x().a());
    }

    public final com.google.android.gms.common.api.internal.a N(int i10, @NonNull com.google.android.gms.common.api.internal.a aVar) {
        aVar.l();
        this.f22459j.E(this, i10, aVar);
        return aVar;
    }

    public final Task O(int i10, @NonNull l9.u uVar) {
        sb.k kVar = new sb.k();
        this.f22459j.F(this, i10, uVar, kVar, this.f22458i);
        return kVar.a();
    }

    @Override // k9.g
    @NonNull
    public final l9.b<O> u() {
        return this.f22454e;
    }

    @NonNull
    public f w() {
        return this.f22457h;
    }

    @NonNull
    public d.a x() {
        Account H2;
        Set<Scope> set;
        GoogleSignInAccount w22;
        d.a aVar = new d.a();
        a.d dVar = this.f22453d;
        if (!(dVar instanceof a.d.b) || (w22 = ((a.d.b) dVar).w2()) == null) {
            a.d dVar2 = this.f22453d;
            H2 = dVar2 instanceof a.d.InterfaceC0394a ? ((a.d.InterfaceC0394a) dVar2).H2() : null;
        } else {
            H2 = w22.H2();
        }
        aVar.d(H2);
        a.d dVar3 = this.f22453d;
        if (dVar3 instanceof a.d.b) {
            GoogleSignInAccount w23 = ((a.d.b) dVar3).w2();
            set = w23 == null ? Collections.EMPTY_SET : w23.B3();
        } else {
            set = Collections.EMPTY_SET;
        }
        aVar.c(set);
        aVar.e(this.f22451a.getClass().getName());
        aVar.b(this.f22451a.getPackageName());
        return aVar;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> y(@NonNull l9.u<A, TResult> uVar) {
        return O(2, uVar);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> z(@NonNull l9.u<A, TResult> uVar) {
        return O(0, uVar);
    }

    public e(@NonNull Context context, Activity activity, k9.a aVar, a.d dVar, a aVar2) {
        n9.m.m(context, "Null context is not permitted.");
        n9.m.m(aVar, "Api must not be null.");
        n9.m.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) n9.m.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f22451a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : E(context);
        this.b = attributionTag;
        this.f22452c = aVar;
        this.f22453d = dVar;
        this.f22455f = aVar2.b;
        l9.b a10 = l9.b.a(aVar, dVar, attributionTag);
        this.f22454e = a10;
        this.f22457h = new o0(this);
        l9.f v5 = l9.f.v(context2);
        this.f22459j = v5;
        this.f22456g = v5.l();
        this.f22458i = aVar2.f22461a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            a0.u(activity, v5, a10);
        }
        v5.J(this);
    }

    public e(@NonNull Context context, @NonNull k9.a<O> aVar, @NonNull O o8, @NonNull a aVar2) {
        this(context, null, aVar, o8, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull k9.a<O> r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull l9.s r5) {
        /*
            r1 = this;
            k9.e$a$a r0 = new k9.e$a$a
            r0.<init>()
            r0.b(r5)
            k9.e$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.e.<init>(android.content.Context, k9.a, k9.a$d, l9.s):void");
    }
}
