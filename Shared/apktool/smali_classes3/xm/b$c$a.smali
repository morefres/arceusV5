.class public final Lxm/b$c$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lyt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxm/b$c;->a(Ljava/lang/Object;Ljava/lang/Object;Lwm/t$b;)Ljava/lang/Object;
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
        "p",
        "s",
        "Lwm/t$b;",
        "innerContextInterceptor",
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
.field public final synthetic i:Lxm/b;

.field public final synthetic j:Lwm/t$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwm/t$b<",
            "TP;TS;TO;>;"
        }
    .end annotation
.end field

.field public final synthetic k:Lyt/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/n<",
            "TP;TS;",
            "Lwm/t$b<",
            "TP;TS;TO;>;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxm/b;Lwm/t$b;Lyt/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxm/b;",
            "Lwm/t$b<",
            "TP;TS;TO;>;",
            "Lyt/n<",
            "-TP;-TS;-",
            "Lwm/t$b<",
            "TP;TS;TO;>;+TR;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lxm/b$c$a;->i:Lxm/b;

    iput-object p2, p0, Lxm/b$c$a;->j:Lwm/t$b;

    iput-object p3, p0, Lxm/b$c$a;->k:Lyt/n;

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

    iget-object v0, p0, Lxm/b$c$a;->i:Lxm/b;

    iget-object v1, p0, Lxm/b$c$a;->j:Lwm/t$b;

    invoke-static {v0, v1, p3}, Lxm/b;->f(Lxm/b;Lwm/t$b;Lwm/t$b;)Lwm/t$b;

    move-result-object p3

    iget-object v0, p0, Lxm/b$c$a;->k:Lyt/n;

    invoke-interface {v0, p1, p2, p3}, Lyt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p3, Lwm/t$b;

    invoke-virtual {p0, p1, p2, p3}, Lxm/b$c$a;->a(Ljava/lang/Object;Ljava/lang/Object;Lwm/t$b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
