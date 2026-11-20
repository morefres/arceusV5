.class public final Lcom/withpersona/sdk2/inquiry/document/i$d;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/i;->run()Lmu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lmu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/document/i$c;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lmu/i;",
        "Lcom/withpersona/sdk2/inquiry/document/i$c;",
        "",
        "<anonymous>",
        "(Lmu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1"
    f = "DocumentsSelectWorker.kt"
    l = {
        0x2d,
        0x31,
        0x35,
        0x39
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/document/i;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/i;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/i;",
            "Lmt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/i$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->w:Lcom/withpersona/sdk2/inquiry/document/i;

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/i$d;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->w:Lcom/withpersona/sdk2/inquiry/document/i;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/document/i$d;-><init>(Lcom/withpersona/sdk2/inquiry/document/i;Lmt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/document/i$d;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmu/i;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/i$d;->o(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->v:Ljava/lang/Object;

    check-cast v0, Lmu/i;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->u:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->t:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/i$d$c;

    invoke-direct {p1, v3}, Lcom/withpersona/sdk2/inquiry/document/i$d$c;-><init>(Lmt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->v:Ljava/lang/Object;

    iput v7, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->u:I

    const-wide/16 v7, 0x64

    invoke-static {v7, v8, p1, p0}, Lju/g3;->e(JLkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_0
    move-object v2, p1

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_7

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->w:Lcom/withpersona/sdk2/inquiry/document/i;

    invoke-static {v0}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->v:Ljava/lang/Object;

    invoke-static {v2}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->t:Ljava/lang/Object;

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->u:I

    invoke-static {p1, v0, v2, p0}, Lcom/withpersona/sdk2/inquiry/document/i;->e(Lcom/withpersona/sdk2/inquiry/document/i;Lmu/i;Ljava/util/List;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_7
    invoke-static {}, Lju/g1;->c()Lju/n2;

    move-result-object p1

    new-instance v6, Lcom/withpersona/sdk2/inquiry/document/i$d$a;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->w:Lcom/withpersona/sdk2/inquiry/document/i;

    invoke-direct {v6, v7, v3}, Lcom/withpersona/sdk2/inquiry/document/i$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/document/i;Lmt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->v:Ljava/lang/Object;

    invoke-static {v2}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->t:Ljava/lang/Object;

    iput v5, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->u:I

    invoke-static {p1, v6, p0}, Lju/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    new-instance p1, Lkp/v;

    invoke-direct {p1}, Lkp/v;-><init>()V

    new-instance v3, Lcom/withpersona/sdk2/inquiry/document/i$d$b;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->w:Lcom/withpersona/sdk2/inquiry/document/i;

    invoke-direct {v3, v5, v0}, Lcom/withpersona/sdk2/inquiry/document/i$d$b;-><init>(Lcom/withpersona/sdk2/inquiry/document/i;Lmu/i;)V

    invoke-static {v0}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->v:Ljava/lang/Object;

    invoke-static {v2}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->t:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/i$d;->u:I

    invoke-virtual {p1, v3, p0}, Lkp/v;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    :goto_4
    new-instance p1, Lgt/d;

    invoke-direct {p1}, Lgt/d;-><init>()V

    throw p1
.end method

.method public final o(Lmu/i;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/i$c;",
            ">;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/i$d;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/i$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/i$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
