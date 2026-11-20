.class public Lvl/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvl/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lvl/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvl/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvl/g;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Lvl/g$b;->a:Lvl/g;

    return-void
.end method

.method public static bridge synthetic a()Lvl/g;
    .locals 1

    sget-object v0, Lvl/g$b;->a:Lvl/g;

    return-object v0
.end method
