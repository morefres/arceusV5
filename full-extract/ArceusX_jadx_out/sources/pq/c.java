package pq;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import gt.n;
import gt.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.collections.p;
import kotlin.collections.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ-\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpq/c;", "Lpq/a;", "<init>", "()V", "Ljava/io/File;", "file", "Lgt/n;", "", ve.a.f33391e, "(Ljava/io/File;Lmt/b;)Ljava/lang/Object;", "", "", "exifData", "f", "(Ljava/io/File;Ljava/util/Map;)V", rl.d.f30696a, "(Ljava/io/File;)Ljava/util/Map;", "Landroid/graphics/BitmapFactory$Options;", "options", "", "reqWidth", "reqHeight", "c", "(Landroid/graphics/BitmapFactory$Options;II)I", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements pq.a {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.withpersona.sdk2.inquiry.shared.image.RealImageHelper", f = "ImageHelper.kt", l = {MotionEventCompat.AXIS_WHEEL}, m = "resizeAndCompressImageInPlace-gIAlu-s")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f28979t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f28980u;

        /* renamed from: w, reason: collision with root package name */
        public int f28982w;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28980u = obj;
            this.f28982w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object a10 = c.this.a(null, this);
            return a10 == nt.c.e() ? a10 : n.a(a10);
        }
    }

    public static final n e(c cVar, File file) {
        Object b;
        try {
            n.Companion companion = n.INSTANCE;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            Map<String, String> d10 = cVar.d(file);
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = cVar.c(options, 2000, 2000);
            Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (decodeFile != null) {
                try {
                    decodeFile.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                } finally {
                }
            }
            tt.c.a(fileOutputStream, null);
            if (decodeFile != null) {
                decodeFile.recycle();
            }
            cVar.f(file, d10);
            b = n.b(Unit.f22894a);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            b = n.b(o.a(th2));
        }
        return n.a(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // pq.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull final java.io.File r5, @org.jetbrains.annotations.NotNull mt.b<? super gt.n<kotlin.Unit>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pq.c.a
            if (r0 == 0) goto L13
            r0 = r6
            pq.c$a r0 = (pq.c.a) r0
            int r1 = r0.f28982w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28982w = r1
            goto L18
        L13:
            pq.c$a r0 = new pq.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28980u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f28982w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f28979t
            java.io.File r5 = (java.io.File) r5
            gt.o.b(r6)
            goto L50
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            gt.o.b(r6)
            ju.l0 r6 = ju.g1.a()
            pq.b r2 = new pq.b
            r2.<init>()
            java.lang.Object r5 = ot.l.a(r5)
            r0.f28979t = r5
            r0.f28982w = r3
            java.lang.Object r6 = ju.a2.b(r6, r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            gt.n r6 = (gt.n) r6
            java.lang.Object r5 = r6.getValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pq.c.a(java.io.File, mt.b):java.lang.Object");
    }

    public final int c(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i10 = options.outHeight;
        int i11 = options.outWidth;
        if (i10 > reqHeight || i11 > reqWidth) {
            return Math.min(bu.b.d(i10 / reqHeight), bu.b.d(i11 / reqWidth));
        }
        return 1;
    }

    public final Map<String, String> d(File file) {
        try {
            List n10 = p.n("DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "Make", "Model", "Orientation", "SubSecTime", "WhiteBalance");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                c4.a aVar = new c4.a(fileInputStream);
                List list = n10;
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(q.u(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(obj, aVar.k((String) obj));
                }
                tt.c.a(fileInputStream, null);
                return linkedHashMap;
            } finally {
            }
        } catch (IOException unused) {
            return k0.j();
        }
    }

    public final void f(File file, Map<String, String> exifData) {
        try {
            c4.a aVar = new c4.a(file.getAbsolutePath());
            Iterator<T> it = exifData.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    aVar.h0(str, str2);
                }
            }
            aVar.c0();
        } catch (IOException unused) {
        }
    }
}
