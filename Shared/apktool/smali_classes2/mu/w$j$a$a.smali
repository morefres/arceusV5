.class public final Lmu/w$j$a$a;
.super Lot/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu/w$j$a;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1"
    f = "Limit.kt"
    l = {
        0x84
    }
    m = "emit"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Lmu/w$j$a;


# direct methods
.method public constructor <init>(Lmu/w$j$a;Lmt/b;)V
    .locals 0

    iput-object p1, p0, Lmu/w$j$a$a;->w:Lmu/w$j$a;

    invoke-direct {p0, p2}, Lot/d;-><init>(Lmt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmu/w$j$a$a;->u:Ljava/lang/Object;

    iget p1, p0, Lmu/w$j$a$a;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmu/w$j$a$a;->v:I

    iget-object p1, p0, Lmu/w$j$a$a;->w:Lmu/w$j$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lmu/w$j$a;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
