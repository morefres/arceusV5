package iq;

import android.os.Bundle;
import android.os.Parcelable;
import gt.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Liq/c;", "Landroid/os/Parcelable;", "Args", "Lgt/h;", "Lgu/c;", "navArgsClass", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "<init>", "(Lgu/c;Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", ve.a.f33391e, "Lgu/c;", j6.b.f21518e, "Lkotlin/jvm/functions/Function0;", "c", "Landroid/os/Parcelable;", "cached", "()Landroid/os/Parcelable;", "value", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c<Args extends Parcelable> implements h<Args> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gu.c<Args> navArgsClass;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<Bundle> argumentProducer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Args cached;

    public c(@NotNull gu.c<Args> navArgsClass, @NotNull Function0<Bundle> argumentProducer) {
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // gt.h
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Args getValue() {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Object a10 = u2.c.a(this.argumentProducer.invoke(), "ARGUMENT_ARGS", xt.a.a(this.navArgsClass));
        Intrinsics.d(a10, "null cannot be cast to non-null type Args of com.withpersona.sdk2.inquiry.shared.baseFragment.FragmentArgsLazy");
        Args args2 = (Args) a10;
        this.cached = args2;
        return args2;
    }

    @Override // gt.h
    public boolean isInitialized() {
        return this.cached != null;
    }
}
