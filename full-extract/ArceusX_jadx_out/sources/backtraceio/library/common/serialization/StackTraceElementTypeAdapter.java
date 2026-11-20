package backtraceio.library.common.serialization;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import jg.a0;

/* loaded from: classes.dex */
public class StackTraceElementTypeAdapter extends a0<StackTraceElement> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // jg.a0
    public StackTraceElement read(JsonReader jsonReader) {
        char c10;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        int i10 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1362643908:
                    if (nextName.equals("file-name")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1029014718:
                    if (nextName.equals("line-number")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -973328393:
                    if (nextName.equals("method-name")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -216804398:
                    if (nextName.equals("declaring-class")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    if (jsonReader.peek() != JsonToken.NULL) {
                        str3 = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.nextNull();
                        str3 = null;
                        break;
                    }
                case 1:
                    i10 = jsonReader.nextInt();
                    break;
                case 2:
                    str2 = jsonReader.nextString();
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new StackTraceElement(str, str2, str3, i10);
    }

    @Override // jg.a0
    public void write(JsonWriter jsonWriter, StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("declaring-class").value(stackTraceElement.getClassName());
        jsonWriter.name("method-name").value(stackTraceElement.getMethodName());
        jsonWriter.name("file-name").value(stackTraceElement.getFileName());
        jsonWriter.name("line-number").value(stackTraceElement.getLineNumber());
        jsonWriter.endObject();
    }
}
