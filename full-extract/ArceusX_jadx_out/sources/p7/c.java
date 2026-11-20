package p7;

/* loaded from: classes3.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: a, reason: collision with root package name */
    public final String f28518a;

    c(String str) {
        this.f28518a = str;
    }

    public String b() {
        return ".temp" + this.f28518a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f28518a;
    }
}
