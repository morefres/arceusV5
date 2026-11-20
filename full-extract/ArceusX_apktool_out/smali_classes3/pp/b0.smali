.class public final synthetic Lpp/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lqp/c;

.field public final synthetic b:Lpp/g0;


# direct methods
.method public synthetic constructor <init>(Lqp/c;Lpp/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp/b0;->a:Lqp/c;

    iput-object p2, p0, Lpp/b0;->b:Lpp/g0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpp/b0;->a:Lqp/c;

    iget-object v1, p0, Lpp/b0;->b:Lpp/g0;

    invoke-static {v0, v1}, Lpp/g0;->e(Lqp/c;Lpp/g0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
