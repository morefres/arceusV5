.class public final Lio/u$g;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/u;->t(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lym/y;)V
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
    c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$6"
    f = "CameraScreenRunner.kt"
    l = {
        0xf9,
        0x101
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public A:I

.field public final synthetic B:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

.field public final synthetic C:Lio/u;

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lio/u;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
            "Lio/u;",
            "Lmt/b<",
            "-",
            "Lio/u$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/u$g;->B:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iput-object p2, p0, Lio/u$g;->C:Lio/u;

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

    new-instance p1, Lio/u$g;

    iget-object v0, p0, Lio/u$g;->B:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iget-object v1, p0, Lio/u$g;->C:Lio/u;

    invoke-direct {p1, v0, v1, p2}, Lio/u$g;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lio/u;Lmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lio/u$g;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/u$g;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lio/u$g;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/u$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lio/u$g;->A:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lio/u$g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lio/u$g;->u:I

    iget v6, p0, Lio/u$g;->t:I

    iget-object v7, p0, Lio/u$g;->z:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    iget-object v8, p0, Lio/u$g;->y:Ljava/lang/Object;

    check-cast v8, Ljava/util/ArrayList;

    iget-object v9, p0, Lio/u$g;->x:Ljava/lang/Object;

    check-cast v9, Lio/u;

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lgt/n;

    invoke-virtual {p1}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/u$g;->B:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->I()I

    move-result p1

    iget-object v1, p0, Lio/u$g;->C:Lio/u;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, p1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v9, v1

    move v1, v2

    :goto_0
    if-ge v1, p1, :cond_5

    invoke-static {v9}, Lio/u;->h(Lio/u;)Ldn/g;

    move-result-object v7

    iput-object v9, p0, Lio/u$g;->x:Ljava/lang/Object;

    iput-object v6, p0, Lio/u$g;->y:Ljava/lang/Object;

    iput-object v6, p0, Lio/u$g;->z:Ljava/lang/Object;

    iput p1, p0, Lio/u$g;->t:I

    iput v1, p0, Lio/u$g;->u:I

    iput v1, p0, Lio/u$g;->v:I

    iput v2, p0, Lio/u$g;->w:I

    iput v5, p0, Lio/u$g;->A:I

    invoke-interface {v7, p0}, Ldn/g;->d(Lmt/b;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v8, v6

    move v6, p1

    move-object p1, v7

    move-object v7, v8

    :goto_1
    invoke-static {p1}, Lgt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v10

    if-nez v10, :cond_4

    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    move-object p1, v4

    :goto_2
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v5

    move p1, v6

    move-object v6, v8

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lio/u$g;->C:Lio/u;

    invoke-static {p1}, Lio/u;->m(Lio/u;)Lio/w;

    move-result-object p1

    invoke-interface {p1}, Lio/w;->e()V

    iget-object p1, p0, Lio/u$g;->C:Lio/u;

    invoke-static {p1}, Lio/u;->m(Lio/u;)Lio/w;

    move-result-object p1

    iput-object v6, p0, Lio/u$g;->x:Ljava/lang/Object;

    iput-object v4, p0, Lio/u$g;->y:Ljava/lang/Object;

    iput-object v4, p0, Lio/u$g;->z:Ljava/lang/Object;

    iput v3, p0, Lio/u$g;->A:I

    invoke-interface {p1, p0}, Lio/w;->f(Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    move-object v0, v6

    :goto_4
    iget-object p1, p0, Lio/u$g;->B:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->d()Lkotlin/jvm/functions/Function2;

    move-result-object p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->a0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lio/u$g;->C:Lio/u;

    invoke-static {v1}, Lio/u;->h(Lio/u;)Ldn/g;

    move-result-object v1

    invoke-interface {v1}, Ldn/g;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
