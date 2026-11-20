package a4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends c {
    public a f(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
        return this;
    }

    public void g(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public int h(int i10) {
        int b = b(16);
        if (b != 0) {
            return this.b.getInt(d(b) + (i10 * 4));
        }
        return 0;
    }

    public int i() {
        int b = b(16);
        if (b != 0) {
            return e(b);
        }
        return 0;
    }

    public boolean j() {
        int b = b(6);
        return (b == 0 || this.b.get(b + this.f101a) == 0) ? false : true;
    }

    public short k() {
        int b = b(14);
        if (b != 0) {
            return this.b.getShort(b + this.f101a);
        }
        return (short) 0;
    }

    public int l() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.f101a);
        }
        return 0;
    }

    public short m() {
        int b = b(8);
        if (b != 0) {
            return this.b.getShort(b + this.f101a);
        }
        return (short) 0;
    }

    public short n() {
        int b = b(12);
        if (b != 0) {
            return this.b.getShort(b + this.f101a);
        }
        return (short) 0;
    }
}
