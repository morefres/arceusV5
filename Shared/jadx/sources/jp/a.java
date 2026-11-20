package jp;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ljp/a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", "c", "()Ljava/lang/String;", j6.b.f21518e, rl.d.f30696a, "e", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    public static final a f21976c = new a("Sha256", 0, "sha256");

    /* renamed from: d, reason: collision with root package name */
    public static final a f21977d = new a("Sha384", 1, "sha384");

    /* renamed from: e, reason: collision with root package name */
    public static final a f21978e = new a("Sha512", 2, "sha512");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f21979f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pt.a f21980g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljp/a$a;", "", "<init>", "()V", "", "rawValue", "Ljp/a;", ve.a.f33391e, "(Ljava/lang/String;)Ljp/a;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: jp.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final a a(@Nullable String rawValue) {
            Object obj;
            Iterator<E> it = a.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((a) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            return (a) obj;
        }

        public Companion() {
        }
    }

    static {
        a[] a10 = a();
        f21979f = a10;
        f21980g = pt.b.a(a10);
        INSTANCE = new Companion(null);
    }

    public a(String str, int i10, String str2) {
        this.rawValue = str2;
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f21976c, f21977d, f21978e};
    }

    @NotNull
    public static pt.a<a> b() {
        return f21980g;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f21979f.clone();
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
