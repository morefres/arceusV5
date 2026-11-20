package b5;

import g5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb5/k;", "Lg5/d$c;", "delegate", "Lb5/b;", "autoCloser", "<init>", "(Lg5/d$c;Lb5/b;)V", "Lg5/d$b;", "configuration", "Lb5/g;", j6.b.f21518e, "(Lg5/d$b;)Lb5/g;", ve.a.f33391e, "Lg5/d$c;", "Lb5/b;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k implements d.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d.c delegate;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b autoCloser;

    public k(@NotNull d.c delegate, @NotNull b autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
    }

    @Override // g5.d.c
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g a(@NotNull d.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new g(this.delegate.a(configuration), this.autoCloser);
    }
}
