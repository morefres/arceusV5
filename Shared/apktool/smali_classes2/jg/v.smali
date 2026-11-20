.class public abstract enum Ljg/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljg/v;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ljg/v;

.field public static final enum b:Ljg/v;

.field public static final synthetic c:[Ljg/v;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljg/v$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljg/v$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/v;->a:Ljg/v;

    new-instance v0, Ljg/v$b;

    const-string v1, "STRING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljg/v$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljg/v;->b:Ljg/v;

    invoke-static {}, Ljg/v;->a()[Ljg/v;

    move-result-object v0

    sput-object v0, Ljg/v;->c:[Ljg/v;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILjg/v$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljg/v;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Ljg/v;
    .locals 2

    sget-object v0, Ljg/v;->a:Ljg/v;

    sget-object v1, Ljg/v;->b:Ljg/v;

    filled-new-array {v0, v1}, [Ljg/v;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljg/v;
    .locals 1

    const-class v0, Ljg/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljg/v;

    return-object p0
.end method

.method public static values()[Ljg/v;
    .locals 1

    sget-object v0, Ljg/v;->c:[Ljg/v;

    invoke-virtual {v0}, [Ljg/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljg/v;

    return-object v0
.end method
