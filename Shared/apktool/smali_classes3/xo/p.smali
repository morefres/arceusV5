.class public final Lxo/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lxo/n;


# direct methods
.method public constructor <init>(Lxo/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/p;->a:Lxo/n;

    return-void
.end method

.method public static a(Lxo/n;)Landroid/content/Context;
    .locals 0

    invoke-virtual {p0}, Lxo/n;->b()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    return-object p0
.end method

.method public static b(Lxo/n;)Lxo/p;
    .locals 1

    new-instance v0, Lxo/p;

    invoke-direct {v0, p0}, Lxo/p;-><init>(Lxo/n;)V

    return-object v0
.end method


# virtual methods
.method public c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lxo/p;->a:Lxo/n;

    invoke-static {v0}, Lxo/p;->a(Lxo/n;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxo/p;->c()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
