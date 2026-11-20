.class public Lpl/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpl/p$b;
    }
.end annotation


# instance fields
.field public a:Lpl/q;

.field public b:Lpl/r;

.field public c:Lcom/roblox/universalapp/messagebus/Connection;

.field public d:Lcom/roblox/universalapp/messagebus/Connection;

.field public e:Landroid/app/Application$ActivityLifecycleCallbacks;


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Llm/a;->n()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lpl/n;

    invoke-direct {v1, p0}, Lpl/n;-><init>(Lpl/p;)V

    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lpl/p;->c:Lcom/roblox/universalapp/messagebus/Connection;

    new-instance v0, Lpl/o;

    invoke-direct {v0, p0}, Lpl/o;-><init>(Lpl/p;)V

    const-string v1, "ConnectivityProtocol.NetworkStatusChanged.Broadcast"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lpl/p;->d:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public static synthetic a(Lpl/p;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lpl/p;->d(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic b(Lpl/p;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lpl/p;->e(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static bridge synthetic c(Lpl/p;)V
    .locals 0

    invoke-virtual {p0}, Lpl/p;->f()V

    return-void
.end method


# virtual methods
.method public final synthetic d(Lorg/json/JSONObject;)V
    .locals 4

    :try_start_0
    invoke-static {}, Llm/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p1, "stopAdvertisement"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpl/p;->b:Lpl/r;

    invoke-virtual {p1}, Lpl/r;->i()V

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :sswitch_1
    const-string v1, "requestConnection"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpl/p;->a:Lpl/q;

    invoke-static {}, Llm/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Llm/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Llm/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lpl/q;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :sswitch_2
    const-string p1, "startDiscovery"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpl/p;->a:Lpl/q;

    invoke-virtual {p1}, Lpl/q;->j()V

    return-void

    :sswitch_3
    const-string p1, "startAdvertisement"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpl/p;->b:Lpl/r;

    invoke-virtual {p1}, Lpl/r;->h()V

    return-void

    :sswitch_4
    const-string p1, "stopDiscovery"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpl/p;->a:Lpl/q;

    invoke-virtual {p1}, Lpl/q;->k()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JSONException while handling MagicLogin request: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MagicLoginManager"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f218032 -> :sswitch_4
        -0x2908133d -> :sswitch_3
        -0x1c585092 -> :sswitch_2
        0x1d1ea6cd -> :sswitch_1
        0x618f8d23 -> :sswitch_0
    .end sparse-switch
.end method

.method public final synthetic e(Lorg/json/JSONObject;)V
    .locals 2

    :try_start_0
    const-string v0, "networkStatus"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lpl/p;->f()V

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lpl/p;->a:Lpl/q;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lpl/q;->h()V

    :cond_2
    iget-object p1, p0, Lpl/p;->b:Lpl/r;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lpl/r;->f()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    return-void

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JSONException while handling MagicLoginNetwork request: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MagicLoginManager"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lpl/p;->a:Lpl/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lpl/q;->f()V

    :cond_0
    iget-object v0, p0, Lpl/p;->b:Lpl/r;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lpl/r;->d()V

    :cond_1
    return-void
.end method

.method public final g(Landroid/app/Application;)V
    .locals 1

    new-instance v0, Lpl/p$a;

    invoke-direct {v0, p0}, Lpl/p$a;-><init>(Lpl/p;)V

    iput-object v0, p0, Lpl/p;->e:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public h(Landroid/app/Application;)V
    .locals 1

    iget-object v0, p0, Lpl/p;->a:Lpl/q;

    if-nez v0, :cond_0

    new-instance v0, Lpl/q;

    invoke-direct {v0, p1}, Lpl/q;-><init>(Landroid/app/Application;)V

    iput-object v0, p0, Lpl/p;->a:Lpl/q;

    :cond_0
    iget-object v0, p0, Lpl/p;->b:Lpl/r;

    if-nez v0, :cond_1

    new-instance v0, Lpl/r;

    invoke-direct {v0, p1}, Lpl/r;-><init>(Landroid/app/Application;)V

    iput-object v0, p0, Lpl/p;->b:Lpl/r;

    :cond_1
    iget-object v0, p0, Lpl/p;->e:Landroid/app/Application$ActivityLifecycleCallbacks;

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lpl/p;->g(Landroid/app/Application;)V

    :cond_2
    return-void
.end method
