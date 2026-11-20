.class public final Lcp/a$c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lmu/h<",
        "Lcp/a$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1",
        "Lmu/h;",
        "Lmu/i;",
        "collector",
        "",
        "collect",
        "(Lmu/i;Lmt/b;)Ljava/lang/Object;",
        "kotlinx-coroutines-core"
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
.field public final synthetic a:Lmu/h;


# direct methods
.method public constructor <init>(Lmu/h;)V
    .locals 0

    iput-object p1, p0, Lcp/a$c$d;->a:Lmu/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Lmu/i;Lmt/b;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcp/a$c$d;->a:Lmu/h;

    new-instance v1, Lcp/a$c$d$a;

    invoke-direct {v1, p1}, Lcp/a$c$d$a;-><init>(Lmu/i;)V

    invoke-interface {v0, v1, p2}, Lmu/h;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
