package we;

import java.lang.reflect.Array;
import java.math.BigInteger;
import we.e;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f34208a;
    public static final long[] b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f34209c;

    /* renamed from: d, reason: collision with root package name */
    public static final e.a[][] f34210d;

    /* renamed from: e, reason: collision with root package name */
    public static final e.a[] f34211e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f34212f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f34213g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f34214h;

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f34215i;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public BigInteger f34216a;
        public BigInteger b;

        public b() {
        }
    }

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f34212f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        f34213g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        f34214h = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        f34215i = modPow;
        b bVar = new b();
        bVar.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        bVar.f34216a = c(bVar.b);
        f34208a = i.c(d(mod));
        b = i.c(d(mod2));
        f34209c = i.c(d(modPow));
        f34210d = (e.a[][]) Array.newInstance((Class<?>) e.a.class, 32, 8);
        b bVar2 = bVar;
        for (int i10 = 0; i10 < 32; i10++) {
            b bVar3 = bVar2;
            for (int i11 = 0; i11 < 8; i11++) {
                f34210d[i10][i11] = b(bVar3);
                bVar3 = a(bVar3, bVar2);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                bVar2 = a(bVar2, bVar2);
            }
        }
        b a10 = a(bVar, bVar);
        f34211e = new e.a[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f34211e[i13] = b(bVar);
            bVar = a(bVar, a10);
        }
    }

    public static b a(b bVar, b bVar2) {
        b bVar3 = new b();
        BigInteger multiply = f34213g.multiply(bVar.f34216a.multiply(bVar2.f34216a).multiply(bVar.b).multiply(bVar2.b));
        BigInteger bigInteger = f34212f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = bVar.f34216a.multiply(bVar2.b).add(bVar2.f34216a.multiply(bVar.b));
        BigInteger bigInteger2 = BigInteger.ONE;
        bVar3.f34216a = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        bVar3.b = bVar.b.multiply(bVar2.b).add(bVar.f34216a.multiply(bVar2.f34216a)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return bVar3;
    }

    public static e.a b(b bVar) {
        BigInteger add = bVar.b.add(bVar.f34216a);
        BigInteger bigInteger = f34212f;
        return new e.a(i.c(d(add.mod(bigInteger))), i.c(d(bVar.b.subtract(bVar.f34216a).mod(bigInteger))), i.c(d(f34214h.multiply(bVar.f34216a).multiply(bVar.b).mod(bigInteger))));
    }

    public static BigInteger c(BigInteger bigInteger) {
        BigInteger pow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger subtract = pow.subtract(bigInteger2);
        BigInteger add = f34213g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f34212f;
        BigInteger multiply = subtract.multiply(add.modInverse(bigInteger3));
        BigInteger modPow = multiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!modPow.pow(2).subtract(multiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(f34215i).mod(bigInteger3);
        }
        return modPow.testBit(0) ? bigInteger3.subtract(modPow) : modPow;
    }

    public static byte[] d(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }
}
