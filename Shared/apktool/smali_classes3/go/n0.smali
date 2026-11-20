.class public final synthetic Lgo/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

.field public final synthetic b:Lwm/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lwm/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo/n0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iput-object p2, p0, Lgo/n0;->b:Lwm/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lgo/n0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iget-object v1, p0, Lgo/n0;->b:Lwm/k$a;

    check-cast p1, Lwm/r$c;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->m(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lwm/k$a;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
