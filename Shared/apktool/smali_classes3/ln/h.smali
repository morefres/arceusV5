.class public Lln/h;
.super Lrn/a;
.source "SourceFile"


# instance fields
.field public final a:Lon/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lrn/a;-><init>()V

    new-instance v0, Lon/f;

    invoke-direct {v0}, Lon/f;-><init>()V

    iput-object v0, p0, Lln/h;->a:Lon/f;

    return-void
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

    invoke-virtual {p0}, Lln/h;->k()Lon/f;

    move-result-object v0

    return-object v0
.end method

.method public j(Lrn/h;)Lrn/c;
    .locals 0

    invoke-interface {p1}, Lrn/h;->getIndex()I

    move-result p1

    invoke-static {p1}, Lrn/c;->b(I)Lrn/c;

    move-result-object p1

    return-object p1
.end method

.method public k()Lon/f;
    .locals 1

    iget-object v0, p0, Lln/h;->a:Lon/f;

    return-object v0
.end method
