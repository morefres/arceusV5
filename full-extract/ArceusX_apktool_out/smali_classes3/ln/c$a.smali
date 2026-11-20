.class public Lln/c$a;
.super Lrn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lln/c;
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
    .locals 3

    invoke-interface {p1}, Lrn/h;->e()I

    move-result p2

    invoke-static {p1, p2}, Lln/c;->k(Lrn/h;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lrn/h;->c()I

    move-result v0

    invoke-interface {p1}, Lrn/h;->d()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v1, v0, 0x1

    invoke-interface {p1}, Lrn/h;->b()Lpn/i;

    move-result-object p1

    invoke-virtual {p1}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    const/4 v2, 0x1

    add-int/2addr p2, v2

    invoke-static {p1, p2}, Ltn/d;->g(Ljava/lang/CharSequence;I)Z

    move-result p1

    if-eqz p1, :cond_0

    add-int/lit8 v1, v0, 0x2

    :cond_0
    new-instance p1, Lln/c;

    invoke-direct {p1}, Lln/c;-><init>()V

    new-array p2, v2, [Lrn/d;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p2}, Lrn/f;->d([Lrn/d;)Lrn/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lrn/f;->a(I)Lrn/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lrn/f;->c()Lrn/f;

    move-result-object p1

    return-object p1
.end method
