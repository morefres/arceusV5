.class public final Lxo/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lju/p0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lxo/n;


# direct methods
.method public constructor <init>(Lxo/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/r;->a:Lxo/n;

    return-void
.end method

.method public static a(Lxo/n;)Lxo/r;
    .locals 1

    new-instance v0, Lxo/r;

    invoke-direct {v0, p0}, Lxo/r;-><init>(Lxo/n;)V

    return-object v0
.end method

.method public static c(Lxo/n;)Lju/p0;
    .locals 0

    invoke-virtual {p0}, Lxo/n;->d()Lju/p0;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lju/p0;

    return-object p0
.end method


# virtual methods
.method public b()Lju/p0;
    .locals 1

    iget-object v0, p0, Lxo/r;->a:Lxo/n;

    invoke-static {v0}, Lxo/r;->c(Lxo/n;)Lju/p0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxo/r;->b()Lju/p0;

    move-result-object v0

    return-object v0
.end method
