.class public Lus/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lss/g;Lss/r;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lss/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lss/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lvs/f;

    invoke-virtual {p1}, Lss/g;->e()Lts/c;

    move-result-object p1

    sget-object v1, Lts/b;->d:Lss/p;

    invoke-virtual {v1, p2}, Lss/p;->c(Lss/r;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Lvs/f;-><init>(Lts/c;I)V

    return-object v0
.end method
