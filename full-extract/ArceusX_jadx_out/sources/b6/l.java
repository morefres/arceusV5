package b6;

import b6.b;
import f6.j0;
import gt.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yt.n;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb6/l;", "", "", "Lc6/e;", "controllers", "<init>", "(Ljava/util/List;)V", "Ld6/n;", "trackers", "(Ld6/n;)V", "Lf6/j0;", "spec", "Lmu/h;", "Lb6/b;", ve.a.f33391e, "(Lf6/j0;)Lmu/h;", "Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<c6.e> controllers;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements mu.h<b6.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mu.h[] f3839a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: b6.l$a$a, reason: collision with other inner class name */
        public static final class C0075a implements Function0<b6.b[]> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.h[] f3840a;

            public C0075a(mu.h[] hVarArr) {
                this.f3840a = hVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b6.b[] invoke() {
                return new b6.b[this.f3840a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lmu/i;", "", "it", "", "<anonymous>", "(Lmu/i;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {288}, m = "invokeSuspend")
        public static final class b extends ot.m implements n<mu.i<? super b6.b>, b6.b[], mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f3841t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f3842u;

            /* renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f3843v;

            public b(mt.b bVar) {
                super(3, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                b6.b bVar;
                Object e10 = nt.c.e();
                int i10 = this.f3841t;
                if (i10 == 0) {
                    o.b(obj);
                    mu.i iVar = (mu.i) this.f3842u;
                    b6.b[] bVarArr = (b6.b[]) ((Object[]) this.f3843v);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!Intrinsics.c(bVar, b.a.f3813a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = b.a.f3813a;
                    }
                    this.f3841t = 1;
                    if (iVar.emit(bVar, this) == e10) {
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

            @Override // yt.n
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mu.i<? super b6.b> iVar, b6.b[] bVarArr, mt.b<? super Unit> bVar) {
                b bVar2 = new b(bVar);
                bVar2.f3842u = iVar;
                bVar2.f3843v = bVarArr;
                return bVar2.invokeSuspend(Unit.f22894a);
            }
        }

        public a(mu.h[] hVarArr) {
            this.f3839a = hVarArr;
        }

        @Override // mu.h
        public Object collect(mu.i<? super b6.b> iVar, mt.b bVar) {
            mu.h[] hVarArr = this.f3839a;
            Object a10 = kotlin.l.a(iVar, hVarArr, new C0075a(hVarArr), new b(null), bVar);
            return a10 == nt.c.e() ? a10 : Unit.f22894a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull List<? extends c6.e> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.controllers = controllers;
    }

    @NotNull
    public final mu.h<b> a(@NotNull j0 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List<c6.e> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c6.e) obj).a(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.u(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(((c6.e) obj2).b(spec.constraints));
        }
        return mu.j.m(new a((mu.h[]) CollectionsKt.M0(arrayList2).toArray(new mu.h[0])));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(@org.jetbrains.annotations.NotNull d6.n r2) {
        /*
            r1 = this;
            java.lang.String r0 = "trackers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r2 = b6.m.b(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.l.<init>(d6.n):void");
    }
}
