.class public Lzl/r$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzl/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final a:Lzl/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzl/r;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzl/r;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lzl/s;)V

    sput-object v0, Lzl/r$d;->a:Lzl/r;

    return-void
.end method

.method public static bridge synthetic a()Lzl/r;
    .locals 1

    sget-object v0, Lzl/r$d;->a:Lzl/r;

    return-object v0
.end method
