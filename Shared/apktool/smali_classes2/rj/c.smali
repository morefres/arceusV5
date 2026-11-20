.class public final enum Lrj/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrj/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lrj/c;

.field public static final enum d:Lrj/c;

.field public static final enum e:Lrj/c;

.field public static final enum f:Lrj/c;

.field public static final enum g:Lrj/c;

.field public static final enum h:Lrj/c;

.field public static final enum i:Lrj/c;

.field public static final enum j:Lrj/c;

.field public static final enum k:Lrj/c;

.field public static final synthetic l:[Lrj/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lrj/c;

    const/4 v1, 0x0

    const-string v2, "HOME_TAG"

    const-string v3, "HOME"

    invoke-direct {v0, v3, v1, v2}, Lrj/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrj/c;->c:Lrj/c;

    new-instance v0, Lrj/c;

    const/4 v1, 0x1

    const-string v2, "GAMES_TAG"

    const-string v3, "GAMES"

    invoke-direct {v0, v3, v1, v2}, Lrj/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrj/c;->d:Lrj/c;

    new-instance v0, Lrj/c;

    const/4 v1, 0x2

    const-string v2, "AVATAR_EDITOR_TAG"

    const-string v3, "AVATAR"

    invoke-direct {v0, v3, v1, v2}, Lrj/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrj/c;->e:Lrj/c;

    new-instance v0, Lrj/c;

    const/4 v1, 0x3

    const-string v2, "MORE_TAG"

    const-string v3, "MORE"

    invoke-direct {v0, v3, v1, v2}, Lrj/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrj/c;->f:Lrj/c;

    new-instance v0, Lrj/c;

    const-string v1, "gameId"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "GAME_DETAILS"

    const/4 v3, 0x4

    const-string v4, "GAME_DETAILS_TAG"

    invoke-direct {v0, v2, v3, v4, v1}, Lrj/c;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lrj/c;->g:Lrj/c;

    new-instance v0, Lrj/c;

    const-string v1, "userId"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "PROFILE"

    const/4 v3, 0x5

    const-string v4, "PROFILE_TAG"

    invoke-direct {v0, v2, v3, v4, v1}, Lrj/c;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lrj/c;->h:Lrj/c;

    new-instance v0, Lrj/c;

    const/4 v1, 0x6

    const-string v2, "CATALOG_TAG"

    const-string v3, "CATALOG"

    invoke-direct {v0, v3, v1, v2}, Lrj/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrj/c;->i:Lrj/c;

    new-instance v0, Lrj/c;

    const/4 v1, 0x7

    const-string v2, "FRIENDS_TAG"

    const-string v3, "FRIENDS"

    invoke-direct {v0, v3, v1, v2}, Lrj/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrj/c;->j:Lrj/c;

    new-instance v0, Lrj/c;

    const/16 v1, 0x8

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lrj/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrj/c;->k:Lrj/c;

    invoke-static {}, Lrj/c;->a()[Lrj/c;

    move-result-object v0

    sput-object v0, Lrj/c;->l:[Lrj/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 4
    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3, v0}, Lrj/c;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lrj/c;->a:Ljava/lang/String;

    .line 3
    iput-object p4, p0, Lrj/c;->b:[Ljava/lang/String;

    return-void
.end method

.method public static synthetic a()[Lrj/c;
    .locals 9

    sget-object v0, Lrj/c;->c:Lrj/c;

    sget-object v1, Lrj/c;->d:Lrj/c;

    sget-object v2, Lrj/c;->e:Lrj/c;

    sget-object v3, Lrj/c;->f:Lrj/c;

    sget-object v4, Lrj/c;->g:Lrj/c;

    sget-object v5, Lrj/c;->h:Lrj/c;

    sget-object v6, Lrj/c;->i:Lrj/c;

    sget-object v7, Lrj/c;->j:Lrj/c;

    sget-object v8, Lrj/c;->k:Lrj/c;

    filled-new-array/range {v0 .. v8}, [Lrj/c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrj/c;
    .locals 1

    const-class v0, Lrj/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrj/c;

    return-object p0
.end method

.method public static values()[Lrj/c;
    .locals 1

    sget-object v0, Lrj/c;->l:[Lrj/c;

    invoke-virtual {v0}, [Lrj/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrj/c;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrj/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lrj/c;->b:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public d()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrj/c;->b:[Ljava/lang/String;

    return-object v0
.end method
