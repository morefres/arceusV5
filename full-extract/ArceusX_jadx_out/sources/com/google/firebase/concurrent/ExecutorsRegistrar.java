package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kf.a;
import kf.d;
import mf.c;
import mf.e0;
import mf.g;
import mf.x;
import nf.o;
import yf.b;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final x<ScheduledExecutorService> f8744a = new x<>(new b() { // from class: nf.q
        @Override // yf.b
        public final Object get() {
            ScheduledExecutorService m10;
            m10 = ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
            return m10;
        }
    });
    public static final x<ScheduledExecutorService> b = new x<>(new b() { // from class: nf.r
        @Override // yf.b
        public final Object get() {
            ScheduledExecutorService m10;
            m10 = ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
            return m10;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final x<ScheduledExecutorService> f8745c = new x<>(new b() { // from class: nf.s
        @Override // yf.b
        public final Object get() {
            ScheduledExecutorService m10;
            m10 = ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
            return m10;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final x<ScheduledExecutorService> f8746d = new x<>(new b() { // from class: nf.t
        @Override // yf.b
        public final Object get() {
            ScheduledExecutorService newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
            return newSingleThreadScheduledExecutor;
        }
    });

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        detectNetwork.detectUnbufferedIo();
        return detectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i10) {
        return new nf.b(str, i10, null);
    }

    public static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new nf.b(str, i10, threadPolicy);
    }

    public static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, f8746d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.f(e0.a(a.class, ScheduledExecutorService.class), e0.a(a.class, ExecutorService.class), e0.a(a.class, Executor.class)).f(new g() { // from class: nf.u
            @Override // mf.g
            public final Object create(mf.d dVar) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.f8744a.get();
                return scheduledExecutorService;
            }
        }).d(), c.f(e0.a(kf.b.class, ScheduledExecutorService.class), e0.a(kf.b.class, ExecutorService.class), e0.a(kf.b.class, Executor.class)).f(new g() { // from class: nf.v
            @Override // mf.g
            public final Object create(mf.d dVar) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.f8745c.get();
                return scheduledExecutorService;
            }
        }).d(), c.f(e0.a(kf.c.class, ScheduledExecutorService.class), e0.a(kf.c.class, ExecutorService.class), e0.a(kf.c.class, Executor.class)).f(new g() { // from class: nf.w
            @Override // mf.g
            public final Object create(mf.d dVar) {
                ScheduledExecutorService scheduledExecutorService;
                scheduledExecutorService = ExecutorsRegistrar.b.get();
                return scheduledExecutorService;
            }
        }).d(), c.e(e0.a(d.class, Executor.class)).f(new g() { // from class: nf.x
            @Override // mf.g
            public final Object create(mf.d dVar) {
                Executor executor;
                executor = a0.INSTANCE;
                return executor;
            }
        }).d());
    }
}
