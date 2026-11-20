.class public Lci/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Ltk/g;->d()Ltk/d;

    move-result-object v0

    invoke-interface {v0}, Ltk/d;->f()Lxk/j;

    move-result-object v0

    new-instance v1, Lyk/b;

    invoke-direct {v1, p0, p1, p2}, Lyk/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lxk/j;->g(Lyk/b;)Liv/d;

    move-result-object p0

    new-instance p1, Lci/o$a;

    invoke-direct {p1}, Lci/o$a;-><init>()V

    invoke-interface {p0, p1}, Liv/d;->F(Liv/f;)V

    return-void
.end method
