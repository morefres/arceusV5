package ml;

import j6.b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lml/a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", ve.a.f33391e, "Ljava/lang/String;", b.f21518e, "c", d.f30696a, "e", "theme"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    public static final a f24590c = new a("LIGHT", 0, "Light");

    /* renamed from: d, reason: collision with root package name */
    public static final a f24591d = new a("DARK", 1, "Dark");

    /* renamed from: e, reason: collision with root package name */
    public static final a f24592e = new a("CLASSIC", 2, "Classic");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f24593f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pt.a f24594g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0005"}, d2 = {"Lml/a$a;", "", "<init>", "()V", "", "theme", "Lml/a;", ve.a.f33391e, "(Ljava/lang/String;)Lml/a;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: ml.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a(@Nullable String theme) {
            if (theme == null) {
                theme = "default";
            }
            String lowerCase = theme.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return Intrinsics.c(lowerCase, "light") ? a.f24590c : Intrinsics.c(lowerCase, "dark") ? a.f24591d : a.f24592e;
        }

        public Companion() {
        }
    }

    static {
        a[] a10 = a();
        f24593f = a10;
        f24594g = pt.b.a(a10);
        INSTANCE = new Companion(null);
    }

    public a(String str, int i10, String str2) {
        this.value = str2;
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f24590c, f24591d, f24592e};
    }

    @NotNull
    public static final a b(@Nullable String str) {
        return INSTANCE.a(str);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f24593f.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.value;
    }
}
