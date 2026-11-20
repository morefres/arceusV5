.class public final enum Lso/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lso/x;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lso/x;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "government-id_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Lso/x;

.field public static final enum b:Lso/x;

.field public static final enum c:Lso/x;

.field public static final synthetic d:[Lso/x;

.field public static final synthetic e:Lpt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lso/x;

    const-string v1, "Connecting"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lso/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lso/x;->a:Lso/x;

    new-instance v0, Lso/x;

    const-string v1, "Connected"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lso/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lso/x;->b:Lso/x;

    new-instance v0, Lso/x;

    const-string v1, "Disconnected"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lso/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lso/x;->c:Lso/x;

    invoke-static {}, Lso/x;->a()[Lso/x;

    move-result-object v0

    sput-object v0, Lso/x;->d:[Lso/x;

    invoke-static {v0}, Lpt/b;->a([Ljava/lang/Enum;)Lpt/a;

    move-result-object v0

    sput-object v0, Lso/x;->e:Lpt/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Lso/x;
    .locals 3

    sget-object v0, Lso/x;->a:Lso/x;

    sget-object v1, Lso/x;->b:Lso/x;

    sget-object v2, Lso/x;->c:Lso/x;

    filled-new-array {v0, v1, v2}, [Lso/x;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lso/x;
    .locals 1

    const-class v0, Lso/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lso/x;

    return-object p0
.end method

.method public static values()[Lso/x;
    .locals 1

    sget-object v0, Lso/x;->d:[Lso/x;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lso/x;

    return-object v0
.end method
