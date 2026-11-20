.class public Lam/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lam/a$c;,
        Lam/a$b;
    }
.end annotation


# instance fields
.field public a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public b:Lcom/roblox/universalapp/messagebus/Connection;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    iput-object v0, p0, Lam/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lam/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public synthetic constructor <init>(Lam/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lam/a;-><init>()V

    return-void
.end method

.method public static a()Lam/a;
    .locals 1

    invoke-static {}, Lam/a$c;->a()Lam/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Lam/a$b;)V
    .locals 3

    iget-object v0, p0, Lam/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    if-eqz v0, :cond_0

    const-string p1, "ExperienceProtocol"

    const-string v0, "Attempted to set ExperienceProtocol java callback, but one is already set."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lam/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/experience/JNIExperienceProtocol;->getLaunchId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lam/a$a;

    invoke-direct {v2, p0, p1}, Lam/a$a;-><init>(Lam/a;Lam/a$b;)V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lam/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lam/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    if-nez v0, :cond_0

    const-string v0, "ExperienceProtocol"

    const-string v1, "Attempted to disconnect ExperienceProtocol java callback, but one is not connected."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lam/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method
