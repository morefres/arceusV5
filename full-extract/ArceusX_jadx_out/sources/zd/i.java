package zd;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f37997a;
    public final /* synthetic */ Set b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f37998c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f37999d;

    public i(o oVar, u uVar, Set set, AtomicBoolean atomicBoolean) {
        this.f37999d = oVar;
        this.f37997a = uVar;
        this.b = set;
        this.f37998c = atomicBoolean;
    }

    @Override // zd.l
    public final void a(ZipFile zipFile, Set set) {
        this.f37999d.f(this.f37997a, set, new h(this));
    }
}
