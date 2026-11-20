.class public Lln/p$a;
.super Lrn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lln/p;
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

    invoke-interface {p1}, Lrn/h;->a()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p1}, Lrn/h;->f()Lrn/d;

    move-result-object p2

    invoke-interface {p2}, Lrn/d;->g()Lon/a;

    move-result-object p2

    instance-of p2, p2, Lon/w;

    if-nez p2, :cond_0

    new-instance p2, Lln/p;

    invoke-direct {p2}, Lln/p;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [Lrn/d;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {v0}, Lrn/f;->d([Lrn/d;)Lrn/f;

    move-result-object p2

    invoke-interface {p1}, Lrn/h;->c()I

    move-result p1

    sget v0, Lnn/f;->a:I

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Lrn/f;->a(I)Lrn/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lrn/f;->c()Lrn/f;

    move-result-object p1

    return-object p1
.end method
