.class public final Lcp/a$d;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp/a;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lju/p0;",
        "Lmt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lju/p0;",
        "",
        "<anonymous>",
        "(Lju/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1"
    f = "PlayIntegrityHelper.kt"
    l = {
        0x99,
        0x48,
        0x9c,
        0x5b,
        0x5f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public final synthetic C:Lcp/a;

.field public final synthetic D:Ljava/lang/String;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lcp/a;Ljava/lang/String;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp/a;",
            "Ljava/lang/String;",
            "Lmt/b<",
            "-",
            "Lcp/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcp/a$d;->C:Lcp/a;

    iput-object p2, p0, Lcp/a$d;->D:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lmt/b<",
            "*>;)",
            "Lmt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcp/a$d;

    iget-object v0, p0, Lcp/a$d;->C:Lcp/a;

    iget-object v1, p0, Lcp/a$d;->D:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcp/a$d;-><init>(Lcp/a;Ljava/lang/String;Lmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lcp/a$d;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lju/p0;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcp/a$d;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lcp/a$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcp/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, Lcp/a$d;->B:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, v1, Lcp/a$d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    iget-object v0, v1, Lcp/a$d;->v:Ljava/lang/Object;

    check-cast v0, Ltd/c$a;

    iget-object v0, v1, Lcp/a$d;->u:Ljava/lang/Object;

    check-cast v0, Ltd/c;

    iget-object v0, v1, Lcp/a$d;->t:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ltu/a;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lgt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Lcp/a$d;->w:Ljava/lang/Object;

    check-cast v0, Ltd/c$c;

    goto :goto_0

    :cond_2
    iget v2, v1, Lcp/a$d;->z:I

    iget v5, v1, Lcp/a$d;->y:I

    iget-object v7, v1, Lcp/a$d;->x:Ljava/lang/Object;

    check-cast v7, Lcp/a$d;

    iget-object v7, v1, Lcp/a$d;->w:Ljava/lang/Object;

    check-cast v7, Ltd/c$a;

    iget-object v10, v1, Lcp/a$d;->v:Ljava/lang/Object;

    check-cast v10, Ltd/c;

    iget-object v11, v1, Lcp/a$d;->u:Ljava/lang/Object;

    check-cast v11, Lcp/a;

    iget-object v12, v1, Lcp/a$d;->t:Ljava/lang/Object;

    check-cast v12, Ltu/a;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lgt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v4, p1

    move-object v14, v10

    move v10, v2

    move-object v2, v12

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v12

    goto/16 :goto_6

    :cond_3
    iget v2, v1, Lcp/a$d;->z:I

    iget v10, v1, Lcp/a$d;->y:I

    iget-object v11, v1, Lcp/a$d;->v:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v1, Lcp/a$d;->u:Ljava/lang/Object;

    check-cast v12, Lcp/a;

    iget-object v13, v1, Lcp/a$d;->t:Ljava/lang/Object;

    check-cast v13, Ltu/a;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lgt/o;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move/from16 v16, v10

    move v10, v2

    move-object v2, v13

    move-object v13, v11

    move/from16 v11, v16

    goto/16 :goto_2

    :catchall_2
    move-exception v0

    move-object v2, v13

    goto/16 :goto_6

    :cond_4
    iget v2, v1, Lcp/a$d;->y:I

    iget-object v10, v1, Lcp/a$d;->v:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v1, Lcp/a$d;->u:Ljava/lang/Object;

    check-cast v11, Lcp/a;

    iget-object v12, v1, Lcp/a$d;->t:Ljava/lang/Object;

    check-cast v12, Ltu/a;

    invoke-static/range {p1 .. p1}, Lgt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v10

    move v10, v2

    move-object v2, v12

    move-object/from16 v12, v16

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v1, Lcp/a$d;->C:Lcp/a;

    invoke-static {v2}, Lcp/a;->d(Lcp/a;)Ltu/a;

    move-result-object v2

    iget-object v11, v1, Lcp/a$d;->C:Lcp/a;

    iget-object v10, v1, Lcp/a$d;->D:Ljava/lang/String;

    iput-object v2, v1, Lcp/a$d;->t:Ljava/lang/Object;

    iput-object v11, v1, Lcp/a$d;->u:Ljava/lang/Object;

    iput-object v10, v1, Lcp/a$d;->v:Ljava/lang/Object;

    iput v8, v1, Lcp/a$d;->y:I

    iput v7, v1, Lcp/a$d;->B:I

    invoke-interface {v2, v9, v1}, Ltu/a;->c(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v0, :cond_6

    goto/16 :goto_4

    :cond_6
    move-object v12, v10

    move v10, v8

    :goto_1
    :try_start_3
    invoke-static {v11}, Lcp/a;->e(Lcp/a;)Lmu/c0;

    move-result-object v13

    invoke-interface {v13}, Lmu/c0;->getValue()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lcp/a$b$b;->a:Lcp/a$b$b;

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v2, v9}, Ltu/a;->f(Ljava/lang/Object;)V

    return-object v0

    :cond_7
    :try_start_4
    invoke-static {v11}, Lcp/a;->e(Lcp/a;)Lmu/c0;

    move-result-object v13

    sget-object v14, Lcp/a$b$c;->a:Lcp/a$b$c;

    iput-object v2, v1, Lcp/a$d;->t:Ljava/lang/Object;

    iput-object v11, v1, Lcp/a$d;->u:Ljava/lang/Object;

    iput-object v12, v1, Lcp/a$d;->v:Ljava/lang/Object;

    iput v10, v1, Lcp/a$d;->y:I

    iput v8, v1, Lcp/a$d;->z:I

    iput v6, v1, Lcp/a$d;->B:I

    invoke-interface {v13, v14, v1}, Lmu/b0;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v0, :cond_8

    goto/16 :goto_4

    :cond_8
    move-object v13, v12

    move-object v12, v11

    move v11, v10

    move v10, v8

    :goto_2
    invoke-static {v12}, Lcp/a;->f(Lcp/a;)Lcp/f;

    move-result-object v14

    invoke-static {v12}, Lcp/a;->a(Lcp/a;)Landroid/content/Context;

    move-result-object v15

    invoke-interface {v14, v15}, Lcp/f;->create(Landroid/content/Context;)Ltd/c;

    move-result-object v14

    invoke-static {}, Ltd/c$a;->c()Ltd/c$a$a;

    move-result-object v15

    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v15, v3, v4}, Ltd/c$a$a;->b(J)Ltd/c$a$a;

    move-result-object v3

    invoke-virtual {v3}, Ltd/c$a$a;->a()Ltd/c$a;

    move-result-object v3

    iput-object v2, v1, Lcp/a$d;->t:Ljava/lang/Object;

    iput-object v12, v1, Lcp/a$d;->u:Ljava/lang/Object;

    iput-object v14, v1, Lcp/a$d;->v:Ljava/lang/Object;

    iput-object v3, v1, Lcp/a$d;->w:Ljava/lang/Object;

    iput-object v1, v1, Lcp/a$d;->x:Ljava/lang/Object;

    iput v11, v1, Lcp/a$d;->y:I

    iput v10, v1, Lcp/a$d;->z:I

    iput v8, v1, Lcp/a$d;->A:I

    iput v5, v1, Lcp/a$d;->B:I

    new-instance v4, Lju/p;

    invoke-static {v1}, Lnt/b;->c(Lmt/b;)Lmt/b;

    move-result-object v5

    invoke-direct {v4, v5, v7}, Lju/p;-><init>(Lmt/b;I)V

    invoke-virtual {v4}, Lju/p;->F()V

    invoke-interface {v14, v3}, Ltd/c;->a(Ltd/c$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object v5

    new-instance v7, Lcp/a$d$a;

    invoke-direct {v7, v4}, Lcp/a$d$a;-><init>(Lju/n;)V

    new-instance v13, Lcp/b;

    invoke-direct {v13, v7}, Lcp/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v13}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object v5

    new-instance v7, Lcp/a$d$b;

    invoke-direct {v7, v4}, Lcp/a$d$b;-><init>(Lju/n;)V

    invoke-virtual {v5, v7}, Lcom/google/android/gms/tasks/Task;->e(Lsb/f;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v4}, Lju/p;->z()Ljava/lang/Object;

    move-result-object v4

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_9

    invoke-static {v1}, Lot/h;->c(Lmt/b;)V

    :cond_9
    if-ne v4, v0, :cond_a

    goto/16 :goto_4

    :cond_a
    move-object v7, v3

    move v5, v11

    move-object v11, v12

    :goto_3
    check-cast v4, Lgt/n;

    invoke-virtual {v4}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lgt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_b

    check-cast v3, Ltd/c$c;

    invoke-static {v11}, Lcp/a;->e(Lcp/a;)Lmu/c0;

    move-result-object v4

    new-instance v6, Lcp/a$b$d;

    invoke-direct {v6, v3}, Lcp/a$b$d;-><init>(Ltd/c$c;)V

    iput-object v2, v1, Lcp/a$d;->t:Ljava/lang/Object;

    invoke-static {v14}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v1, Lcp/a$d;->u:Ljava/lang/Object;

    invoke-static {v7}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcp/a$d;->v:Ljava/lang/Object;

    invoke-static {v3}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcp/a$d;->w:Ljava/lang/Object;

    iput-object v9, v1, Lcp/a$d;->x:Ljava/lang/Object;

    iput v5, v1, Lcp/a$d;->y:I

    iput v10, v1, Lcp/a$d;->z:I

    iput v8, v1, Lcp/a$d;->A:I

    const/4 v3, 0x4

    iput v3, v1, Lcp/a$d;->B:I

    invoke-interface {v4, v6, v1}, Lmu/b0;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_c

    goto :goto_4

    :cond_b
    invoke-static {v11}, Lcp/a;->c(Lcp/a;)Llp/e;

    move-result-object v3

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "integrity:prepare:"

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v3, v12, v9, v6, v9}, Llp/e;->b(Llp/e;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {v11}, Lcp/a;->e(Lcp/a;)Lmu/c0;

    move-result-object v3

    sget-object v6, Lcp/a$b$a;->a:Lcp/a$b$a;

    iput-object v2, v1, Lcp/a$d;->t:Ljava/lang/Object;

    invoke-static {v14}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v1, Lcp/a$d;->u:Ljava/lang/Object;

    invoke-static {v7}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcp/a$d;->v:Ljava/lang/Object;

    invoke-static {v4}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcp/a$d;->w:Ljava/lang/Object;

    iput-object v9, v1, Lcp/a$d;->x:Ljava/lang/Object;

    iput v5, v1, Lcp/a$d;->y:I

    iput v10, v1, Lcp/a$d;->z:I

    iput v8, v1, Lcp/a$d;->A:I

    const/4 v4, 0x5

    iput v4, v1, Lcp/a$d;->B:I

    invoke-interface {v3, v6, v1}, Lmu/b0;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_c

    :goto_4
    return-object v0

    :cond_c
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-interface {v2, v9}, Ltu/a;->f(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :goto_6
    invoke-interface {v2, v9}, Ltu/a;->f(Ljava/lang/Object;)V

    throw v0
.end method
