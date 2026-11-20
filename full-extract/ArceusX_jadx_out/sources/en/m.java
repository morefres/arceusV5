package en;

import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import dn.MrzExtraction;
import dn.e;
import dn.z;
import en.a;
import en.b;
import gt.n;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Len/m;", "Len/e;", "<init>", "()V", "Ldn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lgt/n;", "Len/a;", ve.a.f33391e, "(Ldn/z;Landroid/graphics/Rect;Lmt/b;)Ljava/lang/Object;", "Lcom/google/mlkit/vision/text/TextRecognizer;", "Lgt/h;", "c", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h textDetector = gt.i.b(new Function0() { // from class: en.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TextRecognizer d10;
            d10 = m.d();
            return d10;
        }
    });

    private final TextRecognizer c() {
        return (TextRecognizer) this.textDetector.getValue();
    }

    public static final TextRecognizer d() {
        TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // en.e
    @Nullable
    public Object a(@NotNull z zVar, @Nullable Rect rect, @NotNull mt.b<? super gt.n<? extends a>> bVar) {
        Task<Text> process = c().process(zVar.g());
        Intrinsics.checkNotNullExpressionValue(process, "process(...)");
        try {
            String text = process.getResult().getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (Intrinsics.c(text, "")) {
                n.Companion companion = gt.n.INSTANCE;
                return gt.n.b(a.b.f16056a);
            }
            MrzExtraction e10 = MrzExtraction.INSTANCE.e(text);
            if (e10 == null) {
                n.Companion companion2 = gt.n.INSTANCE;
                return gt.n.b(a.b.f16056a);
            }
            n.Companion companion3 = gt.n.INSTANCE;
            return gt.n.b(new a.C0300a(new e.MrzBarcodeInfo(e10.getRawText(), e10.getIdentificationNumber(), e10.getBirthdate(), e10.getExpirationDate())));
        } catch (ExecutionException unused) {
            n.Companion companion4 = gt.n.INSTANCE;
            return gt.n.b(gt.o.a(new b.C0301b()));
        }
    }
}
