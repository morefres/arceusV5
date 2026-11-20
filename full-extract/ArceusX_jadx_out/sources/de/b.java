package de;

import ae.v0;
import ae.x0;
import android.content.Context;
import be.u0;
import java.io.File;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static a f14574a;

    public static a a(Context context) {
        try {
            File zzb = x0.a(context).zzb();
            if (zzb == null) {
                throw new sd.a("Failed to retrieve local testing directory path");
            }
            if (zzb.exists()) {
                return b(context, zzb);
            }
            throw new sd.a(String.format("Local testing directory not found: %s", zzb));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static synchronized a b(Context context, File file) {
        a aVar;
        synchronized (b.class) {
            try {
                a aVar2 = f14574a;
                if (aVar2 == null) {
                    f14574a = c(context, file);
                } else if (!aVar2.g().getAbsolutePath().equals(file.getAbsolutePath())) {
                    throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", f14574a.g().getAbsolutePath(), file.getAbsolutePath()));
                }
                aVar = f14574a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static a c(Context context, final File file) {
        zd.a.a(context);
        return new a(context, file, new v0(context, context.getPackageName()), new u0() { // from class: de.s
            @Override // be.u0
            public final Object zza() {
                return d.a(file);
            }
        });
    }
}
