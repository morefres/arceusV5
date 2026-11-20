package en;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.android.renderscript.Toolkit;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import dn.e;
import dn.z;
import en.a;
import en.b;
import gt.n;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Len/d;", "Len/e;", "", "analyzeViewfinderRegionOnly", "<init>", "(Z)V", "Ldn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lgt/n;", "Len/a;", ve.a.f33391e, "(Ldn/z;Landroid/graphics/Rect;Lmt/b;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "original", "e", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Z", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", j6.b.f21518e, "Lgt/h;", rl.d.f30696a, "()Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeDetector", "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements e {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final float[] f16062d = {-0.15f, -0.15f, -0.15f, -0.15f, 2.2f, -0.15f, -0.15f, -0.15f, -0.15f};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean analyzeViewfinderRegionOnly;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gt.h barcodeDetector = gt.i.b(new Function0() { // from class: en.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BarcodeScanner c10;
            c10 = d.c();
            return c10;
        }
    });

    public d(boolean z10) {
        this.analyzeViewfinderRegionOnly = z10;
    }

    public static final BarcodeScanner c() {
        BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(2048, new int[0]).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // en.e
    @Nullable
    public Object a(@NotNull z zVar, @Nullable Rect rect, @NotNull mt.b<? super gt.n<? extends a>> bVar) {
        Bitmap e10 = zVar.e();
        if (e10 == null) {
            n.Companion companion = gt.n.INSTANCE;
            return gt.n.b(a.b.f16056a);
        }
        Bitmap e11 = e(e10);
        if (e11 != null) {
            e10 = e11;
        }
        InputImage fromBitmap = InputImage.fromBitmap(e10, zVar.g().getRotationDegrees());
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(...)");
        Task<List<Barcode>> process = d().process(fromBitmap);
        Intrinsics.checkNotNullExpressionValue(process, "process(...)");
        try {
            List<Barcode> result = process.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            Barcode barcode = (Barcode) CollectionsKt.f0(result, 0);
            if (barcode == null) {
                n.Companion companion2 = gt.n.INSTANCE;
                return gt.n.b(a.b.f16056a);
            }
            String rawValue = barcode.getRawValue();
            if (rawValue == null) {
                n.Companion companion3 = gt.n.INSTANCE;
                return gt.n.b(a.b.f16056a);
            }
            if (barcode.getFormat() != 2048) {
                n.Companion companion4 = gt.n.INSTANCE;
                return gt.n.b(a.b.f16056a);
            }
            e.Pdf417BarcodeInfo pdf417BarcodeInfo = new e.Pdf417BarcodeInfo(rawValue);
            Rect a10 = f.a(zVar, rect, this.analyzeViewfinderRegionOnly);
            Rect boundingBox = barcode.getBoundingBox();
            if (boundingBox == null) {
                n.Companion companion5 = gt.n.INSTANCE;
                return gt.n.b(a.b.f16056a);
            }
            a10.inset(1, 1);
            if (a10.contains(boundingBox)) {
                n.Companion companion6 = gt.n.INSTANCE;
                return gt.n.b(new a.C0300a(pdf417BarcodeInfo));
            }
            n.Companion companion7 = gt.n.INSTANCE;
            return gt.n.b(a.b.f16056a);
        } catch (ExecutionException unused) {
            n.Companion companion8 = gt.n.INSTANCE;
            return gt.n.b(gt.o.a(new b.C0301b()));
        }
    }

    public final BarcodeScanner d() {
        return (BarcodeScanner) this.barcodeDetector.getValue();
    }

    public final Bitmap e(Bitmap original) {
        try {
            return Toolkit.b(Toolkit.f8430a, original, f16062d, null, 4, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        }
    }
}
