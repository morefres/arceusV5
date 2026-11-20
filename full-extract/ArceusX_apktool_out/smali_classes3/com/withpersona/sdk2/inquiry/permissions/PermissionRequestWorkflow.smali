.class public final Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;
.super Lwm/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;,
        Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;,
        Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;,
        Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwm/k<",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003/01B)\u0008\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J1\u0010\u0017\u001a\u00020\u0010*\u00180\u0013R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00022\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJG\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00032$\u0010!\u001a 0 R\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u00a8\u00062"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;",
        "Lwm/k;",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcom/withpersona/sdk2/inquiry/permissions/d$a;",
        "permissionRequestDialogWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;",
        "deviceFeatureRequestWorkflow",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "<init>",
        "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V",
        "",
        "I",
        "()V",
        "Lwm/r$c;",
        "Lwm/r;",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;",
        "output",
        "G",
        "(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V",
        "props",
        "Lwm/i;",
        "snapshot",
        "H",
        "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/i;)Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;",
        "renderProps",
        "renderState",
        "Lwm/k$a;",
        "context",
        "J",
        "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;Lwm/k$a;)Ljava/lang/Object;",
        "state",
        "h0",
        "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;)Lwm/i;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lcom/withpersona/sdk2/inquiry/permissions/d$a;",
        "c",
        "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;",
        "d",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "Props",
        "Output",
        "PermissionRequestState",
        "permissions_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/permissions/d$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/permissions/d$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionRequestDialogWorkerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceFeatureRequestWorkflow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwm/k;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->b:Lcom/withpersona/sdk2/inquiry/permissions/d$a;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->c:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method

