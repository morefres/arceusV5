.class public final synthetic Lgm/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lgm/f;


# direct methods
.method public synthetic constructor <init>(Lgm/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/c;->a:Lgm/f;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lgm/c;->a:Lgm/f;

    invoke-static {v0, p1}, Lgm/f;->d(Lgm/f;Lorg/json/JSONObject;)V

    return-void
.end method
