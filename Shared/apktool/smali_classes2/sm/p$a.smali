.class public Lsm/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwu/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsm/p;->W()Lwu/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsm/p;


# direct methods
.method public constructor <init>(Lsm/p;)V
    .locals 0

    iput-object p1, p0, Lsm/p$a;->a:Lsm/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    iget-object v0, p0, Lsm/p$a;->a:Lsm/p;

    invoke-virtual {v0}, Lsm/t;->r()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lsm/p$a;->a:Lsm/p;

    iget v1, v0, Lsm/t;->a:I

    add-int/lit8 v2, v1, -0x1

    iput v2, v0, Lsm/t;->a:I

    iget-object v0, v0, Lsm/t;->d:[I

    add-int/lit8 v1, v1, -0x2

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-void

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lsm/p$a;->a:Lsm/p;

    invoke-static {v0}, Lsm/p;->X(Lsm/p;)Lwu/f;

    move-result-object v0

    invoke-interface {v0}, Lwu/f;->flush()V

    return-void
.end method

.method public timeout()Lwu/s0;
    .locals 1

    sget-object v0, Lwu/s0;->NONE:Lwu/s0;

    return-object v0
.end method

.method public write(Lwu/e;J)V
    .locals 1

    iget-object v0, p0, Lsm/p$a;->a:Lsm/p;

    invoke-static {v0}, Lsm/p;->X(Lsm/p;)Lwu/f;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lwu/p0;->write(Lwu/e;J)V

    return-void
.end method
