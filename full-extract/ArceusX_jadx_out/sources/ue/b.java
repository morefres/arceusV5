package ue;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f32671a = Logger.getLogger(b.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ue.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0592b {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0592b f32672a;
        public static final EnumC0592b b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumC0592b[] f32673c;

        /* renamed from: ue.b$b$a */
        public enum a extends EnumC0592b {
            public a(String str, int i10) {
                super(str, i10);
            }

            @Override // ue.b.EnumC0592b
            public boolean a() {
                return !b.c();
            }
        }

        /* renamed from: ue.b$b$b, reason: collision with other inner class name */
        public enum C0593b extends EnumC0592b {
            public C0593b(String str, int i10) {
                super(str, i10);
            }

            @Override // ue.b.EnumC0592b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f32672a = aVar;
            C0593b c0593b = new C0593b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            b = c0593b;
            f32673c = new EnumC0592b[]{aVar, c0593b};
        }

        public EnumC0592b(String str, int i10) {
        }

        public static EnumC0592b valueOf(String str) {
            return (EnumC0592b) Enum.valueOf(EnumC0592b.class, str);
        }

        public static EnumC0592b[] values() {
            return (EnumC0592b[]) f32673c.clone();
        }

        public abstract boolean a();
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f32671a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return ue.a.a() || b.get();
    }
}
