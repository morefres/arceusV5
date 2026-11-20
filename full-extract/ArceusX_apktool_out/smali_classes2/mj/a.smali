.class public Lmj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Lhj/x;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p3, p1, p2}, Lhj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lek/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lhj/x;
    .locals 1

    new-instance v0, Lhj/x;

    invoke-direct {v0}, Lhj/x;-><init>()V

    return-object v0
.end method

.method public d(Landroid/content/Context;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {}, Lhj/t;->g()Lhj/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhj/t;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lti/b;->f()Lti/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lti/b;->k(Landroid/content/Context;)V

    invoke-static {p1}, Lci/c;->e(Landroid/content/Context;)V

    invoke-virtual {p0}, Lmj/a;->c()Lhj/x;

    move-result-object v0

    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object v1

    invoke-virtual {v1, p1}, Lhj/r;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lmj/a;->a(Landroid/content/Context;Ljava/lang/String;Lhj/x;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p1}, Lmj/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v0, Lmj/m;

    invoke-direct {v0}, Lmj/m;-><init>()V

    invoke-virtual {v0, p2}, Lmj/m;->a(Ljava/util/Map;)Lnj/f;

    move-result-object p2

    invoke-interface {p2}, Lnj/f;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "foreground"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lnj/f;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2}, Lnj/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2}, Lnj/f;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p2}, Lnj/f;->o()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p2}, Lnj/f;->b()Ljava/util/List;

    move-result-object v8

    invoke-static/range {v2 .. v8}, Lrg/t0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lnj/f;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Lrg/t0;->u(Ljava/lang/String;Lnj/f;Ljava/util/Map;)V

    new-instance v0, Lmj/n;

    invoke-direct {v0}, Lmj/n;-><init>()V

    invoke-virtual {v0, p2}, Lmj/n;->a(Lnj/f;)Lmj/c;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0, p1, p2}, Lmj/c;->a(Landroid/content/Context;Lnj/f;)V

    :cond_3
    :goto_0
    return-void
.end method
