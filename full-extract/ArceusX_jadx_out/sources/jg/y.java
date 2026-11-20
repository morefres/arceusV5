package jg;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class y implements z {

    /* renamed from: a, reason: collision with root package name */
    public static final y f21757a = new a("DOUBLE", 0);
    public static final y b = new y("LAZILY_PARSED_NUMBER", 1) { // from class: jg.y.b
        {
            a aVar = null;
        }

        @Override // jg.z
        public Number a(JsonReader jsonReader) {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final y f21758c = new y("LONG_OR_DOUBLE", 2) { // from class: jg.y.c
        {
            a aVar = null;
        }

        @Override // jg.z
        public Number a(JsonReader jsonReader) {
            String nextString = jsonReader.nextString();
            if (nextString.indexOf(46) >= 0) {
                return c(nextString, jsonReader);
            }
            try {
                return Long.valueOf(Long.parseLong(nextString));
            } catch (NumberFormatException unused) {
                return c(nextString, jsonReader);
            }
        }

        public final Number c(String str, JsonReader jsonReader) {
            try {
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (!jsonReader.isLenient()) {
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                }
                return valueOf;
            } catch (NumberFormatException e10) {
                throw new p("Cannot parse " + str + "; at path " + jsonReader.getPreviousPath(), e10);
            }
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final y f21759d = new y("BIG_DECIMAL", 3) { // from class: jg.y.d
        {
            a aVar = null;
        }

        @Override // jg.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(JsonReader jsonReader) {
            String nextString = jsonReader.nextString();
            try {
                return NumberLimits.parseBigDecimal(nextString);
            } catch (NumberFormatException e10) {
                throw new p("Cannot parse " + nextString + "; at path " + jsonReader.getPreviousPath(), e10);
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y[] f21760e = b();

    public enum a extends y {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // jg.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double a(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    public y(String str, int i10) {
    }

    public static /* synthetic */ y[] b() {
        return new y[]{f21757a, b, f21758c, f21759d};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f21760e.clone();
    }

    public /* synthetic */ y(String str, int i10, a aVar) {
        this(str, i10);
    }
}
