.class public final synthetic Lmu/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0008\u001aM\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0007\u001a$\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aU\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u000120\u0010\u0007\u001a,\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u0005*\u0006\u0012\u0002\u0008\u00030\u0003H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\\\u0010\u0011\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u000320\u0010\u0007\u001a,\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "T",
        "Lmu/h;",
        "Lkotlin/Function2;",
        "Lmu/i;",
        "Lmt/b;",
        "",
        "",
        "action",
        "e",
        "(Lmu/h;Lkotlin/jvm/functions/Function2;)Lmu/h;",
        "Lkotlin/Function3;",
        "",
        "d",
        "(Lmu/h;Lyt/n;)Lmu/h;",
        "b",
        "(Lmu/i;)V",
        "cause",
        "c",
        "(Lmu/i;Lyt/n;Ljava/lang/Throwable;Lmt/b;)Ljava/lang/Object;",
        "kotlinx-coroutines-core"
    }
    k = 0x5
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
    xs = "kotlinx/coroutines/flow/FlowKt"
.end annotation


# direct methods
.method public static final synthetic a(Lmu/i;Lyt/n;Ljava/lang/Throwable;Lmt/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmu/u;->c(Lmu/i;Lyt/n;Ljava/lang/Throwable;Lmt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lmu/i;)V
    .locals 1
    .param p0    # Lmu/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/i<",
            "*>;)V"
        }
    .end annotation

    instance-of v0, p0, Lmu/u0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, Lmu/u0;

    iget-object p0, p0, Lmu/u0;->a:Ljava/lang/Throwable;

    throw p0
.end method

.method public static final c(Lmu/i;Lyt/n;Ljava/lang/Throwable;Lmt/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/i<",
            "-TT;>;",
            "Lyt/n<",
            "-",
            "Lmu/i<",
            "-TT;>;-",
            "Ljava/lang/Throwable;",
            "-",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Throwable;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lmu/u$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lmu/u$a;

    iget v1, v0, Lmu/u$a;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmu/u$a;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmu/u$a;

    invoke-direct {v0, p3}, Lmu/u$a;-><init>(Lmt/b;)V

    :goto_0
    iget-object p3, v0, Lmu/u$a;->u:Ljava/lang/Object;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lmu/u$a;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lmu/u$a;->t:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Ljava/lang/Throwable;

    :try_start_0
    invoke-static {p3}, Lgt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lgt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p2, v0, Lmu/u$a;->t:Ljava/lang/Object;

    iput v3, v0, Lmu/u$a;->v:I

    invoke-interface {p1, p0, p2, v0}, Lyt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :goto_2
    if-eqz p2, :cond_4

    if-eq p2, p0, :cond_4

    invoke-static {p0, p2}, Lgt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    throw p0
.end method

.method public static final d(Lmu/h;Lyt/n;)Lmu/h;
    .locals 1
    .param p0    # Lmu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lyt/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/h<",
            "+TT;>;",
            "Lyt/n<",
            "-",
            "Lmu/i<",
            "-TT;>;-",
            "Ljava/lang/Throwable;",
            "-",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lmu/h<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lmu/u$b;

    invoke-direct {v0, p0, p1}, Lmu/u$b;-><init>(Lmu/h;Lyt/n;)V

    return-object v0
.end method

.method public static final e(Lmu/h;Lkotlin/jvm/functions/Function2;)Lmu/h;
    .locals 1
    .param p0    # Lmu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/h<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lmu/i<",
            "-TT;>;-",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lmu/h<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lmu/u$c;

    invoke-direct {v0, p1, p0}, Lmu/u$c;-><init>(Lkotlin/jvm/functions/Function2;Lmu/h;)V

    return-object v0
.end method
