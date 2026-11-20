.class public final Lbq/a$d;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbq/a;->k(ILmt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager"
    f = "SelfiePoseManager.kt"
    l = {
        0x64
    }
    m = "getPose-gIAlu-s"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lbq/a;

.field public w:I


# direct methods
.method public constructor <init>(Lbq/a;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbq/a;",
            "Lmt/b<",
            "-",
            "Lbq/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbq/a$d;->v:Lbq/a;

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

    iput-object p1, p0, Lbq/a$d;->u:Ljava/lang/Object;

    iget p1, p0, Lbq/a$d;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbq/a$d;->w:I

    iget-object p1, p0, Lbq/a$d;->v:Lbq/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lbq/a;->k(ILmt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lnt/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Lgt/n;->a(Ljava/lang/Object;)Lgt/n;

    move-result-object p1

    return-object p1
.end method
