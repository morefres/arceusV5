package k0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lk0/e;", "Li0/b;", "Lk0/e$b;", "mode", "<init>", "(Lk0/e$b;)V", "", "toString", "()Ljava/lang/String;", "g", "Lk0/e$b;", "f", "()Lk0/e$b;", "Lk0/b;", "h", "Lk0/b;", "c", "()Lk0/b;", "featureTypeInternal", "i", j6.b.f21518e, ve.a.f33391e, "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: k0.e, reason: from toString */
/* loaded from: classes.dex */
public final class VideoStabilizationFeature extends i0.b {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final b f22190j = b.f22193a;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b mode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k0.b featureTypeInternal;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lk0/e$b;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: k0.e$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f22193a = new b("OFF", 0);
        public static final b b = new b("ON", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f22194c = new b("PREVIEW", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f22195d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ pt.a f22196e;

        static {
            b[] a10 = a();
            f22195d = a10;
            f22196e = pt.b.a(a10);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f22193a, b, f22194c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f22195d.clone();
        }
    }

    public VideoStabilizationFeature(@NotNull b mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
        this.featureTypeInternal = k0.b.f22177c;
    }

    @Override // i0.b
    @NotNull
    /* renamed from: c, reason: from getter */
    public k0.b getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public final b getMode() {
        return this.mode;
    }

    @NotNull
    public String toString() {
        return "VideoStabilizationFeature(mode=" + this.mode.name() + ')';
    }
}
