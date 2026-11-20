.class public final Lor/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/o;
.implements Ltr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lor/a$a;,
        Lor/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwm/o<",
        "Lor/a$b;",
        ">;",
        "Ltr/h<",
        "Lor/a$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0012\u0016B!\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0013R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lor/a;",
        "Lwm/o;",
        "Lor/a$b;",
        "Ltr/h;",
        "",
        "sessionToken",
        "addressId",
        "Lor/c;",
        "uiService",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lor/c;)V",
        "Lmu/h;",
        "run",
        "()Lmu/h;",
        "otherWorker",
        "",
        "c",
        "(Lwm/o;)Z",
        "b",
        "Ljava/lang/String;",
        "d",
        "Lor/c;",
        "a",
        "ui_release"
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
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lor/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lor/c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lor/a;->b:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lor/a;->c:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lor/a;->d:Lor/c;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lor/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lor/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lor/c;)V

    return-void
.end method

.method public static final synthetic d(Lor/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lor/a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic e(Lor/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lor/a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic f(Lor/a;)Lor/c;
    .locals 0

    iget-object p0, p0, Lor/a;->d:Lor/c;

    return-object p0
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

    instance-of v0, p1, Lor/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lor/a;->c:Ljava/lang/String;

    check-cast p1, Lor/a;

    iget-object p1, p1, Lor/a;->c:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public run()Lmu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmu/h<",
            "Lor/a$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lor/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lor/a$c;-><init>(Lor/a;Lmt/b;)V

    invoke-static {v0}, Lmu/j;->w(Lkotlin/jvm/functions/Function2;)Lmu/h;

    move-result-object v0

    return-object v0
.end method
