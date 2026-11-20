package com.withpersona.sdk2.inquiry.tracking;

import gt.o;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nt.c;
import ot.f;
import ot.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ljavax/crypto/Cipher;"}, k = 3, mv = {2, 2, 0})
@f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$cipher$1", f = "TrackingEventUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TrackingEventUtilsKt$obfuscatePayload$cipher$1 extends m implements Function2<p0, mt.b<? super Cipher>, Object> {
    final /* synthetic */ byte[] $iv;
    final /* synthetic */ SecretKeySpec $secretKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventUtilsKt$obfuscatePayload$cipher$1(SecretKeySpec secretKeySpec, byte[] bArr, mt.b<? super TrackingEventUtilsKt$obfuscatePayload$cipher$1> bVar) {
        super(2, bVar);
        this.$secretKey = secretKeySpec;
        this.$iv = bArr;
    }

    @Override // ot.a
    public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
        return new TrackingEventUtilsKt$obfuscatePayload$cipher$1(this.$secretKey, this.$iv, bVar);
    }

    @Override // ot.a
    public final Object invokeSuspend(Object obj) {
        c.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.$secretKey, new GCMParameterSpec(128, this.$iv));
        return cipher;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(p0 p0Var, mt.b<? super Cipher> bVar) {
        return ((TrackingEventUtilsKt$obfuscatePayload$cipher$1) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
    }
}
