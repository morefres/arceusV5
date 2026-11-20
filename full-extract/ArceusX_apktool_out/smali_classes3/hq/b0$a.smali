.class public final Lhq/b0$a;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhq/b0;->a(ILkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.shared.RetryKt"
    f = "Retry.kt"
    l = {
        0xd
    }
    m = "retry"
.end annotation


# instance fields
.field public t:I

.field public u:I

.field public v:Ljava/lang/Object;

.field public synthetic w:Ljava/lang/Object;

.field public x:I


# direct methods
.method public constructor <init>(Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmt/b<",
            "-",
            "Lhq/b0$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lot/d;-><init>(Lmt/b;)V

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

    iput-object p1, p0, Lhq/b0$a;->w:Ljava/lang/Object;

    iget p1, p0, Lhq/b0$a;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lhq/b0$a;->x:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lhq/b0;->a(ILkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
