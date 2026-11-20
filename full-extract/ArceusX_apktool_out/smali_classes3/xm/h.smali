.class public final Lxm/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxm/f$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PropsT:",
        "Ljava/lang/Object;",
        "StateT:",
        "Ljava/lang/Object;",
        "OutputT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lxm/f$a<",
        "TPropsT;TStateT;TOutputT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u0002*\u0004\u0008\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004Bo\u0012\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012&\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019Jq\u0010#\u001a\u00028\u0005\"\u0004\u0008\u0003\u0010\u001a\"\u0004\u0008\u0004\u0010\u001b\"\u0004\u0008\u0005\u0010\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001d2\u0006\u0010\u001f\u001a\u00028\u00032\u0006\u0010!\u001a\u00020 2$\u0010\"\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000c0\u000bH\u0016\u00a2\u0006\u0004\u0008#\u0010$J)\u0010)\u001a\u00020\u0017\"\u0004\u0008\u0003\u0010%2\u0014\u0010(\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010\'0&\u00a2\u0006\u0004\u0008)\u0010*J\u0019\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008+\u0010,J\u008f\u0001\u0010/\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020.\"\u0004\u0008\u0003\u0010\u001a\"\u0004\u0008\u0004\u0010\u001b\"\u0004\u0008\u0005\u0010\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001d2\u0006\u0010-\u001a\u00028\u00032\u0006\u0010!\u001a\u00020 2$\u0010\"\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008/\u00100R$\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R4\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u00104R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u00108R0\u0010;\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030.098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010:\u00a8\u0006<"
    }
    d2 = {
        "Lxm/h;",
        "PropsT",
        "StateT",
        "OutputT",
        "Lxm/f$a;",
        "",
        "Lxm/k;",
        "Lwm/m;",
        "snapshotCache",
        "Lkotlin/coroutines/CoroutineContext;",
        "contextForChildren",
        "Lkotlin/Function1;",
        "Lwm/r;",
        "",
        "emitActionToParent",
        "Lwm/t$c;",
        "workflowSession",
        "Lwm/t;",
        "interceptor",
        "Lxm/d;",
        "idCounter",
        "<init>",
        "(Ljava/util/Map;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lwm/t$c;Lwm/t;Lxm/d;)V",
        "",
        "c",
        "()V",
        "ChildPropsT",
        "ChildOutputT",
        "ChildRenderingT",
        "Lwm/q;",
        "child",
        "props",
        "",
        "key",
        "handler",
        "a",
        "(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "T",
        "Lsu/d;",
        "Lwm/v;",
        "selector",
        "g",
        "(Lsu/d;)V",
        "f",
        "()Ljava/util/Map;",
        "initialProps",
        "Lxm/i;",
        "d",
        "(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lxm/i;",
        "Ljava/util/Map;",
        "b",
        "Lkotlin/coroutines/CoroutineContext;",
        "Lkotlin/jvm/functions/Function1;",
        "Lwm/t$c;",
        "e",
        "Lwm/t;",
        "Lxm/d;",
        "Lxm/a;",
        "Lxm/a;",
        "children",
        "wf1-workflow-runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lxm/k;",
            "Lwm/m;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final b:Lkotlin/coroutines/CoroutineContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lwm/r<",
            "-TPropsT;TStateT;+TOutputT;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lwm/t$c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final e:Lwm/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lxm/d;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g:Lxm/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxm/a<",
            "Lxm/i<",
            "*****>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lwm/t$c;Lwm/t;Lxm/d;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lwm/t$c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lwm/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lxm/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lxm/k;",
            "Lwm/m;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lwm/r<",
            "-TPropsT;TStateT;+TOutputT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lwm/t$c;",
            "Lwm/t;",
            "Lxm/d;",
            ")V"
        }
    .end annotation

    const-string v0, "contextForChildren"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitActionToParent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxm/h;->a:Ljava/util/Map;

    iput-object p2, p0, Lxm/h;->b:Lkotlin/coroutines/CoroutineContext;

    iput-object p3, p0, Lxm/h;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lxm/h;->d:Lwm/t$c;

    iput-object p5, p0, Lxm/h;->e:Lwm/t;

    iput-object p6, p0, Lxm/h;->f:Lxm/d;

    new-instance p1, Lxm/a;

    invoke-direct {p1}, Lxm/a;-><init>()V

    iput-object p1, p0, Lxm/h;->g:Lxm/a;

    return-void
.end method

