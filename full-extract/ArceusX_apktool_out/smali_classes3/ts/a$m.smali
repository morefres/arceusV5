.class public Lts/a$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts/a;->x(Lss/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lss/m$c<",
        "Lon/n;",
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

    check-cast p2, Lon/n;

    invoke-virtual {p0, p1, p2}, Lts/a$m;->b(Lss/m;Lon/n;)V

    return-void
.end method

.method public b(Lss/m;Lon/n;)V
    .locals 2
    .param p1    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lon/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-virtual {p2}, Lon/n;->p()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, p2}, Lts/a;->I(Lss/m;Ljava/lang/String;Ljava/lang/String;Lon/s;)V

    return-void
.end method
