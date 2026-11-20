package zd;

import java.util.Set;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f38000a;
    public final /* synthetic */ u b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f38001c;

    public j(o oVar, Set set, u uVar) {
        this.f38001c = oVar;
        this.f38000a = set;
        this.b = uVar;
    }

    @Override // zd.l
    public final void a(ZipFile zipFile, Set set) {
        this.f38000a.addAll(o.a(this.f38001c, set, this.b, zipFile));
    }
}
