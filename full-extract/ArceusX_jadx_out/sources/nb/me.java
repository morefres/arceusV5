package nb;

import android.app.BroadcastOptions;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.vf;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.mlkit.common.MlKitException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class me implements l8 {
    public static volatile me K;
    public long A;
    public final Map B;
    public final Map C;
    public final Map D;
    public bb F;
    public String G;
    public w H;
    public long I;

    /* renamed from: a, reason: collision with root package name */
    public final x6 f26456a;
    public final b6 b;

    /* renamed from: c, reason: collision with root package name */
    public t f26457c;

    /* renamed from: d, reason: collision with root package name */
    public e6 f26458d;

    /* renamed from: e, reason: collision with root package name */
    public sd f26459e;

    /* renamed from: f, reason: collision with root package name */
    public e f26460f;

    /* renamed from: g, reason: collision with root package name */
    public final re f26461g;

    /* renamed from: h, reason: collision with root package name */
    public wa f26462h;

    /* renamed from: i, reason: collision with root package name */
    public vc f26463i;

    /* renamed from: j, reason: collision with root package name */
    public final zd f26464j;

    /* renamed from: k, reason: collision with root package name */
    public n6 f26465k;

    /* renamed from: l, reason: collision with root package name */
    public final g7 f26466l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26468n;

    /* renamed from: o, reason: collision with root package name */
    public long f26469o;

    /* renamed from: p, reason: collision with root package name */
    public List f26470p;

    /* renamed from: r, reason: collision with root package name */
    public int f26472r;

    /* renamed from: s, reason: collision with root package name */
    public int f26473s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f26474t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26475u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f26476v;

    /* renamed from: w, reason: collision with root package name */
    public FileLock f26477w;

    /* renamed from: x, reason: collision with root package name */
    public FileChannel f26478x;

    /* renamed from: y, reason: collision with root package name */
    public List f26479y;

    /* renamed from: z, reason: collision with root package name */
    public List f26480z;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f26467m = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public final Deque f26471q = new LinkedList();
    public final Map E = new HashMap();
    public final ue J = new he(this);

    public me(ne neVar, g7 g7Var) {
        n9.m.l(neVar);
        this.f26466l = g7.O(neVar.f26509a, null, null);
        this.A = -1L;
        this.f26464j = new zd(this);
        re reVar = new re(this);
        reVar.k();
        this.f26461g = reVar;
        b6 b6Var = new b6(this);
        b6Var.k();
        this.b = b6Var;
        x6 x6Var = new x6(this);
        x6Var.k();
        this.f26456a = x6Var;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        b().t(new ae(this, neVar));
    }

    public static me F(Context context) {
        n9.m.l(context);
        n9.m.l(context.getApplicationContext());
        if (K == null) {
            synchronized (me.class) {
                try {
                    if (K == null) {
                        K = new me((ne) n9.m.l(new ne(context)), null);
                    }
                } finally {
                }
            }
        }
        return K;
    }

    public static final void G(com.google.android.gms.internal.measurement.n6 n6Var, int i10, String str) {
        List x10 = n6Var.x();
        for (int i11 = 0; i11 < x10.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.s6) x10.get(i11)).G())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.r6 T = com.google.android.gms.internal.measurement.s6.T();
        T.z("_err");
        T.E(i10);
        com.google.android.gms.internal.measurement.s6 s6Var = (com.google.android.gms.internal.measurement.s6) T.t();
        com.google.android.gms.internal.measurement.r6 T2 = com.google.android.gms.internal.measurement.s6.T();
        T2.z("_ev");
        T2.C(str);
        com.google.android.gms.internal.measurement.s6 s6Var2 = (com.google.android.gms.internal.measurement.s6) T2.t();
        n6Var.E(s6Var);
        n6Var.E(s6Var2);
    }

    public static final void H(com.google.android.gms.internal.measurement.n6 n6Var, @NonNull String str) {
        List x10 = n6Var.x();
        for (int i10 = 0; i10 < x10.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.s6) x10.get(i10)).G())) {
                n6Var.N(i10);
                return;
            }
        }
    }

    public static String Q(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static void W(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean X(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.f7495g);
    }

    public static final xd Y(xd xdVar) {
        if (xdVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (xdVar.i()) {
            return xdVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(xdVar.getClass())));
    }

    public static final Boolean Z(zzr zzrVar) {
        Boolean bool = zzrVar.f7509u;
        String str = zzrVar.H;
        if (!TextUtils.isEmpty(str)) {
            n8 a10 = z2.c(str).a();
            n8 n8Var = n8.UNINITIALIZED;
            int ordinal = a10.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r21 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r19, int r20, java.lang.Throwable r21, byte[] r22, java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.me.A(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    public final void A0() {
        b().h();
        F0().u();
        t F0 = F0();
        F0.h();
        F0.j();
        if (F0.a0()) {
            y4 y4Var = z4.f26908w0;
            if (((Long) y4Var.b(null)).longValue() != 0) {
                SQLiteDatabase u02 = F0.u0();
                g7 g7Var = F0.f26328a;
                int delete = u02.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(g7Var.e().a()), String.valueOf(y4Var.b(null))});
                if (delete > 0) {
                    g7Var.a().w().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
        if (this.f26463i.f26740h.a() == 0) {
            this.f26463i.f26740h.b(e().a());
        }
        R();
    }

    public final void B(c6 c6Var) {
        b().h();
        if (TextUtils.isEmpty(c6Var.r0())) {
            C((String) n9.m.l(c6Var.o0()), MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, null, null, null);
            return;
        }
        String str = (String) n9.m.l(c6Var.o0());
        a().w().b("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.g5 w5 = D0().w(str);
        String y10 = D0().y(str);
        w1.a aVar = null;
        if (w5 != null) {
            if (!TextUtils.isEmpty(y10)) {
                aVar = new w1.a();
                aVar.put("If-Modified-Since", y10);
            }
            String z10 = D0().z(str);
            if (!TextUtils.isEmpty(z10)) {
                if (aVar == null) {
                    aVar = new w1.a();
                }
                aVar.put("If-None-Match", z10);
            }
        }
        this.f26474t = true;
        E0().o(c6Var, aVar, new y5() { // from class: nb.le
            @Override // nb.y5
            public final /* synthetic */ void a(String str2, int i10, Throwable th2, byte[] bArr, Map map) {
                me.this.C(str2, i10, th2, bArr, map);
            }
        });
    }

    public final k B0() {
        return ((g7) n9.m.l(this.f26466l)).w();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.me.C(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final zd C0() {
        return this.f26464j;
    }

    public final void D(Runnable runnable) {
        b().h();
        if (this.f26470p == null) {
            this.f26470p = new ArrayList();
        }
        this.f26470p.add(runnable);
    }

    public final x6 D0() {
        x6 x6Var = this.f26456a;
        Y(x6Var);
        return x6Var;
    }

    public final void E() {
        b().h();
        O0();
        if (this.f26468n) {
            return;
        }
        this.f26468n = true;
        if (a0()) {
            FileChannel fileChannel = this.f26478x;
            b().h();
            int i10 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                a().o().a("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i10 = allocate.getInt();
                    } else if (read != -1) {
                        a().r().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e10) {
                    a().o().b("Failed to read from channel", e10);
                }
            }
            int t8 = this.f26466l.L().t();
            b().h();
            if (i10 > t8) {
                a().o().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(t8));
                return;
            }
            if (i10 < t8) {
                FileChannel fileChannel2 = this.f26478x;
                b().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    a().o().a("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(t8);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            a().o().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        a().w().c("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(t8));
                        return;
                    } catch (IOException e11) {
                        a().o().b("Failed to write to channel", e11);
                    }
                }
                a().o().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(t8));
            }
        }
    }

    public final b6 E0() {
        b6 b6Var = this.b;
        Y(b6Var);
        return b6Var;
    }

    public final t F0() {
        t tVar = this.f26457c;
        Y(tVar);
        return tVar;
    }

    public final e6 G0() {
        e6 e6Var = this.f26458d;
        if (e6Var != null) {
            return e6Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final sd H0() {
        sd sdVar = this.f26459e;
        Y(sdVar);
        return sdVar;
    }

    public final int I(String str, m mVar) {
        p8 p8Var;
        n8 m10;
        x6 x6Var = this.f26456a;
        if (x6Var.R(str) == null) {
            mVar.c(p8.AD_PERSONALIZATION, l.FAILSAFE);
            return 1;
        }
        c6 J0 = F0().J0(str);
        if (J0 != null && z2.c(J0.I()).a() == n8.POLICY && (m10 = x6Var.m(str, (p8Var = p8.AD_PERSONALIZATION))) != n8.UNINITIALIZED) {
            mVar.c(p8Var, l.REMOTE_ENFORCED_DEFAULT);
            return m10 == n8.GRANTED ? 0 : 1;
        }
        p8 p8Var2 = p8.AD_PERSONALIZATION;
        mVar.c(p8Var2, l.REMOTE_DEFAULT);
        return x6Var.P(str, p8Var2) ? 0 : 1;
    }

    public final e I0() {
        e eVar = this.f26460f;
        Y(eVar);
        return eVar;
    }

    public final Map J(com.google.android.gms.internal.measurement.o6 o6Var) {
        HashMap hashMap = new HashMap();
        K0();
        for (Map.Entry entry : re.t(o6Var, "gad_").entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final wa J0() {
        wa waVar = this.f26462h;
        Y(waVar);
        return waVar;
    }

    public final w K() {
        if (this.H == null) {
            this.H = new de(this, this.f26466l);
        }
        return this.H;
    }

    public final re K0() {
        re reVar = this.f26461g;
        Y(reVar);
        return reVar;
    }

    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void v0() {
        b().h();
        if (this.f26471q.isEmpty() || K().c()) {
            return;
        }
        long max = Math.max(0L, ((Integer) z4.C0.b(null)).intValue() - (e().b() - this.I));
        a().w().b("Scheduling notify next app runnable, delay in ms", Long.valueOf(max));
        K().b(max);
    }

    public final vc L0() {
        return this.f26463i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean M(java.lang.String r44, long r45) {
        /*
            Method dump skipped, instructions count: 3598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.me.M(java.lang.String, long):boolean");
    }

    public final p5 M0() {
        return this.f26466l.D();
    }

    public final void N(com.google.android.gms.internal.measurement.z6 z6Var, long j10, boolean z10) {
        Object obj;
        String str = true != z10 ? "_lte" : "_se";
        te B0 = F0().B0(z6Var.O(), str);
        te teVar = (B0 == null || (obj = B0.f26701e) == null) ? new te(z6Var.O(), "auto", str, e().a(), Long.valueOf(j10)) : new te(z6Var.O(), "auto", str, e().a(), Long.valueOf(((Long) obj).longValue() + j10));
        com.google.android.gms.internal.measurement.q7 S = com.google.android.gms.internal.measurement.r7.S();
        S.z(str);
        S.x(e().a());
        Object obj2 = teVar.f26701e;
        S.D(((Long) obj2).longValue());
        com.google.android.gms.internal.measurement.r7 r7Var = (com.google.android.gms.internal.measurement.r7) S.t();
        int X = re.X(z6Var, str);
        if (X >= 0) {
            z6Var.i1(X, r7Var);
        } else {
            z6Var.j1(r7Var);
        }
        if (j10 > 0) {
            F0().A0(teVar);
            a().w().c("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final ve N0() {
        return ((g7) n9.m.l(this.f26466l)).C();
    }

    public final boolean O(com.google.android.gms.internal.measurement.n6 n6Var, com.google.android.gms.internal.measurement.n6 n6Var2) {
        n9.m.a("_e".equals(n6Var.O()));
        K0();
        com.google.android.gms.internal.measurement.s6 r8 = re.r((com.google.android.gms.internal.measurement.o6) n6Var.t(), "_sc");
        String J = r8 == null ? null : r8.J();
        K0();
        com.google.android.gms.internal.measurement.s6 r10 = re.r((com.google.android.gms.internal.measurement.o6) n6Var2.t(), "_pc");
        String J2 = r10 != null ? r10.J() : null;
        if (J2 == null || !J2.equals(J)) {
            return false;
        }
        n9.m.a("_e".equals(n6Var.O()));
        K0();
        com.google.android.gms.internal.measurement.s6 r11 = re.r((com.google.android.gms.internal.measurement.o6) n6Var.t(), "_et");
        if (r11 == null || !r11.K() || r11.L() <= 0) {
            return true;
        }
        long L = r11.L();
        K0();
        com.google.android.gms.internal.measurement.s6 r12 = re.r((com.google.android.gms.internal.measurement.o6) n6Var2.t(), "_et");
        if (r12 != null && r12.L() > 0) {
            L += r12.L();
        }
        K0();
        re.o(n6Var2, "_et", Long.valueOf(L));
        K0();
        re.o(n6Var, "_fr", 1L);
        return true;
    }

    public final void O0() {
        if (!this.f26467m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final boolean P() {
        b().h();
        O0();
        return F0().B() || !TextUtils.isEmpty(F0().r());
    }

    public final void P0(zzr zzrVar) {
        b().h();
        O0();
        String str = zzrVar.f7494f;
        n9.m.f(str);
        q8 f10 = q8.f(zzrVar.f7512x, zzrVar.C);
        g(str);
        a().w().c("Setting storage consent for package", str, f10);
        f(str, f10);
    }

    public final void Q0(zzr zzrVar) {
        b().h();
        O0();
        String str = zzrVar.f7494f;
        n9.m.f(str);
        x g10 = x.g(zzrVar.D);
        a().w().c("Setting DMA consent for package", str, g10);
        b().h();
        O0();
        n8 c10 = x.h(S0(str), 100).c();
        this.C.put(str, g10);
        F0().V(str, g10);
        n8 c11 = x.h(S0(str), 100).c();
        b().h();
        O0();
        n8 n8Var = n8.DENIED;
        boolean z10 = c10 == n8Var && c11 == n8.GRANTED;
        boolean z11 = c10 == n8.GRANTED && c11 == n8Var;
        if (z10 || z11) {
            a().w().b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (F0().L0(h(), str, false, false, false, false, false, false, false).f26540f < B0().E(str, z4.f26890n0)) {
                bundle.putLong("_r", 1L);
                a().w().c("_dcu realtime event count", str, Long.valueOf(F0().L0(h(), str, false, false, false, false, false, true, false).f26540f));
            }
            this.J.a(str, "_dcu", bundle);
        }
    }

    public final void R() {
        long max;
        long j10;
        b().h();
        O0();
        if (this.f26469o > 0) {
            long abs = 3600000 - Math.abs(e().b() - this.f26469o);
            if (abs > 0) {
                a().w().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                G0().b();
                H0().n();
                return;
            }
            this.f26469o = 0L;
        }
        if (!this.f26466l.m() || !P()) {
            a().w().a("Nothing to upload or uploading impossible");
            G0().b();
            H0().n();
            return;
        }
        long a10 = e().a();
        B0();
        long max2 = Math.max(0L, ((Long) z4.P.b(null)).longValue());
        boolean z10 = true;
        if (!F0().D() && !F0().s()) {
            z10 = false;
        }
        if (z10) {
            String i10 = B0().i();
            if (TextUtils.isEmpty(i10) || ".none.".equals(i10)) {
                B0();
                max = Math.max(0L, ((Long) z4.J.b(null)).longValue());
            } else {
                B0();
                max = Math.max(0L, ((Long) z4.K.b(null)).longValue());
            }
        } else {
            B0();
            max = Math.max(0L, ((Long) z4.I.b(null)).longValue());
        }
        long a11 = this.f26463i.f26740h.a();
        long a12 = this.f26463i.f26741i.a();
        long j11 = 0;
        boolean z11 = z10;
        long max3 = Math.max(F0().y(), F0().A());
        if (max3 == 0) {
            j10 = 0;
        } else {
            long abs2 = a10 - Math.abs(max3 - a10);
            long abs3 = a10 - Math.abs(a11 - a10);
            long abs4 = a10 - Math.abs(a12 - a10);
            j10 = max2 + abs2;
            long max4 = Math.max(abs3, abs4);
            if (z11 && max4 > 0) {
                j10 = Math.min(abs2, max4) + max;
            }
            if (!K0().S(max4, max)) {
                j10 = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i11 = 0;
                while (true) {
                    B0();
                    if (i11 >= Math.min(20, Math.max(0, ((Integer) z4.R.b(null)).intValue()))) {
                        j10 = 0;
                        break;
                    }
                    B0();
                    j10 += Math.max(j11, ((Long) z4.Q.b(null)).longValue()) * (1 << i11);
                    if (j10 > abs4) {
                        break;
                    }
                    i11++;
                    j11 = 0;
                }
            }
            j11 = 0;
        }
        if (j10 == j11) {
            a().w().a("Next upload time is 0");
            G0().b();
            H0().n();
            return;
        }
        if (!E0().m()) {
            a().w().a("No network");
            G0().a();
            H0().n();
            return;
        }
        long a13 = this.f26463i.f26739g.a();
        B0();
        long max5 = Math.max(0L, ((Long) z4.G.b(null)).longValue());
        if (!K0().S(a13, max5)) {
            j10 = Math.max(j10, a13 + max5);
        }
        G0().b();
        long a14 = j10 - e().a();
        if (a14 <= 0) {
            B0();
            a14 = Math.max(0L, ((Long) z4.L.b(null)).longValue());
            this.f26463i.f26740h.b(e().a());
        }
        a().w().b("Upload scheduled in approximately ms", Long.valueOf(a14));
        H0().m(a14);
    }

    public final x R0(String str) {
        b().h();
        O0();
        Map map = this.C;
        x xVar = (x) map.get(str);
        if (xVar != null) {
            return xVar;
        }
        x U = F0().U(str);
        map.put(str, U);
        return U;
    }

    public final void S() {
        b().h();
        if (this.f26474t || this.f26475u || this.f26476v) {
            a().w().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f26474t), Boolean.valueOf(this.f26475u), Boolean.valueOf(this.f26476v));
            return;
        }
        a().w().a("Stopping uploading service(s)");
        List list = this.f26470p;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) n9.m.l(this.f26470p)).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle S0(String str) {
        b().h();
        O0();
        if (D0().R(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        q8 g10 = g(str);
        bundle.putAll(g10.n());
        bundle.putAll(T0(str, R0(str), g10, new m()).f());
        te B0 = F0().B0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (B0 != null ? B0.f26701e.equals(1L) : I(str, new m())) ? "granted" : "denied");
        return bundle;
    }

    public final Boolean T(c6 c6Var) {
        try {
            if (c6Var.F0() != -2147483648L) {
                if (c6Var.F0() == w9.c.a(this.f26466l.d()).e(c6Var.o0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = w9.c.a(this.f26466l.d()).e(c6Var.o0(), 0).versionName;
                String D0 = c6Var.D0();
                if (D0 != null && D0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final x T0(String str, x xVar, q8 q8Var, m mVar) {
        n8 n8Var;
        int i10 = 90;
        if (D0().R(str) == null) {
            if (xVar.c() == n8.DENIED) {
                i10 = xVar.b();
                mVar.b(p8.AD_USER_DATA, i10);
            } else {
                mVar.c(p8.AD_USER_DATA, l.FAILSAFE);
            }
            return new x(Boolean.FALSE, i10, Boolean.TRUE, "-");
        }
        n8 c10 = xVar.c();
        n8 n8Var2 = n8.GRANTED;
        if (c10 == n8Var2 || c10 == (n8Var = n8.DENIED)) {
            i10 = xVar.b();
            mVar.b(p8.AD_USER_DATA, i10);
        } else {
            if (c10 == n8.POLICY) {
                x6 x6Var = this.f26456a;
                p8 p8Var = p8.AD_USER_DATA;
                n8 m10 = x6Var.m(str, p8Var);
                if (m10 != n8.UNINITIALIZED) {
                    mVar.c(p8Var, l.REMOTE_ENFORCED_DEFAULT);
                    c10 = m10;
                }
            }
            x6 x6Var2 = this.f26456a;
            p8 p8Var2 = p8.AD_USER_DATA;
            p8 Q = x6Var2.Q(str, p8Var2);
            n8 p8 = q8Var.p();
            boolean z10 = p8 == n8Var2 || p8 == n8Var;
            if (Q == p8.AD_STORAGE && z10) {
                mVar.c(p8Var2, l.REMOTE_DELEGATION);
                c10 = p8;
            } else {
                mVar.c(p8Var2, l.REMOTE_DEFAULT);
                c10 = true != x6Var2.P(str, p8Var2) ? n8Var : n8Var2;
            }
        }
        boolean S = this.f26456a.S(str);
        SortedSet T = D0().T(str);
        if (c10 == n8.DENIED || T.isEmpty()) {
            return new x(Boolean.FALSE, i10, Boolean.valueOf(S), "-");
        }
        return new x(Boolean.TRUE, i10, Boolean.valueOf(S), S ? TextUtils.join("", T) : "");
    }

    public final zzr U(String str) {
        c6 J0 = F0().J0(str);
        if (J0 == null || TextUtils.isEmpty(J0.D0())) {
            a().v().b("No app data available; dropping", str);
            return null;
        }
        Boolean T = T(J0);
        if (T == null || T.booleanValue()) {
            return new zzr(str, J0.r0(), J0.D0(), J0.F0(), J0.H0(), J0.J0(), J0.L0(), (String) null, J0.d(), false, J0.x0(), 0L, 0, J0.P(), false, J0.R(), J0.b(), J0.T(), g(str).l(), "", (String) null, J0.V(), J0.X(), g(str).b(), R0(str).e(), J0.b0(), J0.j0(), J0.l0(), J0.I(), 0L, J0.M());
        }
        a().o().b("App version does not match; dropping. appId", w5.x(str));
        return null;
    }

    public final boolean V(String str, String str2) {
        b0 v02 = F0().v0(str, str2);
        return v02 == null || v02.f26050c < 1;
    }

    @Override // nb.l8
    public final w5 a() {
        return ((g7) n9.m.l(this.f26466l)).a();
    }

    public final boolean a0() {
        b().h();
        FileLock fileLock = this.f26477w;
        if (fileLock != null && fileLock.isValid()) {
            a().w().a("Storage concurrent access okay");
            return true;
        }
        this.f26457c.f26328a.w();
        File filesDir = this.f26466l.d().getFilesDir();
        com.google.android.gms.internal.measurement.y0.a();
        com.google.android.gms.internal.measurement.e1 e1Var = com.google.android.gms.internal.measurement.e1.f6470a;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.f26478x = channel;
            FileLock tryLock = channel.tryLock();
            this.f26477w = tryLock;
            if (tryLock != null) {
                a().w().a("Storage concurrent access okay");
                return true;
            }
            a().o().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e10) {
            a().o().b("Failed to acquire storage lock", e10);
            return false;
        } catch (IOException e11) {
            a().o().b("Failed to access storage lock file", e11);
            return false;
        } catch (OverlappingFileLockException e12) {
            a().r().b("Storage lock already acquired", e12);
            return false;
        }
    }

    @Override // nb.l8
    public final c7 b() {
        return ((g7) n9.m.l(this.f26466l)).b();
    }

    public final void b0(zzr zzrVar) {
        if (this.f26479y != null) {
            ArrayList arrayList = new ArrayList();
            this.f26480z = arrayList;
            arrayList.addAll(this.f26479y);
        }
        t F0 = F0();
        String str = (String) n9.m.l(zzrVar.f7494f);
        n9.m.f(str);
        F0.h();
        F0.j();
        try {
            SQLiteDatabase u02 = F0.u0();
            String[] strArr = {str};
            int delete = u02.delete("apps", "app_id=?", strArr) + u02.delete("events", "app_id=?", strArr) + u02.delete("events_snapshot", "app_id=?", strArr) + u02.delete("user_attributes", "app_id=?", strArr) + u02.delete("conditional_properties", "app_id=?", strArr) + u02.delete("raw_events", "app_id=?", strArr) + u02.delete("raw_events_metadata", "app_id=?", strArr) + u02.delete("queue", "app_id=?", strArr) + u02.delete("audience_filter_values", "app_id=?", strArr) + u02.delete("main_event_params", "app_id=?", strArr) + u02.delete("default_event_params", "app_id=?", strArr) + u02.delete("trigger_uris", "app_id=?", strArr) + u02.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.se.a();
            g7 g7Var = F0.f26328a;
            if (g7Var.w().H(null, z4.f26877i1)) {
                delete += u02.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (delete > 0) {
                g7Var.a().w().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            F0.f26328a.a().o().c("Error resetting analytics data. appId, error", w5.x(str), e10);
        }
        if (zzrVar.f7501m) {
            h0(zzrVar);
        }
    }

    @Override // nb.l8
    public final f c() {
        return this.f26466l.c();
    }

    public final void c0(zzpl zzplVar, zzr zzrVar) {
        te B0;
        long j10;
        b().h();
        O0();
        if (X(zzrVar)) {
            if (!zzrVar.f7501m) {
                o0(zzrVar);
                return;
            }
            ve N0 = N0();
            String str = zzplVar.f7488g;
            int y02 = N0.y0(str);
            if (y02 != 0) {
                ve N02 = N0();
                B0();
                N0().B(this.J, zzrVar.f7494f, y02, "_ev", N02.q(str, 24, true), str != null ? str.length() : 0);
                return;
            }
            int y10 = N0().y(str, zzplVar.zza());
            if (y10 != 0) {
                ve N03 = N0();
                B0();
                String q10 = N03.q(str, 24, true);
                Object zza = zzplVar.zza();
                if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                    r13 = zza.toString().length();
                }
                N0().B(this.J, zzrVar.f7494f, y10, "_ev", q10, r13);
                return;
            }
            Object z10 = N0().z(str, zzplVar.zza());
            if (z10 != null) {
                if ("_sid".equals(str)) {
                    long j11 = zzplVar.f7489h;
                    String str2 = zzplVar.f7492k;
                    String str3 = (String) n9.m.l(zzrVar.f7494f);
                    te B02 = F0().B0(str3, "_sno");
                    if (B02 != null) {
                        Object obj = B02.f26701e;
                        if (obj instanceof Long) {
                            j10 = ((Long) obj).longValue();
                            c0(new zzpl("_sno", j11, Long.valueOf(j10 + 1), str2), zzrVar);
                        }
                    }
                    if (B02 != null) {
                        a().r().b("Retrieved last session number from database does not contain a valid (long) value", B02.f26701e);
                    }
                    b0 v02 = F0().v0(str3, "_s");
                    if (v02 != null) {
                        u5 w5 = a().w();
                        long j12 = v02.f26050c;
                        w5.b("Backfill the session number. Last used session number", Long.valueOf(j12));
                        j10 = j12;
                    } else {
                        j10 = 0;
                    }
                    c0(new zzpl("_sno", j11, Long.valueOf(j10 + 1), str2), zzrVar);
                }
                String str4 = zzrVar.f7494f;
                te teVar = new te((String) n9.m.l(str4), (String) n9.m.l(zzplVar.f7492k), str, zzplVar.f7489h, z10);
                u5 w10 = a().w();
                g7 g7Var = this.f26466l;
                String str5 = teVar.f26699c;
                w10.c("Setting user property", g7Var.D().c(str5), z10);
                F0().r0();
                try {
                    if ("_id".equals(str5) && (B0 = F0().B0(str4, "_id")) != null && !teVar.f26701e.equals(B0.f26701e)) {
                        F0().z0(str4, "_lair");
                    }
                    o0(zzrVar);
                    boolean A0 = F0().A0(teVar);
                    if ("_sid".equals(str)) {
                        long U = K0().U(zzrVar.f7514z);
                        c6 J0 = F0().J0(str4);
                        if (J0 != null) {
                            J0.a0(U);
                            if (J0.A()) {
                                F0().K0(J0, false, false);
                            }
                        }
                    }
                    F0().s0();
                    if (!A0) {
                        a().o().c("Too many unique user properties are set. Ignoring user property", g7Var.D().c(str5), teVar.f26701e);
                        N0().B(this.J, str4, 9, null, null, 0);
                    }
                    F0().t0();
                } catch (Throwable th2) {
                    F0().t0();
                    throw th2;
                }
            }
        }
    }

    @Override // nb.l8
    public final Context d() {
        return this.f26466l.d();
    }

    public final void d0(String str, zzr zzrVar) {
        b().h();
        O0();
        if (X(zzrVar)) {
            if (!zzrVar.f7501m) {
                o0(zzrVar);
                return;
            }
            Boolean Z = Z(zzrVar);
            if ("_npa".equals(str) && Z != null) {
                a().v().a("Falling back to manifest metadata value for ad personalization");
                c0(new zzpl("_npa", e().a(), Long.valueOf(true != Z.booleanValue() ? 0L : 1L), "auto"), zzrVar);
                return;
            }
            u5 v5 = a().v();
            g7 g7Var = this.f26466l;
            v5.b("Removing user property", g7Var.D().c(str));
            F0().r0();
            try {
                o0(zzrVar);
                if ("_id".equals(str)) {
                    F0().z0((String) n9.m.l(zzrVar.f7494f), "_lair");
                }
                F0().z0((String) n9.m.l(zzrVar.f7494f), str);
                F0().s0();
                a().v().b("User property removed", g7Var.D().c(str));
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    @Override // nb.l8
    public final u9.e e() {
        return ((g7) n9.m.l(this.f26466l)).e();
    }

    public final void e0() {
        this.f26472r++;
    }

    public final void f(String str, q8 q8Var) {
        b().h();
        O0();
        this.B.put(str, q8Var);
        F0().L(str, q8Var);
    }

    public final void f0() {
        this.f26473s++;
    }

    public final q8 g(String str) {
        q8 q8Var = q8.f26588c;
        b().h();
        O0();
        q8 q8Var2 = (q8) this.B.get(str);
        if (q8Var2 == null) {
            q8Var2 = F0().J(str);
            if (q8Var2 == null) {
                q8Var2 = q8.f26588c;
            }
            f(str, q8Var2);
        }
        return q8Var2;
    }

    public final g7 g0() {
        return this.f26466l;
    }

    public final long h() {
        long a10 = e().a();
        vc vcVar = this.f26463i;
        vcVar.j();
        vcVar.h();
        h6 h6Var = vcVar.f26742j;
        long a11 = h6Var.a();
        if (a11 == 0) {
            a11 = vcVar.f26328a.C().q0().nextInt(86400000) + 1;
            h6Var.b(a11);
        }
        return ((((a10 + a11) / 1000) / 60) / 60) / 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00c0, code lost:
    
        if (true == r12.booleanValue()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00c2, code lost:
    
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00c7, code lost:
    
        r15 = new com.google.android.gms.measurement.internal.zzpl("_npa", r17, java.lang.Long.valueOf(r23), "auto");
        r24 = 1;
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00da, code lost:
    
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00e4, code lost:
    
        if (r11.f26701e.equals(r15.f7490i) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00e6, code lost:
    
        c0(r15, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00c5, code lost:
    
        r23 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x040b A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011a A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0106 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(com.google.android.gms.measurement.internal.zzr r28) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.me.h0(com.google.android.gms.measurement.internal.zzr):void");
    }

    public final void i(zzbg zzbgVar, String str) {
        c6 J0 = F0().J0(str);
        if (J0 == null || TextUtils.isEmpty(J0.D0())) {
            a().v().b("No app data available; dropping event", str);
            return;
        }
        Boolean T = T(J0);
        if (T == null) {
            if (!"_ui".equals(zzbgVar.f7471f)) {
                a().r().b("Could not find package. appId", w5.x(str));
            }
        } else if (!T.booleanValue()) {
            a().o().b("App version does not match; dropping event. appId", w5.x(str));
            return;
        }
        j(zzbgVar, new zzr(str, J0.r0(), J0.D0(), J0.F0(), J0.H0(), J0.J0(), J0.L0(), (String) null, J0.d(), false, J0.x0(), 0L, 0, J0.P(), false, J0.R(), J0.b(), J0.T(), g(str).l(), "", (String) null, J0.V(), J0.X(), g(str).b(), R0(str).e(), J0.b0(), J0.j0(), J0.l0(), J0.I(), 0L, J0.M()));
    }

    public final void i0(zzr zzrVar) {
        b().h();
        O0();
        n9.m.l(zzrVar);
        String str = zzrVar.f7494f;
        n9.m.f(str);
        int i10 = 0;
        if (B0().H(null, z4.A0)) {
            long a10 = e().a();
            int E = B0().E(null, z4.f26879j0);
            B0();
            long n10 = a10 - k.n();
            while (i10 < E && M(null, n10)) {
                i10++;
            }
        } else {
            B0();
            long p8 = k.p();
            while (i10 < p8 && M(str, 0L)) {
                i10++;
            }
        }
        if (B0().H(null, z4.B0)) {
            b().h();
            v0();
        }
        if (this.f26464j.j(str, com.google.android.gms.internal.measurement.k7.a(zzrVar.J))) {
            a().w().b("[sgtm] Going background, trigger client side upload. appId", str);
            s(str, e().a());
        }
    }

    public final void j(zzbg zzbgVar, zzr zzrVar) {
        String str = zzrVar.f7494f;
        n9.m.f(str);
        x5 a10 = x5.a(zzbgVar);
        N0().w(a10.f26793d, F0().G(str));
        N0().u(a10, B0().w(str));
        zzbg b = a10.b();
        if (!B0().H(null, z4.f26871g1) && "_cmp".equals(b.f7471f)) {
            zzbe zzbeVar = b.f7472g;
            if ("referrer API v2".equals(zzbeVar.x3("_cis"))) {
                String x32 = zzbeVar.x3("gclid");
                if (!TextUtils.isEmpty(x32)) {
                    c0(new zzpl("_lgclid", b.f7474i, x32, "auto"), zzrVar);
                }
            }
        }
        k(b, zzrVar);
    }

    public final void j0(zzah zzahVar) {
        zzr U = U((String) n9.m.l(zzahVar.f7458f));
        if (U != null) {
            k0(zzahVar, U);
        }
    }

    public final void k(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List<zzah> I0;
        List<zzah> I02;
        List<zzah> I03;
        String str;
        n9.m.l(zzrVar);
        String str2 = zzrVar.f7494f;
        n9.m.f(str2);
        b().h();
        O0();
        long j10 = zzbgVar.f7474i;
        x5 a10 = x5.a(zzbgVar);
        b().h();
        ve.k0((this.F == null || (str = this.G) == null || !str.equals(str2)) ? null : this.F, a10.f26793d, false);
        zzbg b = a10.b();
        K0();
        if (re.p(b, zzrVar)) {
            if (!zzrVar.f7501m) {
                o0(zzrVar);
                return;
            }
            List list = zzrVar.f7511w;
            if (list != null) {
                String str3 = b.f7471f;
                if (!list.contains(str3)) {
                    a().v().d("Dropping non-safelisted event. appId, event name, origin", str2, b.f7471f, b.f7473h);
                    return;
                } else {
                    Bundle y32 = b.f7472g.y3();
                    y32.putLong("ga_safelisted", 1L);
                    zzbgVar2 = new zzbg(str3, new zzbe(y32), b.f7473h, b.f7474i);
                }
            } else {
                zzbgVar2 = b;
            }
            F0().r0();
            try {
                String str4 = zzbgVar2.f7471f;
                if ("_s".equals(str4) && !F0().C(str2, "_s") && zzbgVar2.f7472g.v3("_sid").longValue() != 0) {
                    if (!F0().C(str2, "_f") && !F0().C(str2, "_v")) {
                        F0().I(str2, Long.valueOf(e().a() - 15000), "_sid", l(str2, zzbgVar2));
                    }
                    F0().I(str2, null, "_sid", l(str2, zzbgVar2));
                }
                t F0 = F0();
                n9.m.f(str2);
                F0.h();
                F0.j();
                if (j10 < 0) {
                    F0.f26328a.a().r().c("Invalid time querying timed out conditional properties", w5.x(str2), Long.valueOf(j10));
                    I0 = Collections.EMPTY_LIST;
                } else {
                    I0 = F0.I0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
                }
                for (zzah zzahVar : I0) {
                    if (zzahVar != null) {
                        a().w().d("User property timed out", zzahVar.f7458f, this.f26466l.D().c(zzahVar.f7460h.f7488g), zzahVar.f7460h.zza());
                        zzbg zzbgVar3 = zzahVar.f7464l;
                        if (zzbgVar3 != null) {
                            m(new zzbg(zzbgVar3, j10), zzrVar);
                        }
                        F0().G0(str2, zzahVar.f7460h.f7488g);
                    }
                }
                t F02 = F0();
                n9.m.f(str2);
                F02.h();
                F02.j();
                if (j10 < 0) {
                    F02.f26328a.a().r().c("Invalid time querying expired conditional properties", w5.x(str2), Long.valueOf(j10));
                    I02 = Collections.EMPTY_LIST;
                } else {
                    I02 = F02.I0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(I02.size());
                for (zzah zzahVar2 : I02) {
                    if (zzahVar2 != null) {
                        a().w().d("User property expired", zzahVar2.f7458f, this.f26466l.D().c(zzahVar2.f7460h.f7488g), zzahVar2.f7460h.zza());
                        F0().z0(str2, zzahVar2.f7460h.f7488g);
                        zzbg zzbgVar4 = zzahVar2.f7468p;
                        if (zzbgVar4 != null) {
                            arrayList.add(zzbgVar4);
                        }
                        F0().G0(str2, zzahVar2.f7460h.f7488g);
                    }
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    m(new zzbg((zzbg) obj, j10), zzrVar);
                }
                t F03 = F0();
                n9.m.f(str2);
                n9.m.f(str4);
                F03.h();
                F03.j();
                if (j10 < 0) {
                    g7 g7Var = F03.f26328a;
                    g7Var.a().r().d("Invalid time querying triggered conditional properties", w5.x(str2), g7Var.D().a(str4), Long.valueOf(j10));
                    I03 = Collections.EMPTY_LIST;
                } else {
                    I03 = F03.I0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(I03.size());
                for (zzah zzahVar3 : I03) {
                    if (zzahVar3 != null) {
                        zzpl zzplVar = zzahVar3.f7460h;
                        te teVar = new te((String) n9.m.l(zzahVar3.f7458f), zzahVar3.f7459g, zzplVar.f7488g, j10, n9.m.l(zzplVar.zza()));
                        if (F0().A0(teVar)) {
                            a().w().d("User property triggered", zzahVar3.f7458f, this.f26466l.D().c(teVar.f26699c), teVar.f26701e);
                        } else {
                            a().o().d("Too many active user properties, ignoring", w5.x(zzahVar3.f7458f), this.f26466l.D().c(teVar.f26699c), teVar.f26701e);
                        }
                        zzbg zzbgVar5 = zzahVar3.f7466n;
                        if (zzbgVar5 != null) {
                            arrayList2.add(zzbgVar5);
                        }
                        zzahVar3.f7460h = new zzpl(teVar);
                        zzahVar3.f7462j = true;
                        F0().E0(zzahVar3);
                    }
                }
                m(zzbgVar2, zzrVar);
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    m(new zzbg((zzbg) obj2, j10), zzrVar);
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    public final void k0(zzah zzahVar, zzr zzrVar) {
        n9.m.l(zzahVar);
        n9.m.f(zzahVar.f7458f);
        n9.m.l(zzahVar.f7459g);
        n9.m.l(zzahVar.f7460h);
        n9.m.f(zzahVar.f7460h.f7488g);
        b().h();
        O0();
        if (X(zzrVar)) {
            if (!zzrVar.f7501m) {
                o0(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z10 = false;
            zzahVar2.f7462j = false;
            F0().r0();
            try {
                zzah F0 = F0().F0((String) n9.m.l(zzahVar2.f7458f), zzahVar2.f7460h.f7488g);
                if (F0 != null && !F0.f7459g.equals(zzahVar2.f7459g)) {
                    a().r().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f26466l.D().c(zzahVar2.f7460h.f7488g), zzahVar2.f7459g, F0.f7459g);
                }
                if (F0 != null && F0.f7462j) {
                    zzahVar2.f7459g = F0.f7459g;
                    zzahVar2.f7461i = F0.f7461i;
                    zzahVar2.f7465m = F0.f7465m;
                    zzahVar2.f7463k = F0.f7463k;
                    zzahVar2.f7466n = F0.f7466n;
                    zzahVar2.f7462j = true;
                    zzpl zzplVar = zzahVar2.f7460h;
                    zzahVar2.f7460h = new zzpl(zzplVar.f7488g, F0.f7460h.f7489h, zzplVar.zza(), F0.f7460h.f7492k);
                } else if (TextUtils.isEmpty(zzahVar2.f7463k)) {
                    zzpl zzplVar2 = zzahVar2.f7460h;
                    zzahVar2.f7460h = new zzpl(zzplVar2.f7488g, zzahVar2.f7461i, zzplVar2.zza(), zzahVar2.f7460h.f7492k);
                    zzahVar2.f7462j = true;
                    z10 = true;
                }
                if (zzahVar2.f7462j) {
                    zzpl zzplVar3 = zzahVar2.f7460h;
                    te teVar = new te((String) n9.m.l(zzahVar2.f7458f), zzahVar2.f7459g, zzplVar3.f7488g, zzplVar3.f7489h, n9.m.l(zzplVar3.zza()));
                    if (F0().A0(teVar)) {
                        a().v().d("User property updated immediately", zzahVar2.f7458f, this.f26466l.D().c(teVar.f26699c), teVar.f26701e);
                    } else {
                        a().o().d("(2)Too many active user properties, ignoring", w5.x(zzahVar2.f7458f), this.f26466l.D().c(teVar.f26699c), teVar.f26701e);
                    }
                    if (z10 && zzahVar2.f7466n != null) {
                        m(new zzbg(zzahVar2.f7466n, zzahVar2.f7461i), zzrVar);
                    }
                }
                if (F0().E0(zzahVar2)) {
                    a().v().d("Conditional property added", zzahVar2.f7458f, this.f26466l.D().c(zzahVar2.f7460h.f7488g), zzahVar2.f7460h.zza());
                } else {
                    a().o().d("Too many conditional properties, ignoring", w5.x(zzahVar2.f7458f), this.f26466l.D().c(zzahVar2.f7460h.f7488g), zzahVar2.f7460h.zza());
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    public final Bundle l(String str, zzbg zzbgVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.f7472g.v3("_sid").longValue());
        te B0 = F0().B0(str, "_sno");
        if (B0 != null) {
            Object obj = B0.f26701e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final void l0(zzah zzahVar) {
        zzr U = U((String) n9.m.l(zzahVar.f7458f));
        if (U != null) {
            m0(zzahVar, U);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:358|(2:360|(10:362|363|364|(1:366)|58|(0)(0)|61|(0)(0)|67|68))|367|368|369|370|371|363|364|(0)|58|(0)(0)|61|(0)(0)|67|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(65:(2:70|(3:72|(1:74)|75))|76|(2:78|(3:80|(1:82)|83))(1:330)|84|85|(1:87)|88|(2:92|(1:94))|95|(2:101|(2:103|104))|107|(3:108|109|110)|111|(1:113)|114|(2:116|(1:120)(1:119))(1:326)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(6:143|(1:147)|148|(1:150)(1:183)|151|(1:153)(15:154|(1:156)(1:182)|157|(1:159)(1:181)|160|(1:162)(1:180)|163|(1:165)(1:179)|166|(1:168)(1:178)|169|(1:171)(1:177)|172|(1:174)(1:176)|175))|184|(1:186)|187|(1:189)(1:325)|(34:193|(4:196|(3:198|199|(3:201|202|(3:204|205|207)(1:316))(1:318))(1:322)|317|194)|323|208|(1:210)|(1:212)|213|(1:215)|216|(2:220|(4:222|(1:224)|225|(28:233|(1:235)(1:314)|236|(1:238)|239|240|(2:242|(1:244))|245|(3:247|(1:249)|250)(1:313)|251|(1:255)|256|(1:258)|259|(4:262|(2:268|269)|270|260)|274|275|276|277|278|(2:279|(2:281|(1:283)(1:298))(3:299|300|(1:305)(1:304)))|285|286|287|(1:289)(2:294|295)|290|291|292)))|315|240|(0)|245|(0)(0)|251|(2:253|255)|256|(0)|259|(1:260)|274|275|276|277|278|(3:279|(0)(0)|298)|285|286|287|(0)(0)|290|291|292)|324|(0)|213|(0)|216|(3:218|220|(0))|315|240|(0)|245|(0)(0)|251|(0)|256|(0)|259|(1:260)|274|275|276|277|278|(3:279|(0)(0)|298)|285|286|287|(0)(0)|290|291|292) */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0a32, code lost:
    
        r30 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0ae5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0aec, code lost:
    
        r2.f26328a.a().o().c("Error storing raw event. appId", nb.w5.x(r3.f26017a), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0b02, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0b1d, code lost:
    
        a().o().c("Data loss. Failed to insert raw event metadata. appId", nb.w5.x(r8.O()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x028a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x028b, code lost:
    
        r12.f26328a.a().o().c("Error pruning currencies. appId", nb.w5.x(r10), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07af A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07bf A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07f6 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x08ae A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x08c5 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x092c A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x094d A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0969 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a28 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0ad1 A[Catch: all -> 0x0176, SQLiteException -> 0x0ae5, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0ae5, blocks: (B:287:0x0ac0, B:289:0x0ad1), top: B:286:0x0ac0, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a35 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0306 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x02c5 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0366 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x038b  */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(com.google.android.gms.measurement.internal.zzbg r45, com.google.android.gms.measurement.internal.zzr r46) {
        /*
            Method dump skipped, instructions count: 2923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.me.m(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzr):void");
    }

    public final void m0(zzah zzahVar, zzr zzrVar) {
        n9.m.l(zzahVar);
        n9.m.f(zzahVar.f7458f);
        n9.m.l(zzahVar.f7460h);
        n9.m.f(zzahVar.f7460h.f7488g);
        b().h();
        O0();
        if (X(zzrVar)) {
            if (!zzrVar.f7501m) {
                o0(zzrVar);
                return;
            }
            F0().r0();
            try {
                o0(zzrVar);
                String str = (String) n9.m.l(zzahVar.f7458f);
                zzah F0 = F0().F0(str, zzahVar.f7460h.f7488g);
                if (F0 != null) {
                    a().v().c("Removing conditional user property", zzahVar.f7458f, this.f26466l.D().c(zzahVar.f7460h.f7488g));
                    F0().G0(str, zzahVar.f7460h.f7488g);
                    if (F0.f7462j) {
                        F0().z0(str, zzahVar.f7460h.f7488g);
                    }
                    zzbg zzbgVar = zzahVar.f7468p;
                    if (zzbgVar != null) {
                        zzbe zzbeVar = zzbgVar.f7472g;
                        m((zzbg) n9.m.l(N0().R(str, ((zzbg) n9.m.l(zzbgVar)).f7471f, zzbeVar != null ? zzbeVar.y3() : null, F0.f7459g, zzbgVar.f7474i, true, true)), zzrVar);
                    }
                } else {
                    a().r().c("Conditional user property doesn't exist", w5.x(zzahVar.f7458f), this.f26466l.D().c(zzahVar.f7460h.f7488g));
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    public final void n(c6 c6Var, com.google.android.gms.internal.measurement.z6 z6Var) {
        com.google.android.gms.internal.measurement.r7 r7Var;
        b().h();
        O0();
        m d10 = m.d(z6Var.f0());
        String o02 = c6Var.o0();
        b().h();
        O0();
        q8 g10 = g(o02);
        n8 n8Var = n8.UNINITIALIZED;
        int ordinal = g10.p().ordinal();
        if (ordinal == 1) {
            d10.c(p8.AD_STORAGE, l.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal == 2 || ordinal == 3) {
            d10.b(p8.AD_STORAGE, g10.b());
        } else {
            d10.c(p8.AD_STORAGE, l.FAILSAFE);
        }
        int ordinal2 = g10.q().ordinal();
        if (ordinal2 == 1) {
            d10.c(p8.ANALYTICS_STORAGE, l.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            d10.b(p8.ANALYTICS_STORAGE, g10.b());
        } else {
            d10.c(p8.ANALYTICS_STORAGE, l.FAILSAFE);
        }
        String o03 = c6Var.o0();
        b().h();
        O0();
        x T0 = T0(o03, R0(o03), g(o03), d10);
        z6Var.i0(((Boolean) n9.m.l(T0.j())).booleanValue());
        if (!TextUtils.isEmpty(T0.k())) {
            z6Var.k0(T0.k());
        }
        b().h();
        O0();
        Iterator it = z6Var.f1().iterator();
        while (true) {
            if (it.hasNext()) {
                r7Var = (com.google.android.gms.internal.measurement.r7) it.next();
                if ("_npa".equals(r7Var.H())) {
                    break;
                }
            } else {
                r7Var = null;
                break;
            }
        }
        if (r7Var != null) {
            p8 p8Var = p8.AD_PERSONALIZATION;
            if (d10.a(p8Var) == l.UNSET) {
                te B0 = F0().B0(c6Var.o0(), "_npa");
                if (B0 != null) {
                    String str = B0.b;
                    if ("tcf".equals(str)) {
                        d10.c(p8Var, l.TCF);
                    } else if (Payload.TYPE_APP.equals(str)) {
                        d10.c(p8Var, l.API);
                    } else {
                        d10.c(p8Var, l.MANIFEST);
                    }
                } else {
                    Boolean R = c6Var.R();
                    if (R == null || ((R.booleanValue() && r7Var.N() != 1) || !(R.booleanValue() || r7Var.N() == 0))) {
                        d10.c(p8Var, l.API);
                    } else {
                        d10.c(p8Var, l.MANIFEST);
                    }
                }
            }
        } else {
            int I = I(c6Var.o0(), d10);
            com.google.android.gms.internal.measurement.q7 S = com.google.android.gms.internal.measurement.r7.S();
            S.z("_npa");
            S.x(e().a());
            S.D(I);
            z6Var.j1((com.google.android.gms.internal.measurement.r7) S.t());
            a().w().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(I));
        }
        z6Var.g0(d10.toString());
        boolean S2 = this.f26456a.S(c6Var.o0());
        List W0 = z6Var.W0();
        int i10 = 0;
        for (int i11 = 0; i11 < W0.size(); i11++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.o6) W0.get(i11)).J())) {
                com.google.android.gms.internal.measurement.n6 n6Var = (com.google.android.gms.internal.measurement.n6) ((com.google.android.gms.internal.measurement.o6) W0.get(i11)).r();
                List x10 = n6Var.x();
                int i12 = 0;
                while (true) {
                    if (i12 >= x10.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.s6) x10.get(i12)).G())) {
                        String J = ((com.google.android.gms.internal.measurement.s6) x10.get(i12)).J();
                        if (S2 && J.length() > 4) {
                            char[] charArray = J.toCharArray();
                            int i13 = 1;
                            while (true) {
                                if (i13 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13)) {
                                    i10 = i13;
                                    break;
                                }
                                i13++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 | 1);
                            J = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.r6 T = com.google.android.gms.internal.measurement.s6.T();
                        T.z("_tcfd");
                        T.C(J);
                        n6Var.D(i12, T);
                    } else {
                        i12++;
                    }
                }
                z6Var.a1(i11, n6Var);
                return;
            }
        }
    }

    public final void n0(zzr zzrVar, long j10) {
        c6 J0 = F0().J0((String) n9.m.l(zzrVar.f7494f));
        if (J0 != null && N0().p(zzrVar.f7495g, J0.r0())) {
            a().r().b("New GMP App Id passed in. Removing cached database data. appId", w5.x(J0.o0()));
            t F0 = F0();
            String o02 = J0.o0();
            F0.j();
            F0.h();
            n9.m.f(o02);
            try {
                SQLiteDatabase u02 = F0.u0();
                String[] strArr = {o02};
                int delete = u02.delete("events", "app_id=?", strArr) + u02.delete("user_attributes", "app_id=?", strArr) + u02.delete("conditional_properties", "app_id=?", strArr) + u02.delete("apps", "app_id=?", strArr) + u02.delete("raw_events", "app_id=?", strArr) + u02.delete("raw_events_metadata", "app_id=?", strArr) + u02.delete("event_filters", "app_id=?", strArr) + u02.delete("property_filters", "app_id=?", strArr) + u02.delete("audience_filter_values", "app_id=?", strArr) + u02.delete("consent_settings", "app_id=?", strArr) + u02.delete("default_event_params", "app_id=?", strArr) + u02.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.se.a();
                g7 g7Var = F0.f26328a;
                if (g7Var.w().H(null, z4.f26877i1)) {
                    delete += u02.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (delete > 0) {
                    g7Var.a().w().c("Deleted application data. app, records", o02, Integer.valueOf(delete));
                }
            } catch (SQLiteException e10) {
                F0.f26328a.a().o().c("Error deleting application data. appId, error", w5.x(o02), e10);
            }
            J0 = null;
        }
        if (J0 != null) {
            boolean z10 = (J0.F0() == -2147483648L || J0.F0() == zzrVar.f7503o) ? false : true;
            String D0 = J0.D0();
            if (z10 || ((J0.F0() != -2147483648L || D0 == null || D0.equals(zzrVar.f7496h)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", D0);
                zzbg zzbgVar = new zzbg("_au", new zzbe(bundle), "auto", j10);
                if (B0().H(null, z4.f26862d1)) {
                    j(zzbgVar, zzrVar);
                } else {
                    k(zzbgVar, zzrVar);
                }
            }
        }
    }

    public final void o(c6 c6Var, com.google.android.gms.internal.measurement.z6 z6Var) {
        b().h();
        O0();
        com.google.android.gms.internal.measurement.s5 h02 = com.google.android.gms.internal.measurement.w5.h0();
        byte[] K2 = c6Var.K();
        if (K2 != null) {
            try {
                h02 = (com.google.android.gms.internal.measurement.s5) re.W(h02, K2);
            } catch (com.google.android.gms.internal.measurement.sb unused) {
                a().r().b("Failed to parse locally stored ad campaign info. appId", w5.x(c6Var.o0()));
            }
        }
        for (com.google.android.gms.internal.measurement.o6 o6Var : z6Var.W0()) {
            if (o6Var.J().equals("_cmp")) {
                String str = (String) re.v(o6Var, "gclid", "");
                String str2 = (String) re.v(o6Var, "gbraid", "");
                String str3 = (String) re.v(o6Var, "gad_source", "");
                String[] split = ((String) z4.f26874h1.b(null)).split(",");
                K0();
                if (!re.s(o6Var, split).isEmpty()) {
                    long longValue = ((Long) re.v(o6Var, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = o6Var.L();
                    }
                    if ("referrer API v2".equals(re.u(o6Var, "_cis"))) {
                        if (longValue > h02.S()) {
                            if (str.isEmpty()) {
                                h02.N();
                            } else {
                                h02.K(str);
                            }
                            if (str2.isEmpty()) {
                                h02.P();
                            } else {
                                h02.O(str2);
                            }
                            if (str3.isEmpty()) {
                                h02.R();
                            } else {
                                h02.Q(str3);
                            }
                            h02.T(longValue);
                            h02.W();
                            h02.X(J(o6Var));
                        }
                    } else if (longValue > h02.G()) {
                        if (str.isEmpty()) {
                            h02.z();
                        } else {
                            h02.x(str);
                        }
                        if (str2.isEmpty()) {
                            h02.C();
                        } else {
                            h02.A(str2);
                        }
                        if (str3.isEmpty()) {
                            h02.E();
                        } else {
                            h02.D(str3);
                        }
                        h02.J(longValue);
                        h02.U();
                        h02.V(J(o6Var));
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.w5) h02.t()).equals(com.google.android.gms.internal.measurement.w5.i0())) {
            z6Var.r0((com.google.android.gms.internal.measurement.w5) h02.t());
        }
        c6Var.J(((com.google.android.gms.internal.measurement.w5) h02.t()).d());
        if (c6Var.A()) {
            F0().K0(c6Var, false, false);
        }
        if (B0().H(null, z4.f26871g1)) {
            F0().z0(c6Var.o0(), "_lgclid");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nb.c6 o0(com.google.android.gms.measurement.internal.zzr r13) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.me.o0(com.google.android.gms.measurement.internal.zzr):nb.c6");
    }

    public final String p(q8 q8Var) {
        if (!q8Var.o(p8.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        N0().q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String p0(zzr zzrVar) {
        try {
            return (String) b().r(new ee(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            a().o().c("Failed to get app instance id. appId", w5.x(zzrVar.f7494f), e10);
            return null;
        }
    }

    public final void q(List list) {
        n9.m.a(!list.isEmpty());
        if (this.f26479y != null) {
            a().o().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f26479y = new ArrayList(list);
        }
    }

    public final List q0(zzr zzrVar, Bundle bundle) {
        b().h();
        vf.a();
        k B0 = B0();
        String str = zzrVar.f7494f;
        if (!B0.H(str, z4.Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().o().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        t F0 = F0();
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        n9.m.f(str);
                        F0.h();
                        F0.j();
                        try {
                            int delete = F0.u0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            u5 w5 = F0.f26328a.a().w();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(delete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            w5.d(sb2.toString(), str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            F0.f26328a.a().o().c("Error pruning trigger URIs. appId", w5.x(str), e10);
                        }
                    }
                }
            }
        }
        t F02 = F0();
        String str2 = zzrVar.f7494f;
        n9.m.f(str2);
        F02.h();
        F02.j();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = F02.u0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", Payload.SOURCE}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e11) {
                F02.f26328a.a().o().c("Error querying trigger uris. appId", w5.x(str2), e11);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        if (r1 == 0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [nb.me] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.me.r():void");
    }

    public final void r0(String str, zzaf zzafVar) {
        b().h();
        O0();
        t F0 = F0();
        long j10 = zzafVar.f7455f;
        pe n10 = F0.n(j10);
        if (n10 == null) {
            a().r().c("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j10));
            return;
        }
        String e10 = n10.e();
        if (zzafVar.f7456g != ya.SUCCESS.zza()) {
            if (zzafVar.f7456g == ya.BACKOFF.zza()) {
                Map map = this.E;
                ke keVar = (ke) map.get(e10);
                if (keVar == null) {
                    keVar = new ke(this);
                    map.put(e10, keVar);
                } else {
                    keVar.a();
                }
                a().w().d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, e10, Long.valueOf((keVar.c() - e().a()) / 1000));
            }
            t F02 = F0();
            Long valueOf = Long.valueOf(zzafVar.f7455f);
            F02.w(valueOf);
            a().w().c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, valueOf);
            return;
        }
        Map map2 = this.E;
        if (map2.containsKey(e10)) {
            map2.remove(e10);
        }
        t F03 = F0();
        Long valueOf2 = Long.valueOf(j10);
        F03.q(valueOf2);
        a().w().c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, valueOf2);
        long j11 = zzafVar.f7457h;
        if (j11 > 0) {
            t F04 = F0();
            F04.h();
            F04.j();
            Long valueOf3 = Long.valueOf(j11);
            n9.m.l(valueOf3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(za.GOOGLE_SIGNAL.zza()));
            g7 g7Var = F04.f26328a;
            contentValues.put("creation_timestamp", Long.valueOf(g7Var.e().a()));
            try {
                if (F04.u0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j11), str, String.valueOf(za.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    g7Var.a().r().c("Google Signal pending batch not updated. appId, rowId", str, valueOf3);
                }
                a().w().c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzafVar.f7457h));
                u(str);
            } catch (SQLiteException e11) {
                F04.f26328a.a().o().d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j11), e11);
                throw e11;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0484, code lost:
    
        if (r23 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x022a, code lost:
    
        if (r10 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:224:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a05  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.String r33, long r34) {
        /*
            Method dump skipped, instructions count: 2569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.me.s(java.lang.String, long):void");
    }

    public final void s0(boolean z10) {
        R();
    }

    public final boolean t(String str, String str2) {
        c6 J0 = F0().J0(str);
        if (J0 != null && N0().P(str, J0.l0())) {
            this.E.remove(str2);
            return true;
        }
        ke keVar = (ke) this.E.get(str2);
        if (keVar == null) {
            return true;
        }
        return keVar.b();
    }

    public final void t0(String str, bb bbVar) {
        b().h();
        String str2 = this.G;
        if (str2 == null || str2.equals(str) || bbVar != null) {
            this.G = str;
            this.F = bbVar;
        }
    }

    public final void u(String str) {
        com.google.android.gms.internal.measurement.y6 d10;
        b().h();
        O0();
        this.f26476v = true;
        try {
            g7 g7Var = this.f26466l;
            g7Var.c();
            Boolean x10 = g7Var.J().x();
            if (x10 == null) {
                a().r().a("Upload data called on the client side before use of service was decided");
            } else if (x10.booleanValue()) {
                a().o().a("Upload called in the client side when service should be used");
            } else if (this.f26469o > 0) {
                R();
            } else if (!E0().m()) {
                a().w().a("Network not connected, ignoring upload request");
                R();
            } else if (F0().p(str)) {
                t F0 = F0();
                n9.m.f(str);
                F0.h();
                F0.j();
                List o8 = F0.o(str, zzoo.a(za.GOOGLE_SIGNAL), 1);
                pe peVar = o8.isEmpty() ? null : (pe) o8.get(0);
                if (peVar != null && (d10 = peVar.d()) != null) {
                    a().w().d("[sgtm] Uploading data from upload queue. appId, type, url", str, peVar.f(), peVar.e());
                    byte[] d11 = d10.d();
                    if (Log.isLoggable(a().z(), 2)) {
                        a().w().d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(d11.length), K0().K(d10));
                    }
                    yd a10 = peVar.a();
                    this.f26475u = true;
                    E0().n(str, a10, d10, new ce(this, str, peVar));
                }
            } else {
                a().w().b("[sgtm] Upload queue has no batches for appId", str);
            }
            this.f26476v = false;
            S();
        } catch (Throwable th2) {
            this.f26476v = false;
            S();
            throw th2;
        }
    }

    public final /* synthetic */ void u0(ne neVar) {
        b().h();
        this.f26465k = new n6(this);
        t tVar = new t(this);
        tVar.k();
        this.f26457c = tVar;
        B0().t((j) n9.m.l(this.f26456a));
        vc vcVar = new vc(this);
        vcVar.k();
        this.f26463i = vcVar;
        e eVar = new e(this);
        eVar.k();
        this.f26460f = eVar;
        wa waVar = new wa(this);
        waVar.k();
        this.f26462h = waVar;
        sd sdVar = new sd(this);
        sdVar.k();
        this.f26459e = sdVar;
        this.f26458d = new e6(this);
        if (this.f26472r != this.f26473s) {
            a().o().c("Not all upload components initialized", Integer.valueOf(this.f26472r), Integer.valueOf(this.f26473s));
        }
        this.f26467m.set(true);
        a().w().a("UploadController is now fully initialized");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(@androidx.annotation.NonNull java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, nb.pe r8) {
        /*
            r3 = this;
            nb.c7 r0 = r3.b()
            r0.h()
            r3.O0()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto L9b
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L5a
            r5 = r1
        L1c:
            if (r6 != 0) goto L5a
            nb.t r6 = r3.F0()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.q(r7)     // Catch: java.lang.Throwable -> L10
            nb.w5 r6 = r3.a()     // Catch: java.lang.Throwable -> L10
            nb.u5 r6 = r6.w()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.c(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            nb.b6 r5 = r3.E0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.m()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            nb.t r5 = r3.F0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.p(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            r3.u(r4)     // Catch: java.lang.Throwable -> L10
            goto L95
        L56:
            r3.R()     // Catch: java.lang.Throwable -> L10
            goto L95
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            nb.w5 r1 = r3.a()     // Catch: java.lang.Throwable -> L10
            nb.u5 r1 = r1.t()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L80
            r6 = r7
        L80:
            r1.d(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            nb.t r4 = r3.F0()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.w(r5)     // Catch: java.lang.Throwable -> L10
            r3.R()     // Catch: java.lang.Throwable -> L10
        L95:
            r3.f26475u = r0
            r3.S()
            return
        L9b:
            r3.f26475u = r0
            r3.S()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.me.v(java.lang.String, int, java.lang.Throwable, byte[], nb.pe):void");
    }

    public final void w(String str, boolean z10, Long l10, Long l11) {
        c6 J0 = F0().J0(str);
        if (J0 != null) {
            J0.e0(z10);
            J0.g0(l10);
            J0.i0(l11);
            if (J0.A()) {
                F0().K0(J0, false, false);
            }
        }
    }

    public final void x(String str, com.google.android.gms.internal.measurement.z6 z6Var) {
        int X;
        int indexOf;
        Set F = D0().F(str);
        if (F != null) {
            z6Var.S0(F);
        }
        if (D0().J(str)) {
            z6Var.G();
        }
        if (D0().K(str)) {
            String C = z6Var.C();
            if (!TextUtils.isEmpty(C) && (indexOf = C.indexOf(".")) != -1) {
                z6Var.D(C.substring(0, indexOf));
            }
        }
        if (D0().L(str) && (X = re.X(z6Var, "_id")) != -1) {
            z6Var.m1(X);
        }
        if (D0().M(str)) {
            z6Var.J0();
        }
        if (D0().N(str)) {
            z6Var.b0();
            if (g(str).o(p8.ANALYTICS_STORAGE)) {
                Map map = this.D;
                je jeVar = (je) map.get(str);
                if (jeVar == null || jeVar.b + B0().D(str, z4.f26885l0) < e().b()) {
                    jeVar = new je(this, (byte[]) null);
                    map.put(str, jeVar);
                }
                z6Var.T0(jeVar.f26348a);
            }
        }
        if (D0().O(str)) {
            z6Var.R0();
        }
    }

    public final /* synthetic */ g7 x0() {
        return this.f26466l;
    }

    public final void y(com.google.android.gms.internal.measurement.z6 z6Var, ie ieVar) {
        for (int i10 = 0; i10 < z6Var.X0(); i10++) {
            com.google.android.gms.internal.measurement.n6 n6Var = (com.google.android.gms.internal.measurement.n6) z6Var.Y0(i10).r();
            Iterator it = n6Var.x().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.s6) it.next()).G())) {
                    if (ieVar.f26315a.Z0() >= B0().E(ieVar.f26315a.F(), z4.f26888m0)) {
                        int E = B0().E(ieVar.f26315a.F(), z4.f26914z0);
                        String str = null;
                        if (E <= 0) {
                            if (B0().H(ieVar.f26315a.F(), z4.S0)) {
                                str = N0().l0();
                                com.google.android.gms.internal.measurement.r6 T = com.google.android.gms.internal.measurement.s6.T();
                                T.z("_tu");
                                T.C(str);
                                n6Var.E((com.google.android.gms.internal.measurement.s6) T.t());
                            }
                            com.google.android.gms.internal.measurement.r6 T2 = com.google.android.gms.internal.measurement.s6.T();
                            T2.z("_tr");
                            T2.E(1L);
                            n6Var.E((com.google.android.gms.internal.measurement.s6) T2.t());
                            zzoh I = K0().I(ieVar.f26315a.F(), z6Var, n6Var, str);
                            if (I != null) {
                                a().w().c("Generated trigger URI. appId, uri", ieVar.f26315a.F(), I.f7475f);
                                F0().K(ieVar.f26315a.F(), I);
                                Deque deque = this.f26471q;
                                if (!deque.contains(ieVar.f26315a.F())) {
                                    deque.add(ieVar.f26315a.F());
                                }
                            }
                        } else if (F0().L0(h(), ieVar.f26315a.F(), false, false, false, false, false, false, true).f26541g > E) {
                            com.google.android.gms.internal.measurement.r6 T3 = com.google.android.gms.internal.measurement.s6.T();
                            T3.z("_tnr");
                            T3.E(1L);
                            n6Var.E((com.google.android.gms.internal.measurement.s6) T3.t());
                        } else {
                            if (B0().H(ieVar.f26315a.F(), z4.S0)) {
                                str = N0().l0();
                                com.google.android.gms.internal.measurement.r6 T4 = com.google.android.gms.internal.measurement.s6.T();
                                T4.z("_tu");
                                T4.C(str);
                                n6Var.E((com.google.android.gms.internal.measurement.s6) T4.t());
                            }
                            com.google.android.gms.internal.measurement.r6 T5 = com.google.android.gms.internal.measurement.s6.T();
                            T5.z("_tr");
                            T5.E(1L);
                            n6Var.E((com.google.android.gms.internal.measurement.s6) T5.t());
                            zzoh I2 = K0().I(ieVar.f26315a.F(), z6Var, n6Var, str);
                            if (I2 != null) {
                                a().w().c("Generated trigger URI. appId, uri", ieVar.f26315a.F(), I2.f7475f);
                                F0().K(ieVar.f26315a.F(), I2);
                                Deque deque2 = this.f26471q;
                                if (!deque2.contains(ieVar.f26315a.F())) {
                                    deque2.add(ieVar.f26315a.F());
                                }
                            }
                        }
                    }
                    z6Var.Z0(i10, (com.google.android.gms.internal.measurement.o6) n6Var.t());
                }
            }
        }
    }

    public final /* synthetic */ Deque y0() {
        return this.f26471q;
    }

    public final void z(String str, com.google.android.gms.internal.measurement.r6 r6Var, Bundle bundle, String str2) {
        List b = u9.f.b("_o", "_sn", "_sc", "_si");
        long y10 = (ve.N(r6Var.x()) || ve.N(str)) ? B0().y(str2, true) : B0().x(str2, true);
        long codePointCount = r6Var.A().codePointCount(0, r6Var.A().length());
        ve N0 = N0();
        String x10 = r6Var.x();
        B0();
        String q10 = N0.q(x10, 40, true);
        if (codePointCount <= y10 || b.contains(r6Var.x())) {
            return;
        }
        if ("_ev".equals(r6Var.x())) {
            bundle.putString("_ev", N0().q(r6Var.A(), B0().y(str2, true), true));
            return;
        }
        a().t().c("Param value is too long; discarded. Name, value length", q10, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", q10);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(r6Var.x());
    }

    public final /* synthetic */ void z0(long j10) {
        this.I = j10;
    }
}
