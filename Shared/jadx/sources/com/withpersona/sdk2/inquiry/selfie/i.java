package com.withpersona.sdk2.inquiry.selfie;

import android.graphics.Bitmap;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import dn.p0;
import gt.n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0001*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ldn/p0;", "Lin/a;", rl.d.f30696a, "(Ldn/p0;)Lin/a;", "", ve.a.f33391e, "(Lin/a;)Ljava/lang/String;", "Loq/c;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "poseInfo", "Lgt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", j6.b.f21518e, "(Ldn/p0;Loq/c;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;)Lin/a;", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13021a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[in.a.values().length];
            try {
                iArr[in.a.f20965a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[in.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[in.a.f20966c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[in.a.f20967d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[in.a.f20968e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13021a = iArr;
            int[] iArr2 = new int[NextStep.Selfie.SelfiePose.values().length];
            try {
                iArr2[NextStep.Selfie.SelfiePose.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.DOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final String a(@NotNull in.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i10 = a.f13021a[aVar.ordinal()];
        if (i10 == 1) {
            return "center";
        }
        if (i10 == 2) {
            return "left";
        }
        if (i10 == 3) {
            return "right";
        }
        if (i10 == 4) {
            return "up";
        }
        if (i10 == 5) {
            return "down";
        }
        throw new gt.l();
    }

    @NotNull
    public static final Object b(@NotNull p0 p0Var, @NotNull oq.c sdkFilesManager, @NotNull PoseInfo poseInfo) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(poseInfo, "poseInfo");
        Bitmap bitmap = p0Var.getBitmap();
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                File e10 = sdkFilesManager.e("jpg");
                FileOutputStream fileOutputStream = new FileOutputStream(e10);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                    tt.c.a(fileOutputStream, null);
                    n.Companion companion = gt.n.INSTANCE;
                    String absolutePath = e10.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    Object b = gt.n.b(new Selfie.SelfieImage(absolutePath, Selfie.a.b, d(p0Var), currentTimeMillis, poseInfo.getToken()));
                    bitmap.recycle();
                    return b;
                } finally {
                }
            } catch (IOException e11) {
                n.Companion companion2 = gt.n.INSTANCE;
                Object b10 = gt.n.b(gt.o.a(e11));
                bitmap.recycle();
                return b10;
            }
        } catch (Throwable th2) {
            bitmap.recycle();
            throw th2;
        }
    }

    @NotNull
    public static final in.a c(@NotNull NextStep.Selfie.SelfiePose selfiePose) {
        Intrinsics.checkNotNullParameter(selfiePose, "<this>");
        int i10 = a.b[selfiePose.ordinal()];
        if (i10 == 1) {
            return in.a.f20965a;
        }
        if (i10 == 2) {
            return in.a.b;
        }
        if (i10 == 3) {
            return in.a.f20966c;
        }
        if (i10 == 4) {
            return in.a.f20967d;
        }
        if (i10 == 5) {
            return in.a.f20968e;
        }
        throw new gt.l();
    }

    @NotNull
    public static final in.a d(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        if (p0Var instanceof p0.a) {
            return in.a.f20965a;
        }
        if (p0Var instanceof p0.c) {
            return in.a.b;
        }
        if (p0Var instanceof p0.d) {
            return in.a.f20966c;
        }
        if (p0Var instanceof p0.e) {
            return in.a.f20967d;
        }
        if (p0Var instanceof p0.b) {
            return in.a.f20968e;
        }
        throw new gt.l();
    }
}
