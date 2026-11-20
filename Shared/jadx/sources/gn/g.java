package gn;

import android.media.Image;
import com.appsflyer.sdk_base.referrer.Payload;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ/\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lgn/g;", "", "<init>", "()V", "Landroid/media/Image;", Payload.SOURCE, "destination", "", rl.d.f30696a, "(Landroid/media/Image;Landroid/media/Image;)V", "Landroid/media/Image$Plane;", "", "planeWidth", "planeHeight", ve.a.f33391e, "(Landroid/media/Image$Plane;Landroid/media/Image$Plane;II)V", "c", "rowLength", "rowCount", j6.b.f21518e, "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f18553a = new g();

    public final void a(Image.Plane source, Image.Plane destination, int planeWidth, int planeHeight) {
        if (source.getPixelStride() == 1 && destination.getPixelStride() == 1) {
            b(source, destination, planeWidth, planeHeight);
        } else if (source.getPixelStride() == 2 && destination.getPixelStride() == 2) {
            b(source, destination, (planeWidth * 2) - 1, planeHeight);
        } else {
            c(source, destination, planeWidth, planeHeight);
        }
    }

    public final void b(Image.Plane source, Image.Plane destination, int rowLength, int rowCount) {
        ByteBuffer duplicate = source.getBuffer().duplicate();
        ByteBuffer duplicate2 = destination.getBuffer().duplicate();
        int position = duplicate.position();
        int position2 = duplicate2.position();
        if (source.getRowStride() == rowLength && destination.getRowStride() == rowLength) {
            duplicate.limit(position + (rowLength * rowCount));
            duplicate2.put(duplicate);
            return;
        }
        for (int i10 = 0; i10 < rowCount; i10++) {
            int rowStride = (source.getRowStride() * i10) + position;
            duplicate.limit(rowStride + rowLength);
            duplicate.position(rowStride);
            duplicate2.position((destination.getRowStride() * i10) + position2);
            duplicate2.put(duplicate);
        }
    }

    public final void c(Image.Plane source, Image.Plane destination, int planeWidth, int planeHeight) {
        ByteBuffer duplicate = source.getBuffer().duplicate();
        ByteBuffer duplicate2 = destination.getBuffer().duplicate();
        int position = duplicate.position();
        int position2 = duplicate2.position();
        for (int i10 = 0; i10 < planeHeight; i10++) {
            int rowStride = (source.getRowStride() * i10) + position;
            int rowStride2 = (destination.getRowStride() * i10) + position2;
            for (int i11 = 0; i11 < planeWidth; i11++) {
                duplicate2.put(rowStride2, duplicate.get(rowStride));
                rowStride += source.getPixelStride();
                rowStride2 += destination.getPixelStride();
            }
        }
    }

    public final void d(@NotNull Image source, @NotNull Image destination) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int width = source.getWidth() / 2;
        int height = source.getHeight() / 2;
        Image.Plane plane = source.getPlanes()[0];
        Intrinsics.checkNotNullExpressionValue(plane, "get(...)");
        Image.Plane plane2 = destination.getPlanes()[0];
        Intrinsics.checkNotNullExpressionValue(plane2, "get(...)");
        a(plane, plane2, source.getWidth(), source.getHeight());
        Image.Plane plane3 = source.getPlanes()[1];
        Intrinsics.checkNotNullExpressionValue(plane3, "get(...)");
        Image.Plane plane4 = destination.getPlanes()[1];
        Intrinsics.checkNotNullExpressionValue(plane4, "get(...)");
        a(plane3, plane4, width, height);
        Image.Plane plane5 = source.getPlanes()[2];
        Intrinsics.checkNotNullExpressionValue(plane5, "get(...)");
        Image.Plane plane6 = destination.getPlanes()[2];
        Intrinsics.checkNotNullExpressionValue(plane6, "get(...)");
        a(plane5, plane6, width, height);
    }
}
