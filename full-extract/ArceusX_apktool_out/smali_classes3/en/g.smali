.class public final Len/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Len/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Len/g;",
        "Len/e;",
        "Len/j;",
        "idFrontAnalyzer",
        "Len/d;",
        "barcodePdf417Analyzer",
        "<init>",
        "(Len/j;Len/d;)V",
        "Ldn/z;",
        "image",
        "Landroid/graphics/Rect;",
        "viewfinderRect",
        "Lgt/n;",
        "Len/a;",
        "a",
        "(Ldn/z;Landroid/graphics/Rect;Lmt/b;)Ljava/lang/Object;",
        "Len/j;",
        "b",
        "Len/d;",
        "",
        "Ldn/j0$c;",
        "c",
        "Ljava/util/Map;",
        "analyzers",
        "camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Len/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Len/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Len/e;",
            "Ldn/j0$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Len/j;Len/d;)V
    .locals 1
    .param p1    # Len/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Len/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "idFrontAnalyzer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barcodePdf417Analyzer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Len/g;->a:Len/j;

    iput-object p2, p0, Len/g;->b:Len/d;

    sget-object v0, Ldn/j0$c;->b:Ldn/j0$c;

    invoke-static {p2, v0}, Lgt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    sget-object v0, Ldn/j0$c;->a:Ldn/j0$c;

    invoke-static {p1, v0}, Lgt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    filled-new-array {p2, p1}, [Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Len/g;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Ldn/z;Landroid/graphics/Rect;Lmt/b;)Ljava/lang/Object;
    .locals 9
    .param p1    # Ldn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/z;",
            "Landroid/graphics/Rect;",
            "Lmt/b<",
            "-",
            "Lgt/n<",
            "+",
            "Len/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Len/g$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Len/g$a;

    iget v1, v0, Len/g$a;->B:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Len/g$a;->B:I

    goto :goto_0

    :cond_0
    new-instance v0, Len/g$a;

    invoke-direct {v0, p0, p3}, Len/g$a;-><init>(Len/g;Lmt/b;)V

    :goto_0
    iget-object p3, v0, Len/g$a;->z:Ljava/lang/Object;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Len/g$a;->B:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Len/g$a;->y:Ljava/lang/Object;

    check-cast p1, Ldn/j0$c;

    iget-object p2, v0, Len/g$a;->x:Ljava/lang/Object;

    check-cast p2, Len/e;

    iget-object p2, v0, Len/g$a;->w:Ljava/lang/Object;

    check-cast p2, Ljava/util/Iterator;

    iget-object v2, v0, Len/g$a;->v:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/c0;

    iget-object v4, v0, Len/g$a;->u:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Rect;

    iget-object v5, v0, Len/g$a;->t:Ljava/lang/Object;

    check-cast v5, Ldn/z;

    invoke-static {p3}, Lgt/o;->b(Ljava/lang/Object;)V

    check-cast p3, Lgt/n;

    invoke-virtual {p3}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object p3

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lgt/o;->b(Ljava/lang/Object;)V

    new-instance p3, Lkotlin/jvm/internal/c0;

    invoke-direct {p3}, Lkotlin/jvm/internal/c0;-><init>()V

    iget-object v2, p0, Len/g;->c:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v8, p3

    move-object p3, p2

    move-object p2, v2

    move-object v2, v8

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Len/e;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldn/j0$c;

    iput-object p1, v0, Len/g$a;->t:Ljava/lang/Object;

    iput-object p3, v0, Len/g$a;->u:Ljava/lang/Object;

    iput-object v2, v0, Len/g$a;->v:Ljava/lang/Object;

    iput-object p2, v0, Len/g$a;->w:Ljava/lang/Object;

    invoke-static {v5}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Len/g$a;->x:Ljava/lang/Object;

    iput-object v4, v0, Len/g$a;->y:Ljava/lang/Object;

    iput v3, v0, Len/g$a;->B:I

    invoke-interface {v5, p1, p3, v0}, Len/e;->a(Ldn/z;Landroid/graphics/Rect;Lmt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_3

    return-object v1

    :cond_3
    move-object v8, v5

    move-object v5, p1

    move-object p1, v4

    move-object v4, p3

    move-object p3, v8

    :goto_2
    invoke-static {p3}, Lgt/n;->h(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v6, p3

    check-cast v6, Len/a;

    sget-object v7, Len/a$b;->a:Len/a$b;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    new-instance p2, Len/a$c;

    invoke-direct {p2, p1, v6}, Len/a$c;-><init>(Ldn/j0$c;Len/a;)V

    invoke-static {p2}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p3}, Lgt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p3, v2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    if-nez p3, :cond_5

    iput-object p1, v2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    :cond_5
    move-object p3, v4

    move-object p1, v5

    goto :goto_1

    :cond_6
    iget-object p1, v2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    if-eqz p1, :cond_7

    sget-object p2, Lgt/n;->b:Lgt/n$a;

    invoke-static {p1}, Lgt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    sget-object p1, Lgt/n;->b:Lgt/n$a;

    sget-object p1, Len/a$b;->a:Len/a$b;

    invoke-static {p1}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
