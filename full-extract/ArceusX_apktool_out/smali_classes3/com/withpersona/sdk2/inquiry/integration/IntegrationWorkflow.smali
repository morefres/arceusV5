.class public final Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;
.super Lwm/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;,
        Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;,
        Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;,
        Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;,
        Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwm/k<",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0005678.0B)\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017JC\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00032\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ7\u0010!\u001a\u00020 *\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008!\u0010\"JC\u0010$\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020#2\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008$\u0010%JU\u0010,\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020)\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 0*0(0\'*\u00020&2\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105\u00a8\u00069"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;",
        "Lwm/k;",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lsq/a;",
        "navigationStateManager",
        "Lcom/withpersona/sdk2/inquiry/integration/a$a;",
        "integrationBrowserWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "<init>",
        "(Landroid/content/Context;Lsq/a;Lcom/withpersona/sdk2/inquiry/integration/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V",
        "props",
        "Lwm/i;",
        "snapshot",
        "u",
        "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lwm/i;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;",
        "state",
        "C",
        "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;)Lwm/i;",
        "renderProps",
        "renderState",
        "Lwm/k$a;",
        "context",
        "z",
        "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;Lwm/k$a;)Ljava/lang/Object;",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;",
        "event",
        "",
        "v",
        "(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;)V",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;",
        "r",
        "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lwm/k$a;)V",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;",
        "",
        "Lkotlin/Pair;",
        "",
        "Lkotlin/Function1;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
        "p",
        "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lwm/k$a;)Ljava/util/List;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lsq/a;",
        "c",
        "Lcom/withpersona/sdk2/inquiry/integration/a$a;",
        "d",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "Input",
        "State",
        "PendingAction",
        "integration_release"
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

.field public final b:Lsq/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/withpersona/sdk2/inquiry/integration/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lsq/a;Lcom/withpersona/sdk2/inquiry/integration/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lsq/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/integration/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationStateManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationBrowserWorkerFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwm/k;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->b:Lsq/a;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->c:Lcom/withpersona/sdk2/inquiry/integration/a$a;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method

