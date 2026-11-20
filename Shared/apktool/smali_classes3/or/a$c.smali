.class public final Lor/a$c;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lor/a;->run()Lmu/h;
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
        "Lor/a$b;",
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
        "Lor/a$b;",
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
    c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker$run$1"
    f = "UiAddressDetailsWorker.kt"
    l = {
        0x14,
        0x1c,
        0x1e,
        0x29
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lor/a;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lor/a;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lor/a;",
            "Lmt/b<",
            "-",
            "Lor/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lor/a$c;->A:Lor/a;

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

    new-instance v0, Lor/a$c;

    iget-object v1, p0, Lor/a$c;->A:Lor/a;

    invoke-direct {v0, v1, p2}, Lor/a$c;-><init>(Lor/a;Lmt/b;)V

    iput-object p1, v0, Lor/a$c;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmu/i;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lor/a$c;->o(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lor/a$c;->z:Ljava/lang/Object;

    check-cast v1, Lmu/i;

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v0, Lor/a$c;->y:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lor/a$c;->u:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v1, v0, Lor/a$c;->t:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static/range {p1 .. p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v3, v0, Lor/a$c;->v:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;

    iget-object v3, v0, Lor/a$c;->u:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;

    iget-object v3, v0, Lor/a$c;->t:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static/range {p1 .. p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Lgt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lgt/o;->b(Ljava/lang/Object;)V

    new-instance v3, Lor/a$c$a;

    iget-object v10, v0, Lor/a$c;->A:Lor/a;

    invoke-direct {v3, v10, v8}, Lor/a$c$a;-><init>(Lor/a;Lmt/b;)V

    iput-object v1, v0, Lor/a$c;->z:Ljava/lang/Object;

    iput v7, v0, Lor/a$c;->y:I

    invoke-static {v3, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueRetriableRequestWithRetry(Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto/16 :goto_3

    :cond_4
    :goto_0
    check-cast v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    instance-of v7, v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v7, :cond_7

    move-object v7, v3

    check-cast v7, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;->a()Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;

    move-result-object v10

    goto :goto_1

    :cond_5
    move-object v10, v8

    :goto_1
    if-eqz v10, :cond_6

    new-instance v5, Lor/a$b$b;

    invoke-direct {v5, v10}, Lor/a$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;)V

    iput-object v1, v0, Lor/a$c;->z:Ljava/lang/Object;

    iput-object v3, v0, Lor/a$c;->t:Ljava/lang/Object;

    invoke-static {v7}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lor/a$c;->u:Ljava/lang/Object;

    invoke-static {v10}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lor/a$c;->v:Ljava/lang/Object;

    iput v9, v0, Lor/a$c;->w:I

    iput v9, v0, Lor/a$c;->x:I

    iput v6, v0, Lor/a$c;->y:I

    invoke-interface {v1, v5, v0}, Lmu/i;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_7

    goto :goto_3

    :cond_6
    new-instance v6, Lor/a$b$a;

    new-instance v11, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    const/16 v16, 0x8

    const/16 v17, 0x0

    const/4 v12, 0x0

    const-string v13, "Expected body attributes to be non-null."

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;-><init>(ILjava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v6, v11}, Lor/a$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    iput-object v1, v0, Lor/a$c;->z:Ljava/lang/Object;

    iput-object v3, v0, Lor/a$c;->t:Ljava/lang/Object;

    invoke-static {v7}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lor/a$c;->u:Ljava/lang/Object;

    invoke-static {v10}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lor/a$c;->v:Ljava/lang/Object;

    iput v9, v0, Lor/a$c;->w:I

    iput v9, v0, Lor/a$c;->x:I

    iput v5, v0, Lor/a$c;->y:I

    invoke-interface {v1, v6, v0}, Lmu/i;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    instance-of v5, v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz v5, :cond_8

    move-object v5, v3

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v5

    new-instance v6, Lor/a$b$a;

    invoke-direct {v6, v5}, Lor/a$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v1}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lor/a$c;->z:Ljava/lang/Object;

    iput-object v3, v0, Lor/a$c;->t:Ljava/lang/Object;

    invoke-static {v5}, Lot/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lor/a$c;->u:Ljava/lang/Object;

    iput-object v8, v0, Lor/a$c;->v:Ljava/lang/Object;

    iput v9, v0, Lor/a$c;->w:I

    iput v9, v0, Lor/a$c;->x:I

    iput v4, v0, Lor/a$c;->y:I

    invoke-interface {v1, v6, v0}, Lmu/i;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_8

    :goto_3
    return-object v2

    :cond_8
    :goto_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method

.method public final o(Lmu/i;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/i<",
            "-",
            "Lor/a$b;",
            ">;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lor/a$c;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lor/a$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lor/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
