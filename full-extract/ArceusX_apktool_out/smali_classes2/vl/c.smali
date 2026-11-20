.class public final synthetic Lvl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lvl/g;


# direct methods
.method public synthetic constructor <init>(Lvl/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvl/c;->a:Lvl/g;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lvl/c;->a:Lvl/g;

    invoke-static {v0, p1}, Lvl/g;->c(Lvl/g;Lorg/json/JSONObject;)V

    return-void
.end method
