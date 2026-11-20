.class public Lti/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lti/b$c;,
        Lti/b$d;
    }
.end annotation


# static fields
.field public static d:Z

.field public static e:Z

.field public static final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static g:Z


# instance fields
.field public volatile a:Z

.field public b:Z

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lti/b;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lti/b;->a:Z

    .line 4
    const-string v0, "rbx.AppManager"

    const-string v1, "[AppManager]: Constructor called."

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public synthetic constructor <init>(Lti/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lti/b;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-static {p0}, Lrg/t;->c(Landroid/content/Context;)V

    invoke-static {}, Lrg/a1;->t()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "content/guac/defaultConfigs/GuacDefaultPolicy-"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".json"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetDefaultAppPolicyFile(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic b(Z)V
    .locals 0

    sput-boolean p0, Lti/b;->d:Z

    return-void
.end method

.method public static e()Z
    .locals 2

    sget-boolean v0, Lti/b;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-boolean v1, Lti/b;->e:Z

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public static f()Lti/b;
    .locals 1

    invoke-static {}, Lti/b$c;->a()Lti/b;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/os/Bundle;)Lti/b$d;
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "logout_type"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p0

    check-cast p0, Lti/b$d;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "rbx.AppManager"

    const-string v0, "getLogoutTypeFromBundle: Logic error: Cannot find LogoutType enum in bundle!"

    invoke-static {p0, v0}, Lek/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lti/b$d;->a:Lti/b$d;

    return-object p0
.end method

.method public static m()Z
    .locals 1

    sget-boolean v0, Lti/b;->g:Z

    return v0
.end method

.method public static p()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lti/b;->e:Z

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;)V
    .locals 3

    const-string v0, "DeviceInstallPreferences"

    invoke-static {p1, v0}, Lek/z;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "AppFirstLaunch"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lti/b;->b:Z

    if-eqz v0, :cond_0

    const-string v0, "rbx.AppManager"

    const-string v2, "First App launch!"

    invoke-static {v0, v2}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lti/g;->b()Lti/g;

    move-result-object v0

    invoke-virtual {v0}, Lti/g;->f()V

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v0, "AppFirstLaunchTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public final d(Lti/b$d;)V
    .locals 4

    sget-object v0, Lti/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "manual"

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    const-string v3, "luaapp"

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    const-string v2, "failedSessionCheck"

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fireLogoutEvent: Unknown logoutType:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.AppManager"

    invoke-static {v0, p1}, Lek/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-static {v2, v3}, Lrg/t0;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string p1, "webview"

    invoke-static {v2, p1}, Lrg/t0;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p1, "native"

    invoke-static {v2, p1}, Lrg/t0;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-static {v2, v3}, Lrg/t0;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    invoke-static {v2, v2}, Lrg/t0;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lti/b;->g:Z

    return-void
.end method

