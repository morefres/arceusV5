.class public Lpl/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpl/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static a:Lpl/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpl/c;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpl/c;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lpl/d;)V

    sput-object v0, Lpl/c$a;->a:Lpl/c;

    return-void
.end method

.method public static bridge synthetic a()Lpl/c;
    .locals 1

    sget-object v0, Lpl/c$a;->a:Lpl/c;

    return-object v0
.end method
