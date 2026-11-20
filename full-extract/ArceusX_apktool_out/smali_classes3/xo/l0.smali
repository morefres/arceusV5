.class public final Lxo/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lxo/k0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lxq/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lep/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lxq/a$a;",
            ">;",
            "Ldt/i<",
            "Lep/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/l0;->a:Ldt/i;

    iput-object p2, p0, Lxo/l0;->b:Ldt/i;

    iput-object p3, p0, Lxo/l0;->c:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;)Lxo/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lxq/a$a;",
            ">;",
            "Ldt/i<",
            "Lep/w;",
            ">;)",
            "Lxo/l0;"
        }
    .end annotation

    new-instance v0, Lxo/l0;

    invoke-direct {v0, p0, p1, p2}, Lxo/l0;-><init>(Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lxq/a$a;Lep/w;)Lxo/k0;
    .locals 1

    new-instance v0, Lxo/k0;

    invoke-direct {v0, p0, p1, p2}, Lxo/k0;-><init>(Landroid/content/Context;Lxq/a$a;Lep/w;)V

    return-object v0
.end method


# virtual methods
.method public b()Lxo/k0;
    .locals 3

    iget-object v0, p0, Lxo/l0;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lxo/l0;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxq/a$a;

    iget-object v2, p0, Lxo/l0;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lep/w;

    invoke-static {v0, v1, v2}, Lxo/l0;->c(Landroid/content/Context;Lxq/a$a;Lep/w;)Lxo/k0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxo/l0;->b()Lxo/k0;

    move-result-object v0

    return-object v0
.end method
