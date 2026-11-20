.class public final Liv/q$b;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Liv/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lokhttp3/ResponseBody;

.field public final b:Lwu/g;

.field public c:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Lokhttp3/ResponseBody;)V
    .locals 1

    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    iput-object p1, p0, Liv/q$b;->a:Lokhttp3/ResponseBody;

    new-instance v0, Liv/q$b$a;

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lwu/g;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Liv/q$b$a;-><init>(Liv/q$b;Lwu/r0;)V

    invoke-static {v0}, Lwu/b0;->c(Lwu/r0;)Lwu/g;

    move-result-object p1

    iput-object p1, p0, Liv/q$b;->b:Lwu/g;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Liv/q$b;->c:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Liv/q$b;->a:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    return-void
.end method

.method public contentLength()J
    .locals 2

    iget-object v0, p0, Liv/q$b;->a:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    iget-object v0, p0, Liv/q$b;->a:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public source()Lwu/g;
    .locals 1

    iget-object v0, p0, Liv/q$b;->b:Lwu/g;

    return-object v0
.end method
