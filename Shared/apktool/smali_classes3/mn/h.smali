.class public abstract Lmn/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/a;


# instance fields
.field public final a:C


# direct methods
.method public constructor <init>(C)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, Lmn/h;->a:C

    return-void
.end method


# virtual methods
.method public a()C
    .locals 1

    iget-char v0, p0, Lmn/h;->a:C

    return v0
.end method

.method public b()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()C
    .locals 1

    iget-char v0, p0, Lmn/h;->a:C

    return v0
.end method

.method public d(Lsn/b;Lsn/b;)I
    .locals 5

    invoke-interface {p1}, Lsn/b;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Lsn/b;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-interface {p2}, Lsn/b;->f()I

    move-result v0

    rem-int/lit8 v0, v0, 0x3

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lsn/b;->f()I

    move-result v0

    invoke-interface {p2}, Lsn/b;->f()I

    move-result v1

    add-int/2addr v0, v1

    rem-int/lit8 v0, v0, 0x3

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-interface {p1}, Lsn/b;->length()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    invoke-interface {p2}, Lsn/b;->length()I

    move-result v0

    if-lt v0, v1, :cond_2

    new-instance v0, Lon/a0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-char v3, p0, Lmn/h;->a:C

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-char v3, p0, Lmn/h;->a:C

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lon/a0;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lon/g;

    iget-char v1, p0, Lmn/h;->a:C

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lon/g;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    :goto_0
    invoke-static {}, Lon/z;->c()Lon/z;

    move-result-object v2

    invoke-interface {p1, v1}, Lsn/b;->a(I)Ljava/lang/Iterable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lon/z;->b(Ljava/lang/Iterable;)V

    invoke-interface {p1}, Lsn/b;->d()Lon/b0;

    move-result-object p1

    invoke-interface {p2}, Lsn/b;->b()Lon/b0;

    move-result-object v3

    invoke-static {p1, v3}, Lon/t;->a(Lon/s;Lon/s;)Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lon/s;

    invoke-virtual {v0, v4}, Lon/s;->c(Lon/s;)V

    invoke-virtual {v4}, Lon/s;->h()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v4}, Lon/z;->a(Ljava/util/List;)V

    goto :goto_1

    :cond_3
    invoke-interface {p2, v1}, Lsn/b;->e(I)Ljava/lang/Iterable;

    move-result-object p2

    invoke-virtual {v2, p2}, Lon/z;->b(Ljava/lang/Iterable;)V

    invoke-virtual {v2}, Lon/z;->d()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Lon/s;->l(Ljava/util/List;)V

    invoke-virtual {p1, v0}, Lon/s;->i(Lon/s;)V

    return v1
.end method
