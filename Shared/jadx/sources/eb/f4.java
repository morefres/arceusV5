package eb;

import androidx.core.view.MotionEventCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class f4 {
    public static final e4 a(InputStream inputStream, h4 h4Var) {
        try {
            return b(inputStream, h4Var);
        } finally {
            try {
                h4Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final e4 b(InputStream inputStream, h4 h4Var) {
        try {
            g4 d10 = h4Var.d();
            if (d10 == null) {
                throw new y3("Parser being asked to parse an empty input stream");
            }
            try {
                byte a10 = d10.a();
                byte b = d10.b();
                int i10 = 0;
                if (b == Byte.MIN_VALUE) {
                    long a11 = h4Var.a();
                    if (a11 > 1000) {
                        throw new y3("Parser being asked to read a large CBOR array");
                    }
                    c(a10, a11, inputStream, h4Var);
                    e4[] e4VarArr = new e4[(int) a11];
                    while (i10 < a11) {
                        e4VarArr[i10] = b(inputStream, h4Var);
                        i10++;
                    }
                    return new v3(e1.i(e4VarArr));
                }
                if (b != -96) {
                    if (b == -64) {
                        throw new y3("Tags are currently unsupported");
                    }
                    if (b == -32) {
                        return new w3(h4Var.f());
                    }
                    if (b == 0 || b == 32) {
                        long b10 = h4Var.b();
                        c(a10, b10 > 0 ? b10 : ~b10, inputStream, h4Var);
                        return new z3(b10);
                    }
                    if (b == 64) {
                        byte[] g10 = h4Var.g();
                        int length = g10.length;
                        c(a10, length, inputStream, h4Var);
                        return new x3(m3.m(g10, 0, length));
                    }
                    if (b == 96) {
                        String e10 = h4Var.e();
                        c(a10, e10.length(), inputStream, h4Var);
                        return new c4(e10);
                    }
                    throw new y3("Unidentifiable major type: " + d10.c());
                }
                long c10 = h4Var.c();
                if (c10 > 1000) {
                    throw new y3("Parser being asked to read a large CBOR map");
                }
                c(a10, c10, inputStream, h4Var);
                int i11 = (int) c10;
                a4[] a4VarArr = new a4[i11];
                e4 e4Var = null;
                int i12 = 0;
                while (i12 < c10) {
                    e4 b11 = b(inputStream, h4Var);
                    if (e4Var != null && b11.compareTo(e4Var) <= 0) {
                        throw new u3(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", e4Var.toString(), b11.toString()));
                    }
                    a4VarArr[i12] = new a4(b11, b(inputStream, h4Var));
                    i12++;
                    e4Var = b11;
                }
                TreeMap treeMap = new TreeMap();
                while (i10 < i11) {
                    a4 a4Var = a4VarArr[i10];
                    if (treeMap.containsKey(a4Var.a())) {
                        throw new u3("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(a4Var.a(), a4Var.b());
                    i10++;
                }
                return new b4(l1.e(treeMap));
            } catch (IOException e11) {
                e = e11;
                throw new y3("Error in decoding CborValue from bytes", e);
            } catch (RuntimeException e12) {
                e = e12;
                throw new y3("Error in decoding CborValue from bytes", e);
            }
        } catch (IOException e13) {
            throw new y3("Error in decoding CborValue from bytes", e13);
        }
    }

    public static final void c(byte b, long j10, InputStream inputStream, h4 h4Var) {
        switch (b) {
            case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                if (j10 >= 24) {
                    return;
                }
                throw new u3("Integer value " + j10 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j10 >= 256) {
                    return;
                }
                throw new u3("Integer value " + j10 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case MotionEventCompat.AXIS_SCROLL /* 26 */:
                if (j10 >= 65536) {
                    return;
                }
                throw new u3("Integer value " + j10 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                if (j10 >= 4294967296L) {
                    return;
                }
                throw new u3("Integer value " + j10 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
