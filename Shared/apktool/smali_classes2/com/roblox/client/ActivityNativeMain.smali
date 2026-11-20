.class public Lcom/roblox/client/ActivityNativeMain;
.super Lcom/roblox/client/a;
.source "SourceFile"

# interfaces
.implements Lti/e$e;
.implements Lph/d;
.implements Lyj/n0;
.implements Lvg/b$d;
.implements Luh/a$g;
.implements Lcom/roblox/client/startup/c$b;
.implements Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;
.implements Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;
.implements Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;
.implements Lxj/c;
.implements Luh/a$f;
.implements Lcom/roblox/client/game/ExperienceSession$d;
.implements Lcom/roblox/protocols/webview/a$d;
.implements Luh/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/ActivityNativeMain$l;
    }
.end annotation


# static fields
.field public static q0:Z = true


# instance fields
.field public S:Z

.field public T:Lph/a;

.field public U:Landroid/view/View;

.field public V:Landroid/view/View;

.field public W:Z

.field public X:J

.field public Y:Ljava/lang/String;

.field public Z:I

.field public a0:Loi/f;

.field public b0:Lvg/b;

.field public c0:Lcom/roblox/protocols/webview/WebViewProtocol;

.field public d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

.field public e0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public f0:Luh/t0;

.field public g0:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;"
        }
    .end annotation
.end field

.field public h0:Z

.field public i0:Lbk/h;

.field public j0:Luh/i;

.field public k0:Luh/a1;

.field public l0:Landroid/widget/ImageView;

.field public final m0:Ljava/lang/Runnable;

.field public final n0:Ljava/lang/Runnable;

.field public o0:Lsg/a;

.field public final p0:Lci/m;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/roblox/client/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lvg/b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    new-instance v0, Lrg/j;

    invoke-direct {v0, p0}, Lrg/j;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->m0:Ljava/lang/Runnable;

    new-instance v0, Lrg/k;

    invoke-direct {v0, p0}, Lrg/k;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->n0:Ljava/lang/Runnable;

    new-instance v0, Lcom/roblox/client/ActivityNativeMain$g;

    invoke-direct {v0, p0}, Lcom/roblox/client/ActivityNativeMain$g;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->p0:Lci/m;

    return-void
.end method

.method private E2()V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/c;->v2(Lj/b;)V

    return-void
.end method

