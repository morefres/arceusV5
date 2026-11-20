.class public Lrg/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/y$b;,
        Lrg/y$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    const-string v0, "rbx.main"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v1, "com.roblox.client.implementation.AppImplementations"

    iput-object v1, p0, Lrg/y;->a:Ljava/lang/String;

    .line 4
    :try_start_0
    const-class v1, Lcom/roblox/client/implementation/AppImplementations;

    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lrg/y;->b:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 6
    :catch_0
    const-string v1, "Failed to instantiate implementation"

    invoke-static {v0, v1}, Lek/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 7
    :catch_1
    const-string v1, "Failed to find implementation class"

    invoke-static {v0, v1}, Lek/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Lrg/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lrg/y;-><init>()V

    return-void
.end method

.method public static h()Lrg/y;
    .locals 1

    invoke-static {}, Lrg/y$b;->a()Lrg/y;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Luh/n$a;Luh/n$b;)Luh/n;
    .locals 2

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/b;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/b;

    invoke-interface {v0, p1, p2}, Lvj/b;->a(Luh/n$a;Luh/n$b;)Luh/n;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default DataModelNotifications"

    invoke-static {v0, v1}, Lek/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Luh/n;

    invoke-direct {v0, p1, p2}, Luh/n;-><init>(Luh/n$a;Luh/n$b;)V

    return-object v0
.end method

.method public b()Lth/d;
    .locals 2

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/d;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/d;

    invoke-interface {v0}, Lvj/d;->a()Lth/d;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default GenericWebFragment"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lth/d;

    invoke-direct {v0}, Lth/d;-><init>()V

    return-object v0
.end method

.method public c(Landroid/content/Context;)Lyg/a;
    .locals 2

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lyg/b;

    if-eqz v1, :cond_0

    check-cast v0, Lyg/b;

    invoke-interface {v0, p1}, Lyg/b;->getRtcAudioManager(Landroid/content/Context;)Lyg/a;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "No AudioRtcManager"

    invoke-static {p1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public d()Lti/d;
    .locals 2

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/a;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/a;

    invoke-interface {v0}, Lvj/a;->getAppsFlyerManager()Lti/d;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "No AppsFlyer"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lti/d;

    invoke-direct {v0}, Lti/d;-><init>()V

    return-object v0
.end method

.method public e()Lzl/r;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lgh/a;

    if-eqz v1, :cond_0

    check-cast v0, Lgh/a;

    invoke-interface {v0}, Lgh/a;->a()Lzl/r;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lzl/r;->y()Lzl/r;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/roblox/client/game/c;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/c;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/c;

    invoke-interface {v0}, Lvj/c;->a()Lcom/roblox/client/game/c;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lrg/y$a;->a()Lcom/roblox/client/game/c;

    move-result-object v0

    return-object v0
.end method

.method public g()Lgm/f;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lii/a;

    if-eqz v1, :cond_0

    check-cast v0, Lii/a;

    invoke-interface {v0}, Lii/a;->getIdentityProtocol()Lgm/f;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lgm/f;->z()Lgm/f;

    move-result-object v0

    return-object v0
.end method

.method public i(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/e;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/e;

    invoke-interface {v0, p1}, Lvj/e;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default Main class"

    invoke-static {v0, v1}, Lek/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public j(Landroid/app/Activity;)Lej/a;
    .locals 2

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/f;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/f;

    invoke-interface {v0, p1}, Lvj/f;->a(Landroid/app/Activity;)Lej/a;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "Using empty Midas"

    invoke-static {p1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lej/a;

    invoke-direct {p1}, Lej/a;-><init>()V

    return-object p1
.end method

.method public k()Lmm/k;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lyi/a;

    if-eqz v1, :cond_0

    check-cast v0, Lyi/a;

    invoke-interface {v0}, Lyi/a;->getPermissionsProtocol()Lmm/k;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lmm/l;->f0()Lmm/l;

    move-result-object v0

    return-object v0
.end method

.method public l()Ltk/f;
    .locals 2

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/h;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/h;

    invoke-interface {v0}, Lvj/h;->a()Ltk/f;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using default Provider"

    invoke-static {v0, v1}, Lek/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ltk/a;

    invoke-direct {v0}, Ltk/a;-><init>()V

    return-object v0
.end method

.method public m()Lhj/s;
    .locals 2

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/i;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/i;

    invoke-interface {v0}, Lvj/i;->a()Lhj/s;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "No default push registrar"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return-object v0
.end method

.method public n(Lyk/d;)Liv/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyk/d;",
            ")",
            "Liv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/g;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/g;

    invoke-interface {v0, p1}, Lvj/g;->a(Lyk/d;)Liv/d;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "rbx.main"

    const-string v0, "No default push registration call"

    invoke-static {p1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public o(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/j;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/j;

    invoke-interface {v0, p1}, Lvj/j;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "No StartActivityIntentFactory interface implemented"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p()Ltj/a;
    .locals 2

    iget-object v0, p0, Lrg/y;->b:Ljava/lang/Object;

    instance-of v1, v0, Lvj/k;

    if-eqz v1, :cond_0

    check-cast v0, Lvj/k;

    invoke-interface {v0}, Lvj/k;->a()Ltj/a;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "rbx.main"

    const-string v1, "Using empty TSS"

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ltj/a;

    invoke-direct {v0}, Ltj/a;-><init>()V

    return-object v0
.end method
