package com.roblox.universalapp.systemtheme;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.s;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import gt.h;
import gt.i;
import gt.o;
import java.lang.ref.WeakReference;
import ju.a0;
import ju.d2;
import ju.g1;
import ju.h2;
import ju.k;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import ot.m;
import tk.g;
import uk.j;
import zl.t;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00048;3uB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020'H\u0003¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020'2\u0006\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0003¢\u0006\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010:\u001a\n 7*\u0004\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R#\u0010?\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R#\u0010B\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R#\u0010E\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>R#\u0010H\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>R#\u0010K\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010<\u001a\u0004\bJ\u0010>R\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010Y\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010\u0003R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010\\R\u0018\u0010e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010g\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010\\R\u0018\u0010j\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010q\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010s¨\u0006v"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "C", "onDestroy", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;", "listener", "O", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;", "K", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;", "H", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V", "Lorg/json/JSONObject;", "jsonObject", "E", "(Lorg/json/JSONObject;)V", "D", "", "isSystemThemeAvailable", "()Z", "", "getSystemTheme", "()I", "F", "G", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "themeValue", "Q", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;)V", "", "shouldHide", "L", "(Ljava/lang/String;)V", "path", "w", "(Ljava/lang/String;)Ljava/lang/String;", "cookieName", "cookieValue", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lju/p0;", j6.b.f21518e, "Lju/p0;", "handlerScope", "Lcom/roblox/universalapp/messagebus/MessageBus;", "kotlin.jvm.PlatformType", "c", "Lcom/roblox/universalapp/messagebus/MessageBus;", "messageBus", rl.d.f30696a, "Lgt/h;", "B", "()Ljava/lang/String;", "themeUpdatedMessageId", "e", "z", "setThemeMessageId", "f", "A", "themeParamKey", "g", "y", "setClassicThemeActiveMessageId", "h", "x", "setAppIconMessageId", "Landroid/os/HandlerThread;", "i", "Landroid/os/HandlerThread;", "cookieHandlerThread", "Landroid/os/Handler;", "j", "Landroid/os/Handler;", "cookieHandler", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "k", "Ljava/lang/ref/WeakReference;", "getContextRef$annotations", "contextRef", "Lcom/roblox/universalapp/messagebus/Connection;", "l", "Lcom/roblox/universalapp/messagebus/Connection;", "setThemeConn", "m", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;", "themeListener", "n", "setClassicThemeConn", "o", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;", "classicThemeListener", "p", "setAppIconConn", "q", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;", "appIconListener", "Lju/d2;", "r", "Lju/d2;", "handlerJob", "s", "Ljava/lang/Integer;", "lastPublishedSystemTheme", t.f38095d, "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "lastSetTheme", ve.a.f33391e, "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SystemThemeProtocol implements android.view.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SystemThemeProtocol f9874a = new SystemThemeProtocol();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 handlerScope = q0.a(g1.a());

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final MessageBus messageBus = MessageBus.f();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h themeUpdatedMessageId = i.b(new Function0() { // from class: pm.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String U;
            U = SystemThemeProtocol.U();
            return U;
        }
    });

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h setThemeMessageId = i.b(new Function0() { // from class: pm.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String P;
            P = SystemThemeProtocol.P();
            return P;
        }
    });

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h themeParamKey = i.b(new Function0() { // from class: pm.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String T;
            T = SystemThemeProtocol.T();
            return T;
        }
    });

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h setClassicThemeActiveMessageId = i.b(new Function0() { // from class: pm.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String J;
            J = SystemThemeProtocol.J();
            return J;
        }
    });

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h setAppIconMessageId = i.b(new Function0() { // from class: pm.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String I;
            I = SystemThemeProtocol.I();
            return I;
        }
    });

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final HandlerThread cookieHandlerThread;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Handler cookieHandler;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static WeakReference<Context> contextRef;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Connection setThemeConn;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static d themeListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Connection setClassicThemeConn;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static b classicThemeListener;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Connection setAppIconConn;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static a appIconListener;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static d2 handlerJob;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Integer lastPublishedSystemTheme;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static c lastSetTheme;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;", "", "", "name", "", ve.a.f33391e, "(Ljava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(@NotNull String name);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;", "", "", "active", "", ve.a.f33391e, "(Z)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        void a(boolean active);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011j\u0002\b\tj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "", "", "value", "", "themeName", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "", rl.d.f30696a, "()Z", ve.a.f33391e, "I", "c", "()I", j6.b.f21518e, "Ljava/lang/String;", "()Ljava/lang/String;", "e", "f", "g", "h", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        /* renamed from: d, reason: collision with root package name */
        public static final c f9894d = new c("ERROR", 0, 0, "");

        /* renamed from: e, reason: collision with root package name */
        public static final c f9895e = new c("LIGHT", 1, 1, "light");

        /* renamed from: f, reason: collision with root package name */
        public static final c f9896f = new c("DARK", 2, 2, "dark");

        /* renamed from: g, reason: collision with root package name */
        public static final c f9897g = new c("SYSTEM_LIGHT", 3, 3, "light");

        /* renamed from: h, reason: collision with root package name */
        public static final c f9898h = new c("SYSTEM_DARK", 4, 4, "dark");

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ c[] f9899i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ pt.a f9900j;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String themeName;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;", "", "<init>", "()V", "", "value", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", ve.a.f33391e, "(I)Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.roblox.universalapp.systemtheme.SystemThemeProtocol$c$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final c a(int value) {
                c cVar;
                c[] values = c.values();
                int length = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = values[i10];
                    if (cVar.getValue() == value) {
                        break;
                    }
                    i10++;
                }
                return cVar == null ? c.f9894d : cVar;
            }

            public Companion() {
            }
        }

        static {
            c[] a10 = a();
            f9899i = a10;
            f9900j = pt.b.a(a10);
            INSTANCE = new Companion(null);
        }

        public c(String str, int i10, int i11, String str2) {
            this.value = i11;
            this.themeName = str2;
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{f9894d, f9895e, f9896f, f9897g, f9898h};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f9899i.clone();
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getThemeName() {
            return this.themeName;
        }

        /* renamed from: c, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final boolean d() {
            return this == f9897g || this == f9898h;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;", "", "", "themeName", "", ve.a.f33391e, "(Ljava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {
        void a(@NotNull String themeName);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.universalapp.systemtheme.SystemThemeProtocol$onCreate$2", f = "SystemThemeProtocol.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9902t;

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f9902t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            MessageBus messageBus = SystemThemeProtocol.messageBus;
            final SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f9874a;
            SystemThemeProtocol.setThemeConn = messageBus.t(systemThemeProtocol.z(), new Callback() { // from class: pm.j
                @Override // com.roblox.universalapp.messagebus.Callback
                public final void a(JSONObject jSONObject) {
                    SystemThemeProtocol.this.F(jSONObject);
                }
            });
            SystemThemeProtocol.setClassicThemeConn = SystemThemeProtocol.messageBus.t(systemThemeProtocol.y(), new Callback() { // from class: pm.k
                @Override // com.roblox.universalapp.messagebus.Callback
                public final void a(JSONObject jSONObject) {
                    SystemThemeProtocol.this.E(jSONObject);
                }
            });
            SystemThemeProtocol.setAppIconConn = SystemThemeProtocol.messageBus.t(systemThemeProtocol.x(), new Callback() { // from class: pm.l
                @Override // com.roblox.universalapp.messagebus.Callback
                public final void a(JSONObject jSONObject) {
                    SystemThemeProtocol.this.D(jSONObject);
                }
            });
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.universalapp.systemtheme.SystemThemeProtocol$publishSystemThemeUpdatedMessage$1$1", f = "SystemThemeProtocol.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9903t;

        public f(mt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f9903t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            SystemThemeProtocol.messageBus.l(SystemThemeProtocol.f9874a.B(), new JSONObject());
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("CookieThread");
        handlerThread.start();
        cookieHandlerThread = handlerThread;
        cookieHandler = new Handler(handlerThread.getLooper());
    }

    public static final String I() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), "systemThemeSetAppIcon");
    }

    public static final String J() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), "systemThemeSetClassicThemeActive");
    }

    public static final void M(String str, String str2) {
        j.c().g(str, str2, new ValueCallback() { // from class: pm.h
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                SystemThemeProtocol.N((Boolean) obj);
            }
        });
    }

    public static final void N(Boolean bool) {
    }

    public static final String P() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), JNISystemThemeProtocol.getSystemThemeSetThemeMessage());
    }

    public static final void R(String str, String str2) {
        j.c().g(str, str2, new ValueCallback() { // from class: pm.i
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                SystemThemeProtocol.S((Boolean) obj);
            }
        });
    }

    public static final void S(Boolean bool) {
    }

    public static final String T() {
        return JNISystemThemeProtocol.getSystemThemeParamKey();
    }

    public static final String U() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), JNISystemThemeProtocol.getSystemThemeUpdatedMessage());
    }

    @Keep
    public static final int getSystemTheme() {
        Context context;
        WeakReference<Context> weakReference = contextRef;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return c.f9894d.getValue();
        }
        int i10 = context.getResources().getConfiguration().uiMode & 48;
        return i10 != 16 ? i10 != 32 ? c.f9894d.getValue() : c.f9898h.getValue() : c.f9897g.getValue();
    }

    @Keep
    public static final boolean isSystemThemeAvailable() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static final String v(String cookieName, String cookieValue, String path) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cookieName + "=" + cookieValue);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; Path=");
        sb3.append(path);
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public static final String w(String path) {
        String str;
        tk.b c10 = g.c();
        if (c10 == null || (str = c10.f32268a) == null) {
            return null;
        }
        return "www." + str + path;
    }

    public final String A() {
        return (String) themeParamKey.getValue();
    }

    public final String B() {
        return (String) themeUpdatedMessageId.getValue();
    }

    public final void C() {
        G();
    }

    public final void D(JSONObject jsonObject) {
        a aVar;
        Object opt = jsonObject.opt("AppIconName");
        String str = opt instanceof String ? (String) opt : null;
        if (str == null || (aVar = appIconListener) == null) {
            return;
        }
        aVar.a(str);
    }

    public final void E(JSONObject jsonObject) {
        boolean optBoolean = jsonObject.optBoolean("ClassicThemeActive", false);
        b bVar = classicThemeListener;
        if (bVar != null) {
            bVar.a(optBoolean);
        }
    }

    public final void F(JSONObject jsonObject) {
        String optString = jsonObject.optString(A());
        Intrinsics.checkNotNull(optString);
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            c a10 = c.INSTANCE.a(intOrNull.intValue());
            if (a10 != null) {
                lastSetTheme = a10;
                SystemThemeProtocol systemThemeProtocol = f9874a;
                systemThemeProtocol.Q(a10);
                systemThemeProtocol.L("True");
                d dVar = themeListener;
                if (dVar != null) {
                    dVar.a(a10.getThemeName());
                }
            }
        }
    }

    public final void G() {
        c cVar = lastSetTheme;
        if (cVar == null || cVar.d()) {
            int systemTheme = getSystemTheme();
            Integer num = lastPublishedSystemTheme;
            if (num != null && num.intValue() == systemTheme) {
                return;
            }
            lastPublishedSystemTheme = Integer.valueOf(systemTheme);
            d2 d2Var = handlerJob;
            if (d2Var != null) {
                k.d(handlerScope, d2Var, null, new f(null), 2, null);
            }
        }
    }

    public final void H(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        appIconListener = listener;
    }

    public final void K(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        classicThemeListener = listener;
    }

    public final void L(String shouldHide) {
        final String w5 = w("/my/account");
        if (w5 == null) {
            return;
        }
        final String v5 = v("RBXHideThemeSetting", shouldHide, "/my/account");
        cookieHandler.post(new Runnable() { // from class: pm.g
            @Override // java.lang.Runnable
            public final void run() {
                SystemThemeProtocol.M(w5, v5);
            }
        });
    }

    public final void O(@NotNull d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        themeListener = listener;
    }

    public final void Q(c themeValue) {
        final String w5 = w("/");
        if (w5 == null) {
            return;
        }
        final String v5 = v("RBXThemeOverride", themeValue.getThemeName(), "/");
        cookieHandler.post(new Runnable() { // from class: pm.f
            @Override // java.lang.Runnable
            public final void run() {
                SystemThemeProtocol.R(w5, v5);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.f
    public void onCreate(@NotNull s owner) {
        a0 b10;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Context context = owner instanceof Context ? (Context) owner : null;
        contextRef = context != null ? new WeakReference<>(context) : null;
        b10 = h2.b(null, 1, null);
        handlerJob = b10;
        k.d(handlerScope, b10, null, new e(null), 2, null);
    }

    @Override // android.view.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        contextRef = null;
        themeListener = null;
        classicThemeListener = null;
        appIconListener = null;
        Connection connection = setThemeConn;
        if (connection != null) {
            connection.a();
        }
        Connection connection2 = setClassicThemeConn;
        if (connection2 != null) {
            connection2.a();
        }
        Connection connection3 = setAppIconConn;
        if (connection3 != null) {
            connection3.a();
        }
        d2 d2Var = handlerJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        handlerJob = null;
    }

    @Override // android.view.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // android.view.f
    public void onResume(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        G();
    }

    @Override // android.view.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }

    public final String x() {
        return (String) setAppIconMessageId.getValue();
    }

    public final String y() {
        return (String) setClassicThemeActiveMessageId.getValue();
    }

    public final String z() {
        return (String) setThemeMessageId.getValue();
    }
}
