package com.squareup.workflow1.ui;

import android.os.Parcel;
import android.os.Parcelable;
import j6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ve.a;
import wm.m;
import wu.h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "Landroid/os/Parcelable;", "Lwm/m;", "snapshot", "<init>", "(Lwm/m;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", a.f33391e, "Lwm/m;", "()Lwm/m;", "CREATOR", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickledTreesnapshot implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m snapshot;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/PickledTreesnapshot$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", a.f33391e, "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "", "size", "", b.f21518e, "(I)[Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.squareup.workflow1.ui.PickledTreesnapshot$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<PickledTreesnapshot> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PickledTreesnapshot createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            h.Companion companion = h.INSTANCE;
            byte[] createByteArray = parcel.createByteArray();
            Intrinsics.checkNotNull(createByteArray);
            Intrinsics.checkNotNullExpressionValue(createByteArray, "parcel.createByteArray()!!");
            return new PickledTreesnapshot(m.INSTANCE.a(h.Companion.g(companion, createByteArray, 0, 0, 3, null)));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PickledTreesnapshot[] newArray(int size) {
            return new PickledTreesnapshot[size];
        }

        public Companion() {
        }
    }

    public PickledTreesnapshot(@NotNull m snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshot = snapshot;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final m getSnapshot() {
        return this.snapshot;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeByteArray(this.snapshot.c().O());
    }
}
