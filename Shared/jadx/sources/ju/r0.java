package ju;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0015j\u0002\b\rj\u0002\b\u0010j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lju/r0;", "", "<init>", "(Ljava/lang/String;I)V", "R", "T", "Lkotlin/Function2;", "Lmt/b;", "", "block", "receiver", "completion", "", j6.b.f21518e, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lmt/b;)V", "", "c", "()Z", "isLazy$annotations", "()V", "isLazy", ve.a.f33391e, rl.d.f30696a, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f22143a = new r0("DEFAULT", 0);
    public static final r0 b = new r0("LAZY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f22144c = new r0("ATOMIC", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final r0 f22145d = new r0("UNDISPATCHED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r0[] f22146e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f22147f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22148a;

        static {
            int[] iArr = new int[r0.values().length];
            try {
                iArr[r0.f22143a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r0.f22144c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r0.f22145d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r0.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22148a = iArr;
        }
    }

    static {
        r0[] a10 = a();
        f22146e = a10;
        f22147f = pt.b.a(a10);
    }

    public r0(String str, int i10) {
    }

    public static final /* synthetic */ r0[] a() {
        return new r0[]{f22143a, b, f22144c, f22145d};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f22146e.clone();
    }

    public final <R, T> void b(@NotNull Function2<? super R, ? super mt.b<? super T>, ? extends Object> block, R receiver, @NotNull mt.b<? super T> completion) {
        int i10 = a.f22148a[ordinal()];
        if (i10 == 1) {
            qu.a.b(block, receiver, completion);
            return;
        }
        if (i10 == 2) {
            mt.c.a(block, receiver, completion);
        } else if (i10 == 3) {
            qu.b.c(block, receiver, completion);
        } else if (i10 != 4) {
            throw new gt.l();
        }
    }

    public final boolean c() {
        return this == b;
    }
}
