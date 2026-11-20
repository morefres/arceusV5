package nb;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26303a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f26305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f26306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f26307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f26308g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f26309h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qa f26310i;

    public i9(qa qaVar, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f26303a = str;
        this.b = str2;
        this.f26304c = j10;
        this.f26305d = bundle;
        this.f26306e = z10;
        this.f26307f = z11;
        this.f26308g = z12;
        this.f26309h = str3;
        Objects.requireNonNull(qaVar);
        this.f26310i = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26310i.v(this.f26303a, this.b, this.f26304c, this.f26305d, this.f26306e, this.f26307f, this.f26308g, this.f26309h);
    }
}
