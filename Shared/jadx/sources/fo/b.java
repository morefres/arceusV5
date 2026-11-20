package fo;

import androidx.core.view.MotionEventCompat;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import eo.e;
import iv.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import tr.h;
import wm.o;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000f\u0015B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lfo/b;", "Lwm/o;", "Lfo/b$b;", "Ltr/h;", "", "sessionToken", "Leo/e;", "featureFlagManager", "Lfo/a;", "featureFlagService", "<init>", "(Ljava/lang/String;Leo/e;Lfo/a;)V", "Lmu/h;", "run", "()Lmu/h;", j6.b.f21518e, "Ljava/lang/String;", "c", "Leo/e;", rl.d.f30696a, "Lfo/a;", ve.a.f33391e, "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements o<AbstractC0316b>, h<AbstractC0316b> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e featureFlagManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fo.a featureFlagService;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lfo/b$a;", "", "", "sessionToken", "Lfo/b;", "create", "(Ljava/lang/String;)Lfo/b;", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        b create(@NotNull String sessionToken);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lfo/b$b;", "", "<init>", "()V", j6.b.f21518e, ve.a.f33391e, "Lfo/b$b$a;", "Lfo/b$b$b;", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: fo.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0316b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfo/b$b$a;", "Lfo/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: fo.b$b$a */
        public static final /* data */ class a extends AbstractC0316b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f17507a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 727805021;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfo/b$b$b;", "Lfo/b$b;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "getData", "()Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: fo.b$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class Success extends AbstractC0316b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final FeatureFlagResponse data;

            public Success(@Nullable FeatureFlagResponse featureFlagResponse) {
                super(null);
                this.data = featureFlagResponse;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.c(this.data, ((Success) other).data);
            }

            public int hashCode() {
                FeatureFlagResponse featureFlagResponse = this.data;
                if (featureFlagResponse == null) {
                    return 0;
                }
                return featureFlagResponse.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(data=" + this.data + ")";
            }
        }

        public /* synthetic */ AbstractC0316b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC0316b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lfo/b$b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1", f = "FeatureFlagWorker.kt", l = {MotionEventCompat.AXIS_GAS, 31, MotionEventCompat.AXIS_GENERIC_2}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super AbstractC0316b>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f17509t;

        /* renamed from: u, reason: collision with root package name */
        public Object f17510u;

        /* renamed from: v, reason: collision with root package name */
        public int f17511v;

        /* renamed from: w, reason: collision with root package name */
        public int f17512w;

        /* renamed from: x, reason: collision with root package name */
        public int f17513x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f17514y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1$1", f = "FeatureFlagWorker.kt", l = {MotionEventCompat.AXIS_BRAKE}, m = "invokeSuspend")
        public static final class a extends m implements Function1<mt.b<? super x<FeatureFlagResponse>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f17516t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b f17517u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, mt.b<? super a> bVar2) {
                super(1, bVar2);
                this.f17517u = bVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new a(this.f17517u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f17516t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                fo.a aVar = this.f17517u.featureFlagService;
                String str = this.f17517u.sessionToken;
                String[] strArr = (String[]) this.f17517u.featureFlagManager.c().a().toArray(new String[0]);
                this.f17516t = 1;
                Object a10 = aVar.a(str, strArr, this);
                return a10 == e10 ? e10 : a10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super x<FeatureFlagResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = b.this.new c(bVar);
            cVar.f17514y = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
        
            if (r0.emit(r4, r8) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00ad, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        
            if (r9 == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f17514y
                mu.i r0 = (mu.i) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r8.f17513x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L3b
                if (r2 == r5) goto L37
                if (r2 == r4) goto L2b
                if (r2 != r3) goto L23
                java.lang.Object r0 = r8.f17510u
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r0 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r0
                java.lang.Object r0 = r8.f17509t
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r0
                gt.o.b(r9)
                goto Lae
            L23:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2b:
                java.lang.Object r2 = r8.f17510u
                com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse r2 = (com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse) r2
                java.lang.Object r2 = r8.f17509t
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                gt.o.b(r9)
                goto L86
            L37:
                gt.o.b(r9)
                goto L51
            L3b:
                gt.o.b(r9)
                fo.b$c$a r9 = new fo.b$c$a
                fo.b r2 = fo.b.this
                r7 = 0
                r9.<init>(r2, r7)
                r8.f17514y = r0
                r8.f17513x = r5
                java.lang.Object r9 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueVerificationRequestWithRetry(r9, r8)
                if (r9 != r1) goto L51
                goto Lad
            L51:
                r2 = r9
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                fo.b r9 = fo.b.this
                boolean r5 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r5 == 0) goto L86
                r5 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r5 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r5
                java.lang.Object r5 = r5.getResponse()
                com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse r5 = (com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse) r5
                eo.e r9 = fo.b.d(r9)
                r9.e(r5)
                fo.b$b$b r9 = new fo.b$b$b
                r9.<init>(r5)
                r8.f17514y = r0
                r8.f17509t = r2
                java.lang.Object r5 = ot.l.a(r5)
                r8.f17510u = r5
                r8.f17511v = r6
                r8.f17512w = r6
                r8.f17513x = r4
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L86
                goto Lad
            L86:
                boolean r9 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r9 == 0) goto Lae
                r9 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r9 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r9
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r9 = r9.getNetworkErrorInfo()
                fo.b$b$a r4 = fo.b.AbstractC0316b.a.f17507a
                java.lang.Object r5 = ot.l.a(r0)
                r8.f17514y = r5
                r8.f17509t = r2
                java.lang.Object r9 = ot.l.a(r9)
                r8.f17510u = r9
                r8.f17511v = r6
                r8.f17512w = r6
                r8.f17513x = r3
                java.lang.Object r9 = r0.emit(r4, r8)
                if (r9 != r1) goto Lae
            Lad:
                return r1
            Lae:
                kotlin.Unit r9 = kotlin.Unit.f22894a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super AbstractC0316b> iVar, mt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public b(@NotNull String sessionToken, @NotNull e featureFlagManager, @NotNull fo.a featureFlagService) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(featureFlagService, "featureFlagService");
        this.sessionToken = sessionToken;
        this.featureFlagManager = featureFlagManager;
        this.featureFlagService = featureFlagService;
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<AbstractC0316b> run() {
        return j.w(new c(null));
    }
}
