.class public final Lkv/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liv/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Liv/h<",
        "Lokhttp3/ResponseBody;",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final b:Lwu/h;


# instance fields
.field public final a:Lsm/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsm/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "EFBBBF"

    invoke-static {v0}, Lwu/h;->c(Ljava/lang/String;)Lwu/h;

    move-result-object v0

    sput-object v0, Lkv/c;->b:Lwu/h;

    return-void
.end method

.method public constructor <init>(Lsm/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsm/h<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkv/c;->a:Lsm/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p0, p1}, Lkv/c;->b(Lokhttp3/ResponseBody;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/ResponseBody;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lwu/g;

    move-result-object v0

    :try_start_0
    sget-object v1, Lkv/c;->b:Lwu/h;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3, v1}, Lwu/g;->b1(JLwu/h;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lwu/h;->I()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2}, Lwu/g;->skip(J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v0}, Lsm/m;->s(Lwu/g;)Lsm/m;

    move-result-object v0

    iget-object v1, p0, Lkv/c;->a:Lsm/h;

    invoke-virtual {v1, v0}, Lsm/h;->fromJson(Lsm/m;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lsm/m;->u()Lsm/m$c;

    move-result-object v0

    sget-object v2, Lsm/m$c;->j:Lsm/m$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    return-object v1

    :cond_1
    :try_start_1
    new-instance v0, Lsm/j;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Lsm/j;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    throw v0
.end method
