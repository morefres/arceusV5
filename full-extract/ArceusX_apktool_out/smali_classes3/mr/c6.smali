.class public final synthetic Lmr/c6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lwm/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiState;


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr/c6;->a:Lwm/k$a;

    iput-object p2, p0, Lmr/c6;->b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-object p3, p0, Lmr/c6;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmr/c6;->a:Lwm/k$a;

    iget-object v1, p0, Lmr/c6;->b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v2, p0, Lmr/c6;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->P(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
