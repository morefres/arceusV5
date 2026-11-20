package c6;

import b6.NetworkState;
import f6.j0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.w;
import x5.x;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lc6/g;", "Lc6/b;", "Lb6/h;", "Ld6/h;", "tracker", "<init>", "(Ld6/h;)V", "Lf6/j0;", "workSpec", "", ve.a.f33391e, "(Lf6/j0;)Z", "value", "f", "(Lb6/h;)Z", "", j6.b.f21518e, "I", rl.d.f30696a, "()I", "reason", "c", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g extends b<NetworkState> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f4773d;

    /* renamed from: b, reason: from kotlin metadata */
    public final int reason;

    static {
        String i10 = w.i("NetworkMeteredCtrlr");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(...)");
        f4773d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull d6.h<NetworkState> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.reason = 7;
    }

    @Override // c6.e
    public boolean a(@NotNull j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkType() == x.f35350e;
    }

    @Override // c6.b
    /* renamed from: d, reason: from getter */
    public int getReason() {
        return this.reason;
    }

    @Override // c6.b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean e(@NotNull NetworkState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.getIsConnected() && value.getIsMetered() && !value.getIsBlocked()) ? false : true;
    }
}
