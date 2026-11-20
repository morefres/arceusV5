package j0;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import b1.g;
import g0.a2;
import g0.f1;
import g0.w2;
import gt.l;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n0.g2;
import n0.i4;
import n0.j4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import s0.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u001f\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lj0/c;", "", "Ljava/lang/Class;", "surfaceClass", "", "defaultImageFormat", "<init>", "(Ljava/lang/String;ILjava/lang/Class;I)V", "", "toString", "()Ljava/lang/String;", ve.a.f33391e, "Ljava/lang/Class;", j6.b.f21518e, "()Ljava/lang/Class;", "I", "getDefaultImageFormat", "()I", "c", d.f30696a, "e", "f", "g", "h", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    public static final c f21437d = new c("PREVIEW", 0, SurfaceHolder.class, 34);

    /* renamed from: e, reason: collision with root package name */
    public static final c f21438e = new c("IMAGE_CAPTURE", 1, null, 256);

    /* renamed from: f, reason: collision with root package name */
    public static final c f21439f = new c("VIDEO_CAPTURE", 2, MediaCodec.class, 34);

    /* renamed from: g, reason: collision with root package name */
    public static final c f21440g = new c("STREAM_SHARING", 3, SurfaceTexture.class, 34);

    /* renamed from: h, reason: collision with root package name */
    public static final c f21441h = new c("UNDEFINED", 4, null, 34);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c[] f21442i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ pt.a f21443j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Class<?> surfaceClass;

    /* renamed from: b, reason: from kotlin metadata */
    public final int defaultImageFormat;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lj0/c$a;", "", "<init>", "()V", "Lg0/w2;", "Lj0/c;", j6.b.f21518e, "(Lg0/w2;)Lj0/c;", "Ln0/i4;", "c", "(Ln0/i4;)Lj0/c;", "Lk0/b;", ve.a.f33391e, "(Lg0/w2;)Lk0/b;", "useCase", "", d.f30696a, "(Lk0/b;Lg0/w2;)Z", "e", "(Lg0/w2;)Z", "f", "h", "g", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: j0.c$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: j0.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0376a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21445a;
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[j4.b.values().length];
                try {
                    iArr[j4.b.IMAGE_CAPTURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j4.b.PREVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j4.b.VIDEO_CAPTURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[j4.b.STREAM_SHARING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f21445a = iArr;
                int[] iArr2 = new int[k0.b.values().length];
                try {
                    iArr2[k0.b.f22176a.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[k0.b.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[k0.b.f22177c.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[k0.b.f22178d.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                b = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final k0.b a(@NotNull w2 w2Var) {
            Object obj;
            Intrinsics.checkNotNullParameter(w2Var, "<this>");
            Iterator<E> it = k0.b.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (c.INSTANCE.d((k0.b) obj, w2Var)) {
                    break;
                }
            }
            return (k0.b) obj;
        }

        @NotNull
        public final c b(@NotNull w2 w2Var) {
            Intrinsics.checkNotNullParameter(w2Var, "<this>");
            return w2Var instanceof a2 ? c.f21437d : w2Var instanceof f1 ? c.f21438e : f.e0(w2Var) ? c.f21439f : w2Var instanceof g ? c.f21440g : c.f21441h;
        }

        @NotNull
        public final c c(@NotNull i4<?> i4Var) {
            Intrinsics.checkNotNullParameter(i4Var, "<this>");
            int i10 = C0376a.f21445a[i4Var.X().ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? c.f21441h : c.f21440g : c.f21439f : c.f21437d : c.f21438e;
        }

        public final boolean d(k0.b bVar, w2 w2Var) {
            int i10 = C0376a.b[bVar.ordinal()];
            if (i10 == 1) {
                return e(w2Var);
            }
            if (i10 == 2) {
                return f(w2Var);
            }
            if (i10 == 3) {
                return h(w2Var);
            }
            if (i10 == 4) {
                return g(w2Var);
            }
            throw new l();
        }

        public final boolean e(w2 w2Var) {
            return w2Var.e().Q();
        }

        public final boolean f(w2 w2Var) {
            return w2Var.e().f0();
        }

        public final boolean g(w2 w2Var) {
            return w2Var.e().a(g2.U);
        }

        public final boolean h(w2 w2Var) {
            return w2Var.e().a(i4.H) || w2Var.e().a(i4.I);
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21446a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f21437d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f21438e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f21439f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.f21440g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.f21441h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21446a = iArr;
        }
    }

    static {
        c[] a10 = a();
        f21442i = a10;
        f21443j = pt.b.a(a10);
        INSTANCE = new Companion(null);
    }

    public c(String str, int i10, Class cls, int i11) {
        this.surfaceClass = cls;
        this.defaultImageFormat = i11;
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f21437d, f21438e, f21439f, f21440g, f21441h};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f21442i.clone();
    }

    @Nullable
    public final Class<?> b() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i10 = b.f21446a[ordinal()];
        if (i10 == 1) {
            return "Preview";
        }
        if (i10 == 2) {
            return "ImageCapture";
        }
        if (i10 == 3) {
            return "VideoCapture";
        }
        if (i10 == 4) {
            return "StreamSharing";
        }
        if (i10 == 5) {
            return "Undefined";
        }
        throw new l();
    }
}
