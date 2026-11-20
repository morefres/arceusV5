.class public Lln/l$a;
.super Lrn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lln/l;
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
    .locals 2

    invoke-interface {p1}, Lrn/h;->d()I

    move-result p2

    sget v0, Lnn/f;->a:I

    if-lt p2, v0, :cond_0

    invoke-static {}, Lrn/f;->c()Lrn/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lrn/h;->e()I

    move-result v0

    invoke-interface {p1}, Lrn/h;->b()Lpn/i;

    move-result-object p1

    invoke-virtual {p1}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1, v0, p2}, Lln/l;->l(Ljava/lang/CharSequence;II)Lln/l;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    new-array p2, p2, [Lrn/d;

    const/4 v1, 0x0

    aput-object p1, p2, v1

    invoke-static {p2}, Lrn/f;->d([Lrn/d;)Lrn/f;

    move-result-object p2

    invoke-static {p1}, Lln/l;->k(Lln/l;)Lon/h;

    move-result-object p1

    invoke-virtual {p1}, Lon/h;->t()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p2, v0}, Lrn/f;->b(I)Lrn/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lrn/f;->c()Lrn/f;

    move-result-object p1

    return-object p1
.end method
