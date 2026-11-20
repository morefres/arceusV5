package o9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {

    /* renamed from: o9.a$a, reason: collision with other inner class name */
    public static class C0485a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0485a(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull android.os.Parcel r6) {
            /*
                r4 = this;
                int r0 = r6.dataPosition()
                int r6 = r6.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r5)
                int r1 = r1.length()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                java.lang.String r3 = java.lang.String.valueOf(r6)
                int r3 = r3.length()
                int r1 = r1 + 13
                int r1 = r1 + r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 6
                int r1 = r1 + r3
                r2.<init>(r1)
                r2.append(r5)
                java.lang.String r5 = " Parcel: pos="
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = " size="
                r2.append(r5)
                r2.append(r6)
                java.lang.String r5 = r2.toString()
                r4.<init>(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o9.a.C0485a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static short A(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    public static int B(@NonNull Parcel parcel, int i10) {
        return (i10 & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void C(@NonNull Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + B(parcel, i10));
    }

    public static int D(@NonNull Parcel parcel) {
        int u8 = u(parcel);
        int B = B(parcel, u8);
        int n10 = n(u8);
        int dataPosition = parcel.dataPosition();
        if (n10 != 20293) {
            throw new C0485a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(u8))), parcel);
        }
        int i10 = B + dataPosition;
        if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i10).length());
        sb2.append("Size read is invalid start=");
        sb2.append(dataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new C0485a(sb2.toString(), parcel);
    }

    public static void E(Parcel parcel, int i10, int i11) {
        int B = B(parcel, i10);
        if (B == i11) {
            return;
        }
        String hexString = Integer.toHexString(B);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(B).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(B);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new C0485a(sb2.toString(), parcel);
    }

    public static void F(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i11).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new C0485a(sb2.toString(), parcel);
    }

    @NonNull
    public static boolean[] a(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + B);
        return createBooleanArray;
    }

    @NonNull
    public static Bundle b(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + B);
        return readBundle;
    }

    @NonNull
    public static byte[] c(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + B);
        return createByteArray;
    }

    @NonNull
    public static byte[][] d(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + B);
        return bArr;
    }

    @NonNull
    public static int[] e(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + B);
        return createIntArray;
    }

    @NonNull
    public static ArrayList<Integer> f(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + B);
        return arrayList;
    }

    @NonNull
    public static <T extends Parcelable> T g(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + B);
        return createFromParcel;
    }

    @NonNull
    public static String h(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + B);
        return readString;
    }

    @NonNull
    public static String[] i(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + B);
        return createStringArray;
    }

    @NonNull
    public static ArrayList<String> j(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + B);
        return createStringArrayList;
    }

    @NonNull
    public static <T> T[] k(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + B);
        return tArr;
    }

    @NonNull
    public static <T> ArrayList<T> l(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + B);
        return createTypedArrayList;
    }

    public static void m(@NonNull Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new C0485a(sb2.toString(), parcel);
    }

    public static int n(int i10) {
        return (char) i10;
    }

    public static boolean o(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    @NonNull
    public static Boolean p(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        if (B == 0) {
            return null;
        }
        F(parcel, i10, B, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double q(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 8);
        return parcel.readDouble();
    }

    @NonNull
    public static Double r(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        if (B == 0) {
            return null;
        }
        F(parcel, i10, B, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float s(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 4);
        return parcel.readFloat();
    }

    @NonNull
    public static Float t(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        if (B == 0) {
            return null;
        }
        F(parcel, i10, B, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int u(@NonNull Parcel parcel) {
        return parcel.readInt();
    }

    @NonNull
    public static IBinder v(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + B);
        return readStrongBinder;
    }

    public static int w(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 4);
        return parcel.readInt();
    }

    @NonNull
    public static Integer x(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        if (B == 0) {
            return null;
        }
        F(parcel, i10, B, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long y(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 8);
        return parcel.readLong();
    }

    @NonNull
    public static Long z(@NonNull Parcel parcel, int i10) {
        int B = B(parcel, i10);
        if (B == 0) {
            return null;
        }
        F(parcel, i10, B, 8);
        return Long.valueOf(parcel.readLong());
    }
}
