package y5;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Ly5/i0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)V", "", "Ljava/io/File;", rl.d.f30696a, "(Landroid/content/Context;)Ljava/util/Map;", j6.b.f21518e, "(Landroid/content/Context;)Ljava/io/File;", ve.a.f33391e, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i0 f36399a = new i0();

    public static final void c(@NotNull Context context) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        i0 i0Var = f36399a;
        if (i0Var.b(context).exists()) {
            x5.w e10 = x5.w.e();
            str = j0.f36403a;
            e10.a(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : i0Var.d(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        x5.w e11 = x5.w.e();
                        str3 = j0.f36403a;
                        e11.k(str3, "Over-writing contents of " + value);
                    }
                    String str4 = key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed";
                    x5.w e12 = x5.w.e();
                    str2 = j0.f36403a;
                    e12.a(str2, str4);
                }
            }
        }
    }

    @NotNull
    public final File a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "getNoBackupFilesDir(...)");
        return noBackupFilesDir;
    }

    @NotNull
    public final File b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "getDatabasePath(...)");
        return databasePath;
    }

    @NotNull
    public final Map<File, File> d(@NotNull Context context) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        File b = b(context);
        File a10 = a(context);
        strArr = j0.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(kotlin.collections.j0.f(strArr.length), 16));
        for (String str : strArr) {
            Pair a11 = gt.s.a(new File(b.getPath() + str), new File(a10.getPath() + str));
            linkedHashMap.put(a11.c(), a11.d());
        }
        return kotlin.collections.k0.q(linkedHashMap, gt.s.a(b, a10));
    }
}
