.class public final Liv/p$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liv/p;->e(Ljava/lang/Throwable;Lmt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lmt/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmt/b<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lmt/b;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmt/b<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Liv/p$h;->a:Lmt/b;

    iput-object p2, p0, Liv/p$h;->b:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Liv/p$h;->a:Lmt/b;

    invoke-static {v0}, Lnt/b;->c(Lmt/b;)Lmt/b;

    move-result-object v0

    sget-object v1, Lgt/n;->b:Lgt/n$a;

    iget-object v1, p0, Liv/p$h;->b:Ljava/lang/Throwable;

    invoke-static {v1}, Lgt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lgt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lmt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
