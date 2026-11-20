.class public final Lcom/roblox/client/startup/NativeHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/startup/NativeHelper$a;,
        Lcom/roblox/client/startup/NativeHelper$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u0090\u00012\u00020\u0001:\u0001[B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u000eJ/\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000c2\u0006\u0010\"\u001a\u00020!H\u0007\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010%\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008%\u0010\u000eJ\u000f\u0010&\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008&\u0010\u000eJ\u0017\u0010)\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\'H\u0007\u00a2\u0006\u0004\u0008)\u0010*J\u001f\u0010.\u001a\u00020\u000c2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,H\u0007\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00101\u001a\u00020\u000c2\u0006\u00100\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u00081\u00102J\u0017\u00104\u001a\u00020\u000c2\u0006\u00103\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u00084\u00102J\u000f\u00105\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u00085\u0010\u000eJ\u0017\u00106\u001a\u00020\u000c2\u0006\u00100\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u00086\u00102J\u0017\u00107\u001a\u00020\u000c2\u0006\u00100\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u00087\u00102J\u0017\u00108\u001a\u00020\u000c2\u0006\u00100\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u00088\u00102J\u000f\u00109\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u00089\u0010\u000eJ\u000f\u0010:\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008:\u0010\u000eJ\u000f\u0010;\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008;\u0010\u000eJ\u0017\u0010>\u001a\u00020\u000c2\u0006\u0010=\u001a\u00020<H\u0007\u00a2\u0006\u0004\u0008>\u0010?J\u000f\u0010@\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008@\u0010\u000eJ\u000f\u0010A\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008A\u0010\u000eJ/\u0010H\u001a\u00020\u000c2\u0006\u0010B\u001a\u00020\'2\u0006\u0010C\u001a\u00020,2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0007\u00a2\u0006\u0004\u0008H\u0010IJ\u000f\u0010J\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008J\u0010\u000eJ\u0017\u0010L\u001a\u00020\u000c2\u0006\u0010K\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u0008L\u00102J\u000f\u0010M\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008M\u0010\u000eJ\u0017\u0010O\u001a\u00020\u000c2\u0006\u0010N\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u0008O\u00102J/\u0010T\u001a\u00020\u000c2\u0006\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010R\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u0008T\u0010UJ\u0017\u0010X\u001a\u00020\u000c2\u0006\u0010W\u001a\u00020VH\u0007\u00a2\u0006\u0004\u0008X\u0010YJ\u000f\u0010Z\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008Z\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008d\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0016\u0010m\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\u0016\u0010o\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008n\u0010lR\u0016\u0010q\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008p\u0010lR\u0016\u0010s\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010lR\u0016\u0010u\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010lR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010\u007fR\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001\u00a8\u0006\u0091\u0001"
    }
    d2 = {
        "Lcom/roblox/client/startup/NativeHelper;",
        "",
        "Lcom/roblox/client/startup/MainGameActivity;",
        "activity",
        "Leh/i;",
        "upgradeDialog",
        "Lsg/a;",
        "adsHelper",
        "Lju/l0;",
        "ioDispatcher",
        "<init>",
        "(Lcom/roblox/client/startup/MainGameActivity;Leh/i;Lsg/a;Lju/l0;)V",
        "",
        "o0",
        "()V",
        "m0",
        "h0",
        "G",
        "e0",
        "",
        "contentViewId",
        "Landroid/view/SurfaceView;",
        "surfaceView",
        "Lcom/roblox/client/RbxKeyboard;",
        "rbxEditText",
        "Lkk/f$f;",
        "inputAdapter",
        "n0",
        "(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Lkk/f$f;)V",
        "",
        "",
        "gameActivity_getShellFlagKeys",
        "()[Ljava/lang/String;",
        "Ljava/nio/ByteBuffer;",
        "flagsBuffer",
        "gameActivity_onFlagsLoaded",
        "(Ljava/nio/ByteBuffer;)V",
        "gameActivity_onFlagsFailed",
        "gameActivity_onEngineInitialized",
        "",
        "placeId",
        "gameActivity_onGameLoaded",
        "(J)V",
        "orientation",
        "",
        "inExperience",
        "gameActivity_onScreenOrientationChanged",
        "(IZ)V",
        "data",
        "gameActivity_onGameStreamingStatusChanged",
        "(Ljava/lang/String;)V",
        "motionType",
        "gameActivity_onMotionEventListening",
        "gameActivity_onLuaAppDidReturn",
        "gameActivity_onDidLogInReceived",
        "gameActivity_onDidSignUp",
        "gameActivity_onAppReady",
        "gameActivity_onDidLogOutReceived",
        "gameActivity_onDidSwitchAccountReceived",
        "gameActivity_onExperienceStart",
        "",
        "timeInMs",
        "gameActivity_onExperienceStop",
        "(D)V",
        "gameActivity_onRestartLuaApp",
        "gameActivity_onScanQrCode",
        "textBox",
        "showNativeInput",
        "",
        "byteArrayFromTextBox",
        "Lcom/roblox/engine/jni/model/NativeTextBoxInfo;",
        "textBoxInfo",
        "gameActivity_showKeyboard",
        "(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V",
        "gameActivity_hideKeyboard",
        "value",
        "gameActivity_onLuaTextBoxChanged",
        "gameActivity_onLuaTextBoxPropertyChanged",
        "path",
        "gameActivity_onScreenshotReady",
        "result",
        "upgradeStatusCode",
        "apkUrl",
        "apkCheckSum",
        "gameActivity_setAppUpgradeStatus",
        "(IILjava/lang/String;Ljava/lang/String;)V",
        "Loh/j;",
        "event",
        "onCodeParsedFromSMS",
        "(Loh/j;)V",
        "g0",
        "a",
        "Lcom/roblox/client/startup/MainGameActivity;",
        "b",
        "Leh/i;",
        "c",
        "Lsg/a;",
        "d",
        "Lju/l0;",
        "Lkk/f;",
        "e",
        "Lkk/f;",
        "inputListener",
        "Luh/x0;",
        "f",
        "Luh/x0;",
        "overlayEditTextController",
        "g",
        "Z",
        "isVisible",
        "h",
        "isForeground",
        "i",
        "isEngineInitialized",
        "j",
        "isInExperience",
        "k",
        "enableConnectivityV2ForAndroid",
        "Lyg/a;",
        "l",
        "Lyg/a;",
        "rtcAudioManager",
        "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;",
        "m",
        "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;",
        "appHangMonitor",
        "n",
        "I",
        "Landroidx/lifecycle/p;",
        "o",
        "Landroidx/lifecycle/p;",
        "lifecycleEventObserver",
        "Lti/e$e;",
        "p",
        "Lti/e$e;",
        "notificationObserver",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;",
        "q",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;",
        "webViewUserAgentGetter",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;",
        "r",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;",
        "mobileAdvertisingIdGetter",
        "s",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final s:Lcom/roblox/client/startup/NativeHelper$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final t:Luk/h$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/roblox/client/startup/MainGameActivity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Leh/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lsg/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lju/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Lkk/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:Luh/x0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public volatile k:Z

.field public l:Lyg/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public n:I

.field public final o:Landroidx/lifecycle/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Lti/e$e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q:Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r:Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/startup/NativeHelper$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/startup/NativeHelper$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/startup/NativeHelper;->s:Lcom/roblox/client/startup/NativeHelper$a;

    new-instance v0, Lyj/j2;

    invoke-direct {v0}, Lyj/j2;-><init>()V

    sput-object v0, Lcom/roblox/client/startup/NativeHelper;->t:Luk/h$d;

    return-void
.end method

.method public constructor <init>(Lcom/roblox/client/startup/MainGameActivity;Leh/i;Lsg/a;Lju/l0;)V
    .locals 1
    .param p1    # Lcom/roblox/client/startup/MainGameActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leh/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lsg/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lju/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upgradeDialog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    .line 3
    iput-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->b:Leh/i;

    .line 4
    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->c:Lsg/a;

    .line 5
    iput-object p4, p0, Lcom/roblox/client/startup/NativeHelper;->d:Lju/l0;

    .line 6
    new-instance p2, Lyj/x1;

    invoke-direct {p2, p0}, Lyj/x1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    iput-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->o:Landroidx/lifecycle/p;

    .line 7
    new-instance p3, Lyj/y1;

    invoke-direct {p3}, Lyj/y1;-><init>()V

    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->p:Lti/e$e;

    .line 8
    new-instance p3, Lyj/z1;

    invoke-direct {p3, p0}, Lyj/z1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->q:Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;

    .line 9
    new-instance p3, Lyj/a2;

    invoke-direct {p3}, Lyj/a2;-><init>()V

    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->r:Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;

    .line 10
    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/roblox/client/startup/MainGameActivity;Leh/i;Lsg/a;Lju/l0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 11
    invoke-static {}, Lju/g1;->b()Lju/l0;

    move-result-object p4

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/client/startup/NativeHelper;-><init>(Lcom/roblox/client/startup/MainGameActivity;Leh/i;Lsg/a;Lju/l0;)V

    return-void
.end method

.method public static synthetic A(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->T(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic B(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->M(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic C(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->R(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic D()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/NativeHelper;->p0()V

    return-void
.end method

.method public static final synthetic E(Lcom/roblox/client/startup/NativeHelper;)Lcom/roblox/client/startup/MainGameActivity;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    return-object p0
.end method

.method public static final synthetic F(Lcom/roblox/client/startup/NativeHelper;)Leh/i;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->b:Leh/i;

    return-object p0
.end method

.method public static final H(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->f:Luh/x0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Luh/x0;->a()V

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->G()V

    return-void
.end method

.method public static final I(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->p2()V

    return-void
.end method

.method public static final J(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {v0}, Lyj/k0;->s(Landroid/content/Context;)Lyj/k0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lyj/k0;->H(Ljava/lang/String;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->R3()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lti/b;->f()Lti/b;

    move-result-object p1

    invoke-virtual {p1}, Lti/b;->h()V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->o0()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->m0()V

    return-void
.end method

.method public static final K(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 3

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->S1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    invoke-virtual {v0}, Lti/h;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lti/b;->f()Lti/b;

    move-result-object v0

    sget-object v1, Lti/b$d;->b:Lti/b$d;

    invoke-virtual {v0, v1}, Lti/b;->o(Lti/b$d;)V

    invoke-static {}, Luk/j;->c()Luk/j;

    move-result-object v0

    invoke-static {}, Lrg/a1;->O()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lrg/a1;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Luk/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    invoke-virtual {v0}, Lti/h;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lti/b;->f()Lti/b;

    move-result-object v0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    sget-object v1, Lti/b$d;->b:Lti/b$d;

    invoke-virtual {v0, p0, v1}, Lti/b;->i(Landroid/app/Activity;Lti/b$d;)V

    :cond_1
    return-void
.end method

.method public static final L(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Lyj/k0;->s(Landroid/content/Context;)Lyj/k0;

    move-result-object p0

    invoke-virtual {p0, p1}, Lyj/k0;->I(Ljava/lang/String;)V

    return-void
.end method

.method public static final M(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-static {}, Lti/b;->f()Lti/b;

    move-result-object v0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, p0}, Lti/b;->j(Landroid/app/Activity;)V

    return-void
.end method

.method public static final N(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->h0()V

    return-void
.end method

.method public static final O(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->G()V

    invoke-static {}, Lfm/b;->h()Lfm/b;

    move-result-object v0

    invoke-virtual {v0}, Lfm/b;->e()V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->d()Lti/d;

    move-result-object v0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, p0}, Lti/d;->c(Landroid/content/Context;)V

    invoke-static {}, Lel/a;->b()Lel/a;

    move-result-object p0

    invoke-virtual {p0}, Lel/a;->e()V

    return-void
.end method

.method public static final P(Lcom/roblox/client/startup/NativeHelper;D)V
    .locals 2

    invoke-static {}, Lfm/b;->h()Lfm/b;

    move-result-object v0

    invoke-virtual {v0}, Lfm/b;->f()V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->d()Lti/d;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    double-to-long p1, p1

    invoke-virtual {v0, v1, p1, p2}, Lti/d;->e(Landroid/content/Context;J)V

    iget-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    if-eqz p1, :cond_0

    invoke-static {}, Lel/a;->b()Lel/a;

    move-result-object p1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p0}, Lel/a;->d(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public static final Q(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V
    .locals 6

    invoke-static {p0}, Lyj/r2;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeSetAppPreviousExitReasons(Ljava/util/List;)V

    invoke-static {}, Lug/e;->h()Lug/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lug/e;->i(Landroid/content/Context;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->G2()Z

    move-result v0

    const/4 v1, 0x2

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    const-string v5, "fmod_init_begin"

    invoke-static {v5, v2, v3, v1, v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_0
    iget-object v5, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {v5}, Lorg/fmod/FMOD;->init(Landroid/content/Context;)V

    if-eqz v0, :cond_1

    const-string v0, "fmod_init_end"

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_1
    invoke-static {}, Lrg/a1;->V0()V

    iget-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {v0}, Lek/z;->e(Landroid/content/Context;)Lek/z;

    move-result-object v0

    invoke-virtual {v0}, Lek/z;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetPreferencesFile(Ljava/lang/String;)V

    invoke-static {}, Loi/b;->f()Loi/b;

    move-result-object v0

    iget-object v1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, v1}, Loi/b;->m(Landroid/content/Context;)V

    invoke-static {p0}, Lyj/k0;->w(Landroid/content/Context;)V

    iget-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-nez v0, :cond_3

    new-instance v0, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-direct {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;-><init>()V

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->c()V

    iget-boolean v1, p1, Lcom/roblox/client/startup/NativeHelper;->g:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->b()V

    :cond_2
    iput-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    :cond_3
    iget-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Lcom/roblox/client/startup/MainGameActivity;->j2()V

    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object v0

    invoke-virtual {v0}, Lim/f;->v()V

    invoke-static {}, Lpl/j;->j()Lpl/j;

    move-result-object v0

    invoke-virtual {v0}, Lpl/j;->f()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0, p0}, Lpl/j;->i(Landroid/content/Context;)V

    :cond_4
    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->d()Lti/d;

    move-result-object v0

    iget-object v1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, v1}, Lti/d;->a(Landroid/content/Context;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->r2()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, v4}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    :cond_5
    invoke-static {v4}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetExternalDirectory(Ljava/lang/String;)V

    :cond_6
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->O5()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0}, Lbi/i;->m(Landroid/content/Context;)V

    :cond_7
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->S4()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {p0}, Lmh/c;->c(Landroid/content/Context;)V

    :cond_8
    return-void
.end method

.method public static final R(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->G()V

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->p2()V

    :cond_0
    invoke-static {}, Lcom/roblox/client/startup/a;->n()V

    return-void
.end method

.method public static final S(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->f:Luh/x0;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Luh/x0;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final T(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->f:Luh/x0;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Luh/x0;->c()V

    :cond_0
    return-void
.end method

.method public static final U(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->e:Lkk/f;

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lkk/f;->H(Z)V

    :cond_0
    return-void
.end method

.method public static final V(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    return-void
.end method

.method public static final W(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    iget p0, p0, Lcom/roblox/client/startup/NativeHelper;->n:I

    invoke-static {v0, p0}, Lpj/f;->f(Le4/q;I)V

    return-void
.end method

.method public static final X(Lcom/roblox/client/startup/NativeHelper;I)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public static final Y(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lti/g;->b()Lti/g;

    move-result-object p0

    const-string p2, "Android-AppLogin-BrowserTracker-Failed"

    invoke-virtual {p0, p2}, Lti/g;->q(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roblox/client/startup/NativeHelper;->e0()V

    return-void

    :cond_0
    new-instance p0, Lcom/roblox/client/d$e;

    invoke-direct {p0}, Lcom/roblox/client/d$e;-><init>()V

    const/4 p1, 0x1

    if-eq p2, p1, :cond_2

    const/4 p1, 0x2

    if-eq p2, p1, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/d$e;->f()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/roblox/client/d$e;->e()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/roblox/client/d$e;->d()V

    :goto_0
    iput-object p3, p0, Lcom/roblox/client/d$e;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/client/d$e;->c:Ljava/lang/String;

    invoke-static {}, Lti/g;->b()Lti/g;

    move-result-object p1

    const-string p2, "Android-AppLogin-BrowserTracker-Success"

    invoke-virtual {p1, p2}, Lti/g;->q(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/roblox/client/d$e;->b()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lcom/roblox/client/d$e;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    return-void

    :cond_4
    :goto_1
    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/roblox/client/d;->g(Lcom/roblox/client/d$e;)V

    return-void
.end method

.method public static final Z([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 2

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "UTF_8"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    move-wide p1, p2

    move p3, p4

    new-instance p4, Ljava/lang/String;

    invoke-direct {p4, p0, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iget-object p0, v1, Lcom/roblox/client/startup/NativeHelper;->f:Luh/x0;

    if-eqz p0, :cond_0

    invoke-interface/range {p0 .. p5}, Luh/x0;->b(JZLjava/lang/String;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    :cond_0
    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/NativeHelper;->c0()V

    return-void
.end method

.method public static final a0(Lcom/roblox/client/startup/NativeHelper;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 5

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateChanged: event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/startup/NativeHelper$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lgt/l;

    invoke-direct {p0}, Lgt/l;-><init>()V

    throw p0

    :pswitch_0
    const-string p1, "Disposing RTC audio manager."

    invoke-static {v1, p1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->l:Lyg/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lyg/a;->a()V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->l:Lyg/a;

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->c:Lsg/a;

    invoke-virtual {p0}, Lsg/a;->e()V

    return-void

    :pswitch_1
    iput-boolean v3, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lev/c;->p(Ljava/lang/Object;)V

    invoke-static {}, Lnm/a;->c()Lnm/a;

    move-result-object p1

    invoke-virtual {p1}, Lnm/a;->b()V

    invoke-static {}, Lti/e;->c()Lti/e;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->p:Lti/e$e;

    invoke-virtual {p1, v0}, Lti/e;->g(Lti/e$e;)V

    sget-object p1, Lcom/roblox/client/startup/NativeHelper;->s:Lcom/roblox/client/startup/NativeHelper$a;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1, v0, p2}, Lcom/roblox/client/startup/NativeHelper$a;->a(Lcom/roblox/client/startup/NativeHelper$a;Landroid/app/Activity;Landroidx/lifecycle/l$a;)V

    invoke-static {}, Luk/h;->j()Luk/h;

    move-result-object p1

    sget-object p2, Lcom/roblox/client/startup/NativeHelper;->t:Luk/h$d;

    invoke-virtual {p1, p2}, Luk/h;->m(Luk/h$d;)V

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->a()V

    :cond_1
    invoke-static {}, Lfm/b;->h()Lfm/b;

    move-result-object p0

    invoke-virtual {p0}, Lfm/b;->f()V

    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object p0

    invoke-virtual {p0}, Lim/f;->H()V

    return-void

    :pswitch_2
    iput-boolean v3, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Lkk/f;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lkk/f;->I()V

    :cond_2
    invoke-static {}, Lel/a;->b()Lel/a;

    move-result-object p1

    invoke-virtual {p1}, Lel/a;->e()V

    invoke-static {}, Lwl/c;->i()Lwl/c;

    move-result-object p1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p0}, Lwl/c;->k(Landroid/content/Context;)V

    invoke-static {}, Lcm/a;->k()Lcm/a;

    move-result-object p0

    invoke-virtual {p0}, Lcm/a;->m()V

    return-void

    :pswitch_3
    iput-boolean v2, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->G()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->m0()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->h0()V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Lkk/f;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v3}, Lkk/f;->H(Z)V

    :cond_3
    sget-object p1, Lcom/roblox/client/startup/NativeHelper;->s:Lcom/roblox/client/startup/NativeHelper$a;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1, v0, p2}, Lcom/roblox/client/startup/NativeHelper$a;->a(Lcom/roblox/client/startup/NativeHelper$a;Landroid/app/Activity;Landroidx/lifecycle/l$a;)V

    invoke-static {}, Lwl/c;->i()Lwl/c;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p2}, Lwl/c;->j(Landroid/content/Context;)V

    invoke-static {}, Lcm/a;->k()Lcm/a;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Landroid/content/Intent;

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    const-class v1, Lcom/roblox/client/ShareAppChosenReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Lyj/f2;

    invoke-direct {p0}, Lyj/f2;-><init>()V

    const/16 v1, 0x4e9c

    invoke-virtual {p1, p2, v0, v1, p0}, Lcm/a;->l(Lj/b;Landroid/content/Intent;ILcm/a$g;)V

    return-void

    :pswitch_4
    iput-boolean v2, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    invoke-static {}, Lnm/a;->c()Lnm/a;

    move-result-object p1

    invoke-virtual {p1}, Lnm/a;->a()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->o0()V

    invoke-static {}, Luk/h;->j()Luk/h;

    move-result-object p1

    sget-object p2, Lcom/roblox/client/startup/NativeHelper;->t:Luk/h$d;

    invoke-virtual {p1, p2}, Luk/h;->k(Luk/h$d;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->S1()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Luk/e;->o()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Luk/h;->j()Luk/h;

    move-result-object p1

    invoke-static {}, Lrg/a1;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Luk/h;->n(Ljava/lang/String;)V

    :cond_4
    invoke-static {}, Lti/g;->b()Lti/g;

    move-result-object p1

    invoke-virtual {p1}, Lti/g;->i0()V

    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lev/c;->n(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->b()V

    :cond_5
    invoke-static {}, Lfm/b;->h()Lfm/b;

    move-result-object p1

    invoke-virtual {p1}, Lfm/b;->e()V

    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object p1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p0}, Lim/f;->G(Landroid/content/Context;)V

    return-void

    :pswitch_5
    invoke-static {}, Loi/b;->f()Loi/b;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Loi/b;->u(Landroid/content/Context;)V

    new-instance p2, Lli/a;

    invoke-direct {p2}, Lli/a;-><init>()V

    invoke-static {p2}, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->setImplementation(Lnk/a;)V

    invoke-static {}, Lti/e;->c()Lti/e;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lti/e;->d(Landroid/content/Context;)V

    const-string p2, "Initializing RTC audio manager."

    invoke-static {v1, p2}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Lrg/y;->c(Landroid/content/Context;)Lyg/a;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-interface {p2, v0}, Lyg/a;->b(Lj/b;)V

    iput-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->l:Lyg/a;

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p2

    invoke-interface {p2}, Lrh/i;->R3()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {}, Lti/b;->m()Z

    move-result p2

    if-nez p2, :cond_6

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    const/16 v0, 0x2000

    invoke-virtual {p2, v0}, Landroid/view/Window;->addFlags(I)V

    :cond_6
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p2

    invoke-interface {p2}, Lrh/i;->O5()Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p2

    sget-object v0, Lbi/i;->a:Lbi/i;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_7
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p2

    invoke-interface {p2}, Lrh/i;->r5()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p2

    invoke-interface {p2}, Lrh/i;->p2()Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p2

    sget-object v0, Ldl/g;->a:Ldl/g;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    goto :goto_0

    :cond_8
    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p2

    sget-object v0, Ldl/d;->a:Ldl/d;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_9
    :goto_0
    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->o()Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->l(Le/p;)V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object p2

    invoke-virtual {p2}, Lrg/y;->g()Lgm/f;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lgm/f;->n(Le/p;)V

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->q:Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->r:Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object p2

    invoke-virtual {p2}, Ldk/c;->m()V

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->c:Lsg/a;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lsg/a;->d(Lj/b;)V

    invoke-static {}, Lqh/k;->a()Z

    move-result p2

    if-eqz p2, :cond_a

    new-instance p2, Lkotlin/Pair;

    new-instance v0, Lqh/a;

    const/4 v2, 0x3

    const-wide/16 v3, 0x7d0

    invoke-direct {v0, v2, v3, v4}, Lqh/a;-><init>(IJ)V

    const-string v2, "webrtcsdk"

    invoke-direct {p2, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lkotlin/collections/j0;->g(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Lqh/h;->r(Ljava/util/Map;)V

    const-string p2, "Requesting WebRTC SDK module download immediately."

    invoke-static {v1, p2}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v2}, Lqh/h;->m(Ljava/lang/String;)V

    :cond_a
    invoke-static {}, Lek/v;->b()Z

    move-result p2

    if-eqz p2, :cond_b

    sget-object p2, Lqh/h;->a:Lqh/h;

    invoke-static {p2, v1}, Lek/v;->a(Lqh/h;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object p2, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_b
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->V2()Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object p2, Luh/v0;->a:Luh/v0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_c
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->Q()Z

    move-result p1

    if-nez p1, :cond_d

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->c5()Z

    move-result p1

    if-eqz p1, :cond_e

    :cond_d
    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object p2, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->INSTANCE:Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_e
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->k1()Z

    move-result p1

    if-eqz p1, :cond_f

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p0

    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_f
    :pswitch_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_6
    .end packed-switch
.end method

.method public static synthetic b(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/roblox/client/startup/NativeHelper;->Y(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final b0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lxj/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->L(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final c0()V
    .locals 1

    invoke-static {}, Lek/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setMobileAdvertisingId(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->K(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final d0(ILandroid/os/Bundle;)V
    .locals 1

    const/4 p1, 0x2

    const-string v0, "NativeHelper"

    if-eq p0, p1, :cond_1

    const/16 p1, 0x65

    if-eq p0, p1, :cond_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Unhandled notificationId"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    const-string p0, "handleNotification: Start PlaceID event..."

    invoke-static {v0, p0}, Lek/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Error: Notification \'Start PlaceID\' still needs to be handled."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-string p0, "handleNotification: Logout event. Do nothing."

    invoke-static {v0, p0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic e(Lcom/roblox/client/startup/NativeHelper;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->X(Lcom/roblox/client/startup/NativeHelper;I)V

    return-void
.end method

.method public static synthetic f(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->J(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final f0(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 2

    invoke-static {}, Lug/e;->h()Lug/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lug/e;->i(Landroid/content/Context;)V

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->I()V

    return-void
.end method

.method public static synthetic g(Lcom/roblox/client/startup/NativeHelper;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/client/startup/NativeHelper;->a0(Lcom/roblox/client/startup/NativeHelper;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V

    return-void
.end method

.method public static synthetic h(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->U(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic i()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/NativeHelper;->i0()V

    return-void
.end method

.method public static final i0()V
    .locals 2

    const-string v0, "NativeHelper"

    const-string v1, "Requesting permissions for MediaPickerProtocol"

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->k()Lmm/k;

    move-result-object v0

    sget-object v1, Lmm/n;->h:Lmm/n;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmm/k;->Z([Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic j(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->S(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final j0(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Lyj/e2;

    invoke-direct {v0, p1}, Lyj/e2;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic k(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->I(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final k0(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lml/a;->b:Lml/a$a;

    invoke-virtual {v0, p0}, Lml/a$a;->a(Ljava/lang/String;)Lml/a;

    move-result-object p0

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Ldk/c;->u(Lml/a;)V

    return-void
.end method

.method public static synthetic l(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->j0(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final l0(Lcom/roblox/client/startup/NativeHelper;Z)V
    .locals 1

    sget-object v0, Lni/c;->a:Lni/c;

    invoke-virtual {v0, p1}, Lni/c;->j(Z)V

    sget-object v0, Lni/b;->a:Lni/b;

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, p0, p1}, Lni/b;->b(Landroid/app/Activity;Z)V

    return-void
.end method

.method public static synthetic m(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->f0(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic n(ILandroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->d0(ILandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic o(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->H(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic p(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->k0(Ljava/lang/String;)V

    return-void
.end method

.method public static final p0()V
    .locals 2

    const-string v0, "NativeHelper"

    const-string v1, "(callback) onCookieChanged: Update cookies (from web) => engine."

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->S1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lrg/a1;->C0()V

    :cond_0
    invoke-static {}, Lrg/a1;->T0()V

    return-void
.end method

.method public static synthetic q(Lcom/roblox/client/startup/NativeHelper;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->l0(Lcom/roblox/client/startup/NativeHelper;Z)V

    return-void
.end method

.method public static final q0(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->i2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Lyj/s2;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLInterface;->setWebviewUserAgent(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLInterface;->setWebviewUserAgent(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic r([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/roblox/client/startup/NativeHelper;->Z([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method

.method public static synthetic s(Lcom/roblox/client/startup/NativeHelper;D)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/client/startup/NativeHelper;->P(Lcom/roblox/client/startup/NativeHelper;D)V

    return-void
.end method

.method public static synthetic t(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->Q(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic u(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->V(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic v(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->N(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic w(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->q0(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic x(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->W(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic y(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->O(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic z(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->b0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final G()V
    .locals 6

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {}, Lrg/a1;->l0()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    move v2, v3

    :cond_1
    iget-boolean v1, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    iget-boolean v3, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "adjustWindowInsets: isForeground="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isInExperience="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isLandscape="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldHideInLandscape="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    const-string v1, "getWindow(...)"

    if-nez v0, :cond_3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lrg/c2;->c(Landroid/view/Window;)V

    return-void

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lrg/c2;->b(Landroid/view/Window;)V

    return-void
.end method

.method public final e0()V
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "init_failure"

    const-wide/16 v3, 0x0

    invoke-static {v2, v3, v4, v0, v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/h2;

    invoke-direct {v1, p0}, Lyj/h2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final g0()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->G()V

    return-void
.end method

.method public final gameActivity_getShellFlagKeys()[Ljava/lang/String;
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/g;->U3()Ljava/util/Set;

    move-result-object v0

    const-string v1, "getEntrySet(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roblox/client/flags/a;

    invoke-static {v3, v2}, Lmh/a;->d(Ljava/lang/String;Lcom/roblox/client/flags/a;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final gameActivity_hideKeyboard()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/w1;

    invoke-direct {v1, p0}, Lyj/w1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onAppReady(Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onAppReady: data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/o1;

    invoke-direct {v1, p0}, Lyj/o1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    const-string v0, "Push"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object p1

    invoke-virtual {p1}, Lrg/y;->k()Lmm/k;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lmm/k;->b0(Landroid/content/Context;)V

    :cond_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->i2()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->d:Lju/l0;

    invoke-static {p1}, Lju/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lju/p0;

    move-result-object v0

    new-instance v3, Lcom/roblox/client/startup/NativeHelper$c;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/roblox/client/startup/NativeHelper$c;-><init>(Lcom/roblox/client/startup/NativeHelper;Lmt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lju/i;->d(Lju/p0;Lkotlin/coroutines/CoroutineContext;Lju/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lju/d2;

    :cond_1
    return-void
.end method

.method public final gameActivity_onDidLogInReceived(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onDidLogInReceived: data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/s1;

    invoke-direct {v1, p0, p1}, Lyj/s1;-><init>(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onDidLogOutReceived()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onDidLogOutReceived:"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/u1;

    invoke-direct {v1, p0}, Lyj/u1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onDidSignUp(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onDidSignUp: data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/p1;

    invoke-direct {v1, p0, p1}, Lyj/p1;-><init>(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onDidSwitchAccountReceived()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onDidSwitchAccountReceived:"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/n2;

    invoke-direct {v1, p0}, Lyj/n2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onEngineInitialized()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onEngineInitialized:"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->i:Z

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setup(Landroid/content/Context;)V

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/m2;

    invoke-direct {v1, p0}, Lyj/m2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onExperienceStart()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onExperienceStart:"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    sget-object v1, Lwi/a;->a:Lwi/a;

    invoke-virtual {v1, v0}, Lwi/a;->b(Z)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/g2;

    invoke-direct {v1, p0}, Lyj/g2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onExperienceStop(D)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onExperienceStop:"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/t1;

    invoke-direct {v1, p0, p1, p2}, Lyj/t1;-><init>(Lcom/roblox/client/startup/NativeHelper;D)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onFlagsFailed()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onFlagsFailed:"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->e0()V

    return-void
.end method

.method public final gameActivity_onFlagsLoaded(Ljava/nio/ByteBuffer;)V
    .locals 3
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "flagsBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gameActivity_onFlagsLoaded: size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roblox/client/startup/a;->F(Ljava/lang/String;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/roblox/client/startup/a;->B(Landroid/content/Context;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->k3()Z

    move-result p1

    iput-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->k:Z

    iget-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->k:Z

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeAppBridgeInterface;->setEnableConnectivityV2ForAndroid(Z)V

    invoke-static {v0}, Lcom/roblox/client/startup/a;->g(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/m1;

    invoke-direct {v1, v0, p0}, Lyj/m1;-><init>(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {p1, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onGameLoaded(J)V
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onGameLoaded: placeId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    sget-object p2, Lwi/a;->a:Lwi/a;

    invoke-virtual {p2, p1}, Lwi/a;->b(Z)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->m4()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    const/4 p2, 0x0

    const-string v2, "native_experience_start"

    invoke-static {v2, v0, v1, p1, p2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance p2, Lyj/k1;

    invoke-direct {p2, p0}, Lyj/k1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onGameStreamingStatusChanged(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->T1()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    sget-object v0, Lgt/n;->b:Lgt/n$a;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "inGameStreaming"

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1}, Luh/q0;->f(Landroid/app/Activity;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1}, Luh/q0;->i(Landroid/app/Activity;)V

    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {p1}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v0, Lgt/n;->b:Lgt/n$a;

    invoke-static {p1}, Lgt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Lgt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse GAME_STREAMING_STATUS_CHANGED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NativeHelper"

    invoke-static {v0, p1}, Lek/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method public final gameActivity_onLuaAppDidReturn()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onLuaAppDidReturn:"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Lcom/roblox/client/startup/MainGameActivity;->requestOrientationAsDefault()V

    return-void
.end method

.method public final gameActivity_onLuaTextBoxChanged(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/k2;

    invoke-direct {v1, p0, p1}, Lyj/k2;-><init>(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onLuaTextBoxPropertyChanged()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/v1;

    invoke-direct {v1, p0}, Lyj/v1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onMotionEventListening(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "motionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Lyj/l1;

    invoke-direct {v0, p0}, Lyj/l1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onRestartLuaApp()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/r1;

    invoke-direct {v1, p0}, Lyj/r1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onScanQrCode()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/n1;

    invoke-direct {v1, p0}, Lyj/n1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onScreenOrientationChanged(IZ)V
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    if-nez p2, :cond_0

    const-string p1, "gameActivity_onScreenOrientationChanged: (In-App) request the default Orientation."

    invoke-static {v0, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Lcom/roblox/client/startup/MainGameActivity;->requestOrientationAsDefault()V

    return-void

    :cond_0
    sget-object p2, Lcom/roblox/client/startup/NativeHelper;->s:Lcom/roblox/client/startup/NativeHelper$a;

    invoke-static {p2, p1}, Lcom/roblox/client/startup/NativeHelper$a;->b(Lcom/roblox/client/startup/NativeHelper$a;I)I

    move-result p2

    const/4 v1, -0x1

    if-eq p2, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gameActivity_onScreenOrientationChanged: orientation:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " => "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Lyj/i2;

    invoke-direct {v0, p0, p2}, Lyj/i2;-><init>(Lcom/roblox/client/startup/NativeHelper;I)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final gameActivity_onScreenshotReady(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->d:Lju/l0;

    invoke-static {v0}, Lju/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lju/p0;

    move-result-object v1

    new-instance v4, Lcom/roblox/client/startup/NativeHelper$d;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/roblox/client/startup/NativeHelper$d;-><init>(Ljava/lang/String;Lmt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lju/i;->d(Lju/p0;Lkotlin/coroutines/CoroutineContext;Lju/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lju/d2;

    return-void
.end method

.method public final gameActivity_setAppUpgradeStatus(IILjava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "apkUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apkCheckSum"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/q1;

    move-object v3, p0

    move v2, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lyj/q1;-><init>(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_showKeyboard(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 8
    .param p4    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/roblox/engine/jni/model/NativeTextBoxInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "byteArrayFromTextBox"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textBoxInfo"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lyj/l2;

    move-object v3, p0

    move-wide v4, p1

    move v6, p3

    move-object v2, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lyj/l2;-><init>([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final h0()V
    .locals 4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    iget-boolean v1, p0, Lcom/roblox/client/startup/NativeHelper;->i:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onForegroundOrEngineInitialized: isForeground = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isEngineInitialized = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->i:Z

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->o()Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v2, Lyj/b2;

    invoke-direct {v2}, Lyj/b2;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->m(Le/p;Ljl/f;)V

    invoke-static {}, Lel/a;->b()Lel/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, v1}, Lel/a;->d(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance v0, Lyj/c2;

    invoke-direct {v0, p0}, Lyj/c2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v1, v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->O(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->Z4()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lni/m;->a:Lni/m;

    new-instance v2, Lcom/roblox/client/startup/NativeHelper$e;

    invoke-direct {v2, v0}, Lcom/roblox/client/startup/NativeHelper$e;-><init>(Lni/m;)V

    invoke-virtual {v1, v2}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->H(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->V0()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lyj/d2;

    invoke-direct {v0, p0}, Lyj/d2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v1, v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->K(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V

    :cond_1
    :goto_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->h3()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->a:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_2
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->X0()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/shortcuts/PinShortcutHandler;->INSTANCE:Lcom/roblox/client/shortcuts/PinShortcutHandler;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_3
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->F5()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_4
    return-void
.end method

.method public final m0()V
    .locals 4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v1

    invoke-virtual {v1}, Lti/h;->f()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onForegroundOrLogin: isForeground = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isLoggedIn = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/startup/NativeHelper$f;

    invoke-direct {v1, p0}, Lcom/roblox/client/startup/NativeHelper$f;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Lcom/roblox/client/d;->b(Lcom/roblox/client/d$d;)V

    :cond_0
    return-void
.end method

.method public final n0(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Lkk/f$f;)V
    .locals 1
    .param p2    # Landroid/view/SurfaceView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/roblox/client/RbxKeyboard;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkk/f$f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "surfaceView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rbxEditText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputAdapter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput p1, p0, Lcom/roblox/client/startup/NativeHelper;->n:I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Lkk/f;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkk/f;->I()V

    :cond_0
    new-instance p1, Lkk/f;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-direct {p1, v0, p2, p4}, Lkk/f;-><init>(Landroid/app/Activity;Landroid/view/SurfaceView;Lkk/f$f;)V

    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Lkk/f;

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    new-instance p1, Luh/r0;

    invoke-direct {p1, p3}, Luh/r0;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->f:Luh/x0;

    return-void
.end method

.method public final o0()V
    .locals 4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v1

    invoke-virtual {v1}, Lti/h;->f()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onVisibleOrLogin: isVisible = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isLoggedIn = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    invoke-virtual {v0}, Lti/h;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lti/e;->c()Lti/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->p:Lti/e$e;

    invoke-virtual {v0, v1}, Lti/e;->b(Lti/e$e;)V

    :cond_0
    return-void
.end method

.method public final onCodeParsedFromSMS(Loh/j;)V
    .locals 2
    .param p1    # Loh/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Lev/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SMS code received."

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Calling IdentityProtocol to parse OTP."

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->g()Lgm/f;

    move-result-object v0

    iget-object p1, p1, Loh/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lgm/f;->o(Ljava/lang/String;)V

    return-void
.end method
