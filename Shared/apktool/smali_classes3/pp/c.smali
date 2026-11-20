.class public final synthetic Lpp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lqp/c;

.field public final synthetic b:Lpp/h;


# direct methods
.method public synthetic constructor <init>(Lqp/c;Lpp/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp/c;->a:Lqp/c;

    iput-object p2, p0, Lpp/c;->b:Lpp/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpp/c;->a:Lqp/c;

    iget-object v1, p0, Lpp/c;->b:Lpp/h;

    invoke-static {v0, v1}, Lpp/h;->c(Lqp/c;Lpp/h;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
