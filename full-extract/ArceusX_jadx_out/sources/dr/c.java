package dr;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ldr/c;", "", "<init>", "()V", "Lkotlin/Function0;", "", ve.a.f33391e, "Lkotlin/jvm/functions/Function0;", j6.b.f21518e, "()Lkotlin/jvm/functions/Function0;", "c", "(Lkotlin/jvm/functions/Function0;)V", "submitCode", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> submitCode = new Function0() { // from class: dr.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Unit d10;
            d10 = c.d();
            return d10;
        }
    };

    public static final Unit d() {
        return Unit.f22894a;
    }

    @NotNull
    public final Function0<Unit> b() {
        return this.submitCode;
    }

    public final void c(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.submitCode = function0;
    }
}
