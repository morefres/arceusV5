.class public final Ldn/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhn/a;
.implements Lg0/u0$a;
.implements Lmu/g0;
.implements Lfn/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhn/a;",
        "Lg0/u0$a;",
        "Lmu/g0<",
        "Lin/c;",
        ">;",
        "Lfn/g;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u001f\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u001e\u0010*\u001a\u00020)2\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00040\'H\u0096A\u00a2\u0006\u0004\u0008*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010.\u00a8\u0006/"
    }
    d2 = {
        "Ldn/n0;",
        "Lhn/a;",
        "Lg0/u0$a;",
        "Lmu/g0;",
        "Lin/c;",
        "Lfn/g;",
        "Ldn/r0;",
        "selfieProcessor",
        "Lmu/b0;",
        "resultFlow",
        "<init>",
        "(Ldn/r0;Lmu/b0;)V",
        "",
        "minFaceRatio",
        "maxFaceRatio",
        "",
        "analyzeLightConditions",
        "",
        "m",
        "(DDZ)V",
        "Ldn/r0$c;",
        "pose",
        "n",
        "(Ldn/r0$c;)V",
        "Landroidx/camera/core/d;",
        "imageProxy",
        "k",
        "(Landroidx/camera/core/d;)V",
        "Landroid/media/Image;",
        "image",
        "",
        "rotationDegrees",
        "f",
        "(Landroid/media/Image;I)V",
        "Landroid/graphics/Rect;",
        "rect",
        "previewRect",
        "b",
        "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V",
        "Lmu/i;",
        "collector",
        "",
        "collect",
        "(Lmu/i;Lmt/b;)Ljava/lang/Object;",
        "a",
        "Ldn/r0;",
        "Lmu/b0;",
        "camera_release"
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
.field public final a:Ldn/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lmu/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/b0<",
            "Lin/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldn/r0;Lmu/b0;)V
    .locals 1
    .param p1    # Ldn/r0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmu/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/r0;",
            "Lmu/b0<",
            "Lin/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "selfieProcessor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn/n0;->a:Ldn/r0;

    iput-object p2, p0, Ldn/n0;->b:Lmu/b0;

    return-void
.end method

.method public static final synthetic l(Ldn/n0;)Lmu/b0;
    .locals 0

    iget-object p0, p0, Ldn/n0;->b:Lmu/b0;

    return-object p0
.end method


# virtual methods
.method public b(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previewRect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldn/n0;->a:Ldn/r0;

    invoke-virtual {v0, p1, p2}, Ldn/r0;->w(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    return-void
.end method

.method public collect(Lmu/i;Lmt/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lmu/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/i<",
            "-",
            "Lin/c;",
            ">;",
            "Lmt/b<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Ldn/n0;->b:Lmu/b0;

    invoke-interface {v0, p1, p2}, Lmu/g0;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroid/media/Image;I)V
    .locals 1
    .param p1    # Landroid/media/Image;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Ldn/n0;->a:Ldn/r0;

    invoke-virtual {v0, p1, p2}, Ldn/r0;->d(Landroid/media/Image;I)Lin/c;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lwt/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    new-instance p1, Ldn/n0$b;

    invoke-direct {p1, p0, p2, v0}, Ldn/n0$b;-><init>(Ldn/n0;Lin/c;Lmt/b;)V

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v0}, Lju/i;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lwt/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public k(Landroidx/camera/core/d;)V
    .locals 2
    .param p1    # Landroidx/camera/core/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "imageProxy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Ldn/n0;->a:Ldn/r0;

    invoke-virtual {v0, p1}, Ldn/r0;->e(Landroidx/camera/core/d;)Lin/c;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lwt/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    new-instance p1, Ldn/n0$a;

    invoke-direct {p1, p0, v0, v1}, Ldn/n0$a;-><init>(Ldn/n0;Lin/c;Lmt/b;)V

    const/4 v0, 0x1

    invoke-static {v1, p1, v0, v1}, Lju/i;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lwt/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final m(DDZ)V
    .locals 6

    iget-object v0, p0, Ldn/n0;->a:Ldn/r0;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ldn/r0;->u(DDZ)V

    return-void
.end method

.method public final n(Ldn/r0$c;)V
    .locals 1
    .param p1    # Ldn/r0$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "pose"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldn/n0;->a:Ldn/r0;

    invoke-virtual {v0, p1}, Ldn/r0;->v(Ldn/r0$c;)V

    return-void
.end method
