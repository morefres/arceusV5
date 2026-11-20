.class public final Lxp/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxp/p0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lym/a0<",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B/\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001c\u0010#\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00020 8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lxp/p0;",
        "Lym/a0;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;",
        "Lcom/withpersona/sdk2/camera/b;",
        "cameraPreview",
        "Lat/a;",
        "Ldn/n0;",
        "selfieDirectionFeed",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "Leo/e;",
        "featureFlagManager",
        "<init>",
        "(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;)V",
        "initialRendering",
        "Lym/y;",
        "initialViewEnvironment",
        "Landroid/content/Context;",
        "contextForNewView",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;",
        "b",
        "Lcom/withpersona/sdk2/camera/b;",
        "c",
        "Lat/a;",
        "d",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "e",
        "Leo/e;",
        "Lgu/c;",
        "getType",
        "()Lgu/c;",
        "type",
        "selfie_release"
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
.field public final synthetic a:Lym/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/f<",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/camera/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lat/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lat/a<",
            "Ldn/n0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Leo/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;)V
    .locals 3
    .param p1    # Lcom/withpersona/sdk2/camera/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lat/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Leo/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/camera/b;",
            "Lat/a<",
            "Ldn/n0;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            "Leo/e;",
            ")V"
        }
    .end annotation

    const-string v0, "cameraPreview"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selfieDirectionFeed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lym/f;

    const-class v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lgu/c;

    move-result-object v1

    new-instance v2, Lxp/n0;

    invoke-direct {v2, p1, p2, p3, p4}, Lxp/n0;-><init>(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;)V

    invoke-direct {v0, v1, v2}, Lym/f;-><init>(Lgu/c;Lyt/o;)V

    iput-object v0, p0, Lxp/p0;->a:Lym/f;

    iput-object p1, p0, Lxp/p0;->b:Lcom/withpersona/sdk2/camera/b;

    iput-object p2, p0, Lxp/p0;->c:Lat/a;

    iput-object p3, p0, Lxp/p0;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iput-object p4, p0, Lxp/p0;->e:Leo/e;

    return-void
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    invoke-static/range {p0 .. p7}, Lxp/p0;->d(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Landroid/view/ViewGroup;)Lxp/r0;
    .locals 0

    invoke-static {p0, p1}, Lxp/p0;->e(Landroid/content/Context;Landroid/view/ViewGroup;)Lxp/r0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    const-string v0, "initialRendering"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialViewEnvironment"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lun/a;->a:Lun/a;

    new-instance v1, Lxp/o0;

    invoke-direct {v1}, Lxp/o0;-><init>()V

    const-class v2, Lxp/r0$a;

    invoke-virtual {v0, v2, v1}, Lun/a;->c(Ljava/lang/Class;Lun/c;)Lun/a$a;

    move-result-object v0

    invoke-virtual {p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;->h()Lwp/a;

    move-result-object v1

    sget-object v2, Lxp/p0$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    sget-object v1, Lun/d;->e:Lun/d;

    goto :goto_0

    :cond_0
    new-instance p0, Lgt/l;

    invoke-direct {p0}, Lgt/l;-><init>()V

    throw p0

    :cond_1
    sget-object v1, Lun/d;->a:Lun/d;

    :goto_0
    invoke-virtual {v0, v1}, Lun/a$a;->a(Lun/d;)Lun/c;

    move-result-object v0

    check-cast v0, Lxp/r0$a;

    invoke-interface {v0, p6, p7}, Lxp/r0$a;->a(Landroid/content/Context;Landroid/view/ViewGroup;)Lxp/r0;

    move-result-object v3

    sget p7, Lwp/o;->a:I

    invoke-static {p6, p7}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result p7

    invoke-static {p5, p6, p7}, Ltq/c;->b(Lym/y;Landroid/content/Context;I)V

    invoke-interface {v3}, Lxp/r0;->getRoot()Landroid/view/View;

    move-result-object p7

    new-instance v0, Lxp/p0$a;

    new-instance v1, Lxp/k0;

    invoke-interface {p1}, Lat/a;->get()Ljava/lang/Object;

    move-result-object p1

    const-string v2, "get(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p1

    check-cast v5, Ldn/n0;

    sget-object p1, Leo/a0;->a:Leo/a0;

    invoke-virtual {p3, p1}, Leo/e;->a(Leo/d;)Z

    move-result v7

    move-object v4, p0

    move-object v6, p2

    move-object v2, p6

    invoke-direct/range {v1 .. v7}, Lxp/k0;-><init>(Landroid/content/Context;Lxp/r0;Lcom/withpersona/sdk2/camera/b;Ldn/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Z)V

    invoke-direct {v0, v1}, Lxp/p0$a;-><init>(Ljava/lang/Object;)V

    invoke-static {p7, p4, p5, v0}, Lym/e0;->a(Landroid/view/View;Ljava/lang/Object;Lym/y;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3}, Lxp/r0;->getRoot()Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Invalid design version."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(Landroid/content/Context;Landroid/view/ViewGroup;)Lxp/r0;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxp/q;

    invoke-direct {v0, p0, p1}, Lxp/q;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lxp/p0;->f(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public f(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lym/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "initialRendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialViewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextForNewView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxp/p0;->a:Lym/f;

    invoke-virtual {v0, p1, p2, p3, p4}, Lym/f;->a(Ljava/lang/Object;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getType()Lgu/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgu/c<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxp/p0;->a:Lym/f;

    invoke-virtual {v0}, Lym/f;->getType()Lgu/c;

    move-result-object v0

    return-object v0
.end method
