.class public Ltk/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltk/d;


# instance fields
.field public a:Lxk/k;

.field public b:Lxk/d;

.field public c:Lxk/e;

.field public d:Lxk/h;

.field public e:Lxk/j;

.field public f:Lxk/i;

.field public g:Lxk/g;

.field public h:Lxk/f;

.field public i:Lxk/n;

.field public j:Lxk/b;

.field public k:Lxk/c;

.field public l:Lxk/a;

.field public m:Lxk/m;

.field public n:Lokhttp3/OkHttpClient;

.field public o:Liv/e$a;


# direct methods
.method public constructor <init>(Lokhttp3/OkHttpClient;Liv/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    iput-object p2, p0, Ltk/h;->o:Liv/e$a;

    return-void
.end method


# virtual methods
.method public a()Lxk/h;
    .locals 2

    iget-object v0, p0, Ltk/h;->d:Lxk/h;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Metrics interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Lxk/f;
    .locals 2

    iget-object v0, p0, Ltk/h;->h:Lxk/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Friends interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Lxk/k;
    .locals 2

    iget-object v0, p0, Ltk/h;->a:Lxk/k;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "PlatformChat interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Lxk/m;
    .locals 2

    iget-object v0, p0, Ltk/h;->m:Lxk/m;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Thumbnails interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Lokhttp3/OkHttpClient;)Lxk/g;
    .locals 3

    new-instance v0, Lxk/l;

    invoke-static {}, Ltk/g;->c()Ltk/b;

    move-result-object v1

    iget-object v1, v1, Ltk/b;->a:Ljava/lang/String;

    const-string v2, "locale"

    invoke-direct {v0, v2, v1}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object p1

    iget-object v0, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {p1, v0}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object p1

    const-class v0, Lxk/g;

    invoke-virtual {p1, v0}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxk/g;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Locale interface not initialized"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()Lxk/j;
    .locals 2

    iget-object v0, p0, Ltk/h;->e:Lxk/j;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Notifications interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g(Ltk/b;)Lxk/i;
    .locals 2

    iget-object v0, p0, Ltk/h;->f:Lxk/i;

    if-nez v0, :cond_0

    new-instance v0, Lxk/l;

    const-string v1, "apis"

    iget-object p1, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, p1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object p1

    iget-object v0, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {p1, v0}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object p1

    const-class v0, Lxk/i;

    invoke-virtual {p1, v0}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxk/i;

    iput-object p1, p0, Ltk/h;->f:Lxk/i;

    :cond_0
    iget-object p1, p0, Ltk/h;->f:Lxk/i;

    return-object p1
.end method

.method public h()Lxk/b;
    .locals 2

    iget-object v0, p0, Ltk/h;->j:Lxk/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "AccountSettings interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(Ltk/b;)Ltk/d;
    .locals 3

    iget-object v0, p0, Ltk/h;->a:Lxk/k;

    if-nez v0, :cond_0

    new-instance v0, Lxk/l;

    const-string v1, "apis"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/k;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/k;

    iput-object v0, p0, Ltk/h;->a:Lxk/k;

    :cond_0
    iget-object v0, p0, Ltk/h;->b:Lxk/d;

    if-nez v0, :cond_1

    new-instance v0, Lxk/l;

    const-string v1, "chat"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/d;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/d;

    iput-object v0, p0, Ltk/h;->b:Lxk/d;

    :cond_1
    iget-object v0, p0, Ltk/h;->c:Lxk/e;

    if-nez v0, :cond_2

    new-instance v0, Lxk/l;

    const-string v1, "clientsettings.api"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/e;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/e;

    iput-object v0, p0, Ltk/h;->c:Lxk/e;

    :cond_2
    iget-object v0, p0, Ltk/h;->d:Lxk/h;

    if-nez v0, :cond_3

    new-instance v0, Lxk/l;

    const-string v1, "metrics"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/h;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/h;

    iput-object v0, p0, Ltk/h;->d:Lxk/h;

    :cond_3
    iget-object v0, p0, Ltk/h;->e:Lxk/j;

    if-nez v0, :cond_4

    new-instance v0, Lxk/l;

    const-string v1, "notifications"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/j;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/j;

    iput-object v0, p0, Ltk/h;->e:Lxk/j;

    :cond_4
    iget-object v0, p0, Ltk/h;->g:Lxk/g;

    if-nez v0, :cond_5

    new-instance v0, Lxk/l;

    const-string v1, "locale"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/g;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/g;

    iput-object v0, p0, Ltk/h;->g:Lxk/g;

    :cond_5
    iget-object v0, p0, Ltk/h;->h:Lxk/f;

    if-nez v0, :cond_6

    new-instance v0, Lxk/l;

    const-string v1, "friends"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/f;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/f;

    iput-object v0, p0, Ltk/h;->h:Lxk/f;

    :cond_6
    iget-object v0, p0, Ltk/h;->i:Lxk/n;

    if-nez v0, :cond_7

    new-instance v0, Lxk/l;

    const-string v1, "translations"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/n;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/n;

    iput-object v0, p0, Ltk/h;->i:Lxk/n;

    :cond_7
    iget-object v0, p0, Ltk/h;->j:Lxk/b;

    if-nez v0, :cond_8

    new-instance v0, Lxk/l;

    const-string v1, "accountsettings"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/b;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/b;

    iput-object v0, p0, Ltk/h;->j:Lxk/b;

    :cond_8
    iget-object v0, p0, Ltk/h;->k:Lxk/c;

    if-nez v0, :cond_9

    new-instance v0, Lxk/l;

    const-string v1, "auth"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/c;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/c;

    iput-object v0, p0, Ltk/h;->k:Lxk/c;

    :cond_9
    iget-object v0, p0, Ltk/h;->l:Lxk/a;

    if-nez v0, :cond_a

    new-instance v0, Lxk/l;

    const-string v1, "accountinformation"

    iget-object v2, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object v0

    iget-object v1, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {v0, v1}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object v0

    const-class v1, Lxk/a;

    invoke-virtual {v0, v1}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk/a;

    iput-object v0, p0, Ltk/h;->l:Lxk/a;

    :cond_a
    iget-object v0, p0, Ltk/h;->m:Lxk/m;

    if-nez v0, :cond_b

    new-instance v0, Lxk/l;

    const-string v1, "thumbnails"

    iget-object p1, p1, Ltk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lxk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Ltk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, p1}, Lxk/l;->f(Lokhttp3/OkHttpClient;)Lxk/l;

    move-result-object p1

    iget-object v0, p0, Ltk/h;->o:Liv/e$a;

    invoke-virtual {p1, v0}, Lxk/l;->e(Liv/e$a;)Lxk/l;

    move-result-object p1

    const-class v0, Lxk/m;

    invoke-virtual {p1, v0}, Lxk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxk/m;

    iput-object p1, p0, Ltk/h;->m:Lxk/m;

    :cond_b
    return-object p0
.end method
