.class public final enum Lpg/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpg/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lpg/a;

.field public static final enum c:Lpg/a;

.field public static final enum d:Lpg/a;

.field public static final enum e:Lpg/a;

.field public static final f:[Lpg/a;

.field public static final synthetic g:[Lpg/a;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lpg/a;

    const-string v1, "L"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lpg/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpg/a;->b:Lpg/a;

    new-instance v1, Lpg/a;

    const-string v4, "M"

    invoke-direct {v1, v4, v3, v2}, Lpg/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lpg/a;->c:Lpg/a;

    new-instance v2, Lpg/a;

    const-string v3, "Q"

    const/4 v4, 0x2

    const/4 v5, 0x3

    invoke-direct {v2, v3, v4, v5}, Lpg/a;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lpg/a;->d:Lpg/a;

    new-instance v3, Lpg/a;

    const-string v6, "H"

    invoke-direct {v3, v6, v5, v4}, Lpg/a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lpg/a;->e:Lpg/a;

    filled-new-array {v0, v1, v2, v3}, [Lpg/a;

    move-result-object v4

    sput-object v4, Lpg/a;->g:[Lpg/a;

    filled-new-array {v1, v0, v3, v2}, [Lpg/a;

    move-result-object v0

    sput-object v0, Lpg/a;->f:[Lpg/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lpg/a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpg/a;
    .locals 1

    const-class v0, Lpg/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpg/a;

    return-object p0
.end method

.method public static values()[Lpg/a;
    .locals 1

    sget-object v0, Lpg/a;->g:[Lpg/a;

    invoke-virtual {v0}, [Lpg/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpg/a;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lpg/a;->a:I

    return v0
.end method
