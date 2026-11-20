.class public final Lcom/withpersona/sdk2/inquiry/internal/e$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwp/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "p"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$p;

.field public c:Laq/c;

.field public d:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Laq/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lrr/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lwp/v;

.field public g:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/e$b;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lrp/d;

.field public i:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ldn/t;

.field public k:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lfn/c0;

.field public m:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lfn/b0$a;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lfn/e;

.field public o:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lfn/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public p:Lbq/b;

.field public q:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lbq/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public r:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/g;",
            ">;"
        }
    .end annotation
.end field

.field public s:Ldq/m2;

.field public t:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Ldq/k2$d;",
            ">;"
        }
    .end annotation
.end field

.field public u:Lcq/l;

.field public v:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->b:Lcom/withpersona/sdk2/inquiry/internal/e$p;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$p;->b(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$p;->c(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)V

    return-void
.end method

.method public final b(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->m1:Ldt/i;

    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->d1:Ldt/i;

    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->C0:Ldt/i;

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->e1:Ldt/i;

    iget-object v7, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g1:Ldt/i;

    iget-object v8, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Ldt/i;

    iget-object v9, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->S0:Ldt/i;

    invoke-static/range {v2 .. v9}, Laq/c;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Laq/c;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->c:Laq/c;

    invoke-static {v1}, Laq/d;->b(Laq/c;)Ldt/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->d:Ldt/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->l1:Ldt/i;

    invoke-static {v1}, Lrr/c;->a(Ldt/i;)Lrr/c;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->e:Ldt/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q:Ldt/i;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Ldt/i;

    invoke-static {v2, v1}, Lwp/v;->a(Ldt/i;Ldt/i;)Lwp/v;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->f:Lwp/v;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/f;->b(Lwp/v;)Ldt/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->g:Ldt/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q0:Ldt/i;

    invoke-static {v1}, Lrp/d;->a(Ldt/i;)Lrp/d;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->h:Lrp/d;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;->b(Lrp/d;)Ldt/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->i:Ldt/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g1:Ldt/i;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Ldt/i;

    invoke-static {v2, v3, v1}, Ldn/t;->a(Ldt/i;Ldt/i;Ldt/i;)Ldn/t;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->j:Ldn/t;

    invoke-static {v1}, Lcom/withpersona/sdk2/camera/f;->b(Ldn/t;)Ldt/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->k:Ldt/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g1:Ldt/i;

    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Ldt/i;

    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->R:Ldt/i;

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->G:Ldt/i;

    iget-object v7, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Ldt/i;

    iget-object v8, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->F0:Ldt/i;

    iget-object v9, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Ldt/i;

    invoke-static/range {v2 .. v9}, Lfn/c0;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lfn/c0;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->l:Lfn/c0;

    invoke-static {v1}, Lfn/d0;->b(Lfn/c0;)Ldt/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->m:Ldt/i;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/internal/e$f;->R:Ldt/i;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/internal/e$f;->H:Ldt/i;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Ldt/i;

    invoke-static {v1, v3, v4, v2}, Lfn/e;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lfn/e;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->n:Lfn/e;

    invoke-static {v1}, Lfn/f;->b(Lfn/e;)Ldt/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->o:Ldt/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->w:Ldt/i;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->m1:Ldt/i;

    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->H:Ldt/i;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->n1:Ldt/i;

    invoke-static {v2, v3, v4, v1}, Lbq/b;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Lbq/b;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->p:Lbq/b;

    invoke-static {v1}, Lbq/c;->b(Lbq/b;)Ldt/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->q:Ldt/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->F0:Ldt/i;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Ldt/i;

    invoke-static {v2, v1}, Lwp/w;->a(Ldt/i;Ldt/i;)Lwp/w;

    move-result-object v15

    iput-object v15, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->r:Ldt/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Ldt/i;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->d:Ldt/i;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->e:Ldt/i;

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->g:Ldt/i;

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->i:Ldt/i;

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->k:Ldt/i;

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->o:Ldt/i;

    iget-object v10, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g1:Ldt/i;

    iget-object v11, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->i1:Ldt/i;

    iget-object v12, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->S0:Ldt/i;

    iget-object v13, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Ldt/i;

    iget-object v14, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->q:Ldt/i;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Ldt/i;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Ldt/i;

    move-object/from16 v17, v1

    move-object/from16 v16, v2

    invoke-static/range {v3 .. v17}, Ldq/m2;->a(Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;Ldt/i;)Ldq/m2;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->s:Ldq/m2;

    invoke-static {v1}, Ldq/n2;->b(Ldq/m2;)Ldt/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->t:Ldt/i;

    invoke-static {v1}, Lcq/l;->a(Ldt/i;)Lcq/l;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->u:Lcq/l;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/c;->b(Lcq/l;)Ldt/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->v:Ldt/i;

    return-void
.end method

.method public c(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$p;->d(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;

    return-void
.end method

.method public final d(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Lbt/b;

    move-result-object v0

    invoke-static {p1, v0}, Lmq/b;->a(Lmq/a;Lbt/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->v:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->f(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->l()Lcom/withpersona/sdk2/camera/b;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->a(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Lcom/withpersona/sdk2/camera/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q:Ldt/i;

    invoke-static {v0}, Ldt/c;->b(Ldt/i;)Lat/a;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->c(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Lat/a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->e(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltq/a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->d(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Ltq/a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leo/e;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->b(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Leo/e;)V

    return-object p1
.end method
