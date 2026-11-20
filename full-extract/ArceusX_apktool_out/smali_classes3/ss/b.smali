.class public Lss/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lss/m;Lon/s;)V
    .locals 0
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1, p2}, Lss/m;->d(Lon/s;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lss/m;->z()V

    invoke-interface {p1}, Lss/m;->y()V

    :cond_0
    return-void
.end method

.method public b(Lss/m;Lon/s;)V
    .locals 0
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lss/m;->z()V

    return-void
.end method
