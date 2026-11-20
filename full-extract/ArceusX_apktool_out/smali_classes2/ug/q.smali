.class public final Lug/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lug/q;",
        "",
        "<init>",
        "()V",
        "",
        "notificationId",
        "",
        "a",
        "(Ljava/lang/String;)V",
        "Lkh/i;",
        "b",
        "()Lkh/i;",
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
.field public static final a:Lug/q;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lug/q;

    invoke-direct {v0}, Lug/q;-><init>()V

    sput-object v0, Lug/q;->a:Lug/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/String;)V
    .locals 8
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "notificationId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lug/q;->a:Lug/q;

    invoke-virtual {v0}, Lug/q;->b()Lkh/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lju/g1;->b()Lju/l0;

    move-result-object v1

    invoke-static {v1}, Lju/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lju/p0;

    move-result-object v2

    new-instance v5, Lug/q$a;

    const/4 v1, 0x0

    invoke-direct {v5, v0, p0, v1}, Lug/q$a;-><init>(Lkh/i;Ljava/lang/String;Lmt/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lju/i;->d(Lju/p0;Lkotlin/coroutines/CoroutineContext;Lju/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lju/d2;

    :cond_0
    return-void
.end method


# virtual methods
.method public final b()Lkh/i;
    .locals 3

    sget-object v0, Ljh/c;->a:Ljh/c;

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getAppContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljh/c;->b(Landroid/content/Context;)Lcom/roblox/client/db/RobloxDatabase;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/client/db/RobloxDatabase;->Y()Lkh/i;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
