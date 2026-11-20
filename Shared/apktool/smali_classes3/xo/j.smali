.class public final Lxo/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lxo/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lep/w;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lsm/w;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Llp/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lju/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lep/w;",
            ">;",
            "Ldt/i<",
            "Lsm/w;",
            ">;",
            "Ldt/i<",
            "Llp/b;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/j;->a:Ldt/i;

    iput-object p2, p0, Lxo/j;->b:Ldt/i;

    iput-object p3, p0, Lxo/j;->c:Ldt/i;

    iput-object p4, p0, Lxo/j;->d:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lxo/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lep/w;",
            ">;",
            "Ldt/i<",
            "Lsm/w;",
            ">;",
            "Ldt/i<",
            "Llp/b;",
            ">;",
            "Ldt/i<",
            "Lju/p0;",
            ">;)",
            "Lxo/j;"
        }
    .end annotation

    new-instance v0, Lxo/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lxo/j;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lep/w;Lsm/w;Llp/b;Lju/p0;)Lxo/i;
    .locals 1

    new-instance v0, Lxo/i;

    invoke-direct {v0, p0, p1, p2, p3}, Lxo/i;-><init>(Lep/w;Lsm/w;Llp/b;Lju/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lxo/i;
    .locals 4

    iget-object v0, p0, Lxo/j;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lep/w;

    iget-object v1, p0, Lxo/j;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsm/w;

    iget-object v2, p0, Lxo/j;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llp/b;

    iget-object v3, p0, Lxo/j;->d:Ldt/i;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lju/p0;

    invoke-static {v0, v1, v2, v3}, Lxo/j;->c(Lep/w;Lsm/w;Llp/b;Lju/p0;)Lxo/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxo/j;->b()Lxo/i;

    move-result-object v0

    return-object v0
.end method
