package uh;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.core.app.NotificationCompat;
import com.roblox.engine.jni.NativeGLInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\r\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\n*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Luh/v0;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "Landroid/net/ConnectivityManager;", "Luh/v0$a;", NotificationCompat.CATEGORY_STATUS, "e", "(Landroid/net/ConnectivityManager;Luh/v0$a;)V", rl.d.f30696a, "(Landroid/net/ConnectivityManager;)Luh/v0$a;", "Landroid/net/ConnectivityManager$NetworkCallback;", j6.b.f21518e, "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "c", "(Landroidx/lifecycle/s;)Landroid/net/ConnectivityManager;", "connectivityManager", ve.a.f33391e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class v0 implements android.view.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v0 f32965a = new v0();

    /* renamed from: b, reason: from kotlin metadata */
    public static ConnectivityManager.NetworkCallback networkCallback;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Luh/v0$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32966a = new a("NONE", 0);
        public static final a b = new a("WIFI", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f32967c = new a("CELLULAR", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f32968d = new a("OTHER", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f32969e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ pt.a f32970f;

        static {
            a[] a10 = a();
            f32969e = a10;
            f32970f = pt.b.a(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f32966a, b, f32967c, f32968d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f32969e.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"uh/v0$b", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "(Landroid/net/Network;)V", "onLost", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConnectivityManager f32971a;

        public b(ConnectivityManager connectivityManager) {
            this.f32971a = connectivityManager;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            v0 v0Var = v0.f32965a;
            ConnectivityManager connectivityManager = this.f32971a;
            v0Var.e(connectivityManager, v0Var.d(connectivityManager));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            v0.f32965a.e(this.f32971a, a.f32966a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ConnectivityManager c(android.view.s sVar) {
        Context context = sVar instanceof Context ? (Context) sVar : null;
        if (context != null) {
            return (ConnectivityManager) l2.b.k(context, ConnectivityManager.class);
        }
        return null;
    }

    public final a d(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            return networkCapabilities.hasTransport(1) ? a.b : networkCapabilities.hasTransport(0) ? a.f32967c : a.f32968d;
        }
        return a.f32966a;
    }

    public final void e(ConnectivityManager connectivityManager, a aVar) {
        NativeGLInterface.reportNetworkStateChanged(aVar.ordinal());
    }

    @Override // android.view.f
    public void onCreate(@NotNull android.view.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConnectivityManager c10 = c(owner);
        if (c10 == null) {
            return;
        }
        e(c10, d(c10));
        networkCallback = new b(c10);
        NetworkRequest build = new NetworkRequest.Builder().build();
        ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
        if (networkCallback2 == null) {
            Intrinsics.u("networkCallback");
            networkCallback2 = null;
        }
        c10.registerNetworkCallback(build, networkCallback2);
    }

    @Override // android.view.f
    public void onDestroy(@NotNull android.view.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConnectivityManager c10 = c(owner);
        if (c10 != null) {
            ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
            if (networkCallback2 == null) {
                Intrinsics.u("networkCallback");
                networkCallback2 = null;
            }
            c10.unregisterNetworkCallback(networkCallback2);
        }
    }

    @Override // android.view.f
    public /* bridge */ void onPause(@NotNull android.view.s sVar) {
        super.onPause(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onResume(@NotNull android.view.s sVar) {
        super.onResume(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStart(@NotNull android.view.s sVar) {
        super.onStart(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStop(@NotNull android.view.s sVar) {
        super.onStop(sVar);
    }
}
