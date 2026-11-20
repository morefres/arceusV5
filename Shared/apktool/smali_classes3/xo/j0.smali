.class public final Lxo/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/internal/q;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lxo/k0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lju/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lxo/k0;",
            ">;",
            "Ldt/i<",
            "Lju/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/j0;->a:Ldt/i;

    iput-object p2, p0, Lxo/j0;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lxo/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lxo/k0;",
            ">;",
            "Ldt/i<",
            "Lju/l0;",
            ">;)",
            "Lxo/j0;"
        }
    .end annotation

    new-instance v0, Lxo/j0;

    invoke-direct {v0, p0, p1}, Lxo/j0;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lxo/k0;Lju/l0;)Lcom/withpersona/sdk2/inquiry/internal/q;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/q;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/q;-><init>(Lxo/k0;Lju/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/internal/q;
    .locals 2

    iget-object v0, p0, Lxo/j0;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxo/k0;

    iget-object v1, p0, Lxo/j0;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lju/l0;

    invoke-static {v0, v1}, Lxo/j0;->c(Lxo/k0;Lju/l0;)Lcom/withpersona/sdk2/inquiry/internal/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxo/j0;->b()Lcom/withpersona/sdk2/inquiry/internal/q;

    move-result-object v0

    return-object v0
.end method
