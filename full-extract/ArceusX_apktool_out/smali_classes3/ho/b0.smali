.class public final Lho/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lho/b0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lym/k<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lho/b0;",
        "Lym/k;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;",
        "Lho/c0;",
        "viewController",
        "<init>",
        "(Lho/c0;)V",
        "rendering",
        "Lym/y;",
        "viewEnvironment",
        "",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Lym/y;)V",
        "b",
        "Lho/c0;",
        "c",
        "government-id_release"
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
.field public static final c:Lho/b0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lho/c0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lho/b0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lho/b0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lho/b0;->c:Lho/b0$a;

    return-void
.end method

.method public constructor <init>(Lho/c0;)V
    .locals 1
    .param p1    # Lho/c0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lho/b0;->b:Lho/c0;

    invoke-interface {p1}, Lho/c0;->a()V

    return-void
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Lym/y;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lym/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lho/b0;->b:Lho/c0;

    invoke-interface {v0, p2, p1}, Lho/c0;->b(Lym/y;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lym/y;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;

    invoke-virtual {p0, p1, p2}, Lho/b0;->a(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Lym/y;)V

    return-void
.end method
