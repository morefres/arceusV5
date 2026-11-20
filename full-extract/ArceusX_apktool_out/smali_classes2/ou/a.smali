.class public final synthetic Lou/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/CompletableFuture;

.field public final synthetic b:Lju/w0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CompletableFuture;Lju/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lou/a;->a:Ljava/util/concurrent/CompletableFuture;

    iput-object p2, p0, Lou/a;->b:Lju/w0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lou/a;->a:Ljava/util/concurrent/CompletableFuture;

    iget-object v1, p0, Lou/a;->b:Lju/w0;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lou/c;->a(Ljava/util/concurrent/CompletableFuture;Lju/w0;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
