.class public final Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/connection/BufferedSocket;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/connection/BufferedSocketKt;->asBufferedSocket(Lwu/q0;)Lokhttp3/internal/connection/BufferedSocket;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "okhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1",
        "Lokhttp3/internal/connection/BufferedSocket;",
        "",
        "cancel",
        "()V",
        "Lwu/q0;",
        "delegate",
        "Lwu/q0;",
        "Lwu/g;",
        "source",
        "Lwu/g;",
        "getSource",
        "()Lwu/g;",
        "Lwu/f;",
        "sink",
        "Lwu/f;",
        "getSink",
        "()Lwu/f;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final delegate:Lwu/q0;

.field private final sink:Lwu/f;

.field private final source:Lwu/g;


# direct methods
.method public constructor <init>(Lwu/q0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->delegate:Lwu/q0;

    invoke-interface {p1}, Lwu/q0;->getSource()Lwu/r0;

    move-result-object v0

    invoke-static {v0}, Lwu/b0;->c(Lwu/r0;)Lwu/g;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->source:Lwu/g;

    invoke-interface {p1}, Lwu/q0;->getSink()Lwu/p0;

    move-result-object p1

    invoke-static {p1}, Lwu/b0;->b(Lwu/p0;)Lwu/f;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->sink:Lwu/f;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->delegate:Lwu/q0;

    invoke-interface {v0}, Lwu/q0;->cancel()V

    return-void
.end method

.method public getSink()Lwu/f;
    .locals 1

    .line 2
    iget-object v0, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->sink:Lwu/f;

    return-object v0
.end method

.method public bridge synthetic getSink()Lwu/p0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->getSink()Lwu/f;

    move-result-object v0

    return-object v0
.end method

.method public getSource()Lwu/g;
    .locals 1

    .line 2
    iget-object v0, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->source:Lwu/g;

    return-object v0
.end method

.method public bridge synthetic getSource()Lwu/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->getSource()Lwu/g;

    move-result-object v0

    return-object v0
.end method
