package ep;

import com.withpersona.sdk2.inquiry.network.dto.Attributes;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {
    @NotNull
    public static final InquirySessionConfig a(@NotNull Attributes attributes) {
        GpsCollectionRequirement gpsCollectionRequirement;
        GpsPrecisionRequirement gpsPrecisionRequirement;
        Intrinsics.checkNotNullParameter(attributes, "<this>");
        com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement gpsCollectionRequirement2 = attributes.getGpsCollectionRequirement();
        if (gpsCollectionRequirement2 == null || (gpsCollectionRequirement = xo.b.a(gpsCollectionRequirement2)) == null) {
            gpsCollectionRequirement = GpsCollectionRequirement.f13251c;
        }
        com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement gpsPrecisionRequirement2 = attributes.getGpsPrecisionRequirement();
        if (gpsPrecisionRequirement2 == null || (gpsPrecisionRequirement = xo.b.b(gpsPrecisionRequirement2)) == null) {
            gpsPrecisionRequirement = GpsPrecisionRequirement.b;
        }
        return new InquirySessionConfig(gpsCollectionRequirement, gpsPrecisionRequirement, attributes.getPlayIntegrityProjectId() != null);
    }
}
