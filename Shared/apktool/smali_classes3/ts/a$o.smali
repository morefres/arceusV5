.class public Lts/a$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts/a;->A(Lss/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lss/m$c<",
        "Lon/r;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lss/m;Lon/s;)V
    .locals 0
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p2, Lon/r;

    invoke-virtual {p0, p1, p2}, Lts/a$o;->b(Lss/m;Lon/r;)V

    return-void
.end method

.method public b(Lss/m;Lon/r;)V
    .locals 6
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lss/m;->length()I

    move-result v0

    invoke-interface {p1, p2}, Lss/m;->a(Lon/s;)V

    invoke-virtual {p2}, Lon/a;->o()Lon/a;

    move-result-object v1

    instance-of v2, v1, Lon/v;

    if-eqz v2, :cond_0

    check-cast v1, Lon/v;

    invoke-virtual {v1}, Lon/v;->t()I

    move-result v2

    sget-object v3, Lts/b;->a:Lss/p;

    invoke-interface {p1}, Lss/m;->n()Lss/r;

    move-result-object v4

    sget-object v5, Lts/b$a;->b:Lts/b$a;

    invoke-virtual {v3, v4, v5}, Lss/p;->d(Lss/r;Ljava/lang/Object;)V

    sget-object v3, Lts/b;->c:Lss/p;

    invoke-interface {p1}, Lss/m;->n()Lss/r;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lss/p;->d(Lss/r;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lon/v;->t()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Lon/v;->w(I)V

    goto :goto_0

    :cond_0
    sget-object v1, Lts/b;->a:Lss/p;

    invoke-interface {p1}, Lss/m;->n()Lss/r;

    move-result-object v2

    sget-object v3, Lts/b$a;->a:Lts/b$a;

    invoke-virtual {v1, v2, v3}, Lss/p;->d(Lss/r;Ljava/lang/Object;)V

    sget-object v1, Lts/b;->b:Lss/p;

    invoke-interface {p1}, Lss/m;->n()Lss/r;

    move-result-object v2

    invoke-static {p2}, Lts/a;->n(Lon/s;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lss/p;->d(Lss/r;Ljava/lang/Object;)V

    :goto_0
    invoke-interface {p1, p2, v0}, Lss/m;->p(Lon/s;I)V

    invoke-interface {p1, p2}, Lss/m;->d(Lon/s;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Lss/m;->z()V

    :cond_1
    return-void
.end method
