package gu;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lgu/n;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f18858a = new n("INVARIANT", 0);
    public static final n b = new n("IN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final n f18859c = new n("OUT", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n[] f18860d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f18861e;

    static {
        n[] a10 = a();
        f18860d = a10;
        f18861e = pt.b.a(a10);
    }

    public n(String str, int i10) {
    }

    public static final /* synthetic */ n[] a() {
        return new n[]{f18858a, b, f18859c};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f18860d.clone();
    }
}
