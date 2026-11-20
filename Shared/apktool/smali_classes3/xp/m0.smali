.class public final synthetic Lxp/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lxp/k0;

.field public final synthetic b:Ldn/g;


# direct methods
.method public synthetic constructor <init>(Lxp/k0;Ldn/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp/m0;->a:Lxp/k0;

    iput-object p2, p0, Lxp/m0;->b:Ldn/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lxp/m0;->a:Lxp/k0;

    iget-object v1, p0, Lxp/m0;->b:Ldn/g;

    invoke-static {v0, v1}, Lxp/k0$c;->a(Lxp/k0;Ldn/g;)V

    return-void
.end method
