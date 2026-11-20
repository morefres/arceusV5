.class public abstract Lsm/u$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsm/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Lsm/u$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsm/u$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public b:Lsm/u$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsm/u$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public c:I

.field public final synthetic d:Lsm/u;


# direct methods
.method public constructor <init>(Lsm/u;)V
    .locals 1

    iput-object p1, p0, Lsm/u$f;->d:Lsm/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lsm/u;->c:Lsm/u$g;

    iget-object v0, v0, Lsm/u$g;->d:Lsm/u$g;

    iput-object v0, p0, Lsm/u$f;->a:Lsm/u$g;

    const/4 v0, 0x0

    iput-object v0, p0, Lsm/u$f;->b:Lsm/u$g;

    iget p1, p1, Lsm/u;->e:I

    iput p1, p0, Lsm/u$f;->c:I

    return-void
.end method


# virtual methods
.method public final b()Lsm/u$g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsm/u$g<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lsm/u$f;->a:Lsm/u$g;

    iget-object v1, p0, Lsm/u$f;->d:Lsm/u;

    iget-object v2, v1, Lsm/u;->c:Lsm/u$g;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lsm/u;->e:I

    iget v2, p0, Lsm/u$f;->c:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lsm/u$g;->d:Lsm/u$g;

    iput-object v1, p0, Lsm/u$f;->a:Lsm/u$g;

    iput-object v0, p0, Lsm/u$f;->b:Lsm/u$g;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lsm/u$f;->a:Lsm/u$g;

    iget-object v1, p0, Lsm/u$f;->d:Lsm/u;

    iget-object v1, v1, Lsm/u;->c:Lsm/u$g;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lsm/u$f;->b:Lsm/u$g;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lsm/u$f;->d:Lsm/u;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lsm/u;->i(Lsm/u$g;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lsm/u$f;->b:Lsm/u$g;

    iget-object v0, p0, Lsm/u$f;->d:Lsm/u;

    iget v0, v0, Lsm/u;->e:I

    iput v0, p0, Lsm/u$f;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
