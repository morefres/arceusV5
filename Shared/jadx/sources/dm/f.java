package dm;

import androidx.core.view.MotionEventCompat;
import e3.o;
import gt.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import org.jetbrains.annotations.NotNull;
import ot.m;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ldm/f;", "", "Lj/b;", "activity", "<init>", "(Lj/b;)V", "", "nonce", "Lmu/h;", "Ldm/g;", "c", "(Ljava/lang/String;)Lmu/h;", ve.a.f33391e, "Lj/b;", "e", "()Lj/b;", "Le3/o;", j6.b.f21518e, "Lgt/h;", "f", "()Le3/o;", "credentialManager", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j.b activity;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h credentialManager;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Ldm/g;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.universalapp.externalidentity.GoogleSignInManager$acquireGoogleCredentials$1", f = "GoogleSignInManager.kt", l = {MotionEventCompat.AXIS_DISTANCE, MotionEventCompat.AXIS_GENERIC_2, 53}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<i<? super g>, mt.b<? super Unit>, Object> {
        public final /* synthetic */ String B;

        /* renamed from: t, reason: collision with root package name */
        public Object f15001t;

        /* renamed from: u, reason: collision with root package name */
        public Object f15002u;

        /* renamed from: v, reason: collision with root package name */
        public Object f15003v;

        /* renamed from: w, reason: collision with root package name */
        public Object f15004w;

        /* renamed from: x, reason: collision with root package name */
        public int f15005x;

        /* renamed from: y, reason: collision with root package name */
        public int f15006y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f15007z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, mt.b<? super a> bVar) {
            super(2, bVar);
            this.B = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = f.this.new a(this.B, bVar);
            aVar.f15007z = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x012c, code lost:
        
            if (r0.emit(r10, r9) != r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x004f, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dm.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super g> iVar, mt.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public f(@NotNull j.b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.credentialManager = gt.i.b(new Function0() { // from class: dm.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                o d10;
                d10 = f.d(f.this);
                return d10;
            }
        });
    }

    public static final o d(f fVar) {
        return o.INSTANCE.a(fVar.activity);
    }

    @NotNull
    public final mu.h<g> c(@NotNull String nonce) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        return j.w(new a(nonce, null));
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public final j.b getActivity() {
        return this.activity;
    }

    public final o f() {
        return (o) this.credentialManager.getValue();
    }
}
