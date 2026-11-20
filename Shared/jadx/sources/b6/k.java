package b6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import b6.b;
import gt.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x5.w;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0013\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015j\u0002`\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001c\u0010\u0003J!\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R0\u0010'\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015j\u0002`\u0017\u0012\u0004\u0012\u00020\u00130$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010-\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00103\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lb6/k;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "", "blocked", "onBlockedStatusChanged", "(Landroid/net/Network;Z)V", "onLost", "(Landroid/net/Network;)V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Lb6/b;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", j6.b.f21518e, "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "e", "request", "capabilities", rl.d.f30696a, "(Landroid/net/NetworkRequest;Landroid/net/NetworkCapabilities;)Z", "", "Ljava/lang/Object;", "requestsLock", "", "c", "Ljava/util/Map;", "requests", "Landroid/net/NetworkCapabilities;", "getCachedCapabilities", "()Landroid/net/NetworkCapabilities;", "setCachedCapabilities", "(Landroid/net/NetworkCapabilities;)V", "cachedCapabilities", "Z", "getCapabilitiesInitialized", "()Z", "setCapabilitiesInitialized", "(Z)V", "capabilitiesInitialized", "f", "Ljava/lang/Boolean;", "isBlocked", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f3833a = new k();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Object requestsLock = new Object();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<Function1<b, Unit>, NetworkRequest> requests = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static NetworkCapabilities cachedCapabilities;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static boolean capabilitiesInitialized;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Boolean isBlocked;

    public static final Unit c(Function1 function1, ConnectivityManager connectivityManager) {
        String str;
        synchronized (requestsLock) {
            Map<Function1<b, Unit>, NetworkRequest> map = requests;
            map.remove(function1);
            if (map.isEmpty()) {
                w e10 = w.e();
                str = m.f3844a;
                e10.a(str, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(f3833a);
                isBlocked = null;
                cachedCapabilities = null;
                capabilitiesInitialized = false;
            }
        }
        return Unit.f22894a;
    }

    @NotNull
    public final Function0<Unit> b(@NotNull final ConnectivityManager connManager, @NotNull NetworkRequest networkRequest, @NotNull final Function1<? super b, Unit> onConstraintState) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
        synchronized (requestsLock) {
            try {
                Map<Function1<b, Unit>, NetworkRequest> map = requests;
                boolean isEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (isEmpty) {
                    w e10 = w.e();
                    str2 = m.f3844a;
                    e10.a(str2, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(f3833a);
                } else if (capabilitiesInitialized && isBlocked != null) {
                    w e11 = w.e();
                    str = m.f3844a;
                    e11.a(str, "NetworkRequestConstraintController send initial capabilities");
                    onConstraintState.invoke(f3833a.d(networkRequest, cachedCapabilities) ? b.a.f3813a : new b.ConstraintsNotMet(7));
                }
                Unit unit = Unit.f22894a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new Function0() { // from class: b6.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit c10;
                c10 = k.c(Function1.this, connManager);
                return c10;
            }
        };
    }

    public final boolean d(NetworkRequest request, NetworkCapabilities capabilities) {
        Boolean bool = isBlocked;
        Intrinsics.checkNotNull(bool);
        return !bool.booleanValue() && request.canBeSatisfiedBy(capabilities);
    }

    public final void e() {
        String str;
        ArrayList arrayList = new ArrayList();
        synchronized (requestsLock) {
            try {
                if (capabilitiesInitialized && isBlocked != null) {
                    Iterator<T> it = requests.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        arrayList.add(s.a((Function1) entry.getKey(), f3833a.d((NetworkRequest) entry.getValue(), cachedCapabilities) ? b.a.f3813a : new b.ConstraintsNotMet(7)));
                    }
                    Unit unit = Unit.f22894a;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Pair pair = (Pair) obj;
                        ((Function1) pair.a()).invoke((b) pair.b());
                    }
                    return;
                }
                w e10 = w.e();
                str = m.f3844a;
                e10.a(str, "Not dispatching constraint state yet: isBlocked=" + isBlocked + ", capabilitiesInitialized=" + capabilitiesInitialized);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(@NotNull Network network, boolean blocked) {
        String str;
        Intrinsics.checkNotNullParameter(network, "network");
        w e10 = w.e();
        str = m.f3844a;
        e10.a(str, "NetworkRequestConstraintController onBlockedStatusChanged callback " + blocked);
        synchronized (requestsLock) {
            if (Intrinsics.c(isBlocked, Boolean.valueOf(blocked))) {
                return;
            }
            isBlocked = Boolean.valueOf(blocked);
            Unit unit = Unit.f22894a;
            e();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        String str;
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        w e10 = w.e();
        str = m.f3844a;
        e10.a(str, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            cachedCapabilities = networkCapabilities;
            capabilitiesInitialized = true;
            Unit unit = Unit.f22894a;
        }
        e();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        String str;
        Intrinsics.checkNotNullParameter(network, "network");
        w e10 = w.e();
        str = m.f3844a;
        e10.a(str, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            try {
                cachedCapabilities = null;
                Iterator<T> it = requests.keySet().iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(new b.ConstraintsNotMet(7));
                }
                Unit unit = Unit.f22894a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
