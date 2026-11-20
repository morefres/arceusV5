package x3;

import gt.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t3.a0;
import w3.f;
import w3.g;
import w3.h;
import x3.f;
import zl.t;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lx3/h;", "Lt3/a0;", "Lx3/f;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lmt/b;)Ljava/lang/Object;", t.f38095d, "Ljava/io/OutputStream;", "output", "", rl.d.f30696a, "(Lx3/f;Ljava/io/OutputStream;Lmt/b;)Ljava/lang/Object;", "", "value", "Lw3/h;", "c", "(Ljava/lang/Object;)Lw3/h;", "", "name", "Lx3/c;", "mutablePreferences", ve.a.f33391e, "(Ljava/lang/String;Lw3/h;Lx3/c;)V", j6.b.f21518e, "()Lx3/f;", "defaultValue", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements a0<f> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f35029a = new h();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35030a;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f35030a = iArr;
        }
    }

    public final void a(String name, w3.h value, c mutablePreferences) {
        h.b m02 = value.m0();
        switch (m02 == null ? -1 : a.f35030a[m02.ordinal()]) {
            case -1:
                throw new t3.d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new l();
            case 1:
                mutablePreferences.i(i.a(name), Boolean.valueOf(value.d0()));
                return;
            case 2:
                mutablePreferences.i(i.d(name), Float.valueOf(value.h0()));
                return;
            case 3:
                mutablePreferences.i(i.c(name), Double.valueOf(value.g0()));
                return;
            case 4:
                mutablePreferences.i(i.e(name), Integer.valueOf(value.i0()));
                return;
            case 5:
                mutablePreferences.i(i.f(name), Long.valueOf(value.j0()));
                return;
            case 6:
                f.a<String> g10 = i.g(name);
                String k02 = value.k0();
                Intrinsics.checkNotNullExpressionValue(k02, "value.string");
                mutablePreferences.i(g10, k02);
                return;
            case 7:
                f.a<Set<String>> h10 = i.h(name);
                List<String> Z = value.l0().Z();
                Intrinsics.checkNotNullExpressionValue(Z, "value.stringSet.stringsList");
                mutablePreferences.i(h10, CollectionsKt.Q0(Z));
                return;
            case 8:
                f.a<byte[]> b = i.b(name);
                byte[] v5 = value.e0().v();
                Intrinsics.checkNotNullExpressionValue(v5, "value.bytes.toByteArray()");
                mutablePreferences.i(b, v5);
                return;
            case 9:
                throw new t3.d("Value not set.", null, 2, null);
        }
    }

    @Override // t3.a0
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f getDefaultValue() {
        return g.a();
    }

    public final w3.h c(Object value) {
        if (value instanceof Boolean) {
            w3.h build = w3.h.n0().E(((Boolean) value).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder().setBoolean(value).build()");
            return build;
        }
        if (value instanceof Float) {
            w3.h build2 = w3.h.n0().K(((Number) value).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(build2, "newBuilder().setFloat(value).build()");
            return build2;
        }
        if (value instanceof Double) {
            w3.h build3 = w3.h.n0().J(((Number) value).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(build3, "newBuilder().setDouble(value).build()");
            return build3;
        }
        if (value instanceof Integer) {
            w3.h build4 = w3.h.n0().N(((Number) value).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(build4, "newBuilder().setInteger(value).build()");
            return build4;
        }
        if (value instanceof Long) {
            w3.h build5 = w3.h.n0().O(((Number) value).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(build5, "newBuilder().setLong(value).build()");
            return build5;
        }
        if (value instanceof String) {
            w3.h build6 = w3.h.n0().P((String) value).build();
            Intrinsics.checkNotNullExpressionValue(build6, "newBuilder().setString(value).build()");
            return build6;
        }
        if (value instanceof Set) {
            h.a n02 = w3.h.n0();
            g.a a02 = w3.g.a0();
            Intrinsics.d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            w3.h build7 = n02.Q(a02.E((Set) value)).build();
            Intrinsics.checkNotNullExpressionValue(build7, "newBuilder()\n           …                 .build()");
            return build7;
        }
        if (value instanceof byte[]) {
            w3.h build8 = w3.h.n0().G(androidx.datastore.preferences.protobuf.g.e((byte[]) value)).build();
            Intrinsics.checkNotNullExpressionValue(build8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return build8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + value.getClass().getName());
    }

    @Override // t3.a0
    @Nullable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object writeTo(@NotNull f fVar, @NotNull OutputStream outputStream, @NotNull mt.b<? super Unit> bVar) {
        Map<f.a<?>, Object> a10 = fVar.a();
        f.a a02 = w3.f.a0();
        for (Map.Entry<f.a<?>, Object> entry : a10.entrySet()) {
            a02.E(entry.getKey().getName(), c(entry.getValue()));
        }
        a02.build().p(outputStream);
        return Unit.f22894a;
    }

    @Override // t3.a0
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull mt.b<? super f> bVar) {
        w3.f a10 = w3.d.INSTANCE.a(inputStream);
        c b = g.b(new f.b[0]);
        Map<String, w3.h> X = a10.X();
        Intrinsics.checkNotNullExpressionValue(X, "preferencesProto.preferencesMap");
        for (Map.Entry<String, w3.h> entry : X.entrySet()) {
            String name = entry.getKey();
            w3.h value = entry.getValue();
            h hVar = f35029a;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            hVar.a(name, value, b);
        }
        return b.d();
    }
}
