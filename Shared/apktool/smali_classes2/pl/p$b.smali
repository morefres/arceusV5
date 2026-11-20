.class public final enum Lpl/p$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpl/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpl/p$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lpl/p$b;

.field public static final enum b:Lpl/p$b;

.field public static final enum c:Lpl/p$b;

.field public static final synthetic d:[Lpl/p$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpl/p$b;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpl/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/p$b;->a:Lpl/p$b;

    new-instance v0, Lpl/p$b;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpl/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/p$b;->b:Lpl/p$b;

    new-instance v0, Lpl/p$b;

    const-string v1, "PAUSED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpl/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/p$b;->c:Lpl/p$b;

    invoke-static {}, Lpl/p$b;->a()[Lpl/p$b;

    move-result-object v0

    sput-object v0, Lpl/p$b;->d:[Lpl/p$b;

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

.method public static synthetic a()[Lpl/p$b;
    .locals 3

    sget-object v0, Lpl/p$b;->a:Lpl/p$b;

    sget-object v1, Lpl/p$b;->b:Lpl/p$b;

    sget-object v2, Lpl/p$b;->c:Lpl/p$b;

    filled-new-array {v0, v1, v2}, [Lpl/p$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpl/p$b;
    .locals 1

    const-class v0, Lpl/p$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpl/p$b;

    return-object p0
.end method

.method public static values()[Lpl/p$b;
    .locals 1

    sget-object v0, Lpl/p$b;->d:[Lpl/p$b;

    invoke-virtual {v0}, [Lpl/p$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpl/p$b;

    return-object v0
.end method
