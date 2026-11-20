.class public Lln/z;
.super Lrn/a;
.source "SourceFile"


# instance fields
.field public final a:Lon/w;

.field public final b:Lln/w;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lrn/a;-><init>()V

    new-instance v0, Lon/w;

    invoke-direct {v0}, Lon/w;-><init>()V

    iput-object v0, p0, Lln/z;->a:Lon/w;

    new-instance v0, Lln/w;

    invoke-direct {v0}, Lln/w;-><init>()V

    iput-object v0, p0, Lln/z;->b:Lln/w;

    return-void
.end method


# virtual methods
.method public a(Lpn/i;)V
    .locals 1

    iget-object v0, p0, Lln/z;->b:Lln/w;

    invoke-virtual {v0, p1}, Lln/w;->h(Lpn/i;)V

    return-void
.end method

.method public c(Lpn/b;)V
    .locals 2

    iget-object v0, p0, Lln/z;->b:Lln/w;

    invoke-virtual {v0}, Lln/w;->e()Lpn/j;

    move-result-object v0

    invoke-virtual {v0}, Lpn/j;->f()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lln/z;->a:Lon/w;

    invoke-interface {p1, v0, v1}, Lpn/b;->a(Lpn/j;Lon/s;)V

    :cond_0
    return-void
.end method

.method public d(Lon/y;)V
    .locals 1

    iget-object v0, p0, Lln/z;->b:Lln/w;

    invoke-virtual {v0, p1}, Lln/w;->a(Lon/y;)V

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g()Lon/a;
    .locals 1

    iget-object v0, p0, Lln/z;->a:Lon/w;

    return-object v0
.end method

.method public h()V
    .locals 3

    iget-object v0, p0, Lln/z;->b:Lln/w;

    invoke-virtual {v0}, Lln/w;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lon/p;

    iget-object v2, p0, Lln/z;->a:Lon/w;

    invoke-virtual {v2, v1}, Lon/s;->j(Lon/s;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lln/z;->b:Lln/w;

    invoke-virtual {v0}, Lln/w;->e()Lpn/j;

    move-result-object v0

    invoke-virtual {v0}, Lpn/j;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lln/z;->a:Lon/w;

    invoke-virtual {v0}, Lon/s;->n()V

    return-void

    :cond_1
    iget-object v0, p0, Lln/z;->a:Lon/w;

    iget-object v1, p0, Lln/z;->b:Lln/w;

    invoke-virtual {v1}, Lln/w;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lon/s;->l(Ljava/util/List;)V

    return-void
.end method

.method public i()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lon/e<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, Lon/e;

    const-class v1, Lon/p;

    invoke-direct {v0, v1}, Lon/e;-><init>(Ljava/lang/Class;)V

    iget-object v1, p0, Lln/z;->b:Lln/w;

    invoke-virtual {v1}, Lln/w;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lon/p;

    invoke-virtual {v2}, Lon/p;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Lon/e;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lln/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public j(Lrn/h;)Lrn/c;
    .locals 1

    invoke-interface {p1}, Lrn/h;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lrn/h;->getIndex()I

    move-result p1

    invoke-static {p1}, Lrn/c;->b(I)Lrn/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lrn/c;->d()Lrn/c;

    move-result-object p1

    return-object p1
.end method

.method public k()Lpn/j;
    .locals 1

    iget-object v0, p0, Lln/z;->b:Lln/w;

    invoke-virtual {v0}, Lln/w;->e()Lpn/j;

    move-result-object v0

    return-object v0
.end method

.method public l(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lon/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lln/z;->b:Lln/w;

    invoke-virtual {v0, p1}, Lln/w;->j(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
