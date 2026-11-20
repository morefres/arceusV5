.class public Lci/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Lhj/r;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lhj/x;

    invoke-direct {v1}, Lhj/x;-><init>()V

    invoke-virtual {v1, p0, v0}, Lhj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Ltk/g;->d()Ltk/d;

    move-result-object v0

    invoke-interface {v0}, Ltk/d;->f()Lxk/j;

    move-result-object v0

    new-instance v1, Lyk/a;

    invoke-direct {v1, p0, p1}, Lyk/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lxk/j;->a(Lyk/a;)Liv/d;

    move-result-object p0

    new-instance p1, Lci/p$a;

    invoke-direct {p1}, Lci/p$a;-><init>()V

    invoke-interface {p0, p1}, Liv/d;->F(Liv/f;)V

    return-void
.end method
