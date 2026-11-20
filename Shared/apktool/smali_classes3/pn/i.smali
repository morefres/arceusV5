.class public Lpn/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:Lon/y;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Lon/y;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "content must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/CharSequence;

    iput-object p1, p0, Lpn/i;->a:Ljava/lang/CharSequence;

    iput-object p2, p0, Lpn/i;->b:Lon/y;

    return-void
.end method

.method public static c(Ljava/lang/CharSequence;Lon/y;)Lpn/i;
    .locals 1

    new-instance v0, Lpn/i;

    invoke-direct {v0, p0, p1}, Lpn/i;-><init>(Ljava/lang/CharSequence;Lon/y;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lpn/i;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public b()Lon/y;
    .locals 1

    iget-object v0, p0, Lpn/i;->b:Lon/y;

    return-object v0
.end method

.method public d(II)Lpn/i;
    .locals 3

    iget-object v0, p0, Lpn/i;->a:Ljava/lang/CharSequence;

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v1, p0, Lpn/i;->b:Lon/y;

    if-eqz v1, :cond_0

    sub-int/2addr p2, p1

    if-eqz p2, :cond_0

    invoke-virtual {v1}, Lon/y;->a()I

    move-result v1

    add-int/2addr v1, p1

    iget-object v2, p0, Lpn/i;->b:Lon/y;

    invoke-virtual {v2}, Lon/y;->b()I

    move-result v2

    add-int/2addr v2, p1

    iget-object p1, p0, Lpn/i;->b:Lon/y;

    invoke-virtual {p1}, Lon/y;->d()I

    move-result p1

    invoke-static {p1, v1, v2, p2}, Lon/y;->e(IIII)Lon/y;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lpn/i;->c(Ljava/lang/CharSequence;Lon/y;)Lpn/i;

    move-result-object p1

    return-object p1
.end method
