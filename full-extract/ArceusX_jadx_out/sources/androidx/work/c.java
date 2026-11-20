package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.core.view.InputDeviceCompat;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import ne.x;
import x5.k;
import x5.u0;
import y1.c;

/* loaded from: classes.dex */
public abstract class c {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(InputDeviceCompat.SOURCE_ANY);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0062a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f3313a;

            public C0062a() {
                this(androidx.work.b.f3310c);
            }

            public androidx.work.b e() {
                return this.f3313a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0062a.class != obj.getClass()) {
                    return false;
                }
                return this.f3313a.equals(((C0062a) obj).f3313a);
            }

            public int hashCode() {
                return (C0062a.class.getName().hashCode() * 31) + this.f3313a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f3313a + '}';
            }

            public C0062a(androidx.work.b bVar) {
                this.f3313a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0063c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f3314a;

            public C0063c() {
                this(androidx.work.b.f3310c);
            }

            public androidx.work.b e() {
                return this.f3314a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0063c.class != obj.getClass()) {
                    return false;
                }
                return this.f3314a.equals(((C0063c) obj).f3314a);
            }

            public int hashCode() {
                return (C0063c.class.getName().hashCode() * 31) + this.f3314a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f3314a + '}';
            }

            public C0063c(androidx.work.b bVar) {
                this.f3314a = bVar;
            }
        }

        public static a a() {
            return new C0062a();
        }

        public static a b(androidx.work.b bVar) {
            return new C0062a(bVar);
        }

        public static a c() {
            return new b();
        }

        public static a d() {
            return new C0063c();
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public static /* synthetic */ Object a(c.a aVar) {
        aVar.f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public x<k> getForegroundInfoAsync() {
        return y1.c.a(new c.InterfaceC0669c() { // from class: x5.v
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return androidx.work.c.a(aVar);
            }
        });
    }

    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    public final b getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    public h6.b getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    public u0 getWorkerFactory() {
        return this.mWorkerParams.m();
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final x<Void> setForegroundAsync(k kVar) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), kVar);
    }

    public x<Void> setProgressAsync(b bVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), bVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract x<a> startWork();

    public final void stop(int i10) {
        if (this.mStopReason.compareAndSet(InputDeviceCompat.SOURCE_ANY, i10)) {
            onStopped();
        }
    }
}
