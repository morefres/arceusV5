package nb;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class yd {

    /* renamed from: a, reason: collision with root package name */
    public final String f26842a;
    public final Map b;

    /* renamed from: c, reason: collision with root package name */
    public final za f26843c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.p7 f26844d;

    public yd(String str, Map map, za zaVar, com.google.android.gms.internal.measurement.p7 p7Var) {
        this.f26842a = str;
        this.b = map;
        this.f26843c = zaVar;
        this.f26844d = p7Var;
    }

    public final String a() {
        return this.f26842a;
    }

    public final Map b() {
        Map map = this.b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final za c() {
        return this.f26843c;
    }

    public final com.google.android.gms.internal.measurement.p7 d() {
        return this.f26844d;
    }
}
