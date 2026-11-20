package tn;

import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;

/* loaded from: classes3.dex */
public class d {
    public static int a(char c10, CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\n' || charAt == '\r') {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static boolean c(CharSequence charSequence) {
        int length = charSequence.length();
        return i(' ', charSequence, 0, length) != length;
    }

    public static boolean d(CharSequence charSequence) {
        return k(charSequence, 0, charSequence.length()) == charSequence.length();
    }

    public static boolean e(CharSequence charSequence, int i10) {
        return Character.isLetter(Character.codePointAt(charSequence, i10));
    }

    public static boolean f(int i10) {
        switch (Character.getType(i10)) {
            default:
                if (i10 != 36 && i10 != 43 && i10 != 94 && i10 != 96 && i10 != 124 && i10 != 126) {
                    switch (i10) {
                        case 60:
                        case 61:
                        case 62:
                            break;
                        default:
                            return false;
                    }
                }
                break;
            case 20:
            case MotionEventCompat.AXIS_WHEEL /* 21 */:
            case MotionEventCompat.AXIS_GAS /* 22 */:
            case MotionEventCompat.AXIS_BRAKE /* 23 */:
            case MotionEventCompat.AXIS_DISTANCE /* 24 */:
            case 25:
            case MotionEventCompat.AXIS_SCROLL /* 26 */:
            case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
            case 29:
            case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                return true;
        }
    }

    public static boolean g(CharSequence charSequence, int i10) {
        if (i10 >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i10);
        return charAt == '\t' || charAt == ' ';
    }

    public static boolean h(int i10) {
        return i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32 || Character.getType(i10) == 12;
    }

    public static int i(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int j(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 >= i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }

    public static int k(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (charAt != '\t' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int l(CharSequence charSequence, int i10, int i11) {
        while (i10 >= i11) {
            char charAt = charSequence.charAt(i10);
            if (charAt != '\t' && charAt != ' ') {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }
}
