package com.withpersona.sdk2.inquiry.internal;

import androidx.core.view.MotionEventCompat;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a;", "Ltr/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Lmu/h;", "run", "()Lmu/h;", "otherWorker", "", ve.a.f33391e, "(Ltr/h;)Z", j6.b.f21518e, "Ljava/lang/String;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements tr.h<com.withpersona.sdk2.inquiry.internal.network.b> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final InquirySessionDataWrapper inquirySessionDataWrapper;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a$a;", "", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/a;", ve.a.f33391e, "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;)Lcom/withpersona/sdk2/inquiry/internal/a;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0217a {
        @NotNull
        a a(@NotNull String inquiryId, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker$run$1", f = "CreateInquirySessionWorker.kt", l = {MotionEventCompat.AXIS_DISTANCE, MotionEventCompat.AXIS_BRAKE}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<mu.i<? super com.withpersona.sdk2.inquiry.internal.network.b>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f11497t;

        /* renamed from: u, reason: collision with root package name */
        public int f11498u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11499v;

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = a.this.new b(bVar);
            bVar2.f11499v = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
        
            if (r2.emit(r8, r7) == r1) goto L16;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f11499v
                mu.i r0 = (mu.i) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r7.f11498u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                gt.o.b(r8)
                goto L5f
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r2 = r7.f11497t
                mu.i r2 = (mu.i) r2
                gt.o.b(r8)
                goto L4d
            L26:
                gt.o.b(r8)
                com.withpersona.sdk2.inquiry.internal.a r8 = com.withpersona.sdk2.inquiry.internal.a.this
                com.withpersona.sdk2.inquiry.internal.network.e r8 = com.withpersona.sdk2.inquiry.internal.a.c(r8)
                com.withpersona.sdk2.inquiry.internal.a r2 = com.withpersona.sdk2.inquiry.internal.a.this
                java.lang.String r2 = com.withpersona.sdk2.inquiry.internal.a.d(r2)
                com.withpersona.sdk2.inquiry.internal.a r5 = com.withpersona.sdk2.inquiry.internal.a.this
                com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper r5 = com.withpersona.sdk2.inquiry.internal.a.e(r5)
                java.lang.Object r6 = ot.l.a(r0)
                r7.f11499v = r6
                r7.f11497t = r0
                r7.f11498u = r4
                java.lang.Object r8 = r8.i(r2, r5, r7)
                if (r8 != r1) goto L4c
                goto L5e
            L4c:
                r2 = r0
            L4d:
                java.lang.Object r0 = ot.l.a(r0)
                r7.f11499v = r0
                r0 = 0
                r7.f11497t = r0
                r7.f11498u = r3
                java.lang.Object r8 = r2.emit(r8, r7)
                if (r8 != r1) goto L5f
            L5e:
                return r1
            L5f:
                kotlin.Unit r8 = kotlin.Unit.f22894a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super com.withpersona.sdk2.inquiry.internal.network.b> iVar, mt.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public a(@NotNull String inquiryId, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, @NotNull com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.inquiryId = inquiryId;
        this.inquirySessionDataWrapper = inquirySessionDataWrapper;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof a) && Intrinsics.c(this.inquiryId, ((a) otherWorker).inquiryId);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // tr.h
    @NotNull
    public mu.h<com.withpersona.sdk2.inquiry.internal.network.b> run() {
        return mu.j.w(new b(null));
    }
}