.method private Y2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p2}, Lek/f;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Lrg/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private d3()V
    .locals 4

    const-string v0, "rbx.main"

    const-string v1, "processPushNotification."

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object v0

    invoke-virtual {v0}, Lhj/r;->i()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object v1

    invoke-virtual {v1, v0}, Lhj/r;->t(Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    :try_start_0
    const-string v1, "EXTRA_NOTIFICATION_TYPE"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v2, "FriendRequestReceived"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :sswitch_1
    const-string v2, "DefaultNotification"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lrj/a;->a()Lrj/a;

    move-result-object v1

    const-string v2, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lrj/a;->b(Ljava/lang/String;)V

    return-void

    :sswitch_2
    const-string v2, "PrivateMessageReceived"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->S2(Landroid/os/Bundle;)V

    return-void

    :sswitch_3
    const-string v2, "ChatNewMessage"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "EXTRA_CONVERSATION_ID"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->W2(J)V

    return-void

    :sswitch_4
    const-string v2, "FriendRequestAccepted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->R2(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    return-void

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x253fa4b8 -> :sswitch_4
        0x3766c7df -> :sswitch_3
        0x3ea07f25 -> :sswitch_2
        0x664121ac -> :sswitch_1
        0x74fceef2 -> :sswitch_0
    .end sparse-switch
.end method

.method public static g3(Lcom/roblox/client/ActivityNativeMain;Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lph/a;

    move-result-object v0

    invoke-virtual {v0}, Lph/a;->d()Luh/a;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/h;->m(Landroidx/fragment/app/c;)Landroidx/fragment/app/h;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/h;->h()I

    :cond_0
    const-string p0, "rbx.appshell"

    const-string p1, "removeGlApp() clearing app shell"

    invoke-static {p0, p1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Luh/f;->j()Luh/f;

    move-result-object p0

    invoke-virtual {p0}, Luh/f;->f()V

    return-void
.end method

.method public static synthetic i2(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->K2()V

    return-void
.end method

.method public static synthetic j2(Lcom/roblox/client/ActivityNativeMain;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->M2(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic k2(Lcom/roblox/client/ActivityNativeMain;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->N2(Z)V

    return-void
.end method

.method public static synthetic l2(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->O2()V

    return-void
.end method

.method public static synthetic m2(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lyj/s2;->b(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic n2(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->J2()V

    return-void
.end method

.method public static synthetic o2(Ljava/lang/String;)V
    .locals 1

    invoke-static {p0}, Lml/a;->b(Ljava/lang/String;)Lml/a;

    move-result-object p0

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Ldk/c;->u(Lml/a;)V

    return-void
.end method

.method private o3(I)V
    .locals 1

    const-string v0, "retry_during_main"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/roblox/client/startup/c;->y2(Lj/b;I)V

    return-void
.end method

.method public static synthetic p2(Lcom/roblox/client/ActivityNativeMain;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->P2(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic q2(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->L2()V

    return-void
.end method

.method public static synthetic r2(Lcom/roblox/client/ActivityNativeMain;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->I2(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static bridge synthetic s2(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic t2(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic u2(Lcom/roblox/client/ActivityNativeMain;)Lcom/roblox/protocols/webview/WebViewProtocol;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    return-object p0
.end method

.method public static bridge synthetic v2(Lcom/roblox/client/ActivityNativeMain;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic w2(Lcom/roblox/client/ActivityNativeMain;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->A2(Z)V

    return-void
.end method

.method public static bridge synthetic x2(Lcom/roblox/client/ActivityNativeMain;)Lph/a;
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lph/a;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic y2(Lcom/roblox/client/ActivityNativeMain;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ActivityNativeMain;->i3(J)V

    return-void
.end method


# virtual methods
.method public final A2(Z)V
    .locals 6

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->a5()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->M(Landroid/content/Context;Z)V

    return-void

    :cond_0
    invoke-static {}, Lek/t;->g()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_5

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v0

    invoke-virtual {v0}, Ldk/c;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v3

    invoke-virtual {v3}, Ldk/c;->j()J

    move-result-wide v3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v5

    invoke-interface {v5}, Lrh/i;->H1()Z

    move-result v5

    if-eqz v5, :cond_2

    cmp-long v0, v3, v1

    if-lez v0, :cond_1

    invoke-static {p0}, Ldj/a0;->R(Landroid/content/Context;)Ldj/a0;

    move-result-object v0

    invoke-virtual {v0, v3, v4, p1}, Ldj/a0;->K(JZ)V

    return-void

    :cond_1
    invoke-static {p0}, Ldj/a0;->R(Landroid/content/Context;)Ldj/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldj/a0;->L(Z)V

    return-void

    :cond_2
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v5

    invoke-interface {v5}, Lrh/i;->n3()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v5

    invoke-interface {v5}, Lrh/i;->q()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {p0}, Ldj/m;->F0(Landroid/content/Context;)Ldj/m;

    move-result-object v1

    invoke-virtual {v1, v3, v4, v0, p1}, Ldj/m;->m1(JLjava/lang/String;Z)V

    return-void

    :cond_3
    cmp-long v1, v3, v1

    if-lez v1, :cond_4

    invoke-static {p0}, Ldj/m;->F0(Landroid/content/Context;)Ldj/m;

    move-result-object v1

    invoke-virtual {v1, v3, v4, v0, p1}, Ldj/m;->A0(JLjava/lang/String;Z)V

    return-void

    :cond_4
    invoke-static {p0}, Ldj/m;->F0(Landroid/content/Context;)Ldj/m;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Ldj/m;->B0(Ljava/lang/String;Z)V

    return-void

    :cond_5
    invoke-static {}, Lek/t;->i()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object p1

    invoke-virtual {p1}, Ldk/c;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ldk/c;->j()J

    move-result-wide v3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->D5()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_7

    cmp-long p1, v3, v1

    if-lez p1, :cond_6

    invoke-static {p0}, Lgj/a;->a(Landroid/content/Context;)Lgj/a;

    throw v0

    :cond_6
    invoke-static {p0}, Lgj/a;->a(Landroid/content/Context;)Lgj/a;

    throw v0

    :cond_7
    invoke-static {p0}, Lgj/b;->a(Landroid/content/Context;)Lgj/b;

    throw v0

    :cond_8
    return-void
.end method

.method public final B2()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    new-instance v1, Lcom/roblox/client/ActivityNativeMain$i;

    invoke-direct {v1, p0}, Lcom/roblox/client/ActivityNativeMain$i;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final C2()V
    .locals 5

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$d;

    invoke-direct {v2, p0, v1}, Lcom/roblox/client/ActivityNativeMain$d;-><init>(Lcom/roblox/client/ActivityNativeMain;Landroid/view/ViewGroup;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    sget v0, Lrg/m0;->F:I

    iput v0, p0, Lcom/roblox/client/ActivityNativeMain;->Z:I

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v2, Lrg/m0;->F:I

    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v2

    invoke-interface {v2}, Lrh/i;->L0()Z

    move-result v2

    if-eqz v2, :cond_0

    sget v2, Lrg/n0;->k:I

    goto :goto_0

    :cond_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v2

    invoke-interface {v2}, Lrh/i;->D4()Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, Lrg/n0;->l:I

    goto :goto_0

    :cond_1
    sget v2, Lrg/n0;->j:I

    :goto_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v3

    invoke-interface {v3}, Lrh/i;->n2()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "fragment_shared_inflate_begin"

    invoke-static {v3}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v2

    invoke-interface {v2}, Lrh/i;->n2()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "fragment_shared_inflate_end"

    invoke-static {v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_3
    new-instance v2, Luh/t0;

    sget v3, Lrg/m0;->j0:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/SurfaceView;

    invoke-direct {v2, p0, v3}, Luh/t0;-><init>(Lcom/roblox/client/a;Landroid/view/SurfaceView;)V

    iput-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v2

    iget-object v3, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    sget-object v2, Lkk/h;->a:Lkk/h;

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkk/h;->c(Landroid/content/res/Configuration;)V

    const-string v2, "rbx.main"

    const-string v3, "createGlAppsFrame() apps frame created"

    invoke-static {v2, v3}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->l3()Z

    move-result v0

    if-eqz v0, :cond_4

    sget v0, Lrg/m0;->j0:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v2

    new-instance v3, Lcom/roblox/client/ActivityNativeMain$e;

    invoke-direct {v3, p0, v1, v0}, Lcom/roblox/client/ActivityNativeMain$e;-><init>(Lcom/roblox/client/ActivityNativeMain;Landroid/view/ViewGroup;Landroid/view/SurfaceView;)V

    invoke-interface {v2, v3}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    :cond_4
    return-void
.end method

.method public D()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/b;->E1()V

    return-void
.end method

.method public final D2()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$f;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$f;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->n0:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeScheduleOnFirstFrame(Ljava/lang/Runnable;)V

    return-void
.end method

.method public E(ILandroidx/fragment/app/c;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object v0

    invoke-virtual {p2}, Landroidx/fragment/app/c;->p0()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroidx/fragment/app/h;->b(ILandroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Landroidx/fragment/app/h;->t(Landroidx/fragment/app/c;)Landroidx/fragment/app/h;

    :goto_0
    invoke-virtual {v0}, Landroidx/fragment/app/h;->h()I

    :cond_1
    return-void
.end method

.method public F()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "updateViewAppSettingsLoaded:"

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->k3()V

    return-void
.end method

.method public final F2()Lph/a;
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lph/a;

    if-nez v0, :cond_0

    new-instance v0, Lph/a;

    iget v1, p0, Lcom/roblox/client/ActivityNativeMain;->Z:I

    invoke-direct {v0, p0, v1}, Lph/a;-><init>(Lph/d;I)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lph/a;

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lph/a;

    return-object v0
.end method

.method public final G2()Loh/g;
    .locals 2

    const-string v0, "CUSTOM_WEBVIEW_TAG"

    invoke-static {v0}, Loh/g;->b(Ljava/lang/String;)Loh/g;

    move-result-object v0

    invoke-static {p0}, Lrg/a1;->Q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Loh/g;->g(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Loh/g;->j(Z)V

    return-object v0
.end method

.method public H()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/b;->E1()V

    return-void
.end method

.method public final H2()V
    .locals 3

    const-string v0, "internalOnResume:"

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->A2(Z)V

    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object v0

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$h;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$h;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v2}, Lcom/roblox/client/d;->b(Lcom/roblox/client/d$d;)V

    invoke-static {}, Lek/t;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    invoke-virtual {v0}, Lti/h;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p0}, Lrg/e2;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->p0:Lci/m;

    invoke-virtual {v0, v2}, Lti/h;->d(Lci/m;)V

    :cond_1
    const-string v0, "internalOnResume: NotificationManager addObserver"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lti/e;->c()Lti/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lti/e;->b(Lti/e$e;)V

    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object v0

    invoke-virtual {v0}, Lhj/r;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lrg/e2;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    :cond_2
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->d3()V

    :cond_3
    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    if-eqz v0, :cond_4

    const-string v0, "Back from game. Resuming Lua App."

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->a3()V

    :cond_4
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lph/a;

    move-result-object v0

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->j0()Z

    invoke-virtual {v0}, Lph/a;->d()Luh/a;

    move-result-object v1

    if-nez v1, :cond_5

    new-instance v1, Lcom/roblox/client/feature/FeatureState;

    const-string v2, "CUSTOM_LUAVIEW_TAG"

    invoke-direct {v1, v2}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lph/a;->g(Lcom/roblox/client/feature/FeatureState;)V

    :cond_5
    return-void
.end method

.method public I()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "showRetryUI:"

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lrg/q0;->S:I

    invoke-static {p0, v0}, Lek/x;->a(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lrg/q0;->S:I

    invoke-direct {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->o3(I)V

    :cond_1
    return-void
.end method

.method public final synthetic I2(Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p1, p0}, Lrg/q;->b(Lorg/json/JSONObject;Landroid/app/Activity;)V

    return-void
.end method

.method public final synthetic J2()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public final synthetic K2()V
    .locals 2

    const-wide/16 v0, 0x1f4

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->i3(J)V

    return-void
.end method

.method public final synthetic L2()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public M()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->E2()V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->q3()V

    return-void
.end method

.method public final synthetic M2(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lrg/e;

    invoke-direct {v0, p1}, Lrg/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public N()V
    .locals 3

    const-string v0, "rbx.main"

    const-string v1, "navigateToLandingScreen:"

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0, p0}, Lrg/y;->o(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "send_app_input_focus_to_lua"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void
.end method

.method public final synthetic N2(Z)V
    .locals 1

    sget-object v0, Lni/c;->a:Lni/c;

    invoke-virtual {v0, p1}, Lni/c;->j(Z)V

    sget-object v0, Lni/b;->a:Lni/b;

    invoke-virtual {v0, p0, p1}, Lni/b;->b(Landroid/app/Activity;Z)V

    return-void
.end method

.method public final synthetic O2()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->k0()V

    return-void
.end method

.method public P1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic P2(Landroidx/activity/result/ActivityResult;)V
    .locals 1

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->g()Lgm/f;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lgm/f;->r(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public Q1()Lki/c;
    .locals 1

    new-instance v0, Lki/d;

    invoke-direct {v0}, Lki/d;-><init>()V

    return-object v0
.end method

.method public final Q2(Lcom/roblox/client/feature/FeatureState;)V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "loadDataModel()"

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Luh/f;->j()Luh/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Luh/f;->F(Landroid/content/Context;)V

    invoke-static {p0}, Luh/p;->a(Landroid/content/Context;)Luh/f$d;

    move-result-object v0

    invoke-static {}, Luh/f;->j()Luh/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Luh/f;->k(Luh/f$d;)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->isColdStartDeeplinkToGame()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lti/h;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lam/a;->a()Lam/a;

    move-result-object v0

    new-instance v1, Lrg/h;

    invoke-direct {v1, p0}, Lrg/h;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v1}, Lam/a;->b(Lam/a$b;)V

    invoke-static {}, Lti/h;->l()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyj/k0;->G(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->m3(Lcom/roblox/client/feature/FeatureState;)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeStartLuaAppDM()V

    :cond_1
    return-void
.end method

.method public R(ILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/16 v0, 0x65

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    const-string p1, "game_init_params"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Luh/k0;->c(Landroid/os/Bundle;)Luh/k0;

    move-result-object p1

    invoke-static {p1, p0}, Lrg/q;->j(Luh/k0;Landroid/app/Activity;)V

    return-void

    :cond_1
    const-string p1, "rbx.main"

    const-string v0, "ANM.handleNotification() Logout event..."

    invoke-static {p1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2UserDidLogout()V

    invoke-static {}, Luj/c;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lcom/roblox/client/ActivityNativeMain$l;

    invoke-direct {p1, p0}, Lcom/roblox/client/ActivityNativeMain$l;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, p2, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void

    :cond_2
    invoke-static {p2}, Lti/b;->g(Landroid/os/Bundle;)Lti/b$d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/a;->X1(Lti/b$d;)V

    return-void
.end method

.method public final R2(Landroid/os/Bundle;)V
    .locals 8

    const-string v0, "EXTRA_NOTIFICATION_USER_ID"

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "EXTRA_STACKED_NOTIFICATION"

    const/4 v6, 0x0

    invoke-virtual {p1, v5, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const/4 v5, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    goto :goto_0

    :cond_0
    const-string v6, "FriendRequestReceived"

    const-string v7, "FriendRequestAccepted"

    if-nez p1, :cond_5

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    cmp-long p1, v3, v1

    if-nez p1, :cond_2

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object p1

    invoke-virtual {p1}, Lti/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lrg/a1;->a0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_2
    invoke-static {v3, v4}, Lrg/a1;->c0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_3
    cmp-long p1, v3, v1

    if-nez p1, :cond_4

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object p1

    invoke-virtual {p1}, Lti/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lrg/a1;->b0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_4
    invoke-static {v3, v4}, Lrg/a1;->c0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_5
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object p1

    invoke-virtual {p1}, Lti/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lrg/a1;->a0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_7
    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object p1

    invoke-virtual {p1}, Lti/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lrg/a1;->b0(J)Ljava/lang/String;

    move-result-object v5

    :goto_0
    invoke-virtual {p0, v5}, Lcom/roblox/client/ActivityNativeMain;->p3(Ljava/lang/String;)V

    return-void
.end method

.method public S()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lek/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setMobileAdvertisingId(Ljava/lang/String;)V

    return-void
.end method

.method public final S2(Landroid/os/Bundle;)V
    .locals 5

    const-string v0, "EXTRA_CONVERSATION_ID"

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long p1, v3, v1

    if-nez p1, :cond_0

    invoke-static {}, Lrg/a1;->w0()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {v3, v4}, Lrg/a1;->A0(J)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->p3(Ljava/lang/String;)V

    return-void
.end method

.method public final T2()Z
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "loginAfterSignup"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    return v0

    :cond_0
    return v1
.end method

.method public final U2(Landroid/content/Intent;)V
    .locals 9

    if-eqz p1, :cond_4

    const-string v0, "FEATURE_EXTRA"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "CHAT_TAG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "USER_ID_EXTRA"

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v3, v4}, Lcom/roblox/client/ActivityNativeMain;->Z2(J)V

    return-void

    :cond_0
    const-string v0, "CONVERSATION_ID_EXTRA"

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->W2(J)V

    return-void

    :cond_1
    const-string v1, "PROFILE_TAG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "PATH_EXTRA"

    if-eqz v1, :cond_2

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget p1, Lrg/q0;->I:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lrg/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void

    :cond_2
    move-object v3, p0

    const-string v1, "SETTINGS_TAG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget v0, Lrg/q0;->L:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lrg/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0}, Lph/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lrg/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    move-object v3, p0

    return-void
.end method

.method public final V2()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OVERLAY_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->u0()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final W2(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToConversation() conversation:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "CHAT_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    const-string v1, "CHAT_CONVERSATION_ID"

    invoke-virtual {v0, v1, p1, p2}, Lcom/roblox/client/feature/FeatureState;->g(Ljava/lang/String;J)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->X2(Lcom/roblox/client/feature/FeatureState;)V

    return-void
.end method

.method public final X2(Lcom/roblox/client/feature/FeatureState;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToFeature:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bundle:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->m3(Lcom/roblox/client/feature/FeatureState;)V

    return-void
.end method

.method public Z()V
    .locals 3

    const-string v0, "rbx.main"

    const-string v1, "onAppStarted: "

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lti/b;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/roblox/client/ActivityNativeMain$l;

    invoke-direct {v0, p0}, Lcom/roblox/client/ActivityNativeMain$l;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public final Z2(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToUserConversation() user:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "CHAT_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    const-string v1, "USER_ID_EXTRA"

    invoke-virtual {v0, v1, p1, p2}, Lcom/roblox/client/feature/FeatureState;->g(Ljava/lang/String;J)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->X2(Lcom/roblox/client/feature/FeatureState;)V

    return-void
.end method

.method public final a3()V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->n3()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    invoke-virtual {v0}, Luh/t0;->b()Z

    move-result v0

    return v0
.end method

.method public b3(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Lxj/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAppReady: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    new-instance v1, Lcom/roblox/client/ActivityNativeMain$j;

    invoke-direct {v1, p0}, Lcom/roblox/client/ActivityNativeMain$j;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    const-string v0, "Landing"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Home"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "Push"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object p1

    invoke-virtual {p1}, Lrg/y;->k()Lmm/k;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lmm/k;->b0(Landroid/content/Context;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object p1

    new-instance v0, Lcom/roblox/client/ActivityNativeMain$k;

    invoke-direct {v0, p0}, Lcom/roblox/client/ActivityNativeMain$k;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p1, v0}, Lcom/roblox/client/d;->b(Lcom/roblox/client/d$d;)V

    :cond_3
    :goto_1
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->i2()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v1, Lrg/f;

    invoke-direct {v1, p1}, Lrg/f;-><init>(Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_4
    return-void
.end method

.method public final c3(Ljava/lang/String;)V
    .locals 4

    const-string v0, "rbx.main"

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "openFunCaptchaActivity: Exception parsing json data."

    invoke-static {v0, p1}, Lek/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    const-string p1, "captchaType"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "login"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "cvalueType"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "cvalue"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v2, "email"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x2

    goto :goto_1

    :sswitch_1
    const-string v2, "username"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x1

    goto :goto_1

    :sswitch_2
    const-string v2, "phone_number"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported credential Type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p1, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->b:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    goto :goto_2

    :pswitch_1
    sget-object p1, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->a:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    goto :goto_2

    :pswitch_2
    sget-object p1, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->c:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    :goto_2
    new-instance v2, Lcom/roblox/client/captcha/LoginCaptchaConfig;

    invoke-direct {v2, p1, v1}, Lcom/roblox/client/captcha/LoginCaptchaConfig;-><init>(Lcom/roblox/client/captcha/LoginCaptchaConfig$c;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    new-instance v2, Lcom/roblox/client/captcha/SignUpCaptchaConfig;

    invoke-direct {v2}, Lcom/roblox/client/captcha/SignUpCaptchaConfig;-><init>()V

    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "openFunCaptchaActivity: config = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v2}, Lcom/roblox/client/captcha/ActivityFunCaptcha;->i2(Landroid/content/Context;Lcom/roblox/client/captcha/CaptchaConfig;)Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x4e93

    invoke-virtual {p0, p1, v0}, Le/p;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x247fbcc6 -> :sswitch_2
        -0xfd6772a -> :sswitch_1
        0x5c24b9c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lll/a;)V
    .locals 9

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->B2()V

    iget-object v0, p1, Lll/a;->d:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p1, Lll/a;->c:Ljava/lang/Boolean;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_1
    iget-object v4, p1, Lll/a;->e:Ljava/lang/Boolean;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move v4, v1

    :goto_2
    iget-object v5, p1, Lll/a;->f:Ljava/lang/Boolean;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v2

    goto :goto_3

    :cond_3
    move v5, v1

    :goto_3
    iget-object v6, p1, Lll/a;->g:Ljava/lang/Boolean;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_4

    move v1, v2

    :cond_4
    if-eqz v0, :cond_5

    new-instance v0, Lrg/y0;

    invoke-direct {v0}, Lrg/y0;-><init>()V

    goto :goto_4

    :cond_5
    new-instance v0, Lth/k;

    invoke-direct {v0}, Lth/k;-><init>()V

    :goto_4
    invoke-virtual {v0}, Landroidx/fragment/app/c;->a()Landroidx/lifecycle/l;

    move-result-object v6

    new-instance v7, Lvg/a;

    invoke-direct {v7}, Lvg/a;-><init>()V

    invoke-virtual {v6, v7}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-string v7, "DEFAULT_URL"

    iget-object v8, p1, Lll/a;->a:Ljava/lang/String;

    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "USE_APP_HYBRID"

    invoke-virtual {v6, v7, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v7, "VISIBLE"

    invoke-virtual {v6, v7, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "BACK_NAVIGATION_DISABLED"

    invoke-virtual {v6, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "TITLE_STRING"

    iget-object p1, p1, Lll/a;->b:Ljava/lang/String;

    invoke-virtual {v6, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "HAS_PARENT"

    invoke-virtual {v6, p1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "HIDE_ACCESSORY_BUTTONS"

    invoke-virtual {v6, p1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "SHOW_DOMAIN_AS_TITLE"

    invoke-virtual {v6, p1, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "hideNativeHeader"

    invoke-virtual {v6, p1, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {v0, v6}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    new-instance p1, Lcom/roblox/client/ActivityNativeMain$a;

    invoke-direct {p1, p0}, Lcom/roblox/client/ActivityNativeMain$a;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p1}, Lcom/roblox/client/c;->B3(Lcom/roblox/client/c$i;)V

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    sget v1, Lrg/m0;->j:I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->V2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v0, v2}, Landroidx/fragment/app/h;->b(ILandroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/h;->f(Ljava/lang/String;)Landroidx/fragment/app/h;

    invoke-virtual {p1}, Landroidx/fragment/app/h;->h()I

    return-void
.end method

.method public e()V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->h3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/WebViewProtocol;->t()V

    :cond_0
    return-void
.end method

.method public e3()V
    .locals 2

    new-instance v0, Lcom/roblox/client/startup/d;

    invoke-direct {v0}, Lcom/roblox/client/startup/d;-><init>()V

    new-instance v1, Lrg/l;

    invoke-direct {v1, p0}, Lrg/l;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p0, v1}, Lcom/roblox/client/startup/d;->c(Landroid/content/Context;Lcom/roblox/client/startup/d$a;)V

    return-void
.end method

.method public f(Lll/a;)V
    .locals 2

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->u0()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    sget v1, Lrg/m0;->j:I

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->m0(I)Landroidx/fragment/app/c;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/c;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/c;

    invoke-virtual {v0, p1}, Lcom/roblox/client/c;->H3(Lll/a;)V

    :cond_0
    return-void
.end method

.method public f3()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "Registering activity result for IdentityProtocol."

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lh/j;

    invoke-direct {v0}, Lh/j;-><init>()V

    new-instance v1, Lrg/d;

    invoke-direct {v1, p0}, Lrg/d;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, v0, v1}, Le/p;->h(Lh/a;Lg/a;)Lg/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->g0:Lg/c;

    return-void
.end method

.method public finish()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->N2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lrg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    :cond_0
    return-void
.end method

.method public g(Z)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    invoke-virtual {v0, p1}, Luh/t0;->g(Z)V

    return-void
.end method

.method public final h3()Z
    .locals 3

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->u0()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->a1()V

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public i()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->E2()V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->q3()V

    return-void
.end method

.method public i0()V
    .locals 0

    return-void
.end method

.method public final i3(J)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->m0:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->m0:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public j3(Z)V
    .locals 2

    new-instance v0, Lmk/a;

    invoke-direct {v0, p1}, Lmk/a;-><init>(Z)V

    iget-object p1, v0, Lmk/c;->a:Ljava/lang/String;

    iget-object v1, v0, Lmk/c;->b:Ljava/lang/String;

    iget-object v0, v0, Lmk/c;->c:Ljava/lang/String;

    invoke-static {p1, v1, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "rbx.main"

    if-eqz v0, :cond_0

    const-string p1, "Share data is empty"

    invoke-static {v1, p1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "url"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "context"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-static {v0, p1}, Lxj/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/ShareAppChosenReceiver;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0xa000000

    const/4 v2, 0x0

    invoke-static {p0, v2, p1, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {p0, v2}, Lcom/roblox/client/ActivityNativeMain;->j3(Z)V

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p1

    invoke-static {v0, v1, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;Landroid/content/IntentSender;)Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x4e9c

    invoke-virtual {p0, p1, v0}, Le/p;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :catch_0
    const-string p1, "Error parsing share data."

    invoke-static {v1, p1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public k0()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToMainScreen: IsLoggedIn = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v1

    invoke-virtual {v1}, Lti/h;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->k3()V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    invoke-virtual {v0}, Lti/h;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->H2()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final k3()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setupMainTabs: tabs-loaded = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->T2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lek/t;->j()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "GAMES_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "CUSTOM_LUAVIEW_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->Q2(Lcom/roblox/client/feature/FeatureState;)V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lvg/b;

    if-nez v0, :cond_2

    new-instance v0, Lvg/b;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, p0, v1}, Lvg/b;-><init>(Lvg/b$d;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lvg/b;

    invoke-virtual {v0}, Lvg/b;->c()V

    :cond_2
    invoke-static {}, Lrg/a1;->q0()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-direct {v0, p0}, Lcom/roblox/protocols/webview/WebViewProtocol;-><init>(Lcom/roblox/protocols/webview/a$d;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    :cond_3
    :goto_1
    return-void
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    invoke-virtual {v0}, Luh/t0;->l()V

    return-void
.end method

.method public final l3()Z
    .locals 1

    invoke-static {}, Lrg/a1;->q0()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public m(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "Request to end the game. Performing app restoration."

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->l0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "placeId"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roblox/client/ActivityNativeMain;->X:J

    const-string v0, "gameId"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->Y:Ljava/lang/String;

    :cond_0
    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object p1

    invoke-virtual {p1}, Lrg/y;->f()Lcom/roblox/client/game/c;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roblox/client/game/c;->l(Landroid/content/Context;)V

    sget-object p1, Luh/u0;->b:Luh/u0;

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->r3(Luh/u0;)V

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p0}, Lrg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "ROBLOXCrash"

    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {}, Luh/f;->j()Luh/f;

    move-result-object p1

    invoke-virtual {p1}, Luh/f;->z()V

    invoke-static {}, Luh/f;->j()Luh/f;

    move-result-object p1

    invoke-virtual {p1, v2}, Luh/f;->B(Z)V

    new-instance p1, Lrg/g;

    invoke-direct {p1, p0}, Lrg/g;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    const-string p1, "Experience has been ended in the background."

    invoke-static {v1, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v2, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    return-void
.end method

.method public m3(Lcom/roblox/client/feature/FeatureState;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ANM.showFeature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lph/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lph/a;->g(Lcom/roblox/client/feature/FeatureState;)V

    return-void
.end method

.method public n()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/roblox/client/ActivityNativeMain$b;

    invoke-direct {v0, p0, p0}, Lcom/roblox/client/ActivityNativeMain$b;-><init>(Lcom/roblox/client/ActivityNativeMain;Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public n0()V
    .locals 1

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->i2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lyj/s2;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setWebviewUserAgent(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setWebviewUserAgent(Ljava/lang/String;)V

    return-void
.end method

.method public final n3()V
    .locals 4

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->h3()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->j2()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lch/b;->b()Lch/b;

    move-result-object v0

    invoke-virtual {v0}, Lch/b;->c()I

    move-result v0

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->t()I

    move-result v1

    if-lt v0, v1, :cond_1

    invoke-static {}, Lwg/a;->e()Lwg/a;

    move-result-object v0

    iget-wide v1, p0, Lcom/roblox/client/ActivityNativeMain;->X:J

    iget-object v3, p0, Lcom/roblox/client/ActivityNativeMain;->Y:Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2, v3}, Lwg/a;->i(Landroid/app/Activity;JLjava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public o0()Le4/q;
    .locals 0

    return-object p0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onActivityResult: requestCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " resultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Intent data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_5

    const/16 v2, 0x4e88

    const/4 v3, 0x1

    if-eq p1, v2, :cond_4

    const/16 v2, 0x4e8e

    if-eq p1, v2, :cond_3

    const/16 v0, 0x4e93

    if-eq p1, v0, :cond_1

    const/16 v0, 0x4e9c

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/a;->onActivityResult(IILandroid/content/Intent;)V

    return-void

    :cond_0
    invoke-static {}, Lxj/a;->a()V

    invoke-virtual {p0, v3}, Lcom/roblox/client/ActivityNativeMain;->j3(Z)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->c3()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lcm/a;->k()Lcm/a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcm/a;->e(Landroid/content/Intent;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "onActivityResult from FunCaptcha: code:"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", result:"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x65

    if-ne p2, p3, :cond_2

    const-string p2, "success"

    goto :goto_0

    :cond_2
    const-string p2, "dismiss"

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Luh/f;->j()Luh/f;

    move-result-object p1

    new-instance p2, Lmk/a;

    invoke-direct {p2, v3}, Lmk/a;-><init>(Z)V

    invoke-virtual {p1, p2}, Luh/f;->A(Lmk/c;)V

    new-instance p1, Lcom/roblox/client/feature/FeatureState;

    const-string p2, "HOME_TAG"

    invoke-direct {p1, p2}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->m3(Lcom/roblox/client/feature/FeatureState;)V

    return-void

    :cond_3
    if-ne p2, v0, :cond_5

    invoke-virtual {p0, p3}, Lcom/roblox/client/ActivityNativeMain;->U2(Landroid/content/Intent;)V

    return-void

    :cond_4
    iput-boolean v3, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    :cond_5
    return-void
.end method

.method public onBackButtonNotConsumedEvent(Loh/c;)V
    .locals 0
    .annotation runtime Lev/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->e3()V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->u0()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    sget v1, Lrg/m0;->j:I

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->m0(I)Landroidx/fragment/app/c;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/c;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/roblox/client/c;

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/roblox/client/c;->h3()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/roblox/client/c;->e3()Z

    move-result v0

    if-nez v0, :cond_6

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/WebViewProtocol;->t()V

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/roblox/client/c;->h3()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lcom/roblox/client/c;->e3()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    return-void

    :cond_2
    instance-of v1, v0, Lrg/y1;

    if-eqz v1, :cond_3

    check-cast v0, Lrg/y1;

    invoke-virtual {v0}, Lrg/y1;->J2()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lrg/y1;->G2()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    return-void

    :cond_3
    invoke-static {p0}, Lpj/f;->d(Le4/q;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "rbx.main"

    const-string v1, "onBackPressed: BACK button is handled for QrCodeScanner."

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lph/a;

    move-result-object v0

    invoke-virtual {v0}, Lph/a;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    return-void

    :cond_7
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->e3()V

    return-void
.end method

.method public onCodeParsedFromSMS(Loh/j;)V
    .locals 2
    .annotation runtime Lev/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "SMS code received."

    const-string v1, "rbx.main"

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

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Lj/b;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    sget-object v0, Lkk/h;->a:Lkk/h;

    invoke-virtual {v0, p1}, Lkk/h;->d(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->l3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->m0:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->C()V

    invoke-static {}, Lrg/a1;->l0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->z2(Landroid/content/res/Configuration;)V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11

    invoke-static {}, Lcom/roblox/client/startup/ActivitySplash;->r2()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "rbx.main"

    if-nez v0, :cond_0

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "RESTART_AFTER_PROCESS_DEATH"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lyj/k0;->x(Z)V

    invoke-static {}, Lyj/k0;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "onCreate: App was previously destroyed due to process death"

    invoke-static {v2, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Lcom/roblox/client/a;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    :cond_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->L3()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-boolean v0, Lcom/roblox/client/ActivityNativeMain;->q0:Z

    if-nez v0, :cond_1

    const-string v0, "onCreate: Activity recreated"

    invoke-static {v2, v0}, Lek/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "activity_recreated"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sput-boolean v1, Lcom/roblox/client/ActivityNativeMain;->q0:Z

    :cond_2
    :goto_0
    invoke-static {p0}, Lek/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "foreground"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "background_process_detected"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_3
    const-string v0, "main_activity_oncreate"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/roblox/client/a;->onCreate(Landroid/os/Bundle;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate NativeMain. savedInstanceState is null: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    if-nez p1, :cond_4

    move v4, v3

    goto :goto_1

    :cond_4
    move v4, v1

    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-nez v0, :cond_5

    new-instance v0, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-direct {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->c()V

    :cond_5
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->v3()Z

    move-result v0

    if-eqz v0, :cond_6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v0, v4, :cond_6

    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->getCurrentThermalStatus()I

    move-result v0

    add-int/lit16 v0, v0, 0x3e8

    int-to-long v4, v0

    const-string v0, "android_thermal_throttling"

    invoke-static {v0, v4, v5}, Lcom/roblox/universalapp/logging/LoggingProtocol;->h(Ljava/lang/String;J)V

    :cond_6
    invoke-static {}, Loi/b;->f()Loi/b;

    move-result-object v0

    invoke-virtual {v0}, Loi/b;->j()Loi/f;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Loi/f;

    invoke-static {p0}, Lyj/k0;->s(Landroid/content/Context;)Lyj/k0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lyj/k0;->N(Lyj/n0;)V

    sget v0, Lrg/n0;->d:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/a;->setContentView(I)V

    if-eqz p1, :cond_7

    const-string v0, "BACK_FROM_GAME"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    :cond_7
    invoke-static {p0}, Lhm/a;->c(Landroid/content/Context;)V

    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    if-nez v0, :cond_8

    invoke-static {}, Lhm/a;->j()Lhm/a;

    move-result-object v0

    sget-object v4, Lhm/a$a;->b:Lhm/a$a;

    invoke-virtual {v0, v4, p1}, Lhm/a;->a(Lhm/a$a;Landroid/os/Bundle;)V

    :cond_8
    sget p1, Lrg/m0;->i:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    sget p1, Lrg/m0;->W:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    invoke-static {}, Lyj/q2;->b()Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    const/high16 v0, -0x1000000

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_2

    :cond_9
    sget p1, Lrg/m0;->S:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewStub;

    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    :goto_2
    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object p1

    invoke-virtual {p1}, Lrg/y;->f()Lcom/roblox/client/game/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/game/c;->h()Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    new-instance v0, Lrg/m;

    invoke-direct {v0, p0}, Lrg/m;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    :cond_a
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->C2()V

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppShellReloadNeededListener(Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;)V

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->e0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-nez p1, :cond_b

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->p0()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->E3()J

    move-result-wide v6

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Setup mPendingPurchaseExecutor to run every "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " seconds"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v4, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-direct {v4, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    iput-object v4, p0, Lcom/roblox/client/ActivityNativeMain;->e0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v5, Lcom/roblox/client/ActivityNativeMain$c;

    invoke-direct {v5, p0}, Lcom/roblox/client/ActivityNativeMain$c;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v8, v6

    invoke-virtual/range {v4 .. v10}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_b
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->b2()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object p1

    invoke-virtual {p1}, Lrg/y;->g()Lgm/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Lgm/f;->n(Le/p;)V

    goto :goto_4

    :cond_c
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->f3()V

    :goto_4
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->W1()Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Lbk/h;

    if-nez p1, :cond_d

    new-instance p1, Lbk/h;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p1, v0}, Lbk/h;-><init>(Landroid/os/Handler;)V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Lbk/h;

    invoke-virtual {p1}, Lbk/h;->a()V

    :cond_d
    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object p1

    invoke-virtual {p1}, Lhj/r;->u()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->d3()V

    :cond_e
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->h3()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->a:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_f
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->X0()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/client/shortcuts/PinShortcutHandler;->INSTANCE:Lcom/roblox/client/shortcuts/PinShortcutHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_10
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->F5()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_11
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->Q()Z

    move-result p1

    if-nez p1, :cond_12

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->c5()Z

    move-result p1

    if-eqz p1, :cond_13

    :cond_12
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->INSTANCE:Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_13
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance p1, Lrg/n;

    invoke-direct {p1, p0}, Lrg/n;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->O(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->Z4()Z

    move-result p1

    if-eqz p1, :cond_14

    sget-object p1, Lni/m;->a:Lni/m;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lrg/o;

    invoke-direct {v1, p1}, Lrg/o;-><init>(Lni/m;)V

    invoke-virtual {v0, v1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->H(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V

    goto :goto_5

    :cond_14
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->V0()Z

    move-result p1

    if-eqz p1, :cond_15

    new-instance p1, Lrg/c;

    invoke-direct {p1, p0}, Lrg/c;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->K(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V

    :cond_15
    :goto_5
    invoke-static {}, Lqh/k;->a()Z

    move-result p1

    if-eqz p1, :cond_16

    new-instance p1, Lqh/a;

    const/4 v0, 0x3

    const-wide/16 v4, 0x7d0

    invoke-direct {p1, v0, v4, v5}, Lqh/a;-><init>(IJ)V

    const-string v0, "webrtcsdk"

    invoke-static {v0, p1}, Lrg/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lqh/h;->r(Ljava/util/Map;)V

    const-string p1, "Requesting WebRTC SDK module download immediately."

    invoke-static {v2, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lqh/h;->m(Ljava/lang/String;)V

    :cond_16
    invoke-static {}, Lek/v;->b()Z

    move-result p1

    if-eqz p1, :cond_17

    sget-object p1, Lqh/h;->a:Lqh/h;

    invoke-static {p1, v2}, Lek/v;->a(Lqh/h;Ljava/lang/String;)V

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_17
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->r5()Z

    move-result p1

    if-eqz p1, :cond_19

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->p2()Z

    move-result p1

    if-eqz p1, :cond_18

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Ldl/g;->a:Ldl/g;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    goto :goto_6

    :cond_18
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Ldl/d;->a:Ldl/d;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_19
    :goto_6
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->INSTANCE:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance p1, Lsg/a;

    invoke-direct {p1}, Lsg/a;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->o0:Lsg/a;

    invoke-virtual {p1, p0}, Lsg/a;->d(Lj/b;)V

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Luh/i;

    if-nez p1, :cond_1a

    new-instance p1, Luh/i;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Luh/i;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Luh/i;

    invoke-virtual {p1}, Luh/i;->o()V

    :cond_1a
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Luh/a1;

    if-nez p1, :cond_1b

    new-instance p1, Luh/a1;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Luh/a1;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Luh/a1;

    invoke-virtual {p1}, Luh/a1;->a()V

    :cond_1b
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->V2()Z

    move-result p1

    if-eqz p1, :cond_1c

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Luh/v0;->a:Luh/v0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_1c
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-static {}, Lgl/b;->a()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->k1()Z

    move-result p1

    if-eqz p1, :cond_1d

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_1d
    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object p1

    invoke-virtual {p1}, Lti/h;->i()Z

    move-result p1

    if-eqz p1, :cond_1e

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {}, Lhj/r;->l()Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    invoke-virtual {v0}, Lti/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "recipient_user_id"

    invoke-direct {v1, v2, v0}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "androidNotificationsSettings"

    const-string v1, "onAppForeground"

    invoke-static {v0, v1, p1, v3}, Lug/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    :cond_1e
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/client/startup/a;->g(Landroid/content/Context;)V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-static {}, Lyj/k0;->B()Z

    move-result v0

    const-string v1, "rbx.main"

    if-eqz v0, :cond_0

    const-string v0, "onDestroy: App was previously destroyed due to process death"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0}, Lcom/roblox/client/a;->onDestroy()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDestroy. isFinishing = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppShellReloadNeededListener(Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;)V

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    iget-object v1, v1, Luh/t0;->a:Luh/u0;

    sget-object v2, Luh/u0;->a:Luh/u0;

    if-ne v1, v2, :cond_1

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v1

    invoke-virtual {v1}, Lrg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/roblox/client/game/c;->g(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    invoke-static {p0, v1}, Lcom/roblox/client/ActivityNativeMain;->g3(Lcom/roblox/client/ActivityNativeMain;Z)V

    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    invoke-static {p0}, Lyj/k0;->s(Landroid/content/Context;)Lyj/k0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lyj/k0;->S(Lyj/n0;)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lvg/b;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lvg/b;->e()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lvg/b;

    :cond_2
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->W1()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Lbk/h;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lbk/h;->b()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Lbk/h;

    :cond_3
    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->o0:Lsg/a;

    invoke-virtual {v1}, Lsg/a;->e()V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Luh/i;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Luh/i;->q()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Luh/i;

    :cond_4
    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Luh/a1;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Luh/a1;->b()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Luh/a1;

    :cond_5
    invoke-super {p0}, Lcom/roblox/client/a;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    sget-object v0, Lkk/h;->a:Lkk/h;

    invoke-virtual {v0, p2}, Lkk/h;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Lj/b;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    sget-object v0, Lkk/h;->a:Lkk/h;

    invoke-virtual {v0, p2}, Lkk/h;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onNavigateToConversationEvent(Loh/f;)V
    .locals 4
    .annotation runtime Lev/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    iget-wide v0, p1, Loh/f;->b:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->Z2(J)V

    return-void

    :cond_0
    iget-wide v0, p1, Loh/f;->a:J

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->W2(J)V

    return-void
.end method

.method public onNavigateToFeatureEvent(Loh/g;)V
    .locals 13
    .annotation runtime Lev/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NavigateToFeature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FRIEND_FINDER_TAG"

    iget-object v2, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "UNIVERSAL_FRIENDS_TAG"

    iget-object v2, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->G2()Loh/g;

    move-result-object p1

    :cond_1
    const-string v0, "PROFILE_TAG"

    iget-object v2, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lrg/q0;->I:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v2, p1, Loh/g;->b:Ljava/lang/String;

    iget-boolean v4, p1, Loh/g;->e:Z

    invoke-virtual {p1}, Loh/g;->f()Z

    move-result v5

    const/4 v6, 0x1

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lrg/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    move-object v7, v1

    return-void

    :cond_2
    move-object v7, p0

    const-string v0, "GAME_DETAILS_TAG"

    iget-object v2, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "games/"

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lrg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Loh/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v1, Lrg/q0;->v:I

    iget-boolean v2, p1, Loh/g;->e:Z

    invoke-virtual {p1}, Loh/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lrg/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_3
    const-string v0, "CUSTOM_WEBVIEW_TAG"

    iget-object v3, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "YOUTUBE_TAG"

    if-nez v0, :cond_f

    iget-object v0, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v0, "SOCIAL_MEDIA_TAG"

    iget-object v3, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lim/a;

    invoke-direct {v0, v1}, Lim/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Loh/g;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lim/a;->h(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_5
    const-string v0, "MY_FEED_TAG"

    iget-object v3, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lrg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "feeds/inapp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v1, Lrg/q0;->G:I

    iget-boolean v2, p1, Loh/g;->e:Z

    invoke-virtual {p1}, Loh/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lrg/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_6
    const-string v0, "SEARCH_GAMES_TAG"

    iget-object v3, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p1, Loh/g;->b:Ljava/lang/String;

    invoke-static {v0}, Lrg/a1;->H0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lrg/q0;->J:I

    iget-boolean v2, p1, Loh/g;->e:Z

    invoke-virtual {p1}, Loh/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lrg/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_7
    const-string v0, "GAMES_SEE_ALL_TAG"

    iget-object v3, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Loh/g;->b:Ljava/lang/String;

    invoke-static {v0}, Lrg/a1;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lrg/q0;->D:I

    iget-boolean v2, p1, Loh/g;->e:Z

    invoke-virtual {p1}, Loh/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lrg/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_8
    const-string v0, "ABUSE_REPORT_TAG"

    iget-object v3, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p1, Loh/g;->b:Ljava/lang/String;

    invoke-virtual {p1}, Loh/g;->f()Z

    move-result p1

    invoke-static {p0, v0, p1}, Lrg/q;->d(Landroid/app/Activity;Ljava/lang/String;Z)V

    return-void

    :cond_9
    const-string v0, "ANIMATED_ASSET_DETAILS_TAG"

    iget-object v3, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p1, Loh/g;->b:Ljava/lang/String;

    if-eqz v0, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lrg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "catalog/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Loh/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lrg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    sget v0, Lrg/q0;->M:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    iget-boolean v10, p1, Loh/g;->e:Z

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lrg/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void

    :cond_b
    const-string v0, "CAPTCHA_SUCCESS_TAG"

    iget-object v2, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string p1, "NavigateToFeature: Received \'CAPTCHA_SUCCESS\' tag. Do nothing for now."

    invoke-static {v1, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_c
    const-string v0, "CAPTCHA_TAG"

    iget-object v1, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Loh/g;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->c3(Ljava/lang/String;)V

    return-void

    :cond_d
    const-string v0, "SCAN_QR_CODE"

    iget-object v1, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget p1, v7, Lcom/roblox/client/ActivityNativeMain;->Z:I

    invoke-static {p0, p1}, Lpj/f;->f(Le4/q;I)V

    return-void

    :cond_e
    iget-object v0, p1, Loh/g;->a:Ljava/lang/String;

    invoke-static {p0, v0}, Lph/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Loh/g;->b:Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lcom/roblox/client/ActivityNativeMain;->Y2(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_f
    :goto_2
    const/4 v0, 0x0

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Loh/g;->d()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    const-string v2, "Exception parsing data onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG"

    invoke-static {v1, v2}, Lek/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    move-object v2, v0

    :goto_3
    if-eqz v2, :cond_15

    const-string v4, "title"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "url"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_14

    iget-object v6, p1, Loh/g;->a:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {}, Lrg/a1;->q0()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_4

    :cond_10
    const-string p1, "Unable to handle youtube links on Maquettes device."

    invoke-static {v1, p1}, Lek/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_11
    iget-boolean p1, p1, Loh/g;->e:Z

    if-nez p1, :cond_12

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, v5, v4, p1, v0}, Lrg/q;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_4

    :cond_12
    const-string p1, "searchParams"

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_13
    invoke-static {p0, v5, v4, v0}, Lrg/q;->g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_14
    const-string p1, "URL must not be empty onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG"

    invoke-static {v1, p1}, Lek/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :cond_15
    :goto_4
    return-void
.end method

.method public onNavigateToLuaEvent(Lcom/roblox/client/c$h;)V
    .locals 0
    .annotation runtime Lev/j;
    .end annotation

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->e()V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onNewIntent(Landroid/content/Intent;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->t2()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    const-string v0, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "rbx.main"

    const-string v1, "onNewIntent: received notification intent."

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhj/r;->G(Landroid/os/Bundle;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onPause()V
    .locals 3

    invoke-super {p0}, Lcom/roblox/client/a;->onPause()V

    const-string v0, "onPause"

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcm/a;->k()Lcm/a;

    move-result-object v0

    invoke-virtual {v0}, Lcm/a;->m()V

    invoke-static {}, Lhm/a;->j()Lhm/a;

    move-result-object v0

    sget-object v2, Lhm/a$a;->b:Lhm/a$a;

    invoke-virtual {v0, v2}, Lhm/a;->b(Lhm/a$a;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->l3()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->D2()V

    :cond_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->g4()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "onPause: NotificationManager removerObserver"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lti/e;->c()Lti/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lti/e;->g(Lti/e$e;)V

    :cond_1
    invoke-static {}, Lwl/c;->i()Lwl/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lwl/c;->k(Landroid/content/Context;)V

    const-string v0, "onAppBackground"

    invoke-static {v0}, Lrg/t0;->k(Ljava/lang/String;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Le4/q;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->k()Lmm/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lmm/k;->Q(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 5

    invoke-super {p0}, Lcom/roblox/client/a;->onResume()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onResume: IsLoggedIn = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v1

    invoke-virtual {v1}, Lti/h;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lwl/c;->i()Lwl/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lwl/c;->j(Landroid/content/Context;)V

    invoke-static {}, Loi/b;->f()Loi/b;

    move-result-object v0

    invoke-virtual {v0}, Loi/b;->j()Loi/f;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Loi/f;

    if-eq v2, v0, :cond_0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Loi/f;

    const-string v0, "onResume: Recreating activity due to Locale change."

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    return-void

    :cond_0
    invoke-static {p0}, Lyj/k0;->s(Landroid/content/Context;)Lyj/k0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lyj/k0;->N(Lyj/n0;)V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->q3()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    iget-object v0, v0, Luh/t0;->a:Luh/u0;

    sget-object v3, Luh/u0;->a:Luh/u0;

    if-ne v0, v3, :cond_2

    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object v0

    invoke-virtual {v0}, Lhj/r;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roblox/client/game/c;->g(Z)V

    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    if-eqz v0, :cond_3

    invoke-static {}, Luh/f;->j()Luh/f;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Luh/f;->B(Z)V

    iput-boolean v2, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    :cond_3
    invoke-static {}, Lrg/a1;->l0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->z2(Landroid/content/res/Configuration;)V

    :cond_4
    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->k()Lmm/k;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmm/k;->d0(Landroid/app/Activity;)V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->k()Lmm/k;

    move-result-object v0

    invoke-virtual {v0}, Lmm/k;->c0()V

    invoke-static {}, Lcm/a;->k()Lcm/a;

    move-result-object v0

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/roblox/client/ShareAppChosenReceiver;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v3, Lrg/i;

    invoke-direct {v3, p0}, Lrg/i;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    const/16 v4, 0x4e9c

    invoke-virtual {v0, p0, v2, v4, v3}, Lcm/a;->l(Lj/b;Landroid/content/Intent;ILcm/a$g;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->b2()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "Setting result launcher for IdentityProtocol"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->g()Lgm/f;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->g0:Lg/c;

    invoke-virtual {v0, v1}, Lgm/f;->y(Lg/c;)V

    :cond_5
    invoke-static {}, Lek/t;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->e()Lzl/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Lzl/r;->x(Landroid/app/Activity;)V

    :cond_6
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "BACK_FROM_GAME"

    iget-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 2

    invoke-super {p0}, Lcom/roblox/client/a;->onStart()V

    invoke-static {}, Lhm/a;->j()Lhm/a;

    move-result-object v0

    invoke-virtual {v0}, Lhm/a;->g()V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->b()V

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    sput-object v0, Lrg/e2;->a:Landroid/util/DisplayMetrics;

    sget v0, Lcom/roblox/client/a;->R:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    iget-object v0, v0, Luh/t0;->a:Luh/u0;

    sget-object v1, Luh/u0;->b:Luh/u0;

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationForegrounded()V

    :cond_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->x5()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "rbx.main"

    const-string v1, "onStart: App is going to foreground. setAppSuspended(false)"

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeReportingInterface;->setAppSuspended(Z)V

    :cond_1
    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lev/c;->n(Ljava/lang/Object;)V

    invoke-static {}, Luk/h;->j()Luk/h;

    move-result-object v0

    invoke-static {}, Luh/f;->j()Luh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Luk/h;->k(Luk/h$d;)V

    const-string v0, "main"

    invoke-static {v0}, Lrg/t0;->v(Ljava/lang/String;)V

    invoke-static {}, Lfm/b;->h()Lfm/b;

    move-result-object v0

    invoke-virtual {v0}, Lfm/b;->e()V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    iget-object v0, v0, Luh/t0;->a:Luh/u0;

    sget-object v1, Luh/u0;->a:Luh/u0;

    if-ne v0, v1, :cond_2

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->p()V

    :cond_2
    invoke-static {}, Lnm/a;->c()Lnm/a;

    move-result-object v0

    invoke-virtual {v0}, Lnm/a;->a()V

    return-void
.end method

.method public onStop()V
    .locals 4

    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lev/c;->p(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->a()V

    sget v0, Lcom/roblox/client/a;->R:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    iget-object v0, v0, Luh/t0;->a:Luh/u0;

    sget-object v2, Luh/u0;->b:Luh/u0;

    if-ne v0, v2, :cond_0

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationBackgrounded()V

    :cond_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->x5()Z

    move-result v0

    const-string v2, "rbx.main"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    iget-object v0, v0, Luh/t0;->a:Luh/u0;

    sget-object v3, Luh/u0;->b:Luh/u0;

    if-ne v0, v3, :cond_1

    const-string v0, "onStop: App is going to background. setAppSuspended(true)"

    invoke-static {v2, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lcom/roblox/engine/jni/NativeReportingInterface;->setAppSuspended(Z)V

    :cond_1
    invoke-static {}, Luk/h;->j()Luk/h;

    move-result-object v0

    invoke-static {}, Luh/f;->j()Luh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Luk/h;->m(Luk/h$d;)V

    invoke-static {}, Lfm/b;->h()Lfm/b;

    move-result-object v0

    invoke-virtual {v0}, Lfm/b;->f()V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    iget-object v0, v0, Luh/t0;->a:Luh/u0;

    sget-object v1, Luh/u0;->a:Luh/u0;

    if-ne v0, v1, :cond_2

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->n()V

    :cond_2
    invoke-static {}, Lnm/a;->c()Lnm/a;

    move-result-object v0

    invoke-virtual {v0}, Lnm/a;->b()V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->g4()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "onStop: NotificationManager removerObserver"

    invoke-static {v2, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lti/e;->c()Lti/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lti/e;->g(Lti/e$e;)V

    :cond_3
    invoke-super {p0}, Lcom/roblox/client/a;->onStop()V

    const-string v0, "onStop"

    invoke-static {v2, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onTrimMemory(I)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->Q2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lug/c0;->s(I)V

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    invoke-virtual {v0, p1}, Luh/t0;->j(I)V

    return-void
.end method

.method public final p3(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/RobloxWebActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "URL_EXTRA"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget p1, Lrg/g0;->b:I

    sget v0, Lrg/g0;->c:I

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public final q3()V
    .locals 2

    const-string v0, "startup:"

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lyj/k0;->s(Landroid/content/Context;)Lyj/k0;

    move-result-object v0

    invoke-virtual {v0}, Lyj/k0;->v()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    invoke-virtual {v0}, Lti/h;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lek/t;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Incomplete initialization, restarting app"

    invoke-static {v1, v0}, Lek/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->SHELL_PROCESS_RESTART:Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->o2(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    :cond_0
    invoke-static {p0}, Lyj/k0;->s(Landroid/content/Context;)Lyj/k0;

    move-result-object v0

    invoke-virtual {v0}, Lyj/k0;->Q()V

    return-void
.end method

.method public r(Ljava/lang/String;)Landroidx/fragment/app/c;
    .locals 1

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->n0(Ljava/lang/String;)Landroidx/fragment/app/c;

    move-result-object p1

    return-object p1
.end method

.method public r3(Luh/u0;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    invoke-virtual {v0, p1}, Luh/t0;->k(Luh/u0;)V

    return-void
.end method

.method public final z2(Landroid/content/res/Configuration;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Luh/t0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Luh/t0;->a:Luh/u0;

    sget-object v1, Luh/u0;->a:Luh/u0;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0, p1}, Lrg/c2;->a(Landroid/view/Window;Landroid/content/res/Configuration;)V

    return-void
.end method
