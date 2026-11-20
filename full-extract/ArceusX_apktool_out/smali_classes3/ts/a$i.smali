.class public Lts/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts/a;->s(Lss/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lss/m$c<",
        "Lon/g;",
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

    check-cast p2, Lon/g;

    invoke-virtual {p0, p1, p2}, Lts/a$i;->b(Lss/m;Lon/g;)V

    return-void
.end method

.method public b(Lss/m;Lon/g;)V
    .locals 1
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lss/m;->length()I

    move-result v0

    invoke-interface {p1, p2}, Lss/m;->a(Lon/s;)V

    invoke-interface {p1, p2, v0}, Lss/m;->p(Lon/s;I)V

    return-void
.end method
