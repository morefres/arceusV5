.class public final synthetic Loo/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Z

.field public final synthetic c:Ltr/f;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ZLtr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loo/d;->a:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Loo/d;->b:Z

    iput-object p3, p0, Loo/d;->c:Ltr/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Loo/d;->a:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Loo/d;->b:Z

    iget-object v2, p0, Loo/d;->c:Ltr/f;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, p1}, Loo/e;->b(Lkotlin/jvm/functions/Function1;ZLtr/f;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
