package ve;

import af.h0;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import df.p;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import pe.j;
import pe.o;
import pe.q;
import pe.s;
import pe.v;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f33390d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final String f33391e = "a";

    /* renamed from: a, reason: collision with root package name */
    public final s f33392a;
    public final pe.a b;

    /* renamed from: c, reason: collision with root package name */
    public q f33393c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Context f33394a = null;
        public String b = null;

        /* renamed from: c, reason: collision with root package name */
        public String f33395c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f33396d = null;

        /* renamed from: e, reason: collision with root package name */
        public pe.a f33397e = null;

        /* renamed from: f, reason: collision with root package name */
        public boolean f33398f = true;

        /* renamed from: g, reason: collision with root package name */
        public o f33399g = null;

        /* renamed from: h, reason: collision with root package name */
        public h0 f33400h = null;

        /* renamed from: i, reason: collision with root package name */
        public q f33401i;

        public static byte[] h(Context context, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return p.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public synchronized a f() {
            a aVar;
            try {
                if (this.b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                h0 h0Var = this.f33400h;
                if (h0Var != null && this.f33399g == null) {
                    this.f33399g = o.a(pe.h0.a(h0Var.n()));
                }
                synchronized (a.f33390d) {
                    try {
                        byte[] h10 = h(this.f33394a, this.b, this.f33395c);
                        if (h10 == null) {
                            if (this.f33396d != null) {
                                this.f33397e = k();
                            }
                            this.f33401i = g();
                        } else {
                            if (this.f33396d != null && a.f()) {
                                this.f33401i = j(h10);
                            }
                            this.f33401i = i(h10);
                        }
                        aVar = new a(this);
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return aVar;
        }

        public final q g() {
            o oVar = this.f33399g;
            if (oVar == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            pe.p k10 = pe.p.k(oVar);
            a.g(k10, new e(this.f33394a, this.b, this.f33395c), this.f33397e);
            return q.b(k10);
        }

        public final q i(byte[] bArr) {
            return q.b(v.b(pe.b.b(bArr), j.a()));
        }

        public final q j(byte[] bArr) {
            try {
                this.f33397e = new d().b(this.f33396d);
                try {
                    return q.b(v.a(pe.b.b(bArr), this.f33397e, new byte[0]));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    q i10 = i(bArr);
                    Log.w(a.f33391e, "cannot use Android Keystore, it'll be disabled", e11);
                    return i10;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        public final pe.a k() {
            if (!a.f()) {
                Log.w(a.f33391e, "Android Keystore requires at least Android M");
                return null;
            }
            d dVar = new d();
            try {
                boolean d10 = d.d(this.f33396d);
                try {
                    return dVar.b(this.f33396d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!d10) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f33396d), e10);
                    }
                    Log.w(a.f33391e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(a.f33391e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public b l(o oVar) {
            this.f33399g = oVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f33398f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f33396d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f33394a = context;
            this.b = str;
            this.f33395c = str2;
            return this;
        }
    }

    public static boolean f() {
        return true;
    }

    public static void g(pe.p pVar, s sVar, pe.a aVar) {
        try {
            if (aVar != null) {
                v.c(pVar, sVar, aVar, new byte[0]);
            } else {
                v.d(pVar, sVar, j.a());
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public synchronized pe.p e() {
        return this.f33393c.a();
    }

    public a(b bVar) {
        this.f33392a = new e(bVar.f33394a, bVar.b, bVar.f33395c);
        this.b = bVar.f33397e;
        this.f33393c = bVar.f33401i;
    }
}
