package ka;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity;
import com.google.android.gms.games.internal.v2.appshortcuts.zzg;
import com.google.android.gms.games.internal.v2.appshortcuts.zzi;
import com.google.android.gms.games.internal.v2.appshortcuts.zzr;
import com.google.android.gms.tasks.Task;
import fb.j1;
import fb.n1;
import fb.r1;
import fb.t1;
import fb.v0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22470a;

    public d(Context context) {
        super(null);
        this.f22470a = context.getApplicationContext();
    }

    public static /* synthetic */ zzg d(n1 n1Var, n1 n1Var2, Task task) {
        return task.isSuccessful() ? (zzg) task.getResult() : e(n1Var, n1Var2);
    }

    public static zzg e(n1 n1Var, n1 n1Var2) {
        return new zzg(f(n1Var), n1.f(), f(n1Var2), n1.f());
    }

    public static n1 f(n1 n1Var) {
        r1 r1Var = n1.b;
        j1 j1Var = new j1();
        int size = n1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            String zza = ((zzi) n1Var.get(i10)).zza();
            if (zza != null) {
                j1Var.d(zza);
            }
        }
        return j1Var.e();
    }

    public static n1 g(List list) {
        r1 r1Var = n1.b;
        j1 j1Var = new j1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
            if (!shortcutInfo.isImmutable() && shortcutInfo.getId().startsWith("PLAY_GAMES_SERVICES_")) {
                j1Var.d(new zzi(shortcutInfo.getId(), shortcutInfo.getExtras(), Boolean.valueOf(shortcutInfo.isPinned()), Boolean.valueOf(shortcutInfo.isEnabled())));
            }
        }
        return j1Var.e();
    }

    @Override // ka.e
    public final void a() {
        v0.a();
        new Thread(new Runnable() { // from class: ka.c
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                d.this.c();
            }
        }, "initialize-shortcuts").start();
    }

    public final /* synthetic */ void c() {
        Task f10;
        Context context = this.f22470a;
        final ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager == null) {
            return;
        }
        final zzr a10 = p.a(context, PlayGamesAppShortcutsActivity.class);
        final n1 g10 = g(shortcutManager.getDynamicShortcuts());
        final n1 g11 = g(shortcutManager.getPinnedShortcuts());
        if (a10 == null || a10.zza() <= 0) {
            f10 = sb.m.f(e(g10, g11));
        } else {
            final n nVar = new n(context);
            f10 = nVar.z(l9.u.c().e(6744).d(da.j.f14463g).c(false).b(new l9.q() { // from class: ka.m
                /* JADX WARN: Multi-variable type inference failed */
                @Override // l9.q
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    ((r) ((q) obj).getService()).t2(new i(n.this, (sb.k) obj2), a10, g10, g11);
                }
            }).a()).h(t1.a(), new sb.c() { // from class: ka.b
                @Override // sb.c
                public final /* synthetic */ Object then(Task task) {
                    return d.d(n1.this, g11, task);
                }
            });
        }
        f10.f(t1.a(), new sb.g() { // from class: ka.a
            @Override // sb.g
            public final /* synthetic */ void onSuccess(Object obj) {
                zzg zzgVar = (zzg) obj;
                List<String> zza = zzgVar.zza();
                ShortcutManager shortcutManager2 = shortcutManager;
                if (zza != null && !zza.isEmpty()) {
                    shortcutManager2.removeDynamicShortcuts(zza);
                }
                List<ShortcutInfo> zzb = zzgVar.zzb();
                if (zzb != null && !zzb.isEmpty()) {
                    shortcutManager2.addDynamicShortcuts(zzb);
                }
                List<String> v32 = zzgVar.v3();
                if (v32 != null && !v32.isEmpty()) {
                    shortcutManager2.disableShortcuts(v32);
                }
                List<String> zzd = zzgVar.zzd();
                if (zzd == null || zzd.isEmpty()) {
                    return;
                }
                shortcutManager2.enableShortcuts(zzd);
            }
        });
    }
}
