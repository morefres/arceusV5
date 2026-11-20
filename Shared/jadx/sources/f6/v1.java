package f6;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import g6.NetworkRequestCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.d;
import x5.o0;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020'H\u0001¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lf6/v1;", "", "<init>", "()V", "Lx5/o0$c;", "state", "", "k", "(Lx5/o0$c;)I", "value", "g", "(I)Lx5/o0$c;", "Lx5/a;", "backoffPolicy", ve.a.f33391e, "(Lx5/a;)I", rl.d.f30696a, "(I)Lx5/a;", "Lx5/x;", "networkType", "h", "(Lx5/x;)I", "e", "(I)Lx5/x;", "Lx5/f0;", "policy", "i", "(Lx5/f0;)I", "f", "(I)Lx5/f0;", "", "Lx5/d$c;", "triggers", "", "j", "(Ljava/util/Set;)[B", "bytes", j6.b.f21518e, "([B)Ljava/util/Set;", "Lg6/s;", "l", "([B)Lg6/s;", "requestCompat", "c", "(Lg6/s;)[B", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v1 f16885a = new v1();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16886a;
        public static final /* synthetic */ int[] b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f16887c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f16888d;

        static {
            int[] iArr = new int[o0.c.values().length];
            try {
                iArr[o0.c.f35307a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0.c.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0.c.f35308c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o0.c.f35309d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o0.c.f35310e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o0.c.f35311f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f16886a = iArr;
            int[] iArr2 = new int[x5.a.values().length];
            try {
                iArr2[x5.a.f35237a.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[x5.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[x5.x.values().length];
            try {
                iArr3[x5.x.f35347a.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[x5.x.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[x5.x.f35348c.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[x5.x.f35349d.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[x5.x.f35350e.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f16887c = iArr3;
            int[] iArr4 = new int[x5.f0.values().length];
            try {
                iArr4[x5.f0.f35273a.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[x5.f0.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f16888d = iArr4;
        }
    }

    public static final int a(@NotNull x5.a backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i10 = a.b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new gt.l();
    }

    @NotNull
    public static final Set<d.c> b(@NotNull byte[] bytes) {
        ObjectInputStream objectInputStream;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } finally {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        try {
            int readInt = objectInputStream.readInt();
            for (int i10 = 0; i10 < readInt; i10++) {
                Uri parse = Uri.parse(objectInputStream.readUTF());
                boolean readBoolean = objectInputStream.readBoolean();
                Intrinsics.checkNotNull(parse);
                linkedHashSet.add(new d.c(parse, readBoolean));
            }
            Unit unit = Unit.f22894a;
            tt.c.a(objectInputStream, null);
            Unit unit2 = Unit.f22894a;
            tt.c.a(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    @NotNull
    public static final byte[] c(@NotNull NetworkRequestCompat requestCompat) {
        Intrinsics.checkNotNullParameter(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest b = requestCompat.b();
        if (b == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] c10 = g6.t.c(b);
                int[] b10 = g6.t.b(b);
                objectOutputStream.writeInt(c10.length);
                for (int i10 : c10) {
                    objectOutputStream.writeInt(i10);
                }
                objectOutputStream.writeInt(b10.length);
                for (int i11 : b10) {
                    objectOutputStream.writeInt(i11);
                }
                Unit unit = Unit.f22894a;
                tt.c.a(objectOutputStream, null);
                tt.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @NotNull
    public static final x5.a d(int value) {
        if (value == 0) {
            return x5.a.f35237a;
        }
        if (value == 1) {
            return x5.a.b;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    @NotNull
    public static final x5.x e(int value) {
        if (value == 0) {
            return x5.x.f35347a;
        }
        if (value == 1) {
            return x5.x.b;
        }
        if (value == 2) {
            return x5.x.f35348c;
        }
        if (value == 3) {
            return x5.x.f35349d;
        }
        if (value == 4) {
            return x5.x.f35350e;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return x5.x.f35351f;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    @NotNull
    public static final x5.f0 f(int value) {
        if (value == 0) {
            return x5.f0.f35273a;
        }
        if (value == 1) {
            return x5.f0.b;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    @NotNull
    public static final o0.c g(int value) {
        if (value == 0) {
            return o0.c.f35307a;
        }
        if (value == 1) {
            return o0.c.b;
        }
        if (value == 2) {
            return o0.c.f35308c;
        }
        if (value == 3) {
            return o0.c.f35309d;
        }
        if (value == 4) {
            return o0.c.f35310e;
        }
        if (value == 5) {
            return o0.c.f35311f;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    public static final int h(@NotNull x5.x networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i10 = a.f16887c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == x5.x.f35351f) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static final int i(@NotNull x5.f0 policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i10 = a.f16888d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new gt.l();
    }

    @NotNull
    public static final byte[] j(@NotNull Set<d.c> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (d.c cVar : triggers) {
                    objectOutputStream.writeUTF(cVar.getUri().toString());
                    objectOutputStream.writeBoolean(cVar.getIsTriggeredForDescendants());
                }
                Unit unit = Unit.f22894a;
                tt.c.a(objectOutputStream, null);
                tt.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int k(@NotNull o0.c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (a.f16886a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new gt.l();
        }
    }

    @NotNull
    public static final NetworkRequestCompat l(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new NetworkRequestCompat(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i10 = 0; i10 < readInt; i10++) {
                    iArr[i10] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i11 = 0; i11 < readInt2; i11++) {
                    iArr2[i11] = objectInputStream.readInt();
                }
                NetworkRequestCompat b = g6.q.f18378a.b(iArr2, iArr);
                tt.c.a(objectInputStream, null);
                tt.c.a(byteArrayInputStream, null);
                return b;
            } finally {
            }
        } finally {
        }
    }
}
