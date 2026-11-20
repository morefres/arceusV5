.class public final synthetic Lfp/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfp/e0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;


# direct methods
.method public synthetic constructor <init>(Lfp/e0;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/y;->a:Lfp/e0;

    iput-object p2, p0, Lfp/y;->b:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfp/y;->a:Lfp/e0;

    iget-object v1, p0, Lfp/y;->b:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;

    invoke-static {v0, v1, p1}, Lfp/e0;->p(Lfp/e0;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
