.class public final synthetic Lgo/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/c$b;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

.field public final synthetic c:Lwm/k$a;


# direct methods
.method public synthetic constructor <init>(Lno/c$b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lwm/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo/p0;->a:Lno/c$b;

    iput-object p2, p0, Lgo/p0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iput-object p3, p0, Lgo/p0;->c:Lwm/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lgo/p0;->a:Lno/c$b;

    iget-object v1, p0, Lgo/p0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iget-object v2, p0, Lgo/p0;->c:Lwm/k$a;

    check-cast p1, Lwm/r$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->z(Lno/c$b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lwm/k$a;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
