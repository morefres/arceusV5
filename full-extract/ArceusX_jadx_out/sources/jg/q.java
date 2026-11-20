package jg;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes2.dex */
public final class q {
    public static l a(JsonReader jsonReader) {
        x strictness = jsonReader.getStrictness();
        if (strictness == x.LEGACY_STRICT) {
            jsonReader.setStrictness(x.LENIENT);
        }
        try {
            try {
                return Streams.parse(jsonReader);
            } finally {
                jsonReader.setStrictness(strictness);
            }
        } catch (OutOfMemoryError | StackOverflowError e10) {
            throw new p("Failed parsing JSON source: " + jsonReader + " to Json", e10);
        }
    }

    public static l b(Reader reader) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            l a10 = a(jsonReader);
            if (!a10.p() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new u("Did not consume the entire document.");
            }
            return a10;
        } catch (MalformedJsonException | NumberFormatException e10) {
            throw new u(e10);
        } catch (IOException e11) {
            throw new m(e11);
        }
    }

    public static l c(String str) {
        return b(new StringReader(str));
    }
}
