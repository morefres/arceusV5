.class public final enum Lpp/i0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpp/i0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lpp/i0;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "permissions_release"
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
.field public static final enum a:Lpp/i0;

.field public static final enum b:Lpp/i0;

.field public static final enum c:Lpp/i0;

.field public static final enum d:Lpp/i0;

.field public static final synthetic e:[Lpp/i0;

.field public static final synthetic f:Lpt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpp/i0;

    const-string v1, "Camera"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpp/i0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpp/i0;->a:Lpp/i0;

    new-instance v0, Lpp/i0;

    const-string v1, "RecordAudio"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpp/i0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpp/i0;->b:Lpp/i0;

    new-instance v0, Lpp/i0;

    const-string v1, "RoughLocation"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpp/i0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpp/i0;->c:Lpp/i0;

    new-instance v0, Lpp/i0;

    const-string v1, "PreciseLocation"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lpp/i0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpp/i0;->d:Lpp/i0;

    invoke-static {}, Lpp/i0;->a()[Lpp/i0;

    move-result-object v0

    sput-object v0, Lpp/i0;->e:[Lpp/i0;

    invoke-static {v0}, Lpt/b;->a([Ljava/lang/Enum;)Lpt/a;

    move-result-object v0

    sput-object v0, Lpp/i0;->f:Lpt/a;

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

.method public static final synthetic a()[Lpp/i0;
    .locals 4

    sget-object v0, Lpp/i0;->a:Lpp/i0;

    sget-object v1, Lpp/i0;->b:Lpp/i0;

    sget-object v2, Lpp/i0;->c:Lpp/i0;

    sget-object v3, Lpp/i0;->d:Lpp/i0;

    filled-new-array {v0, v1, v2, v3}, [Lpp/i0;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpp/i0;
    .locals 1

    const-class v0, Lpp/i0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpp/i0;

    return-object p0
.end method

.method public static values()[Lpp/i0;
    .locals 1

    sget-object v0, Lpp/i0;->e:[Lpp/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpp/i0;

    return-object v0
.end method
