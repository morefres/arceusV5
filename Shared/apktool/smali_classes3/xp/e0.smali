.class public final synthetic Lxp/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lxp/k0;

.field public final synthetic b:Ldn/g;


# direct methods
.method public synthetic constructor <init>(Lxp/k0;Ldn/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp/e0;->a:Lxp/k0;

    iput-object p2, p0, Lxp/e0;->b:Ldn/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lxp/e0;->a:Lxp/k0;

    iget-object v1, p0, Lxp/e0;->b:Ldn/g;

    invoke-static {v0, v1}, Lxp/k0;->l(Lxp/k0;Ldn/g;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
