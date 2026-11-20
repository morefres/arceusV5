.class public final Lxq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/o;
.implements Ltr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxq/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwm/o<",
        "Lxq/c$b;",
        ">;",
        "Ltr/h<",
        "Lxq/c$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u001b\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\u000c\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lxq/a;",
        "Lwm/o;",
        "Lxq/c$b;",
        "Ltr/h;",
        "Lxq/c;",
        "snaClient",
        "",
        "timeoutSeconds",
        "<init>",
        "(Lxq/c;I)V",
        "otherWorker",
        "",
        "c",
        "(Lwm/o;)Z",
        "Lmu/h;",
        "run",
        "()Lmu/h;",
        "b",
        "Lxq/c;",
        "I",
        "a",
        "sna_release"
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
.field public final b:Lxq/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:I


# direct methods
.method public constructor <init>(Lxq/c;I)V
    .locals 0
    .param p1    # Lxq/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxq/a;->b:Lxq/c;

    iput p2, p0, Lxq/a;->c:I

    return-void
.end method

.method public static final synthetic d(Lxq/a;)Lxq/c;
    .locals 0

    iget-object p0, p0, Lxq/a;->b:Lxq/c;

    return-object p0
.end method

.method public static final synthetic e(Lxq/a;)I
    .locals 0

    iget p0, p0, Lxq/a;->c:I

    return p0
.end method


# virtual methods
.method public a(Ltr/h;)Z
    .locals 0
    .param p1    # Ltr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr/h<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Ltr/h;->a(Ltr/h;)Z

    move-result p1

    return p1
.end method

.method public b(Ltr/h;)Z
    .locals 0
    .param p1    # Ltr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr/h<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Ltr/h;->b(Ltr/h;)Z

    move-result p1

    return p1
.end method

.method public c(Lwm/o;)Z
    .locals 1
    .param p1    # Lwm/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lxq/a;

    return p1
.end method

.method public run()Lmu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmu/h<",
            "Lxq/c$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lxq/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lxq/a$b;-><init>(Lxq/a;Lmt/b;)V

    invoke-static {v0}, Lmu/j;->w(Lkotlin/jvm/functions/Function2;)Lmu/h;

    move-result-object v0

    invoke-static {}, Lju/g1;->a()Lju/l0;

    move-result-object v1

    invoke-static {v0, v1}, Lmu/j;->y(Lmu/h;Lkotlin/coroutines/CoroutineContext;)Lmu/h;

    move-result-object v0

    return-object v0
.end method
