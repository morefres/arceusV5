package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class b3 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f6436a;

    public b3(v3 v3Var) {
        Objects.requireNonNull(v3Var);
        this.f6436a = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6436a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
