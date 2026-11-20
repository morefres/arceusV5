package bi;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lbi/f;", "", "<init>", "()V", "", j6.b.f21518e, "()Z", "c", "Lgt/h;", rl.d.f30696a, "isPgsModuleInstalled", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f4188a = new f();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final gt.h isPgsModuleInstalled = gt.i.b(new Function0() { // from class: bi.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            boolean e10;
            e10 = f.e();
            return Boolean.valueOf(e10);
        }
    });

    public static final boolean e() {
        boolean k10 = qh.h.k("pgs");
        Log.i("rbx.achievements.pgsrollout", "isPgsModuleInstalled: " + k10);
        return k10;
    }

    public final boolean b() {
        return rh.h.a().g() ? d() : c();
    }

    public final boolean c() {
        String p8 = rh.h.a().p();
        Intrinsics.checkNotNullExpressionValue(p8, "PgsRolloutCountries(...)");
        List split$default = StringsKt.split$default(p8, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(q.u(split$default, 10));
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.p1((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return g.b(CollectionsKt.Q0(arrayList2));
    }

    public final boolean d() {
        return ((Boolean) isPgsModuleInstalled.getValue()).booleanValue();
    }
}
