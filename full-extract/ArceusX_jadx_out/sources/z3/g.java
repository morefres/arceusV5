package z3;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class g {

    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f37753a;

        public a(@NonNull ByteBuffer byteBuffer) {
            this.f37753a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // z3.g.c
        public int a() {
            return this.f37753a.getInt();
        }

        @Override // z3.g.c
        public void b(int i10) {
            ByteBuffer byteBuffer = this.f37753a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // z3.g.c
        public long c() {
            return g.c(this.f37753a.getInt());
        }

        @Override // z3.g.c
        public long getPosition() {
            return this.f37753a.position();
        }

        @Override // z3.g.c
        public int readUnsignedShort() {
            return g.d(this.f37753a.getShort());
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f37754a;
        public final long b;

        public b(long j10, long j11) {
            this.f37754a = j10;
            this.b = j11;
        }

        public long a() {
            return this.f37754a;
        }
    }

    public interface c {
        int a();

        void b(int i10);

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    public static b a(c cVar) {
        long j10;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i10 = 0;
        while (true) {
            if (i10 >= readUnsignedShort) {
                j10 = -1;
                break;
            }
            int a10 = cVar.a();
            cVar.b(4);
            j10 = cVar.c();
            cVar.b(4);
            if (1835365473 == a10) {
                break;
            }
            i10++;
        }
        if (j10 != -1) {
            cVar.b((int) (j10 - cVar.getPosition()));
            cVar.b(12);
            long c10 = cVar.c();
            for (int i11 = 0; i11 < c10; i11++) {
                int a11 = cVar.a();
                long c11 = cVar.c();
                long c12 = cVar.c();
                if (1164798569 == a11 || 1701669481 == a11) {
                    return new b(c11 + j10, c12);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static a4.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return a4.b.h(duplicate);
    }

    public static long c(int i10) {
        return i10 & 4294967295L;
    }

    public static int d(short s8) {
        return s8 & 65535;
    }
}
