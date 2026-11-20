package xo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;

/* loaded from: classes3.dex */
public final class o0 implements dt.d<UiStepSavedStateHelper> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f35902a;
    public final dt.i<ju.p0> b;

    public o0(dt.i<Context> iVar, dt.i<ju.p0> iVar2) {
        this.f35902a = iVar;
        this.b = iVar2;
    }

    public static o0 a(dt.i<Context> iVar, dt.i<ju.p0> iVar2) {
        return new o0(iVar, iVar2);
    }

    public static UiStepSavedStateHelper c(Context context, ju.p0 p0Var) {
        return new UiStepSavedStateHelper(context, p0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public UiStepSavedStateHelper get() {
        return c(this.f35902a.get(), this.b.get());
    }
}
