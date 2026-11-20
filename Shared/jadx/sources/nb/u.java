package nb;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes.dex */
public final class u {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[Catch: SQLiteException -> 0x00b9, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:14:0x0046, B:17:0x0076, B:19:0x0084, B:21:0x008c, B:23:0x008f, B:24:0x00b8, B:28:0x00be, B:30:0x00c1, B:32:0x00c9, B:34:0x00d0, B:37:0x00d3, B:39:0x00d9, B:44:0x00ea, B:45:0x00ee, B:16:0x006f), top: B:13:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be A[Catch: SQLiteException -> 0x00b9, LOOP:1: B:28:0x00be->B:34:0x00d0, LOOP_START, PHI: r1
  0x00be: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:27:0x00bc, B:34:0x00d0] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:14:0x0046, B:17:0x0076, B:19:0x0084, B:21:0x008c, B:23:0x008f, B:24:0x00b8, B:28:0x00be, B:30:0x00c1, B:32:0x00c9, B:34:0x00d0, B:37:0x00d3, B:39:0x00d9, B:44:0x00ea, B:45:0x00ee, B:16:0x006f), top: B:13:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9 A[Catch: SQLiteException -> 0x00b9, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:14:0x0046, B:17:0x0076, B:19:0x0084, B:21:0x008c, B:23:0x008f, B:24:0x00b8, B:28:0x00be, B:30:0x00c1, B:32:0x00c9, B:34:0x00d0, B:37:0x00d3, B:39:0x00d9, B:44:0x00ea, B:45:0x00ee, B:16:0x006f), top: B:13:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(nb.w5 r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.u.a(nb.w5, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void b(w5 w5Var, SQLiteDatabase sQLiteDatabase) {
        if (w5Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.y0.a();
        String path = sQLiteDatabase.getPath();
        com.google.android.gms.internal.measurement.e1 e1Var = com.google.android.gms.internal.measurement.e1.f6470a;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            w5Var.r().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            w5Var.r().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            w5Var.r().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        w5Var.r().a("Failed to turn on database write permission for owner");
    }
}
