package j9;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class a0 extends x {

    /* renamed from: c, reason: collision with root package name */
    public static final WeakReference f21587c = new WeakReference(null);
    public WeakReference b;

    public a0(byte[] bArr) {
        super(bArr);
        this.b = f21587c;
    }

    @Override // j9.x
    public final byte[] t2() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.b.get();
                if (bArr == null) {
                    bArr = v2();
                    this.b = new WeakReference(bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public abstract byte[] v2();
}
