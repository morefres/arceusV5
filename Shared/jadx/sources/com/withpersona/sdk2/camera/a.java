package com.withpersona.sdk2.camera;

import com.withpersona.sdk2.camera.d;
import gt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import mu.p0;
import org.jetbrains.annotations.NotNull;
import ot.l;
import ot.m;
import yt.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmu/p0;", "Lcom/withpersona/sdk2/camera/d;", "Lmu/h;", ve.a.f33391e, "(Lmu/p0;)Lmu/h;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/camera/d;", "state", "", "<anonymous>", "(Lmu/i;Lcom/withpersona/sdk2/camera/d;)Z"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.CameraControllerKt$completeWhenClosed$1", f = "CameraController.kt", l = {100}, m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.a$a, reason: collision with other inner class name */
    public static final class C0165a extends m implements n<i<? super d>, d, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9970t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9971u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f9972v;

        public C0165a(mt.b<? super C0165a> bVar) {
            super(3, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f9971u;
            d dVar = (d) this.f9972v;
            Object e10 = nt.c.e();
            int i10 = this.f9970t;
            boolean z10 = true;
            if (i10 == 0) {
                o.b(obj);
                this.f9971u = l.a(iVar);
                this.f9972v = dVar;
                this.f9970t = 1;
                if (iVar.emit(dVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            if ((dVar instanceof d.Closed) && !((d.Closed) dVar).getIsClosedDueToBadCameraConfiguration()) {
                z10 = false;
            }
            return ot.b.a(z10);
        }

        @Override // yt.n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super d> iVar, d dVar, mt.b<? super Boolean> bVar) {
            C0165a c0165a = new C0165a(bVar);
            c0165a.f9971u = iVar;
            c0165a.f9972v = dVar;
            return c0165a.invokeSuspend(Unit.f22894a);
        }
    }

    @NotNull
    public static final mu.h<d> a(@NotNull p0<? extends d> p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        return j.T(p0Var, new C0165a(null));
    }
}
