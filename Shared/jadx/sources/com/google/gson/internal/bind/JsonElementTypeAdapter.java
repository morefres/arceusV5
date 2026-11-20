package com.google.gson.internal.bind;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import jg.a0;
import jg.i;
import jg.l;
import jg.n;
import jg.o;
import jg.r;

/* loaded from: classes2.dex */
class JsonElementTypeAdapter extends a0<l> {
    static final JsonElementTypeAdapter ADAPTER = new JsonElementTypeAdapter();

    /* renamed from: com.google.gson.internal.bind.JsonElementTypeAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private JsonElementTypeAdapter() {
    }

    private l readTerminal(JsonReader jsonReader, JsonToken jsonToken) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i10 == 3) {
            return new r(jsonReader.nextString());
        }
        if (i10 == 4) {
            return new r(new LazilyParsedNumber(jsonReader.nextString()));
        }
        if (i10 == 5) {
            return new r(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i10 == 6) {
            jsonReader.nextNull();
            return n.f21745a;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private l tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i10 == 1) {
            jsonReader.beginArray();
            return new i();
        }
        if (i10 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new o();
    }

    @Override // jg.a0
    public l read(JsonReader jsonReader) {
        if (jsonReader instanceof JsonTreeReader) {
            return ((JsonTreeReader) jsonReader).nextJsonElement();
        }
        JsonToken peek = jsonReader.peek();
        l tryBeginNesting = tryBeginNesting(jsonReader, peek);
        if (tryBeginNesting == null) {
            return readTerminal(jsonReader, peek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String nextName = tryBeginNesting instanceof o ? jsonReader.nextName() : null;
                JsonToken peek2 = jsonReader.peek();
                l tryBeginNesting2 = tryBeginNesting(jsonReader, peek2);
                boolean z10 = tryBeginNesting2 != null;
                if (tryBeginNesting2 == null) {
                    tryBeginNesting2 = readTerminal(jsonReader, peek2);
                }
                if (tryBeginNesting instanceof i) {
                    ((i) tryBeginNesting).y(tryBeginNesting2);
                } else {
                    ((o) tryBeginNesting).v(nextName, tryBeginNesting2);
                }
                if (z10) {
                    arrayDeque.addLast(tryBeginNesting);
                    tryBeginNesting = tryBeginNesting2;
                }
            } else {
                if (tryBeginNesting instanceof i) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return tryBeginNesting;
                }
                tryBeginNesting = (l) arrayDeque.removeLast();
            }
        }
    }

    @Override // jg.a0
    public void write(JsonWriter jsonWriter, l lVar) {
        if (lVar == null || lVar.p()) {
            jsonWriter.nullValue();
            return;
        }
        if (lVar.u()) {
            r h10 = lVar.h();
            if (h10.C()) {
                jsonWriter.value(h10.k());
                return;
            } else if (h10.A()) {
                jsonWriter.value(h10.b());
                return;
            } else {
                jsonWriter.value(h10.l());
                return;
            }
        }
        if (lVar.m()) {
            jsonWriter.beginArray();
            Iterator<l> it = lVar.f().iterator();
            while (it.hasNext()) {
                write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (!lVar.t()) {
            throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
        }
        jsonWriter.beginObject();
        for (Map.Entry<String, l> entry : lVar.g().D()) {
            jsonWriter.name(entry.getKey());
            write(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }
}
