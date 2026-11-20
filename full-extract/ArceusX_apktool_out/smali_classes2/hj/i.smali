.class public Lhj/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkj/f0;)Lkj/m;
    .locals 1

    :try_start_0
    new-instance v0, Lkj/m;

    invoke-direct {v0, p1}, Lkj/m;-><init>(Lkj/f0;)V
    :try_end_0
    .catch Lhj/h; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lek/q;->d(Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Lkj/f0;Lkj/j0;)Lhj/j;
    .locals 1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lkj/f0;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, "FriendRequestAccepted"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "FriendRequestReceived"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PrivateMessageReceived"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    const-string v0, "ChatNewMessage"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    check-cast p2, Lkj/m;

    invoke-virtual {p0, p2}, Lhj/i;->d(Lkj/m;)Lhj/j;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    invoke-static {}, Lhj/u;->c()Lhj/u;

    move-result-object p2

    invoke-virtual {p2, p1}, Lhj/u;->d(Ljava/lang/String;)Lhj/j;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Lkj/f0;)Lkj/j0;
    .locals 2

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lkj/f0;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    :try_start_0
    const-string v1, "FriendRequestAccepted"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lkj/q;

    invoke-direct {v0, p1}, Lkj/q;-><init>(Lkj/f0;)V

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    const-string v1, "FriendRequestReceived"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Lkj/u;

    invoke-direct {v0, p1}, Lkj/u;-><init>(Lkj/f0;)V

    return-object v0

    :cond_1
    const-string v1, "PrivateMessageReceived"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, Lkj/c0;

    invoke-direct {v0, p1}, Lkj/c0;-><init>(Lkj/f0;)V

    return-object v0

    :cond_2
    const-string v1, "ChatNewMessage"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, Lhj/i;->a(Lkj/f0;)Lkj/m;

    move-result-object p1
    :try_end_0
    .catch Lhj/h; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lek/q;->d(Ljava/lang/String;)I

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Lkj/m;)Lhj/j;
    .locals 4

    invoke-static {}, Lhj/u;->c()Lhj/u;

    move-result-object v0

    invoke-virtual {p1}, Lkj/m;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lkj/m;->A()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lhj/u;->e(Ljava/lang/String;J)Lhj/j;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;Z)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lkj/a;

    move-object v1, p2

    move-wide v2, p3

    move-object v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lkj/a;-><init>(Ljava/lang/String;JLjava/lang/String;Z)V

    invoke-virtual {p0, v0}, Lhj/i;->d(Lkj/m;)Lhj/j;

    move-result-object p2

    invoke-virtual {p0, v0, p1, p2}, Lhj/i;->h(Lkj/j0;Landroid/content/Context;Lhj/j;)V

    return-void
.end method

.method public f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    new-instance v0, Lkj/a;

    invoke-direct {v0, p2, p3, p4, p5}, Lkj/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p0, v0}, Lhj/i;->d(Lkj/m;)Lhj/j;

    move-result-object p2

    invoke-virtual {p0, v0, p1, p2}, Lhj/i;->h(Lkj/j0;Landroid/content/Context;Lhj/j;)V

    return-void
.end method

.method public g(Lkj/f0;Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0, p1}, Lhj/i;->c(Lkj/f0;)Lkj/j0;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lhj/i;->b(Lkj/f0;Lkj/j0;)Lhj/j;

    move-result-object p1

    invoke-virtual {p0, v0, p2, p1}, Lhj/i;->h(Lkj/j0;Landroid/content/Context;Lhj/j;)V

    return-void
.end method

.method public h(Lkj/j0;Landroid/content/Context;Lhj/j;)V
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    invoke-interface {p3, p2, p1}, Lhj/j;->c(Landroid/content/Context;Lkj/j0;)V

    :cond_0
    return-void
.end method
