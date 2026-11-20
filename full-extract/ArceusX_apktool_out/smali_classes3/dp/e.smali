.class public final synthetic Ldp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lxo/y$a;


# direct methods
.method public synthetic constructor <init>(Lxo/y$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp/e;->a:Lxo/y$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldp/e;->a:Lxo/y$a;

    invoke-static {v0}, Ldp/f;->i2(Lxo/y$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
