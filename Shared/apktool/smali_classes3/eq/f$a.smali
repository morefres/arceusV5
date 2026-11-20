.class public final Leq/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leq/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leq/f$a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lym/a0<",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J2\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Leq/f$a;",
        "Lym/a0;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;",
        "<init>",
        "()V",
        "initialRendering",
        "Lym/y;",
        "initialViewEnvironment",
        "Landroid/content/Context;",
        "contextForNewView",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;",
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
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lym/f;

    const-class v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lgu/c;

    move-result-object v1

    new-instance v2, Leq/d;

    invoke-direct {v2}, Leq/d;-><init>()V

    invoke-direct {v0, v1, v2}, Lym/f;-><init>(Lgu/c;Lyt/o;)V

    iput-object v0, p0, Leq/f$a;->a:Lym/f;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Leq/f$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Landroid/content/Context;Landroid/view/ViewGroup;)Leq/g;
    .locals 0

    invoke-static {p0, p1}, Leq/f$a;->e(Landroid/content/Context;Landroid/view/ViewGroup;)Leq/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Leq/f$a;->d(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    const-string v0, "initialRendering"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialViewEnvironment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lun/a;->a:Lun/a;

    new-instance v1, Leq/e;

    invoke-direct {v1}, Leq/e;-><init>()V

    const-class v2, Leq/g$a;

    invoke-virtual {v0, v2, v1}, Lun/a;->c(Ljava/lang/Class;Lun/c;)Lun/a$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;->d()Lwp/a;

    move-result-object v1

    sget-object v2, Leq/f$a$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    sget-object v1, Lun/d;->f:Lun/d;

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

    check-cast v0, Leq/g$a;

    invoke-interface {v0, p2, p3}, Leq/g$a;->a(Landroid/content/Context;Landroid/view/ViewGroup;)Leq/g;

    move-result-object p2

    invoke-interface {p2}, Leq/g;->getRoot()Landroid/view/View;

    move-result-object p3

    new-instance v0, Leq/f$a$a;

    new-instance v1, Leq/f;

    invoke-direct {v1, p2}, Leq/f;-><init>(Leq/g;)V

    invoke-direct {v0, v1}, Leq/f$a$a;-><init>(Ljava/lang/Object;)V

    invoke-static {p3, p0, p1, v0}, Lym/e0;->a(Landroid/view/View;Ljava/lang/Object;Lym/y;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p2}, Leq/g;->getRoot()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroid/content/Context;Landroid/view/ViewGroup;)Leq/g;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leq/c;

    invoke-direct {v0, p0, p1}, Leq/c;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;

    invoke-virtual {p0, p1, p2, p3, p4}, Leq/f$a;->f(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public f(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;
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

    iget-object v0, p0, Leq/f$a;->a:Lym/f;

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
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Leq/f$a;->a:Lym/f;

    invoke-virtual {v0}, Lym/f;->getType()Lgu/c;

    move-result-object v0

    return-object v0
.end method
