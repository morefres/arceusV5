package com.withpersona.sdk2.inquiry.network.core;

import androidx.core.view.inputmethod.EditorInfoCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ot.f(c = "com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt", f = "NetworkUtils.kt", l = {179}, m = "enqueueWithRetryWhen")
/* loaded from: classes3.dex */
public final class NetworkUtilsKt$enqueueWithRetryWhen$1<T> extends ot.d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public NetworkUtilsKt$enqueueWithRetryWhen$1(mt.b<? super NetworkUtilsKt$enqueueWithRetryWhen$1> bVar) {
        super(bVar);
    }

    @Override // ot.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        return NetworkUtilsKt.enqueueWithRetryWhen(null, null, this);
    }
}
