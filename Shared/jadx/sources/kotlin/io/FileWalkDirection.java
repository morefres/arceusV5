package kotlin.io;

import j6.b;
import kotlin.Metadata;
import ve.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", a.f33391e, b.f21518e, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileWalkDirection {

    /* renamed from: a, reason: collision with root package name */
    public static final FileWalkDirection f22937a = new FileWalkDirection("TOP_DOWN", 0);
    public static final FileWalkDirection b = new FileWalkDirection("BOTTOM_UP", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f22938c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pt.a f22939d;

    static {
        FileWalkDirection[] a10 = a();
        f22938c = a10;
        f22939d = pt.b.a(a10);
    }

    public FileWalkDirection(String str, int i10) {
    }

    public static final /* synthetic */ FileWalkDirection[] a() {
        return new FileWalkDirection[]{f22937a, b};
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f22938c.clone();
    }
}
