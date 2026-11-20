.class public Lln/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lln/w$b;
    }
.end annotation


# instance fields
.field public a:Lln/w$b;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpn/i;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lon/p;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lon/y;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/StringBuilder;

.field public f:Ljava/lang/String;

.field public g:C

.field public h:Ljava/lang/StringBuilder;

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lln/w$b;->a:Lln/w$b;

    iput-object v0, p0, Lln/w;->a:Lln/w$b;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lln/w;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lln/w;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lln/w;->d:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lln/w;->i:Z

    return-void
.end method

.method public static i(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lt p0, v0, :cond_0

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lon/y;)V
    .locals 1

    iget-object v0, p0, Lln/w;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lqn/i;)Z
    .locals 4

    invoke-virtual {p1}, Lqn/i;->r()I

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v0

    invoke-static {p1}, Lnn/e;->b(Lqn/i;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lqn/i;->d(Lqn/h;Lqn/h;)Lpn/j;

    move-result-object v0

    invoke-virtual {v0}, Lpn/j;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v3

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lln/w;->f:Ljava/lang/String;

    invoke-virtual {p1}, Lqn/i;->r()I

    move-result v0

    invoke-virtual {p1}, Lqn/i;->e()Z

    move-result p1

    if-nez p1, :cond_2

    iput-boolean v3, p0, Lln/w;->i:Z

    iget-object p1, p0, Lln/w;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    goto :goto_0

    :cond_2
    if-nez v0, :cond_3

    return v2

    :cond_3
    :goto_0
    sget-object p1, Lln/w$b;->d:Lln/w$b;

    iput-object p1, p0, Lln/w;->a:Lln/w$b;

    return v3
.end method

.method public final c()V
    .locals 5

    iget-boolean v0, p0, Lln/w;->i:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lln/w;->f:Ljava/lang/String;

    invoke-static {v0}, Lnn/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lln/w;->h:Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnn/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    new-instance v3, Lon/p;

    iget-object v4, p0, Lln/w;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v0, v1}, Lon/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lln/w;->d:Ljava/util/List;

    invoke-virtual {v3, v0}, Lon/s;->l(Ljava/util/List;)V

    iget-object v0, p0, Lln/w;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lln/w;->c:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v2, p0, Lln/w;->e:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lln/w;->i:Z

    iput-object v2, p0, Lln/w;->f:Ljava/lang/String;

    iput-object v2, p0, Lln/w;->h:Ljava/lang/StringBuilder;

    return-void
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lon/p;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lln/w;->c()V

    iget-object v0, p0, Lln/w;->c:Ljava/util/List;

    return-object v0
.end method

.method public e()Lpn/j;
    .locals 1

    iget-object v0, p0, Lln/w;->b:Ljava/util/List;

    invoke-static {v0}, Lpn/j;->g(Ljava/util/List;)Lpn/j;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lon/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lln/w;->d:Ljava/util/List;

    return-object v0
.end method

