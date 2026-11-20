package hj;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.function.Consumer;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import k6.d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.ImageRequest;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000f¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0017\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lhj/b0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "Landroid/graphics/Bitmap;", ve.a.f33391e, "(Landroid/content/Context;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "", "userId", rl.d.f30696a, "(Landroid/content/Context;JLmt/b;)Ljava/lang/Object;", "Ljava/util/function/Consumer;", "callback", "", j6.b.f21518e, "(Landroid/content/Context;Ljava/lang/String;Ljava/util/function/Consumer;)V", "c", "(Landroid/content/Context;JLjava/util/function/Consumer;)V", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext$annotations", "coroutineContext", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b0 f19438a = new b0();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static CoroutineContext coroutineContext = g1.b().plus(z2.b(null, 1, null));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lju/p0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchThumbnail$3$1", f = "ThumbnailFetcher.kt", l = {MotionEventCompat.AXIS_GENERIC_12}, m = "invokeSuspend", v = 1)
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Bitmap>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f19439t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k6.s f19440u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f19441v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k6.s sVar, ImageRequest imageRequest, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f19440u = sVar;
            this.f19441v = imageRequest;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f19440u, this.f19441v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f19439t;
            if (i10 == 0) {
                gt.o.b(obj);
                k6.s sVar = this.f19440u;
                ImageRequest imageRequest = this.f19441v;
                this.f19439t = 1;
                obj = sVar.d(imageRequest, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            k6.n image = ((x6.k) obj).getImage();
            if (image != null) {
                return k6.v.g(image, 0, 0, 3, null);
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Bitmap> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchThumbnailWithCallback$1", f = "ThumbnailFetcher.kt", l = {97}, m = "invokeSuspend", v = 1)
    public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f19442t;

        /* renamed from: u, reason: collision with root package name */
        public int f19443u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Consumer<Bitmap> f19444v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f19445w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f19446x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Consumer<Bitmap> consumer, Context context, String str, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f19444v = consumer;
            this.f19445w = context;
            this.f19446x = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f19444v, this.f19445w, this.f19446x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Consumer consumer;
            Object e10 = nt.c.e();
            int i10 = this.f19443u;
            if (i10 == 0) {
                gt.o.b(obj);
                Consumer<Bitmap> consumer2 = this.f19444v;
                b0 b0Var = b0.f19438a;
                Context context = this.f19445w;
                String str = this.f19446x;
                this.f19442t = consumer2;
                this.f19443u = 1;
                Object a10 = b0Var.a(context, str, this);
                if (a10 == e10) {
                    return e10;
                }
                consumer = consumer2;
                obj = a10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                consumer = (Consumer) this.f19442t;
                gt.o.b(obj);
            }
            consumer.accept(obj);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchUserThumbnailWithCallback$1", f = "ThumbnailFetcher.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class c extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f19447t;

        /* renamed from: u, reason: collision with root package name */
        public int f19448u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Consumer<Bitmap> f19449v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f19450w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f19451x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Consumer<Bitmap> consumer, Context context, long j10, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f19449v = consumer;
            this.f19450w = context;
            this.f19451x = j10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f19449v, this.f19450w, this.f19451x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Consumer consumer;
            Object e10 = nt.c.e();
            int i10 = this.f19448u;
            if (i10 == 0) {
                gt.o.b(obj);
                Consumer<Bitmap> consumer2 = this.f19449v;
                b0 b0Var = b0.f19438a;
                Context context = this.f19450w;
                long j10 = this.f19451x;
                this.f19447t = consumer2;
                this.f19448u = 1;
                Object d10 = b0Var.d(context, j10, this);
                if (d10 == e10) {
                    return e10;
                }
                consumer = consumer2;
                obj = d10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                consumer = (Consumer) this.f19447t;
                gt.o.b(obj);
            }
            consumer.accept(obj);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher", f = "ThumbnailFetcher.kt", l = {64, 80}, m = "loadUserThumbnail", v = 1)
    public static final class d extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f19452t;

        /* renamed from: u, reason: collision with root package name */
        public Object f19453u;

        /* renamed from: v, reason: collision with root package name */
        public Object f19454v;

        /* renamed from: w, reason: collision with root package name */
        public long f19455w;

        /* renamed from: x, reason: collision with root package name */
        public int f19456x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f19457y;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19457y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return b0.this.d(null, 0L, this);
        }
    }

    @Nullable
    public final Object a(@NotNull Context context, @Nullable String str, @NotNull mt.b<? super Bitmap> bVar) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        Object g10 = ju.i.g(coroutineContext, new a(d0.a(context), x6.i.j(new ImageRequest.a(context).c(str), new c7.a()).b(), null), bVar);
        return g10 == nt.c.e() ? g10 : (Bitmap) g10;
    }

    public final void b(@NotNull Context context, @Nullable String url, @NotNull Consumer<Bitmap> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ju.k.d(q0.a(coroutineContext), null, null, new b(callback, context, url, null), 3, null);
    }

    public final void c(@NotNull Context context, long userId, @NotNull Consumer<Bitmap> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ju.k.d(q0.a(coroutineContext), null, null, new c(callback, context, userId, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull android.content.Context r17, long r18, @org.jetbrains.annotations.NotNull mt.b<? super android.graphics.Bitmap> r20) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.b0.d(android.content.Context, long, mt.b):java.lang.Object");
    }
}
