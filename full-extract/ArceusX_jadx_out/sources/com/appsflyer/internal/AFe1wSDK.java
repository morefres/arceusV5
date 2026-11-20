package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFe1wSDK {

    @NotNull
    private final ExecutorService AFKeystoreWrapper;

    @NotNull
    private final Timer AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Set<AFe1zSDK> f5361d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final NavigableSet<AFe1ySDK<?>> f5362e;

    @NotNull
    private final Set<AFe1zSDK> force;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final NavigableSet<AFe1ySDK<?>> f5363i;

    @NotNull
    private Executor registerClient;

    @NotNull
    public final List<AFe1vSDK> unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final List<AFe1ySDK<?>> f5364v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final Set<AFe1ySDK<?>> f5365w;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFa1ySDK.values().length];
            try {
                iArr[AFa1ySDK.registerClient.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFa1ySDK.f5366d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFa1ySDK.AFKeystoreWrapper.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFKeystoreWrapper = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;", "", "<init>", "(Ljava/lang/String;I)V", "AFKeystoreWrapper", "registerClient", rl.d.f30696a}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AFa1ySDK {
        public static final AFa1ySDK AFKeystoreWrapper;
        private static final /* synthetic */ AFa1ySDK[] AFLogger;

        /* renamed from: d, reason: collision with root package name */
        public static final AFa1ySDK f5366d;
        public static final AFa1ySDK registerClient;

        static {
            AFa1ySDK aFa1ySDK = new AFa1ySDK("Admitted", 0);
            AFKeystoreWrapper = aFa1ySDK;
            AFa1ySDK aFa1ySDK2 = new AFa1ySDK("Duplicate", 1);
            registerClient = aFa1ySDK2;
            AFa1ySDK aFa1ySDK3 = new AFa1ySDK("Skipped", 2);
            f5366d = aFa1ySDK3;
            AFa1ySDK[] aFa1ySDKArr = {aFa1ySDK, aFa1ySDK2, aFa1ySDK3};
            AFLogger = aFa1ySDKArr;
            pt.b.a(aFa1ySDKArr);
        }

        private AFa1ySDK(String str, int i10) {
        }

        public static AFa1ySDK valueOf(String str) {
            return (AFa1ySDK) Enum.valueOf(AFa1ySDK.class, str);
        }

        public static AFa1ySDK[] values() {
            return (AFa1ySDK[]) AFLogger.clone();
        }
    }

    public AFe1wSDK(@NotNull ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "");
        this.AFKeystoreWrapper = executorService;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.registerClient = newSingleThreadExecutor;
        this.AFLogger = new Timer(true);
        this.unregisterClient = new CopyOnWriteArrayList();
        this.f5361d = new CopyOnWriteArraySet();
        Set<AFe1zSDK> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "");
        this.force = newSetFromMap;
        this.f5363i = new ConcurrentSkipListSet();
        this.f5362e = new ConcurrentSkipListSet();
        this.f5364v = new ArrayList();
        Set<AFe1ySDK<?>> newSetFromMap2 = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap2, "");
        this.f5365w = newSetFromMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFe1wSDK aFe1wSDK, AFe1ySDK aFe1ySDK) {
        Iterator<AFe1vSDK> it = aFe1wSDK.unregisterClient.iterator();
        while (it.hasNext()) {
            it.next().registerClient(aFe1ySDK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFLogger(final AFe1wSDK aFe1wSDK) {
        synchronized (aFe1wSDK.f5363i) {
            final AFe1ySDK<?> pollFirst = aFe1wSDK.f5363i.pollFirst();
            if (pollFirst == null) {
                return;
            }
            aFe1wSDK.f5365w.add(pollFirst);
            long d10 = pollFirst.d();
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "");
            AFe1sSDK aFe1sSDK = new AFe1sSDK(currentThread);
            if (d10 > 0) {
                aFe1wSDK.AFLogger.schedule(aFe1sSDK, d10);
            }
            aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.k0
                @Override // java.lang.Runnable
                public final void run() {
                    AFe1wSDK.AFKeystoreWrapper(AFe1wSDK.this, pollFirst);
                }
            });
            if (!aFe1wSDK.f5363i.isEmpty()) {
                aFe1wSDK.AFKeystoreWrapper.submit(new i0(aFe1wSDK));
            }
            try {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "starting task execution: " + pollFirst, false, 4, null);
                final AFd1cSDK call = pollFirst.call();
                aFe1sSDK.cancel();
                aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1wSDK.unregisterClient(AFe1ySDK.this, call, aFe1wSDK);
                    }
                });
            } catch (InterruptedIOException unused) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "task was interrupted: " + pollFirst, false, 4, null);
                final AFd1cSDK aFd1cSDK = AFd1cSDK.unregisterClient;
                pollFirst.e = aFd1cSDK;
                aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1wSDK.unregisterClient(AFe1ySDK.this, aFd1cSDK, aFe1wSDK);
                    }
                });
            } catch (InterruptedException unused2) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "task was interrupted: " + pollFirst, false, 4, null);
                final AFd1cSDK aFd1cSDK2 = AFd1cSDK.unregisterClient;
                pollFirst.e = aFd1cSDK2;
                aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1wSDK.unregisterClient(AFe1ySDK.this, aFd1cSDK2, aFe1wSDK);
                    }
                });
            } catch (Throwable unused3) {
                aFe1sSDK.cancel();
                final AFd1cSDK aFd1cSDK3 = AFd1cSDK.registerClient;
                aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1wSDK.unregisterClient(AFe1ySDK.this, aFd1cSDK3, aFe1wSDK);
                    }
                });
            }
        }
    }

    private final AFa1ySDK registerClient(AFe1ySDK<?> aFe1ySDK) {
        boolean add;
        AFa1ySDK aFa1ySDK;
        synchronized (this.f5363i) {
            if (this.f5365w.contains(aFe1ySDK)) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "tried to add already running task: " + aFe1ySDK, false, 4, null);
                return AFa1ySDK.registerClient;
            }
            if (!this.f5363i.contains(aFe1ySDK) && !this.f5362e.contains(aFe1ySDK)) {
                for (AFe1zSDK aFe1zSDK : aFe1ySDK.AFKeystoreWrapper) {
                    if (this.force.contains(aFe1zSDK)) {
                        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
                        aFe1ySDK.AFLogger.add(aFe1zSDK);
                    }
                }
                if (this.f5361d.containsAll(aFe1ySDK.AFLogger)) {
                    add = this.f5363i.add(aFe1ySDK);
                } else {
                    add = this.f5362e.add(aFe1ySDK);
                    if (add) {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "new task was blocked: " + aFe1ySDK, false, 4, null);
                        aFe1ySDK.w();
                    }
                }
                if (add) {
                    this.f5363i.addAll(this.f5364v);
                    this.f5364v.clear();
                    aFa1ySDK = AFa1ySDK.AFKeystoreWrapper;
                } else {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "task not added, it's already in the queue: " + aFe1ySDK, false, 4, null);
                    aFa1ySDK = AFa1ySDK.f5366d;
                }
                return aFa1ySDK;
            }
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "tried to add already scheduled task: " + aFe1ySDK, false, 4, null);
            return AFa1ySDK.registerClient;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(AFe1wSDK aFe1wSDK, AFe1ySDK aFe1ySDK) {
        int i10 = AFa1uSDK.AFKeystoreWrapper[aFe1wSDK.registerClient(aFe1ySDK).ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.QUEUE, "QUEUE: tried to add already pending task: " + aFe1ySDK, false, 4, null);
                return;
            }
            if (i10 != 3) {
                throw new gt.l();
            }
            aFe1wSDK.force.add(aFe1ySDK.unregisterClient);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "new task added: " + aFe1ySDK, false, 4, null);
            Iterator<AFe1vSDK> it = aFe1wSDK.unregisterClient.iterator();
            while (it.hasNext()) {
                it.next().d(aFe1ySDK);
            }
            aFe1wSDK.AFKeystoreWrapper.submit(new i0(aFe1wSDK));
            synchronized (aFe1wSDK.f5363i) {
                try {
                    for (int size = (aFe1wSDK.f5363i.size() + aFe1wSDK.f5362e.size()) - 40; size > 0; size--) {
                        boolean isEmpty = aFe1wSDK.f5362e.isEmpty();
                        boolean isEmpty2 = aFe1wSDK.f5363i.isEmpty();
                        if (!isEmpty2 && !isEmpty) {
                            AFe1ySDK<?> first = aFe1wSDK.f5363i.first();
                            AFe1ySDK<?> first2 = aFe1wSDK.f5362e.first();
                            Intrinsics.checkNotNull(first2);
                            if (first.compareTo(first2) > 0) {
                                aFe1wSDK.d(aFe1wSDK.f5363i);
                            } else {
                                aFe1wSDK.d(aFe1wSDK.f5362e);
                            }
                        } else if (!isEmpty2) {
                            aFe1wSDK.d(aFe1wSDK.f5363i);
                        } else if (!isEmpty) {
                            aFe1wSDK.d(aFe1wSDK.f5362e);
                        }
                    }
                    Unit unit = Unit.f22894a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void d(@NotNull final AFe1ySDK<?> aFe1ySDK) {
        Intrinsics.checkNotNullParameter(aFe1ySDK, "");
        this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.j0
            @Override // java.lang.Runnable
            public final void run() {
                AFe1wSDK.unregisterClient(AFe1wSDK.this, aFe1ySDK);
            }
        });
    }

    private final void d(NavigableSet<AFe1ySDK<?>> navigableSet) {
        AFe1ySDK<?> pollFirst = navigableSet.pollFirst();
        if (pollFirst == null) {
            return;
        }
        this.f5361d.add(pollFirst.unregisterClient);
        Iterator<AFe1vSDK> it = this.unregisterClient.iterator();
        while (it.hasNext()) {
            it.next().unregisterClient(pollFirst);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(AFe1ySDK aFe1ySDK, AFd1cSDK aFd1cSDK, AFe1wSDK aFe1wSDK) {
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "execution finished for " + aFe1ySDK + ", result: " + aFd1cSDK, false, 4, null);
        aFe1wSDK.f5365w.remove(aFe1ySDK);
        Iterator<AFe1vSDK> it = aFe1wSDK.unregisterClient.iterator();
        while (it.hasNext()) {
            it.next().AFKeystoreWrapper(aFe1ySDK, aFd1cSDK);
        }
        if (aFd1cSDK == AFd1cSDK.f5311d) {
            aFe1wSDK.f5361d.add(aFe1ySDK.unregisterClient);
            aFe1wSDK.unregisterClient();
            return;
        }
        if (aFe1ySDK.AFLogger()) {
            Intrinsics.checkNotNullParameter(aFe1ySDK, "");
            if ((aFe1ySDK instanceof AFf1sSDK) && ((AFf1sSDK) aFe1ySDK).unregisterClient == AFd1bSDK.getLevel) {
                return;
            }
            synchronized (aFe1wSDK.f5363i) {
                try {
                    aFe1wSDK.f5364v.add(aFe1ySDK);
                    Iterator<AFe1vSDK> it2 = aFe1wSDK.unregisterClient.iterator();
                    while (it2.hasNext()) {
                        it2.next().d(aFe1ySDK);
                    }
                    Unit unit = Unit.f22894a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        aFe1wSDK.f5361d.add(aFe1ySDK.unregisterClient);
        aFe1wSDK.unregisterClient();
    }

    private final void unregisterClient() {
        synchronized (this.f5363i) {
            try {
                Iterator<AFe1ySDK<?>> it = this.f5362e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                boolean z10 = false;
                while (it.hasNext()) {
                    AFe1ySDK<?> next = it.next();
                    Intrinsics.checkNotNull(next);
                    if (this.f5361d.containsAll(next.AFLogger)) {
                        it.remove();
                        this.f5363i.add(next);
                        z10 = true;
                    }
                }
                if (z10) {
                    this.AFKeystoreWrapper.submit(new i0(this));
                }
                Unit unit = Unit.f22894a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
