package rl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lrl/a;", "", "", "wireCode", "<init>", "(Ljava/lang/String;II)V", ve.a.f33391e, "I", j6.b.f21518e, "()I", "c", d.f30696a, "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    public static final a f30691c = new a("Rewarded", 0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final a f30692d = new a("Interstitial", 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f30693e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f30694f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int wireCode;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrl/a$a;", "", "<init>", "()V", "", "wireCode", "Lrl/a;", ve.a.f33391e, "(I)Lrl/a;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: rl.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a(int wireCode) {
            a aVar = a.f30691c;
            if (wireCode != aVar.getWireCode()) {
                a aVar2 = a.f30692d;
                if (wireCode == aVar2.getWireCode()) {
                    return aVar2;
                }
            }
            return aVar;
        }

        public Companion() {
        }
    }

    static {
        a[] a10 = a();
        f30693e = a10;
        f30694f = pt.b.a(a10);
        INSTANCE = new Companion(null);
    }

    public a(String str, int i10, int i11) {
        this.wireCode = i11;
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f30691c, f30692d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f30693e.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getWireCode() {
        return this.wireCode;
    }
}
