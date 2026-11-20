package mi;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import ci.j;
import gt.o;
import ju.g1;
import ju.i;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import ot.l;
import ot.m;
import rg.a1;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "userId", "", "c", "(JLmt/b;)Ljava/lang/Object;", ve.a.f33391e, "", "userIds", j6.b.f21518e, "(Ljava/util/List;Lmt/b;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.job.UserJobsKt", f = "UserJobs.kt", l = {MotionEventCompat.AXIS_GENERIC_5}, m = "fetchAvatarHeadshots", v = 1)
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f24544t;

        /* renamed from: u, reason: collision with root package name */
        public Object f24545u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f24546v;

        /* renamed from: w, reason: collision with root package name */
        public int f24547w;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24546v = obj;
            this.f24547w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return g.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.job.UserJobsKt$fetchUserAndHeadshot$2", f = "UserJobs.kt", l = {MotionEventCompat.AXIS_DISTANCE}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f24548t;

        /* renamed from: u, reason: collision with root package name */
        public Object f24549u;

        /* renamed from: v, reason: collision with root package name */
        public Object f24550v;

        /* renamed from: w, reason: collision with root package name */
        public Object f24551w;

        /* renamed from: x, reason: collision with root package name */
        public Object f24552x;

        /* renamed from: y, reason: collision with root package name */
        public int f24553y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ long f24554z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f24554z = j10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f24554z, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f24553y;
            if (i10 == 0) {
                o.b(obj);
                String Z = a1.Z(this.f24554z);
                j i11 = ci.c.i(Z, null, null);
                String a10 = i11.a();
                JSONObject jSONObject = new JSONObject(a10);
                ch.a aVar = new ch.a(jSONObject.optLong("id", -1L), jSONObject.optString("displayName"));
                ch.b.b().e(aVar);
                long j10 = this.f24554z;
                this.f24548t = l.a(Z);
                this.f24549u = l.a(i11);
                this.f24550v = l.a(a10);
                this.f24551w = l.a(jSONObject);
                this.f24552x = l.a(aVar);
                this.f24553y = 1;
                if (g.a(j10, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Nullable
    public static final Object a(long j10, @NotNull mt.b<? super Unit> bVar) {
        Object b10 = b(kotlin.collections.o.d(ot.b.d(j10)), bVar);
        return b10 == nt.c.e() ? b10 : Unit.f22894a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Long> r17, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof mi.g.a
            if (r1 == 0) goto L16
            r1 = r0
            mi.g$a r1 = (mi.g.a) r1
            int r2 = r1.f24547w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f24547w = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            mi.g$a r1 = new mi.g$a
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f24546v
            java.lang.Object r1 = nt.c.e()
            int r2 = r7.f24547w
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r7.f24545u
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r7.f24544t
            java.util.List r1 = (java.util.List) r1
            gt.o.b(r0)
            goto L7f
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            gt.o.b(r0)
            boolean r0 = r17.isEmpty()
            if (r0 == 0) goto L49
            kotlin.Unit r0 = kotlin.Unit.f22894a
            return r0
        L49:
            r8 = r17
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r15 = 62
            r16 = 0
            java.lang.String r9 = ","
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt.m0(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            tk.d r2 = tk.g.d()
            xk.m r2 = r2.d()
            java.lang.Object r4 = ot.l.a(r17)
            r7.f24544t = r4
            java.lang.Object r4 = ot.l.a(r0)
            r7.f24545u = r4
            r7.f24547w = r3
            java.lang.String r4 = "150x150"
            java.lang.String r5 = "Png"
            r6 = 0
            r3 = r0
            java.lang.Object r0 = r2.a(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L7f
            return r1
        L7f:
            bl.b r0 = (bl.b) r0
            java.util.List r1 = kotlin.collections.o.c()
            java.util.List<bl.a> r0 = r0.data
            java.util.Iterator r0 = r0.iterator()
        L8b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lbd
            java.lang.Object r2 = r0.next()
            bl.a r2 = (bl.a) r2
            java.lang.String r3 = r2.imageUrl
            if (r3 == 0) goto Lb3
            int r3 = r3.length()
            if (r3 != 0) goto La2
            goto Lb3
        La2:
            ch.b r3 = ch.b.b()
            long r4 = r2.targetId
            ch.a r3 = r3.d(r4)
            if (r3 == 0) goto Lb3
            java.lang.String r4 = r2.imageUrl
            r3.e(r4)
        Lb3:
            long r2 = r2.targetId
            java.lang.Long r2 = ot.b.d(r2)
            r1.add(r2)
            goto L8b
        Lbd:
            java.util.List r0 = kotlin.collections.o.a(r1)
            ev.c r1 = ev.c.d()
            oh.b r2 = new oh.b
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Collection r0 = (java.util.Collection) r0
            r3.<init>(r0)
            r2.<init>(r3)
            r1.j(r2)
            kotlin.Unit r0 = kotlin.Unit.f22894a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.g.b(java.util.List, mt.b):java.lang.Object");
    }

    @Nullable
    public static final Object c(long j10, @NotNull mt.b<? super Unit> bVar) {
        Object g10 = i.g(g1.b(), new b(j10, null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }
}
