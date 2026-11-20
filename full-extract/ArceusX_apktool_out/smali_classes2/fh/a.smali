.class public final enum Lfh/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfh/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lfh/a;

.field public static final enum d:Lfh/a;

.field public static final enum e:Lfh/a;

.field public static final enum f:Lfh/a;

.field public static final enum g:Lfh/a;

.field public static final enum h:Lfh/a;

.field public static final enum i:Lfh/a;

.field public static final synthetic j:[Lfh/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lfh/a;

    const-string v1, "GetPing"

    const/4 v2, 0x0

    const-string v3, "ping.get"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lfh/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lfh/a;->c:Lfh/a;

    new-instance v0, Lfh/a;

    const-string v1, "GetConfig"

    const-string v2, "config.get"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v4, v2, v3}, Lfh/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lfh/a;->d:Lfh/a;

    new-instance v0, Lfh/a;

    const-string v1, "PostConfig"

    const-string v2, "config.post"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v2, v4}, Lfh/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lfh/a;->e:Lfh/a;

    new-instance v0, Lfh/a;

    const-string v1, "GetUserAgent"

    const-string v2, "ua.get"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v4, v2, v3}, Lfh/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lfh/a;->f:Lfh/a;

    new-instance v0, Lfh/a;

    const-string v1, "GetDevRpcIpAndPort"

    const-string v2, "devrpc.get"

    const/4 v4, 0x5

    invoke-direct {v0, v1, v3, v2, v4}, Lfh/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lfh/a;->g:Lfh/a;

    new-instance v0, Lfh/a;

    const-string v1, "GetDevBranchAndCommit"

    const-string v2, "devbranchcommit.get"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v4, v2, v3}, Lfh/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lfh/a;->h:Lfh/a;

    new-instance v0, Lfh/a;

    const-string v1, "cookie.get"

    const/4 v2, 0x7

    const-string v4, "GetCookie"

    invoke-direct {v0, v4, v3, v1, v2}, Lfh/a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lfh/a;->i:Lfh/a;

    invoke-static {}, Lfh/a;->a()[Lfh/a;

    move-result-object v0

    sput-object v0, Lfh/a;->j:[Lfh/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lfh/a;->a:Ljava/lang/String;

    iput p4, p0, Lfh/a;->b:I

    return-void
.end method

.method public static synthetic a()[Lfh/a;
    .locals 7

    sget-object v0, Lfh/a;->c:Lfh/a;

    sget-object v1, Lfh/a;->d:Lfh/a;

    sget-object v2, Lfh/a;->e:Lfh/a;

    sget-object v3, Lfh/a;->f:Lfh/a;

    sget-object v4, Lfh/a;->g:Lfh/a;

    sget-object v5, Lfh/a;->h:Lfh/a;

    sget-object v6, Lfh/a;->i:Lfh/a;

    filled-new-array/range {v0 .. v6}, [Lfh/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfh/a;
    .locals 1

    const-class v0, Lfh/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfh/a;

    return-object p0
.end method

.method public static values()[Lfh/a;
    .locals 1

    sget-object v0, Lfh/a;->j:[Lfh/a;

    invoke-virtual {v0}, [Lfh/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfh/a;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Landroid/net/Uri;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lfh/a;->c(Ljava/lang/String;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lfh/a;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/ContentValues;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method
