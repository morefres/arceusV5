.class public final enum Lpn/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpn/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lpn/a;

.field public static final enum b:Lpn/a;

.field public static final enum c:Lpn/a;

.field public static final synthetic d:[Lpn/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpn/a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpn/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpn/a;->a:Lpn/a;

    new-instance v0, Lpn/a;

    const-string v1, "BLOCKS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpn/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpn/a;->b:Lpn/a;

    new-instance v0, Lpn/a;

    const-string v1, "BLOCKS_AND_INLINES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpn/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpn/a;->c:Lpn/a;

    invoke-static {}, Lpn/a;->a()[Lpn/a;

    move-result-object v0

    sput-object v0, Lpn/a;->d:[Lpn/a;

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

.method public static synthetic a()[Lpn/a;
    .locals 3

    sget-object v0, Lpn/a;->a:Lpn/a;

    sget-object v1, Lpn/a;->b:Lpn/a;

    sget-object v2, Lpn/a;->c:Lpn/a;

    filled-new-array {v0, v1, v2}, [Lpn/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpn/a;
    .locals 1

    const-class v0, Lpn/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpn/a;

    return-object p0
.end method

.method public static values()[Lpn/a;
    .locals 1

    sget-object v0, Lpn/a;->d:[Lpn/a;

    invoke-virtual {v0}, [Lpn/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpn/a;

    return-object v0
.end method
