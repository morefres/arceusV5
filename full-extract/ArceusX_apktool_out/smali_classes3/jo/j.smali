.class public final synthetic Ljo/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljo/t0;

.field public final synthetic b:Lwm/k$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic d:Lso/l;


# direct methods
.method public synthetic constructor <init>(Ljo/t0;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lso/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/j;->a:Ljo/t0;

    iput-object p2, p0, Ljo/j;->b:Lwm/k$a;

    iput-object p3, p0, Ljo/j;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p4, p0, Ljo/j;->d:Lso/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ljo/j;->a:Ljo/t0;

    iget-object v1, p0, Ljo/j;->b:Lwm/k$a;

    iget-object v2, p0, Ljo/j;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v3, p0, Ljo/j;->d:Lso/l;

    invoke-static {v0, v1, v2, v3}, Ljo/t0;->a(Ljo/t0;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lso/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
