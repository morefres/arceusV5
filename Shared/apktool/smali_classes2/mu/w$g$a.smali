.class public final Lmu/w$g$a;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu/w$g;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1"
    f = "Limit.kt"
    l = {
        0x3b,
        0x3d
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lmu/w$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/w$g<",
            "TT;>;"
        }
    .end annotation
.end field

.field public v:I


# direct methods
.method public constructor <init>(Lmu/w$g;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/w$g<",
            "-TT;>;",
            "Lmt/b<",
            "-",
            "Lmu/w$g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmu/w$g$a;->u:Lmu/w$g;

    invoke-direct {p0, p2}, Lot/d;-><init>(Lmt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmu/w$g$a;->t:Ljava/lang/Object;

    iget p1, p0, Lmu/w$g$a;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmu/w$g$a;->v:I

    iget-object p1, p0, Lmu/w$g$a;->u:Lmu/w$g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lmu/w$g;->emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
