package kotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k;
import mt.b;
import mu.i;
import org.jetbrains.annotations.NotNull;
import yt.n;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "Lmu/i;", "", "Lmt/b;", "", ve.a.f33391e, "Lyt/n;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nu.w, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class Function3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n<i<Object>, Object, b<? super Unit>, Object> f27449a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nu.w$a */
    public /* synthetic */ class a extends k implements n<i<? super Object>, Object, b<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27450a = new a();

        public a() {
            super(3, i.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // yt.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<Object> iVar, Object obj, b<? super Unit> bVar) {
            return iVar.emit(obj, bVar);
        }
    }

    static {
        a aVar = a.f27450a;
        Intrinsics.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f27449a = (n) h0.e(aVar, 3);
    }
}
