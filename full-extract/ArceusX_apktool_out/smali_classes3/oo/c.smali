.class public final synthetic Loo/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ltr/f;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

.field public final synthetic e:Lso/l;


# direct methods
.method public synthetic constructor <init>(Ltr/f;Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lso/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loo/c;->a:Ltr/f;

    iput-object p2, p0, Loo/c;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Loo/c;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p4, p0, Loo/c;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    iput-object p5, p0, Loo/c;->e:Lso/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Loo/c;->a:Ltr/f;

    iget-object v1, p0, Loo/c;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Loo/c;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v3, p0, Loo/c;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    iget-object v4, p0, Loo/c;->e:Lso/l;

    move-object v5, p1

    check-cast v5, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;

    invoke-static/range {v0 .. v5}, Loo/e;->c(Ltr/f;Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lso/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
