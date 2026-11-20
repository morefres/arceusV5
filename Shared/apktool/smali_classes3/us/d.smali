.class public Lus/d;
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

    new-instance p1, Lvs/e;

    invoke-direct {p1}, Lvs/e;-><init>()V

    return-object p1
.end method
