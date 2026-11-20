.class public Ltk/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ltk/b;

.field public static c:Lokhttp3/OkHttpClient;

.field public static d:Luk/f;

.field public static e:Ltk/f;

.field public static f:Ltk/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltk/a;

    invoke-direct {v0}, Ltk/a;-><init>()V

    sput-object v0, Ltk/g;->e:Ltk/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 2

    new-instance v0, Ltk/i;

    invoke-direct {v0}, Ltk/i;-><init>()V

    invoke-static {p0}, Lcl/a;->c(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Ltk/i;->n(I)Ltk/i;

    move-result-object v0

    invoke-static {p0}, Lcl/a;->j(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltk/i;->p(Landroid/graphics/Point;)Ltk/i;

    move-result-object v0

    invoke-static {p0}, Lcl/a;->g(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltk/i;->g(Landroid/graphics/Point;)Ltk/i;

    move-result-object v0

    invoke-static {p0}, Lcl/a;->f(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p0

    invoke-virtual {v0, p0}, Ltk/i;->f(Landroid/graphics/Point;)Ltk/i;

    move-result-object p0

    invoke-static {p5}, Lcl/a;->b(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltk/i;->d(Ljava/lang/String;)Ltk/i;

    move-result-object p0

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ltk/i;->a(Ljava/lang/String;)Ltk/i;

    move-result-object p0

    invoke-virtual {p0, p2}, Ltk/i;->r(Ljava/lang/String;)Ltk/i;

    move-result-object p0

    invoke-virtual {p0, p1}, Ltk/i;->q(Ljava/lang/String;)Ltk/i;

    move-result-object p0

    invoke-virtual {p0, p3}, Ltk/i;->e(Ljava/lang/String;)Ltk/i;

    move-result-object p0

    invoke-virtual {p0, p4}, Ltk/i;->b(Ljava/lang/String;)Ltk/i;

    move-result-object p0

    invoke-virtual {p0, p5}, Ltk/i;->m(Z)Ltk/i;

    move-result-object p0

    invoke-virtual {p0, p6}, Ltk/i;->j(Z)Ltk/i;

    move-result-object p0

    invoke-virtual {p0, p7}, Ltk/i;->i(Z)Ltk/i;

    move-result-object p0

    invoke-virtual {p0, p8}, Ltk/i;->l(Z)Ltk/i;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ltk/i;->k(Z)Ltk/i;

    move-result-object p0

    invoke-virtual {p0}, Ltk/i;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b()Lokhttp3/OkHttpClient;
    .locals 2

    sget-object v0, Ltk/g;->c:Lokhttp3/OkHttpClient;

    if-nez v0, :cond_2

    const-class v0, Ltk/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ltk/g;->c:Lokhttp3/OkHttpClient;

    if-nez v1, :cond_1

    sget-object v1, Ltk/g;->d:Luk/f;

    if-nez v1, :cond_0

    new-instance v1, Luk/c;

    invoke-direct {v1}, Luk/c;-><init>()V

    sput-object v1, Ltk/g;->d:Luk/f;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Ltk/g;->d:Luk/f;

    invoke-interface {v1}, Luk/f;->a()Lokhttp3/OkHttpClient;

    move-result-object v1

    sput-object v1, Ltk/g;->c:Lokhttp3/OkHttpClient;

    :cond_1
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_2
    sget-object v0, Ltk/g;->c:Lokhttp3/OkHttpClient;

    return-object v0
.end method

.method public static c()Ltk/b;
    .locals 1

    sget-object v0, Ltk/g;->b:Ltk/b;

    return-object v0
.end method

.method public static d()Ltk/d;
    .locals 2

    sget-object v0, Ltk/g;->f:Ltk/d;

    if-nez v0, :cond_1

    const-class v0, Ltk/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ltk/g;->f:Ltk/d;

    if-nez v1, :cond_0

    sget-object v1, Ltk/g;->e:Ltk/f;

    invoke-interface {v1}, Ltk/f;->a()Ltk/d;

    move-result-object v1

    sput-object v1, Ltk/g;->f:Ltk/d;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Ltk/g;->f:Ltk/d;

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    sget-object v0, Ltk/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static f(Luk/a;)V
    .locals 0

    invoke-static {p0}, Luk/k;->b(Luk/a;)V

    return-void
.end method

.method public static g(Ltk/b;)V
    .locals 0

    sput-object p0, Ltk/g;->b:Ltk/b;

    return-void
.end method

.method public static h(Luk/f;)V
    .locals 0

    sput-object p0, Ltk/g;->d:Luk/f;

    return-void
.end method

.method public static i(Ltk/f;)V
    .locals 1

    sput-object p0, Ltk/g;->e:Ltk/f;

    const-class p0, Ltk/g;

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Ltk/g;->f:Ltk/d;

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static j(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Ltk/g;->a:Ljava/lang/String;

    return-void
.end method
