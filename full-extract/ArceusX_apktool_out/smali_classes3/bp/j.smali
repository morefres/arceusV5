.class public final Lbp/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lbp/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lbp/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lxo/h;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lsm/w;",
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
            "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
            ">;",
            "Ldt/i<",
            "Lbp/a;",
            ">;",
            "Ldt/i<",
            "Lxo/h;",
            ">;",
            "Ldt/i<",
            "Lsm/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbp/j;->a:Ldt/i;

    iput-object p2, p0, Lbp/j;->b:Ldt/i;

    iput-object p3, p0, Lbp/j;->c:Ldt/i;

    iput-object p4, p0, Lbp/j;->d:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lbp/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
            ">;",
            "Ldt/i<",
            "Lbp/a;",
            ">;",
            "Ldt/i<",
            "Lxo/h;",
            ">;",
            "Ldt/i<",
            "Lsm/w;",
            ">;)",
            "Lbp/j;"
        }
    .end annotation

    new-instance v0, Lbp/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lbp/j;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lbp/a;Lxo/h;Lsm/w;)Lbp/i;
    .locals 1

    new-instance v0, Lbp/i;

    invoke-direct {v0, p0, p1, p2, p3}, Lbp/i;-><init>(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lbp/a;Lxo/h;Lsm/w;)V

    return-object v0
.end method


# virtual methods
.method public b()Lbp/i;
    .locals 4

    iget-object v0, p0, Lbp/j;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/FallbackMode;

    iget-object v1, p0, Lbp/j;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbp/a;

    iget-object v2, p0, Lbp/j;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxo/h;

    iget-object v3, p0, Lbp/j;->d:Ldt/i;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsm/w;

    invoke-static {v0, v1, v2, v3}, Lbp/j;->c(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lbp/a;Lxo/h;Lsm/w;)Lbp/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbp/j;->b()Lbp/i;

    move-result-object v0

    return-object v0
.end method
