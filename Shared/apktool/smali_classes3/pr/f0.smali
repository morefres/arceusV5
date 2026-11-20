.class public final Lpr/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lpr/e0;",
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
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lor/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lxq/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/h$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;",
            "Ldt/i<",
            "Lor/a$a;",
            ">;",
            "Ldt/i<",
            "Lxq/a$a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/h$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpr/f0;->a:Ldt/i;

    iput-object p2, p0, Lpr/f0;->b:Ldt/i;

    iput-object p3, p0, Lpr/f0;->c:Ldt/i;

    iput-object p4, p0, Lpr/f0;->d:Ldt/i;

    iput-object p5, p0, Lpr/f0;->e:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lpr/f0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;",
            "Ldt/i<",
            "Lor/a$a;",
            ">;",
            "Ldt/i<",
            "Lxq/a$a;",
            ">;",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/h$a;",
            ">;)",
            "Lpr/f0;"
        }
    .end annotation

    new-instance v0, Lpr/f0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lpr/f0;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lor/a$a;Lxq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)Lpr/e0;
    .locals 6

    new-instance v0, Lpr/e0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lpr/e0;-><init>(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lor/a$a;Lxq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lpr/e0;
    .locals 5

    iget-object v0, p0, Lpr/f0;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lpr/f0;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/network/b$a;

    iget-object v2, p0, Lpr/f0;->c:Ldt/i;

    invoke-interface {v2}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lor/a$a;

    iget-object v3, p0, Lpr/f0;->d:Ldt/i;

    invoke-interface {v3}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxq/a$a;

    iget-object v4, p0, Lpr/f0;->e:Ldt/i;

    invoke-interface {v4}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/withpersona/sdk2/inquiry/ui/h$a;

    invoke-static {v0, v1, v2, v3, v4}, Lpr/f0;->c(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lor/a$a;Lxq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)Lpr/e0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpr/f0;->b()Lpr/e0;

    move-result-object v0

    return-object v0
.end method
