.class public final Lcom/withpersona/sdk2/inquiry/internal/e$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqr/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "r"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$r;

.field public c:Lop/k;

.field public d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/nfc/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljp/o;

.field public f:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ljp/n$a;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lmr/l1;

.field public h:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lmr/k6;

.field public j:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/k$a;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lor/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/h$a;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lpr/e0;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lrp/d;

.field public p:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lpr/h1;

.field public r:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lpr/g1$e;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lqr/d;

.field public t:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->b:Lcom/withpersona/sdk2/inquiry/internal/e$r;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$r;->b(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$r;->c(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)V

    return-void
.end method

.method public final b(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)V
    .locals 13

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->o1:Ldt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object v2, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a0:Ldt/i;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Ldt/i;

    invoke-static {v0, v1, v2, v3, p1}, Lop/k;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lop/k;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->c:Lop/k;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/nfc/c;->b(Lop/k;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->d:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->p1:Ldt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a0:Ldt/i;

    invoke-static {v0, v1, p1}, Ljp/o;->a(Ldt/i;Ldt/i;Ldt/i;)Ljp/o;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->e:Ljp/o;

    invoke-static {p1}, Ljp/p;->b(Ljp/o;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->f:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Ldt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->V0:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r1:Ldt/i;

    invoke-static {v0, v1, p1}, Lmr/l1;->a(Ldt/i;Ldt/i;Ldt/i;)Lmr/l1;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->g:Lmr/l1;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/e;->b(Lmr/l1;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->h:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r1:Ldt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D:Ldt/i;

    invoke-static {v0, v1, p1}, Lmr/k6;->a(Ldt/i;Ldt/i;Ldt/i;)Lmr/k6;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->i:Lmr/k6;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/l;->b(Lmr/k6;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->j:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Ldt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/network/c;->a(Ldt/i;)Lcom/withpersona/sdk2/inquiry/ui/network/c;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->k:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Ldt/i;

    invoke-static {p1}, Lor/b;->a(Ldt/i;)Lor/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->l:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->s1:Ldt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->h1:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/ui/i;->a(Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/ui/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->m:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->k:Ldt/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->l:Ldt/i;

    invoke-static {}, Lxq/b;->a()Lxq/b;

    move-result-object v2

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->m:Ldt/i;

    invoke-static {p1, v0, v1, v2, v3}, Lpr/f0;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lpr/f0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->n:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q0:Ldt/i;

    invoke-static {p1}, Lrp/d;->a(Ldt/i;)Lrp/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->o:Lrp/d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;->b(Lrp/d;)Ldt/i;

    move-result-object v11

    iput-object v11, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->p:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->d:Ldt/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->f:Ldt/i;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a0:Ldt/i;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->h:Ldt/i;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->j:Ldt/i;

    iget-object v6, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->i1:Ldt/i;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->n:Ldt/i;

    iget-object v8, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->F0:Ldt/i;

    iget-object v9, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Ldt/i;

    iget-object v10, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Ldt/i;

    iget-object v12, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Ldt/i;

    invoke-static/range {v0 .. v12}, Lpr/h1;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lpr/h1;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->q:Lpr/h1;

    invoke-static {p1}, Lpr/i1;->b(Lpr/h1;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->r:Ldt/i;

    invoke-static {p1}, Lqr/d;->a(Ldt/i;)Lqr/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->s:Lqr/d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/uiStep/c;->b(Lqr/d;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->t:Ldt/i;

    return-void
.end method

.method public c(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$r;->d(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;

    return-void
.end method

.method public final d(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Lbt/b;

    move-result-object v0

    invoke-static {p1, v0}, Lmq/b;->a(Lmq/a;Lbt/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->t:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/ui/uiStep/a;->b(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltq/a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/ui/uiStep/a;->a(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;Ltq/a;)V

    return-object p1
.end method
