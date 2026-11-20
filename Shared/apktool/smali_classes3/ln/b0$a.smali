.class public Lln/b0$a;
.super Lrn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lln/b0;
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

    const/4 v0, 0x4

    if-lt p2, v0, :cond_0

    invoke-static {}, Lrn/f;->c()Lrn/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lrn/h;->e()I

    move-result p2

    invoke-interface {p1}, Lrn/h;->b()Lpn/i;

    move-result-object v0

    invoke-virtual {v0}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0, p2}, Lln/b0;->k(Ljava/lang/CharSequence;I)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Lrn/h;->getIndex()I

    move-result p1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lln/b0;

    invoke-direct {p2, p1}, Lln/b0;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    new-array p1, p1, [Lrn/d;

    const/4 v1, 0x0

    aput-object p2, p1, v1

    invoke-static {p1}, Lrn/f;->d([Lrn/d;)Lrn/f;

    move-result-object p1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Lrn/f;->b(I)Lrn/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lrn/f;->c()Lrn/f;

    move-result-object p1

    return-object p1
.end method
