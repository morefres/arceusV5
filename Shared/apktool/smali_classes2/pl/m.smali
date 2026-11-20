.class public final enum Lpl/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpl/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lpl/m;

.field public static final enum b:Lpl/m;

.field public static final enum c:Lpl/m;

.field public static final enum d:Lpl/m;

.field public static final enum e:Lpl/m;

.field public static final enum f:Lpl/m;

.field public static final enum g:Lpl/m;

.field public static final enum h:Lpl/m;

.field public static final synthetic i:[Lpl/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpl/m;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/m;->a:Lpl/m;

    new-instance v0, Lpl/m;

    const-string v1, "TOKEN_PROVIDER_UNINITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/m;->b:Lpl/m;

    new-instance v0, Lpl/m;

    const-string v1, "INVALID_NONCE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/m;->c:Lpl/m;

    new-instance v0, Lpl/m;

    const-string v1, "REQUEST_TIMEOUT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lpl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/m;->d:Lpl/m;

    new-instance v0, Lpl/m;

    const-string v1, "EXCEPTION"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lpl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/m;->e:Lpl/m;

    new-instance v0, Lpl/m;

    const-string v1, "INTERRUPTED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lpl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/m;->f:Lpl/m;

    new-instance v0, Lpl/m;

    const-string v1, "RECEIVED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lpl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/m;->g:Lpl/m;

    new-instance v0, Lpl/m;

    const-string v1, "REFRESHED_TOKEN_PROVIDER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lpl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpl/m;->h:Lpl/m;

    invoke-static {}, Lpl/m;->a()[Lpl/m;

    move-result-object v0

    sput-object v0, Lpl/m;->i:[Lpl/m;

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

.method public static synthetic a()[Lpl/m;
    .locals 8

    sget-object v0, Lpl/m;->a:Lpl/m;

    sget-object v1, Lpl/m;->b:Lpl/m;

    sget-object v2, Lpl/m;->c:Lpl/m;

    sget-object v3, Lpl/m;->d:Lpl/m;

    sget-object v4, Lpl/m;->e:Lpl/m;

    sget-object v5, Lpl/m;->f:Lpl/m;

    sget-object v6, Lpl/m;->g:Lpl/m;

    sget-object v7, Lpl/m;->h:Lpl/m;

    filled-new-array/range {v0 .. v7}, [Lpl/m;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpl/m;
    .locals 1

    const-class v0, Lpl/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpl/m;

    return-object p0
.end method

.method public static values()[Lpl/m;
    .locals 1

    sget-object v0, Lpl/m;->i:[Lpl/m;

    invoke-virtual {v0}, [Lpl/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpl/m;

    return-object v0
.end method
