package nb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;

/* loaded from: classes.dex */
public final class n5 extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f26486e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: c, reason: collision with root package name */
    public final l5 f26487c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26488d;

    public n5(g7 g7Var) {
        super(g7Var);
        Context d10 = this.f26328a.d();
        this.f26328a.w();
        this.f26487c = new l5(this, d10, "google_app_measurement_local.db");
    }

    @Override // nb.b5
    public final boolean m() {
        return false;
    }

    public final void o() {
        int delete;
        h();
        try {
            SQLiteDatabase w5 = w();
            if (w5 == null || (delete = w5.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f26328a.a().w().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            this.f26328a.a().o().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean p(zzbg zzbgVar) {
        Parcel obtain = Parcel.obtain();
        e0.a(zzbgVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return z(0, marshall);
        }
        this.f26328a.a().p().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean q(zzpl zzplVar) {
        Parcel obtain = Parcel.obtain();
        se.a(zzplVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return z(1, marshall);
        }
        this.f26328a.a().p().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean r(zzah zzahVar) {
        g7 g7Var = this.f26328a;
        byte[] T = g7Var.C().T(zzahVar);
        if (T.length <= 131072) {
            return z(2, T);
        }
        g7Var.a().p().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean s(zzbe zzbeVar) {
        g7 g7Var = this.f26328a;
        byte[] T = g7Var.C().T(zzbeVar);
        if (T == null) {
            g7Var.a().p().a("Null default event parameters; not writing to database");
            return false;
        }
        if (T.length <= 131072) {
            return z(4, T);
        }
        g7Var.a().p().a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0218 A[Catch: SQLiteDatabaseLockedException -> 0x0121, SQLiteException -> 0x01f5, SQLiteFullException -> 0x01f8, all -> 0x036a, TryCatch #4 {all -> 0x036a, blocks: (B:75:0x00de, B:77:0x00e4, B:80:0x00f7, B:82:0x00fd, B:169:0x0134, B:178:0x014c, B:180:0x0151, B:46:0x032f, B:48:0x0335, B:40:0x0338, B:19:0x035a, B:31:0x0376, B:188:0x0186, B:189:0x0189, B:192:0x0182, B:87:0x019c, B:90:0x01b0, B:96:0x01cb, B:101:0x01d4, B:102:0x01d7, B:99:0x01c5, B:105:0x01db, B:113:0x01f1, B:115:0x0218, B:123:0x0222, B:124:0x0225, B:129:0x0212, B:136:0x022b, B:144:0x023f, B:146:0x0264, B:153:0x026e, B:154:0x0271, B:157:0x025e, B:164:0x0276, B:166:0x0286, B:211:0x02c5, B:213:0x02e2, B:214:0x02f1), top: B:45:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0264 A[Catch: SQLiteException -> 0x0243, SQLiteFullException -> 0x0246, SQLiteDatabaseLockedException -> 0x0359, all -> 0x036a, TryCatch #4 {all -> 0x036a, blocks: (B:75:0x00de, B:77:0x00e4, B:80:0x00f7, B:82:0x00fd, B:169:0x0134, B:178:0x014c, B:180:0x0151, B:46:0x032f, B:48:0x0335, B:40:0x0338, B:19:0x035a, B:31:0x0376, B:188:0x0186, B:189:0x0189, B:192:0x0182, B:87:0x019c, B:90:0x01b0, B:96:0x01cb, B:101:0x01d4, B:102:0x01d7, B:99:0x01c5, B:105:0x01db, B:113:0x01f1, B:115:0x0218, B:123:0x0222, B:124:0x0225, B:129:0x0212, B:136:0x022b, B:144:0x023f, B:146:0x0264, B:153:0x026e, B:154:0x0271, B:157:0x025e, B:164:0x0276, B:166:0x0286, B:211:0x02c5, B:213:0x02e2, B:214:0x02f1), top: B:45:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a2  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List t(int r30) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.n5.t(int):java.util.List");
    }

    public final boolean u() {
        return z(3, new byte[0]);
    }

    public final boolean v() {
        h();
        if (!this.f26488d && x()) {
            int i10 = 5;
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    this.f26328a.a().r().a("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase w5 = w();
                            if (w5 != null) {
                                w5.beginTransaction();
                                w5.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                w5.setTransactionSuccessful();
                                w5.endTransaction();
                                w5.close();
                                return true;
                            }
                            this.f26488d = true;
                        } catch (SQLiteFullException e10) {
                            this.f26328a.a().o().b("Error deleting app launch break from local database", e10);
                            this.f26488d = true;
                            if (0 == 0) {
                            }
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteException e11) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th2) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th2;
                            }
                        }
                        this.f26328a.a().o().b("Error deleting app launch break from local database", e11);
                        this.f26488d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i10);
                    i10 += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i11++;
            }
        }
        return false;
    }

    public final SQLiteDatabase w() {
        if (this.f26488d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f26487c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f26488d = true;
        return null;
    }

    public final boolean x() {
        g7 g7Var = this.f26328a;
        Context d10 = g7Var.d();
        g7Var.w();
        return d10.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.n5.z(int, byte[]):boolean");
    }
}
