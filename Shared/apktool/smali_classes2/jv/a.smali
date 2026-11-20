.class public final Ljv/a;
.super Liv/h$a;
.source "SourceFile"


# instance fields
.field public final a:Ljg/f;

.field public final b:Z


# direct methods
.method public constructor <init>(Ljg/f;Z)V
    .locals 0

    invoke-direct {p0}, Liv/h$a;-><init>()V

    iput-object p1, p0, Ljv/a;->a:Ljg/f;

    iput-boolean p2, p0, Ljv/a;->b:Z

    return-void
.end method

.method public static f()Ljv/a;
    .locals 1

    new-instance v0, Ljg/f;

    invoke-direct {v0}, Ljg/f;-><init>()V

    invoke-static {v0}, Ljv/a;->g(Ljg/f;)Ljv/a;

    move-result-object v0

    return-object v0
.end method

.method public static g(Ljg/f;)Ljv/a;
    .locals 2

    if-eqz p0, :cond_0

    new-instance v0, Ljv/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ljv/a;-><init>(Ljg/f;Z)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "gson == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Liv/y;)Liv/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Liv/y;",
            ")",
            "Liv/h<",
            "*",
            "Lokhttp3/RequestBody;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, Ljv/a;->a:Ljg/f;

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljg/f;->n(Lcom/google/gson/reflect/TypeToken;)Ljg/a0;

    move-result-object p1

    new-instance p2, Ljv/b;

    iget-object p3, p0, Ljv/a;->a:Ljg/f;

    iget-boolean p4, p0, Ljv/a;->b:Z

    invoke-direct {p2, p3, p1, p4}, Ljv/b;-><init>(Ljg/f;Ljg/a0;Z)V

    return-object p2
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Liv/y;)Liv/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Liv/y;",
            ")",
            "Liv/h<",
            "Lokhttp3/ResponseBody;",
            "*>;"
        }
    .end annotation

    iget-object p2, p0, Ljv/a;->a:Ljg/f;

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljg/f;->n(Lcom/google/gson/reflect/TypeToken;)Ljg/a0;

    move-result-object p1

    new-instance p2, Ljv/c;

    iget-object p3, p0, Ljv/a;->a:Ljg/f;

    invoke-direct {p2, p3, p1}, Ljv/c;-><init>(Ljg/f;Ljg/a0;)V

    return-object p2
.end method
