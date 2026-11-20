.class public Lln/x$a;
.super Lrn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lln/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lrn/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lrn/h;Lrn/g;)Lrn/f;
    .locals 5

    invoke-interface {p2}, Lrn/g;->a()Lrn/d;

    move-result-object v0

    invoke-interface {p1}, Lrn/h;->d()I

    move-result v1

    sget v2, Lnn/f;->a:I

    if-lt v1, v2, :cond_0

    invoke-static {}, Lrn/f;->c()Lrn/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lrn/h;->e()I

    move-result v1

    invoke-interface {p1}, Lrn/h;->c()I

    move-result v2

    invoke-interface {p1}, Lrn/h;->d()I

    move-result v3

    add-int/2addr v2, v3

    invoke-interface {p2}, Lrn/g;->b()Lpn/j;

    move-result-object p2

    invoke-virtual {p2}, Lpn/j;->f()Z

    move-result p2

    const/4 v3, 0x1

    xor-int/2addr p2, v3

    invoke-interface {p1}, Lrn/h;->b()Lpn/i;

    move-result-object v4

    invoke-virtual {v4}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4, v1, v2, p2}, Lln/x;->l(Ljava/lang/CharSequence;IIZ)Lln/x$b;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-static {}, Lrn/f;->c()Lrn/f;

    move-result-object p1

    return-object p1

    :cond_1
    iget v1, p2, Lln/x$b;->b:I

    new-instance v2, Lln/y;

    invoke-interface {p1}, Lrn/h;->d()I

    move-result v4

    invoke-interface {p1}, Lrn/h;->c()I

    move-result p1

    sub-int p1, v1, p1

    invoke-direct {v2, v4, p1}, Lln/y;-><init>(II)V

    instance-of p1, v0, Lln/x;

    const/4 v4, 0x0

    if-eqz p1, :cond_3

    invoke-interface {v0}, Lrn/d;->g()Lon/a;

    move-result-object p1

    check-cast p1, Lon/q;

    iget-object v0, p2, Lln/x$b;->a:Lon/q;

    invoke-static {p1, v0}, Lln/x;->k(Lon/q;Lon/q;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-array p1, v3, [Lrn/d;

    aput-object v2, p1, v4

    invoke-static {p1}, Lrn/f;->d([Lrn/d;)Lrn/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lrn/f;->a(I)Lrn/f;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, Lln/x;

    iget-object v0, p2, Lln/x$b;->a:Lon/q;

    invoke-direct {p1, v0}, Lln/x;-><init>(Lon/q;)V

    iget-object p2, p2, Lln/x$b;->a:Lon/q;

    invoke-virtual {p2, v3}, Lon/q;->q(Z)V

    const/4 p2, 0x2

    new-array p2, p2, [Lrn/d;

    aput-object p1, p2, v4

    aput-object v2, p2, v3

    invoke-static {p2}, Lrn/f;->d([Lrn/d;)Lrn/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lrn/f;->a(I)Lrn/f;

    move-result-object p1

    return-object p1
.end method
