package wi;

import j6.b;
import kotlin.Metadata;
import mu.c0;
import mu.j;
import mu.p0;
import mu.r0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lwi/a;", "", "<init>", "()V", "", "newInExperience", "", b.f21518e, "(Z)V", "Lmu/c0;", "Lmu/c0;", "_isInExperience", "Lmu/p0;", "c", "Lmu/p0;", ve.a.f33391e, "()Lmu/p0;", "isInExperience", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f34341a = new a();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final c0<Boolean> _isInExperience;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final p0<Boolean> isInExperience;

    static {
        c0<Boolean> a10 = r0.a(Boolean.FALSE);
        _isInExperience = a10;
        isInExperience = j.a(a10);
    }

    @NotNull
    public final p0<Boolean> a() {
        return isInExperience;
    }

    public final void b(boolean newInExperience) {
        _isInExperience.setValue(Boolean.valueOf(newInExperience));
    }
}
