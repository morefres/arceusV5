package com.withpersona.sdk2.inquiry.tracking;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@f(c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger", f = "RealTrackingEventsLogger.kt", l = {255}, m = "fetchPublicKey")
/* loaded from: classes3.dex */
public final class RealTrackingEventsLogger$fetchPublicKey$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealTrackingEventsLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTrackingEventsLogger$fetchPublicKey$1(RealTrackingEventsLogger realTrackingEventsLogger, mt.b<? super RealTrackingEventsLogger$fetchPublicKey$1> bVar) {
        super(bVar);
        this.this$0 = realTrackingEventsLogger;
    }

    @Override // ot.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchPublicKey;
        this.result = obj;
        this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        fetchPublicKey = this.this$0.fetchPublicKey(this);
        return fetchPublicKey;
    }
}
