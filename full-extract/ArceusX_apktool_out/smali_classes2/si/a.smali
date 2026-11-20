.class public Lsi/a;
.super Ldh/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsi/a$d;,
        Lsi/a$c;,
        Lsi/a$a;,
        Lsi/a$b;
    }
.end annotation


# instance fields
.field public d:Landroid/content/Context;

.field public e:J

.field public f:Ljava/lang/String;

.field public g:Lsi/a$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Ldh/d;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lsi/a;->d:Landroid/content/Context;

    iput-wide p3, p0, Lsi/a;->e:J

    iput-object p5, p0, Lsi/a;->f:Ljava/lang/String;

    new-instance p1, Lsi/a$c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lsi/a$c;-><init>(Lsi/a;Lsi/b;)V

    invoke-virtual {p0, p1}, Ldh/d;->a(Ldh/d$a;)V

    new-instance p1, Lsi/a$a;

    invoke-direct {p1, p0}, Lsi/a$a;-><init>(Lsi/a;)V

    invoke-virtual {p0, p1}, Ldh/d;->a(Ldh/d$a;)V

    new-instance p1, Lsi/a$b;

    iget-object p2, p0, Lsi/a;->f:Ljava/lang/String;

    iget-wide p3, p0, Lsi/a;->e:J

    invoke-direct {p1, p0, p2, p3, p4}, Lsi/a$b;-><init>(Lsi/a;Ljava/lang/String;J)V

    invoke-virtual {p0, p1}, Ldh/d;->a(Ldh/d$a;)V

    return-void
.end method

.method public static bridge synthetic f(Lsi/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lsi/a;->d:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lsi/a;->g:Lsi/a$d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lsi/a$d;->a()V

    :cond_0
    return-void
.end method

.method public g(Lsi/a$d;)V
    .locals 0

    iput-object p1, p0, Lsi/a;->g:Lsi/a$d;

    return-void
.end method
