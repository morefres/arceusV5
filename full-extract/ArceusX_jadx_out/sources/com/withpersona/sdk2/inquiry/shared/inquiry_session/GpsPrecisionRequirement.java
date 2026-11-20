package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.os.Parcel;
import android.os.Parcelable;
import j6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, b.f21518e, "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GpsPrecisionRequirement implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GpsPrecisionRequirement> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final GpsPrecisionRequirement f13254a = new GpsPrecisionRequirement("ROUGH", 0);
    public static final GpsPrecisionRequirement b = new GpsPrecisionRequirement("PRECISE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ GpsPrecisionRequirement[] f13255c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pt.a f13256d;

    static {
        GpsPrecisionRequirement[] a10 = a();
        f13255c = a10;
        f13256d = pt.b.a(a10);
        CREATOR = new Parcelable.Creator<GpsPrecisionRequirement>() { // from class: com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement.a
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GpsPrecisionRequirement createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return GpsPrecisionRequirement.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GpsPrecisionRequirement[] newArray(int i10) {
                return new GpsPrecisionRequirement[i10];
            }
        };
    }

    public GpsPrecisionRequirement(String str, int i10) {
    }

    public static final /* synthetic */ GpsPrecisionRequirement[] a() {
        return new GpsPrecisionRequirement[]{f13254a, b};
    }

    public static GpsPrecisionRequirement valueOf(String str) {
        return (GpsPrecisionRequirement) Enum.valueOf(GpsPrecisionRequirement.class, str);
    }

    public static GpsPrecisionRequirement[] values() {
        return (GpsPrecisionRequirement[]) f13255c.clone();
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
