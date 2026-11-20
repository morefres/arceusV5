.class public Lts/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts/a;->H(Lss/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lss/m$c<",
        "Lon/c0;",
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

    check-cast p2, Lon/c0;

    invoke-virtual {p0, p1, p2}, Lts/a$a;->b(Lss/m;Lon/c0;)V

    return-void
.end method

.method public b(Lss/m;Lon/c0;)V
    .locals 3
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/c0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1, p2}, Lss/m;->g(Lon/s;)V

    invoke-interface {p1}, Lss/m;->length()I

    move-result v0

    invoke-interface {p1}, Lss/m;->builder()Lss/u;

    move-result-object v1

    const/16 v2, 0xa0

    invoke-virtual {v1, v2}, Lss/u;->a(C)Lss/u;

    invoke-interface {p1, p2, v0}, Lss/m;->p(Lon/s;I)V

    invoke-interface {p1, p2}, Lss/m;->s(Lon/s;)V

    return-void
.end method
