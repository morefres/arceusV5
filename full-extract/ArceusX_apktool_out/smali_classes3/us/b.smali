.class public Lus/b;
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
    .locals 0
    .param p1    # Lss/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lss/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance p2, Lvs/c;

    invoke-virtual {p1}, Lss/g;->e()Lts/c;

    move-result-object p1

    invoke-direct {p2, p1}, Lvs/c;-><init>(Lts/c;)V

    return-object p2
.end method
