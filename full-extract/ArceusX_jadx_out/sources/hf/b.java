package hf;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ff.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import n9.m;

/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f19406c;

    /* renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f19407a;
    public final Map b;

    public b(AppMeasurementSdk appMeasurementSdk) {
        m.l(appMeasurementSdk);
        this.f19407a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    @NonNull
    public static a c(@NonNull e eVar, @NonNull Context context, @NonNull vf.d dVar) {
        m.l(eVar);
        m.l(context);
        m.l(dVar);
        m.l(context.getApplicationContext());
        if (f19406c == null) {
            synchronized (b.class) {
                try {
                    if (f19406c == null) {
                        Bundle bundle = new Bundle(1);
                        if (eVar.t()) {
                            dVar.a(ff.b.class, new Executor() { // from class: hf.d
                                @Override // java.util.concurrent.Executor
                                public final /* synthetic */ void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new vf.b() { // from class: hf.c
                                @Override // vf.b
                                public final /* synthetic */ void a(vf.a aVar) {
                                    b.d(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.s());
                        }
                        f19406c = new b(v3.r(context, bundle).s());
                    }
                } finally {
                }
            }
        }
        return f19406c;
    }

    public static /* synthetic */ void d(vf.a aVar) {
        boolean z10 = ((ff.b) aVar.a()).f17168a;
        synchronized (b.class) {
            ((b) m.l(f19406c)).f19407a.zza(z10);
        }
    }

    @Override // hf.a
    public void a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (jf.b.a(str) && jf.b.b(str2, bundle) && jf.b.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f19407a.logEvent(str, str2, bundle);
        }
    }

    @Override // hf.a
    public void b(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (jf.b.a(str) && jf.b.c(str, str2)) {
            this.f19407a.setUserProperty(str, str2, obj);
        }
    }
}
