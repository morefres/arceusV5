package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import com.google.mlkit.common.MlKitException;
import f6.j0;
import f6.k0;
import f6.p;
import f6.q1;
import f6.y;
import i6.a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl.d;
import x5.w;
import y5.f1;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", d.f30696a, "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    @NotNull
    public c.a d() {
        String str;
        String str2;
        String d10;
        String str3;
        String str4;
        String d11;
        String str5;
        String str6;
        String d12;
        f1 p8 = f1.p(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(p8, "getInstance(...)");
        WorkDatabase u8 = p8.u();
        Intrinsics.checkNotNullExpressionValue(u8, "getWorkDatabase(...)");
        k0 c02 = u8.c0();
        y a02 = u8.a0();
        q1 d02 = u8.d0();
        p Z = u8.Z();
        List<j0> d13 = c02.d(p8.n().getClock().a() - TimeUnit.DAYS.toMillis(1L));
        List<j0> w5 = c02.w();
        List<j0> o8 = c02.o(MlKitException.CODE_SCANNER_UNAVAILABLE);
        if (!d13.isEmpty()) {
            w e10 = w.e();
            str5 = a.f20196a;
            e10.f(str5, "Recently completed work:\n\n");
            w e11 = w.e();
            str6 = a.f20196a;
            d12 = a.d(a02, d02, Z, d13);
            e11.f(str6, d12);
        }
        if (!w5.isEmpty()) {
            w e12 = w.e();
            str3 = a.f20196a;
            e12.f(str3, "Running work:\n\n");
            w e13 = w.e();
            str4 = a.f20196a;
            d11 = a.d(a02, d02, Z, w5);
            e13.f(str4, d11);
        }
        if (!o8.isEmpty()) {
            w e14 = w.e();
            str = a.f20196a;
            e14.f(str, "Enqueued work:\n\n");
            w e15 = w.e();
            str2 = a.f20196a;
            d10 = a.d(a02, d02, Z, o8);
            e15.f(str2, d10);
        }
        c.a d14 = c.a.d();
        Intrinsics.checkNotNullExpressionValue(d14, "success(...)");
        return d14;
    }
}
