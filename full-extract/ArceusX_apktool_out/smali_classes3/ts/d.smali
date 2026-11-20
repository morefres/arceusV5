.class public Lts/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lss/m$c<",
        "Lon/s;",
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
.method public a(Lss/m;Lon/s;)V
    .locals 1
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1, p2}, Lss/m;->g(Lon/s;)V

    invoke-interface {p1}, Lss/m;->length()I

    move-result v0

    invoke-interface {p1, p2}, Lss/m;->a(Lon/s;)V

    invoke-interface {p1, p2, v0}, Lss/m;->p(Lon/s;I)V

    invoke-interface {p1, p2}, Lss/m;->s(Lon/s;)V

    return-void
.end method
