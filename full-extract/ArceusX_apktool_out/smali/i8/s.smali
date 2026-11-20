.class public final Li8/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Li8/r;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Lc8/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Lj8/d;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Li8/x;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Lk8/b;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Ll8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Ll8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lft/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/a<",
            "Lj8/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/a<",
            "Landroid/content/Context;",
            ">;",
            "Lft/a<",
            "Lc8/e;",
            ">;",
            "Lft/a<",
            "Lj8/d;",
            ">;",
            "Lft/a<",
            "Li8/x;",
            ">;",
            "Lft/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lft/a<",
            "Lk8/b;",
            ">;",
            "Lft/a<",
            "Ll8/a;",
            ">;",
            "Lft/a<",
            "Ll8/a;",
            ">;",
            "Lft/a<",
            "Lj8/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/s;->a:Lft/a;

    iput-object p2, p0, Li8/s;->b:Lft/a;

    iput-object p3, p0, Li8/s;->c:Lft/a;

    iput-object p4, p0, Li8/s;->d:Lft/a;

    iput-object p5, p0, Li8/s;->e:Lft/a;

    iput-object p6, p0, Li8/s;->f:Lft/a;

    iput-object p7, p0, Li8/s;->g:Lft/a;

    iput-object p8, p0, Li8/s;->h:Lft/a;

    iput-object p9, p0, Li8/s;->i:Lft/a;

    return-void
.end method

.method public static a(Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;)Li8/s;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/a<",
            "Landroid/content/Context;",
            ">;",
            "Lft/a<",
            "Lc8/e;",
            ">;",
            "Lft/a<",
            "Lj8/d;",
            ">;",
            "Lft/a<",
            "Li8/x;",
            ">;",
            "Lft/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lft/a<",
            "Lk8/b;",
            ">;",
            "Lft/a<",
            "Ll8/a;",
            ">;",
            "Lft/a<",
            "Ll8/a;",
            ">;",
            "Lft/a<",
            "Lj8/c;",
            ">;)",
            "Li8/s;"
        }
    .end annotation

    new-instance v0, Li8/s;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Li8/s;-><init>(Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;Lft/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lc8/e;Lj8/d;Li8/x;Ljava/util/concurrent/Executor;Lk8/b;Ll8/a;Ll8/a;Lj8/c;)Li8/r;
    .locals 10

    new-instance v0, Li8/r;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Li8/r;-><init>(Landroid/content/Context;Lc8/e;Lj8/d;Li8/x;Ljava/util/concurrent/Executor;Lk8/b;Ll8/a;Ll8/a;Lj8/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Li8/r;
    .locals 10

    iget-object v0, p0, Li8/s;->a:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Li8/s;->b:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc8/e;

    iget-object v0, p0, Li8/s;->c:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lj8/d;

    iget-object v0, p0, Li8/s;->d:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Li8/x;

    iget-object v0, p0, Li8/s;->e:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Li8/s;->f:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lk8/b;

    iget-object v0, p0, Li8/s;->g:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ll8/a;

    iget-object v0, p0, Li8/s;->h:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ll8/a;

    iget-object v0, p0, Li8/s;->i:Lft/a;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lj8/c;

    invoke-static/range {v1 .. v9}, Li8/s;->c(Landroid/content/Context;Lc8/e;Lj8/d;Li8/x;Ljava/util/concurrent/Executor;Lk8/b;Ll8/a;Ll8/a;Lj8/c;)Li8/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/s;->b()Li8/r;

    move-result-object v0

    return-object v0
.end method
