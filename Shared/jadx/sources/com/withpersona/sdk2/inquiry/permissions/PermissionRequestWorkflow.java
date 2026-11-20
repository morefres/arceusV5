package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.d;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import gt.l;
import gt.o;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import pp.OldCheckRequestPermissionRationaleStateView;
import pp.g0;
import pp.i0;
import pp.j1;
import pp.n1;
import pp.v;
import wm.Snapshot;
import wm.a;
import wm.h;
import wm.k;
import wm.r;
import wm.w;
import wm.z;
import ym.q;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003/01B)\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u00020\u0010*\u00180\u0013R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00032$\u0010!\u001a 0 R\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "permissionRequestDialogWorkerFactory", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "deviceFeatureRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "", "I", "()V", "Lwm/r$c;", "Lwm/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "output", "G", "(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "props", "Lwm/i;", "snapshot", "H", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/i;)Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "renderProps", "renderState", "Lwm/k$a;", "context", "J", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;Lwm/k$a;)Ljava/lang/Object;", "state", "h0", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;)Lwm/i;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "c", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Props", "Output", "PermissionRequestState", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionRequestWorkflow extends k<Props, PermissionRequestState, Output, Object> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d.a permissionRequestDialogWorkerFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissionState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Output implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Output> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PermissionState permissionState;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Output> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Output createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Output(PermissionState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Output[] newArray(int i10) {
                return new Output[i10];
            }
        }

        public Output(@NotNull PermissionState permissionState) {
            Intrinsics.checkNotNullParameter(permissionState, "permissionState");
            this.permissionState = permissionState;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final PermissionState getPermissionState() {
            return this.permissionState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Output) && Intrinsics.c(this.permissionState, ((Output) other).permissionState);
        }

        public int hashCode() {
            return this.permissionState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Output(permissionState=" + this.permissionState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.permissionState.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Landroid/os/Parcelable;", "CheckPermissionState", "CheckPermissionRationaleState", "ShowRequestPermissionRationale", "RequestPermission", "RequestDeviceFeature", "CheckPermissionPermanentlyDenied", "ShowPermissionPermanentlyDeniedMessage", "Complete", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PermissionRequestState extends Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckPermissionPermanentlyDenied implements PermissionRequestState {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckPermissionPermanentlyDenied f12318a = new CheckPermissionPermanentlyDenied();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionPermanentlyDenied> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionPermanentlyDenied> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionPermanentlyDenied createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionPermanentlyDenied.f12318a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionPermanentlyDenied[] newArray(int i10) {
                    return new CheckPermissionPermanentlyDenied[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CheckPermissionPermanentlyDenied);
            }

            public int hashCode() {
                return -367421189;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionPermanentlyDenied";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckPermissionRationaleState implements PermissionRequestState {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckPermissionRationaleState f12319a = new CheckPermissionRationaleState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionRationaleState> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionRationaleState> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionRationaleState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionRationaleState.f12319a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionRationaleState[] newArray(int i10) {
                    return new CheckPermissionRationaleState[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CheckPermissionRationaleState);
            }

            public int hashCode() {
                return -1860465355;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionRationaleState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckPermissionState implements PermissionRequestState {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckPermissionState f12320a = new CheckPermissionState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionState> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionState> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionState.f12320a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionState[] newArray(int i10) {
                    return new CheckPermissionState[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CheckPermissionState);
            }

            public int hashCode() {
                return -885686570;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Complete implements PermissionRequestState {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final Complete f12321a = new Complete();

            @NotNull
            public static final Parcelable.Creator<Complete> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Complete> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Complete.f12321a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Complete[] newArray(int i10) {
                    return new Complete[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Complete);
            }

            public int hashCode() {
                return 1563807797;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequestDeviceFeature implements PermissionRequestState {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final RequestDeviceFeature f12322a = new RequestDeviceFeature();

            @NotNull
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RequestDeviceFeature> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.f12322a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature[] newArray(int i10) {
                    return new RequestDeviceFeature[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof RequestDeviceFeature);
            }

            public int hashCode() {
                return -1821218195;
            }

            @NotNull
            public String toString() {
                return "RequestDeviceFeature";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequestPermission implements PermissionRequestState {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final RequestPermission f12323a = new RequestPermission();

            @NotNull
            public static final Parcelable.Creator<RequestPermission> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RequestPermission> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestPermission createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestPermission.f12323a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final RequestPermission[] newArray(int i10) {
                    return new RequestPermission[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof RequestPermission);
            }

            public int hashCode() {
                return -2052298174;
            }

            @NotNull
            public String toString() {
                return "RequestPermission";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowPermissionPermanentlyDeniedMessage implements PermissionRequestState {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final ShowPermissionPermanentlyDeniedMessage f12324a = new ShowPermissionPermanentlyDeniedMessage();

            @NotNull
            public static final Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowPermissionPermanentlyDeniedMessage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowPermissionPermanentlyDeniedMessage.f12324a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ShowPermissionPermanentlyDeniedMessage[] newArray(int i10) {
                    return new ShowPermissionPermanentlyDeniedMessage[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ShowPermissionPermanentlyDeniedMessage);
            }

            public int hashCode() {
                return -1723010119;
            }

            @NotNull
            public String toString() {
                return "ShowPermissionPermanentlyDeniedMessage";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowRequestPermissionRationale implements PermissionRequestState {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final ShowRequestPermissionRationale f12325a = new ShowRequestPermissionRationale();

            @NotNull
            public static final Parcelable.Creator<ShowRequestPermissionRationale> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowRequestPermissionRationale> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowRequestPermissionRationale createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowRequestPermissionRationale.f12325a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ShowRequestPermissionRationale[] newArray(int i10) {
                    return new ShowRequestPermissionRationale[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ShowRequestPermissionRationale);
            }

            public int hashCode() {
                return 120525746;
            }

            @NotNull
            public String toString() {
                return "ShowRequestPermissionRationale";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12336a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.f28964a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.f28965c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12336a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1", f = "PermissionRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12337t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Props f12339v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<Props, PermissionRequestState, Output, Object>.a f12340w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Props props, k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f12339v = props;
            this.f12340w = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(r.c cVar) {
            cVar.e(PermissionRequestState.RequestDeviceFeature.f12322a);
            return Unit.f22894a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(r.c cVar) {
            cVar.e(PermissionRequestState.CheckPermissionRationaleState.f12319a);
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return PermissionRequestWorkflow.this.new b(this.f12339v, this.f12340w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Props, PermissionRequestState, ? extends Output> d10;
            r<? super Props, PermissionRequestState, ? extends Output> d11;
            nt.c.e();
            if (this.f12337t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (g.b(PermissionRequestWorkflow.this.applicationContext, this.f12339v.getPermission())) {
                h<r<? super Props, PermissionRequestState, ? extends Output>> d12 = this.f12340w.d();
                d11 = z.d(PermissionRequestWorkflow.this, null, new Function1() { // from class: pp.g1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit r8;
                        r8 = PermissionRequestWorkflow.b.r((r.c) obj2);
                        return r8;
                    }
                }, 1, null);
                d12.a(d11);
            } else {
                h<r<? super Props, PermissionRequestState, ? extends Output>> d13 = this.f12340w.d();
                d10 = z.d(PermissionRequestWorkflow.this, null, new Function1() { // from class: pp.h1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit s8;
                        s8 = PermissionRequestWorkflow.b.s((r.c) obj2);
                        return s8;
                    }
                }, 1, null);
                d13.a(d10);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$7", f = "PermissionRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12341t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<Props, PermissionRequestState, Output, Object>.a f12342u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PermissionRequestWorkflow f12343v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Props f12344w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, Props props, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f12342u = aVar;
            this.f12343v = permissionRequestWorkflow;
            this.f12344w = props;
        }

        public static final Unit q(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c cVar) {
            permissionRequestWorkflow.G(cVar, new PermissionState(props.getPermission(), j1.f28919a));
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f12342u, this.f12343v, this.f12344w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Props, PermissionRequestState, ? extends Output> d10;
            nt.c.e();
            if (this.f12341t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            h<r<? super Props, PermissionRequestState, ? extends Output>> d11 = this.f12342u.d();
            final PermissionRequestWorkflow permissionRequestWorkflow = this.f12343v;
            final Props props = this.f12344w;
            d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.i1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = PermissionRequestWorkflow.c.q(PermissionRequestWorkflow.this, props, (r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public PermissionRequestWorkflow(@NotNull Context applicationContext, @NotNull d.a permissionRequestDialogWorkerFactory, @NotNull DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestDialogWorkerFactory, "permissionRequestDialogWorkerFactory");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkflow, "deviceFeatureRequestWorkflow");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.permissionRequestDialogWorkerFactory = permissionRequestDialogWorkerFactory;
        this.deviceFeatureRequestWorkflow = deviceFeatureRequestWorkflow;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final Unit K(k.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, final boolean z10) {
        r d10;
        h d11 = aVar.d();
        d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit L;
                L = PermissionRequestWorkflow.L(z10, (r.c) obj);
                return L;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit L(boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            action.e(PermissionRequestState.ShowRequestPermissionRationale.f12325a);
        } else {
            action.e(PermissionRequestState.RequestPermission.f12323a);
        }
        return Unit.f22894a;
    }

    public static final r M(final PermissionRequestWorkflow permissionRequestWorkflow, final k.a aVar, final Props props, d.b it) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, d.b.C0235b.f12369a)) {
            d11 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Q;
                    Q = PermissionRequestWorkflow.Q(k.a.this, permissionRequestWorkflow, (r.c) obj);
                    return Q;
                }
            }, 1, null);
            return d11;
        }
        if (!Intrinsics.c(it, d.b.a.f12368a)) {
            throw new l();
        }
        d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit N;
                N = PermissionRequestWorkflow.N(k.a.this, permissionRequestWorkflow, props, (r.c) obj);
                return N;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit N(k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, r.c action) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((Props) action.b()).getOptional()) {
            h d12 = aVar.d();
            d11 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit O;
                    O = PermissionRequestWorkflow.O(PermissionRequestWorkflow.this, props, (r.c) obj);
                    return O;
                }
            }, 1, null);
            d12.a(d11);
        } else {
            h d13 = aVar.d();
            d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.t0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit P;
                    P = PermissionRequestWorkflow.P((r.c) obj);
                    return P;
                }
            }, 1, null);
            d13.a(d10);
        }
        return Unit.f22894a;
    }

    public static final Unit O(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.b));
        return Unit.f22894a;
    }

    public static final Unit P(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(PermissionRequestState.CheckPermissionPermanentlyDenied.f12318a);
        return Unit.f22894a;
    }

    public static final Unit Q(k.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, r.c action) {
        r d10;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        h d11 = aVar.d();
        d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit R;
                R = PermissionRequestWorkflow.R((r.c) obj);
                return R;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit R(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(PermissionRequestState.RequestDeviceFeature.f12322a);
        return Unit.f22894a;
    }

    public static final r S(final PermissionRequestWorkflow permissionRequestWorkflow, final k.a aVar, final Props props, final DeviceFeatureRequestWorkflow.Output it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit T;
                T = PermissionRequestWorkflow.T(DeviceFeatureRequestWorkflow.Output.this, aVar, permissionRequestWorkflow, props, (r.c) obj);
                return T;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit T(DeviceFeatureRequestWorkflow.Output output, k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, r.c action) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = a.f12336a[output.getDeviceFeatureState().getResult().ordinal()];
        if (i10 == 1) {
            h d12 = aVar.d();
            d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit U;
                    U = PermissionRequestWorkflow.U(PermissionRequestWorkflow.this, props, (r.c) obj);
                    return U;
                }
            }, 1, null);
            d12.a(d10);
        } else if (i10 == 2) {
            permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.b));
        } else {
            if (i10 != 3) {
                throw new l();
            }
            h d13 = aVar.d();
            d11 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit V;
                    V = PermissionRequestWorkflow.V(PermissionRequestWorkflow.this, props, (r.c) obj);
                    return V;
                }
            }, 1, null);
            d13.a(d11);
        }
        return Unit.f22894a;
    }

    public static final Unit U(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.f28919a));
        return Unit.f22894a;
    }

    public static final Unit V(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.f28920c));
        return Unit.f22894a;
    }

    public static final Unit W(final k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, final boolean z10) {
        r d10;
        h d11 = aVar.d();
        d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit X;
                X = PermissionRequestWorkflow.X(z10, permissionRequestWorkflow, props, aVar, (r.c) obj);
                return X;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit X(boolean z10, PermissionRequestWorkflow permissionRequestWorkflow, Props props, k.a aVar, r.c action) {
        r d10;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.b));
        } else {
            h d11 = aVar.d();
            d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Y;
                    Y = PermissionRequestWorkflow.Y((r.c) obj);
                    return Y;
                }
            }, 1, null);
            d11.a(d10);
        }
        return Unit.f22894a;
    }

    public static final Unit Y(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.f12324a);
        return Unit.f22894a;
    }

    public static final Unit Z(final PermissionRequestWorkflow permissionRequestWorkflow, k.a aVar, final Props props) {
        r d10;
        permissionRequestWorkflow.I();
        h d11 = aVar.d();
        d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit a02;
                a02 = PermissionRequestWorkflow.a0(PermissionRequestWorkflow.this, props, (r.c) obj);
                return a02;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit a0(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.f28920c));
        return Unit.f22894a;
    }

    public static final Unit b0(k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props) {
        r d10;
        h d11 = aVar.d();
        d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit c02;
                c02 = PermissionRequestWorkflow.c0(PermissionRequestWorkflow.this, props, (r.c) obj);
                return c02;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit c0(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.b));
        return Unit.f22894a;
    }

    public static final Unit d0(k.a aVar, PermissionRequestWorkflow permissionRequestWorkflow) {
        r d10;
        h d11 = aVar.d();
        d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit e02;
                e02 = PermissionRequestWorkflow.e0((r.c) obj);
                return e02;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit e0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(PermissionRequestState.RequestPermission.f12323a);
        return Unit.f22894a;
    }

    public static final Unit f0(k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props) {
        r d10;
        h d11 = aVar.d();
        d10 = z.d(permissionRequestWorkflow, null, new Function1() { // from class: pp.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit g02;
                g02 = PermissionRequestWorkflow.g0(PermissionRequestWorkflow.this, props, (r.c) obj);
                return g02;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit g0(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.b));
        return Unit.f22894a;
    }

    public final void G(r<? super Props, PermissionRequestState, Output>.c cVar, PermissionState permissionState) {
        TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(n1.c(permissionState.getPermission()), n1.b(permissionState.getResult()), null, 4, null), false, 2, null);
        cVar.d(new Output(permissionState));
    }

    @Override // wm.k
    @NotNull
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public PermissionRequestState d(@NotNull Props props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            wu.h b10 = snapshot.b();
            Parcelable parcelable = null;
            if (b10.I() <= 0) {
                b10 = null;
            }
            if (b10 != null) {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
                byte[] O = b10.O();
                obtain.unmarshall(O, 0, O.length);
                obtain.setDataPosition(0);
                parcelable = obtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                obtain.recycle();
            }
            PermissionRequestState permissionRequestState = (PermissionRequestState) parcelable;
            if (permissionRequestState != null) {
                return permissionRequestState;
            }
        }
        return PermissionRequestState.CheckPermissionState.f12320a;
    }

    public final void I() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.applicationContext.getPackageName(), null));
        this.applicationContext.startActivity(intent);
    }

    @Override // wm.k
    @Nullable
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull final Props renderProps, @NotNull PermissionRequestState renderState, @NotNull final k<? super Props, PermissionRequestState, Output, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.c(renderState, PermissionRequestState.CheckPermissionState.f12320a)) {
            context.b("check_permission_state", new b(renderProps, context, null));
            return null;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.CheckPermissionRationaleState.f12319a)) {
            return new uq.m(new OldCheckRequestPermissionRationaleStateView(renderProps.getPermission(), false, new Function1() { // from class: pp.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit K;
                    K = PermissionRequestWorkflow.K(k.a.this, this, ((Boolean) obj).booleanValue());
                    return K;
                }
            }), uq.l.f33107c);
        }
        if (Intrinsics.c(renderState, PermissionRequestState.ShowRequestPermissionRationale.f12325a)) {
            TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(n1.c(renderProps.getPermission()), "permission_sheet_presented", null, 4, null), false, 2, null);
            String title = renderProps.getTitle();
            String rationale = renderProps.getRationale();
            String positiveButtonText = renderProps.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = this.applicationContext.getString(tp.g.D);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
            }
            String str = positiveButtonText;
            StepStyle styles = renderProps.getStyles();
            Function0 function0 = new Function0() { // from class: pp.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit d02;
                    d02 = PermissionRequestWorkflow.d0(k.a.this, this);
                    return d02;
                }
            };
            String negativeButtonText = renderProps.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = this.applicationContext.getString(tp.g.C);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
            }
            return new uq.m(new g0(title, rationale, str, styles, function0, negativeButtonText, new Function0() { // from class: pp.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit f02;
                    f02 = PermissionRequestWorkflow.f0(k.a.this, this, renderProps);
                    return f02;
                }
            }), uq.l.f33107c);
        }
        if (Intrinsics.c(renderState, PermissionRequestState.RequestPermission.f12323a)) {
            w.l(context, this.permissionRequestDialogWorkerFactory.a(renderProps.getPermission()), d0.k(d.class), "", new Function1() { // from class: pp.z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r M;
                    M = PermissionRequestWorkflow.M(PermissionRequestWorkflow.this, context, renderProps, (d.b) obj);
                    return M;
                }
            });
            return null;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.RequestDeviceFeature.f12322a)) {
            if (renderProps.q()) {
                return a.C0639a.a(context, this.deviceFeatureRequestWorkflow, new DeviceFeatureRequestWorkflow.Props(n1.a(renderProps.getPermission()), renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getPositiveButtonText(), renderProps.getGpsFeatureModalNegativeButton(), renderProps.getStyles()), null, new Function1() { // from class: pp.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        wm.r S;
                        S = PermissionRequestWorkflow.S(PermissionRequestWorkflow.this, context, renderProps, (DeviceFeatureRequestWorkflow.Output) obj);
                        return S;
                    }
                }, 4, null);
            }
            context.b("request_device_feature", new c(context, this, renderProps, null));
            return null;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.CheckPermissionPermanentlyDenied.f12318a)) {
            return new uq.m(new OldCheckRequestPermissionRationaleStateView(renderProps.getPermission(), true, new Function1() { // from class: pp.b1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit W;
                    W = PermissionRequestWorkflow.W(k.a.this, this, renderProps, ((Boolean) obj).booleanValue());
                    return W;
                }
            }), uq.l.f33107c);
        }
        if (!Intrinsics.c(renderState, PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.f12324a)) {
            if (Intrinsics.c(renderState, PermissionRequestState.Complete.f12321a)) {
                return null;
            }
            throw new l();
        }
        String title2 = renderProps.getTitle();
        String rationaleWhenPermanentlyDenied = renderProps.getRationaleWhenPermanentlyDenied();
        String positiveButtonText2 = renderProps.getPositiveButtonText();
        if (positiveButtonText2 == null) {
            positiveButtonText2 = this.applicationContext.getString(tp.g.E);
            Intrinsics.checkNotNullExpressionValue(positiveButtonText2, "getString(...)");
        }
        String str2 = positiveButtonText2;
        StepStyle styles2 = renderProps.getStyles();
        Function0 function02 = new Function0() { // from class: pp.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Z;
                Z = PermissionRequestWorkflow.Z(PermissionRequestWorkflow.this, context, renderProps);
                return Z;
            }
        };
        String negativeButtonText2 = renderProps.getNegativeButtonText();
        if (negativeButtonText2 == null) {
            negativeButtonText2 = this.applicationContext.getString(tp.g.C);
            Intrinsics.checkNotNullExpressionValue(negativeButtonText2, "getString(...)");
        }
        return new uq.m(new g0(title2, rationaleWhenPermanentlyDenied, str2, styles2, function02, negativeButtonText2, new Function0() { // from class: pp.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit b02;
                b02 = PermissionRequestWorkflow.b0(k.a.this, this, renderProps);
                return b02;
            }
        }), uq.l.f33107c);
    }

    @Override // wm.k
    @NotNull
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull PermissionRequestState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return q.a(state);
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b4\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b#\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b8\u00109R\u0011\u0010;\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b:\u0010*¨\u0006<"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "Landroid/os/Parcelable;", "Lpp/i0;", "permission", "", "optional", "", Title.type, "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Lpp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lpp/i0;", "k", "()Lpp/i0;", j6.b.f21518e, "Z", "j", "()Z", "c", "Ljava/lang/String;", "getTitle", rl.d.f30696a, "n", "e", "o", "f", "m", "g", "i", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "p", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "q", "isPermissionLocation", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Props implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Props> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final i0 permission;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean optional;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String title;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String rationale;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String rationaleWhenPermanentlyDenied;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String positiveButtonText;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String negativeButtonText;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureTitle;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureRationale;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureModalNegativeButton;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyle styles;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Props> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Props createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Props(i0.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyle) parcel.readParcelable(Props.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Props[] newArray(int i10) {
                return new Props[i10];
            }
        }

        public Props(@NotNull i0 permission, boolean z10, @NotNull String title, @NotNull String rationale, @NotNull String rationaleWhenPermanentlyDenied, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable StepStyle stepStyle) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rationale, "rationale");
            Intrinsics.checkNotNullParameter(rationaleWhenPermanentlyDenied, "rationaleWhenPermanentlyDenied");
            this.permission = permission;
            this.optional = z10;
            this.title = title;
            this.rationale = rationale;
            this.rationaleWhenPermanentlyDenied = rationaleWhenPermanentlyDenied;
            this.positiveButtonText = str;
            this.negativeButtonText = str2;
            this.gpsFeatureTitle = str3;
            this.gpsFeatureRationale = str4;
            this.gpsFeatureModalNegativeButton = str5;
            this.styles = stepStyle;
        }

        @Nullable
        /* renamed from: a, reason: from getter */
        public final String getGpsFeatureModalNegativeButton() {
            return this.gpsFeatureModalNegativeButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Props)) {
                return false;
            }
            Props props = (Props) other;
            return this.permission == props.permission && this.optional == props.optional && Intrinsics.c(this.title, props.title) && Intrinsics.c(this.rationale, props.rationale) && Intrinsics.c(this.rationaleWhenPermanentlyDenied, props.rationaleWhenPermanentlyDenied) && Intrinsics.c(this.positiveButtonText, props.positiveButtonText) && Intrinsics.c(this.negativeButtonText, props.negativeButtonText) && Intrinsics.c(this.gpsFeatureTitle, props.gpsFeatureTitle) && Intrinsics.c(this.gpsFeatureRationale, props.gpsFeatureRationale) && Intrinsics.c(this.gpsFeatureModalNegativeButton, props.gpsFeatureModalNegativeButton) && Intrinsics.c(this.styles, props.styles);
        }

        @Nullable
        /* renamed from: f, reason: from getter */
        public final String getGpsFeatureRationale() {
            return this.gpsFeatureRationale;
        }

        @Nullable
        /* renamed from: g, reason: from getter */
        public final String getGpsFeatureTitle() {
            return this.gpsFeatureTitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = ((((((((this.permission.hashCode() * 31) + Boolean.hashCode(this.optional)) * 31) + this.title.hashCode()) * 31) + this.rationale.hashCode()) * 31) + this.rationaleWhenPermanentlyDenied.hashCode()) * 31;
            String str = this.positiveButtonText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.negativeButtonText;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsFeatureTitle;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsFeatureRationale;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureModalNegativeButton;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            return hashCode6 + (stepStyle != null ? stepStyle.hashCode() : 0);
        }

        @Nullable
        /* renamed from: i, reason: from getter */
        public final String getNegativeButtonText() {
            return this.negativeButtonText;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getOptional() {
            return this.optional;
        }

        @NotNull
        /* renamed from: k, reason: from getter */
        public final i0 getPermission() {
            return this.permission;
        }

        @Nullable
        /* renamed from: m, reason: from getter */
        public final String getPositiveButtonText() {
            return this.positiveButtonText;
        }

        @NotNull
        /* renamed from: n, reason: from getter */
        public final String getRationale() {
            return this.rationale;
        }

        @NotNull
        /* renamed from: o, reason: from getter */
        public final String getRationaleWhenPermanentlyDenied() {
            return this.rationaleWhenPermanentlyDenied;
        }

        @Nullable
        /* renamed from: p, reason: from getter */
        public final StepStyle getStyles() {
            return this.styles;
        }

        public final boolean q() {
            i0 i0Var = this.permission;
            return i0Var == i0.f28912c || i0Var == i0.f28913d;
        }

        @NotNull
        public String toString() {
            return "Props(permission=" + this.permission + ", optional=" + this.optional + ", title=" + this.title + ", rationale=" + this.rationale + ", rationaleWhenPermanentlyDenied=" + this.rationaleWhenPermanentlyDenied + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ", gpsFeatureTitle=" + this.gpsFeatureTitle + ", gpsFeatureRationale=" + this.gpsFeatureRationale + ", gpsFeatureModalNegativeButton=" + this.gpsFeatureModalNegativeButton + ", styles=" + this.styles + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.permission.name());
            dest.writeInt(this.optional ? 1 : 0);
            dest.writeString(this.title);
            dest.writeString(this.rationale);
            dest.writeString(this.rationaleWhenPermanentlyDenied);
            dest.writeString(this.positiveButtonText);
            dest.writeString(this.negativeButtonText);
            dest.writeString(this.gpsFeatureTitle);
            dest.writeString(this.gpsFeatureRationale);
            dest.writeString(this.gpsFeatureModalNegativeButton);
            dest.writeParcelable(this.styles, flags);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Props(pp.i0 r15, boolean r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 2
                if (r1 == 0) goto L9
                r1 = 0
                r4 = r1
                goto Lb
            L9:
                r4 = r16
            Lb:
                r1 = r0 & 128(0x80, float:1.8E-43)
                r2 = 0
                if (r1 == 0) goto L12
                r10 = r2
                goto L14
            L12:
                r10 = r22
            L14:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L1a
                r11 = r2
                goto L1c
            L1a:
                r11 = r23
            L1c:
                r0 = r0 & 512(0x200, float:7.17E-43)
                if (r0 == 0) goto L30
                r12 = r2
                r3 = r15
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r13 = r25
                r2 = r14
                goto L40
            L30:
                r12 = r24
                r2 = r14
                r3 = r15
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r13 = r25
            L40:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow.Props.<init>(pp.i0, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
