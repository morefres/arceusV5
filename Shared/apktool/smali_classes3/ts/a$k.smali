.class public Lts/a$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts/a;->q(Lss/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lss/m$c<",
        "Lon/d;",
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

    check-cast p2, Lon/d;

    invoke-virtual {p0, p1, p2}, Lts/a$k;->b(Lss/m;Lon/d;)V

    return-void
.end method

.method public b(Lss/m;Lon/d;)V
    .locals 4
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lss/m;->length()I

    move-result v0

    invoke-interface {p1}, Lss/m;->builder()Lss/u;

    move-result-object v1

    const/16 v2, 0xa0

    invoke-virtual {v1, v2}, Lss/u;->a(C)Lss/u;

    move-result-object v1

    invoke-virtual {p2}, Lon/d;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lss/u;->d(Ljava/lang/String;)Lss/u;

    move-result-object v1

    invoke-virtual {v1, v2}, Lss/u;->a(C)Lss/u;

    invoke-interface {p1, p2, v0}, Lss/m;->p(Lon/s;I)V

    return-void
.end method