.method public static final synthetic b(Lkotlin/jvm/internal/c0;Lxm/h;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lxm/h;->e(Lkotlin/jvm/internal/c0;Lxm/h;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/internal/c0;Lxm/h;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ChildOutputT:",
            "Ljava/lang/Object;",
            "PropsT:",
            "Ljava/lang/Object;",
            "StateT:",
            "Ljava/lang/Object;",
            "OutputT:",
            "Ljava/lang/Object;",
            "ChildPropsT:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/internal/c0<",
            "Lxm/i<",
            "TChildPropsT;TChildOutputT;TPropsT;TStateT;TOutputT;>;>;",
            "Lxm/h<",
            "TPropsT;TStateT;TOutputT;>;TChildOutputT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p0, p0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    if-nez p0, :cond_0

    const-string p0, "node"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    check-cast p0, Lxm/i;

    :goto_0
    invoke-virtual {p0, p2}, Lxm/i;->c(Ljava/lang/Object;)Lwm/r;

    move-result-object p0

    iget-object p1, p1, Lxm/h;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lwm/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ChildPropsT:",
            "Ljava/lang/Object;",
            "ChildOutputT:",
            "Ljava/lang/Object;",
            "ChildRenderingT:",
            "Ljava/lang/Object;",
            ">(",
            "Lwm/q<",
            "-TChildPropsT;+TChildOutputT;+TChildRenderingT;>;TChildPropsT;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-TChildOutputT;+",
            "Lwm/r<",
            "-TPropsT;TStateT;+TOutputT;>;>;)TChildRenderingT;"
        }
    .end annotation

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxm/h;->g:Lxm/a;

    invoke-static {v0}, Lxm/a;->b(Lxm/a;)Lxm/e;

    move-result-object v0

    invoke-virtual {v0}, Lxm/e;->b()Lxm/e$a;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    move-object v1, v0

    check-cast v1, Lxm/i;

    invoke-virtual {v1, p1, p3}, Lxm/i;->h(Lwm/q;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Expected keys to be unique for "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lwm/w;->j(Lwm/q;)Lwm/s;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ": key=\""

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    iget-object v0, p0, Lxm/h;->g:Lxm/a;

    invoke-static {v0}, Lxm/a;->a(Lxm/a;)Lxm/e;

    move-result-object v1

    invoke-virtual {v1}, Lxm/e;->b()Lxm/e$a;

    move-result-object v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_1
    if-eqz v2, :cond_5

    move-object v5, v2

    check-cast v5, Lxm/i;

    invoke-virtual {v5, p1, p3}, Lxm/i;->h(Lwm/q;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    if-nez v4, :cond_2

    invoke-interface {v2}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v5

    invoke-virtual {v1, v5}, Lxm/e;->e(Lxm/e$a;)V

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v5

    invoke-interface {v4, v5}, Lxm/e$a;->b(Lxm/e$a;)V

    :goto_2
    invoke-virtual {v1}, Lxm/e;->c()Lxm/e$a;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v1, v4}, Lxm/e;->f(Lxm/e$a;)V

    :cond_3
    invoke-interface {v2, v3}, Lxm/e$a;->b(Lxm/e$a;)V

    move-object v3, v2

    goto :goto_3

    :cond_4
    invoke-interface {v2}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v4

    move-object v6, v4

    move-object v4, v2

    move-object v2, v6

    goto :goto_1

    :cond_5
    :goto_3
    if-nez v3, :cond_6

    invoke-virtual {p0, p1, p2, p3, p4}, Lxm/h;->d(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lxm/i;

    move-result-object v3

    :cond_6
    invoke-static {v0}, Lxm/a;->b(Lxm/a;)Lxm/e;

    move-result-object p3

    invoke-virtual {p3, v3}, Lxm/e;->d(Lxm/e$a;)V

    check-cast v3, Lxm/i;

    invoke-virtual {v3, p4}, Lxm/i;->j(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1}, Lwm/q;->b()Lwm/k;

    move-result-object p1

    invoke-virtual {v3, p1, p2}, Lxm/i;->i(Lwm/k;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 5

    iget-object v0, p0, Lxm/h;->g:Lxm/a;

    invoke-static {v0}, Lxm/a;->a(Lxm/a;)Lxm/e;

    move-result-object v1

    invoke-virtual {v1}, Lxm/e;->b()Lxm/e$a;

    move-result-object v1

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v3, v1

    check-cast v3, Lxm/i;

    invoke-virtual {v3}, Lxm/i;->g()Lxm/j;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v2, v4, v2}, Lxm/j;->f(Lxm/j;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-interface {v1}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lxm/a;->a(Lxm/a;)Lxm/e;

    move-result-object v1

    invoke-static {v0}, Lxm/a;->b(Lxm/a;)Lxm/e;

    move-result-object v3

    invoke-static {v0, v3}, Lxm/a;->c(Lxm/a;Lxm/e;)V

    invoke-static {v0, v1}, Lxm/a;->d(Lxm/a;Lxm/e;)V

    invoke-static {v0}, Lxm/a;->b(Lxm/a;)Lxm/e;

    move-result-object v0

    invoke-virtual {v0}, Lxm/e;->a()V

    iput-object v2, p0, Lxm/h;->a:Ljava/util/Map;

    return-void
.end method

.method public final d(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lxm/i;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ChildPropsT:",
            "Ljava/lang/Object;",
            "ChildOutputT:",
            "Ljava/lang/Object;",
            "ChildRenderingT:",
            "Ljava/lang/Object;",
            ">(",
            "Lwm/q<",
            "-TChildPropsT;+TChildOutputT;+TChildRenderingT;>;TChildPropsT;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-TChildOutputT;+",
            "Lwm/r<",
            "-TPropsT;TStateT;+TOutputT;>;>;)",
            "Lxm/i<",
            "TChildPropsT;TChildOutputT;TPropsT;TStateT;TOutputT;>;"
        }
    .end annotation

    invoke-static {p1, p3}, Lxm/l;->a(Lwm/q;Ljava/lang/String;)Lxm/k;

    move-result-object v1

    new-instance p3, Lkotlin/jvm/internal/c0;

    invoke-direct {p3}, Lkotlin/jvm/internal/c0;-><init>()V

    iget-object v0, p0, Lxm/h;->a:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwm/m;

    goto :goto_0

    :goto_1
    new-instance v0, Lxm/j;

    invoke-interface {p1}, Lwm/q;->b()Lwm/k;

    move-result-object v2

    iget-object v5, p0, Lxm/h;->b:Lkotlin/coroutines/CoroutineContext;

    new-instance v6, Lxm/h$a;

    invoke-direct {v6, p3, p0}, Lxm/h$a;-><init>(Lkotlin/jvm/internal/c0;Lxm/h;)V

    iget-object v7, p0, Lxm/h;->d:Lwm/t$c;

    iget-object v8, p0, Lxm/h;->e:Lwm/t;

    iget-object v9, p0, Lxm/h;->f:Lxm/d;

    move-object v3, p2

    invoke-direct/range {v0 .. v9}, Lxm/j;-><init>(Lxm/k;Lwm/k;Ljava/lang/Object;Lwm/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lwm/t$c;Lwm/t;Lxm/d;)V

    new-instance p2, Lxm/i;

    invoke-direct {p2, p1, p4, v0}, Lxm/i;-><init>(Lwm/q;Lkotlin/jvm/functions/Function1;Lxm/j;)V

    iput-object p2, p3, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    return-object p2
.end method

.method public final f()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lxm/k;",
            "Lwm/m;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p0, Lxm/h;->g:Lxm/a;

    invoke-static {v1}, Lxm/a;->a(Lxm/a;)Lxm/e;

    move-result-object v1

    invoke-virtual {v1}, Lxm/e;->b()Lxm/e$a;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_0

    move-object v2, v1

    check-cast v2, Lxm/i;

    invoke-virtual {v2}, Lxm/i;->f()Lwm/q;

    move-result-object v3

    invoke-interface {v3}, Lwm/q;->b()Lwm/k;

    move-result-object v3

    invoke-virtual {v2}, Lxm/i;->d()Lxm/k;

    move-result-object v4

    invoke-virtual {v2}, Lxm/i;->g()Lxm/j;

    move-result-object v2

    invoke-virtual {v2, v3}, Lxm/j;->o(Lwm/k;)Lwm/m;

    move-result-object v2

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final g(Lsu/d;)V
    .locals 2
    .param p1    # Lsu/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lsu/d<",
            "-",
            "Lwm/v<",
            "+TT;>;>;)V"
        }
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxm/h;->g:Lxm/a;

    invoke-static {v0}, Lxm/a;->a(Lxm/a;)Lxm/e;

    move-result-object v0

    invoke-virtual {v0}, Lxm/e;->b()Lxm/e$a;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    move-object v1, v0

    check-cast v1, Lxm/i;

    invoke-virtual {v1}, Lxm/i;->g()Lxm/j;

    move-result-object v1

    invoke-virtual {v1, p1}, Lxm/j;->p(Lsu/d;)V

    invoke-interface {v0}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method
