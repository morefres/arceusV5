package androidx.work;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import x5.f;
import x5.w;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 *2\u00020\u0001:\u0002%*B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u00192\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001f\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/work/b;", "", "other", "<init>", "(Landroidx/work/b;)V", "", "", "values", "(Ljava/util/Map;)V", "key", "", "defaultValue", "c", "(Ljava/lang/String;Z)Z", "", d.f30696a, "(Ljava/lang/String;I)I", "", "f", "(Ljava/lang/String;J)J", "g", "(Ljava/lang/String;)Ljava/lang/String;", "", "j", "()[B", "T", "Ljava/lang/Class;", "klass", "h", "(Ljava/lang/String;Ljava/lang/Class;)Z", "i", "()I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", ve.a.f33391e, "Ljava/util/Map;", "e", "()Ljava/util/Map;", "keyValueMap", j6.b.f21518e, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f3310c = new a().a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> values;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00002\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u0018R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/work/b$a;", "", "<init>", "()V", "", "key", "", "value", "f", "(Ljava/lang/String;I)Landroidx/work/b$a;", "", "g", "(Ljava/lang/String;J)Landroidx/work/b$a;", "h", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;", "Landroidx/work/b;", "data", "c", "(Landroidx/work/b;)Landroidx/work/b$a;", "", "values", d.f30696a, "(Ljava/util/Map;)Landroidx/work/b$a;", j6.b.f21518e, "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/b$a;", ve.a.f33391e, "()Landroidx/work/b;", "e", "", "Ljava/util/Map;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, Object> values = new LinkedHashMap();

        @NotNull
        public final b a() {
            b bVar = new b((Map<String, ?>) this.values);
            b.INSTANCE.e(bVar);
            return bVar;
        }

        @NotNull
        public final a b(@NotNull String key, @Nullable Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Map<String, Object> map = this.values;
            if (value == null) {
                value = null;
            } else {
                gu.c b = d0.b(value.getClass());
                if (!Intrinsics.c(b, d0.b(Boolean.TYPE)) && !Intrinsics.c(b, d0.b(Byte.TYPE)) && !Intrinsics.c(b, d0.b(Integer.TYPE)) && !Intrinsics.c(b, d0.b(Long.TYPE)) && !Intrinsics.c(b, d0.b(Float.TYPE)) && !Intrinsics.c(b, d0.b(Double.TYPE)) && !Intrinsics.c(b, d0.b(String.class)) && !Intrinsics.c(b, d0.b(Boolean[].class)) && !Intrinsics.c(b, d0.b(Byte[].class)) && !Intrinsics.c(b, d0.b(Integer[].class)) && !Intrinsics.c(b, d0.b(Long[].class)) && !Intrinsics.c(b, d0.b(Float[].class)) && !Intrinsics.c(b, d0.b(Double[].class)) && !Intrinsics.c(b, d0.b(String[].class))) {
                    if (Intrinsics.c(b, d0.b(boolean[].class))) {
                        value = f.h((boolean[]) value);
                    } else if (Intrinsics.c(b, d0.b(byte[].class))) {
                        value = f.i((byte[]) value);
                    } else if (Intrinsics.c(b, d0.b(int[].class))) {
                        value = f.l((int[]) value);
                    } else if (Intrinsics.c(b, d0.b(long[].class))) {
                        value = f.m((long[]) value);
                    } else if (Intrinsics.c(b, d0.b(float[].class))) {
                        value = f.k((float[]) value);
                    } else {
                        if (!Intrinsics.c(b, d0.b(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + b);
                        }
                        value = f.j((double[]) value);
                    }
                }
            }
            map.put(key, value);
            return this;
        }

        @NotNull
        public final a c(@NotNull b data) {
            Intrinsics.checkNotNullParameter(data, "data");
            d(data.values);
            return this;
        }

        @NotNull
        public final a d(@NotNull Map<String, ? extends Object> values) {
            Intrinsics.checkNotNullParameter(values, "values");
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a e(String key, Object value) {
            this.values.put(key, value);
            return this;
        }

        @NotNull
        public final a f(@NotNull String key, int value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return e(key, Integer.valueOf(value));
        }

        @NotNull
        public final a g(@NotNull String key, long value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return e(key, Long.valueOf(value));
        }

        @NotNull
        public final a h(@NotNull String key, @Nullable String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return e(key, value);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, d2 = {"Landroidx/work/b$b;", "", "<init>", "()V", "Landroidx/work/b;", "data", "", "e", "(Landroidx/work/b;)[B", "bytes", ve.a.f33391e, "([B)Landroidx/work/b;", "EMPTY", "Landroidx/work/b;", "", "MAX_DATA_BYTES", "I", "", "TYPE_NULL", "B", "TYPE_BOOLEAN", "TYPE_BYTE", "TYPE_INTEGER", "TYPE_LONG", "TYPE_FLOAT", "TYPE_DOUBLE", "TYPE_STRING", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE_ARRAY", "TYPE_INTEGER_ARRAY", "TYPE_LONG_ARRAY", "TYPE_FLOAT_ARRAY", "TYPE_DOUBLE_ARRAY", "TYPE_STRING_ARRAY", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", "S", "STREAM_VERSION", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: androidx.work.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final boolean b(ByteArrayInputStream byteArrayInputStream) {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b = (byte) (-21267);
            boolean z10 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b) {
                z10 = true;
            }
            byteArrayInputStream.reset();
            return z10;
        }

        public static final void c(DataInputStream dataInputStream) {
            short readShort = dataInputStream.readShort();
            if (readShort != -21521) {
                throw new IllegalStateException(("Magic number doesn't match: " + ((int) readShort)).toString());
            }
            short readShort2 = dataInputStream.readShort();
            if (readShort2 == 1) {
                return;
            }
            throw new IllegalStateException(("Unsupported version number: " + ((int) readShort2)).toString());
        }

        public static final Object d(DataInputStream dataInputStream, byte b) {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i10 = 0;
            if (b == 8) {
                int readInt = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[readInt];
                while (i10 < readInt) {
                    boolArr[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                    i10++;
                }
                return boolArr;
            }
            if (b == 9) {
                int readInt2 = dataInputStream.readInt();
                Byte[] bArr = new Byte[readInt2];
                while (i10 < readInt2) {
                    bArr[i10] = Byte.valueOf(dataInputStream.readByte());
                    i10++;
                }
                return bArr;
            }
            if (b == 10) {
                int readInt3 = dataInputStream.readInt();
                Integer[] numArr = new Integer[readInt3];
                while (i10 < readInt3) {
                    numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                    i10++;
                }
                return numArr;
            }
            if (b == 11) {
                int readInt4 = dataInputStream.readInt();
                Long[] lArr = new Long[readInt4];
                while (i10 < readInt4) {
                    lArr[i10] = Long.valueOf(dataInputStream.readLong());
                    i10++;
                }
                return lArr;
            }
            if (b == 12) {
                int readInt5 = dataInputStream.readInt();
                Float[] fArr = new Float[readInt5];
                while (i10 < readInt5) {
                    fArr[i10] = Float.valueOf(dataInputStream.readFloat());
                    i10++;
                }
                return fArr;
            }
            if (b == 13) {
                int readInt6 = dataInputStream.readInt();
                Double[] dArr = new Double[readInt6];
                while (i10 < readInt6) {
                    dArr[i10] = Double.valueOf(dataInputStream.readDouble());
                    i10++;
                }
                return dArr;
            }
            if (b != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b));
            }
            int readInt7 = dataInputStream.readInt();
            String[] strArr = new String[readInt7];
            while (i10 < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (Intrinsics.c(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    readUTF = null;
                }
                strArr[i10] = readUTF;
                i10++;
            }
            return strArr;
        }

        public static final void f(DataOutputStream dataOutputStream, Object[] objArr) {
            int i10;
            gu.c b = d0.b(objArr.getClass());
            if (Intrinsics.c(b, d0.b(Boolean[].class))) {
                i10 = 8;
            } else if (Intrinsics.c(b, d0.b(Byte[].class))) {
                i10 = 9;
            } else if (Intrinsics.c(b, d0.b(Integer[].class))) {
                i10 = 10;
            } else if (Intrinsics.c(b, d0.b(Long[].class))) {
                i10 = 11;
            } else if (Intrinsics.c(b, d0.b(Float[].class))) {
                i10 = 12;
            } else if (Intrinsics.c(b, d0.b(Double[].class))) {
                i10 = 13;
            } else {
                if (!Intrinsics.c(b, d0.b(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + d0.b(objArr.getClass()).f());
                }
                i10 = 14;
            }
            dataOutputStream.writeByte(i10);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i10 == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i10 == 9) {
                    Byte b10 = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b10 != null ? b10.byteValue() : (byte) 0);
                } else if (i10 == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i10 == 11) {
                    Long l10 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l10 != null ? l10.longValue() : 0L);
                } else if (i10 == 12) {
                    Float f10 = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f10 != null ? f10.floatValue() : 0.0f);
                } else if (i10 == 13) {
                    Double d10 = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : 0.0d);
                } else if (i10 == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        public static final void g(DataOutputStream dataOutputStream, String str, Object obj) {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + d0.b(obj.getClass()).g());
                }
                f(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        public static final void h(DataOutputStream dataOutputStream) {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        @NotNull
        public final b a(@NotNull byte[] bytes) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            if (bytes.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bytes.length == 0) {
                return b.f3310c;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i10 = 0;
                if (b(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt = objectInputStream.readInt();
                        while (i10 < readInt) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i10++;
                        }
                        tt.c.a(objectInputStream, null);
                    } finally {
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        c(dataInputStream);
                        int readInt2 = dataInputStream.readInt();
                        while (i10 < readInt2) {
                            linkedHashMap.put(dataInputStream.readUTF(), d(dataInputStream, dataInputStream.readByte()));
                            i10++;
                        }
                        tt.c.a(dataInputStream, null);
                    } finally {
                    }
                }
            } catch (IOException e10) {
                str2 = f.f35272a;
                w.e().d(str2, "Error in Data#fromByteArray: ", e10);
            } catch (ClassNotFoundException e11) {
                str = f.f35272a;
                w.e().d(str, "Error in Data#fromByteArray: ", e11);
            }
            return new b(linkedHashMap);
        }

        @NotNull
        public final byte[] e(@NotNull b data) {
            String str;
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    h(dataOutputStream);
                    dataOutputStream.writeInt(data.i());
                    for (Map.Entry entry : data.values.entrySet()) {
                        g(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    tt.c.a(dataOutputStream, null);
                    Intrinsics.checkNotNull(byteArray);
                    return byteArray;
                } finally {
                }
            } catch (IOException e10) {
                str = f.f35272a;
                w.e().d(str, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        public Companion() {
        }
    }

    public b(@NotNull b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.values = new HashMap(other.values);
    }

    public static final CharSequence k(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
        }
        sb2.append(value);
        return sb2.toString();
    }

    public final boolean c(@NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object valueOf = Boolean.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            valueOf = obj;
        }
        return ((Boolean) valueOf).booleanValue();
    }

    public final int d(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object valueOf = Integer.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Integer) {
            valueOf = obj;
        }
        return ((Number) valueOf).intValue();
    }

    @NotNull
    public final Map<String, Object> e() {
        Map<String, Object> unmodifiableMap = Collections.unmodifiableMap(this.values);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    public boolean equals(@Nullable Object other) {
        boolean z10;
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.c(b.class, other.getClass())) {
            return false;
        }
        b bVar = (b) other;
        Set<String> keySet = this.values.keySet();
        if (!Intrinsics.c(keySet, bVar.values.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj = this.values.get(str);
            Object obj2 = bVar.values.get(str);
            if (obj == null || obj2 == null) {
                z10 = obj == obj2;
            } else {
                if (obj instanceof Object[]) {
                    Object[] objArr = (Object[]) obj;
                    if (obj2 instanceof Object[]) {
                        z10 = k.d(objArr, (Object[]) obj2);
                    }
                }
                z10 = Intrinsics.c(obj, obj2);
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final long f(@NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object valueOf = Long.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Long) {
            valueOf = obj;
        }
        return ((Number) valueOf).longValue();
    }

    @Nullable
    public final String g(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final <T> boolean h(@NotNull String key, @NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Object obj = this.values.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        int i10 = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            i10 += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ j.b((Object[]) value) : entry.hashCode();
        }
        return i10 * 31;
    }

    public final int i() {
        return this.values.size();
    }

    @NotNull
    public final byte[] j() {
        return INSTANCE.e(this);
    }

    @NotNull
    public String toString() {
        return "Data {" + CollectionsKt.m0(this.values.entrySet(), null, null, null, 0, null, new Function1() { // from class: x5.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence k10;
                k10 = androidx.work.b.k((Map.Entry) obj);
                return k10;
            }
        }, 31, null) + "}";
    }

    public b(@NotNull Map<String, ?> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = new HashMap(values);
    }
}
