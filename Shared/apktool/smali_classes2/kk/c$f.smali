.class public final Lkk/c$f;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkk/c;->v(Lmt/b;)Ljava/lang/Object;
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
    c = "com.roblox.engine.AndroidAssetsHelper"
    f = "AndroidAssetsHelper.kt"
    l = {
        0x54,
        0x56
    }
    m = "unpackAssetsInternal"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lkk/c;

.field public w:I


# direct methods
.method public constructor <init>(Lkk/c;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkk/c;",
            "Lmt/b<",
            "-",
            "Lkk/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkk/c$f;->v:Lkk/c;

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

    iput-object p1, p0, Lkk/c$f;->u:Ljava/lang/Object;

    iget p1, p0, Lkk/c$f;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lkk/c$f;->w:I

    iget-object p1, p0, Lkk/c$f;->v:Lkk/c;

    invoke-static {p1, p0}, Lkk/c;->i(Lkk/c;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
