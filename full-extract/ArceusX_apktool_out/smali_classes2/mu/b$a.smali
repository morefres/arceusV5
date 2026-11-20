.class public final Lmu/b$a;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu/b;->d(Llu/v;Lmt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.CallbackFlowBuilder"
    f = "Builders.kt"
    l = {
        0x14a
    }
    m = "collectTo"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lmu/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>(Lmu/b;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/b<",
            "TT;>;",
            "Lmt/b<",
            "-",
            "Lmu/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmu/b$a;->v:Lmu/b;

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

    iput-object p1, p0, Lmu/b$a;->u:Ljava/lang/Object;

    iget p1, p0, Lmu/b$a;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmu/b$a;->w:I

    iget-object p1, p0, Lmu/b$a;->v:Lmu/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lmu/b;->d(Llu/v;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
