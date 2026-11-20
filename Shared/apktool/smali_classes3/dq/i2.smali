.class public final synthetic Ldq/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ldq/k2;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;


# direct methods
.method public synthetic constructor <init>(Ldq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq/i2;->a:Ldq/k2;

    iput-object p2, p0, Ldq/i2;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iput-object p3, p0, Ldq/i2;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ldq/i2;->a:Ldq/k2;

    iget-object v1, p0, Ldq/i2;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iget-object v2, p0, Ldq/i2;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;

    invoke-static {v0, v1, v2}, Ldq/k2;->v0(Ldq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
