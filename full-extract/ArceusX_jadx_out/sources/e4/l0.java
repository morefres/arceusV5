package e4;

import android.view.a1;
import android.view.b1;
import android.view.c1;
import android.view.x0;
import android.view.z0;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "Lgu/c;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/b1;", "storeProducer", "Lk4/a;", "extrasProducer", "Landroidx/lifecycle/a1$c;", "factoryProducer", "Lgt/h;", j6.b.f21518e, "(Landroidx/fragment/app/c;Lgu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lgt/h;", "Landroidx/lifecycle/c1;", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/a1$c;", j6.b.f21518e, "()Landroidx/lifecycle/a1$c;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function0<a1.c> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f15664i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.c cVar) {
            super(0);
            this.f15664i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return this.f15664i.W();
        }
    }

    @NotNull
    public static final <VM extends x0> gt.h<VM> b(@NotNull androidx.fragment.app.c cVar, @NotNull gu.c<VM> cVar2, @NotNull Function0<? extends b1> function0, @NotNull Function0<? extends CreationExtras> function02, @Nullable Function0<? extends a1.c> function03) {
        if (function03 == null) {
            function03 = new a(cVar);
        }
        return new z0(cVar2, function0, function03, function02);
    }

    public static final c1 c(gt.h<? extends c1> hVar) {
        return hVar.getValue();
    }
}