.method public static synthetic A(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->d0(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->e0(Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->O(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/k$a;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->X(ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/k$a;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->G(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    return-void
.end method

.method public static final synthetic F(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final K(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Z)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lwm/k$a;->d()Lwm/h;

    move-result-object p0

    new-instance v0, Lpp/e1;

    invoke-direct {v0, p2}, Lpp/e1;-><init>(Z)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lwm/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final L(ZLwm/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    sget-object p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;

    invoke-virtual {p1, p0}, Lwm/r$c;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;

    invoke-virtual {p1, p0}, Lwm/r$c;->e(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final M(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/d$b;)Lwm/r;
    .locals 3

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/d$b$b;->a:Lcom/withpersona/sdk2/inquiry/permissions/d$b$b;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p2, Lpp/p0;

    invoke-direct {p2, p1, p0}, Lpp/p0;-><init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)V

    invoke-static {p0, v2, p2, v1, v2}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/d$b$a;->a:Lcom/withpersona/sdk2/inquiry/permissions/d$b$a;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Lpp/q0;

    invoke-direct {p3, p1, p0, p2}, Lpp/q0;-><init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-static {p0, v2, p3, v1, v2}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lgt/l;

    invoke-direct {p0}, Lgt/l;-><init>()V

    throw p0
.end method

.method public static final N(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lwm/r$c;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->j()Z

    move-result p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lwm/k$a;->d()Lwm/h;

    move-result-object p0

    new-instance p3, Lpp/s0;

    invoke-direct {p3, p1, p2}, Lpp/s0;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-static {p1, v1, p3, v0, v1}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lwm/h;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lwm/k$a;->d()Lwm/h;

    move-result-object p0

    new-instance p2, Lpp/t0;

    invoke-direct {p2}, Lpp/t0;-><init>()V

    invoke-static {p1, v1, p2, v0, v1}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lwm/h;->a(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final O(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p1

    sget-object v1, Lpp/j1;->b:Lpp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lpp/i0;Lpp/j1;)V

    invoke-virtual {p0, p2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->G(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final P(Lwm/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;

    invoke-virtual {p0, v0}, Lwm/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Q(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwm/k$a;->d()Lwm/h;

    move-result-object p0

    new-instance p2, Lpp/r0;

    invoke-direct {p2}, Lpp/r0;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0, v1}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lwm/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final R(Lwm/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;

    invoke-virtual {p0, v0}, Lwm/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final S(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;)Lwm/r;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpp/o0;

    invoke-direct {v0, p3, p1, p0, p2}, Lpp/o0;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p0

    return-object p0
.end method

.method public static final T(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$action"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;->a()Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;

    move-result-object p0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;->a()Lpp/v;

    move-result-object p0

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x2

    if-eq p0, v2, :cond_1

    const/4 p4, 0x3

    if-ne p0, p4, :cond_0

    invoke-virtual {p1}, Lwm/k$a;->d()Lwm/h;

    move-result-object p0

    new-instance p1, Lpp/x0;

    invoke-direct {p1, p2, p3}, Lpp/x0;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-static {p2, v0, p1, v1, v0}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lwm/h;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lgt/l;

    invoke-direct {p0}, Lgt/l;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p1

    sget-object p3, Lpp/j1;->b:Lpp/j1;

    invoke-direct {p0, p1, p3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lpp/i0;Lpp/j1;)V

    invoke-virtual {p2, p4, p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->G(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lwm/k$a;->d()Lwm/h;

    move-result-object p0

    new-instance p1, Lpp/w0;

    invoke-direct {p1, p2, p3}, Lpp/w0;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-static {p2, v0, p1, v1, v0}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lwm/h;->a(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final U(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p1

    sget-object v1, Lpp/j1;->a:Lpp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lpp/i0;Lpp/j1;)V

    invoke-virtual {p0, p2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->G(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final V(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p1

    sget-object v1, Lpp/j1;->c:Lpp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lpp/i0;Lpp/j1;)V

    invoke-virtual {p0, p2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->G(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final W(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Z)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lwm/k$a;->d()Lwm/h;

    move-result-object v0

    new-instance v1, Lpp/m0;

    invoke-direct {v1, p3, p1, p2, p0}, Lpp/m0;-><init>(ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/k$a;)V

    const/4 p0, 0x1

    const/4 p2, 0x0

    invoke-static {p1, p2, v1, p0, p2}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p0

    invoke-interface {v0, p0}, Lwm/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final X(ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/k$a;Lwm/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    new-instance p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p2

    sget-object p3, Lpp/j1;->b:Lpp/j1;

    invoke-direct {p0, p2, p3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lpp/i0;Lpp/j1;)V

    invoke-virtual {p1, p4, p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->G(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lwm/k$a;->d()Lwm/h;

    move-result-object p0

    new-instance p2, Lpp/v0;

    invoke-direct {p2}, Lpp/v0;-><init>()V

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-static {p1, p4, p2, p3, p4}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lwm/h;->a(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Y(Lwm/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;

    invoke-virtual {p0, v0}, Lwm/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Z(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->I()V

    invoke-virtual {p1}, Lwm/k$a;->d()Lwm/h;

    move-result-object p1

    new-instance v0, Lpp/n0;

    invoke-direct {v0, p0, p2}, Lpp/n0;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p2, v1}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p0

    invoke-interface {p1, p0}, Lwm/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a0(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p1

    sget-object v1, Lpp/j1;->c:Lpp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lpp/i0;Lpp/j1;)V

    invoke-virtual {p0, p2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->G(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b0(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lwm/k$a;->d()Lwm/h;

    move-result-object p0

    new-instance v0, Lpp/f1;

    invoke-direct {v0, p1, p2}, Lpp/f1;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lwm/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final c0(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p1

    sget-object v1, Lpp/j1;->b:Lpp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lpp/i0;Lpp/j1;)V

    invoke-virtual {p0, p2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->G(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final d0(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lwm/k$a;->d()Lwm/h;

    move-result-object p0

    new-instance v0, Lpp/l0;

    invoke-direct {v0}, Lpp/l0;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lwm/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e0(Lwm/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;

    invoke-virtual {p0, v0}, Lwm/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final f0(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lwm/k$a;->d()Lwm/h;

    move-result-object p0

    new-instance v0, Lpp/k0;

    invoke-direct {v0, p1, p2}, Lpp/k0;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lwm/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final g0(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p1

    sget-object v1, Lpp/j1;->b:Lpp/j1;

    invoke-direct {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;-><init>(Lpp/i0;Lpp/j1;)V

    invoke-virtual {p0, p2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->G(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic h(Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->Y(Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->V(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->b0(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->W(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;)Lwm/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->S(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;)Lwm/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->N(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->a0(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->c0(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->R(Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->Q(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->g0(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->Z(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->T(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/d$b;)Lwm/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->M(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/d$b;)Lwm/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->P(Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(ZLwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->L(ZLwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->U(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->K(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->f0(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final G(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/r<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
            ">.c;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->a()Lpp/i0;

    move-result-object v2

    invoke-static {v2}, Lpp/n1;->c(Lpp/i0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->f()Lpp/j1;

    move-result-object v3

    invoke-static {v3}, Lpp/n1;->b(Lpp/j1;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logPermissionEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;ZILjava/lang/Object;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    invoke-direct {v0, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    invoke-virtual {p1, v0}, Lwm/r$c;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public H(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/i;)Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;
    .locals 2
    .param p1    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lwm/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "props"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lwm/i;->b()Lwu/h;

    move-result-object p1

    invoke-virtual {p1}, Lwu/h;->I()I

    move-result p2

    const/4 v0, 0x0

    if-lez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    const-string v0, "obtain()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwu/h;->O()[B

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    const-class p1, Lwm/i;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string p1, "parcel.readParcelable<T>\u2026class.java.classLoader)!!"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    :goto_1
    check-cast v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    sget-object p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;

    return-object p1
.end method

.method public final I()V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "package"

    invoke-static {v3, v1, v2}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public J(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;Lwm/k$a;)Ljava/lang/Object;
    .locals 12
    .param p1    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lwm/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;",
            "Lwm/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "renderProps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;

    invoke-direct {p2, p0, p1, p3, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/k$a;Lmt/b;)V

    const-string p1, "check_permission_state"

    invoke-virtual {p3, p1, p2}, Lwm/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    return-object v1

    :cond_0
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    new-instance p2, Luq/m;

    new-instance v0, Lpp/h0;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p1

    new-instance v1, Lpp/j0;

    invoke-direct {v1, p3, p0}, Lpp/j0;-><init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)V

    invoke-direct {v0, p1, v2, v1}, Lpp/h0;-><init>(Lpp/i0;ZLkotlin/jvm/functions/Function1;)V

    sget-object p1, Luq/l;->c:Luq/l;

    invoke-direct {p2, v0, p1}, Luq/m;-><init>(Ljava/lang/Object;Luq/l;)V

    return-object p2

    :cond_1
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "getString(...)"

    if-eqz v0, :cond_4

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object v0

    invoke-static {v0}, Lpp/n1;->c(Lpp/i0;)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v6, "permission_sheet_presented"

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x2

    invoke-static {p2, v4, v2, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logPermissionEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;ZILjava/lang/Object;)V

    new-instance p2, Luq/m;

    new-instance v4, Lpp/g0;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->n()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->m()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->a:Landroid/content/Context;

    sget v1, Ltp/g;->D:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    move-object v7, v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;

    move-result-object v8

    new-instance v9, Lpp/u0;

    invoke-direct {v9, p3, p0}, Lpp/u0;-><init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->i()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->a:Landroid/content/Context;

    sget v1, Ltp/g;->C:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    move-object v10, v0

    new-instance v11, Lpp/y0;

    invoke-direct {v11, p3, p0, p1}, Lpp/y0;-><init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-direct/range {v4 .. v11}, Lpp/g0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    sget-object p1, Luq/l;->c:Luq/l;

    invoke-direct {p2, v4, p1}, Luq/m;-><init>(Ljava/lang/Object;Luq/l;)V

    return-object p2

    :cond_4
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->b:Lcom/withpersona/sdk2/inquiry/permissions/d$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/d$a;->a(Lpp/i0;)Lcom/withpersona/sdk2/inquiry/permissions/d;

    move-result-object p2

    new-instance v0, Lpp/z0;

    invoke-direct {v0, p0, p3, p1}, Lpp/z0;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    const-class p1, Lcom/withpersona/sdk2/inquiry/permissions/d;

    invoke-static {p1}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lgu/m;

    move-result-object p1

    const-string v2, ""

    invoke-static {p3, p2, p1, v2, v0}, Lwm/w;->l(Lwm/a;Lwm/o;Lgu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-object v1

    :cond_5
    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->q()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->c:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object p2

    invoke-static {p2}, Lpp/n1;->a(Lpp/i0;)Lpp/u;

    move-result-object v5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->m()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;

    move-result-object v10

    invoke-direct/range {v4 .. v10}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;-><init>(Lpp/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V

    new-instance v6, Lpp/a1;

    invoke-direct {v6, p0, p3, p1}, Lpp/a1;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p3

    invoke-static/range {v2 .. v8}, Lwm/a$a;->a(Lwm/a;Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    move-object v2, p3

    new-instance p2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;

    invoke-direct {p2, v2, p0, p1, v1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$c;-><init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lmt/b;)V

    const-string p1, "request_device_feature"

    invoke-virtual {v2, p1, p2}, Lwm/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    return-object v1

    :cond_7
    move-object v2, p3

    sget-object p3, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    new-instance p2, Luq/m;

    new-instance p3, Lpp/h0;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->k()Lpp/i0;

    move-result-object v0

    new-instance v1, Lpp/b1;

    invoke-direct {v1, v2, p0, p1}, Lpp/b1;-><init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    const/4 p1, 0x1

    invoke-direct {p3, v0, p1, v1}, Lpp/h0;-><init>(Lpp/i0;ZLkotlin/jvm/functions/Function1;)V

    sget-object p1, Luq/l;->c:Luq/l;

    invoke-direct {p2, p3, p1}, Luq/m;-><init>(Ljava/lang/Object;Luq/l;)V

    return-object p2

    :cond_8
    sget-object p3, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_b

    new-instance p2, Luq/m;

    new-instance v4, Lpp/g0;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->o()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->m()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_9

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->a:Landroid/content/Context;

    sget v0, Ltp/g;->E:I

    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    move-object v7, p3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;

    move-result-object v8

    new-instance v9, Lpp/c1;

    invoke-direct {v9, p0, v2, p1}, Lpp/c1;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;->i()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_a

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->a:Landroid/content/Context;

    sget v0, Ltp/g;->C:I

    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_a
    move-object v10, p3

    new-instance v11, Lpp/d1;

    invoke-direct {v11, v2, p0, p1}, Lpp/d1;-><init>(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V

    invoke-direct/range {v4 .. v11}, Lpp/g0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    sget-object p1, Luq/l;->c:Luq/l;

    invoke-direct {p2, v4, p1}, Luq/m;-><init>(Ljava/lang/Object;Luq/l;)V

    return-object p2

    :cond_b
    sget-object p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    return-object v1

    :cond_c
    new-instance p1, Lgt/l;

    invoke-direct {p1}, Lgt/l;-><init>()V

    throw p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Lwm/i;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->H(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lwm/i;)Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;Lwm/k$a;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->J(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;Lwm/k$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Lwm/i;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->h0(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;)Lwm/i;

    move-result-object p1

    return-object p1
.end method

.method public h0(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;)Lwm/i;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lym/q;->a(Landroid/os/Parcelable;)Lwm/i;

    move-result-object p1

    return-object p1
.end method
