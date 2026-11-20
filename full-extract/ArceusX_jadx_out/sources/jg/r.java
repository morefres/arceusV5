package jg;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class r extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21747a;

    public r(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f21747a = bool;
    }

    public static boolean B(r rVar) {
        Object obj = rVar.f21747a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean A() {
        return this.f21747a instanceof Boolean;
    }

    public boolean C() {
        return this.f21747a instanceof Number;
    }

    public boolean D() {
        return this.f21747a instanceof String;
    }

    @Override // jg.l
    public boolean b() {
        return A() ? ((Boolean) this.f21747a).booleanValue() : Boolean.parseBoolean(l());
    }

    @Override // jg.l
    public double c() {
        return C() ? k().doubleValue() : Double.parseDouble(l());
    }

    @Override // jg.l
    public float d() {
        return C() ? k().floatValue() : Float.parseFloat(l());
    }

    @Override // jg.l
    public int e() {
        return C() ? k().intValue() : Integer.parseInt(l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f21747a == null) {
            return rVar.f21747a == null;
        }
        if (B(this) && B(rVar)) {
            return ((this.f21747a instanceof BigInteger) || (rVar.f21747a instanceof BigInteger)) ? z().equals(rVar.z()) : k().longValue() == rVar.k().longValue();
        }
        Object obj2 = this.f21747a;
        if (obj2 instanceof Number) {
            Object obj3 = rVar.f21747a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return y().compareTo(rVar.y()) == 0;
                }
                double c10 = c();
                double c11 = rVar.c();
                return c10 == c11 || (Double.isNaN(c10) && Double.isNaN(c11));
            }
        }
        return obj2.equals(rVar.f21747a);
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f21747a == null) {
            return 31;
        }
        if (B(this)) {
            doubleToLongBits = k().longValue();
        } else {
            Object obj = this.f21747a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(k().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // jg.l
    public long i() {
        return C() ? k().longValue() : Long.parseLong(l());
    }

    @Override // jg.l
    public Number k() {
        Object obj = this.f21747a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new LazilyParsedNumber((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // jg.l
    public String l() {
        Object obj = this.f21747a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (C()) {
            return k().toString();
        }
        if (A()) {
            return ((Boolean) this.f21747a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f21747a.getClass());
    }

    @Override // jg.l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public r a() {
        return this;
    }

    public BigDecimal y() {
        Object obj = this.f21747a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : NumberLimits.parseBigDecimal(l());
    }

    public BigInteger z() {
        Object obj = this.f21747a;
        return obj instanceof BigInteger ? (BigInteger) obj : B(this) ? BigInteger.valueOf(k().longValue()) : NumberLimits.parseBigInteger(l());
    }

    public r(Number number) {
        Objects.requireNonNull(number);
        this.f21747a = number;
    }

    public r(String str) {
        Objects.requireNonNull(str);
        this.f21747a = str;
    }
}
