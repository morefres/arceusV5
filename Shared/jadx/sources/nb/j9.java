package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class j9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26329a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26330c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa f26332e;

    public j9(qa qaVar, String str, String str2, Object obj, long j10) {
        this.f26329a = str;
        this.b = str2;
        this.f26330c = obj;
        this.f26331d = j10;
        Objects.requireNonNull(qaVar);
        this.f26332e = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26332e.B(this.f26329a, this.b, this.f26330c, this.f26331d);
    }
}
