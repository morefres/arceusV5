.class public final Lmu/o0$a$a$a;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu/o0$a$a;->b(ILmt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.StartedLazily$command$1$1"
    f = "SharingStarted.kt"
    l = {
        0x9a
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lmu/o0$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/o0$a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public v:I


# direct methods
.method public constructor <init>(Lmu/o0$a$a;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/o0$a$a<",
            "-TT;>;",
            "Lmt/b<",
            "-",
            "Lmu/o0$a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmu/o0$a$a$a;->u:Lmu/o0$a$a;

    invoke-direct {p0, p2}, Lot/d;-><init>(Lmt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmu/o0$a$a$a;->t:Ljava/lang/Object;

    iget p1, p0, Lmu/o0$a$a$a;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmu/o0$a$a$a;->v:I

    iget-object p1, p0, Lmu/o0$a$a$a;->u:Lmu/o0$a$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lmu/o0$a$a;->b(ILmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
