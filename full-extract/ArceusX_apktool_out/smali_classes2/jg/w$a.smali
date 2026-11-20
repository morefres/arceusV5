.class public final enum Ljg/w$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljg/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljg/w$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ljg/w$a;

.field public static final enum b:Ljg/w$a;

.field public static final enum c:Ljg/w$a;

.field public static final enum d:Ljg/w$a;

.field public static final synthetic e:[Ljg/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljg/w$a;

    const-string v1, "ALLOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/w$a;->a:Ljg/w$a;

    new-instance v0, Ljg/w$a;

    const-string v1, "INDECISIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/w$a;->b:Ljg/w$a;

    new-instance v0, Ljg/w$a;

    const-string v1, "BLOCK_INACCESSIBLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/w$a;->c:Ljg/w$a;

    new-instance v0, Ljg/w$a;

    const-string v1, "BLOCK_ALL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljg/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/w$a;->d:Ljg/w$a;

    invoke-static {}, Ljg/w$a;->a()[Ljg/w$a;

    move-result-object v0

    sput-object v0, Ljg/w$a;->e:[Ljg/w$a;

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

.method public static synthetic a()[Ljg/w$a;
    .locals 4

    sget-object v0, Ljg/w$a;->a:Ljg/w$a;

    sget-object v1, Ljg/w$a;->b:Ljg/w$a;

    sget-object v2, Ljg/w$a;->c:Ljg/w$a;

    sget-object v3, Ljg/w$a;->d:Ljg/w$a;

    filled-new-array {v0, v1, v2, v3}, [Ljg/w$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljg/w$a;
    .locals 1

    const-class v0, Ljg/w$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljg/w$a;

    return-object p0
.end method

.method public static values()[Ljg/w$a;
    .locals 1

    sget-object v0, Ljg/w$a;->e:[Ljg/w$a;

    invoke-virtual {v0}, [Ljg/w$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljg/w$a;

    return-object v0
.end method
