.class public final Lcp/a$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lcp/a$d$b;->a:Lju/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcp/a$d$b;->a:Lju/n;

    sget-object v1, Lgt/n;->b:Lgt/n$a;

    invoke-static {p1}, Lgt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgt/n;->a(Ljava/lang/Object;)Lgt/n;

    move-result-object p1

    invoke-static {p1}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lmt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
