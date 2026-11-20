.class public final Ldh/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Ldh/i;",
        "",
        "Lgl/c;",
        "designFoundations",
        "Ljava/lang/Runnable;",
        "onTokensChanged",
        "<init>",
        "(Lgl/c;Ljava/lang/Runnable;)V",
        "",
        "b",
        "()V",
        "c",
        "a",
        "Lgl/c;",
        "Ljava/lang/Runnable;",
        "Lju/p0;",
        "Lju/p0;",
        "scope",
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


# instance fields
.field public final a:Lgl/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Lju/p0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgl/c;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Lgl/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "designFoundations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTokensChanged"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldh/i;->a:Lgl/c;

    iput-object p2, p0, Ldh/i;->b:Ljava/lang/Runnable;

    return-void
.end method

.method public static final synthetic a(Ldh/i;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Ldh/i;->b:Ljava/lang/Runnable;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 3

    invoke-static {}, Lju/q0;->b()Lju/p0;

    move-result-object v0

    iput-object v0, p0, Ldh/i;->c:Lju/p0;

    iget-object v0, p0, Ldh/i;->a:Lgl/c;

    invoke-interface {v0}, Lgl/c;->a()Lmu/h;

    move-result-object v0

    new-instance v1, Ldh/i$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Ldh/i$a;-><init>(Ldh/i;Lmt/b;)V

    invoke-static {v0, v1}, Lmu/j;->E(Lmu/h;Lkotlin/jvm/functions/Function2;)Lmu/h;

    move-result-object v0

    iget-object v1, p0, Ldh/i;->c:Lju/p0;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lmu/j;->z(Lmu/h;Lju/p0;)Lju/d2;

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Ldh/i;->c:Lju/p0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lju/q0;->f(Lju/p0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Ldh/i;->c:Lju/p0;

    return-void
.end method
