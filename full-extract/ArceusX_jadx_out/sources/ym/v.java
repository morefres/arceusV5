package ym;

import ju.d2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lym/v;", "", "Lym/r;", "controller", "Lju/d2;", "subscription", "<init>", "(Lym/r;Lju/d2;)V", ve.a.f33391e, "Lym/r;", "()Lym/r;", j6.b.f21518e, "Lju/d2;", "()Lju/d2;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r controller;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d2 subscription;

    public v(@NotNull r controller, @NotNull d2 subscription) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.controller = controller;
        this.subscription = subscription;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final r getController() {
        return this.controller;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final d2 getSubscription() {
        return this.subscription;
    }
}
