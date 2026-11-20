package bq;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateRequest;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateRequestAttributes;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateRequestData;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateResponse;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import gt.n;
import gt.o;
import iv.x;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ju.k;
import ju.l0;
import ju.p0;
import ju.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.collections.p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0003&$(Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001f\u0010\u001cJ$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0!2\u0006\u0010 \u001a\u00020\u0015H\u0082@¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R(\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f03028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R0\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020807j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u000208`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u0016\u0010A\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010@¨\u0006B"}, d2 = {"Lbq/a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Laq/a;", "selfieService", "Lju/p0;", "coroutineScope", "Lju/l0;", "ioDispatcher", "", "inquiryId", "sessionToken", "stepName", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "initialPoseInfo", "", "perPoseTimeoutMs", "<init>", "(Landroidx/lifecycle/l0;Laq/a;Lju/p0;Lju/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "", "index", "", "n", "(I)V", "Lgt/n;", "k", "(ILmt/b;)Ljava/lang/Object;", "o", "(Lmt/b;)Ljava/lang/Object;", "m", "poseIndex", "Lju/w0;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "l", ve.a.f33391e, "Laq/a;", j6.b.f21518e, "Lju/p0;", "c", "Lju/l0;", rl.d.f30696a, "Ljava/lang/String;", "e", "f", "Ltu/a;", "g", "Ltu/a;", "mutex", "Lmu/c0;", "", "h", "Lmu/c0;", "indexToPoseInfo", "Ljava/util/LinkedHashMap;", "Lbq/a$c;", "Lkotlin/collections/LinkedHashMap;", "i", "Ljava/util/LinkedHashMap;", "fetchPostJobs", "j", "J", "()J", "()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "lastPose", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.a selfieService;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 ioDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String stepName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tu.a mutex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public c0<Map<Integer, PoseInfo>> indexToPoseInfo;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedHashMap<Integer, c> fetchPostJobs;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long perPoseTimeoutMs;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lbq/a$b;", "", "", "inquiryId", "sessionToken", "stepName", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "initialPoseInfo", "", "perPoseTimeoutMs", "Lbq/a;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lbq/a;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        a a(@NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @Nullable List<PoseInfo> initialPoseInfo, @Nullable Long perPoseTimeoutMs);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lbq/a$c;", "", "Lju/w0;", "Lgt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "job", "<init>", "(Lju/w0;)V", ve.a.f33391e, "Lju/w0;", "()Lju/w0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final w0<n<SelfiePoseStateResponse>> job;

        public c(@NotNull w0<n<SelfiePoseStateResponse>> job) {
            Intrinsics.checkNotNullParameter(job, "job");
            this.job = job;
        }

        @NotNull
        public final w0<n<SelfiePoseStateResponse>> a() {
            return this.job;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {100}, m = "getPose-gIAlu-s")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public int f4370t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4371u;

        /* renamed from: w, reason: collision with root package name */
        public int f4373w;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4371u = obj;
            this.f4373w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object k10 = a.this.k(0, this);
            return k10 == nt.c.e() ? k10 : n.a(k10);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 216}, m = "loadNextPoseAsyncInternal")
    public static final class e extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public int f4374t;

        /* renamed from: u, reason: collision with root package name */
        public int f4375u;

        /* renamed from: v, reason: collision with root package name */
        public Object f4376v;

        /* renamed from: w, reason: collision with root package name */
        public Object f4377w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f4378x;

        /* renamed from: z, reason: collision with root package name */
        public int f4380z;

        public e(mt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4378x = obj;
            this.f4380z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.l(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadNextPoseAsyncInternal$job$1", f = "SelfiePoseManager.kt", l = {138}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, mt.b<? super n<? extends SelfiePoseStateResponse>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4381t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f4383v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: bq.a$f$a, reason: collision with other inner class name */
        public static final class C0090a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t10) {
                return kt.a.a(((SelfiePoseStateResponse.SelfiePoseState) t8).getIndex(), ((SelfiePoseStateResponse.SelfiePoseState) t10).getIndex());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Liv/x;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "<anonymous>", "(Lju/p0;)Liv/x;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadNextPoseAsyncInternal$job$1$response$1", f = "SelfiePoseManager.kt", l = {139}, m = "invokeSuspend")
        public static final class b extends m implements Function2<p0, mt.b<? super x<SelfiePoseStateResponse>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f4384t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a f4385u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ int f4386v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, int i10, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f4385u = aVar;
                this.f4386v = i10;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f4385u, this.f4386v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f4384t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                aq.a aVar = this.f4385u.selfieService;
                String str = this.f4385u.sessionToken;
                SelfiePoseStateRequest selfiePoseStateRequest = new SelfiePoseStateRequest(new SelfiePoseStateRequestData("inquiry", this.f4385u.inquiryId, new SelfiePoseStateRequestAttributes(this.f4386v, this.f4385u.stepName)));
                this.f4384t = 1;
                Object b = aVar.b(str, selfiePoseStateRequest, this);
                return b == e10 ? e10 : b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super x<SelfiePoseStateResponse>> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f4383v = i10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new f(this.f4383v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super n<? extends SelfiePoseStateResponse>> bVar) {
            return invoke2(p0Var, (mt.b<? super n<SelfiePoseStateResponse>>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b10;
            in.a c10;
            Boolean complete;
            Object e10 = nt.c.e();
            int i10 = this.f4381t;
            if (i10 == 0) {
                o.b(obj);
                l0 l0Var = a.this.ioDispatcher;
                b bVar = new b(a.this, this.f4383v, null);
                this.f4381t = 1;
                obj = ju.i.g(l0Var, bVar, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            x xVar = (x) obj;
            if (xVar.g()) {
                SelfiePoseStateResponse selfiePoseStateResponse = (SelfiePoseStateResponse) xVar.a();
                if (selfiePoseStateResponse == null) {
                    n.Companion companion = n.INSTANCE;
                    b10 = n.b(o.a(new RuntimeException("Response body is null.")));
                } else {
                    List<SelfiePoseStateResponse.SelfiePoseState> b11 = selfiePoseStateResponse.b();
                    if (b11 != null) {
                        List<SelfiePoseStateResponse.SelfiePoseState> list = b11;
                        int i11 = this.f4383v;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Integer index = ((SelfiePoseStateResponse.SelfiePoseState) it.next()).getIndex();
                                if (index != null && index.intValue() == i11) {
                                    c0 c0Var = a.this.indexToPoseInfo;
                                    Map x10 = k0.x((Map) a.this.indexToPoseInfo.getValue());
                                    int i12 = 0;
                                    for (SelfiePoseStateResponse.SelfiePoseState selfiePoseState : CollectionsKt.F0(selfiePoseStateResponse.b(), new C0090a())) {
                                        int i13 = i12 + 1;
                                        Integer index2 = selfiePoseState.getIndex();
                                        if (index2 != null) {
                                            Integer c11 = ot.b.c(index2.intValue());
                                            int intValue = selfiePoseState.getIndex().intValue();
                                            NextStep.Selfie.SelfiePose pose = selfiePoseState.getPose();
                                            if (pose != null && (c10 = com.withpersona.sdk2.inquiry.selfie.i.c(pose)) != null && (complete = selfiePoseStateResponse.getComplete()) != null) {
                                                boolean z10 = complete.booleanValue() && i12 == p.m(selfiePoseStateResponse.b());
                                                String token = selfiePoseState.getToken();
                                                if (token != null) {
                                                    x10.put(c11, new PoseInfo(intValue, c10, z10, token));
                                                }
                                            }
                                        }
                                        i12 = i13;
                                    }
                                    c0Var.setValue(x10);
                                    b10 = n.b(selfiePoseStateResponse);
                                }
                            }
                        }
                    }
                    n.Companion companion2 = n.INSTANCE;
                    b10 = n.b(o.a(new IllegalArgumentException("Requested pose at index " + this.f4383v + " however response did not include requested index.")));
                }
            } else {
                n.Companion companion3 = n.INSTANCE;
                b10 = n.b(o.a(new InternalErrorException(NetworkUtilsKt.toErrorInfo(xVar))));
            }
            return n.a(b10);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, mt.b<? super n<SelfiePoseStateResponse>> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {123, 123}, m = "loadNextPoseInternal-gIAlu-s")
    public static final class g extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public int f4387t;

        /* renamed from: u, reason: collision with root package name */
        public Object f4388u;

        /* renamed from: v, reason: collision with root package name */
        public Object f4389v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f4390w;

        /* renamed from: y, reason: collision with root package name */
        public int f4392y;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4390w = obj;
            this.f4392y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object m10 = a.this.m(0, this);
            return m10 == nt.c.e() ? m10 : n.a(m10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadPoseAsync$1", f = "SelfiePoseManager.kt", l = {91}, m = "invokeSuspend")
    public static final class h extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4393t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f4395v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, mt.b<? super h> bVar) {
            super(2, bVar);
            this.f4395v = i10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new h(this.f4395v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4393t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                int i11 = this.f4395v;
                this.f4393t = 1;
                if (aVar.m(i11, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                ((n) obj).getValue();
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "reset")
    public static final class i extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f4396t;

        /* renamed from: u, reason: collision with root package name */
        public int f4397u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f4398v;

        /* renamed from: x, reason: collision with root package name */
        public int f4400x;

        public i(mt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4398v = obj;
            this.f4400x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.o(this);
        }
    }

    public a(@NotNull android.view.l0 savedStateHandle, @NotNull aq.a selfieService, @NotNull p0 coroutineScope, @NotNull l0 ioDispatcher, @NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(selfieService, "selfieService");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        this.selfieService = selfieService;
        this.coroutineScope = coroutineScope;
        this.ioDispatcher = ioDispatcher;
        this.inquiryId = inquiryId;
        this.sessionToken = sessionToken;
        this.stepName = stepName;
        this.mutex = tu.g.b(false, 1, null);
        this.indexToPoseInfo = savedStateHandle.e("com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseOrderManager.KEY_INDEX_TO_POSE_INFO:" + stepName, k0.j());
        this.fetchPostJobs = new LinkedHashMap<>();
        this.perPoseTimeoutMs = l10 != null ? l10.longValue() : 5000L;
        if (this.indexToPoseInfo.getValue().isEmpty()) {
            c0<Map<Integer, PoseInfo>> c0Var = this.indexToPoseInfo;
            Map d10 = j0.d();
            if (list != null) {
                for (PoseInfo poseInfo : list) {
                    d10.put(Integer.valueOf(poseInfo.getIndex()), poseInfo);
                }
            }
            c0Var.setValue(j0.c(d10));
        }
    }

    public final PoseInfo i() {
        Object obj;
        Iterator<T> it = this.indexToPoseInfo.getValue().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PoseInfo) obj).getIsLast()) {
                break;
            }
        }
        return (PoseInfo) obj;
    }

    /* renamed from: j, reason: from getter */
    public final long getPerPoseTimeoutMs() {
        return this.perPoseTimeoutMs;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r5, @org.jetbrains.annotations.NotNull mt.b<? super gt.n<com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bq.a.d
            if (r0 == 0) goto L13
            r0 = r6
            bq.a$d r0 = (bq.a.d) r0
            int r1 = r0.f4373w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4373w = r1
            goto L18
        L13:
            bq.a$d r0 = new bq.a$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4371u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f4373w
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            gt.o.b(r6)
            gt.n r6 = (gt.n) r6
            java.lang.Object r5 = r6.getValue()
            return r5
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            gt.o.b(r6)
            r0.f4370t = r5
            r0.f4373w = r3
            java.lang.Object r5 = r4.m(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.a.k(int, mt.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (r2.c(null, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:24:0x005e, B:26:0x006c, B:29:0x0077), top: B:23:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: all -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:24:0x005e, B:26:0x006c, B:29:0x0077), top: B:23:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(int r14, mt.b<? super ju.w0<gt.n<com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateResponse>>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof bq.a.e
            if (r0 == 0) goto L13
            r0 = r15
            bq.a$e r0 = (bq.a.e) r0
            int r1 = r0.f4380z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4380z = r1
            goto L18
        L13:
            bq.a$e r0 = new bq.a$e
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f4378x
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f4380z
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            int r14 = r0.f4374t
            java.lang.Object r1 = r0.f4377w
            tu.a r1 = (tu.a) r1
            java.lang.Object r0 = r0.f4376v
            ju.w0 r0 = (ju.w0) r0
            gt.o.b(r15)
            goto La0
        L38:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L40:
            int r14 = r0.f4374t
            java.lang.Object r2 = r0.f4376v
            tu.a r2 = (tu.a) r2
            gt.o.b(r15)
            goto L5e
        L4a:
            gt.o.b(r15)
            tu.a r2 = r13.mutex
            r0.f4376v = r2
            r0.f4374t = r14
            r0.f4375u = r3
            r0.f4380z = r5
            java.lang.Object r15 = r2.c(r6, r0)
            if (r15 != r1) goto L5e
            goto L9d
        L5e:
            java.util.LinkedHashMap<java.lang.Integer, bq.a$c> r15 = r13.fetchPostJobs     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r5 = ot.b.c(r14)     // Catch: java.lang.Throwable -> L74
            java.lang.Object r15 = r15.get(r5)     // Catch: java.lang.Throwable -> L74
            bq.a$c r15 = (bq.a.c) r15     // Catch: java.lang.Throwable -> L74
            if (r15 == 0) goto L77
            ju.w0 r14 = r15.a()     // Catch: java.lang.Throwable -> L74
            r2.f(r6)
            return r14
        L74:
            r0 = move-exception
            r14 = r0
            goto Lba
        L77:
            kotlin.Unit r15 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L74
            r2.f(r6)
            ju.p0 r7 = r13.coroutineScope
            bq.a$f r10 = new bq.a$f
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            ju.w0 r15 = ju.i.b(r7, r8, r9, r10, r11, r12)
            tu.a r2 = r13.mutex
            r0.f4376v = r15
            r0.f4377w = r2
            r0.f4374t = r14
            r0.f4375u = r3
            r0.f4380z = r4
            java.lang.Object r0 = r2.c(r6, r0)
            if (r0 != r1) goto L9e
        L9d:
            return r1
        L9e:
            r0 = r15
            r1 = r2
        La0:
            java.util.LinkedHashMap<java.lang.Integer, bq.a$c> r15 = r13.fetchPostJobs     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r14 = ot.b.c(r14)     // Catch: java.lang.Throwable -> Lb4
            bq.a$c r2 = new bq.a$c     // Catch: java.lang.Throwable -> Lb4
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lb4
            r15.put(r14, r2)     // Catch: java.lang.Throwable -> Lb4
            kotlin.Unit r14 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> Lb4
            r1.f(r6)
            return r0
        Lb4:
            r0 = move-exception
            r14 = r0
            r1.f(r6)
            throw r14
        Lba:
            r2.f(r6)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.a.l(int, mt.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(int r8, mt.b<? super gt.n<com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo>> r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.a.m(int, mt.b):java.lang.Object");
    }

    public final void n(int index) {
        if (this.indexToPoseInfo.getValue().get(Integer.valueOf(index)) != null) {
            return;
        }
        k.d(this.coroutineScope, null, null, new h(index, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bq.a.i
            if (r0 == 0) goto L13
            r0 = r6
            bq.a$i r0 = (bq.a.i) r0
            int r1 = r0.f4400x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4400x = r1
            goto L18
        L13:
            bq.a$i r0 = new bq.a$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4398v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f4400x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f4396t
            tu.a r0 = (tu.a) r0
            gt.o.b(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            gt.o.b(r6)
            tu.a r6 = r5.mutex
            r0.f4396t = r6
            r2 = 0
            r0.f4397u = r2
            r0.f4400x = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r6
        L4a:
            mu.c0<java.util.Map<java.lang.Integer, com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo>> r6 = r5.indexToPoseInfo     // Catch: java.lang.Throwable -> L60
            java.util.Map r1 = kotlin.collections.k0.j()     // Catch: java.lang.Throwable -> L60
            r6.setValue(r1)     // Catch: java.lang.Throwable -> L60
            java.util.LinkedHashMap<java.lang.Integer, bq.a$c> r6 = r5.fetchPostJobs     // Catch: java.lang.Throwable -> L60
            r6.clear()     // Catch: java.lang.Throwable -> L60
            kotlin.Unit r6 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L60
            r0.f(r4)
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L60:
            r6 = move-exception
            r0.f(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.a.o(mt.b):java.lang.Object");
    }
}
