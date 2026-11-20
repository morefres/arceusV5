.class public final Lep/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
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
            "Lep/w;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lep/y;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lbp/i;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lup/c;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lwn/a;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcp/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lep/w;",
            ">;",
            "Ldt/i<",
            "Lep/y;",
            ">;",
            "Ldt/i<",
            "Lbp/i;",
            ">;",
            "Ldt/i<",
            "Lup/c;",
            ">;",
            "Ldt/i<",
            "Lwn/a;",
            ">;",
            "Ldt/i<",
            "Lcp/a;",
            ">;",
            "Ldt/i<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/d;->a:Ldt/i;

    iput-object p2, p0, Lep/d;->b:Ldt/i;

    iput-object p3, p0, Lep/d;->c:Ldt/i;

    iput-object p4, p0, Lep/d;->d:Ldt/i;

    iput-object p5, p0, Lep/d;->e:Ldt/i;

    iput-object p6, p0, Lep/d;->f:Ldt/i;

    iput-object p7, p0, Lep/d;->g:Ldt/i;

    iput-object p8, p0, Lep/d;->h:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lep/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Landroid/content/Context;",
            ">;",
            "Ldt/i<",
            "Lep/w;",
            ">;",
            "Ldt/i<",
            "Lep/y;",
            ">;",
            "Ldt/i<",
            "Lbp/i;",
            ">;",
            "Ldt/i<",
            "Lup/c;",
            ">;",
            "Ldt/i<",
            "Lwn/a;",
            ">;",
            "Ldt/i<",
            "Lcp/a;",
            ">;",
            "Ldt/i<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lep/d;"
        }
    .end annotation

    new-instance v0, Lep/d;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lep/d;-><init>(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lep/w;Lep/y;Lbp/i;Lup/c;Lwn/a;Lcp/a;Z)Lcom/withpersona/sdk2/inquiry/internal/network/e;
    .locals 9

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/withpersona/sdk2/inquiry/internal/network/e;-><init>(Landroid/content/Context;Lep/w;Lep/y;Lbp/i;Lup/c;Lwn/a;Lcp/a;Z)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/internal/network/e;
    .locals 9

    iget-object v0, p0, Lep/d;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lep/d;->b:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lep/w;

    iget-object v0, p0, Lep/d;->c:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lep/y;

    iget-object v0, p0, Lep/d;->d:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lbp/i;

    iget-object v0, p0, Lep/d;->e:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lup/c;

    iget-object v0, p0, Lep/d;->f:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lwn/a;

    iget-object v0, p0, Lep/d;->g:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcp/a;

    iget-object v0, p0, Lep/d;->h:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-static/range {v1 .. v8}, Lep/d;->c(Landroid/content/Context;Lep/w;Lep/y;Lbp/i;Lup/c;Lwn/a;Lcp/a;Z)Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lep/d;->b()Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-result-object v0

    return-object v0
.end method
