.class public final enum Lcj/r$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcj/r$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcj/r$b;

.field public static final enum b:Lcj/r$b;

.field public static final enum c:Lcj/r$b;

.field public static final enum d:Lcj/r$b;

.field public static final enum e:Lcj/r$b;

.field public static final synthetic f:[Lcj/r$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcj/r$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcj/r$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj/r$b;->a:Lcj/r$b;

    new-instance v0, Lcj/r$b;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcj/r$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj/r$b;->b:Lcj/r$b;

    new-instance v0, Lcj/r$b;

    const-string v1, "BOGUS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcj/r$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj/r$b;->c:Lcj/r$b;

    new-instance v0, Lcj/r$b;

    const-string v1, "EMPTY_RESPONSE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcj/r$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj/r$b;->d:Lcj/r$b;

    new-instance v0, Lcj/r$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcj/r$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcj/r$b;->e:Lcj/r$b;

    invoke-static {}, Lcj/r$b;->a()[Lcj/r$b;

    move-result-object v0

    sput-object v0, Lcj/r$b;->f:[Lcj/r$b;

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

.method public static synthetic a()[Lcj/r$b;
    .locals 5

    sget-object v0, Lcj/r$b;->a:Lcj/r$b;

    sget-object v1, Lcj/r$b;->b:Lcj/r$b;

    sget-object v2, Lcj/r$b;->c:Lcj/r$b;

    sget-object v3, Lcj/r$b;->d:Lcj/r$b;

    sget-object v4, Lcj/r$b;->e:Lcj/r$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcj/r$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcj/r$b;
    .locals 1

    const-class v0, Lcj/r$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcj/r$b;

    return-object p0
.end method

.method public static values()[Lcj/r$b;
    .locals 1

    sget-object v0, Lcj/r$b;->f:[Lcj/r$b;

    invoke-virtual {v0}, [Lcj/r$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcj/r$b;

    return-object v0
.end method
