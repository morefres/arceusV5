package el;

import android.app.Activity;
import android.app.Activity$ScreenCaptureCallback;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.protocols.bugreporterplatforminterface.generated.BugReporterTriggerType;
import com.roblox.protocols.bugreporterplatforminterface.generated.IBugReporterCore;
import com.roblox.protocols.bugreporterplatforminterface.generated.IPlatformBugReporter;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class a extends IPlatformBugReporter {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f16049a;
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public Activity$ScreenCaptureCallback f16050c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16051d;

    /* renamed from: e, reason: collision with root package name */
    public IBugReporterCore f16052e;

    /* renamed from: el.a$a, reason: collision with other inner class name */
    public class C0299a implements Activity$ScreenCaptureCallback {
        public C0299a() {
        }

        public void onScreenCaptured() {
            a.this.c(BugReporterTriggerType.SCREENSHOT);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16054a = new a();
    }

    public static a b() {
        return b.f16054a;
    }

    public final void c(BugReporterTriggerType bugReporterTriggerType) {
        IBugReporterCore iBugReporterCore = this.f16052e;
        if (iBugReporterCore != null) {
            iBugReporterCore.requestBugReport(bugReporterTriggerType);
        }
    }

    public void d(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.f16051d) {
                Log.w("BugReporterProtocolV2", "Unbalanced calls to start and stop. Already started.");
                return;
            }
            this.f16049a = new WeakReference<>(activity);
            C0299a c0299a = new C0299a();
            this.f16050c = c0299a;
            activity.registerScreenCaptureCallback(this.b, c0299a);
            this.f16051d = true;
        }
    }

    public void e() {
        if (Build.VERSION.SDK_INT >= 34) {
            if (!this.f16051d) {
                Log.w("BugReporterProtocolV2", "Unbalanced calls to start and stop. Not started.");
                return;
            }
            this.f16051d = false;
            Activity activity = this.f16049a.get();
            if (activity != null) {
                activity.unregisterScreenCaptureCallback(this.f16050c);
            } else {
                Log.w("BugReporterProtocolV2", "Could not stop listening. Activity is null");
            }
            this.f16050c = null;
            this.f16049a = null;
        }
    }

    @Override // com.roblox.protocols.bugreporterplatforminterface.generated.IPlatformBugReporter
    public boolean isAvailable() {
        return true;
    }

    public a() {
        this.b = Executors.newSingleThreadExecutor();
        this.f16051d = false;
        this.f16052e = null;
        this.f16052e = IBugReporterCore.setPlatformImpl(this);
    }
}
