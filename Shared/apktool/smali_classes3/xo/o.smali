.class public final Lxo/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Landroid/app/Application;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lxo/n;


# direct methods
.method public constructor <init>(Lxo/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/o;->a:Lxo/n;

    return-void
.end method

.method public static a(Lxo/n;)Landroid/app/Application;
    .locals 0

    invoke-virtual {p0}, Lxo/n;->a()Landroid/app/Application;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Application;

    return-object p0
.end method

.method public static b(Lxo/n;)Lxo/o;
    .locals 1

    new-instance v0, Lxo/o;

    invoke-direct {v0, p0}, Lxo/o;-><init>(Lxo/n;)V

    return-object v0
.end method


# virtual methods
.method public c()Landroid/app/Application;
    .locals 1

    iget-object v0, p0, Lxo/o;->a:Lxo/n;

    invoke-static {v0}, Lxo/o;->a(Lxo/n;)Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxo/o;->c()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method
