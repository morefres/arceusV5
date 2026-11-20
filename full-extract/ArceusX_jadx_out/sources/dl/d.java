package dl;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.s;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.Task;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsPlatformError;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsPlatformSuccess;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsProvider;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IAppAgeSignalsCore;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals;
import ek.q;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00152\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Ldl/d;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "", "getAgeSignal", "()Z", "isAgeSignalAvailable", "Lpd/e;", "result", "Ljava/util/HashMap;", "", rl.d.f30696a, "(Lpd/e;)Ljava/util/HashMap;", "", NotificationCompat.CATEGORY_STATUS, "j", "(I)Ljava/lang/String;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "e", "(Ljava/lang/Exception;)I", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", j6.b.f21518e, "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", "appAgeSignalsCore", "Landroid/content/Context;", "c", "Landroid/content/Context;", "applicationContext", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends IPlatformAppAgeSignals implements android.view.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f14970a = new d();

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static IAppAgeSignalsCore appAgeSignalsCore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Context applicationContext;

    public static final Unit g(IAppAgeSignalsCore iAppAgeSignalsCore, pd.e eVar) {
        d dVar = f14970a;
        Intrinsics.checkNotNull(eVar);
        iAppAgeSignalsCore.onGetAgeSignalSucceeded(new AppAgeSignalsPlatformSuccess(AppAgeSignalsProvider.GOOGLE, dVar.d(eVar)));
        return Unit.f22894a;
    }

    public static final void h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void i(IAppAgeSignalsCore iAppAgeSignalsCore, Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        int e10 = f14970a.e(exception);
        AppAgeSignalsProvider appAgeSignalsProvider = AppAgeSignalsProvider.GOOGLE;
        String message = exception.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        iAppAgeSignalsCore.onGetAgeSignalFailed(new AppAgeSignalsPlatformError(appAgeSignalsProvider, e10, message));
    }

    public final HashMap<String, String> d(pd.e result) {
        HashMap<String, String> hashMap = new HashMap<>();
        Integer f10 = result.f();
        if (f10 != null) {
            hashMap.put("userStatus", f14970a.j(f10.intValue()));
        }
        Integer a10 = result.a();
        if (a10 != null) {
            hashMap.put("ageLower", String.valueOf(a10.intValue()));
        }
        Integer b = result.b();
        if (b != null) {
            hashMap.put("ageUpper", String.valueOf(b.intValue()));
        }
        String d10 = result.d();
        if (d10 != null) {
            hashMap.put("installId", d10);
        }
        return hashMap;
    }

    public final int e(Exception exception) {
        if (exception instanceof pd.a) {
            return ((pd.a) exception).c();
        }
        return -1;
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean getAgeSignal() {
        Context context = applicationContext;
        final IAppAgeSignalsCore iAppAgeSignalsCore = appAgeSignalsCore;
        if (context == null || iAppAgeSignalsCore == null) {
            q.e("AppAgeSignalsHandler", "getAgeSignal: protocol not yet initialized");
            return false;
        }
        try {
            pd.b a10 = pd.c.a(context);
            Intrinsics.checkNotNullExpressionValue(a10, "create(...)");
            pd.d a11 = pd.d.a().a();
            Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
            Task<pd.e> a12 = a10.a(a11);
            final Function1 function1 = new Function1() { // from class: dl.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit g10;
                    g10 = d.g(IAppAgeSignalsCore.this, (pd.e) obj);
                    return g10;
                }
            };
            a12.g(new sb.g() { // from class: dl.b
                @Override // sb.g
                public final void onSuccess(Object obj) {
                    d.h(Function1.this, obj);
                }
            }).e(new sb.f() { // from class: dl.c
                @Override // sb.f
                public final void onFailure(Exception exc) {
                    d.i(IAppAgeSignalsCore.this, exc);
                }
            });
            return true;
        } catch (IllegalStateException e10) {
            q.f("AppAgeSignalsHandler", "getAgeSignal: IllegalStateException", e10);
            return false;
        } catch (pd.a e11) {
            q.f("AppAgeSignalsHandler", "getAgeSignal: AgeSignalsException", e11);
            return false;
        } catch (Exception e12) {
            q.f("AppAgeSignalsHandler", "getAgeSignal: unexpected " + e12.getClass().getSimpleName(), e12);
            return false;
        }
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean isAgeSignalAvailable() {
        return true;
    }

    public final String j(int status) {
        if (status == 0) {
            return "VERIFIED";
        }
        if (status == 1) {
            return "SUPERVISED";
        }
        if (status == 2) {
            return "SUPERVISED_APPROVAL_PENDING";
        }
        if (status == 3) {
            return "SUPERVISED_APPROVAL_DENIED";
        }
        if (status == 4) {
            return "UNKNOWN";
        }
        return "UNRECOGNIZED_" + status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ContextWrapper contextWrapper = owner instanceof ContextWrapper ? (ContextWrapper) owner : null;
        applicationContext = contextWrapper != null ? contextWrapper.getApplicationContext() : null;
        appAgeSignalsCore = IAppAgeSignalsCore.setPlatformImpl(this);
    }

    @Override // android.view.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appAgeSignalsCore = null;
        applicationContext = null;
    }

    @Override // android.view.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }
}
