.class public final Lug/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001d\u0010!\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u001b\u0010%\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001e\u001a\u0004\u0008#\u0010$R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lug/m;",
        "",
        "<init>",
        "()V",
        "",
        "evt",
        "ctx",
        "",
        "Lcom/roblox/client/datastructures/NameValuePair;",
        "params",
        "",
        "waitForFullBatch",
        "",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V",
        "i",
        "(Z)V",
        "Lju/l0;",
        "b",
        "Lju/l0;",
        "eventUploadDispatcher",
        "Lju/p0;",
        "Lju/p0;",
        "eventUploadScope",
        "Lug/p$c;",
        "d",
        "Lug/p$c;",
        "eventUploader",
        "Lkh/a;",
        "e",
        "Lgt/h;",
        "f",
        "()Lkh/a;",
        "analyticEventDao",
        "Lug/p;",
        "g",
        "()Lug/p;",
        "eventUploadWorker",
        "Lug/p$b;",
        "h",
        "()Lug/p$b;",
        "eventUploaderConfig",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lug/m;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lju/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lju/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lug/p$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lgt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Lgt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lug/m;

    invoke-direct {v0}, Lug/m;-><init>()V

    sput-object v0, Lug/m;->a:Lug/m;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "newSingleThreadExecutor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lju/v1;->c(Ljava/util/concurrent/ExecutorService;)Lju/t1;

    move-result-object v0

    sput-object v0, Lug/m;->b:Lju/l0;

    invoke-static {v0}, Lju/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lju/p0;

    move-result-object v0

    sput-object v0, Lug/m;->c:Lju/p0;

    new-instance v0, Lug/m$a;

    invoke-direct {v0}, Lug/m$a;-><init>()V

    sput-object v0, Lug/m;->d:Lug/p$c;

    new-instance v0, Lug/k;

    invoke-direct {v0}, Lug/k;-><init>()V

    invoke-static {v0}, Lgt/i;->b(Lkotlin/jvm/functions/Function0;)Lgt/h;

    move-result-object v0

    sput-object v0, Lug/m;->e:Lgt/h;

    new-instance v0, Lug/l;

    invoke-direct {v0}, Lug/l;-><init>()V

    invoke-static {v0}, Lgt/i;->b(Lkotlin/jvm/functions/Function0;)Lgt/h;

    move-result-object v0

    sput-object v0, Lug/m;->f:Lgt/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lug/p;
    .locals 1

    invoke-static {}, Lug/m;->e()Lug/p;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Lkh/a;
    .locals 1

    invoke-static {}, Lug/m;->d()Lkh/a;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "evt"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lug/m;->a:Lug/m;

    invoke-virtual {v0}, Lug/m;->g()Lug/p;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Lug/p;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    return-void
.end method

.method public static final d()Lkh/a;
    .locals 3

    sget-object v0, Ljh/c;->a:Ljh/c;

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getAppContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljh/c;->b(Landroid/content/Context;)Lcom/roblox/client/db/RobloxDatabase;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/client/db/RobloxDatabase;->X()Lkh/a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static final e()Lug/p;
    .locals 5

    new-instance v0, Lug/p;

    sget-object v1, Lug/m;->c:Lju/p0;

    sget-object v2, Lug/m;->a:Lug/m;

    invoke-virtual {v2}, Lug/m;->f()Lkh/a;

    move-result-object v3

    sget-object v4, Lug/m;->d:Lug/p$c;

    invoke-virtual {v2}, Lug/m;->h()Lug/p$b;

    move-result-object v2

    invoke-direct {v0, v1, v3, v4, v2}, Lug/p;-><init>(Lju/p0;Lkh/a;Lug/p$c;Lug/p$b;)V

    return-object v0
.end method

.method public static final i(Z)V
    .locals 1

    sget-object v0, Lug/m;->a:Lug/m;

    invoke-virtual {v0}, Lug/m;->g()Lug/p;

    move-result-object v0

    invoke-virtual {v0, p0}, Lug/p;->q(Z)V

    return-void
.end method


# virtual methods
.method public final f()Lkh/a;
    .locals 1

    sget-object v0, Lug/m;->e:Lgt/h;

    invoke-interface {v0}, Lgt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkh/a;

    return-object v0
.end method

.method public final g()Lug/p;
    .locals 1

    sget-object v0, Lug/m;->f:Lgt/h;

    invoke-interface {v0}, Lgt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug/p;

    return-object v0
.end method

.method public final h()Lug/p$b;
    .locals 12

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->v()I

    move-result v3

    invoke-static {}, Lrg/a1;->D0()Ljava/lang/String;

    move-result-object v2

    const-string v0, "rbxAnalyticsBatchUrl(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lrg/a1;->S()Ljava/lang/String;

    move-result-object v4

    const-string v0, "getJsonContentType(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lrg/a1;->t:Ljava/lang/String;

    const-string v0, "mDeviceId"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->G4()Z

    move-result v10

    invoke-static {}, Lek/c;->d()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->k5()Z

    move-result v8

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->X()Z

    move-result v9

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->D2()Z

    move-result v11

    new-instance v1, Lug/p$b;

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v11}, Lug/p$b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    return-object v1
.end method
