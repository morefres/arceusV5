.class public Lmn/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqn/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lqn/d;Lqn/i;Ljava/lang/String;Ljava/lang/String;)Lqn/f;
    .locals 1

    invoke-interface {p0}, Lqn/d;->a()Lon/b0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lqn/d;->a()Lon/b0;

    move-result-object p0

    invoke-virtual {p0}, Lon/b0;->o()Ljava/lang/String;

    move-result-object p0

    const-string v0, "!"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Lon/m;

    invoke-direct {p0, p2, p3}, Lon/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object p1

    invoke-static {p0, p1}, Lqn/f;->b(Lon/s;Lqn/h;)Lqn/f;

    move-result-object p0

    invoke-interface {p0}, Lqn/f;->c()Lqn/f;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lon/o;

    invoke-direct {p0, p2, p3}, Lon/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object p1

    invoke-static {p0, p1}, Lqn/f;->b(Lon/s;Lqn/h;)Lqn/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lqn/d;Lqn/i;Lpn/c;)Lqn/f;
    .locals 2

    invoke-interface {p1}, Lqn/d;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lqn/d;->e()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1}, Lqn/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lmn/g;->b(Lqn/d;Lqn/i;Ljava/lang/String;Ljava/lang/String;)Lqn/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lqn/d;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lqn/d;->d()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-class v1, Lon/p;

    invoke-interface {p3, v1, v0}, Lpn/c;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lon/p;

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lon/p;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lon/p;->r()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p2, v0, p3}, Lmn/g;->b(Lqn/d;Lqn/i;Ljava/lang/String;Ljava/lang/String;)Lqn/f;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lqn/f;->a()Lqn/f;

    move-result-object p1

    return-object p1
.end method
