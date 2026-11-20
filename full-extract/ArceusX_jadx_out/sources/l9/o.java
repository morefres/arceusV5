package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import k9.a;
import k9.a.b;
import l9.k;

/* loaded from: classes.dex */
public abstract class o<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    public final k f23351a;
    public final Feature[] b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23352c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23353d;

    public o(@NonNull k<L> kVar, Feature[] featureArr, boolean z10, int i10) {
        this.f23351a = kVar;
        this.b = featureArr;
        this.f23352c = z10;
        this.f23353d = i10;
    }

    public void a() {
        this.f23351a.a();
    }

    public k.a<L> b() {
        return this.f23351a.b();
    }

    public Feature[] c() {
        return this.b;
    }

    public abstract void d(@NonNull A a10, @NonNull sb.k<Void> kVar);

    public final int e() {
        return this.f23353d;
    }

    public final boolean f() {
        return this.f23352c;
    }
}
