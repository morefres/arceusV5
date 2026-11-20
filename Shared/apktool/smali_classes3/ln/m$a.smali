.class public Lln/m$a;
.super Lrn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lln/m;
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

    invoke-interface {p1}, Lrn/h;->d()I

    move-result v0

    sget v1, Lnn/f;->a:I

    if-lt v0, v1, :cond_0

    invoke-static {}, Lrn/f;->c()Lrn/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lrn/h;->b()Lpn/i;

    move-result-object v0

    invoke-interface {p1}, Lrn/h;->e()I

    move-result p1

    invoke-virtual {v0}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x23

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lpn/i;->d(II)Lpn/i;

    move-result-object v1

    invoke-static {v1}, Lln/m;->k(Lpn/i;)Lln/m;

    move-result-object v1

    if-eqz v1, :cond_1

    new-array p1, v4, [Lrn/d;

    aput-object v1, p1, v3

    invoke-static {p1}, Lrn/f;->d([Lrn/d;)Lrn/f;

    move-result-object p1

    invoke-virtual {v0}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Lrn/f;->b(I)Lrn/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1, p1}, Lln/m;->l(Ljava/lang/CharSequence;I)I

    move-result p1

    if-lez p1, :cond_2

    invoke-interface {p2}, Lrn/g;->b()Lpn/j;

    move-result-object p2

    invoke-virtual {p2}, Lpn/j;->f()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Lln/m;

    invoke-direct {v1, p1, p2}, Lln/m;-><init>(ILpn/j;)V

    new-array p1, v4, [Lrn/d;

    aput-object v1, p1, v3

    invoke-static {p1}, Lrn/f;->d([Lrn/d;)Lrn/f;

    move-result-object p1

    invoke-virtual {v0}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Lrn/f;->b(I)Lrn/f;

    move-result-object p1

    invoke-virtual {p2}, Lpn/j;->d()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Lrn/f;->e(I)Lrn/f;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lrn/f;->c()Lrn/f;

    move-result-object p1

    return-object p1
.end method
