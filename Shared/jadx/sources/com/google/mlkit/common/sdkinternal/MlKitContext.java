package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import mf.c;
import mf.f;
import mf.o;
import n9.m;
import sb.l;

/* loaded from: classes2.dex */
public class MlKitContext {
    private static final Object zza = new Object();
    private static MlKitContext zzb;
    private o zzc;

    private MlKitContext() {
    }

    @NonNull
    public static MlKitContext getInstance() {
        MlKitContext mlKitContext;
        synchronized (zza) {
            m.q(zzb != null, "MlKitContext has not been initialized");
            mlKitContext = (MlKitContext) m.l(zzb);
        }
        return mlKitContext;
    }

    @NonNull
    public static MlKitContext initialize(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            try {
                m.q(zzb == null, "MlKitContext is already initialized");
                MlKitContext mlKitContext2 = new MlKitContext();
                zzb = mlKitContext2;
                Context zzc = zzc(context);
                HashMap hashMap = new HashMap();
                for (ComponentRegistrar componentRegistrar : list) {
                    hashMap.put(componentRegistrar.getClass(), componentRegistrar);
                }
                o oVar = new o(l.f31006a, new ArrayList(hashMap.values()), c.q(zzc, Context.class, new Class[0]), c.q(mlKitContext2, MlKitContext.class, new Class[0]));
                mlKitContext2.zzc = oVar;
                oVar.o(true);
                mlKitContext = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mlKitContext;
    }

    @NonNull
    public static MlKitContext initializeIfNeeded(@NonNull Context context) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = zza(context);
            }
        }
        return mlKitContext;
    }

    @NonNull
    public static MlKitContext zza(@NonNull Context context) {
        MlKitContext zzb2;
        synchronized (zza) {
            zzb2 = zzb(context, l.f31006a);
        }
        return zzb2;
    }

    @NonNull
    public static MlKitContext zzb(@NonNull Context context, @NonNull Executor executor) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            m.q(zzb == null, "MlKitContext is already initialized");
            MlKitContext mlKitContext2 = new MlKitContext();
            zzb = mlKitContext2;
            Context zzc = zzc(context);
            o e10 = o.l(executor).d(f.c(zzc, MlKitComponentDiscoveryService.class).b()).b(c.q(zzc, Context.class, new Class[0])).b(c.q(mlKitContext2, MlKitContext.class, new Class[0])).e();
            mlKitContext2.zzc = e10;
            e10.o(true);
            mlKitContext = zzb;
        }
        return mlKitContext;
    }

    private static Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @NonNull
    public <T> T get(@NonNull Class<T> cls) {
        m.q(zzb == this, "MlKitContext has been deleted");
        m.l(this.zzc);
        return (T) this.zzc.a(cls);
    }

    @NonNull
    public Context getApplicationContext() {
        return (Context) get(Context.class);
    }

    @NonNull
    public static MlKitContext initializeIfNeeded(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = initialize(context, list);
            }
        }
        return mlKitContext;
    }

    @NonNull
    public static MlKitContext initializeIfNeeded(@NonNull Context context, @NonNull Executor executor) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = zzb(context, executor);
            }
        }
        return mlKitContext;
    }
}
