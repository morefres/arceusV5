package android.view;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u0007\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\bR*\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/l;", "", "<init>", "()V", "Landroidx/lifecycle/r;", "observer", "", ve.a.f33391e, "(Landroidx/lifecycle/r;)V", d.f30696a, "Landroidx/lifecycle/c;", "Landroidx/lifecycle/c;", "c", "()Landroidx/lifecycle/c;", "setInternalScopeRef", "(Landroidx/lifecycle/c;)V", "internalScopeRef", "Landroidx/lifecycle/l$b;", j6.b.f21518e, "()Landroidx/lifecycle/l$b;", "currentState", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public c<Object> internalScopeRef = new c<>(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/l$a;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/lifecycle/l$b;", j6.b.f21518e, "()Landroidx/lifecycle/l$b;", "targetState", "Companion", ve.a.f33391e, "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        private static final /* synthetic */ pt.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final a ON_CREATE = new a("ON_CREATE", 0);
        public static final a ON_START = new a("ON_START", 1);
        public static final a ON_RESUME = new a("ON_RESUME", 2);
        public static final a ON_PAUSE = new a("ON_PAUSE", 3);
        public static final a ON_STOP = new a("ON_STOP", 4);
        public static final a ON_DESTROY = new a("ON_DESTROY", 5);
        public static final a ON_ANY = new a("ON_ANY", 6);

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/l$a$a;", "", "<init>", "()V", "Landroidx/lifecycle/l$b;", "state", "Landroidx/lifecycle/l$a;", ve.a.f33391e, "(Landroidx/lifecycle/l$b;)Landroidx/lifecycle/l$a;", j6.b.f21518e, "c", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.l$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.lifecycle.l$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0046a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f2625a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.f2628c.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.f2629d.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.f2630e.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.f2627a.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.b.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f2625a = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final a a(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0046a.f2625a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            @Nullable
            public final a b(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0046a.f2625a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            @Nullable
            public final a c(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0046a.f2625a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            public Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2626a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f2626a = iArr;
            }
        }

        static {
            a[] a10 = a();
            $VALUES = a10;
            $ENTRIES = pt.b.a(a10);
            INSTANCE = new Companion(null);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final b b() {
            switch (b.f2626a[ordinal()]) {
                case 1:
                case 2:
                    return b.f2628c;
                case 3:
                case 4:
                    return b.f2629d;
                case 5:
                    return b.f2630e;
                case 6:
                    return b.f2627a;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new gt.l();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/l$b;", "", "<init>", "(Ljava/lang/String;I)V", "state", "", j6.b.f21518e, "(Landroidx/lifecycle/l$b;)Z", ve.a.f33391e, "c", d.f30696a, "e", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2627a = new b("DESTROYED", 0);
        public static final b b = new b("INITIALIZED", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f2628c = new b("CREATED", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final b f2629d = new b("STARTED", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final b f2630e = new b("RESUMED", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f2631f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ pt.a f2632g;

        static {
            b[] a10 = a();
            f2631f = a10;
            f2632g = pt.b.a(a10);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f2627a, b, f2628c, f2629d, f2630e};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f2631f.clone();
        }

        public final boolean b(@NotNull b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(@NotNull InterfaceC0703r observer);

    @NotNull
    public abstract b b();

    @NotNull
    public final c<Object> c() {
        return this.internalScopeRef;
    }

    public abstract void d(@NotNull InterfaceC0703r observer);
}
