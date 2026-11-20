.class public final synthetic Lxp/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

.field public final synthetic b:Lxp/k0;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lxp/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp/a0;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    iput-object p2, p0, Lxp/a0;->b:Lxp/k0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lxp/a0;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    iget-object v1, p0, Lxp/a0;->b:Lxp/k0;

    invoke-static {v0, v1}, Lxp/k0;->i(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lxp/k0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
