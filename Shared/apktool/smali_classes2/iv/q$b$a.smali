.class public Liv/q$b$a;
.super Lwu/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liv/q$b;-><init>(Lokhttp3/ResponseBody;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Liv/q$b;


# direct methods
.method public constructor <init>(Liv/q$b;Lwu/r0;)V
    .locals 0

    iput-object p1, p0, Liv/q$b$a;->a:Liv/q$b;

    invoke-direct {p0, p2}, Lwu/p;-><init>(Lwu/r0;)V

    return-void
.end method


# virtual methods
.method public read(Lwu/e;J)J
    .locals 0

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lwu/p;->read(Lwu/e;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Liv/q$b$a;->a:Liv/q$b;

    iput-object p1, p2, Liv/q$b;->c:Ljava/io/IOException;

    throw p1
.end method
