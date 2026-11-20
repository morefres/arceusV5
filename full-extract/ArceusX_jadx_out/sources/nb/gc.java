package nb;

import android.content.ComponentName;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentName f26266a;
    public final /* synthetic */ nc b;

    public gc(nc ncVar, ComponentName componentName) {
        this.f26266a = componentName;
        Objects.requireNonNull(ncVar);
        this.b = ncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f26504c.K(this.f26266a);
    }
}
