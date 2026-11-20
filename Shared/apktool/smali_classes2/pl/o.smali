.class public final synthetic Lpl/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lpl/p;


# direct methods
.method public synthetic constructor <init>(Lpl/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpl/o;->a:Lpl/p;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lpl/o;->a:Lpl/p;

    invoke-static {v0, p1}, Lpl/p;->b(Lpl/p;Lorg/json/JSONObject;)V

    return-void
.end method
