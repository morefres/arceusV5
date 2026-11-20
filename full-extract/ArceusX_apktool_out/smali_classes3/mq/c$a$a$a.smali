.class public final Lmq/c$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq/c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lmu/i;"
    }
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


# instance fields
.field public final synthetic a:Lmq/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmq/c<",
            "TT;TRendering;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lmq/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/c<",
            "TT;TRendering;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lmq/c$a$a$a;->a:Lmq/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRendering;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    iget-object p2, p0, Lmq/c$a$a$a;->a:Lmq/c;

    invoke-virtual {p2, p1}, Lmq/c;->h2(Ljava/lang/Object;)V

    iget-object p1, p0, Lmq/c$a$a$a;->a:Lmq/c;

    invoke-virtual {p1}, Landroidx/fragment/app/c;->a2()V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
