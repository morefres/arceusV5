package com.google.mlkit.common.sdkinternal;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import n9.m;

/* loaded from: classes2.dex */
final class zzx implements Closeable {
    final /* synthetic */ TaskQueue zza;

    public /* synthetic */ zzx(TaskQueue taskQueue, zzw zzwVar) {
        AtomicReference atomicReference;
        this.zza = taskQueue;
        atomicReference = taskQueue.zzd;
        m.p(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.zza.zzd;
        atomicReference.set(null);
        this.zza.zzc();
    }
}
