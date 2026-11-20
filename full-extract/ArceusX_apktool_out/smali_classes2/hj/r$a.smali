.class public Lhj/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhj/r$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhj/r;


# direct methods
.method public constructor <init>(Lhj/r;)V
    .locals 0

    iput-object p1, p0, Lhj/r$a;->a:Lhj/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lkj/k0;Landroid/content/Context;)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lkj/k0;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj/r$a;->a:Lhj/r;

    invoke-static {v0, p2}, Lhj/r;->d(Lhj/r;Landroid/content/Context;)Lhj/s;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhj/r$a;->a:Lhj/r;

    invoke-virtual {p1}, Lkj/k0;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lhj/x;

    invoke-direct {v1}, Lhj/x;-><init>()V

    iget-object v2, p0, Lhj/r$a;->a:Lhj/r;

    invoke-static {v2, p2}, Lhj/r;->d(Lhj/r;Landroid/content/Context;)Lhj/s;

    move-result-object v2

    invoke-interface {v2}, Lhj/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p2, p1, v1, v2}, Lhj/r;->H(Landroid/content/Context;Ljava/lang/String;Lhj/x;Ljava/lang/String;)V

    invoke-static {}, Lrg/a1;->q0()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lhj/r$a;->a:Lhj/r;

    invoke-static {p1, p2}, Lhj/r;->e(Lhj/r;Landroid/content/Context;)V

    :cond_0
    return-void
.end method
