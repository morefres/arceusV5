package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f26833a;
    public final /* synthetic */ qa b;

    public y9(qa qaVar, x xVar) {
        this.f26833a = xVar;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.b;
        g7 g7Var = qaVar.f26328a;
        k6 x10 = g7Var.x();
        g7 g7Var2 = x10.f26328a;
        x10.h();
        x u8 = x10.u();
        x xVar = this.f26833a;
        if (!q8.u(xVar.b(), u8.b())) {
            g7Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(xVar.b()));
            return;
        }
        SharedPreferences.Editor edit = x10.p().edit();
        edit.putString("dma_consent_settings", xVar.e());
        edit.apply();
        g7Var.a().w().b("Setting DMA consent(FE)", xVar);
        g7 g7Var3 = qaVar.f26328a;
        if (g7Var3.J().D()) {
            g7Var3.J().a0();
        } else {
            g7Var3.J().Y(false);
        }
    }
}