.method public i(Landroid/app/Activity;Lti/b$d;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleLogout: logoutType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activity = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.AppManager"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->S1()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lti/b$d;->c:Lti/b$d;

    if-eq p2, v0, :cond_0

    sget-object v0, Lti/b$d;->d:Lti/b$d;

    if-eq p2, v0, :cond_0

    sget-object v0, Lti/b$d;->e:Lti/b$d;

    if-ne p2, v0, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lti/b;->o(Lti/b$d;)V

    :cond_1
    const/4 v0, 0x1

    sput-boolean v0, Lti/b;->d:Z

    invoke-virtual {p0, p2}, Lti/b;->d(Lti/b$d;)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "logout_type"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v2

    invoke-interface {v2}, Lrh/i;->v5()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Lek/c;->g()Lek/c;

    move-result-object v2

    invoke-virtual {v2}, Lek/c;->c()V

    invoke-static {}, Lrg/a1;->Y0()V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v2

    invoke-virtual {v2}, Lrg/y;->d()Lti/d;

    move-result-object v2

    invoke-virtual {v2}, Lti/d;->b()V

    :cond_2
    invoke-static {p1}, Lcom/roblox/client/ossearch/b;->f(Landroid/content/Context;)V

    sget-object v2, Lti/b$d;->a:Lti/b$d;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-ne p2, v2, :cond_5

    instance-of p2, p1, Lcom/roblox/client/a;

    if-eqz p2, :cond_3

    move-object v3, p1

    check-cast v3, Lcom/roblox/client/a;

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {v3, v3}, Lcom/roblox/client/a;->d2(Landroid/content/Context;)V

    :cond_4
    invoke-static {p1}, Lyj/k0;->s(Landroid/content/Context;)Lyj/k0;

    move-result-object p2

    new-instance v2, Lti/b$a;

    invoke-direct {v2, p0, p1, v3, v1}, Lti/b$a;-><init>(Lti/b;Landroid/app/Activity;Lcom/roblox/client/a;Landroid/os/Bundle;)V

    invoke-virtual {p2, p1, v0, v2}, Lyj/k0;->C(Landroid/content/Context;ZLvi/c$b;)V

    goto :goto_0

    :cond_5
    invoke-static {p1}, Lyj/k0;->s(Landroid/content/Context;)Lyj/k0;

    move-result-object p2

    invoke-virtual {p2, p1, v4, v3}, Lyj/k0;->C(Landroid/content/Context;ZLvi/c$b;)V

    invoke-static {}, Lti/e;->c()Lti/e;

    move-result-object p2

    const/4 v0, 0x2

    invoke-virtual {p2, v0, v1}, Lti/e;->f(ILandroid/os/Bundle;)V

    sput-boolean v4, Lti/b;->d:Z

    :goto_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p2

    invoke-interface {p2}, Lrh/i;->R3()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x2000

    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setFlags(II)V

    :cond_6
    sput-boolean v4, Lti/b;->g:Z

    return-void
.end method

.method public j(Landroid/app/Activity;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleSwitchAccount activity = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.AppManager"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    sput-boolean v0, Lti/b;->d:Z

    invoke-static {}, Lrg/t0;->z()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "logout_type"

    sget-object v2, Lti/b$d;->b:Lti/b$d;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->v5()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lek/c;->g()Lek/c;

    move-result-object v1

    invoke-virtual {v1}, Lek/c;->c()V

    invoke-static {}, Lrg/a1;->Y0()V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v1

    invoke-virtual {v1}, Lrg/y;->d()Lti/d;

    move-result-object v1

    invoke-virtual {v1}, Lti/d;->b()V

    :cond_0
    invoke-static {p1}, Lcom/roblox/client/ossearch/b;->f(Landroid/content/Context;)V

    invoke-static {p1}, Lyj/k0;->s(Landroid/content/Context;)Lyj/k0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2}, Lyj/k0;->C(Landroid/content/Context;ZLvi/c$b;)V

    invoke-static {}, Lti/e;->c()Lti/e;

    move-result-object p1

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lti/e;->f(ILandroid/os/Bundle;)V

    sput-boolean v3, Lti/b;->d:Z

    sput-boolean v3, Lti/b;->g:Z

    return-void
.end method

.method public k(Landroid/content/Context;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-class v0, Lti/b;

    monitor-enter v0

    :try_start_0
    const-string v1, "rbx.AppManager"

    const-string v2, "initialize: Start..."

    invoke-static {v1, v2}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v1, p0, Lti/b;->a:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lti/b;->n()V

    const-string p1, "rbx.AppManager"

    const-string v1, "initialize: Already initialized."

    invoke-static {p1, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {p0, p1}, Lti/b;->l(Landroid/content/Context;)V

    const/4 p1, 0x0

    sput-boolean p1, Lti/b;->g:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lti/b;->a:Z

    invoke-virtual {p0}, Lti/b;->n()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-string p1, "rbx.AppManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initialize: Completed OK. elapsedTime(ms) = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final l(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lek/z;->e(Landroid/content/Context;)Lek/z;

    invoke-static {p1}, Lrg/a1;->g0(Landroid/content/Context;)V

    invoke-static {}, Lrg/a1;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lrg/a1;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetBaseUrl(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lrg/a1;->W()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetRobloxChannel(Ljava/lang/String;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->S1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Luk/e;->e()Luk/e$a;

    move-result-object v0

    sget-object v1, Luk/e$a;->c:Luk/e$a;

    const-string v2, "rbx.AppManager"

    if-ne v0, v1, :cond_0

    const-string v0, "cookie_migrated"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    const-string v0, "VersionB: cookies migrated from WebView to native storage."

    invoke-static {v2, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    sget-object v1, Luk/e$a;->b:Luk/e$a;

    if-ne v0, v1, :cond_1

    const-string v0, "cookie_loaded"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    const-string v0, "VersionB: cookies loaded from native storage."

    invoke-static {v2, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    new-instance v0, Lli/c;

    invoke-direct {v0}, Lli/c;-><init>()V

    invoke-static {v0}, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->setImplementation(Lqk/a;)V

    invoke-static {p1}, Lyj/p2;->b(Landroid/content/Context;)V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->l()Ltk/f;

    move-result-object v0

    invoke-static {v0}, Ltk/g;->i(Ltk/f;)V

    invoke-static {}, Lrg/y;->h()Lrg/y;

    move-result-object v0

    invoke-virtual {v0}, Lrg/y;->p()Ltj/a;

    invoke-static {}, Lti/h;->e()Lti/h;

    invoke-static {}, Lrg/u;->g()Lrg/u;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lrg/u;->d(Lrg/u$c;)V

    invoke-static {}, Lwg/a;->e()Lwg/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lwg/a;->g(Landroid/content/Context;)V

    invoke-static {}, Lmh/d;->b()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {}, Loi/b;->f()Loi/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Loi/b;->q(Ljava/util/Locale;)V

    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhj/r;->x(Landroid/content/Context;)V

    new-instance v0, Luj/b;

    invoke-direct {v0}, Luj/b;-><init>()V

    invoke-static {v0}, Lkk/d;->c(Lkk/d$a;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lorg/webrtc/ContextUtils;->initialize(Landroid/content/Context;)V

    invoke-static {}, Lkk/c;->p()Lkk/c;

    move-result-object v0

    new-instance v1, Lti/a;

    invoke-direct {v1, p1}, Lti/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lkk/c;->s(Ljava/util/function/Consumer;)V

    invoke-static {}, Lkk/c;->p()Lkk/c;

    move-result-object p1

    invoke-virtual {p1}, Lkk/c;->x()V

    return-void
.end method

.method public final n()V
    .locals 3

    invoke-static {}, Lrg/a1;->a1()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ROBLOX\n| User-Agent = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n| Build = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lek/h;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ID = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lrg/a1;->K()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n| Version = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "2.746.1266"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", Code = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5164

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n| BaseUrl = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lrg/a1;->H()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n| OS Ver. = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", Lvl = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n| Arch = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lrg/u;->g()Lrg/u;

    move-result-object v0

    invoke-virtual {v0}, Lrg/u;->i()Lrg/u$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n| Is domain set = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ltk/g;->c()Ltk/b;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.AppManager"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public o(Lti/b$d;)V
    .locals 30

    const-string v0, "native_cookie_delete_source"

    const-string v1, "native_cookie_write_source"

    const-string v2, "engine_has_roblosecurity"

    const-string v3, "shell_has_roblosecurity"

    const-string v4, "has_cached_user"

    const-string v5, "was_logged_in"

    const-string v6, "logout_type"

    const-string v7, "rbx.AppManager"

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v8

    invoke-interface {v8}, Lrh/i;->S1()Z

    move-result v8

    if-nez v8, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v8

    invoke-virtual {v8}, Lti/h;->f()Z

    move-result v8

    invoke-static {}, Lti/h;->h()Z

    move-result v9

    invoke-static {}, Lrg/a1;->u()Z

    move-result v10

    invoke-static {}, Luk/j;->c()Luk/j;

    move-result-object v11

    invoke-static {}, Lrg/a1;->g()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Luk/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_1

    const-string v14, ".ROBLOSECURITY=_"

    invoke-virtual {v11, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    const/4 v11, 0x0

    :goto_0
    invoke-static {}, Luk/e;->j()Ljava/lang/String;

    move-result-object v14

    invoke-static {}, Luk/e;->e()Luk/e$a;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {}, Luk/e;->i()J

    move-result-wide v16

    const-wide/16 v18, 0x0

    cmp-long v20, v16, v18

    const-wide/16 v21, -0x1

    const-wide/16 v23, 0x3e8

    if-lez v20, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v25

    sub-long v25, v25, v16

    div-long v25, v25, v23

    goto :goto_1

    :cond_2
    move-wide/from16 v25, v21

    :goto_1
    invoke-static {}, Luk/e;->h()Ljava/lang/String;

    move-result-object v12

    invoke-static {}, Luk/e;->g()J

    move-result-wide v27

    cmp-long v18, v27, v18

    if-lez v18, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    sub-long v18, v18, v27

    div-long v21, v18, v23

    :cond_3
    invoke-static {}, Luk/e;->f()Ljava/lang/String;

    move-result-object v13

    move/from16 v19, v8

    new-instance v8, Lqm/c$a;

    move/from16 v23, v9

    const-string v9, "cookie_versionb_did_logout"

    sget-object v24, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    move/from16 v29, v10

    invoke-static/range {v24 .. v24}, Lwf/k;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Lqm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/16 v9, 0xa

    const/16 v10, 0xd

    move/from16 v24, v11

    const/16 v11, 0x7ea

    invoke-virtual {v8, v11, v9, v10}, Lqm/c$a;->j(III)Lqm/c$a;

    move-result-object v8

    invoke-virtual {v8}, Lqm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v8

    new-instance v9, Lqm/c$b;

    invoke-direct {v9}, Lqm/c$b;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v6, v10}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v5, v10}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    invoke-static/range {v23 .. v23}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v4, v10}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    invoke-static/range {v24 .. v24}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v3, v10}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    invoke-static/range {v29 .. v29}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v2, v10}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    const-string v10, "webview_state"

    invoke-virtual {v9, v10, v14}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    const-string v10, "migration_result"

    invoke-virtual {v9, v10, v15}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    const-string v10, "native_cookie_age_bucket"

    invoke-static/range {v16 .. v17}, Luk/e;->a(J)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    invoke-virtual {v9, v1, v12}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    const-string v10, "native_cookie_delete_age_bucket"

    invoke-static/range {v27 .. v28}, Luk/e;->a(J)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    invoke-virtual {v9, v0, v13}, Lqm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lqm/c$b;

    move-result-object v9

    invoke-virtual {v9}, Lqm/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object v9

    invoke-static {v8, v9}, Lqm/c;->d(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v8

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    mul-double/2addr v8, v10

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v10

    invoke-interface {v10}, Lrh/i;->J4()I

    move-result v10

    int-to-double v10, v10

    cmpg-double v8, v8, v10

    if-gez v8, :cond_4

    const/4 v8, 0x1

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    :goto_2
    invoke-static {}, Lug/e;->h()Lug/e;

    move-result-object v9

    invoke-virtual {v9}, Lug/e;->g()Lj6/a;

    move-result-object v9

    if-eqz v8, :cond_5

    if-eqz v9, :cond_5

    sget-object v10, Lti/b;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    move/from16 v16, v8

    const/4 v8, 0x1

    const/4 v11, 0x0

    invoke-virtual {v10, v11, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v10

    if-eqz v10, :cond_6

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v8, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v8, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v8, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "cookie_webview_state"

    invoke-interface {v8, v3, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "cookie_migration_result"

    invoke-interface {v8, v3, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v29 .. v29}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v8, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "native_cookie_age_seconds"

    invoke-static/range {v25 .. v26}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v8, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v8, v1, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "native_cookie_delete_age_seconds"

    invoke-static/range {v21 .. v22}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v8, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v8, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lbacktraceio/library/models/json/BacktraceReport;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "involuntary_logout:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v8}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v9, v0}, Lj6/a;->send(Lbacktraceio/library/models/json/BacktraceReport;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportInvoluntaryLogout: sent Backtrace report for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_5
    move/from16 v16, v8

    const/4 v8, 0x1

    const/4 v11, 0x0

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportInvoluntaryLogout: counter only (inUploadSample="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", clientReady="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v9, :cond_7

    move v12, v8

    goto :goto_3

    :cond_7
    move v12, v11

    :goto_3
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", alreadyUploadedThisProcess="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lti/b;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reportInvoluntaryLogout: failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lek/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public q(Z)V
    .locals 0

    iput-boolean p1, p0, Lti/b;->c:Z

    return-void
.end method
