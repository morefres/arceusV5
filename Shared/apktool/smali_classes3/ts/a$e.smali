.class public Lts/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts/a;->D(Lss/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lss/m$c<",
        "Lon/w;",
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

    check-cast p2, Lon/w;

    invoke-virtual {p0, p1, p2}, Lts/a$e;->b(Lss/m;Lon/w;)V

    return-void
.end method

.method public b(Lss/m;Lon/w;)V
    .locals 5
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p2}, Lts/a;->m(Lon/w;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lss/m;->g(Lon/s;)V

    :cond_0
    invoke-interface {p1}, Lss/m;->length()I

    move-result v1

    invoke-interface {p1, p2}, Lss/m;->a(Lon/s;)V

    sget-object v2, Lts/b;->f:Lss/p;

    invoke-interface {p1}, Lss/m;->n()Lss/r;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lss/p;->d(Lss/r;Ljava/lang/Object;)V

    invoke-interface {p1, p2, v1}, Lss/m;->p(Lon/s;I)V

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, Lss/m;->s(Lon/s;)V

    :cond_1
    return-void
.end method
