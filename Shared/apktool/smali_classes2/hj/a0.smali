.class public Lhj/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj/a0$b;
    }
.end annotation


# instance fields
.field public a:Lhj/a0$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhj/a0$a;

    invoke-direct {v0, p0}, Lhj/a0$a;-><init>(Lhj/a0;)V

    iput-object v0, p0, Lhj/a0;->a:Lhj/a0$b;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 v0, 0x191

    if-ne p2, v0, :cond_0

    const-string p2, "unauthenticated"

    goto :goto_0

    :cond_0
    const-string p2, "metadataInaccessible"

    :goto_0
    invoke-static {p2, p0, p1}, Lrg/t0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic b(Lhj/a0$b;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkj/g0;)Lkotlin/Unit;
    .locals 6

    new-instance v5, Lhj/k;

    invoke-direct {v5}, Lhj/k;-><init>()V

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v1, p4

    invoke-interface/range {v0 .. v5}, Lhj/a0$b;->a(Lkj/g0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lhj/k;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/String;Lhj/x;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p3, p1, p2}, Lhj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lek/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final e()Lhj/x;
    .locals 1

    new-instance v0, Lhj/x;

    invoke-direct {v0}, Lhj/x;-><init>()V

    return-object v0
.end method

.method public f(Landroid/content/Context;Ljj/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhj/a0$b;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lek/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    move-object p1, p2

    move-object p2, p3

    move-object p3, p4

    move-object p4, p5

    new-instance p5, Lhj/y;

    invoke-direct {p5, p7, v0, p2, p6}, Lhj/y;-><init>(Lhj/a0$b;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    move-object p7, p6

    new-instance p6, Lhj/z;

    invoke-direct {p6, p2, p7}, Lhj/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p6}, Ljj/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public g(Landroid/content/Context;Ljava/lang/String;)V
    .locals 10

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lhj/a0;->e()Lhj/x;

    move-result-object v0

    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object v1

    invoke-virtual {v1, p1}, Lhj/r;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lhj/a0;->c(Landroid/content/Context;Ljava/lang/String;Lhj/x;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lhj/r;->k()Lhj/r;

    move-result-object v1

    invoke-virtual {v1, p1}, Lhj/r;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lhj/a0;->c(Landroid/content/Context;Ljava/lang/String;Lhj/x;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, p1}, Lhj/a0;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lti/b;->f()Lti/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lti/b;->k(Landroid/content/Context;)V

    invoke-static {p1}, Lci/c;->e(Landroid/content/Context;)V

    new-instance v4, Ljj/a;

    invoke-direct {v4}, Ljj/a;-><init>()V

    iget-object v9, p0, Lhj/a0;->a:Lhj/a0$b;

    move-object v2, p0

    move-object v3, p1

    move-object v7, p2

    invoke-virtual/range {v2 .. v9}, Lhj/a0;->f(Landroid/content/Context;Ljj/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhj/a0$b;)V

    :cond_0
    return-void
.end method
