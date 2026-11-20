package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000eR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000eR\u0011\u0010(\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010'¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties;", "Landroid/os/Parcelable;", "", "label", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "facingMode", "Landroid/util/Size;", "size", "", "frameRate", "rotation", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties$b;Landroid/util/Size;II)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Ljava/lang/String;", "i", "()Ljava/lang/String;", j6.b.f21518e, "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "f", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "c", "Landroid/util/Size;", "k", "()Landroid/util/Size;", rl.d.f30696a, "I", "g", "e", "j", "", "()D", "aspectRatio", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraProperties implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CameraProperties> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String label;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b facingMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Size size;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int frameRate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int rotation;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CameraProperties> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CameraProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraProperties(parcel.readString(), b.valueOf(parcel.readString()), parcel.readSize(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CameraProperties[] newArray(int i10) {
            return new CameraProperties[i10];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties$b;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9961a = new b("User", 0);
        public static final b b = new b("Environment", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f9962c = new b("Unknown", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f9963d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ pt.a f9964e;

        static {
            b[] a10 = a();
            f9963d = a10;
            f9964e = pt.b.a(a10);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f9961a, b, f9962c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f9963d.clone();
        }
    }

    public CameraProperties() {
        this(null, null, null, 0, 0, 31, null);
    }

    public final double a() {
        if (this.size.getHeight() == 0) {
            return 0.0d;
        }
        return this.size.getWidth() / this.size.getHeight();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public final b getFacingMode() {
        return this.facingMode;
    }

    /* renamed from: g, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    @NotNull
    /* renamed from: i, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: j, reason: from getter */
    public final int getRotation() {
        return this.rotation;
    }

    @NotNull
    /* renamed from: k, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.label);
        dest.writeString(this.facingMode.name());
        dest.writeSize(this.size);
        dest.writeInt(this.frameRate);
        dest.writeInt(this.rotation);
    }

    public CameraProperties(@NotNull String label, @NotNull b facingMode, @NotNull Size size, int i10, int i11) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        Intrinsics.checkNotNullParameter(size, "size");
        this.label = label;
        this.facingMode = facingMode;
        this.size = size;
        this.frameRate = i10;
        this.rotation = i11;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ CameraProperties(java.lang.String r2, com.withpersona.sdk2.camera.CameraProperties.b r3, android.util.Size r4, int r5, int r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            com.withpersona.sdk2.camera.CameraProperties$b r3 = com.withpersona.sdk2.camera.CameraProperties.b.f9962c
        Lc:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L16
            android.util.Size r4 = new android.util.Size
            r4.<init>(r0, r0)
        L16:
            r8 = r7 & 8
            if (r8 == 0) goto L1b
            r5 = r0
        L1b:
            r7 = r7 & 16
            if (r7 == 0) goto L26
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2c
        L26:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2c:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.CameraProperties.<init>(java.lang.String, com.withpersona.sdk2.camera.CameraProperties$b, android.util.Size, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
