package de;

import ae.i0;
import java.util.List;

/* loaded from: classes2.dex */
public final class q implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14601a;
    public final /* synthetic */ List b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14602c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f14604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f14605f;

    public q(a aVar, List list, List list2, long j10, boolean z10, List list3) {
        this.f14605f = aVar;
        this.f14601a = list;
        this.b = list2;
        this.f14602c = j10;
        this.f14603d = z10;
        this.f14604e = list3;
    }

    @Override // ae.i0
    public final void a(int i10) {
        this.f14605f.w(6, i10, null, null, null, null, null);
    }

    @Override // ae.i0
    public final void zza() {
        this.f14605f.v(this.f14601a, this.b, this.f14602c);
    }

    @Override // ae.i0
    public final void zzc() {
        if (this.f14603d) {
            return;
        }
        this.f14605f.t(this.f14604e, this.f14601a, this.b, this.f14602c, true);
    }
}
