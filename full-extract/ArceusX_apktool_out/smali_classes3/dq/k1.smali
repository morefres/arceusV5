.class public final synthetic Ldq/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ldq/k2;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;


# direct methods
.method public synthetic constructor <init>(Ldq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq/k1;->a:Ldq/k2;

    iput-object p2, p0, Ldq/k1;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ldq/k1;->a:Ldq/k2;

    iget-object v1, p0, Ldq/k1;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    invoke-static {v0, v1}, Ldq/k2;->h(Ldq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
