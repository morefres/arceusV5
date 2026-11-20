.class public Lln/c;
.super Lrn/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lln/c$a;
    }
.end annotation


# instance fields
.field public final a:Lon/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lrn/a;-><init>()V

    new-instance v0, Lon/b;

    invoke-direct {v0}, Lon/b;-><init>()V

    iput-object v0, p0, Lln/c;->a:Lon/b;

    return-void
.end method

.method public static bridge synthetic k(Lrn/h;I)Z
    .locals 0

    invoke-static {p0, p1}, Lln/c;->m(Lrn/h;I)Z

    move-result p0

    return p0
.end method

.method public static m(Lrn/h;I)Z
    .locals 2

    invoke-interface {p0}, Lrn/h;->b()Lpn/i;

    move-result-object v0

    invoke-virtual {v0}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {p0}, Lrn/h;->d()I

    move-result p0

    sget v1, Lnn/f;->a:I

    if-ge p0, v1, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-ge p1, p0, :cond_0

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    const/16 p1, 0x3e

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f(Lon/a;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic g()Lon/a;
    .locals 1

    invoke-virtual {p0}, Lln/c;->l()Lon/b;

    move-result-object v0

    return-object v0
.end method

.method public j(Lrn/h;)Lrn/c;
    .locals 3

    invoke-interface {p1}, Lrn/h;->e()I

    move-result v0

    invoke-static {p1, v0}, Lln/c;->m(Lrn/h;I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lrn/h;->c()I

    move-result v1

    invoke-interface {p1}, Lrn/h;->d()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v2, v1, 0x1

    invoke-interface {p1}, Lrn/h;->b()Lpn/i;

    move-result-object p1

    invoke-virtual {p1}, Lpn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Ltn/d;->g(Ljava/lang/CharSequence;I)Z

    move-result p1

    if-eqz p1, :cond_0

    add-int/lit8 v2, v1, 0x2

    :cond_0
    invoke-static {v2}, Lrn/c;->a(I)Lrn/c;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lrn/c;->d()Lrn/c;

    move-result-object p1

    return-object p1
.end method

.method public l()Lon/b;
    .locals 1

    iget-object v0, p0, Lln/c;->a:Lon/b;

    return-object v0
.end method
