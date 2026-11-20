package com.google.gson.internal.bind;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import jg.a0;
import jg.b0;
import jg.f;
import jg.l;
import jg.r;
import jg.u;

/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements b0 {
    final boolean complexMapKeySerialization;
    private final ConstructorConstructor constructorConstructor;

    public final class Adapter<K, V> extends a0<Map<K, V>> {
        private final ObjectConstructor<? extends Map<K, V>> constructor;
        private final a0<K> keyTypeAdapter;
        private final a0<V> valueTypeAdapter;

        public Adapter(a0<K> a0Var, a0<V> a0Var2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.keyTypeAdapter = a0Var;
            this.valueTypeAdapter = a0Var2;
            this.constructor = objectConstructor;
        }

        private String keyToString(l lVar) {
            if (!lVar.u()) {
                if (lVar.p()) {
                    return "null";
                }
                throw new AssertionError();
            }
            r h10 = lVar.h();
            if (h10.C()) {
                return String.valueOf(h10.k());
            }
            if (h10.A()) {
                return Boolean.toString(h10.b());
            }
            if (h10.D()) {
                return h10.l();
            }
            throw new AssertionError();
        }

        @Override // jg.a0
        public Map<K, V> read(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> construct = this.constructor.construct();
            if (peek != JsonToken.BEGIN_ARRAY) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    K read = this.keyTypeAdapter.read(jsonReader);
                    if (construct.put(read, this.valueTypeAdapter.read(jsonReader)) != null) {
                        throw new u("duplicate key: " + read);
                    }
                }
                jsonReader.endObject();
                return construct;
            }
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                K read2 = this.keyTypeAdapter.read(jsonReader);
                if (construct.put(read2, this.valueTypeAdapter.read(jsonReader)) != null) {
                    throw new u("duplicate key: " + read2);
                }
                jsonReader.endArray();
            }
            jsonReader.endArray();
            return construct;
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, Map<K, V> map) {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.valueTypeAdapter.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                l jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.m() || jsonTree.t();
            }
            if (!z10) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i10 < size) {
                    jsonWriter.name(keyToString((l) arrayList.get(i10)));
                    this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i10));
                    i10++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i10 < size2) {
                jsonWriter.beginArray();
                Streams.write((l) arrayList.get(i10), jsonWriter);
                this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i10));
                jsonWriter.endArray();
                i10++;
            }
            jsonWriter.endArray();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z10) {
        this.constructorConstructor = constructorConstructor;
        this.complexMapKeySerialization = z10;
    }

    private a0<?> getKeyAdapter(f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : fVar.n(TypeToken.get(type));
    }

    @Override // jg.b0
    public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] mapKeyAndValueTypes = GsonTypes.getMapKeyAndValueTypes(type, rawType);
        Type type2 = mapKeyAndValueTypes[0];
        Type type3 = mapKeyAndValueTypes[1];
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(fVar, getKeyAdapter(fVar, type2), type2), new TypeAdapterRuntimeTypeWrapper(fVar, fVar.n(TypeToken.get(type3)), type3), this.constructorConstructor.get(typeToken, false));
    }
}
