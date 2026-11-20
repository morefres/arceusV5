.class public final Lxo/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lk6/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lxo/n;

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxo/n;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/n;",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/q;->a:Lxo/n;

    iput-object p2, p0, Lxo/q;->b:Ldt/i;

    return-void
.end method

.method public static a(Lxo/n;Ldt/i;)Lxo/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/n;",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lxo/q;"
        }
    .end annotation

    new-instance v0, Lxo/q;

    invoke-direct {v0, p0, p1}, Lxo/q;-><init>(Lxo/n;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lxo/n;Landroid/content/Context;)Lk6/s;
    .locals 0

    invoke-virtual {p0, p1}, Lxo/n;->c(Landroid/content/Context;)Lk6/s;

    move-result-object p0

    invoke-static {p0}, Ldt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lk6/s;

    return-object p0
.end method


# virtual methods
.method public b()Lk6/s;
    .locals 2

    iget-object v0, p0, Lxo/q;->a:Lxo/n;

    iget-object v1, p0, Lxo/q;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lxo/q;->c(Lxo/n;Landroid/content/Context;)Lk6/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxo/q;->b()Lk6/s;

    move-result-object v0

    return-object v0
.end method
