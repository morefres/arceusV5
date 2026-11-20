.class public final Lfn/s$l;
.super Lot/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn/s;->o0(Lmt/b;)Ljava/lang/Object;
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
        "Lgt/n<",
        "+",
        "Ljava/io/File;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lju/p0;",
        "Lgt/n;",
        "Ljava/io/File;",
        "<anonymous>",
        "(Lju/p0;)Lgt/n;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2"
    f = "Camera2Manager.kt"
    l = {
        0x1d7
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lfn/s;


# direct methods
.method public constructor <init>(Lfn/s;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/s;",
            "Lmt/b<",
            "-",
            "Lfn/s$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfn/s$l;->u:Lfn/s;

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

    new-instance p1, Lfn/s$l;

    iget-object v0, p0, Lfn/s$l;->u:Lfn/s;

    invoke-direct {p1, v0, p2}, Lfn/s$l;-><init>(Lfn/s;Lmt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lju/p0;

    check-cast p2, Lmt/b;

    invoke-virtual {p0, p1, p2}, Lfn/s$l;->invoke(Lju/p0;Lmt/b;)Ljava/lang/Object;

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
            "Lgt/n<",
            "+",
            "Ljava/io/File;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lfn/s$l;->create(Ljava/lang/Object;Lmt/b;)Lmt/b;

    move-result-object p1

    check-cast p1, Lfn/s$l;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lfn/s$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lfn/s$l;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lfn/s$l;->u:Lfn/s;

    invoke-static {p1}, Lfn/s;->H(Lfn/s;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lfn/s$l;->u:Lfn/s;

    invoke-static {p1}, Lfn/s;->u(Lfn/s;)Lmu/c0;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Lmu/c0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lfn/s$l;->u:Lfn/s;

    invoke-static {p1, v2}, Lfn/s;->P(Lfn/s;Z)V

    iget-object p1, p0, Lfn/s$l;->u:Lfn/s;

    invoke-static {p1}, Lfn/s;->u(Lfn/s;)Lmu/c0;

    move-result-object p1

    invoke-static {p1}, Lmu/j;->s(Lmu/h;)Lmu/h;

    move-result-object p1

    iput v2, p0, Lfn/s$l;->t:I

    invoke-static {p1, p0}, Lmu/j;->u(Lmu/h;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lgt/n;

    invoke-virtual {p1}, Lgt/n;->j()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lfn/s$l;->u:Lfn/s;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lfn/s;->P(Lfn/s;Z)V

    invoke-static {p1}, Lgt/n;->a(Ljava/lang/Object;)Lgt/n;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Lgt/n;->b:Lgt/n$a;

    new-instance p1, Lfn/o0;

    invoke-direct {p1}, Lfn/o0;-><init>()V

    invoke-static {p1}, Lgt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgt/n;->a(Ljava/lang/Object;)Lgt/n;

    move-result-object p1

    return-object p1
.end method
