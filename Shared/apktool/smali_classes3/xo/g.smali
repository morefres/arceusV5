.class public final Lxo/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lxo/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lwn/d;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lju/l0;",
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
            "Lwn/d;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;",
            "Ldt/i<",
            "Lju/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/g;->a:Ldt/i;

    iput-object p2, p0, Lxo/g;->b:Ldt/i;

    iput-object p3, p0, Lxo/g;->c:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;)Lxo/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lwn/d;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;",
            "Ldt/i<",
            "Lju/l0;",
            ">;)",
            "Lxo/g;"
        }
    .end annotation

    new-instance v0, Lxo/g;

    invoke-direct {v0, p0, p1, p2}, Lxo/g;-><init>(Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lwn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lju/l0;)Lxo/f;
    .locals 1

    new-instance v0, Lxo/f;

    invoke-direct {v0, p0, p1, p2}, Lxo/f;-><init>(Lwn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lju/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lxo/f;
    .locals 3

    iget-object v0, p0, Lxo/g;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn/d;

    iget-object v1, p0, Lxo/g;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    iget-object v2, p0, Lxo/g;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lju/l0;

    invoke-static {v0, v1, v2}, Lxo/g;->c(Lwn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lju/l0;)Lxo/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxo/g;->b()Lxo/f;

    move-result-object v0

    return-object v0
.end method
