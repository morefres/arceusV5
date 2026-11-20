package ym;

import android.content.res.Resources;
import android.view.View;
import ju.CoroutineName;
import ju.d2;
import ju.g2;
import ju.p0;
import ju.q0;
import ju.r0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroid/view/View;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lju/p0;", "Lmt/b;", "", "", "block", "Lju/d2;", j6.b.f21518e, "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lju/d2;", "Lym/c;", ve.a.f33391e, "(Landroid/view/View;)Lym/c;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", j6.b.f21518e, "()V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function0<Unit> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ c f36751i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f36752j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, mt.b<? super Unit>, Object> f36753k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c cVar, CoroutineContext coroutineContext, Function2<? super p0, ? super mt.b<? super Unit>, ? extends Object> function2) {
            super(0);
            this.f36751i = cVar;
            this.f36752j = coroutineContext;
            this.f36753k = function2;
        }

        public final void b() {
            ju.i.c(this.f36751i.getCoroutineScope(), this.f36752j, r0.f22145d, this.f36753k);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            b();
            return Unit.f22894a;
        }
    }

    public static final c a(View view) {
        Object tag = view.getTag(o.b);
        c cVar = null;
        c cVar2 = tag instanceof c ? (c) tag : null;
        if (cVar2 != null && q0.i(cVar2.getCoroutineScope())) {
            cVar = cVar2;
        }
        if (cVar != null) {
            return cVar;
        }
        android.view.s a10 = zm.c.f38109a.a(view);
        if (a10 == null) {
            throw new IllegalStateException("ViewTreeLifecycleOwner is required by View.ensureAttachedScope");
        }
        android.view.m a11 = android.view.t.a(a10);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) view.getClass().getName());
        sb3.append('@');
        sb3.append(view.hashCode());
        sb2.append(sb3.toString());
        if (view.getId() != -1) {
            try {
                String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
                sb2.append('-');
                sb2.append(resourceEntryName);
            } catch (Resources.NotFoundException unused) {
            }
        }
        String sb4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        c cVar3 = new c(q0.j(a11, new CoroutineName(sb4)));
        view.setTag(o.b, cVar3);
        view.addOnAttachStateChangeListener(cVar3);
        return cVar3;
    }

    @NotNull
    public static final d2 b(@NotNull View view, @NotNull CoroutineContext context, @NotNull Function2<? super p0, ? super mt.b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        if (context.get(d2.INSTANCE) != null) {
            throw new IllegalArgumentException("Expected custom CoroutineContext to not contain a Job.");
        }
        c a10 = a(view);
        a aVar = new a(a10, context, block);
        if (view.isAttachedToWindow()) {
            aVar.invoke();
        } else {
            a10.c(aVar);
        }
        return g2.h(a10.getCoroutineScope().getCoroutineContext());
    }

    public static /* synthetic */ d2 c(View view, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f22936a;
        }
        return b(view, coroutineContext, function2);
    }
}
