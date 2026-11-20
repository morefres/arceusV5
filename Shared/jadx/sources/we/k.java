package we;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final b f34254a = new b(null);

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34255a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f34255a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34255a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34255a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34255a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34255a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34255a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b extends jg.a0<jg.l> {
        private b() {
        }

        public final jg.l readTerminal(JsonReader jsonReader, JsonToken jsonToken) {
            int i10 = a.f34255a[jsonToken.ordinal()];
            if (i10 == 3) {
                String nextString = jsonReader.nextString();
                if (k.b(nextString)) {
                    return new jg.r(nextString);
                }
                throw new IOException("illegal characters in string");
            }
            if (i10 == 4) {
                return new jg.r(new c(jsonReader.nextString()));
            }
            if (i10 == 5) {
                return new jg.r(Boolean.valueOf(jsonReader.nextBoolean()));
            }
            if (i10 == 6) {
                jsonReader.nextNull();
                return jg.n.f21745a;
            }
            throw new IllegalStateException("Unexpected token: " + jsonToken);
        }

        public final jg.l tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) {
            int i10 = a.f34255a[jsonToken.ordinal()];
            if (i10 == 1) {
                jsonReader.beginArray();
                return new jg.i();
            }
            if (i10 != 2) {
                return null;
            }
            jsonReader.beginObject();
            return new jg.o();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // jg.a0
        public jg.l read(JsonReader jsonReader) {
            String str;
            JsonToken peek = jsonReader.peek();
            jg.l tryBeginNesting = tryBeginNesting(jsonReader, peek);
            if (tryBeginNesting == null) {
                return readTerminal(jsonReader, peek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (jsonReader.hasNext()) {
                    if (tryBeginNesting instanceof jg.o) {
                        str = jsonReader.nextName();
                        if (!k.b(str)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        str = null;
                    }
                    JsonToken peek2 = jsonReader.peek();
                    jg.l tryBeginNesting2 = tryBeginNesting(jsonReader, peek2);
                    boolean z10 = tryBeginNesting2 != null;
                    if (tryBeginNesting2 == null) {
                        tryBeginNesting2 = readTerminal(jsonReader, peek2);
                    }
                    if (tryBeginNesting instanceof jg.i) {
                        ((jg.i) tryBeginNesting).y(tryBeginNesting2);
                    } else {
                        jg.o oVar = (jg.o) tryBeginNesting;
                        if (oVar.H(str)) {
                            throw new IOException("duplicate key: " + str);
                        }
                        oVar.v(str, tryBeginNesting2);
                    }
                    if (z10) {
                        arrayDeque.addLast(tryBeginNesting);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        tryBeginNesting = tryBeginNesting2;
                    } else {
                        continue;
                    }
                } else {
                    if (tryBeginNesting instanceof jg.i) {
                        jsonReader.endArray();
                    } else {
                        jsonReader.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return tryBeginNesting;
                    }
                    tryBeginNesting = (jg.l) arrayDeque.removeLast();
                }
            }
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, jg.l lVar) {
            throw new UnsupportedOperationException("write is not supported");
        }
    }

    public static final class c extends Number {

        /* renamed from: a, reason: collision with root package name */
        public final String f34256a;

        public c(String str) {
            this.f34256a = str;
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.f34256a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f34256a.equals(((c) obj).f34256a);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.f34256a);
        }

        public int hashCode() {
            return this.f34256a.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.f34256a);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(this.f34256a);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(this.f34256a).intValue();
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.f34256a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f34256a).longValue();
            }
        }

        public String toString() {
            return this.f34256a;
        }
    }

    public static long a(Number number) {
        if (number instanceof c) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }

    public static boolean b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char charAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(charAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(charAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }

    public static jg.l c(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.setLenient(false);
            return f34254a.read(jsonReader);
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }
}
