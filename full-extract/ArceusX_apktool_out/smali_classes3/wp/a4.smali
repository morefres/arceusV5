.class public final synthetic Lwp/a4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/e$c;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

.field public final synthetic d:Lwm/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lwm/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/a4;->a:Lcom/withpersona/sdk2/inquiry/selfie/e$c;

    iput-object p2, p0, Lwp/a4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p3, p0, Lwp/a4;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    iput-object p4, p0, Lwp/a4;->d:Lwm/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lwp/a4;->a:Lcom/withpersona/sdk2/inquiry/selfie/e$c;

    iget-object v1, p0, Lwp/a4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v2, p0, Lwp/a4;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    iget-object v3, p0, Lwp/a4;->d:Lwm/k$a;

    check-cast p1, Lwm/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->z0(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lwm/k$a;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
