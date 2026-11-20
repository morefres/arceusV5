package nb;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s6 implements com.google.android.gms.internal.measurement.cd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26647a;
    public final /* synthetic */ x6 b;

    public s6(x6 x6Var, String str) {
        this.f26647a = str;
        Objects.requireNonNull(x6Var);
        this.b = x6Var;
    }

    @Override // com.google.android.gms.internal.measurement.cd
    public final String a(String str) {
        Map map = (Map) this.b.p().get(this.f26647a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
