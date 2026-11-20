package nn;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import okhttp3.internal.ws.WebSocketProtocol;
import qn.i;

/* loaded from: classes3.dex */
public class e {
    public static boolean a(char c10) {
        switch (c10) {
            case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
            case '#':
            case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
            case '(':
            case ')':
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                return true;
            default:
                switch (c10) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (c10) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (c10) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static boolean b(i iVar) {
        char l10;
        if (!iVar.e()) {
            return false;
        }
        if (!iVar.i('<')) {
            return c(iVar);
        }
        while (iVar.e() && (l10 = iVar.l()) != '\n' && l10 != '<') {
            if (l10 == '>') {
                iVar.h();
                return true;
            }
            if (l10 != '\\') {
                iVar.h();
            } else {
                iVar.h();
                if (a(iVar.l())) {
                    iVar.h();
                }
            }
        }
        return false;
    }

    public static boolean c(i iVar) {
        int i10 = 0;
        boolean z10 = true;
        while (iVar.e()) {
            char l10 = iVar.l();
            if (l10 == ' ') {
                return !z10;
            }
            if (l10 == '\\') {
                iVar.h();
                if (a(iVar.l())) {
                    iVar.h();
                }
            } else if (l10 == '(') {
                i10++;
                if (i10 > 32) {
                    return false;
                }
                iVar.h();
            } else if (l10 != ')') {
                if (Character.isISOControl(l10)) {
                    return !z10;
                }
                iVar.h();
            } else {
                if (i10 == 0) {
                    return true;
                }
                i10--;
                iVar.h();
            }
            z10 = false;
        }
        return true;
    }

    public static boolean d(i iVar) {
        while (iVar.e()) {
            switch (iVar.l()) {
                case '[':
                    return false;
                case '\\':
                    iVar.h();
                    if (!a(iVar.l())) {
                        break;
                    } else {
                        iVar.h();
                        break;
                    }
                case ']':
                    return true;
                default:
                    iVar.h();
                    break;
            }
        }
        return true;
    }

    public static boolean e(i iVar) {
        if (!iVar.e()) {
            return false;
        }
        char l10 = iVar.l();
        char c10 = '\"';
        if (l10 != '\"') {
            c10 = '\'';
            if (l10 != '\'') {
                if (l10 != '(') {
                    return false;
                }
                c10 = ')';
            }
        }
        iVar.h();
        if (!f(iVar, c10) || !iVar.e()) {
            return false;
        }
        iVar.h();
        return true;
    }

    public static boolean f(i iVar, char c10) {
        while (iVar.e()) {
            char l10 = iVar.l();
            if (l10 == '\\') {
                iVar.h();
                if (a(iVar.l())) {
                    iVar.h();
                }
            } else {
                if (l10 == c10) {
                    return true;
                }
                if (c10 == ')' && l10 == '(') {
                    return false;
                }
                iVar.h();
            }
        }
        return true;
    }
}
