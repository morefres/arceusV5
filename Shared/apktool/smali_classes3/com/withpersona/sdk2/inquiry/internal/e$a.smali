.class public final Lcom/withpersona/sdk2/inquiry/internal/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

.field public b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

.field public c:Lkp/q;

.field public d:Ldn/k;

.field public e:Lkp/w;

.field public f:Loq/a;

.field public g:Lxo/n;

.field public h:Lkp/d;

.field public i:Lkp/i;

.field public j:Lup/f;

.field public k:Lop/e;

.field public l:Ljp/c;

.field public m:Lkq/b;

.field public n:Lbp/c;

.field public o:Lhq/c0;

.field public p:Ljq/c;

.field public q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

.field public r:Lnq/f;

.field public s:Lkp/c0;

.field public t:Lwn/e;

.field public u:Leo/g;

.field public v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lxo/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    return-object p0
.end method

.method public b()Lxo/s;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    const-class v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    const-class v2, Lcom/withpersona/sdk2/inquiry/internal/network/f;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->c:Lkp/q;

    const-class v2, Lkp/q;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->d:Ldn/k;

    if-nez v1, :cond_0

    new-instance v1, Ldn/k;

    invoke-direct {v1}, Ldn/k;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->d:Ldn/k;

    :cond_0
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->e:Lkp/w;

    const-class v2, Lkp/w;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->f:Loq/a;

    const-class v2, Loq/a;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->g:Lxo/n;

    const-class v2, Lxo/n;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->h:Lkp/d;

    const-class v2, Lkp/d;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->i:Lkp/i;

    const-class v2, Lkp/i;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->j:Lup/f;

    if-nez v1, :cond_1

    new-instance v1, Lup/f;

    invoke-direct {v1}, Lup/f;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->j:Lup/f;

    :cond_1
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->k:Lop/e;

    const-class v2, Lop/e;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->l:Ljp/c;

    const-class v2, Ljp/c;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->m:Lkq/b;

    const-class v2, Lkq/b;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->n:Lbp/c;

    const-class v2, Lbp/c;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Lhq/c0;

    if-nez v1, :cond_2

    new-instance v1, Lhq/c0;

    invoke-direct {v1}, Lhq/c0;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Lhq/c0;

    :cond_2
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->p:Ljq/c;

    if-nez v1, :cond_3

    new-instance v1, Ljq/c;

    invoke-direct {v1}, Ljq/c;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->p:Ljq/c;

    :cond_3
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    const-class v2, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->r:Lnq/f;

    const-class v2, Lnq/f;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->s:Lkp/c0;

    const-class v2, Lkp/c0;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->t:Lwn/e;

    if-nez v1, :cond_4

    new-instance v1, Lwn/e;

    invoke-direct {v1}, Lwn/e;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->t:Lwn/e;

    :cond_4
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->u:Leo/g;

    if-nez v1, :cond_5

    new-instance v1, Leo/g;

    invoke-direct {v1}, Leo/g;-><init>()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->u:Leo/g;

    :cond_5
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    const-class v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    invoke-static {v1, v2}, Ldt/h;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->c:Lkp/q;

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->d:Ldn/k;

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->e:Lkp/w;

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->f:Loq/a;

    iget-object v10, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->g:Lxo/n;

    iget-object v11, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->h:Lkp/d;

    iget-object v12, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->i:Lkp/i;

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->j:Lup/f;

    iget-object v14, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->k:Lop/e;

    iget-object v15, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->l:Ljp/c;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->m:Lkq/b;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->n:Lbp/c;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Lhq/c0;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->p:Ljq/c;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->q:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->r:Lnq/f;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->s:Lkp/c0;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->t:Lwn/e;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->u:Leo/g;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    move-object/from16 v25, v1

    move-object/from16 v17, v2

    invoke-direct/range {v3 .. v25}, Lcom/withpersona/sdk2/inquiry/internal/e$f;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/internal/network/f;Lkp/q;Ldn/k;Lkp/w;Loq/a;Lxo/n;Lkp/d;Lkp/i;Lup/f;Lop/e;Ljp/c;Lkq/b;Lbp/c;Lhq/c0;Ljq/c;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;Lnq/f;Lkp/c0;Lwn/e;Leo/g;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)V

    return-object v3
.end method

.method public c(Lkp/d;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkp/d;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->h:Lkp/d;

    return-object p0
.end method

.method public d(Lkq/b;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkq/b;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->m:Lkq/b;

    return-object p0
.end method

.method public e(Lkp/i;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkp/i;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->i:Lkp/i;

    return-object p0
.end method

.method public f(Lkp/q;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkp/q;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->c:Lkp/q;

    return-object p0
.end method

.method public g(Lnq/f;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnq/f;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->r:Lnq/f;

    return-object p0
.end method

.method public h(Lbp/c;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbp/c;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->n:Lbp/c;

    return-object p0
.end method

.method public i(Loq/a;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Loq/a;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->f:Loq/a;

    return-object p0
.end method

.method public j(Lxo/n;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxo/n;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->g:Lxo/n;

    return-object p0
.end method

.method public k(Lcom/withpersona/sdk2/inquiry/internal/network/f;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->b:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    return-object p0
.end method

.method public l(Ljp/c;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljp/c;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->l:Ljp/c;

    return-object p0
.end method

.method public m(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    return-object p0
.end method

.method public n(Lop/e;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lop/e;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->k:Lop/e;

    return-object p0
.end method

.method public o(Lkp/w;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkp/w;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->e:Lkp/w;

    return-object p0
.end method

.method public p(Lkp/c0;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkp/c0;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->s:Lkp/c0;

    return-object p0
.end method

.method public q(Lhq/c0;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhq/c0;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->o:Lhq/c0;

    return-object p0
.end method

.method public r(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)Lcom/withpersona/sdk2/inquiry/internal/e$a;
    .locals 0

    invoke-static {p1}, Ldt/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$a;->v:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    return-object p0
.end method
