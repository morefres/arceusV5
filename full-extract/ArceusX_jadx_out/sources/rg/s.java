package rg;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lrg/s;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)Z", "", ve.a.f33391e, "(Landroid/content/Context;)V", j6.b.f21518e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f30526a = new s();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"rg/s$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements android.view.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f30527a;

        public a(Context context) {
            this.f30527a = context;
        }

        @Override // android.view.f
        public /* bridge */ void onCreate(android.view.s sVar) {
            super.onCreate(sVar);
        }

        @Override // android.view.f
        public /* bridge */ void onDestroy(android.view.s sVar) {
            super.onDestroy(sVar);
        }

        @Override // android.view.f
        public /* bridge */ void onPause(android.view.s sVar) {
            super.onPause(sVar);
        }

        @Override // android.view.f
        public /* bridge */ void onResume(android.view.s sVar) {
            super.onResume(sVar);
        }

        @Override // android.view.f
        public void onStart(android.view.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            s.a(this.f30527a);
            android.view.h0.INSTANCE.a().a().d(this);
        }

        @Override // android.view.f
        public /* bridge */ void onStop(android.view.s sVar) {
            super.onStop(sVar);
        }
    }

    public static final void a(@NotNull Context context) {
        SharedPreferences U;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!rh.h.a().l4() || (string = (U = a1.U(context)).getString("channel", "")) == null || string.length() == 0) {
            return;
        }
        Intrinsics.checkNotNull(U);
        SharedPreferences.Editor edit = U.edit();
        edit.remove("channel");
        edit.apply();
        ek.q.h("ChannelUtils", "Burned channel preference: " + string);
    }

    public static final void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (rh.h.a().l4()) {
            android.view.h0.INSTANCE.a().a().a(new a(context));
        }
    }

    public static final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!rh.h.a().l4() || Intrinsics.c(ek.w.a(context), "foreground")) {
            return true;
        }
        ek.q.h("ChannelUtils", "Background launch detected, skipping channel burn");
        return false;
    }
}
