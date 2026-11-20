.class public final Lwm/u$a$c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lyt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwm/u$a;->f(Ljava/lang/Object;Ljava/lang/Object;Lwm/k$a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lyt/n<",
        "TP;TS;",
        "Lwm/t$b<",
        "TP;TS;TO;>;TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00028\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u0002\"\u0004\u0008\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "P",
        "S",
        "O",
        "R",
        "props",
        "state",
        "Lwm/t$b;",
        "interceptor",
        "a",
        "(Ljava/lang/Object;Ljava/lang/Object;Lwm/t$b;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lwm/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwm/k<",
            "TP;TS;TO;TR;>.a;"
        }
    .end annotation
.end field

.field public final synthetic j:Lwm/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwm/k<",
            "TP;TS;TO;TR;>;"
        }
    .end annotation
.end field

.field public final synthetic k:Lwm/u$a;


# direct methods
.method public constructor <init>(Lwm/k$a;Lwm/k;Lwm/u$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/k<",
            "-TP;TS;+TO;+TR;>.a;",
            "Lwm/k<",
            "-TP;TS;+TO;+TR;>;",
            "Lwm/u$a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lwm/u$a$c;->i:Lwm/k$a;

    iput-object p2, p0, Lwm/u$a$c;->j:Lwm/k;

    iput-object p3, p0, Lwm/u$a$c;->k:Lwm/u$a;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Lwm/t$b;)Ljava/lang/Object;
    .locals 2
    .param p3    # Lwm/t$b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TS;",
            "Lwm/t$b<",
            "TP;TS;TO;>;)TR;"
        }
    .end annotation

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lwm/u$a$c;->i:Lwm/k$a;

    new-instance v1, Lwm/d;

    invoke-direct {v1, v0, p3}, Lwm/d;-><init>(Lwm/a;Lwm/t$b;)V

    move-object p3, v1

    :goto_0
    if-nez p3, :cond_1

    iget-object p3, p0, Lwm/u$a$c;->i:Lwm/k$a;

    :cond_1
    iget-object v0, p0, Lwm/u$a$c;->j:Lwm/k;

    iget-object v1, p0, Lwm/u$a$c;->k:Lwm/u$a;

    invoke-static {p3, v1}, Lwm/w;->a(Lwm/a;Lwm/k;)Lwm/k$a;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Lwm/k;->f(Ljava/lang/Object;Ljava/lang/Object;Lwm/k$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p3, Lwm/t$b;

    invoke-virtual {p0, p1, p2, p3}, Lwm/u$a$c;->a(Ljava/lang/Object;Ljava/lang/Object;Lwm/t$b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
