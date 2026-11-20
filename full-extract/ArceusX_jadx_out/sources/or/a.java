package or;

import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.ui.network.AddressDetailsResponse;
import com.withpersona.sdk2.inquiry.ui.network.LocationData;
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
import ot.f;
import ot.m;
import rl.d;
import tr.h;
import wm.o;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0012\u0016B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lor/a;", "Lwm/o;", "Lor/a$b;", "Ltr/h;", "", "sessionToken", "addressId", "Lor/c;", "uiService", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lor/c;)V", "Lmu/h;", "run", "()Lmu/h;", "otherWorker", "", "c", "(Lwm/o;)Z", j6.b.f21518e, "Ljava/lang/String;", d.f30696a, "Lor/c;", ve.a.f33391e, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements o<b>, h<b> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String addressId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final or.c uiService;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lor/a$a;", "", "Lor/c;", "uiService", "<init>", "(Lor/c;)V", "", "sessionToken", "addressId", "Lor/a;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;)Lor/a;", "Lor/c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: or.a$a, reason: collision with other inner class name */
    public static final class C0492a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final or.c uiService;

        public C0492a(@NotNull or.c uiService) {
            Intrinsics.checkNotNullParameter(uiService, "uiService");
            this.uiService = uiService;
        }

        @NotNull
        public final a a(@NotNull String sessionToken, @NotNull String addressId) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(addressId, "addressId");
            return new a(sessionToken, addressId, this.uiService, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lor/a$b;", "", "<init>", "()V", j6.b.f21518e, ve.a.f33391e, "Lor/a$b$a;", "Lor/a$b$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lor/a$b$a;", "Lor/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: or.a$b$a, reason: collision with other inner class name */
        public static final class C0493a extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0493a(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lor/a$b$b;", "Lor/a$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "result", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "()Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: or.a$b$b, reason: collision with other inner class name */
        public static final class C0494b extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LocationData result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0494b(@NotNull LocationData result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final LocationData getResult() {
                return this.result;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lor/a$b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker$run$1", f = "UiAddressDetailsWorker.kt", l = {20, MotionEventCompat.AXIS_RELATIVE_Y, BacktraceMetrics.defaultTimeIntervalInMin, 41}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f28119t;

        /* renamed from: u, reason: collision with root package name */
        public Object f28120u;

        /* renamed from: v, reason: collision with root package name */
        public Object f28121v;

        /* renamed from: w, reason: collision with root package name */
        public int f28122w;

        /* renamed from: x, reason: collision with root package name */
        public int f28123x;

        /* renamed from: y, reason: collision with root package name */
        public int f28124y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f28125z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker$run$1$1", f = "UiAddressDetailsWorker.kt", l = {MotionEventCompat.AXIS_WHEEL}, m = "invokeSuspend")
        /* renamed from: or.a$c$a, reason: collision with other inner class name */
        public static final class C0495a extends m implements Function1<mt.b<? super x<AddressDetailsResponse>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f28126t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a f28127u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0495a(a aVar, mt.b<? super C0495a> bVar) {
                super(1, bVar);
                this.f28127u = aVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new C0495a(this.f28127u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f28126t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                or.c cVar = this.f28127u.uiService;
                String str = this.f28127u.sessionToken;
                String str2 = this.f28127u.addressId;
                this.f28126t = 1;
                Object b = cVar.b(str, str2, this);
                return b == e10 ? e10 : b;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super x<AddressDetailsResponse>> bVar) {
                return ((C0495a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = a.this.new c(bVar);
            cVar.f28125z = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00f3, code lost:
        
            if (r1.emit(r6, r18) == r2) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00f5, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        
            if (r1.emit(r5, r18) == r2) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
        
            if (r1.emit(r6, r18) == r2) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        
            if (r3 == r2) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: or.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, mt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public /* synthetic */ a(String str, String str2, or.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, cVar);
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
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof a) && Intrinsics.c(this.addressId, ((a) otherWorker).addressId);
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<b> run() {
        return j.w(new c(null));
    }

    public a(String str, String str2, or.c cVar) {
        this.sessionToken = str;
        this.addressId = str2;
        this.uiService = cVar;
    }
}
