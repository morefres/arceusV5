.class public final Lkk/c$i;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkk/c;->w(Lmt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lot/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lju/p0;",
        "Lmt/b<",
        "-",
        "Ljava/lang/Integer;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lju/p0;",
        "",
        "<anonymous>",
        "(Lju/p0;)I"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.roblox.engine.AndroidAssetsHelper$updateCaCert$2$1"
    f = "AndroidAssetsHelper.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lkk/c;


# direct methods
.method public constructor <init>(Lkk/c;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkk/c;",
            "Lmt/b<",
            "-",
            "Lkk/c$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkk/c$i;->u:Lkk/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lot/m;-><init>(ILmt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lmt/b;)Lmt/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lmt/b<",
            "*>;)",
            "Lmt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lkk/c$i;

    iget-object v0, p0, Lkk/c$i;->u:Lkk/c;

    invoke-direct {p1, v0, p2}, Lkk/c$i;-><init>(Lkk/c;Lmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lkk/c$i;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lju/p0;",
            "Lmt/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lkk/c$i;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lkk/c$i;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lkk/c$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    iget v0, p0, Lkk/c$i;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lkk/c$i;->u:Lkk/c;

    invoke-static {p1}, Lkk/c;->d(Lkk/c;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "getAssets(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lkk/c$i;->u:Lkk/c;

    invoke-static {v1}, Lkk/c;->d(Lkk/c;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v1

    const-string v2, "exe/ssl/cacert.pem"

    invoke-interface {v1, v2}, Ljava/nio/file/Path;->resolve(Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object v1

    const-string v2, "resolve(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "ssl/cacert.pem"

    invoke-static {p1, v0, v2, v1}, Lkk/c;->c(Lkk/c;Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/nio/file/Path;)Z

    move-result p1

    const-string v0, "rbx.xapkmanager"

    if-eqz p1, :cond_0

    const-string p1, "cacert.pem was updated from assets."

    invoke-static {v0, p1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const-string p1, "cacert.pem is already up to date; no copy needed."

    invoke-static {v0, p1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    :goto_0
    invoke-static {p1}, Lot/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
