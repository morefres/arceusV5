.class public final enum Lnj/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnj/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lnj/e;

.field public static final enum b:Lnj/e;

.field public static final enum c:Lnj/e;

.field public static final synthetic d:[Lnj/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnj/e;

    const-string v1, "none"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnj/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnj/e;->a:Lnj/e;

    new-instance v0, Lnj/e;

    const-string v1, "user"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnj/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnj/e;->b:Lnj/e;

    new-instance v0, Lnj/e;

    const-string v1, "game"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lnj/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnj/e;->c:Lnj/e;

    invoke-static {}, Lnj/e;->a()[Lnj/e;

    move-result-object v0

    sput-object v0, Lnj/e;->d:[Lnj/e;

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

.method public static synthetic a()[Lnj/e;
    .locals 3

    sget-object v0, Lnj/e;->a:Lnj/e;

    sget-object v1, Lnj/e;->b:Lnj/e;

    sget-object v2, Lnj/e;->c:Lnj/e;

    filled-new-array {v0, v1, v2}, [Lnj/e;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnj/e;
    .locals 1

    const-class v0, Lnj/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnj/e;

    return-object p0
.end method

.method public static values()[Lnj/e;
    .locals 1

    sget-object v0, Lnj/e;->d:[Lnj/e;

    invoke-virtual {v0}, [Lnj/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnj/e;

    return-object v0
.end method
