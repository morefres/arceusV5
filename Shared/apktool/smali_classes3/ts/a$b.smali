.class public Lts/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts/a;->v(Lss/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lss/m$c<",
        "Lon/j;",
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

    check-cast p2, Lon/j;

    invoke-virtual {p0, p1, p2}, Lts/a$b;->b(Lss/m;Lon/j;)V

    return-void
.end method

.method public b(Lss/m;Lon/j;)V
    .locals 4
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1, p2}, Lss/m;->g(Lon/s;)V

    invoke-interface {p1}, Lss/m;->length()I

    move-result v0

    invoke-interface {p1, p2}, Lss/m;->a(Lon/s;)V

    sget-object v1, Lts/b;->d:Lss/p;

    invoke-interface {p1}, Lss/m;->n()Lss/r;

    move-result-object v2

    invoke-virtual {p2}, Lon/j;->p()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lss/p;->d(Lss/r;Ljava/lang/Object;)V

    invoke-interface {p1, p2, v0}, Lss/m;->p(Lon/s;I)V

    invoke-interface {p1, p2}, Lss/m;->s(Lon/s;)V

    return-void
.end method
