package fn;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Size;
import com.withpersona.sdk2.camera.CameraProperties;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroid/content/Context;", "context", "", "cameraId", rl.d.f30696a, "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "Landroid/hardware/camera2/CameraCharacteristics;", "", "preferredFps", "Landroid/util/Range;", "c", "(Landroid/hardware/camera2/CameraCharacteristics;I)Landroid/util/Range;", "", "Lfn/h0;", ve.a.f33391e, "(Landroid/content/Context;)Ljava/util/List;", "Lfn/m0;", "cameraDirection", "Lfn/k0;", j6.b.f21518e, "(Landroid/content/Context;Lfn/m0;)Lfn/k0;", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "e", "(Lfn/m0;)Lcom/withpersona/sdk2/camera/CameraProperties$b;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17341a;

        static {
            int[] iArr = new int[m0.values().length];
            try {
                iArr[m0.f17385a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m0.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m0.f17386c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17341a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            h0 h0Var = (h0) t10;
            h0 h0Var2 = (h0) t8;
            return kt.a.a(Integer.valueOf(h0Var.getSize().getWidth() * h0Var.getSize().getHeight()), Integer.valueOf(h0Var2.getSize().getWidth() * h0Var2.getSize().getHeight()));
        }
    }

    @NotNull
    public static final List<h0> a(@NotNull Context context) {
        StreamConfigurationMap streamConfigurationMap;
        String[] strArr;
        int i10;
        Range<Integer> range;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("camera");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        ArrayList arrayList = new ArrayList();
        String[] cameraIdList = cameraManager.getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
        int length = cameraIdList.length;
        int i11 = 0;
        int i12 = 0;
        while (i12 < length) {
            String str = cameraIdList[i12];
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            int intValue = num2 != null ? num2.intValue() : i11;
            CameraProperties.b bVar = (num != null && num.intValue() == 0) ? CameraProperties.b.f9961a : (num != null && num.intValue() == 1) ? CameraProperties.b.b : CameraProperties.b.f9962c;
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && kotlin.collections.m.E(iArr, i11)) {
                Range<Integer> c10 = c(cameraCharacteristics, 30);
                Class<MediaRecorder> cls = MediaRecorder.class;
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(cls);
                Intrinsics.checkNotNullExpressionValue(outputSizes, "getOutputSizes(...)");
                int length2 = outputSizes.length;
                int i13 = i11;
                while (i13 < length2) {
                    Size[] sizeArr = outputSizes;
                    Size size = sizeArr[i13];
                    int i14 = i12;
                    double outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(cls, size) / 1.0E9d;
                    Class<MediaRecorder> cls2 = cls;
                    double d10 = outputMinFrameDuration > 0.0d ? 1.0d / outputMinFrameDuration : 0.0d;
                    Intrinsics.checkNotNull(str);
                    Intrinsics.checkNotNull(size);
                    CameraManager cameraManager2 = cameraManager;
                    if (c10 == null) {
                        strArr = cameraIdList;
                        int i15 = (int) d10;
                        i10 = length;
                        range = new Range<>(Integer.valueOf(i15), Integer.valueOf(i15));
                    } else {
                        strArr = cameraIdList;
                        i10 = length;
                        range = c10;
                    }
                    arrayList.add(new h0(str, size, d10, range, intValue, bVar, new ExtraCameraOptions(0L, false, 3, null)));
                    i13++;
                    outputSizes = sizeArr;
                    length2 = length2;
                    cls = cls2;
                    i12 = i14;
                    cameraManager = cameraManager2;
                    cameraIdList = strArr;
                    length = i10;
                }
            }
            i12++;
            cameraManager = cameraManager;
            cameraIdList = cameraIdList;
            length = length;
            i11 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i16 = 0;
        while (i16 < size2) {
            Object obj = arrayList.get(i16);
            i16++;
            h0 h0Var = (h0) obj;
            if (h0Var.getSize().getWidth() < 2000 && h0Var.getSize().getHeight() < 2000) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Nullable
    public static final CameraChoices b(@NotNull Context context, @NotNull m0 cameraDirection) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        List<h0> a10 = a(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            if (((h0) obj).getFacing() == e(cameraDirection)) {
                arrayList.add(obj);
            }
        }
        List F0 = CollectionsKt.F0(arrayList, new b());
        if (F0.isEmpty()) {
            return null;
        }
        return new CameraChoices((h0) CollectionsKt.d0(F0), CollectionsKt.H0(CollectionsKt.Y(F0, 1), 5));
    }

    public static final Range<Integer> c(CameraCharacteristics cameraCharacteristics, int i10) {
        Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (rangeArr == null || rangeArr.length == 0) {
            return null;
        }
        for (Range<Integer> range2 : rangeArr) {
            Integer upper = range2.getUpper();
            Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
            int intValue = upper.intValue();
            if (intValue >= i10 && (range == null || intValue < range.getUpper().intValue())) {
                range = range2;
            }
        }
        if (range != null) {
            return range;
        }
        if (rangeArr.length == 0) {
            throw new NoSuchElementException();
        }
        Range<Integer> range3 = rangeArr[0];
        int M = kotlin.collections.m.M(rangeArr);
        if (M == 0) {
            return range3;
        }
        Integer upper2 = range3.getUpper();
        int i11 = 1;
        if (1 <= M) {
            while (true) {
                Range<Integer> range4 = rangeArr[i11];
                Integer upper3 = range4.getUpper();
                if (upper2.compareTo(upper3) < 0) {
                    range3 = range4;
                    upper2 = upper3;
                }
                if (i11 == M) {
                    break;
                }
                i11++;
            }
        }
        return range3;
    }

    @NotNull
    public static final String d(@NotNull Context context, @NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Object systemService = context.getSystemService("camera");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        try {
            Integer num = (Integer) ((CameraManager) systemService).getCameraCharacteristics(cameraId).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null && num.intValue() == 2) {
                return "LEGACY";
            }
            if (num != null && num.intValue() == 0) {
                return "LIMITED";
            }
            if (num != null && num.intValue() == 1) {
                return "FULL";
            }
            if (num != null && num.intValue() == 3) {
                return "LEVEL_3";
            }
            if (num != null && num.intValue() == 4) {
                return "EXTERNAL";
            }
            return "unknown(" + num + ")";
        } catch (Exception e10) {
            return "unknown(" + kotlin.jvm.internal.d0.b(e10.getClass()).g() + ")";
        }
    }

    public static final CameraProperties.b e(m0 m0Var) {
        int i10 = a.f17341a[m0Var.ordinal()];
        if (i10 == 1) {
            return CameraProperties.b.f9961a;
        }
        if (i10 == 2) {
            return CameraProperties.b.b;
        }
        if (i10 == 3) {
            return CameraProperties.b.f9962c;
        }
        throw new gt.l();
    }
}
