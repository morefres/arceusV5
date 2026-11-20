package g6;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import f6.Preference;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f18385a;

    public w(WorkDatabase workDatabase) {
        this.f18385a = workDatabase;
    }

    public static void c(Context context, g5.c cVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            cVar.G();
            try {
                cVar.p0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                cVar.p0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                cVar.n0();
            } finally {
                cVar.E0();
            }
        }
    }

    public long a() {
        Long b = this.f18385a.Y().b("last_force_stop_ms");
        if (b != null) {
            return b.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long b = this.f18385a.Y().b("reschedule_needed");
        return b != null && b.longValue() == 1;
    }

    public void d(long j10) {
        this.f18385a.Y().a(new Preference("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f18385a.Y().a(new Preference("reschedule_needed", z10));
    }
}
