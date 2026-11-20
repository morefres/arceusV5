package dn;

import android.graphics.Rect;
import android.media.Image;
import dn.r0;
import g0.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u001f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u001e\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'H\u0096A¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.¨\u0006/"}, d2 = {"Ldn/n0;", "Lhn/a;", "Lg0/u0$a;", "Lmu/g0;", "Lin/c;", "Lfn/g;", "Ldn/r0;", "selfieProcessor", "Lmu/b0;", "resultFlow", "<init>", "(Ldn/r0;Lmu/b0;)V", "", "minFaceRatio", "maxFaceRatio", "", "analyzeLightConditions", "", "m", "(DDZ)V", "Ldn/r0$c;", "pose", "n", "(Ldn/r0$c;)V", "Landroidx/camera/core/d;", "imageProxy", "k", "(Landroidx/camera/core/d;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "f", "(Landroid/media/Image;I)V", "Landroid/graphics/Rect;", "rect", "previewRect", j6.b.f21518e, "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Ldn/r0;", "Lmu/b0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n0 implements hn.a, u0.a, mu.g0<in.c>, fn.g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 selfieProcessor;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final mu.b0<in.c> resultFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$1", f = "SelfieDirectionFeed.kt", l = {54}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15107t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ in.c f15109v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(in.c cVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f15109v = cVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return n0.this.new a(this.f15109v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f15107t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.b0 b0Var = n0.this.resultFlow;
                in.c cVar = this.f15109v;
                this.f15107t = 1;
                if (b0Var.emit(cVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$2", f = "SelfieDirectionFeed.kt", l = {64}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15110t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ in.c f15112v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(in.c cVar, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f15112v = cVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return n0.this.new b(this.f15112v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f15110t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.b0 b0Var = n0.this.resultFlow;
                in.c cVar = this.f15112v;
                this.f15110t = 1;
                if (b0Var.emit(cVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public n0(@NotNull r0 selfieProcessor, @NotNull mu.b0<in.c> resultFlow) {
        Intrinsics.checkNotNullParameter(selfieProcessor, "selfieProcessor");
        Intrinsics.checkNotNullParameter(resultFlow, "resultFlow");
        this.selfieProcessor = selfieProcessor;
        this.resultFlow = resultFlow;
    }

    @Override // hn.a
    public void b(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.selfieProcessor.w(rect, previewRect);
    }

    @Override // mu.g0, mu.h
    @Nullable
    public Object collect(@NotNull mu.i<? super in.c> iVar, @NotNull mt.b<?> bVar) {
        return this.resultFlow.collect(iVar, bVar);
    }

    @Override // fn.g
    public void f(@NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        try {
            in.c d10 = this.selfieProcessor.d(image, rotationDegrees);
            wt.a.a(image, null);
            ju.j.b(null, new b(d10, null), 1, null);
        } finally {
        }
    }

    @Override // g0.u0.a
    public void k(@NotNull androidx.camera.core.d imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        try {
            in.c e10 = this.selfieProcessor.e(imageProxy);
            wt.a.a(imageProxy, null);
            ju.j.b(null, new a(e10, null), 1, null);
        } finally {
        }
    }

    public final void m(double minFaceRatio, double maxFaceRatio, boolean analyzeLightConditions) {
        this.selfieProcessor.u(minFaceRatio, maxFaceRatio, analyzeLightConditions);
    }

    public final void n(@NotNull r0.c pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        this.selfieProcessor.v(pose);
    }
}
