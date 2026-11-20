package com.withpersona.sdk2.inquiry;

import com.withpersona.sdk2.inquiry.InquiryActivityEvent;
import gt.o;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import mt.b;
import mu.b0;
import nt.c;
import ot.f;
import ot.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
@f(c = "com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager$cancelRunningInquiries$1", f = "InquiryActivityBroadcastManager.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InquiryActivityBroadcastManager$cancelRunningInquiries$1 extends m implements Function2<p0, b<? super Unit>, Object> {
    final /* synthetic */ boolean $skipBackendCall;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryActivityBroadcastManager$cancelRunningInquiries$1(boolean z10, b<? super InquiryActivityBroadcastManager$cancelRunningInquiries$1> bVar) {
        super(2, bVar);
        this.$skipBackendCall = z10;
    }

    @Override // ot.a
    public final b<Unit> create(Object obj, b<?> bVar) {
        return new InquiryActivityBroadcastManager$cancelRunningInquiries$1(this.$skipBackendCall, bVar);
    }

    @Override // ot.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        Object e10 = c.e();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            b0Var = InquiryActivityBroadcastManager._eventFlow;
            InquiryActivityEvent.CancelInquiry cancelInquiry = new InquiryActivityEvent.CancelInquiry(this.$skipBackendCall);
            this.label = 1;
            if (b0Var.emit(cancelInquiry, this) == e10) {
                return e10;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
        }
        return Unit.f22894a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
        return ((InquiryActivityBroadcastManager$cancelRunningInquiries$1) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
    }
}
