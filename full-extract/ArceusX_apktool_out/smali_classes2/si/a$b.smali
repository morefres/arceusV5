.class public Lsi/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public final synthetic c:Lsi/a;


# direct methods
.method public constructor <init>(Lsi/a;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lsi/a$b;->c:Lsi/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lsi/a$b;->a:Ljava/lang/String;

    iput-wide p3, p0, Lsi/a$b;->b:J

    return-void
.end method


# virtual methods
.method public start()V
    .locals 5

    iget-object v0, p0, Lsi/a$b;->c:Lsi/a;

    invoke-static {v0}, Lsi/a;->f(Lsi/a;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lek/t;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->H1()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsi/a$b;->c:Lsi/a;

    invoke-static {v0}, Lsi/a;->f(Lsi/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ldj/a0;->R(Landroid/content/Context;)Ldj/a0;

    move-result-object v0

    iget-wide v2, p0, Lsi/a$b;->b:J

    invoke-virtual {v0, v2, v3, v1}, Ldj/a0;->K(JZ)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lsi/a$b;->c:Lsi/a;

    invoke-static {v0}, Lsi/a;->f(Lsi/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ldj/m;->F0(Landroid/content/Context;)Ldj/m;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v2

    invoke-interface {v2}, Lrh/i;->n3()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v2

    invoke-interface {v2}, Lrh/i;->q()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Lsi/a$b;->b:J

    iget-object v4, p0, Lsi/a$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v4, v1}, Ldj/m;->m1(JLjava/lang/String;Z)V

    goto :goto_0

    :cond_1
    iget-wide v2, p0, Lsi/a$b;->b:J

    iget-object v4, p0, Lsi/a$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v4, v1}, Ldj/m;->A0(JLjava/lang/String;Z)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lek/t;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->D5()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lsi/a$b;->c:Lsi/a;

    invoke-static {v0}, Lsi/a;->f(Lsi/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lgj/a;->a(Landroid/content/Context;)Lgj/a;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lsi/a$b;->c:Lsi/a;

    invoke-static {v0}, Lsi/a;->f(Lsi/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lgj/b;->a(Landroid/content/Context;)Lgj/b;

    const/4 v0, 0x0

    throw v0

    :cond_4
    :goto_0
    iget-object v0, p0, Lsi/a$b;->c:Lsi/a;

    const-string v1, "GrantPendingPurchases"

    invoke-virtual {v0, v1}, Ldh/d;->d(Ljava/lang/String;)V

    return-void
.end method
