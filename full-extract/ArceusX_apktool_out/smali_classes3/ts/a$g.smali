.class public Lts/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts/a;->G(Lss/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lss/m$c<",
        "Lon/b0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lts/a;


# direct methods
.method public constructor <init>(Lts/a;)V
    .locals 0

    iput-object p1, p0, Lts/a$g;->a:Lts/a;

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

    check-cast p2, Lon/b0;

    invoke-virtual {p0, p1, p2}, Lts/a$g;->b(Lss/m;Lon/b0;)V

    return-void
.end method

.method public b(Lss/m;Lon/b0;)V
    .locals 3
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/b0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p2}, Lon/b0;->o()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Lss/m;->builder()Lss/u;

    move-result-object v0

    invoke-virtual {v0, p2}, Lss/u;->d(Ljava/lang/String;)Lss/u;

    iget-object v0, p0, Lts/a$g;->a:Lts/a;

    invoke-static {v0}, Lts/a;->l(Lts/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lss/m;->length()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lts/a$g;->a:Lts/a;

    invoke-static {v1}, Lts/a;->l(Lts/a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lts/a$p;

    invoke-interface {v2, p1, p2, v0}, Lts/a$p;->a(Lss/m;Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
