.class public Lol/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lol/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lol/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lol/c;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lol/c;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lol/d;)V

    sput-object v0, Lol/c$a;->a:Lol/c;

    return-void
.end method

.method public static bridge synthetic a()Lol/c;
    .locals 1

    sget-object v0, Lol/c$a;->a:Lol/c;

    return-object v0
.end method