.method public final g(Lqn/i;)Z
    .locals 4

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v0

    invoke-static {p1}, Lnn/e;->d(Lqn/i;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, Lln/w;->e:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Lqn/i;->d(Lqn/h;Lqn/h;)Lpn/j;

    move-result-object v0

    invoke-virtual {v0}, Lpn/j;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lqn/i;->e()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object p1, p0, Lln/w;->e:Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v1

    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {p1, v0}, Lqn/i;->i(C)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Lqn/i;->i(C)Z

    move-result v0

    if-nez v0, :cond_2

    return v2

    :cond_2
    iget-object v0, p0, Lln/w;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/16 v3, 0x3e7

    if-le v0, v3, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, Lln/w;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnn/c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    return v2

    :cond_4
    sget-object v0, Lln/w$b;->c:Lln/w$b;

    iput-object v0, p0, Lln/w;->a:Lln/w$b;

    invoke-virtual {p1}, Lqn/i;->r()I

    return v1

    :cond_5
    return v2
.end method

.method public h(Lpn/i;)V
    .locals 2

    iget-object v0, p0, Lln/w;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lln/w;->a:Lln/w$b;

    sget-object v1, Lln/w$b;->f:Lln/w$b;

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lpn/j;->h(Lpn/i;)Lpn/j;

    move-result-object p1

    invoke-static {p1}, Lqn/i;->k(Lpn/j;)Lqn/i;

    move-result-object p1

    :cond_1
    invoke-virtual {p1}, Lqn/i;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lln/w$a;->a:[I

    iget-object v1, p0, Lln/w;->a:Lln/w$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    invoke-virtual {p0, p1}, Lln/w;->m(Lqn/i;)Z

    move-result v0

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown parsing state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lln/w;->a:Lln/w$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {p0, p1}, Lln/w;->l(Lqn/i;)Z

    move-result v0

    goto :goto_0

    :cond_4
    invoke-virtual {p0, p1}, Lln/w;->b(Lqn/i;)Z

    move-result v0

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1}, Lln/w;->g(Lqn/i;)Z

    move-result v0

    goto :goto_0

    :cond_6
    invoke-virtual {p0, p1}, Lln/w;->k(Lqn/i;)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_1

    sget-object p1, Lln/w$b;->f:Lln/w$b;

    iput-object p1, p0, Lln/w;->a:Lln/w$b;

    invoke-virtual {p0}, Lln/w;->c()V

    :cond_7
    :goto_1
    return-void
.end method

.method public j(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lon/y;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lln/w;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, p1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-object v3, p0, Lln/w;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v1, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lln/w;->b:Ljava/util/List;

    invoke-static {p1, v1}, Lln/w;->i(ILjava/util/List;)V

    iget-object v1, p0, Lln/w;->d:Ljava/util/List;

    invoke-static {p1, v1}, Lln/w;->i(ILjava/util/List;)V

    return-object v0
.end method

.method public final k(Lqn/i;)Z
    .locals 1

    invoke-virtual {p0}, Lln/w;->c()V

    invoke-virtual {p1}, Lqn/i;->r()I

    const/16 v0, 0x5b

    invoke-virtual {p1, v0}, Lqn/i;->i(C)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object v0, Lln/w$b;->b:Lln/w$b;

    iput-object v0, p0, Lln/w;->a:Lln/w$b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lln/w;->e:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lqn/i;->e()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lln/w;->e:Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final l(Lqn/i;)Z
    .locals 3

    invoke-virtual {p1}, Lqn/i;->r()I

    invoke-virtual {p1}, Lqn/i;->e()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    sget-object p1, Lln/w$b;->a:Lln/w$b;

    iput-object p1, p0, Lln/w;->a:Lln/w$b;

    return v1

    :cond_0
    const/4 v0, 0x0

    iput-char v0, p0, Lln/w;->g:C

    invoke-virtual {p1}, Lqn/i;->l()C

    move-result v0

    const/16 v2, 0x22

    if-eq v0, v2, :cond_2

    const/16 v2, 0x27

    if-eq v0, v2, :cond_2

    const/16 v2, 0x28

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x29

    iput-char v0, p0, Lln/w;->g:C

    goto :goto_0

    :cond_2
    iput-char v0, p0, Lln/w;->g:C

    :goto_0
    iget-char v0, p0, Lln/w;->g:C

    if-eqz v0, :cond_3

    sget-object v0, Lln/w$b;->e:Lln/w$b;

    iput-object v0, p0, Lln/w;->a:Lln/w$b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lln/w;->h:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lqn/i;->h()V

    invoke-virtual {p1}, Lqn/i;->e()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lln/w;->h:Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    sget-object p1, Lln/w$b;->a:Lln/w$b;

    iput-object p1, p0, Lln/w;->a:Lln/w$b;

    :cond_4
    :goto_1
    return v1
.end method

.method public final m(Lqn/i;)Z
    .locals 5

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v0

    iget-char v1, p0, Lln/w;->g:C

    invoke-static {p1, v1}, Lnn/e;->f(Lqn/i;C)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iput-object v3, p0, Lln/w;->h:Ljava/lang/StringBuilder;

    return v2

    :cond_0
    iget-object v1, p0, Lln/w;->h:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v4

    invoke-virtual {p1, v0, v4}, Lqn/i;->d(Lqn/h;Lqn/h;)Lpn/j;

    move-result-object v0

    invoke-virtual {v0}, Lpn/j;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lqn/i;->e()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object p1, p0, Lln/w;->h:Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v1

    :cond_1
    invoke-virtual {p1}, Lqn/i;->h()V

    invoke-virtual {p1}, Lqn/i;->r()I

    invoke-virtual {p1}, Lqn/i;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    iput-object v3, p0, Lln/w;->h:Ljava/lang/StringBuilder;

    return v2

    :cond_2
    iput-boolean v1, p0, Lln/w;->i:Z

    iget-object p1, p0, Lln/w;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    sget-object p1, Lln/w$b;->a:Lln/w$b;

    iput-object p1, p0, Lln/w;->a:Lln/w$b;

    return v1
.end method
