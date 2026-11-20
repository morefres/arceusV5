package kl;

import com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback;
import com.roblox.protocols.systemdialogplatforminterface.generated.SystemDialogContext;
import ek.q;
import gt.o;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import ju.g1;
import ju.k;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ot.m;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkl/d;", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "Lju/p0;", "coroutineScope", "<init>", "(Lju/p0;)V", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;", "context", "", "onOpened", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V", "onClosed", "onOkClicked", "onCancelClicked", "Ljava/lang/Runnable;", "work", "g", "(Ljava/lang/Runnable;)V", ve.a.f33391e, "Lju/p0;", "", j6.b.f21518e, "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/CountDownLatch;", "c", "Ljava/util/concurrent/atomic/AtomicReference;", "latch", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends ISystemDialogCallback {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReference<CountDownLatch> latch;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.protocols.systemdialog.DeferredWorkSystemDialogObserver$waitIfBlockedAndDeferWork$1", f = "DeferredWorkSystemDialogObserver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22844t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Runnable f22846v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f22846v = runnable;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return d.this.new a(this.f22846v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f22844t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            try {
                CountDownLatch countDownLatch = (CountDownLatch) d.this.latch.get();
                if (countDownLatch != null) {
                    countDownLatch.await();
                }
            } catch (InterruptedException e10) {
                q.f(d.this.TAG, "Await for blockage calls failed.", e10);
            }
            this.f22846v.run();
            d.this.latch.set(null);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final CountDownLatch e(CountDownLatch countDownLatch) {
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        return countDownLatch;
    }

    public static final CountDownLatch f(CountDownLatch countDownLatch) {
        return countDownLatch == null ? new CountDownLatch(1) : countDownLatch;
    }

    public final void g(@NotNull Runnable work) {
        Intrinsics.checkNotNullParameter(work, "work");
        k.d(this.coroutineScope, null, null, new a(work, null), 3, null);
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
    public void onCancelClicked(@NotNull SystemDialogContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
    public void onClosed(@NotNull SystemDialogContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.getId() < 0) {
            return;
        }
        this.latch.getAndUpdate(new UnaryOperator() { // from class: kl.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                CountDownLatch e10;
                e10 = d.e((CountDownLatch) obj);
                return e10;
            }
        });
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
    public void onOkClicked(@NotNull SystemDialogContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
    public void onOpened(@NotNull SystemDialogContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.getId() < 0) {
            return;
        }
        this.latch.getAndUpdate(new UnaryOperator() { // from class: kl.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                CountDownLatch f10;
                f10 = d.f((CountDownLatch) obj);
                return f10;
            }
        });
    }

    public d(@NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.TAG = "rbx.DeferredWorkSystemDialogObserver";
        this.latch = new AtomicReference<>(null);
    }

    public /* synthetic */ d(p0 p0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q0.a(g1.a()) : p0Var);
    }
}
