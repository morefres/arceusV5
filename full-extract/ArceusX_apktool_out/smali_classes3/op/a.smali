.class public final enum Lop/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lop/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lop/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "nfc_release"
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
.field public static final enum a:Lop/a;

.field public static final enum b:Lop/a;

.field public static final enum c:Lop/a;

.field public static final enum d:Lop/a;

.field public static final synthetic e:[Lop/a;

.field public static final synthetic f:Lpt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lop/a;

    const-string v1, "NotRequested"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lop/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lop/a;->a:Lop/a;

    new-instance v0, Lop/a;

    const-string v1, "NotSupported"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lop/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lop/a;->b:Lop/a;

    new-instance v0, Lop/a;

    const-string v1, "Failed"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lop/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lop/a;->c:Lop/a;

    new-instance v0, Lop/a;

    const-string v1, "Success"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lop/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lop/a;->d:Lop/a;

    invoke-static {}, Lop/a;->a()[Lop/a;

    move-result-object v0

    sput-object v0, Lop/a;->e:[Lop/a;

    invoke-static {v0}, Lpt/b;->a([Ljava/lang/Enum;)Lpt/a;

    move-result-object v0

    sput-object v0, Lop/a;->f:Lpt/a;

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

.method public static final synthetic a()[Lop/a;
    .locals 4

    sget-object v0, Lop/a;->a:Lop/a;

    sget-object v1, Lop/a;->b:Lop/a;

    sget-object v2, Lop/a;->c:Lop/a;

    sget-object v3, Lop/a;->d:Lop/a;

    filled-new-array {v0, v1, v2, v3}, [Lop/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lop/a;
    .locals 1

    const-class v0, Lop/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lop/a;

    return-object p0
.end method

.method public static values()[Lop/a;
    .locals 1

    sget-object v0, Lop/a;->e:[Lop/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lop/a;

    return-object v0
.end method
