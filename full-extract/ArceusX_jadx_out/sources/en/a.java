package en;

import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import dn.j0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Len/a;", "", "<init>", "()V", rl.d.f30696a, ve.a.f33391e, "c", "f", "e", j6.b.f21518e, "Len/a$a;", "Len/a$b;", "Len/a$c;", "Len/a$d;", "Len/a$e;", "Len/a$f;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Len/a$a;", "Len/a;", "Ldn/e;", "extractedBarcode", "<init>", "(Ldn/e;)V", ve.a.f33391e, "Ldn/e;", "()Ldn/e;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: en.a$a, reason: collision with other inner class name */
    public static final class C0300a extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final dn.e extractedBarcode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0300a(@NotNull dn.e extractedBarcode) {
            super(null);
            Intrinsics.checkNotNullParameter(extractedBarcode, "extractedBarcode");
            this.extractedBarcode = extractedBarcode;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final dn.e getExtractedBarcode() {
            return this.extractedBarcode;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Len/a$b;", "Len/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f16056a = new b();

        public b() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 801215118;
        }

        @NotNull
        public String toString() {
            return "Empty";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Len/a$c;", "Len/a;", "Ldn/j0$c;", "side", "frontOrBackData", "<init>", "(Ldn/j0$c;Len/a;)V", ve.a.f33391e, "Ldn/j0$c;", j6.b.f21518e, "()Ldn/j0$c;", "Len/a;", "()Len/a;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final j0.c side;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final a frontOrBackData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull j0.c side, @NotNull a frontOrBackData) {
            super(null);
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(frontOrBackData, "frontOrBackData");
            this.side = side;
            this.frontOrBackData = frontOrBackData;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final a getFrontOrBackData() {
            return this.frontOrBackData;
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final j0.c getSide() {
            return this.side;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Len/a$d;", "Len/a;", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "metadata", "<init>", "(Lcom/withpersona/sdk2/camera/ImageIdMetadata;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "()Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ImageIdMetadata metadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull ImageIdMetadata metadata) {
            super(null);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.metadata = metadata;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final ImageIdMetadata getMetadata() {
            return this.metadata;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Len/a$e;", "Len/a;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ImageLightCondition imageLightCondition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull ImageLightCondition imageLightCondition) {
            super(null);
            Intrinsics.checkNotNullParameter(imageLightCondition, "imageLightCondition");
            this.imageLightCondition = imageLightCondition;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Len/a$f;", "Len/a;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "extractedTexts", "<init>", "(Lcom/withpersona/sdk2/camera/ExtractedTexts;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "()Lcom/withpersona/sdk2/camera/ExtractedTexts;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ExtractedTexts extractedTexts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull ExtractedTexts extractedTexts) {
            super(null);
            Intrinsics.checkNotNullParameter(extractedTexts, "extractedTexts");
            this.extractedTexts = extractedTexts;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final ExtractedTexts getExtractedTexts() {
            return this.extractedTexts;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public a() {
    }
}
