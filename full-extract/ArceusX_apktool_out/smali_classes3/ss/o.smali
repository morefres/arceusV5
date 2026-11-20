.class public Lss/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lss/o$a;
    }
.end annotation


# instance fields
.field public final a:Lss/g;

.field public final b:Lss/r;

.field public final c:Lss/u;

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lon/s;",
            ">;",
            "Lss/m$c<",
            "+",
            "Lon/s;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Lss/m$a;


# direct methods
.method public constructor <init>(Lss/g;Lss/r;Lss/u;Ljava/util/Map;Lss/m$a;)V
    .locals 0
    .param p1    # Lss/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lss/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lss/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lss/m$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lss/g;",
            "Lss/r;",
            "Lss/u;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lon/s;",
            ">;",
            "Lss/m$c<",
            "+",
            "Lon/s;",
            ">;>;",
            "Lss/m$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lss/o;->a:Lss/g;

    iput-object p2, p0, Lss/o;->b:Lss/r;

    iput-object p3, p0, Lss/o;->c:Lss/u;

    iput-object p4, p0, Lss/o;->d:Ljava/util/Map;

    iput-object p5, p0, Lss/o;->e:Lss/m$a;

    return-void
.end method


# virtual methods
.method public A(Lon/x;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public B(Lon/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public C(Lon/v;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public D(Lon/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public E(Lon/o;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public F(Ljava/lang/Class;I)V
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Lon/s;",
            ">(",
            "Ljava/lang/Class<",
            "TN;>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lss/o;->a:Lss/g;

    invoke-virtual {v0}, Lss/g;->c()Lss/k;

    move-result-object v0

    invoke-interface {v0, p1}, Lss/k;->a(Ljava/lang/Class;)Lss/t;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lss/o;->a:Lss/g;

    iget-object v1, p0, Lss/o;->b:Lss/r;

    invoke-interface {p1, v0, v1}, Lss/t;->a(Lss/g;Lss/r;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lss/o;->b(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final G(Lon/s;)V
    .locals 2
    .param p1    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lss/o;->d:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lss/m$c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Lss/m$c;->a(Lss/m;Lon/s;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lss/o;->a(Lon/s;)V

    return-void
.end method

.method public a(Lon/s;)V
    .locals 1
    .param p1    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lon/s;->d()Lon/s;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lon/s;->f()Lon/s;

    move-result-object v0

    invoke-virtual {p1, p0}, Lon/s;->a(Lon/d0;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lss/o;->c:Lss/u;

    invoke-virtual {v0}, Lss/u;->length()I

    move-result v1

    invoke-static {v0, p2, p1, v1}, Lss/u;->j(Lss/u;Ljava/lang/Object;II)V

    return-void
.end method

.method public builder()Lss/u;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/o;->c:Lss/u;

    return-object v0
.end method

.method public c(Lon/p;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public d(Lon/s;)Z
    .locals 0
    .param p1    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lon/s;->f()Lon/s;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public e(Lon/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public f(Lon/j;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public g(Lon/s;)V
    .locals 1
    .param p1    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lss/o;->e:Lss/m$a;

    invoke-interface {v0, p0, p1}, Lss/m$a;->b(Lss/m;Lon/s;)V

    return-void
.end method

.method public h(Lon/r;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public i(Lon/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public j(Lon/a0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public k(Lon/w;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public l(Lon/n;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public length()I
    .locals 1

    iget-object v0, p0, Lss/o;->c:Lss/u;

    invoke-virtual {v0}, Lss/u;->length()I

    move-result v0

    return v0
.end method

.method public m(Lon/c0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public n()Lss/r;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/o;->b:Lss/r;

    return-object v0
.end method

.method public o(Lon/b0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public p(Lon/s;I)V
    .locals 0
    .param p1    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Lon/s;",
            ">(TN;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lss/o;->F(Ljava/lang/Class;I)V

    return-void
.end method

.method public q(Lon/m;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public r(Lon/l;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public s(Lon/s;)V
    .locals 1
    .param p1    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lss/o;->e:Lss/m$a;

    invoke-interface {v0, p0, p1}, Lss/m$a;->a(Lss/m;Lon/s;)V

    return-void
.end method

.method public t(Lon/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public u(Lon/f;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public v(Lon/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public w(Lon/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lss/o;->G(Lon/s;)V

    return-void
.end method

.method public x()Lss/g;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/o;->a:Lss/g;

    return-object v0
.end method

.method public y()V
    .locals 2

    iget-object v0, p0, Lss/o;->c:Lss/u;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lss/u;->a(C)Lss/u;

    return-void
.end method

.method public z()V
    .locals 2

    iget-object v0, p0, Lss/o;->c:Lss/u;

    invoke-virtual {v0}, Lss/u;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lss/o;->c:Lss/u;

    invoke-virtual {v0}, Lss/u;->h()C

    move-result v0

    const/16 v1, 0xa

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lss/o;->c:Lss/u;

    invoke-virtual {v0, v1}, Lss/u;->a(C)Lss/u;

    :cond_0
    return-void
.end method
