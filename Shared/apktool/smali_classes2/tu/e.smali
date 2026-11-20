.class public final synthetic Ltu/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ltu/f;

.field public final synthetic b:Ltu/f$a;


# direct methods
.method public synthetic constructor <init>(Ltu/f;Ltu/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltu/e;->a:Ltu/f;

    iput-object p2, p0, Ltu/e;->b:Ltu/f$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltu/e;->a:Ltu/f;

    iget-object v1, p0, Ltu/e;->b:Ltu/f$a;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Ltu/f$a;->e(Ltu/f;Ltu/f$a;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
