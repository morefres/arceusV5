package en;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import dn.j0;
import gt.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Len/g;", "Len/e;", "Len/j;", "idFrontAnalyzer", "Len/d;", "barcodePdf417Analyzer", "<init>", "(Len/j;Len/d;)V", "Ldn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lgt/n;", "Len/a;", ve.a.f33391e, "(Ldn/z;Landroid/graphics/Rect;Lmt/b;)Ljava/lang/Object;", "Len/j;", j6.b.f21518e, "Len/d;", "", "Ldn/j0$c;", "c", "Ljava/util/Map;", "analyzers", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j idFrontAnalyzer;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d barcodePdf417Analyzer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<e, j0.c> analyzers;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.analyzers.FrontOrBackAnalyzer", f = "FrontOrBackAnalyzer.kt", l = {MotionEventCompat.AXIS_RELATIVE_X}, m = "analyze-0E7RQCE")
    public static final class a extends ot.d {
        public int B;

        /* renamed from: t, reason: collision with root package name */
        public Object f16066t;

        /* renamed from: u, reason: collision with root package name */
        public Object f16067u;

        /* renamed from: v, reason: collision with root package name */
        public Object f16068v;

        /* renamed from: w, reason: collision with root package name */
        public Object f16069w;

        /* renamed from: x, reason: collision with root package name */
        public Object f16070x;

        /* renamed from: y, reason: collision with root package name */
        public Object f16071y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f16072z;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16072z = obj;
            this.B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object a10 = g.this.a(null, null, this);
            return a10 == nt.c.e() ? a10 : gt.n.a(a10);
        }
    }

    public g(@NotNull j idFrontAnalyzer, @NotNull d barcodePdf417Analyzer) {
        Intrinsics.checkNotNullParameter(idFrontAnalyzer, "idFrontAnalyzer");
        Intrinsics.checkNotNullParameter(barcodePdf417Analyzer, "barcodePdf417Analyzer");
        this.idFrontAnalyzer = idFrontAnalyzer;
        this.barcodePdf417Analyzer = barcodePdf417Analyzer;
        this.analyzers = k0.m(s.a(barcodePdf417Analyzer, j0.c.b), s.a(idFrontAnalyzer, j0.c.f15098a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0096 -> B:10:0x009b). Please report as a decompilation issue!!! */
    @Override // en.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull dn.z r10, @org.jetbrains.annotations.Nullable android.graphics.Rect r11, @org.jetbrains.annotations.NotNull mt.b<? super gt.n<? extends en.a>> r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en.g.a(dn.z, android.graphics.Rect, mt.b):java.lang.Object");
    }
}
