.class public final Lcom/withpersona/sdk2/inquiry/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltr/h<",
        "Lcom/withpersona/sdk2/inquiry/internal/network/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u001b\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\u000c\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/c;",
        "Ltr/h;",
        "Lcom/withpersona/sdk2/inquiry/internal/network/a;",
        "Lep/e;",
        "attributes",
        "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
        "inquiryApiHelper",
        "<init>",
        "(Lep/e;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V",
        "Lmu/h;",
        "run",
        "()Lmu/h;",
        "otherWorker",
        "",
        "a",
        "(Ltr/h;)Z",
        "b",
        "Lep/e;",
        "c",
        "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
        "inquiry-internal_release"
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
.field public final b:Lep/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/withpersona/sdk2/inquiry/internal/network/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lep/e;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V
    .locals 1
    .param p1    # Lep/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/internal/network/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "attributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inquiryApiHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/c;->b:Lep/e;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/c;->c:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    return-void
.end method

.method public static final synthetic c(Lcom/withpersona/sdk2/inquiry/internal/c;)Lep/e;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/c;->b:Lep/e;

    return-object p0
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/internal/c;)Lcom/withpersona/sdk2/inquiry/internal/network/e;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/c;->c:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    return-object p0
.end method


# virtual methods
.method public a(Ltr/h;)Z
    .locals 2
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

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/internal/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/c;->b:Lep/e;

    invoke-virtual {v0}, Lep/e;->i()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/c;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/c;->b:Lep/e;

    invoke-virtual {v1}, Lep/e;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/c;->b:Lep/e;

    invoke-virtual {v0}, Lep/e;->j()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/c;->b:Lep/e;

    invoke-virtual {v1}, Lep/e;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/c;->b:Lep/e;

    invoke-virtual {v0}, Lep/e;->b()Lxo/h;

    move-result-object v0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/c;->b:Lep/e;

    invoke-virtual {p1}, Lep/e;->b()Lxo/h;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

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

.method public run()Lmu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmu/h<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/internal/c$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/c;Lmt/b;)V

    invoke-static {v0}, Lmu/j;->w(Lkotlin/jvm/functions/Function2;)Lmu/h;

    move-result-object v0

    return-object v0
.end method
