package com.roblox.engine.jni.model;

import com.roblox.engine.jni.model.NativeInitCrashpadParams;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends NativeInitCrashpadParams {

    /* renamed from: a, reason: collision with root package name */
    public final String f9711a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9712c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9713d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9714e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9715f;

    /* renamed from: g, reason: collision with root package name */
    public final List<String> f9716g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9717h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9718i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f9719j;

    /* renamed from: com.roblox.engine.jni.model.a$a, reason: collision with other inner class name */
    public static final class C0156a extends NativeInitCrashpadParams.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f9720a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public String f9721c;

        /* renamed from: d, reason: collision with root package name */
        public String f9722d;

        /* renamed from: e, reason: collision with root package name */
        public String f9723e;

        /* renamed from: f, reason: collision with root package name */
        public String f9724f;

        /* renamed from: g, reason: collision with root package name */
        public List<String> f9725g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f9726h;

        /* renamed from: i, reason: collision with root package name */
        public String f9727i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f9728j;

        /* renamed from: k, reason: collision with root package name */
        public byte f9729k;

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams a() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            List<String> list;
            String str7;
            if (this.f9729k == 3 && (str = this.f9720a) != null && (str2 = this.b) != null && (str3 = this.f9721c) != null && (str4 = this.f9722d) != null && (str5 = this.f9723e) != null && (str6 = this.f9724f) != null && (list = this.f9725g) != null && (str7 = this.f9727i) != null) {
                return new a(str, str2, str3, str4, str5, str6, list, this.f9726h, str7, this.f9728j);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9720a == null) {
                sb2.append(" appVersion");
            }
            if (this.b == null) {
                sb2.append(" baseUrl");
            }
            if (this.f9721c == null) {
                sb2.append(" countName");
            }
            if (this.f9722d == null) {
                sb2.append(" uploadUrl");
            }
            if (this.f9723e == null) {
                sb2.append(" token");
            }
            if (this.f9724f == null) {
                sb2.append(" handlerClassName");
            }
            if (this.f9725g == null) {
                sb2.append(" envArgs");
            }
            if ((this.f9729k & 1) == 0) {
                sb2.append(" isAtLeastQ");
            }
            if (this.f9727i == null) {
                sb2.append(" buildVariant");
            }
            if ((this.f9729k & 2) == 0) {
                sb2.append(" collectLogcat");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null appVersion");
            }
            this.f9720a = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null baseUrl");
            }
            this.b = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVariant");
            }
            this.f9727i = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder f(boolean z10) {
            this.f9728j = z10;
            this.f9729k = (byte) (this.f9729k | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder g(String str) {
            if (str == null) {
                throw new NullPointerException("Null countName");
            }
            this.f9721c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder h(List<String> list) {
            if (list == null) {
                throw new NullPointerException("Null envArgs");
            }
            this.f9725g = list;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder i(String str) {
            if (str == null) {
                throw new NullPointerException("Null handlerClassName");
            }
            this.f9724f = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder j(boolean z10) {
            this.f9726h = z10;
            this.f9729k = (byte) (this.f9729k | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder k(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f9723e = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder l(String str) {
            if (str == null) {
                throw new NullPointerException("Null uploadUrl");
            }
            this.f9722d = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String appVersion() {
        return this.f9711a;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String baseUrl() {
        return this.b;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String buildVariant() {
        return this.f9718i;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean collectLogcat() {
        return this.f9719j;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String countName() {
        return this.f9712c;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public List<String> envArgs() {
        return this.f9716g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NativeInitCrashpadParams) {
            NativeInitCrashpadParams nativeInitCrashpadParams = (NativeInitCrashpadParams) obj;
            if (this.f9711a.equals(nativeInitCrashpadParams.appVersion()) && this.b.equals(nativeInitCrashpadParams.baseUrl()) && this.f9712c.equals(nativeInitCrashpadParams.countName()) && this.f9713d.equals(nativeInitCrashpadParams.uploadUrl()) && this.f9714e.equals(nativeInitCrashpadParams.token()) && this.f9715f.equals(nativeInitCrashpadParams.handlerClassName()) && this.f9716g.equals(nativeInitCrashpadParams.envArgs()) && this.f9717h == nativeInitCrashpadParams.isAtLeastQ() && this.f9718i.equals(nativeInitCrashpadParams.buildVariant()) && this.f9719j == nativeInitCrashpadParams.collectLogcat()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String handlerClassName() {
        return this.f9715f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f9711a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f9712c.hashCode()) * 1000003) ^ this.f9713d.hashCode()) * 1000003) ^ this.f9714e.hashCode()) * 1000003) ^ this.f9715f.hashCode()) * 1000003) ^ this.f9716g.hashCode()) * 1000003) ^ (this.f9717h ? 1231 : 1237)) * 1000003) ^ this.f9718i.hashCode()) * 1000003) ^ (this.f9719j ? 1231 : 1237);
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean isAtLeastQ() {
        return this.f9717h;
    }

    public String toString() {
        return "NativeInitCrashpadParams{appVersion=" + this.f9711a + ", baseUrl=" + this.b + ", countName=" + this.f9712c + ", uploadUrl=" + this.f9713d + ", token=" + this.f9714e + ", handlerClassName=" + this.f9715f + ", envArgs=" + this.f9716g + ", isAtLeastQ=" + this.f9717h + ", buildVariant=" + this.f9718i + ", collectLogcat=" + this.f9719j + "}";
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String token() {
        return this.f9714e;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String uploadUrl() {
        return this.f9713d;
    }

    private a(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, boolean z10, String str7, boolean z11) {
        this.f9711a = str;
        this.b = str2;
        this.f9712c = str3;
        this.f9713d = str4;
        this.f9714e = str5;
        this.f9715f = str6;
        this.f9716g = list;
        this.f9717h = z10;
        this.f9718i = str7;
        this.f9719j = z11;
    }
}
