package nb;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ce implements y5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26142a;
    public final /* synthetic */ pe b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ me f26143c;

    public ce(me meVar, String str, pe peVar) {
        this.f26142a = str;
        this.b = peVar;
        Objects.requireNonNull(meVar);
        this.f26143c = meVar;
    }

    @Override // nb.y5
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f26143c.v(this.f26142a, i10, th2, bArr, this.b);
    }
}
