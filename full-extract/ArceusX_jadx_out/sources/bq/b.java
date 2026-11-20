package bq;

import android.view.l0;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import dt.i;
import java.util.List;
import ju.p0;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i<l0> f4401a;
    public final i<aq.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final i<p0> f4402c;

    /* renamed from: d, reason: collision with root package name */
    public final i<ju.l0> f4403d;

    public b(i<l0> iVar, i<aq.a> iVar2, i<p0> iVar3, i<ju.l0> iVar4) {
        this.f4401a = iVar;
        this.b = iVar2;
        this.f4402c = iVar3;
        this.f4403d = iVar4;
    }

    public static b a(i<l0> iVar, i<aq.a> iVar2, i<p0> iVar3, i<ju.l0> iVar4) {
        return new b(iVar, iVar2, iVar3, iVar4);
    }

    public static a c(l0 l0Var, aq.a aVar, p0 p0Var, ju.l0 l0Var2, String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return new a(l0Var, aVar, p0Var, l0Var2, str, str2, str3, list, l10);
    }

    public a b(String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return c(this.f4401a.get(), this.b.get(), this.f4402c.get(), this.f4403d.get(), str, str2, str3, list, l10);
    }
}
