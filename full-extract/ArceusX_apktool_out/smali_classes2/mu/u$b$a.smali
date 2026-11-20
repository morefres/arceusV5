.class public final Lmu/u$b$a;
.super Lot/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu/u$b;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lot/f;
    c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1"
    f = "Emitters.kt"
    l = {
        0x6e,
        0x75,
        0x7c
    }
    m = "collect"
.end annotation


# instance fields
.field public synthetic t:Ljava/lang/Object;

.field public u:I

.field public final synthetic v:Lmu/u$b;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmu/u$b;Lmt/b;)V
    .locals 0

    iput-object p1, p0, Lmu/u$b$a;->v:Lmu/u$b;

    invoke-direct {p0, p2}, Lot/d;-><init>(Lmt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmu/u$b$a;->t:Ljava/lang/Object;

    iget p1, p0, Lmu/u$b$a;->u:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmu/u$b$a;->u:I

    iget-object p1, p0, Lmu/u$b$a;->v:Lmu/u$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lmu/u$b;->collect(Lmu/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
