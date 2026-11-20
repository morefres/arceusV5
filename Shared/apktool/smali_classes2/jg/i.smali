.class public final Ljg/i;
.super Ljg/l;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljg/l;",
        "Ljava/lang/Iterable<",
        "Ljg/l;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljg/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljg/l;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljg/l;-><init>()V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public A(I)Ljg/l;
    .locals 1

    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljg/l;

    return-object p1
.end method

.method public final B()Ljg/l;
    .locals 4

    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljg/l;

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Array must have size 1, but has size "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public bridge synthetic a()Ljg/l;
    .locals 1

    invoke-virtual {p0}, Ljg/i;->z()Ljg/i;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    invoke-virtual {p0}, Ljg/i;->B()Ljg/l;

    move-result-object v0

    invoke-virtual {v0}, Ljg/l;->b()Z

    move-result v0

    return v0
.end method

.method public c()D
    .locals 2

    invoke-virtual {p0}, Ljg/i;->B()Ljg/l;

    move-result-object v0

    invoke-virtual {v0}, Ljg/l;->c()D

    move-result-wide v0

    return-wide v0
.end method

.method public d()F
    .locals 1

    invoke-virtual {p0}, Ljg/i;->B()Ljg/l;

    move-result-object v0

    invoke-virtual {v0}, Ljg/l;->d()F

    move-result v0

    return v0
.end method

.method public e()I
    .locals 1

    invoke-virtual {p0}, Ljg/i;->B()Ljg/l;

    move-result-object v0

    invoke-virtual {v0}, Ljg/l;->e()I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Ljg/i;

    if-eqz v0, :cond_0

    check-cast p1, Ljg/i;

    iget-object p1, p1, Ljg/i;->a:Ljava/util/ArrayList;

    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    invoke-virtual {p0}, Ljg/i;->B()Ljg/l;

    move-result-object v0

    invoke-virtual {v0}, Ljg/l;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljg/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/lang/Number;
    .locals 1

    invoke-virtual {p0}, Ljg/i;->B()Ljg/l;

    move-result-object v0

    invoke-virtual {v0}, Ljg/l;->k()Ljava/lang/Number;

    move-result-object v0

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljg/i;->B()Ljg/l;

    move-result-object v0

    invoke-virtual {v0}, Ljg/l;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public v(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    if-nez p1, :cond_0

    sget-object p1, Ljg/n;->a:Ljg/n;

    goto :goto_0

    :cond_0
    new-instance v1, Ljg/r;

    invoke-direct {v1, p1}, Ljg/r;-><init>(Ljava/lang/String;)V

    move-object p1, v1

    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public y(Ljg/l;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Ljg/n;->a:Ljg/n;

    :cond_0
    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public z()Ljg/i;
    .locals 5

    iget-object v0, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljg/i;

    iget-object v1, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljg/i;-><init>(I)V

    iget-object v1, p0, Ljg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Ljg/l;

    invoke-virtual {v4}, Ljg/l;->a()Ljg/l;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljg/i;->y(Ljg/l;)V

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, Ljg/i;

    invoke-direct {v0}, Ljg/i;-><init>()V

    return-object v0
.end method
