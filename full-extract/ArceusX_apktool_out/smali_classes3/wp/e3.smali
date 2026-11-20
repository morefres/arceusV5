.class public final synthetic Lwp/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic b:Lwm/k$a;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lwm/k$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/e3;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p2, p0, Lwp/e3;->b:Lwm/k$a;

    iput-boolean p3, p0, Lwp/e3;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lwp/e3;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v1, p0, Lwp/e3;->b:Lwm/k$a;

    iget-boolean v2, p0, Lwp/e3;->c:Z

    check-cast p1, Laq/b$d;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lwm/k$a;ZLaq/b$d;)Lwm/r;

    move-result-object p1

    return-object p1
.end method
