package dn;

import android.graphics.Bitmap;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0003\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ldn/j0;", "", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", ve.a.f33391e, "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", j6.b.f21518e, "c", "Ldn/j0$a;", "Ldn/j0$b;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface j0 {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldn/j0$a;", "Ldn/j0;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: dn.j0$a, reason: from toString */
    public static final /* data */ class None implements j0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final ImageLightCondition imageLightCondition;

        public None(@Nullable ImageLightCondition imageLightCondition) {
            this.imageLightCondition = imageLightCondition;
        }

        @Override // dn.j0
        @Nullable
        /* renamed from: a, reason: from getter */
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof None) && Intrinsics.c(this.imageLightCondition, ((None) other).imageLightCondition);
        }

        public int hashCode() {
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            if (imageLightCondition == null) {
                return 0;
            }
            return imageLightCondition.hashCode();
        }

        @NotNull
        public String toString() {
            return "None(imageLightCondition=" + this.imageLightCondition + ")";
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b&\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b\u001b\u0010,¨\u0006-"}, d2 = {"Ldn/j0$b;", "Ldn/j0;", "Ldn/j0$c;", "side", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "metadata", "Ldn/e;", "extractedBarcode", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "extractedTexts", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Ldn/j0$c;Landroid/graphics/Bitmap;Lcom/withpersona/sdk2/camera/ImageIdMetadata;Ldn/e;Lcom/withpersona/sdk2/camera/ExtractedTexts;Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ldn/j0$c;", "f", "()Ldn/j0$c;", j6.b.f21518e, "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "c", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "e", "()Lcom/withpersona/sdk2/camera/ImageIdMetadata;", rl.d.f30696a, "Ldn/e;", "()Ldn/e;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "()Lcom/withpersona/sdk2/camera/ExtractedTexts;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: dn.j0$b, reason: from toString */
    public static final /* data */ class ParsedIdSide implements j0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final c side;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Bitmap bitmap;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final ImageIdMetadata metadata;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final e extractedBarcode;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final ExtractedTexts extractedTexts;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final ImageLightCondition imageLightCondition;

        public ParsedIdSide(@NotNull c side, @NotNull Bitmap bitmap, @Nullable ImageIdMetadata imageIdMetadata, @Nullable e eVar, @Nullable ExtractedTexts extractedTexts, @Nullable ImageLightCondition imageLightCondition) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.side = side;
            this.bitmap = bitmap;
            this.metadata = imageIdMetadata;
            this.extractedBarcode = eVar;
            this.extractedTexts = extractedTexts;
            this.imageLightCondition = imageLightCondition;
        }

        @Override // dn.j0
        @Nullable
        /* renamed from: a, reason: from getter */
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @Nullable
        /* renamed from: c, reason: from getter */
        public final e getExtractedBarcode() {
            return this.extractedBarcode;
        }

        @Nullable
        /* renamed from: d, reason: from getter */
        public final ExtractedTexts getExtractedTexts() {
            return this.extractedTexts;
        }

        @Nullable
        /* renamed from: e, reason: from getter */
        public final ImageIdMetadata getMetadata() {
            return this.metadata;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedIdSide)) {
                return false;
            }
            ParsedIdSide parsedIdSide = (ParsedIdSide) other;
            return this.side == parsedIdSide.side && Intrinsics.c(this.bitmap, parsedIdSide.bitmap) && Intrinsics.c(this.metadata, parsedIdSide.metadata) && Intrinsics.c(this.extractedBarcode, parsedIdSide.extractedBarcode) && Intrinsics.c(this.extractedTexts, parsedIdSide.extractedTexts) && Intrinsics.c(this.imageLightCondition, parsedIdSide.imageLightCondition);
        }

        @NotNull
        /* renamed from: f, reason: from getter */
        public final c getSide() {
            return this.side;
        }

        public int hashCode() {
            int hashCode = ((this.side.hashCode() * 31) + this.bitmap.hashCode()) * 31;
            ImageIdMetadata imageIdMetadata = this.metadata;
            int hashCode2 = (hashCode + (imageIdMetadata == null ? 0 : imageIdMetadata.hashCode())) * 31;
            e eVar = this.extractedBarcode;
            int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            ExtractedTexts extractedTexts = this.extractedTexts;
            int hashCode4 = (hashCode3 + (extractedTexts == null ? 0 : extractedTexts.hashCode())) * 31;
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            return hashCode4 + (imageLightCondition != null ? imageLightCondition.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ParsedIdSide(side=" + this.side + ", bitmap=" + this.bitmap + ", metadata=" + this.metadata + ", extractedBarcode=" + this.extractedBarcode + ", extractedTexts=" + this.extractedTexts + ", imageLightCondition=" + this.imageLightCondition + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ldn/j0$c;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f15098a = new c("Front", 0);
        public static final c b = new c("Back", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ c[] f15099c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ pt.a f15100d;

        static {
            c[] a10 = a();
            f15099c = a10;
            f15100d = pt.b.a(a10);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{f15098a, b};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f15099c.clone();
        }
    }

    @Nullable
    /* renamed from: a */
    ImageLightCondition getImageLightCondition();
}
