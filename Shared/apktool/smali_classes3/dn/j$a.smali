.class public final Ldn/j$a;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldn/j;->b(Landroid/content/Context;Lmt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.camera.CameraHelper"
    f = "CameraHelper.kt"
    l = {
        0xd,
        0x10,
        0x14
    }
    m = "unbind"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ldn/j;

.field public y:I


# direct methods
.method public constructor <init>(Ldn/j;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldn/j;",
            "Lmt/b<",
            "-",
            "Ldn/j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldn/j$a;->x:Ldn/j;

    invoke-direct {p0, p2}, Lot/d;-><init>(Lmt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Ldn/j$a;->w:Ljava/lang/Object;

    iget p1, p0, Ldn/j$a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldn/j$a;->y:I

    iget-object p1, p0, Ldn/j$a;->x:Ldn/j;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ldn/j;->b(Landroid/content/Context;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
