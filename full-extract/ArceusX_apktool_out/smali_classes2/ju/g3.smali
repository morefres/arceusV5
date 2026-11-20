.class public final Lju/g3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aO\u0010\u0008\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0002 \u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aO\u0010\u000c\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0007\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0002 \u0001\u00a2\u0006\u0004\u0008\u000c\u0010\t\u001aD\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u00a2\u0006\u0004\u0008\r\u0010\t\u001aY\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\u0004\u0008\u0000\u0010\u000e\"\u0008\u0008\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\"\u0010\u0007\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "T",
        "",
        "timeMillis",
        "Lkotlin/Function2;",
        "Lju/p0;",
        "Lmt/b;",
        "",
        "block",
        "c",
        "(JLkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;",
        "Lkotlin/time/a;",
        "timeout",
        "d",
        "e",
        "U",
        "Lju/f3;",
        "coroutine",
        "b",
        "(Lju/f3;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;",
        "time",
        "Lju/y0;",
        "delay",
        "Lju/d2;",
        "Lju/e3;",
        "a",
        "(JLju/y0;Lju/d2;)Lju/e3;",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(JLju/y0;Lju/d2;)Lju/e3;
    .locals 2
    .param p2    # Lju/y0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lju/d2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p2, Lju/a1;

    if-eqz v0, :cond_0

    check-cast p2, Lju/a1;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    sget-object v0, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    sget-object v0, Liu/b;->d:Liu/b;

    invoke-static {p0, p1, v0}, Lkotlin/time/b;->q(JLiu/b;)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Lju/a1;->s(J)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Timed out waiting for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_2
    new-instance p0, Lju/e3;

    invoke-direct {p0, p2, p3}, Lju/e3;-><init>(Ljava/lang/String;Lju/d2;)V

    return-object p0
.end method

.method public static final b(Lju/f3;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            "T::TU;>(",
            "Lju/f3<",
            "TU;-TT;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lju/p0;",
            "-",
            "Lmt/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lpu/a0;->d:Lmt/b;

    invoke-interface {v0}, Lmt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lju/z0;->d(Lkotlin/coroutines/CoroutineContext;)Lju/y0;

    move-result-object v0

    iget-wide v1, p0, Lju/f3;->e:J

    invoke-virtual {p0}, Lju/a;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    invoke-interface {v0, v1, v2, p0, v3}, Lju/y0;->h(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lju/i1;

    move-result-object v0

    invoke-static {p0, v0}, Lju/g2;->e(Lju/d2;Lju/i1;)Lju/i1;

    invoke-static {p0, p0, p1}, Lqu/b;->e(Lpu/a0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(JLkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;
    .locals 2
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lju/p0;",
            "-",
            "Lmt/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lmt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_1

    new-instance v0, Lju/f3;

    invoke-direct {v0, p0, p1, p3}, Lju/f3;-><init>(JLmt/b;)V

    invoke-static {v0, p2}, Lju/g3;->b(Lju/f3;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p3}, Lot/h;->c(Lmt/b;)V

    :cond_0
    return-object p0

    :cond_1
    new-instance p0, Lju/e3;

    const-string p1, "Timed out immediately"

    invoke-direct {p0, p1}, Lju/e3;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(JLkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lju/p0;",
            "-",
            "Lmt/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lmt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1}, Lju/z0;->e(J)J

    move-result-wide p0

    invoke-static {p0, p1, p2, p3}, Lju/g3;->c(JLkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(JLkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;
    .locals 7
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lju/p0;",
            "-",
            "Lmt/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lmt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Lju/g3$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lju/g3$a;

    iget v1, v0, Lju/g3$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lju/g3$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lju/g3$a;

    invoke-direct {v0, p3}, Lju/g3$a;-><init>(Lmt/b;)V

    :goto_0
    iget-object p3, v0, Lju/g3$a;->w:Ljava/lang/Object;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lju/g3$a;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lju/g3$a;->v:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/c0;

    iget-object p1, v0, Lju/g3$a;->u:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function2;

    :try_start_0
    invoke-static {p3}, Lgt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lju/e3; {:try_start_0 .. :try_end_0} :catch_0

    return-object p3

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lgt/o;->b(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    cmp-long p3, p0, v5

    if-gtz p3, :cond_3

    return-object v3

    :cond_3
    new-instance p3, Lkotlin/jvm/internal/c0;

    invoke-direct {p3}, Lkotlin/jvm/internal/c0;-><init>()V

    :try_start_1
    iput-object p2, v0, Lju/g3$a;->u:Ljava/lang/Object;

    iput-object p3, v0, Lju/g3$a;->v:Ljava/lang/Object;

    iput-wide p0, v0, Lju/g3$a;->t:J

    iput v4, v0, Lju/g3$a;->x:I

    new-instance v2, Lju/f3;

    invoke-direct {v2, p0, p1, v0}, Lju/f3;-><init>(JLmt/b;)V

    iput-object v2, p3, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    invoke-static {v2, p2}, Lju/g3;->b(Lju/f3;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    invoke-static {v0}, Lot/h;->c(Lmt/b;)V
    :try_end_1
    .catch Lju/e3; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    move-object p0, p3

    goto :goto_2

    :cond_4
    :goto_1
    if-ne p0, v1, :cond_5

    return-object v1

    :cond_5
    return-object p0

    :goto_2
    iget-object p2, p1, Lju/e3;->a:Lju/d2;

    iget-object p0, p0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    if-ne p2, p0, :cond_6

    return-object v3

    :cond_6
    throw p1
.end method
