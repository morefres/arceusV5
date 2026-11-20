package com.withpersona.sdk2.inquiry.governmentid;

import android.graphics.Bitmap;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/graphics/Bitmap;", "Loq/c;", "sdkFilesManager", "Ljava/io/File;", ve.a.f33391e, "(Landroid/graphics/Bitmap;Loq/c;)Ljava/io/File;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10975a;

        static {
            int[] iArr = new int[GovernmentId.a.values().length];
            try {
                iArr[GovernmentId.a.f10502a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GovernmentId.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GovernmentId.a.f10503c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10975a = iArr;
        }
    }

    @NotNull
    public static final File a(@NotNull Bitmap bitmap, @NotNull oq.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        File e10 = sdkFilesManager.e("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(e10);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            tt.c.a(fileOutputStream, null);
            return e10;
        } finally {
        }
    }

    @NotNull
    public static final GovIdCaptureMethod b(@NotNull GovernmentId.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i10 = a.f10975a[aVar.ordinal()];
        if (i10 == 1) {
            return GovIdCaptureMethod.AUTO;
        }
        if (i10 == 2) {
            return GovIdCaptureMethod.MANUAL;
        }
        if (i10 == 3) {
            return GovIdCaptureMethod.VIDEO_UPLOAD;
        }
        throw new gt.l();
    }
}
