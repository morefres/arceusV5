.class public final Lz4/r$a;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz4/r;->a(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
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
        "-TT;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\n"
    }
    d2 = {
        "T",
        "Lju/p0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1"
    f = "RunBlockingUninterruptible.android.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lju/p0;",
            "Lmt/b<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lju/p0;",
            "-",
            "Lmt/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lmt/b<",
            "-",
            "Lz4/r$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz4/r$a;->v:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lot/m;-><init>(ILmt/b;)V

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

    new-instance v0, Lz4/r$a;

    iget-object v1, p0, Lz4/r$a;->v:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, p2}, Lz4/r$a;-><init>(Lkotlin/jvm/functions/Function2;Lmt/b;)V

    iput-object p1, v0, Lz4/r$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lz4/r$a;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lz4/r$a;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lz4/r$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lz4/r$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    iget v0, p0, Lz4/r$a;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lz4/r$a;->u:Ljava/lang/Object;

    check-cast p1, Lju/p0;

    invoke-interface {p1}, Lju/p0;->I()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    sget-object v0, Lkotlin/coroutines/d;->Lo:Lkotlin/coroutines/d$b;

    invoke-interface {p1, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/coroutines/d;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Lju/z;->c(Lju/d2;ILjava/lang/Object;)Lju/x;

    move-result-object v0

    sget-object v2, Lju/w1;->a:Lju/w1;

    sget-object v3, Lju/r0;->d:Lju/r0;

    new-instance v4, Lz4/r$a$a;

    iget-object v5, p0, Lz4/r$a;->v:Lkotlin/jvm/functions/Function2;

    invoke-direct {v4, v0, v5, v1}, Lz4/r$a$a;-><init>(Lju/x;Lkotlin/jvm/functions/Function2;Lmt/b;)V

    invoke-static {v2, p1, v3, v4}, Lju/i;->c(Lju/p0;Lkotlin/coroutines/CoroutineContext;Lju/r0;Lkotlin/jvm/functions/Function2;)Lju/d2;

    :catch_0
    invoke-interface {v0}, Lju/d2;->d()Z

    move-result v2

    if-nez v2, :cond_0

    :try_start_0
    new-instance v2, Lz4/r$a$b;

    invoke-direct {v2, v0, v1}, Lz4/r$a$b;-><init>(Lju/x;Lmt/b;)V

    invoke-static {p1, v2}, Lju/i;->e(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    invoke-interface {v0}, Lju/w0;->g()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
