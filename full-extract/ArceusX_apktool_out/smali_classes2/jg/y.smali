.class public abstract enum Ljg/y;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljg/z;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljg/y;",
        ">;",
        "Ljg/z;"
    }
.end annotation


# static fields
.field public static final enum a:Ljg/y;

.field public static final enum b:Ljg/y;

.field public static final enum c:Ljg/y;

.field public static final enum d:Ljg/y;

.field public static final synthetic e:[Ljg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljg/y$a;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljg/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/y;->a:Ljg/y;

    new-instance v0, Ljg/y$b;

    const-string v1, "LAZILY_PARSED_NUMBER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljg/y$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/y;->b:Ljg/y;

    new-instance v0, Ljg/y$c;

    const-string v1, "LONG_OR_DOUBLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljg/y$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/y;->c:Ljg/y;

    new-instance v0, Ljg/y$d;

    const-string v1, "BIG_DECIMAL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljg/y$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/y;->d:Ljg/y;

    invoke-static {}, Ljg/y;->b()[Ljg/y;

    move-result-object v0

    sput-object v0, Ljg/y;->e:[Ljg/y;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjg/y$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljg/y;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic b()[Ljg/y;
    .locals 4

    sget-object v0, Ljg/y;->a:Ljg/y;

    sget-object v1, Ljg/y;->b:Ljg/y;

    sget-object v2, Ljg/y;->c:Ljg/y;

    sget-object v3, Ljg/y;->d:Ljg/y;

    filled-new-array {v0, v1, v2, v3}, [Ljg/y;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljg/y;
    .locals 1

    const-class v0, Ljg/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljg/y;

    return-object p0
.end method

.method public static values()[Ljg/y;
    .locals 1

    sget-object v0, Ljg/y;->e:[Ljg/y;

    invoke-virtual {v0}, [Ljg/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljg/y;

    return-object v0
.end method
