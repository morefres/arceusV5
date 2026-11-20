.class public final Lug/p$e;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug/p;->j(Lkh/a;ZLmt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.analytics.EventUploadWorker"
    f = "EventUploadWorker.kt"
    l = {
        0x9b,
        0xa0,
        0xa1,
        0xa8
    }
    m = "doUpload"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Lug/p;

.field public B:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Z

.field public w:Z

.field public x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lug/p;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug/p;",
            "Lmt/b<",
            "-",
            "Lug/p$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug/p$e;->A:Lug/p;

    invoke-direct {p0, p2}, Lot/d;-><init>(Lmt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lug/p$e;->z:Ljava/lang/Object;

    iget p1, p0, Lug/p$e;->B:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lug/p$e;->B:I

    iget-object p1, p0, Lug/p$e;->A:Lug/p;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lug/p;->c(Lug/p;Lkh/a;ZLmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
