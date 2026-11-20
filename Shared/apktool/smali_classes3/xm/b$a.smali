.class public final Lxm/b$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxm/b;->a(Ljava/lang/Object;Lwm/i;Lkotlin/jvm/functions/Function2;Lwm/t$c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function2<",
        "TP;",
        "Lwm/i;",
        "TS;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00028\u0001\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "P",
        "S",
        "props",
        "Lwm/i;",
        "snapshot",
        "a",
        "(Ljava/lang/Object;Lwm/i;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lwm/t;

.field public final synthetic j:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TP;",
            "Lwm/i;",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic k:Lwm/t$c;


# direct methods
.method public constructor <init>(Lwm/t;Lkotlin/jvm/functions/Function2;Lwm/t$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/t;",
            "Lkotlin/jvm/functions/Function2<",
            "-TP;-",
            "Lwm/i;",
            "+TS;>;",
            "Lwm/t$c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lxm/b$a;->i:Lwm/t;

    iput-object p2, p0, Lxm/b$a;->j:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Lxm/b$a;->k:Lwm/t$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lwm/i;)Ljava/lang/Object;
    .locals 3
    .param p2    # Lwm/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lwm/i;",
            ")TS;"
        }
    .end annotation

    iget-object v0, p0, Lxm/b$a;->i:Lwm/t;

    iget-object v1, p0, Lxm/b$a;->j:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lxm/b$a;->k:Lwm/t$c;

    invoke-interface {v0, p1, p2, v1, v2}, Lwm/t;->a(Ljava/lang/Object;Lwm/i;Lkotlin/jvm/functions/Function2;Lwm/t$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lwm/i;

    invoke-virtual {p0, p1, p2}, Lxm/b$a;->a(Ljava/lang/Object;Lwm/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
