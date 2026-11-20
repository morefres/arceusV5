.class public Lmn/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqn/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmn/d$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lmn/d;->a:Ljava/util/regex/Pattern;

    const-string v0, "^([a-zA-Z0-9.!#$%&\'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lmn/d;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqn/c;)Lqn/g;
    .locals 5

    invoke-interface {p1}, Lqn/c;->b()Lqn/i;

    move-result-object p1

    invoke-virtual {p1}, Lqn/i;->h()V

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v0

    const/16 v1, 0x3e

    invoke-virtual {p1, v1}, Lqn/i;->b(C)I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lqn/i;->d(Lqn/h;Lqn/h;)Lpn/j;

    move-result-object v0

    invoke-virtual {v0}, Lpn/j;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lqn/i;->h()V

    sget-object v2, Lmn/d;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    sget-object v2, Lmn/d;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mailto:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_2

    new-instance v4, Lon/o;

    invoke-direct {v4, v2, v3}, Lon/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lon/b0;

    invoke-direct {v2, v1}, Lon/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lpn/j;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lon/s;->l(Ljava/util/List;)V

    invoke-virtual {v4, v2}, Lon/s;->c(Lon/s;)V

    invoke-virtual {p1}, Lqn/i;->o()Lqn/h;

    move-result-object p1

    invoke-static {v4, p1}, Lqn/g;->b(Lon/s;Lqn/h;)Lqn/g;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lqn/g;->a()Lqn/g;

    move-result-object p1

    return-object p1
.end method
