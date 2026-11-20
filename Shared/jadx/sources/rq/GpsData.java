package rq;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lrq/a;", "", "Landroid/location/Location;", "location", "Lrq/b;", "precision", "<init>", "(Landroid/location/Location;Lrq/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Landroid/location/Location;", "()Landroid/location/Location;", j6.b.f21518e, "Lrq/b;", "()Lrq/b;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: rq.a, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class GpsData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Location location;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final b precision;

    public GpsData(@NotNull Location location, @NotNull b precision) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.location = location;
        this.precision = precision;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final b getPrecision() {
        return this.precision;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsData)) {
            return false;
        }
        GpsData gpsData = (GpsData) other;
        return Intrinsics.c(this.location, gpsData.location) && this.precision == gpsData.precision;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + this.precision.hashCode();
    }

    @NotNull
    public String toString() {
        return "GpsData(location=" + this.location + ", precision=" + this.precision + ")";
    }
}
