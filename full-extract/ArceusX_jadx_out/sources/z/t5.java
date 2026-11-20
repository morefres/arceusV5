package z;

import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import n0.j4;

/* loaded from: classes.dex */
public class t5 {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37445a;

        static {
            int[] iArr = new int[j4.b.values().length];
            f37445a = iArr;
            try {
                iArr[j4.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37445a[j4.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37445a[j4.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37445a[j4.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37445a[j4.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(j4.b bVar, int i10) {
        int i11 = a.f37445a[bVar.ordinal()];
        return i11 != 1 ? (i11 == 2 && c0.e.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i10 == 2 ? 5 : 2;
    }

    public static int b(j4.b bVar, int i10) {
        int i11 = a.f37445a[bVar.ordinal()];
        return i11 != 1 ? (i11 == 2 && c0.e.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i10 == 2 ? 5 : 1;
    }
}
