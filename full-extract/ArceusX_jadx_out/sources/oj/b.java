package oj;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageConfig;
import gt.n;
import gt.o;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import x6.ImageRequest;
import x6.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013*\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Loj/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;", "largeIconConfig", "bigPictureConfig", "", "timeoutMs", "Lkotlin/Function1;", "Loj/a;", "", "onComplete", "c", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;JLkotlin/jvm/functions/Function1;)V", "Lkotlin/time/a;", "timeout", "Lgt/n;", "Landroid/graphics/Bitmap;", j6.b.f21518e, "(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLmt/b;)Ljava/lang/Object;", "J", "DEFAULT_TIMEOUT", "Lju/p0;", "Lju/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f27891a = new b();

    /* renamed from: b, reason: from kotlin metadata */
    public static final long DEFAULT_TIMEOUT;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final p0 scope;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27893a;

        static {
            int[] iArr = new int[oj.c.values().length];
            try {
                iArr[oj.c.f27920c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oj.c.f27919a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oj.c.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27893a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher", f = "PushNotificationImageFetcher.kt", l = {101}, m = "load-E0qYoyE", v = 1)
    /* renamed from: oj.b$b, reason: collision with other inner class name */
    public static final class C0489b extends ot.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: t, reason: collision with root package name */
        public Object f27894t;

        /* renamed from: u, reason: collision with root package name */
        public Object f27895u;

        /* renamed from: v, reason: collision with root package name */
        public Object f27896v;

        /* renamed from: w, reason: collision with root package name */
        public Object f27897w;

        /* renamed from: x, reason: collision with root package name */
        public long f27898x;

        /* renamed from: y, reason: collision with root package name */
        public int f27899y;

        /* renamed from: z, reason: collision with root package name */
        public int f27900z;

        public C0489b(mt.b<? super C0489b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object b = b.this.b(null, null, 0L, this);
            return b == nt.c.e() ? b : n.a(b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lx6/k;", "<anonymous>", "(Lju/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$load$3$1$1", f = "PushNotificationImageFetcher.kt", l = {101}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, mt.b<? super k>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27901t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ s f27902u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest.a f27903v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar, ImageRequest.a aVar, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f27902u = sVar;
            this.f27903v = aVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f27902u, this.f27903v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f27901t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            s sVar = this.f27902u;
            ImageRequest b = this.f27903v.b();
            this.f27901t = 1;
            Object d10 = sVar.d(b, this);
            return d10 == e10 ? e10 : d10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super k> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1", f = "PushNotificationImageFetcher.kt", l = {61, 62}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {
        public final /* synthetic */ PushNotificationImageConfig A;
        public final /* synthetic */ Context B;
        public final /* synthetic */ long C;
        public final /* synthetic */ PushNotificationImageConfig D;

        /* renamed from: t, reason: collision with root package name */
        public Object f27904t;

        /* renamed from: u, reason: collision with root package name */
        public Object f27905u;

        /* renamed from: v, reason: collision with root package name */
        public Object f27906v;

        /* renamed from: w, reason: collision with root package name */
        public Object f27907w;

        /* renamed from: x, reason: collision with root package name */
        public int f27908x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f27909y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<oj.a, Unit> f27910z;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$bigPicture$1", f = "PushNotificationImageFetcher.kt", l = {58}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, mt.b<? super n<? extends Bitmap>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f27911t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ PushNotificationImageConfig f27912u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f27913v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ long f27914w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f27912u = pushNotificationImageConfig;
                this.f27913v = context;
                this.f27914w = j10;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f27912u, this.f27913v, this.f27914w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super n<? extends Bitmap>> bVar) {
                return invoke2(p0Var, (mt.b<? super n<Bitmap>>) bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object b;
                Object e10 = nt.c.e();
                int i10 = this.f27911t;
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f27891a;
                    PushNotificationImageConfig pushNotificationImageConfig = this.f27912u;
                    Context context = this.f27913v;
                    a.Companion companion = kotlin.time.a.INSTANCE;
                    long q10 = kotlin.time.b.q(this.f27914w, iu.b.f21120d);
                    this.f27911t = 1;
                    b = bVar.b(pushNotificationImageConfig, context, q10, this);
                    if (b == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    b = ((n) obj).getValue();
                }
                return n.a(b);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, mt.b<? super n<Bitmap>> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$largeIcon$1", f = "PushNotificationImageFetcher.kt", l = {57}, m = "invokeSuspend", v = 1)
        /* renamed from: oj.b$d$b, reason: collision with other inner class name */
        public static final class C0490b extends m implements Function2<p0, mt.b<? super n<? extends Bitmap>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f27915t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ PushNotificationImageConfig f27916u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f27917v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ long f27918w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0490b(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, mt.b<? super C0490b> bVar) {
                super(2, bVar);
                this.f27916u = pushNotificationImageConfig;
                this.f27917v = context;
                this.f27918w = j10;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new C0490b(this.f27916u, this.f27917v, this.f27918w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super n<? extends Bitmap>> bVar) {
                return invoke2(p0Var, (mt.b<? super n<Bitmap>>) bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object b;
                Object e10 = nt.c.e();
                int i10 = this.f27915t;
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f27891a;
                    PushNotificationImageConfig pushNotificationImageConfig = this.f27916u;
                    Context context = this.f27917v;
                    a.Companion companion = kotlin.time.a.INSTANCE;
                    long q10 = kotlin.time.b.q(this.f27918w, iu.b.f21120d);
                    this.f27915t = 1;
                    b = bVar.b(pushNotificationImageConfig, context, q10, this);
                    if (b == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    b = ((n) obj).getValue();
                }
                return n.a(b);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, mt.b<? super n<Bitmap>> bVar) {
                return ((C0490b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super oj.a, Unit> function1, PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, PushNotificationImageConfig pushNotificationImageConfig2, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f27910z = function1;
            this.A = pushNotificationImageConfig;
            this.B = context;
            this.C = j10;
            this.D = pushNotificationImageConfig2;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            d dVar = new d(this.f27910z, this.A, this.B, this.C, this.D, bVar);
            dVar.f27909y = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
        
            if (r5 == r1) goto L15;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = r0.f27909y
                r2 = r1
                ju.p0 r2 = (ju.p0) r2
                java.lang.Object r1 = nt.c.e()
                int r3 = r0.f27908x
                r8 = 2
                r9 = 1
                if (r3 == 0) goto L46
                if (r3 == r9) goto L33
                if (r3 != r8) goto L2b
                java.lang.Object r1 = r0.f27907w
                java.lang.Object r2 = r0.f27906v
                kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                java.lang.Object r3 = r0.f27905u
                ju.w0 r3 = (ju.w0) r3
                java.lang.Object r3 = r0.f27904t
                ju.w0 r3 = (ju.w0) r3
                gt.o.b(r18)
                r3 = r2
                r2 = r18
                goto Lb1
            L2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L33:
                java.lang.Object r3 = r0.f27906v
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                java.lang.Object r4 = r0.f27905u
                ju.w0 r4 = (ju.w0) r4
                java.lang.Object r5 = r0.f27904t
                ju.w0 r5 = (ju.w0) r5
                gt.o.b(r18)
                r10 = r5
                r5 = r18
                goto L8b
            L46:
                gt.o.b(r18)
                oj.b$d$b r5 = new oj.b$d$b
                com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageConfig r11 = r0.A
                android.content.Context r12 = r0.B
                long r13 = r0.C
                r15 = 0
                r10 = r5
                r10.<init>(r11, r12, r13, r15)
                r6 = 3
                r7 = 0
                r3 = 0
                r4 = 0
                ju.w0 r10 = ju.i.b(r2, r3, r4, r5, r6, r7)
                oj.b$d$a r5 = new oj.b$d$a
                com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageConfig r12 = r0.D
                android.content.Context r13 = r0.B
                long r14 = r0.C
                r16 = 0
                r11 = r5
                r11.<init>(r12, r13, r14, r16)
                ju.w0 r4 = ju.i.b(r2, r3, r4, r5, r6, r7)
                kotlin.jvm.functions.Function1<oj.a, kotlin.Unit> r3 = r0.f27910z
                java.lang.Object r5 = ot.l.a(r2)
                r0.f27909y = r5
                java.lang.Object r5 = ot.l.a(r10)
                r0.f27904t = r5
                r0.f27905u = r4
                r0.f27906v = r3
                r0.f27908x = r9
                java.lang.Object r5 = r10.w(r0)
                if (r5 != r1) goto L8b
                goto Laf
            L8b:
                gt.n r5 = (gt.n) r5
                java.lang.Object r5 = r5.getValue()
                java.lang.Object r2 = ot.l.a(r2)
                r0.f27909y = r2
                java.lang.Object r2 = ot.l.a(r10)
                r0.f27904t = r2
                java.lang.Object r2 = ot.l.a(r4)
                r0.f27905u = r2
                r0.f27906v = r3
                r0.f27907w = r5
                r0.f27908x = r8
                java.lang.Object r2 = r4.w(r0)
                if (r2 != r1) goto Lb0
            Laf:
                return r1
            Lb0:
                r1 = r5
            Lb1:
                gt.n r2 = (gt.n) r2
                java.lang.Object r2 = r2.getValue()
                oj.a r4 = new oj.a
                r4.<init>(r1, r2)
                r3.invoke(r4)
                kotlin.Unit r1 = kotlin.Unit.f22894a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: oj.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    static {
        a.Companion companion = kotlin.time.a.INSTANCE;
        DEFAULT_TIMEOUT = kotlin.time.b.p(5, iu.b.f21121e);
        scope = q0.a(g1.b().plus(z2.b(null, 1, null)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:35|36))(2:37|(2:39|40)(11:41|(1:43)|44|45|(1:(1:(1:49)(1:59))(1:60))(1:61)|50|51|(1:53)|54|55|(1:57)))|12|13|(3:21|22|(4:24|16|(1:18)|19)(2:25|(2:27|28)(2:29|30)))|15|16|(0)|19))|67|6|7|(0)(0)|12|13|(0)|15|16|(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0118, code lost:
    
        r2 = gt.n.INSTANCE;
        r0 = gt.n.b(gt.o.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageConfig r18, android.content.Context r19, long r20, mt.b<? super gt.n<android.graphics.Bitmap>> r22) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj.b.b(com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageConfig, android.content.Context, long, mt.b):java.lang.Object");
    }

    public final void c(@NotNull Context context, @Nullable PushNotificationImageConfig largeIconConfig, @Nullable PushNotificationImageConfig bigPictureConfig, long timeoutMs, @NotNull Function1<? super oj.a, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        ju.k.d(scope, null, null, new d(onComplete, largeIconConfig, context, timeoutMs, bigPictureConfig, null), 3, null);
    }
}
