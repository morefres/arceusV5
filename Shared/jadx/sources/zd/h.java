package zd;

import java.io.File;

/* loaded from: classes2.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f37996a;

    public h(i iVar) {
        this.f37996a = iVar;
    }

    @Override // zd.m
    public final void a(n nVar, File file, boolean z10) {
        this.f37996a.b.add(file);
        if (z10) {
            return;
        }
        this.f37996a.f37998c.set(false);
    }
}
