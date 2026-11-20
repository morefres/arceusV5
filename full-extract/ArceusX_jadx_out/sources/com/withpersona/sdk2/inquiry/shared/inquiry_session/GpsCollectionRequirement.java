package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.os.Parcel;
import android.os.Parcelable;
import j6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, b.f21518e, "c", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GpsCollectionRequirement implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GpsCollectionRequirement> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final GpsCollectionRequirement f13250a = new GpsCollectionRequirement("REQUIRED", 0);
    public static final GpsCollectionRequirement b = new GpsCollectionRequirement("OPTIONAL", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final GpsCollectionRequirement f13251c = new GpsCollectionRequirement("NONE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ GpsCollectionRequirement[] f13252d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f13253e;

    static {
        GpsCollectionRequirement[] a10 = a();
        f13252d = a10;
        f13253e = pt.b.a(a10);
        CREATOR = new Parcelable.Creator<GpsCollectionRequirement>() { // from class: com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement.a
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GpsCollectionRequirement createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return GpsCollectionRequirement.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GpsCollectionRequirement[] newArray(int i10) {
                return new GpsCollectionRequirement[i10];
            }
        };
    }

    public GpsCollectionRequirement(String str, int i10) {
    }

    public static final /* synthetic */ GpsCollectionRequirement[] a() {
        return new GpsCollectionRequirement[]{f13250a, b, f13251c};
    }

    public static GpsCollectionRequirement valueOf(String str) {
        return (GpsCollectionRequirement) Enum.valueOf(GpsCollectionRequirement.class, str);
    }

    public static GpsCollectionRequirement[] values() {
        return (GpsCollectionRequirement[]) f13252d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
