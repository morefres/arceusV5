.class public abstract Lss/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lss/m$b;Lss/g;)Lss/n;
    .locals 1
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lss/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lss/n$a;

    invoke-direct {v0, p0, p1}, Lss/n$a;-><init>(Lss/m$b;Lss/g;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Lss/m;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method
