.class public final enum Lkj/h0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkj/h0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lkj/h0;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "NativeShell_googleProdRelease"
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
.field public static final enum a:Lkj/h0;

.field public static final enum b:Lkj/h0;

.field public static final enum c:Lkj/h0;

.field public static final enum d:Lkj/h0;

.field public static final synthetic e:[Lkj/h0;

.field public static final synthetic f:Lpt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkj/h0;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkj/h0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkj/h0;->a:Lkj/h0;

    new-instance v0, Lkj/h0;

    const-string v1, "FIREBASE_CLOUD_MESSAGING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkj/h0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkj/h0;->b:Lkj/h0;

    new-instance v0, Lkj/h0;

    const-string v1, "AMAZON_DEVICE_MESSAGING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkj/h0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkj/h0;->c:Lkj/h0;

    new-instance v0, Lkj/h0;

    const-string v1, "TENCENT_PUSH_NOTIFICATION_SERVICE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lkj/h0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkj/h0;->d:Lkj/h0;

    invoke-static {}, Lkj/h0;->a()[Lkj/h0;

    move-result-object v0

    sput-object v0, Lkj/h0;->e:[Lkj/h0;

    invoke-static {v0}, Lpt/b;->a([Ljava/lang/Enum;)Lpt/a;

    move-result-object v0

    sput-object v0, Lkj/h0;->f:Lpt/a;

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

.method public static final synthetic a()[Lkj/h0;
    .locals 4

    sget-object v0, Lkj/h0;->a:Lkj/h0;

    sget-object v1, Lkj/h0;->b:Lkj/h0;

    sget-object v2, Lkj/h0;->c:Lkj/h0;

    sget-object v3, Lkj/h0;->d:Lkj/h0;

    filled-new-array {v0, v1, v2, v3}, [Lkj/h0;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkj/h0;
    .locals 1

    const-class v0, Lkj/h0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkj/h0;

    return-object p0
.end method

.method public static values()[Lkj/h0;
    .locals 1

    sget-object v0, Lkj/h0;->e:[Lkj/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkj/h0;

    return-object v0
.end method
