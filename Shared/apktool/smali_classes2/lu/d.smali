.class public final synthetic Llu/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyt/n;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Llu/e;

.field public final synthetic c:Lsu/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Llu/e;Lsu/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llu/d;->a:Ljava/lang/Object;

    iput-object p2, p0, Llu/d;->b:Llu/e;

    iput-object p3, p0, Llu/d;->c:Lsu/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Llu/d;->a:Ljava/lang/Object;

    iget-object v1, p0, Llu/d;->b:Llu/e;

    iget-object v2, p0, Llu/d;->c:Lsu/l;

    move-object v3, p1

    check-cast v3, Ljava/lang/Throwable;

    move-object v5, p3

    check-cast v5, Lkotlin/coroutines/CoroutineContext;

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Llu/e;->b(Ljava/lang/Object;Llu/e;Lsu/l;Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
