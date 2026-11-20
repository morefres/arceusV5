.class public Lmn/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqn/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmn/i$a;
    }
.end annotation


# static fields
.field public static final a:Ltn/a;

.field public static final b:Ltn/a;

.field public static final c:Ltn/a;

.field public static final d:Ltn/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    invoke-static {}, Ltn/a;->b()Ltn/a$a;

    move-result-object v0

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-virtual {v0, v1, v2}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v0

    const/16 v3, 0x46

    const/16 v4, 0x41

    invoke-virtual {v0, v4, v3}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v0

    const/16 v3, 0x66

    const/16 v5, 0x61

    invoke-virtual {v0, v5, v3}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ltn/a$a;->b()Ltn/a;

    move-result-object v0

    sput-object v0, Lmn/i;->a:Ltn/a;

    invoke-static {}, Ltn/a;->b()Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ltn/a$a;->b()Ltn/a;

    move-result-object v0

    sput-object v0, Lmn/i;->b:Ltn/a;

    invoke-static {}, Ltn/a;->b()Ltn/a$a;

    move-result-object v0

    const/16 v3, 0x5a

    invoke-virtual {v0, v4, v3}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v0

    const/16 v3, 0x7a

    invoke-virtual {v0, v5, v3}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ltn/a$a;->b()Ltn/a;

    move-result-object v0

    sput-object v0, Lmn/i;->c:Ltn/a;

    invoke-virtual {v0}, Ltn/a;->c()Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ltn/a$a;->d(CC)Ltn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ltn/a$a;->b()Ltn/a;

    move-result-object v0

    sput-object v0, Lmn/i;->d:Ltn/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqn/c;)Lqn/g;
    .locals 4

    invoke-interface {p1}, Lqn/c;->b()Lqn/i;

    move-result-object p1

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v0

    invoke-virtual {p1}, Lqn/i;->h()V

    invoke-virtual {p1}, Lqn/i;->l()C

    move-result v1

    const/16 v2, 0x23

    const/16 v3, 0x3b

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Lqn/i;->h()V

    const/16 v1, 0x78

    invoke-virtual {p1, v1}, Lqn/i;->i(C)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const/16 v1, 0x58

    invoke-virtual {p1, v1}, Lqn/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lmn/i;->b:Ltn/a;

    invoke-virtual {p1, v1}, Lqn/i;->f(Ltn/c;)I

    move-result v1

    if-gt v2, v1, :cond_3

    const/4 v2, 0x7

    if-gt v1, v2, :cond_3

    invoke-virtual {p1, v3}, Lqn/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1, v0}, Lmn/i;->b(Lqn/i;Lqn/h;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object v1, Lmn/i;->a:Ltn/a;

    invoke-virtual {p1, v1}, Lqn/i;->f(Ltn/c;)I

    move-result v1

    if-gt v2, v1, :cond_3

    const/4 v2, 0x6

    if-gt v1, v2, :cond_3

    invoke-virtual {p1, v3}, Lqn/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1, v0}, Lmn/i;->b(Lqn/i;Lqn/h;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v2, Lmn/i;->c:Ltn/a;

    invoke-virtual {v2, v1}, Ltn/a;->a(C)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lmn/i;->d:Ltn/a;

    invoke-virtual {p1, v1}, Lqn/i;->f(Ltn/c;)I

    invoke-virtual {p1, v3}, Lqn/i;->i(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1, v0}, Lmn/i;->b(Lqn/i;Lqn/h;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lqn/g;->a()Lqn/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lqn/i;Lqn/h;)Lqn/g;
    .locals 1

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lqn/i;->d(Lqn/h;Lqn/h;)Lpn/j;

    move-result-object p2

    invoke-virtual {p2}, Lpn/j;->c()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lon/b0;

    invoke-static {p2}, Lnn/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lon/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object p1

    invoke-static {v0, p1}, Lqn/g;->b(Lon/s;Lqn/h;)Lqn/g;

    move-result-object p1

    return-object p1
.end method
