package jp;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Ljp/b;", "", "", "rawValue", "", "requiredPasswordCount", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", ve.a.f33391e, "Ljava/lang/String;", "c", "()Ljava/lang/String;", j6.b.f21518e, "I", rl.d.f30696a, "()I", "e", "f", "g", "h", "i", "j", "k", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    public static final b f21983d = new b("MnSignForAuth", 0, "mn_sign_for_auth", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final b f21984e = new b("MnSign", 1, "mn_sign", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final b f21985f = new b("MnReadWithVerNumberB", 2, "mn_read_with_ver_number_b", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final b f21986g = new b("MnRead", 3, "mn_read", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final b f21987h = new b("DlRead", 4, "dl_read", 2);

    /* renamed from: i, reason: collision with root package name */
    public static final b f21988i = new b("MnDlRead", 5, "mn_dl_read", 1);

    /* renamed from: j, reason: collision with root package name */
    public static final b f21989j = new b("MnDlCombinedRead", 6, "mn_dl_combined_read", 2);

    /* renamed from: k, reason: collision with root package name */
    public static final b f21990k = new b("ResRead", 7, "res_read", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b[] f21991l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ pt.a f21992m;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String rawValue;

    /* renamed from: b, reason: from kotlin metadata */
    public final int requiredPasswordCount;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljp/b$a;", "", "<init>", "()V", "", "rawValue", "Ljp/b;", ve.a.f33391e, "(Ljava/lang/String;)Ljp/b;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: jp.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final b a(@Nullable String rawValue) {
            Object obj;
            Iterator<E> it = b.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((b) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            return (b) obj;
        }

        public Companion() {
        }
    }

    static {
        b[] a10 = a();
        f21991l = a10;
        f21992m = pt.b.a(a10);
        INSTANCE = new Companion(null);
    }

    public b(String str, int i10, String str2, int i11) {
        this.rawValue = str2;
        this.requiredPasswordCount = i11;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f21983d, f21984e, f21985f, f21986g, f21987h, f21988i, f21989j, f21990k};
    }

    @NotNull
    public static pt.a<b> b() {
        return f21992m;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f21991l.clone();
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }

    /* renamed from: d, reason: from getter */
    public final int getRequiredPasswordCount() {
        return this.requiredPasswordCount;
    }
}
