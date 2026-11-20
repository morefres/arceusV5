.class public final synthetic Lfq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfq/j;

.field public final synthetic b:Lwm/k$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lfq/j;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/e;->a:Lfq/j;

    iput-object p2, p0, Lfq/e;->b:Lwm/k$a;

    iput-object p3, p0, Lfq/e;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfq/e;->a:Lfq/j;

    iget-object v1, p0, Lfq/e;->b:Lwm/k$a;

    iget-object v2, p0, Lfq/e;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-static {v0, v1, v2}, Lfq/j;->b(Lfq/j;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
