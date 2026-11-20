.class public final Lcom/withpersona/sdk2/inquiry/internal/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxn/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$c;

.field public c:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/a;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/i$b;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lzn/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/g$a;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lrp/d;

.field public k:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lao/c1;

.field public m:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/step/b$c;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lcom/withpersona/sdk2/inquiry/document/step/e;

.field public o:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/step/d$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->b:Lcom/withpersona/sdk2/inquiry/internal/e$c;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$c;->b(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$c;->c(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)V

    return-void
.end method

.method public final b(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)V
    .locals 14

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->t1:Ldt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Ldt/i;

    invoke-static {v0, v1, p1}, Lxn/b;->a(Ldt/i;Ldt/i;Ldt/i;)Lxn/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->c:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->s1:Ldt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->u1:Ldt/i;

    iget-object v2, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Ldt/i;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/document/j;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/document/j;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->d:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Ldt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/network/b;->a(Ldt/i;)Lcom/withpersona/sdk2/inquiry/document/network/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->e:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Ldt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/network/f;->a(Ldt/i;)Lcom/withpersona/sdk2/inquiry/document/network/f;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->f:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->w1:Ldt/i;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/document/network/d;->a(Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/document/network/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->g:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Ldt/i;

    invoke-static {p1}, Lzn/b;->a(Ldt/i;)Lzn/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->h:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Ldt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->C0:Ldt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->d1:Ldt/i;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/document/network/h;->a(Ldt/i;Ldt/i;Ldt/i;)Lcom/withpersona/sdk2/inquiry/document/network/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->i:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q0:Ldt/i;

    invoke-static {p1}, Lrp/d;->a(Ldt/i;)Lrp/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->j:Lrp/d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;->b(Lrp/d;)Ldt/i;

    move-result-object v12

    iput-object v12, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->k:Ldt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r0:Ldt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->c:Ldt/i;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->d:Ldt/i;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->e:Ldt/i;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->f:Ldt/i;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->g:Ldt/i;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->h:Ldt/i;

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->i:Ldt/i;

    iget-object v9, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->i1:Ldt/i;

    iget-object v10, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->F0:Ldt/i;

    iget-object v11, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Ldt/i;

    iget-object v13, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Ldt/i;

    invoke-static/range {v0 .. v13}, Lao/c1;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lao/c1;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->l:Lao/c1;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/step/c;->b(Lao/c1;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->m:Ldt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/step/e;->a(Ldt/i;)Lcom/withpersona/sdk2/inquiry/document/step/e;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->n:Lcom/withpersona/sdk2/inquiry/document/step/e;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/step/f;->b(Lcom/withpersona/sdk2/inquiry/document/step/e;)Ldt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->o:Ldt/i;

    return-void
.end method

.method public c(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$c;->d(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;

    return-void
.end method

.method public final d(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Lbt/b;

    move-result-object v0

    invoke-static {p1, v0}, Lmq/b;->a(Lmq/a;Lbt/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->o:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/step/d$a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/a;->b(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;Lcom/withpersona/sdk2/inquiry/document/step/d$a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltq/a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/a;->a(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;Ltq/a;)V

    return-object p1
.end method
