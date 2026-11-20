package dl;

import android.view.s;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.Task;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsPlatformSuccess;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsProvider;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IAppAgeSignalsCore;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals;
import ek.q;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rh.h;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Ldl/g;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;", "<init>", "()V", "Lpd/e;", "result", "Ljava/util/HashMap;", "", "c", "(Lpd/e;)Ljava/util/HashMap;", "", NotificationCompat.CATEGORY_STATUS, "h", "(I)Ljava/lang/String;", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "", "getAgeSignal", "()Z", "isAgeSignalAvailable", "g", "(Ljava/lang/String;)I", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", j6.b.f21518e, "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", "appAgeSignalsCore", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g extends IPlatformAppAgeSignals implements android.view.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f14974a = new g();

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static IAppAgeSignalsCore appAgeSignalsCore;

    private final HashMap<String, String> c(pd.e result) {
        HashMap<String, String> hashMap = new HashMap<>();
        Integer f10 = result.f();
        if (f10 != null) {
            hashMap.put("userStatus", f14974a.h(f10.intValue()));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(IAppAgeSignalsCore iAppAgeSignalsCore, pd.e eVar) {
        g gVar = f14974a;
        Intrinsics.checkNotNull(eVar);
        iAppAgeSignalsCore.onGetAgeSignalSucceeded(new AppAgeSignalsPlatformSuccess(AppAgeSignalsProvider.GOOGLE, gVar.c(eVar)));
        return Unit.f22894a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final String h(int status) {
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

    public final int g(String status) {
        String upperCase = status.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1212137948:
                return !upperCase.equals("SUPERVISED") ? 4 : 1;
            case -1211756856:
                return upperCase.equals("VERIFIED") ? 0 : 4;
            case -54865866:
                return !upperCase.equals("SUPERVISED_APPROVAL_PENDING") ? 4 : 2;
            case 1732894972:
                return !upperCase.equals("SUPERVISED_APPROVAL_DENIED") ? 4 : 3;
            default:
                return 4;
        }
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean getAgeSignal() {
        final IAppAgeSignalsCore iAppAgeSignalsCore = appAgeSignalsCore;
        if (iAppAgeSignalsCore == null) {
            q.e("FakeAppAgeSignalsHandler", "getAgeSignal: protocol not yet initialized");
            return false;
        }
        String Y = h.a().Y();
        int U2 = h.a().U2();
        int e22 = h.a().e2();
        Intrinsics.checkNotNull(Y);
        pd.e a10 = pd.e.c().f(Integer.valueOf(g(Y))).b(Integer.valueOf(U2)).c(Integer.valueOf(e22)).d(UUID.randomUUID().toString()).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        rd.a aVar = new rd.a();
        aVar.b(a10);
        Task<pd.e> a11 = aVar.a(pd.d.a().a());
        final Function1 function1 = new Function1() { // from class: dl.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit d10;
                d10 = g.d(IAppAgeSignalsCore.this, (pd.e) obj);
                return d10;
            }
        };
        a11.g(new sb.g() { // from class: dl.f
            @Override // sb.g
            public final void onSuccess(Object obj) {
                g.e(Function1.this, obj);
            }
        });
        return true;
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean isAgeSignalAvailable() {
        return true;
    }

    @Override // android.view.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appAgeSignalsCore = IAppAgeSignalsCore.setPlatformImpl(this);
    }

    @Override // android.view.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appAgeSignalsCore = null;
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
