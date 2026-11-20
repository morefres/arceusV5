package x5;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lx5/u0;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/c;", ve.a.f33391e, "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/c;", j6.b.f21518e, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class u0 {
    public static final androidx.work.c c(Context context, String str, WorkerParameters workerParameters) {
        String str2;
        try {
            androidx.work.c newInstance = d(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            Intrinsics.checkNotNull(newInstance);
            return newInstance;
        } catch (Throwable th2) {
            w e10 = w.e();
            str2 = v0.f35342a;
            e10.d(str2, "Could not instantiate " + str, th2);
            throw th2;
        }
    }

    public static final Class<? extends androidx.work.c> d(String str) {
        String str2;
        try {
            Class asSubclass = Class.forName(str).asSubclass(androidx.work.c.class);
            Intrinsics.checkNotNull(asSubclass);
            return asSubclass;
        } catch (Throwable th2) {
            w e10 = w.e();
            str2 = v0.f35342a;
            e10.d(str2, "Invalid class: " + str, th2);
            throw th2;
        }
    }

    @Nullable
    public abstract androidx.work.c a(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters);

    @NotNull
    public final androidx.work.c b(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        androidx.work.c a10 = a(appContext, workerClassName, workerParameters);
        if (a10 == null) {
            a10 = c(appContext, workerClassName, workerParameters);
        }
        if (!a10.isUsed()) {
            return a10;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
