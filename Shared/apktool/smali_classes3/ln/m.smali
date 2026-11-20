.class public Lln/m;
.super Lrn/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lln/m$a;
    }
.end annotation


# instance fields
.field public final a:Lon/j;

.field public final b:Lpn/j;


# direct methods
.method public constructor <init>(ILpn/j;)V
    .locals 1

    invoke-direct {p0}, Lrn/a;-><init>()V

    new-instance v0, Lon/j;

    invoke-direct {v0}, Lon/j;-><init>()V

    iput-object v0, p0, Lln/m;->a:Lon/j;

    invoke-virtual {v0, p1}, Lon/j;->q(I)V

    iput-object p2, p0, Lln/m;->b:Lpn/j;

    return-void
.end method

.method public static bridge synthetic k(Lpn/i;)Lln/m;
    .locals 0

    invoke-static {p0}, Lln/m;->m(Lpn/i;)Lln/m;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic l(Ljava/lang/CharSequence;I)I
    .locals 0

    invoke-static {p0, p1}, Lln/m;->n(Ljava/lang/CharSequence;I)I

    move-result p0

    return p0
.end method

.method public static m(Lpn/i;)Lln/m;
    .locals 10

    invoke-static {p0}, Lpn/j;->h(Lpn/i;)Lpn/j;

    move-result-object p0

    invoke-static {p0}, Lqn/i;->k(Lpn/j;)Lqn/i;

    move-result-object p0

    const/16 v0, 0x23

    invoke-virtual {p0, v0}, Lqn/i;->g(C)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    const/4 v3, 0x6

    if-le v1, v3, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lqn/i;->e()Z

    move-result v3

    if-nez v3, :cond_1

    new-instance p0, Lln/m;

    invoke-static {}, Lpn/j;->b()Lpn/j;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lln/m;-><init>(ILpn/j;)V

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lqn/i;->l()C

    move-result v3

    const/16 v4, 0x9

    const/16 v5, 0x20

    if-eq v3, v5, :cond_2

    if-eq v3, v4, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p0}, Lqn/i;->r()I

    invoke-virtual {p0}, Lqn/i;->o()Lqn/h;

    move-result-object v2

    const/4 v3, 0x1

    move-object v6, v2

    :goto_0
    move v7, v3

    :goto_1
    invoke-virtual {p0}, Lqn/i;->e()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {p0}, Lqn/i;->l()C

    move-result v8

    if-eq v8, v4, :cond_7

    if-eq v8, v5, :cond_7

    const/4 v9, 0x0

    if-eq v8, v0, :cond_3

    invoke-virtual {p0}, Lqn/i;->h()V

    invoke-virtual {p0}, Lqn/i;->o()Lqn/h;

    move-result-object v6

    goto :goto_2

    :cond_3
    if-eqz v7, :cond_6

    invoke-virtual {p0, v0}, Lqn/i;->g(C)I

    invoke-virtual {p0}, Lqn/i;->r()I

    move-result v7

    invoke-virtual {p0}, Lqn/i;->e()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {p0}, Lqn/i;->o()Lqn/h;

    move-result-object v6

    :cond_4
    if-lez v7, :cond_5

    goto :goto_0

    :cond_5
    :goto_2
    move v7, v9

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lqn/i;->h()V

    invoke-virtual {p0}, Lqn/i;->o()Lqn/h;

    move-result-object v6

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lqn/i;->h()V

    goto :goto_0

    :cond_8
    invoke-virtual {p0, v2, v6}, Lqn/i;->d(Lqn/h;Lqn/h;)Lpn/j;

    move-result-object p0

    invoke-virtual {p0}, Lpn/j;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance p0, Lln/m;

    invoke-static {}, Lpn/j;->b()Lpn/j;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lln/m;-><init>(ILpn/j;)V

    return-object p0

    :cond_9
    new-instance v0, Lln/m;

    invoke-direct {v0, v1, p0}, Lln/m;-><init>(ILpn/j;)V

    return-object v0

    :cond_a
    :goto_3
    return-object v2
.end method

.method public static n(Ljava/lang/CharSequence;I)I
    .locals 3

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x2d

    if-eq v0, v2, :cond_1

    const/16 v2, 0x3d

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    add-int/2addr p1, v1

    invoke-static {p0, p1, v2}, Lln/m;->o(Ljava/lang/CharSequence;IC)Z

    move-result p0

    if-eqz p0, :cond_2

    return v1

    :cond_1
    add-int/2addr p1, v1

    invoke-static {p0, p1, v2}, Lln/m;->o(Ljava/lang/CharSequence;IC)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static o(Ljava/lang/CharSequence;IC)Z
    .locals 1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p2, p0, p1, v0}, Ltn/d;->i(CLjava/lang/CharSequence;II)I

    move-result p1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {p0, p1, p2}, Ltn/d;->k(Ljava/lang/CharSequence;II)I

    move-result p1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-lt p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public c(Lpn/b;)V
    .locals 2

    iget-object v0, p0, Lln/m;->b:Lpn/j;

    iget-object v1, p0, Lln/m;->a:Lon/j;

    invoke-interface {p1, v0, v1}, Lpn/b;->a(Lpn/j;Lon/s;)V

    return-void
.end method

.method public g()Lon/a;
    .locals 1

    iget-object v0, p0, Lln/m;->a:Lon/j;

    return-object v0
.end method

.method public j(Lrn/h;)Lrn/c;
    .locals 0

    invoke-static {}, Lrn/c;->d()Lrn/c;

    move-result-object p1

    return-object p1
.end method
