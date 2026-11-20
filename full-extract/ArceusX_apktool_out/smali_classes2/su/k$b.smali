.class public final Lsu/k$b;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsu/k;->q(Lmt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.selects.SelectImplementation"
    f = "Select.kt"
    l = {
        0x1c5,
        0x1c8
    }
    m = "doSelectSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lsu/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsu/k<",
            "TR;>;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>(Lsu/k;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsu/k<",
            "TR;>;",
            "Lmt/b<",
            "-",
            "Lsu/k$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsu/k$b;->v:Lsu/k;

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

    iput-object p1, p0, Lsu/k$b;->u:Ljava/lang/Object;

    iget p1, p0, Lsu/k$b;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsu/k$b;->w:I

    iget-object p1, p0, Lsu/k$b;->v:Lsu/k;

    invoke-static {p1, p0}, Lsu/k;->g(Lsu/k;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
