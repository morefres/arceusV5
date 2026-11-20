.class public final Laq/b$g;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laq/b;->y(Ljava/io/File;Laq/b$b;Ljava/util/List;Lmt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker"
    f = "SubmitVerificationWorker.kt"
    l = {
        0x16f,
        0x170
    }
    m = "uploadIfNeededAndAddFileToBody-BWLJW6A"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Laq/b;

.field public z:I


# direct methods
.method public constructor <init>(Laq/b;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq/b;",
            "Lmt/b<",
            "-",
            "Laq/b$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Laq/b$g;->y:Laq/b;

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

    iput-object p1, p0, Laq/b$g;->x:Ljava/lang/Object;

    iget p1, p0, Laq/b$g;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Laq/b$g;->z:I

    iget-object p1, p0, Laq/b$g;->y:Laq/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Laq/b;->w(Laq/b;Ljava/io/File;Laq/b$b;Ljava/util/List;Lmt/b;)Ljava/lang/Object;

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
