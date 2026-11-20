.class public Lpn/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpn/f$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lrn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lqn/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lqn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lpn/d;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpn/h;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lpn/a;

.field public final i:I


# direct methods
.method public constructor <init>(Lpn/f$a;)V
    .locals 8

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lpn/f$a;->a(Lpn/f$a;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lpn/f$a;->c(Lpn/f$a;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lln/k;->m(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lpn/f;->a:Ljava/util/List;

    .line 4
    invoke-static {p1}, Lpn/f$a;->j(Lpn/f$a;)Lpn/d;

    move-result-object v0

    iput-object v0, p0, Lpn/f;->f:Lpn/d;

    .line 5
    invoke-static {p1}, Lpn/f$a;->i(Lpn/f$a;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lpn/f;->g:Ljava/util/List;

    .line 6
    invoke-static {p1}, Lpn/f$a;->e(Lpn/f$a;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lpn/f;->b:Ljava/util/List;

    .line 7
    invoke-static {p1}, Lpn/f$a;->b(Lpn/f$a;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lpn/f;->c:Ljava/util/List;

    .line 8
    invoke-static {p1}, Lpn/f$a;->g(Lpn/f$a;)Ljava/util/List;

    move-result-object v5

    iput-object v5, p0, Lpn/f;->d:Ljava/util/List;

    .line 9
    invoke-static {p1}, Lpn/f$a;->f(Lpn/f$a;)Ljava/util/Set;

    move-result-object v6

    iput-object v6, p0, Lpn/f;->e:Ljava/util/Set;

    .line 10
    invoke-static {p1}, Lpn/f$a;->d(Lpn/f$a;)Lpn/a;

    move-result-object v1

    iput-object v1, p0, Lpn/f;->h:Lpn/a;

    .line 11
    invoke-static {p1}, Lpn/f$a;->h(Lpn/f$a;)I

    move-result p1

    iput p1, p0, Lpn/f;->i:I

    .line 12
    new-instance v2, Lln/q;

    new-instance v7, Lln/f;

    invoke-direct {v7}, Lln/f;-><init>()V

    invoke-direct/range {v2 .. v7}, Lln/q;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lln/f;)V

    .line 13
    invoke-interface {v0, v2}, Lpn/d;->a(Lpn/c;)Lpn/b;

    return-void
.end method

.method public synthetic constructor <init>(Lpn/f$a;Lpn/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lpn/f;-><init>(Lpn/f$a;)V

    return-void
.end method


# virtual methods
.method public final a()Lln/k;
    .locals 9

    new-instance v0, Lln/k;

    iget-object v1, p0, Lpn/f;->a:Ljava/util/List;

    iget-object v2, p0, Lpn/f;->f:Lpn/d;

    iget-object v3, p0, Lpn/f;->b:Ljava/util/List;

    iget-object v4, p0, Lpn/f;->c:Ljava/util/List;

    iget-object v5, p0, Lpn/f;->d:Ljava/util/List;

    iget-object v6, p0, Lpn/f;->e:Ljava/util/Set;

    iget-object v7, p0, Lpn/f;->h:Lpn/a;

    iget v8, p0, Lpn/f;->i:I

    invoke-direct/range {v0 .. v8}, Lln/k;-><init>(Ljava/util/List;Lpn/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lpn/a;I)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lon/s;
    .locals 1

    const-string v0, "input must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0}, Lpn/f;->a()Lln/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lln/k;->u(Ljava/lang/String;)Lon/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpn/f;->c(Lon/s;)Lon/s;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lon/s;)Lon/s;
    .locals 2

    iget-object v0, p0, Lpn/f;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpn/h;

    invoke-interface {v1, p1}, Lpn/h;->a(Lon/s;)Lon/s;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method
