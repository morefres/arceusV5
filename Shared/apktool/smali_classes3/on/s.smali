.class public abstract Lon/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lon/s;

.field public b:Lon/s;

.field public c:Lon/s;

.field public d:Lon/s;

.field public e:Lon/s;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lon/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lon/s;->a:Lon/s;

    iput-object v0, p0, Lon/s;->b:Lon/s;

    iput-object v0, p0, Lon/s;->c:Lon/s;

    iput-object v0, p0, Lon/s;->d:Lon/s;

    iput-object v0, p0, Lon/s;->e:Lon/s;

    iput-object v0, p0, Lon/s;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public abstract a(Lon/d0;)V
.end method

.method public b(Lon/y;)V
    .locals 1

    iget-object v0, p0, Lon/s;->f:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lon/s;->f:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lon/s;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lon/s;)V
    .locals 1

    invoke-virtual {p1}, Lon/s;->n()V

    invoke-virtual {p1, p0}, Lon/s;->k(Lon/s;)V

    iget-object v0, p0, Lon/s;->c:Lon/s;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lon/s;->e:Lon/s;

    iput-object v0, p1, Lon/s;->d:Lon/s;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lon/s;->b:Lon/s;

    :goto_0
    iput-object p1, p0, Lon/s;->c:Lon/s;

    return-void
.end method

.method public d()Lon/s;
    .locals 1

    iget-object v0, p0, Lon/s;->b:Lon/s;

    return-object v0
.end method

.method public e()Lon/s;
    .locals 1

    iget-object v0, p0, Lon/s;->c:Lon/s;

    return-object v0
.end method

.method public f()Lon/s;
    .locals 1

    iget-object v0, p0, Lon/s;->e:Lon/s;

    return-object v0
.end method

.method public g()Lon/s;
    .locals 1

    iget-object v0, p0, Lon/s;->a:Lon/s;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lon/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lon/s;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public i(Lon/s;)V
    .locals 2

    invoke-virtual {p1}, Lon/s;->n()V

    iget-object v0, p0, Lon/s;->e:Lon/s;

    iput-object v0, p1, Lon/s;->e:Lon/s;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lon/s;->d:Lon/s;

    :cond_0
    iput-object p0, p1, Lon/s;->d:Lon/s;

    iput-object p1, p0, Lon/s;->e:Lon/s;

    iget-object v0, p0, Lon/s;->a:Lon/s;

    iput-object v0, p1, Lon/s;->a:Lon/s;

    iget-object v1, p1, Lon/s;->e:Lon/s;

    if-nez v1, :cond_1

    iput-object p1, v0, Lon/s;->c:Lon/s;

    :cond_1
    return-void
.end method

.method public j(Lon/s;)V
    .locals 2

    invoke-virtual {p1}, Lon/s;->n()V

    iget-object v0, p0, Lon/s;->d:Lon/s;

    iput-object v0, p1, Lon/s;->d:Lon/s;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lon/s;->e:Lon/s;

    :cond_0
    iput-object p0, p1, Lon/s;->e:Lon/s;

    iput-object p1, p0, Lon/s;->d:Lon/s;

    iget-object v0, p0, Lon/s;->a:Lon/s;

    iput-object v0, p1, Lon/s;->a:Lon/s;

    iget-object v1, p1, Lon/s;->d:Lon/s;

    if-nez v1, :cond_1

    iput-object p1, v0, Lon/s;->b:Lon/s;

    :cond_1
    return-void
.end method

.method public k(Lon/s;)V
    .locals 0

    iput-object p1, p0, Lon/s;->a:Lon/s;

    return-void
.end method

.method public l(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lon/y;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lon/s;->f:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lon/s;->f:Ljava/util/List;

    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Lon/s;->d:Lon/s;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lon/s;->e:Lon/s;

    iput-object v1, v0, Lon/s;->e:Lon/s;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lon/s;->a:Lon/s;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lon/s;->e:Lon/s;

    iput-object v2, v1, Lon/s;->b:Lon/s;

    :cond_1
    :goto_0
    iget-object v1, p0, Lon/s;->e:Lon/s;

    if-eqz v1, :cond_2

    iput-object v0, v1, Lon/s;->d:Lon/s;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lon/s;->a:Lon/s;

    if-eqz v1, :cond_3

    iput-object v0, v1, Lon/s;->c:Lon/s;

    :cond_3
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lon/s;->a:Lon/s;

    iput-object v0, p0, Lon/s;->e:Lon/s;

    iput-object v0, p0, Lon/s;->d:Lon/s;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lon/s;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
