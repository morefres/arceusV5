.class public Lts/a$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts/a;->w(Lss/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lss/m$c<",
        "Lon/m;",
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

    check-cast p2, Lon/m;

    invoke-virtual {p0, p1, p2}, Lts/a$n;->b(Lss/m;Lon/m;)V

    return-void
.end method

.method public b(Lss/m;Lon/m;)V
    .locals 6
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lss/m;->x()Lss/g;

    move-result-object v0

    invoke-virtual {v0}, Lss/g;->c()Lss/k;

    move-result-object v0

    const-class v1, Lon/m;

    invoke-interface {v0, v1}, Lss/k;->a(Ljava/lang/Class;)Lss/t;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lss/m;->a(Lon/s;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lss/m;->length()I

    move-result v1

    invoke-interface {p1, p2}, Lss/m;->a(Lon/s;)V

    invoke-interface {p1}, Lss/m;->length()I

    move-result v2

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, Lss/m;->builder()Lss/u;

    move-result-object v2

    const v3, 0xfffc

    invoke-virtual {v2, v3}, Lss/u;->a(C)Lss/u;

    :cond_1
    invoke-interface {p1}, Lss/m;->x()Lss/g;

    move-result-object v2

    invoke-virtual {p2}, Lon/s;->g()Lon/s;

    move-result-object v3

    instance-of v3, v3, Lon/o;

    invoke-virtual {v2}, Lss/g;->a()Lxs/a;

    move-result-object v4

    invoke-virtual {p2}, Lon/m;->o()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Lxs/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Lss/m;->n()Lss/r;

    move-result-object v4

    sget-object v5, Lws/c;->a:Lss/p;

    invoke-virtual {v5, v4, p2}, Lss/p;->d(Lss/r;Ljava/lang/Object;)V

    sget-object p2, Lws/c;->b:Lss/p;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p2, v4, v3}, Lss/p;->d(Lss/r;Ljava/lang/Object;)V

    sget-object p2, Lws/c;->c:Lss/p;

    const/4 v3, 0x0

    invoke-virtual {p2, v4, v3}, Lss/p;->d(Lss/r;Ljava/lang/Object;)V

    invoke-interface {v0, v2, v4}, Lss/t;->a(Lss/g;Lss/r;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lss/m;->b(ILjava/lang/Object;)V

    return-void
.end method
