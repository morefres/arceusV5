.class public Lzl/r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzl/t$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzl/r;->p(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lzl/t;Lcom/roblox/universalapp/messagebus/MessageBus;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public final synthetic b:Lzl/r;


# direct methods
.method public constructor <init>(Lzl/r;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lzl/r$c;->b:Lzl/r;

    iput-object p2, p0, Lzl/r$c;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object p2, p0, Lzl/r$c;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget-object v0, p0, Lzl/r$c;->b:Lzl/r;

    invoke-virtual {v0, p1}, Lzl/r;->f(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "Credentials.deleteKeystoreCredentialsResponse"

    invoke-virtual {p2, v0, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lzl/r$c;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget-object v1, p0, Lzl/r$c;->b:Lzl/r;

    invoke-static {v1, p1, p2}, Lzl/r;->e(Lzl/r;ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "Credentials.deleteKeystoreCredentialsResponse"

    invoke-virtual {v0, p2, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
