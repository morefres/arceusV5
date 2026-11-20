.class public Lmn/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqn/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmn/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqn/c;)Lqn/g;
    .locals 6

    invoke-interface {p1}, Lqn/c;->b()Lqn/i;

    move-result-object p1

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v0

    const/16 v1, 0x60

    invoke-virtual {p1, v1}, Lqn/i;->g(C)I

    move-result v2

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v3

    :cond_0
    invoke-virtual {p1, v1}, Lqn/i;->b(C)I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v4

    invoke-virtual {p1, v1}, Lqn/i;->g(C)I

    move-result v5

    if-ne v5, v2, :cond_0

    new-instance v0, Lon/d;

    invoke-direct {v0}, Lon/d;-><init>()V

    invoke-virtual {p1, v3, v4}, Lqn/i;->d(Lqn/h;Lqn/h;)Lpn/j;

    move-result-object v1

    invoke-virtual {v1}, Lpn/j;->c()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xa

    const/16 v3, 0x20

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x3

    if-lt v2, v4, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v3, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v3, :cond_1

    invoke-static {v1}, Ltn/d;->c(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v4

    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Lon/d;->p(Ljava/lang/String;)V

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object p1

    invoke-static {v0, p1}, Lqn/g;->b(Lon/s;Lqn/h;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1, v0, v3}, Lqn/i;->d(Lqn/h;Lqn/h;)Lpn/j;

    move-result-object p1

    new-instance v0, Lon/b0;

    invoke-virtual {p1}, Lpn/j;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lon/b0;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Lqn/g;->b(Lon/s;Lqn/h;)Lqn/g;

    move-result-object p1

    return-object p1
.end method
