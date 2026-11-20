.class public final synthetic Lxn/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

.field public final synthetic b:Lwm/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lwm/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxn/q;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iput-object p2, p0, Lxn/q;->b:Lwm/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lxn/q;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iget-object v1, p0, Lxn/q;->b:Lwm/k$a;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->k0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lwm/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
