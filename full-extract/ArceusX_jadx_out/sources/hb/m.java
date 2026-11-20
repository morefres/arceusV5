package hb;

import android.content.Context;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzl;
import java.util.HashMap;
import java.util.Map;
import l9.k;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final r<f> f19192a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19193c = false;

    /* renamed from: d, reason: collision with root package name */
    public final Map<k.a<lb.e>, l> f19194d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Map<k.a, j> f19195e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Map<k.a<lb.d>, i> f19196f = new HashMap();

    public m(Context context, r<f> rVar) {
        this.b = context;
        this.f19192a = rVar;
    }

    public final void a(boolean z10) {
        ((u) this.f19192a).f19199a.checkConnected();
        ((u) this.f19192a).a().q2(z10);
        this.f19193c = z10;
    }

    public final void b() {
        synchronized (this.f19194d) {
            try {
                for (l lVar : this.f19194d.values()) {
                    if (lVar != null) {
                        ((u) this.f19192a).a().w(zzbc.a(lVar, null));
                    }
                }
                this.f19194d.clear();
            } finally {
            }
        }
        synchronized (this.f19196f) {
            try {
                for (i iVar : this.f19196f.values()) {
                    if (iVar != null) {
                        ((u) this.f19192a).a().w(zzbc.v3(iVar, null));
                    }
                }
                this.f19196f.clear();
            } finally {
            }
        }
        synchronized (this.f19195e) {
            try {
                for (j jVar : this.f19195e.values()) {
                    if (jVar != null) {
                        ((u) this.f19192a).a().U(new zzl(2, null, jVar, null));
                    }
                }
                this.f19195e.clear();
            } finally {
            }
        }
    }

    public final void c() {
        if (this.f19193c) {
            a(false);
        }
    }
}
