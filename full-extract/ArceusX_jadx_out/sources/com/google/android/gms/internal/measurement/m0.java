package com.google.android.gms.internal.measurement;

import androidx.core.text.HtmlCompat;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 extends x {
    public m0() {
        this.f6941a.add(n0.ASSIGN);
        this.f6941a.add(n0.CONST);
        this.f6941a.add(n0.CREATE_ARRAY);
        this.f6941a.add(n0.CREATE_OBJECT);
        this.f6941a.add(n0.EXPRESSION_LIST);
        this.f6941a.add(n0.GET);
        this.f6941a.add(n0.GET_INDEX);
        this.f6941a.add(n0.GET_PROPERTY);
        this.f6941a.add(n0.NULL);
        this.f6941a.add(n0.SET_PROPERTY);
        this.f6941a.add(n0.TYPEOF);
        this.f6941a.add(n0.UNDEFINED);
        this.f6941a.add(n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        String str2;
        n0 n0Var = n0.ADD;
        int ordinal = v5.e(str).ordinal();
        int i10 = 0;
        if (ordinal == 3) {
            v5.a(n0.ASSIGN.name(), 2, list);
            q a10 = u4Var.a((q) list.get(0));
            if (!(a10 instanceof u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", a10.getClass().getCanonicalName()));
            }
            if (!u4Var.d(a10.zzc())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", a10.zzc()));
            }
            q a11 = u4Var.a((q) list.get(1));
            u4Var.e(a10.zzc(), a11);
            return a11;
        }
        if (ordinal == 14) {
            v5.b(n0.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i10 < list.size() - 1) {
                q a12 = u4Var.a((q) list.get(i10));
                if (!(a12 instanceof u)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", a12.getClass().getCanonicalName()));
                }
                u4Var.g(a12.zzc(), u4Var.a((q) list.get(i10 + 1)));
                i10 += 2;
            }
            return q.f6791yo;
        }
        if (ordinal == 24) {
            v5.b(n0.EXPRESSION_LIST.name(), 1, list);
            q qVar = q.f6791yo;
            while (i10 < list.size()) {
                qVar = u4Var.a((q) list.get(i10));
                if (qVar instanceof h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return qVar;
        }
        if (ordinal == 33) {
            v5.a(n0.GET.name(), 1, list);
            q a13 = u4Var.a((q) list.get(0));
            if (a13 instanceof u) {
                return u4Var.h(a13.zzc());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", a13.getClass().getCanonicalName()));
        }
        if (ordinal == 49) {
            v5.a(n0.NULL.name(), 0, list);
            return q.f6792zo;
        }
        if (ordinal == 58) {
            v5.a(n0.SET_PROPERTY.name(), 3, list);
            q a14 = u4Var.a((q) list.get(0));
            q a15 = u4Var.a((q) list.get(1));
            q a16 = u4Var.a((q) list.get(2));
            if (a14 == q.f6791yo || a14 == q.f6792zo) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", a15.zzc(), a14.zzc()));
            }
            if ((a14 instanceof f) && (a15 instanceof j)) {
                ((f) a14).p(a15.zzd().intValue(), a16);
                return a16;
            }
            if (!(a14 instanceof m)) {
                return a16;
            }
            ((m) a14).d(a15.zzc(), a16);
            return a16;
        }
        if (ordinal == 17) {
            if (list.isEmpty()) {
                return new f();
            }
            f fVar = new f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q a17 = u4Var.a((q) it.next());
                if (a17 instanceof h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                fVar.p(i10, a17);
                i10++;
            }
            return fVar;
        }
        if (ordinal == 18) {
            if (list.isEmpty()) {
                return new n();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            n nVar = new n();
            while (i10 < list.size() - 1) {
                q a18 = u4Var.a((q) list.get(i10));
                q a19 = u4Var.a((q) list.get(i10 + 1));
                if ((a18 instanceof h) || (a19 instanceof h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                nVar.d(a18.zzc(), a19);
                i10 += 2;
            }
            return nVar;
        }
        if (ordinal == 35 || ordinal == 36) {
            v5.a(n0.GET_PROPERTY.name(), 2, list);
            q a20 = u4Var.a((q) list.get(0));
            q a21 = u4Var.a((q) list.get(1));
            if ((a20 instanceof f) && v5.d(a21)) {
                return ((f) a20).m(a21.zzd().intValue());
            }
            if (a20 instanceof m) {
                return ((m) a20).c(a21.zzc());
            }
            if (a20 instanceof u) {
                if ("length".equals(a21.zzc())) {
                    return new j(Double.valueOf(a20.zzc().length()));
                }
                if (v5.d(a21) && a21.zzd().doubleValue() < a20.zzc().length()) {
                    return new u(String.valueOf(a20.zzc().charAt(a21.zzd().intValue())));
                }
            }
            return q.f6791yo;
        }
        switch (ordinal) {
            case 62:
                v5.a(n0.TYPEOF.name(), 1, list);
                q a22 = u4Var.a((q) list.get(0));
                if (a22 instanceof v) {
                    str2 = "undefined";
                } else if (a22 instanceof g) {
                    str2 = InquiryField.BooleanField.TYPE;
                } else if (a22 instanceof j) {
                    str2 = InquiryField.FloatField.TYPE2;
                } else if (a22 instanceof u) {
                    str2 = InquiryField.StringField.TYPE;
                } else if (a22 instanceof p) {
                    str2 = "function";
                } else {
                    if ((a22 instanceof r) || (a22 instanceof h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", a22));
                    }
                    str2 = "object";
                }
                return new u(str2);
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                v5.a(n0.UNDEFINED.name(), 0, list);
                return q.f6791yo;
            case 64:
                v5.b(n0.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    q a23 = u4Var.a((q) it2.next());
                    if (!(a23 instanceof u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", a23.getClass().getCanonicalName()));
                    }
                    u4Var.f(a23.zzc(), q.f6791yo);
                }
                return q.f6791yo;
            default:
                return super.b(str);
        }
    }
}
