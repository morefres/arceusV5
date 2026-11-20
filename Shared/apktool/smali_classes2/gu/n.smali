.class public final enum Lgu/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgu/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lgu/n;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "kotlin-stdlib"
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
.field public static final enum a:Lgu/n;

.field public static final enum b:Lgu/n;

.field public static final enum c:Lgu/n;

.field public static final synthetic d:[Lgu/n;

.field public static final synthetic e:Lpt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgu/n;

    const-string v1, "INVARIANT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgu/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgu/n;->a:Lgu/n;

    new-instance v0, Lgu/n;

    const-string v1, "IN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lgu/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgu/n;->b:Lgu/n;

    new-instance v0, Lgu/n;

    const-string v1, "OUT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lgu/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgu/n;->c:Lgu/n;

    invoke-static {}, Lgu/n;->a()[Lgu/n;

    move-result-object v0

    sput-object v0, Lgu/n;->d:[Lgu/n;

    invoke-static {v0}, Lpt/b;->a([Ljava/lang/Enum;)Lpt/a;

    move-result-object v0

    sput-object v0, Lgu/n;->e:Lpt/a;

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

.method public static final synthetic a()[Lgu/n;
    .locals 3

    sget-object v0, Lgu/n;->a:Lgu/n;

    sget-object v1, Lgu/n;->b:Lgu/n;

    sget-object v2, Lgu/n;->c:Lgu/n;

    filled-new-array {v0, v1, v2}, [Lgu/n;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgu/n;
    .locals 1

    const-class v0, Lgu/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgu/n;

    return-object p0
.end method

.method public static values()[Lgu/n;
    .locals 1

    sget-object v0, Lgu/n;->d:[Lgu/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgu/n;

    return-object v0
.end method