.method public static final A(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$a;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$a;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->v(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final B(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->v(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic h(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->q(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->B(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->y(Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->w(Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lvo/a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lcom/withpersona/sdk2/inquiry/integration/a$b;)Lwm/r;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->s(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lvo/a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lcom/withpersona/sdk2/inquiry/integration/a$b;)Lwm/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->A(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->t(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lwm/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->x(Lwm/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$c;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$c;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->v(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final s(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lvo/a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lcom/withpersona/sdk2/inquiry/integration/a$b;)Lwm/r;
    .locals 7

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p4, p4, Lcom/withpersona/sdk2/inquiry/integration/a$b$a;

    if-eqz p4, :cond_0

    iget-object p4, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lvo/a;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;Ljava/lang/String;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    const/4 p2, 0x2

    const/4 v1, 0x0

    invoke-static {p4, v0, p1, p2, v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logIntegrationEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;ZILjava/lang/Object;)V

    new-instance p1, Lvo/q;

    invoke-direct {p1, p3}, Lvo/q;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;)V

    const/4 p2, 0x1

    invoke-static {p0, v1, p1, p2, v1}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lgt/l;

    invoke-direct {p0}, Lgt/l;-><init>()V

    throw p0
.end method

.method public static final t(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lwm/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->u(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    move-result-object p0

    invoke-virtual {p1, p0}, Lwm/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$d;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$d;

    invoke-virtual {p1, p0}, Lwm/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final w(Lwm/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$a;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$a;

    invoke-virtual {p0, v0}, Lwm/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final x(Lwm/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$b;

    invoke-virtual {p0, v0}, Lwm/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final y(Lwm/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwm/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow.State.Starting"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->u(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    move-result-object v0

    invoke-virtual {p0, v0}, Lwm/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public C(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;)Lwm/i;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;
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

.method public bridge synthetic d(Ljava/lang/Object;Lwm/i;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->u(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lwm/i;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;Lwm/k$a;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->z(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;Lwm/k$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Lwm/i;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->C(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;)Lwm/i;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lwm/k$a;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;",
            "Lwm/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Lkotlin/Unit;",
            ">;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;-><init>()V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lvo/p;

    invoke-direct {v1, p0, p2}, Lvo/p;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;)V

    invoke-virtual {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->b()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final r(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lwm/k$a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;",
            "Lwm/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)V"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->v()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;

    if-eqz v1, :cond_0

    sget-object v0, Lvo/e;->a:Lvo/e;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lvo/e;->c(Landroid/content/Context;)Lvo/a;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->ShowingIntegration:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lvo/a;->b()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;Ljava/lang/String;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v3, v4}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logIntegrationEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;ZILjava/lang/Object;)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->c:Lcom/withpersona/sdk2/inquiry/integration/a$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->i()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;

    move-result-object v4

    invoke-interface {v1, v2, v3, v0, v4}, Lcom/withpersona/sdk2/inquiry/integration/a$a;->a(Ljava/lang/String;Ljava/lang/String;Lvo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Lcom/withpersona/sdk2/inquiry/integration/a;

    move-result-object v1

    new-instance v2, Lvo/l;

    invoke-direct {v2, p0, p1, v0, p2}, Lvo/l;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lvo/a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;)V

    const-class p1, Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-static {p1}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lgu/m;

    move-result-object p1

    const-string p2, ""

    invoke-static {p3, v1, p1, p2, v2}, Lwm/w;->l(Lwm/a;Lwm/o;Lgu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance p1, Lgt/l;

    invoke-direct {p1}, Lgt/l;-><init>()V

    throw p1
.end method

.method public u(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lwm/i;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;
    .locals 2
    .param p1    # Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;
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
    check-cast v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    new-instance p1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    sget-object p2, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)V

    return-object p1
.end method

.method public final v(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;",
            ")V"
        }
    .end annotation

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lwm/k$a;->d()Lwm/h;

    move-result-object p1

    new-instance p2, Lvo/m;

    invoke-direct {p2}, Lvo/m;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p2

    invoke-interface {p1, p2}, Lwm/h;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$b;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lwm/k$a;->d()Lwm/h;

    move-result-object p1

    new-instance p2, Lvo/n;

    invoke-direct {p2}, Lvo/n;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p2

    invoke-interface {p1, p2}, Lwm/h;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    instance-of p2, p2, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$c;

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lwm/k$a;->d()Lwm/h;

    move-result-object p1

    new-instance p2, Lvo/o;

    invoke-direct {p2}, Lvo/o;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lwm/w;->g(Lwm/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lwm/r;

    move-result-object p2

    invoke-interface {p1, p2}, Lwm/h;->a(Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Lgt/l;

    invoke-direct {p1}, Lgt/l;-><init>()V

    throw p1
.end method

.method public z(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;Lwm/k$a;)Ljava/lang/Object;
    .locals 20
    .param p1    # Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;
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
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;",
            "Lwm/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "renderProps"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "renderState"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "context"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    if-eqz v4, :cond_3

    check-cast v2, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    invoke-virtual {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->r(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lwm/k$a;)V

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->b:Lsq/a;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->a()Z

    move-result v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->f()Z

    move-result v6

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->v()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;

    move-result-object v7

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-nez v7, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->m()Z

    move-result v7

    if-nez v7, :cond_0

    move v7, v12

    goto :goto_0

    :cond_0
    move v7, v11

    :goto_0
    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lsq/a;->d(Lsq/a;ZZZZILjava/lang/Object;)V

    new-instance v13, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->k()Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v4}, Lyq/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v14

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->b:Lsq/a;

    invoke-virtual {v4}, Lsq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v15

    new-instance v4, Lvo/j;

    invoke-direct {v4, v0, v3}, Lvo/j;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;)V

    new-instance v5, Lvo/k;

    invoke-direct {v5, v0, v3}, Lvo/k;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lwm/k$a;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->k()Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;

    move-result-object v6

    invoke-virtual {v0, v6, v3}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->p(Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lwm/k$a;)Ljava/util/List;

    move-result-object v18

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->v()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;->m()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    move/from16 v19, v11

    :goto_1
    move-object/from16 v16, v4

    move-object/from16 v17, v5

    goto :goto_3

    :cond_2
    :goto_2
    move/from16 v19, v12

    goto :goto_1

    :goto_3
    invoke-direct/range {v13 .. v19}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Z)V

    invoke-static {v13}, Lcom/withpersona/sdk2/inquiry/permissions/g;->c(Ljava/lang/Object;)Lmp/c;

    return-object v13

    :cond_3
    new-instance v1, Lgt/l;

    invoke-direct {v1}, Lgt/l;-><init>()V

    throw v1
.end method
