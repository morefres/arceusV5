package nb;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k5 extends b5 {

    /* renamed from: c, reason: collision with root package name */
    public String f26356c;

    /* renamed from: d, reason: collision with root package name */
    public String f26357d;

    /* renamed from: e, reason: collision with root package name */
    public int f26358e;

    /* renamed from: f, reason: collision with root package name */
    public String f26359f;

    /* renamed from: g, reason: collision with root package name */
    public String f26360g;

    /* renamed from: h, reason: collision with root package name */
    public long f26361h;

    /* renamed from: i, reason: collision with root package name */
    public final long f26362i;

    /* renamed from: j, reason: collision with root package name */
    public final long f26363j;

    /* renamed from: k, reason: collision with root package name */
    public List f26364k;

    /* renamed from: l, reason: collision with root package name */
    public String f26365l;

    /* renamed from: m, reason: collision with root package name */
    public int f26366m;

    /* renamed from: n, reason: collision with root package name */
    public String f26367n;

    /* renamed from: o, reason: collision with root package name */
    public String f26368o;

    /* renamed from: p, reason: collision with root package name */
    public long f26369p;

    /* renamed from: q, reason: collision with root package name */
    public String f26370q;

    public k5(g7 g7Var, long j10, long j11) {
        super(g7Var);
        this.f26369p = 0L;
        this.f26370q = null;
        this.f26362i = j10;
        this.f26363j = j11;
    }

    @Override // nb.b5
    public final boolean m() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(1:3)(6:59|60|(1:62)(2:77|(1:79))|63|64|(16:66|(1:68)(1:75)|69|70|5|(2:7|(2:9|(2:11|(2:13|(2:15|(2:17|(1:19)(1:52))(1:53))(1:54))(1:55))(1:56))(1:57))(1:58)|20|21|22|(1:24)(1:49)|25|(1:27)|29|(3:31|(1:33)(3:40|(3:43|(1:45)(1:46)|41)|47)|(2:35|36)(2:38|39))|48|(0)(0)))|4|5|(0)(0)|20|21|22|(0)(0)|25|(0)|29|(0)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019a, code lost:
    
        r11.f26328a.a().o().c("Fetching Google App Id failed with exception. appId", nb.w5.x(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:22:0x016d, B:25:0x0183, B:27:0x0187), top: B:21:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c7  */
    @Override // nb.b5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.k5.n():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.zzr, still in use, count: 2, list:
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x018d: MOVE (r21v1 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0188: MOVE (r21v4 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final com.google.android.gms.measurement.internal.zzr o(java.lang.String r45) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.k5.o(java.lang.String):com.google.android.gms.measurement.internal.zzr");
    }

    public final void p() {
        String format;
        h();
        g7 g7Var = this.f26328a;
        if (g7Var.x().w().o(p8.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            g7Var.C().q0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            g7Var.a().v().a("Analytics Storage consent is not granted");
            format = null;
        }
        g7Var.a().v().a(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.f26368o = format;
        this.f26369p = g7Var.e().a();
    }

    public final String q() {
        j();
        n9.m.l(this.f26356c);
        return this.f26356c;
    }

    public final String r() {
        h();
        j();
        n9.m.l(this.f26367n);
        return this.f26367n;
    }

    public final String s() {
        j();
        n9.m.l(this.f26360g);
        return this.f26360g;
    }

    public final int t() {
        j();
        return this.f26358e;
    }

    public final long u() {
        return this.f26363j;
    }

    public final int v() {
        j();
        return this.f26366m;
    }

    public final List w() {
        return this.f26364k;
    }

    public final boolean x(String str) {
        String str2 = this.f26370q;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.f26370q = str;
        return z10;
    }
}
