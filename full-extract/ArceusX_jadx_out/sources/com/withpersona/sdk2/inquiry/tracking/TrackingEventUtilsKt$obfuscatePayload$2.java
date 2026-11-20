package com.withpersona.sdk2.inquiry.tracking;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt", f = "TrackingEventUtils.kt", l = {85}, m = "obfuscatePayload")
/* loaded from: classes3.dex */
public final class TrackingEventUtilsKt$obfuscatePayload$2 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public TrackingEventUtilsKt$obfuscatePayload$2(mt.b<? super TrackingEventUtilsKt$obfuscatePayload$2> bVar) {
        super(bVar);
    }

    @Override // ot.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        return TrackingEventUtilsKt.obfuscatePayload(null, this);
    }
}
