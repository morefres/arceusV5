package k0;

import android.util.Range;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0014\u001a\u00020\u000f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lk0/c;", "Li0/b;", "", "minFps", "maxFps", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "g", "I", "()I", "h", "f", "Lk0/b;", "i", "Lk0/b;", "c", "()Lk0/b;", "featureTypeInternal", "j", ve.a.f33391e, "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: k0.c, reason: from toString */
/* loaded from: classes.dex */
public final class FpsRangeFeature extends i0.b {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Range<Integer> f22182k = new Range<>(30, 30);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final int minFps;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final int maxFps;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b featureTypeInternal = b.b;

    public FpsRangeFeature(int i10, int i11) {
        this.minFps = i10;
        this.maxFps = i11;
    }

    @Override // i0.b
    @NotNull
    /* renamed from: c, reason: from getter */
    public b getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    /* renamed from: f, reason: from getter */
    public final int getMaxFps() {
        return this.maxFps;
    }

    /* renamed from: g, reason: from getter */
    public final int getMinFps() {
        return this.minFps;
    }

    @NotNull
    public String toString() {
        return "FpsRangeFeature(minFps=" + this.minFps + ", maxFps=" + this.maxFps + ')';
    }
}
