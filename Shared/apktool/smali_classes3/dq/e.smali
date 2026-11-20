.class public final synthetic Ldq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ldq/k2;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;


# direct methods
.method public synthetic constructor <init>(Ldq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq/e;->a:Ldq/k2;

    iput-object p2, p0, Ldq/e;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ldq/e;->a:Ldq/k2;

    iget-object v1, p0, Ldq/e;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/e$c;

    invoke-static {v0, v1, p1}, Ldq/k2;->q0(Ldq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
