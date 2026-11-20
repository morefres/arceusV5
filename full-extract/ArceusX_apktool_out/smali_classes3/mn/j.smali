.class public Lmn/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqn/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmn/j$a;
    }
.end annotation


# static fields
.field public static final a:Ltn/a;

.field public static final b:Ltn/a;

.field public static final c:Ltn/a;

.field public static final d:Ltn/a;

.field public static final e:Ltn/a;

.field public static final f:Ltn/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Ltn/a;->b()Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x41

    const/16 v2, 0x5a

    invoke-virtual {v0, v1, v2}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x61

    const/16 v2, 0x7a

    invoke-virtual {v0, v1, v2}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ltn/a$a;->b()Ltn/a;

    move-result-object v0

    sput-object v0, Lmn/j;->a:Ltn/a;

    sput-object v0, Lmn/j;->b:Ltn/a;

    invoke-virtual {v0}, Ltn/a;->c()Ltn/a$a;

    move-result-object v1

    const/16 v2, 0x30

    const/16 v3, 0x39

    invoke-virtual {v1, v2, v3}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v1

    const/16 v4, 0x2d

    invoke-virtual {v1, v4}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v1

    invoke-virtual {v1}, Ltn/a$a;->b()Ltn/a;

    move-result-object v1

    sput-object v1, Lmn/j;->c:Ltn/a;

    invoke-virtual {v0}, Ltn/a;->c()Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ltn/a$a;->b()Ltn/a;

    move-result-object v0

    sput-object v0, Lmn/j;->d:Ltn/a;

    invoke-virtual {v0}, Ltn/a;->c()Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ltn/a$a;->b()Ltn/a;

    move-result-object v0

    sput-object v0, Lmn/j;->e:Ltn/a;

    invoke-static {}, Ltn/a;->b()Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x60

    invoke-virtual {v0, v1}, Ltn/a$a;->c(C)Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ltn/a$a;->b()Ltn/a;

    move-result-object v0

    sput-object v0, Lmn/j;->f:Ltn/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lqn/h;Lqn/i;)Lqn/g;
    .locals 1

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lqn/i;->d(Lqn/h;Lqn/h;)Lpn/j;

    move-result-object p0

    invoke-virtual {p0}, Lpn/j;->c()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lon/l;

    invoke-direct {v0}, Lon/l;-><init>()V

    invoke-virtual {v0, p0}, Lon/l;->o(Ljava/lang/String;)V

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object p0

    invoke-static {v0, p0}, Lqn/g;->b(Lon/s;Lqn/h;)Lqn/g;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lqn/i;)Z
    .locals 1

    invoke-virtual {p0}, Lqn/i;->h()V

    const-string v0, "CDATA["

    invoke-virtual {p0, v0}, Lqn/i;->j(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Lqn/i;->b(C)I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "]]>"

    invoke-virtual {p0, v0}, Lqn/i;->j(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p0}, Lqn/i;->h()V

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static d(Lqn/i;)Z
    .locals 2

    invoke-virtual {p0}, Lqn/i;->h()V

    sget-object v0, Lmn/j;->b:Ltn/a;

    invoke-virtual {p0, v0}, Lqn/i;->f(Ltn/c;)I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    sget-object v0, Lmn/j;->c:Ltn/a;

    invoke-virtual {p0, v0}, Lqn/i;->f(Ltn/c;)I

    invoke-virtual {p0}, Lqn/i;->r()I

    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lqn/i;->i(C)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static e(Lqn/i;)Z
    .locals 4

    invoke-virtual {p0}, Lqn/i;->h()V

    const/16 v0, 0x2d

    invoke-virtual {p0, v0}, Lqn/i;->i(C)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/16 v1, 0x3e

    invoke-virtual {p0, v1}, Lqn/i;->i(C)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_4

    const-string v1, "->"

    invoke-virtual {p0, v1}, Lqn/i;->j(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lqn/i;->b(C)I

    move-result v1

    if-ltz v1, :cond_3

    const-string v1, "-->"

    invoke-virtual {p0, v1}, Lqn/i;->j(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v3

    :cond_2
    invoke-virtual {p0}, Lqn/i;->h()V

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_1
    return v3
.end method

.method public static f(Lqn/i;)Z
    .locals 2

    sget-object v0, Lmn/j;->a:Ltn/a;

    invoke-virtual {p0, v0}, Lqn/i;->f(Ltn/c;)I

    invoke-virtual {p0}, Lqn/i;->r()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lqn/i;->b(C)I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lqn/i;->h()V

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public static g(Lqn/i;)Z
    .locals 4

    invoke-virtual {p0}, Lqn/i;->h()V

    sget-object v0, Lmn/j;->c:Ltn/a;

    invoke-virtual {p0, v0}, Lqn/i;->f(Ltn/c;)I

    invoke-virtual {p0}, Lqn/i;->r()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lt v0, v2, :cond_0

    :goto_0
    move v0, v2

    goto :goto_1

    :cond_0
    move v0, v1

    :cond_1
    :goto_1
    if-eqz v0, :cond_8

    sget-object v0, Lmn/j;->d:Ltn/a;

    invoke-virtual {p0, v0}, Lqn/i;->f(Ltn/c;)I

    move-result v0

    if-lt v0, v2, :cond_8

    sget-object v0, Lmn/j;->e:Ltn/a;

    invoke-virtual {p0, v0}, Lqn/i;->f(Ltn/c;)I

    invoke-virtual {p0}, Lqn/i;->r()I

    move-result v0

    if-lt v0, v2, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    const/16 v3, 0x3d

    invoke-virtual {p0, v3}, Lqn/i;->i(C)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lqn/i;->r()I

    invoke-virtual {p0}, Lqn/i;->l()C

    move-result v0

    const/16 v3, 0x27

    if-ne v0, v3, :cond_4

    invoke-virtual {p0}, Lqn/i;->h()V

    invoke-virtual {p0, v3}, Lqn/i;->b(C)I

    move-result v0

    if-gez v0, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, Lqn/i;->h()V

    goto :goto_3

    :cond_4
    const/16 v3, 0x22

    if-ne v0, v3, :cond_6

    invoke-virtual {p0}, Lqn/i;->h()V

    invoke-virtual {p0, v3}, Lqn/i;->b(C)I

    move-result v0

    if-gez v0, :cond_5

    return v1

    :cond_5
    invoke-virtual {p0}, Lqn/i;->h()V

    goto :goto_3

    :cond_6
    sget-object v0, Lmn/j;->f:Ltn/a;

    invoke-virtual {p0, v0}, Lqn/i;->c(Ltn/c;)I

    move-result v0

    if-gtz v0, :cond_7

    return v1

    :cond_7
    :goto_3
    invoke-virtual {p0}, Lqn/i;->r()I

    move-result v0

    if-lt v0, v2, :cond_0

    goto :goto_0

    :cond_8
    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Lqn/i;->i(C)Z

    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lqn/i;->i(C)Z

    move-result p0

    return p0
.end method

.method public static h(Lqn/i;)Z
    .locals 1

    invoke-virtual {p0}, Lqn/i;->h()V

    :cond_0
    const/16 v0, 0x3f

    invoke-virtual {p0, v0}, Lqn/i;->b(C)I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lqn/i;->h()V

    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lqn/i;->i(C)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(Lqn/c;)Lqn/g;
    .locals 3

    invoke-interface {p1}, Lqn/c;->b()Lqn/i;

    move-result-object p1

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v0

    invoke-virtual {p1}, Lqn/i;->h()V

    invoke-virtual {p1}, Lqn/i;->l()C

    move-result v1

    sget-object v2, Lmn/j;->b:Ltn/a;

    invoke-virtual {v2, v1}, Ltn/a;->a(C)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1}, Lmn/j;->g(Lqn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lmn/j;->b(Lqn/h;Lqn/i;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 v2, 0x2f

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lmn/j;->d(Lqn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lmn/j;->b(Lqn/h;Lqn/i;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 v2, 0x3f

    if-ne v1, v2, :cond_2

    invoke-static {p1}, Lmn/j;->h(Lqn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lmn/j;->b(Lqn/h;Lqn/i;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 v2, 0x21

    if-ne v1, v2, :cond_5

    invoke-virtual {p1}, Lqn/i;->h()V

    invoke-virtual {p1}, Lqn/i;->l()C

    move-result v1

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lmn/j;->e(Lqn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lmn/j;->b(Lqn/h;Lqn/i;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_3
    const/16 v2, 0x5b

    if-ne v1, v2, :cond_4

    invoke-static {p1}, Lmn/j;->c(Lqn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lmn/j;->b(Lqn/h;Lqn/i;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object v2, Lmn/j;->a:Ltn/a;

    invoke-virtual {v2, v1}, Ltn/a;->a(C)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {p1}, Lmn/j;->f(Lqn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lmn/j;->b(Lqn/h;Lqn/i;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-static {}, Lqn/g;->a()Lqn/g;

    move-result-object p1

    return-object p1
.end method
