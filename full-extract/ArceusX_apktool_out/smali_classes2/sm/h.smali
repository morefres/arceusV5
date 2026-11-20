.class public abstract Lsm/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsm/h$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final failOnUnknown()Lsm/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsm/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lsm/h$c;

    invoke-direct {v0, p0, p0}, Lsm/h$c;-><init>(Lsm/h;Lsm/h;)V

    return-object v0
.end method

.method public final fromJson(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 2
    new-instance v0, Lwu/e;

    invoke-direct {v0}, Lwu/e;-><init>()V

    invoke-virtual {v0, p1}, Lwu/e;->F0(Ljava/lang/String;)Lwu/e;

    move-result-object p1

    invoke-static {p1}, Lsm/m;->s(Lwu/g;)Lsm/m;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1}, Lsm/h;->fromJson(Lsm/m;)Ljava/lang/Object;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lsm/h;->isLenient()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lsm/m;->u()Lsm/m$c;

    move-result-object p1

    sget-object v1, Lsm/m$c;->j:Lsm/m$c;

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Lsm/j;

    const-string v0, "JSON document was not fully consumed."

    invoke-direct {p1, v0}, Lsm/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public abstract fromJson(Lsm/m;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsm/m;",
            ")TT;"
        }
    .end annotation
.end method

.method public final fromJson(Lwu/g;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwu/g;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lsm/m;->s(Lwu/g;)Lsm/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Lsm/h;->fromJson(Lsm/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final fromJsonValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    new-instance v0, Lsm/q;

    invoke-direct {v0, p1}, Lsm/q;-><init>(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p0, v0}, Lsm/h;->fromJson(Lsm/m;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public indent(Ljava/lang/String;)Lsm/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lsm/h<",
            "TT;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, Lsm/h$d;

    invoke-direct {v0, p0, p0, p1}, Lsm/h$d;-><init>(Lsm/h;Lsm/h;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "indent == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isLenient()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final lenient()Lsm/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsm/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lsm/h$b;

    invoke-direct {v0, p0, p0}, Lsm/h$b;-><init>(Lsm/h;Lsm/h;)V

    return-object v0
.end method

.method public final nonNull()Lsm/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsm/h<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lum/a;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lum/a;

    invoke-direct {v0, p0}, Lum/a;-><init>(Lsm/h;)V

    return-object v0
.end method

.method public final nullSafe()Lsm/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsm/h<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lum/b;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lum/b;

    invoke-direct {v0, p0}, Lum/b;-><init>(Lsm/h;)V

    return-object v0
.end method

.method public final serializeNulls()Lsm/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsm/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lsm/h$a;

    invoke-direct {v0, p0, p0}, Lsm/h$a;-><init>(Lsm/h;Lsm/h;)V

    return-object v0
.end method

.method public final toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 3
    new-instance v0, Lwu/e;

    invoke-direct {v0}, Lwu/e;-><init>()V

    .line 4
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lsm/h;->toJson(Lwu/f;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    invoke-virtual {v0}, Lwu/e;->S2()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public abstract toJson(Lsm/t;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsm/t;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final toJson(Lwu/f;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwu/f;",
            "TT;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lsm/t;->q(Lwu/f;)Lsm/t;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1, p2}, Lsm/h;->toJson(Lsm/t;Ljava/lang/Object;)V

    return-void
.end method

.method public final toJsonValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lsm/s;

    invoke-direct {v0}, Lsm/s;-><init>()V

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lsm/h;->toJson(Lsm/t;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lsm/s;->Z()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method
