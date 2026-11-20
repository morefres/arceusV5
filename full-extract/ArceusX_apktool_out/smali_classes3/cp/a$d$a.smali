.class public final Lcp/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ltd/c$c;",
        "Lkotlin/Unit;",
        ">;"
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
.field public final synthetic a:Lju/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lju/n<",
            "Lgt/n<",
            "+",
            "Ltd/c$c;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lju/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lju/n<",
            "-",
            "Lgt/n<",
            "+",
            "Ltd/c$c;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcp/a$d$a;->a:Lju/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltd/c$c;)V
    .locals 1

    iget-object v0, p0, Lcp/a$d$a;->a:Lju/n;

    invoke-static {p1}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgt/n;->a(Ljava/lang/Object;)Lgt/n;

    move-result-object p1

    invoke-static {p1}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lmt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltd/c$c;

    invoke-virtual {p0, p1}, Lcp/a$d$a;->a(Ltd/c$c;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
