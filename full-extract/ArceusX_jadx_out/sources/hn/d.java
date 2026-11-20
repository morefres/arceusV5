package hn;

import android.graphics.Rect;
import dn.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhn/c;", "Ldn/z;", "imageToAnalyze", "Landroid/graphics/Rect;", ve.a.f33391e, "(Lhn/c;Ldn/z;)Landroid/graphics/Rect;", "", "degrees", j6.b.f21518e, "(Landroid/graphics/Rect;I)Landroid/graphics/Rect;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {
    @Nullable
    public static final Rect a(@NotNull ViewfinderInfo viewfinderInfo, @NotNull z imageToAnalyze) {
        int height;
        int width;
        double d10;
        Intrinsics.checkNotNullParameter(viewfinderInfo, "<this>");
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        int width2 = viewfinderInfo.getViewport().width();
        int height2 = viewfinderInfo.getViewport().height();
        if (width2 == 0 || height2 == 0) {
            return null;
        }
        if (imageToAnalyze.d() == 90 || imageToAnalyze.d() == 270) {
            height = imageToAnalyze.getHeight();
            width = imageToAnalyze.getWidth();
        } else {
            height = imageToAnalyze.getWidth();
            width = imageToAnalyze.getHeight();
        }
        double d11 = height;
        double d12 = width2;
        double d13 = d11 / d12;
        double d14 = width;
        double d15 = height2;
        double d16 = d14 / d15;
        double min = Math.min(d13, d16);
        double d17 = 0.0d;
        if (d13 > d16) {
            d10 = 0.0d;
            d17 = (d11 - (d12 * min)) / 2.0d;
        } else {
            d10 = (d14 - (d15 * min)) / 2.0d;
        }
        double d18 = d17 + ((viewfinderInfo.getRegion().left - viewfinderInfo.getViewport().left) * min);
        double d19 = d10 + ((viewfinderInfo.getRegion().top - viewfinderInfo.getViewport().top) * min);
        double width3 = viewfinderInfo.getRegion().width() * min;
        double height3 = viewfinderInfo.getRegion().height() * min;
        return (imageToAnalyze.d() == 90 || imageToAnalyze.d() == 270) ? new Rect((int) d19, (int) d18, (int) (d19 + height3), (int) (d18 + width3)) : new Rect((int) d18, (int) d19, (int) (d18 + width3), (int) (d19 + height3));
    }

    @NotNull
    public static final Rect b(@NotNull Rect rect, int i10) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return (i10 == 90 || i10 == 270) ? new Rect(rect.top, rect.left, rect.bottom, rect.right) : rect;
    }
}
