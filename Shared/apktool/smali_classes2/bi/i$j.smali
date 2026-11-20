.class public final Lbi/i$j;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/i;->t(Lmt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.googleplaygames.PlayGamesIntegration"
    f = "PlayGamesIntegration.kt"
    l = {
        0xf1,
        0xf4
    }
    m = "startStreakTracker"
    v = 0x1
.end annotation


# instance fields
.field public t:J

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lbi/i;

.field public w:I


# direct methods
.method public constructor <init>(Lbi/i;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbi/i;",
            "Lmt/b<",
            "-",
            "Lbi/i$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbi/i$j;->v:Lbi/i;

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

    iput-object p1, p0, Lbi/i$j;->u:Ljava/lang/Object;

    iget p1, p0, Lbi/i$j;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbi/i$j;->w:I

    iget-object p1, p0, Lbi/i$j;->v:Lbi/i;

    invoke-static {p1, p0}, Lbi/i;->h(Lbi/i;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
