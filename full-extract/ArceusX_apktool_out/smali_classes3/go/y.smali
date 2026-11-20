.class public final synthetic Lgo/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lwm/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo/y;->a:Lwm/k$a;

    iput-object p2, p0, Lgo/y;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lgo/y;->a:Lwm/k$a;

    iget-object v1, p0, Lgo/y;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->k(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
