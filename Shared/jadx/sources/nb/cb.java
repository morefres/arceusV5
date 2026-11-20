package nb;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f26133a;
    public final /* synthetic */ bb b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bb f26134c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jb f26136e;

    public cb(jb jbVar, Bundle bundle, bb bbVar, bb bbVar2, long j10) {
        this.f26133a = bundle;
        this.b = bbVar;
        this.f26134c = bbVar2;
        this.f26135d = j10;
        Objects.requireNonNull(jbVar);
        this.f26136e = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26136e.A(this.f26133a, this.b, this.f26134c, this.f26135d);
    }
}
