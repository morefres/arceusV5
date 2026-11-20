package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
enum zzh implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        Handler handler;
        handler = MLTaskExecutor.getInstance().zzc;
        handler.post(runnable);
    }
}
