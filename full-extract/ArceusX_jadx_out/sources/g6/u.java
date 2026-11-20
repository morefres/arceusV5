package g6;

import android.net.NetworkRequest;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx5/x;", "Landroid/net/NetworkRequest;", ve.a.f33391e, "(Lx5/x;)Landroid/net/NetworkRequest;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18383a;

        static {
            int[] iArr = new int[x5.x.values().length];
            try {
                iArr[x5.x.f35350e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x5.x.f35348c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x5.x.f35349d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18383a = iArr;
        }
    }

    @Nullable
    public static final NetworkRequest a(@NotNull x5.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (xVar == x5.x.f35347a) {
            return null;
        }
        NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
        if (Build.VERSION.SDK_INT >= 30 && xVar == x5.x.f35351f) {
            return removeCapability.addCapability(25).build();
        }
        int i10 = a.f18383a[xVar.ordinal()];
        if (i10 == 1) {
            removeCapability = removeCapability.addTransportType(0);
        } else if (i10 == 2) {
            removeCapability = removeCapability.addCapability(11);
        } else if (i10 == 3) {
            removeCapability = removeCapability.addCapability(18);
        }
        return removeCapability.build();
    }
}
