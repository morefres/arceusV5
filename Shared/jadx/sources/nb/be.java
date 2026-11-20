package nb;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class be implements y5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26077a;
    public final /* synthetic */ List b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ me f26078c;

    public be(me meVar, String str, List list) {
        this.f26077a = str;
        this.b = list;
        Objects.requireNonNull(meVar);
        this.f26078c = meVar;
    }

    @Override // nb.y5
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f26078c.A(true, i10, th2, bArr, this.f26077a, this.b);
    }
}
