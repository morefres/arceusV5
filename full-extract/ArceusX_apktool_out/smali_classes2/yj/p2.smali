.class public Lyj/p2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lyj/p2;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static a()Ltk/b;
    .locals 5

    new-instance v0, Lek/f;

    invoke-direct {v0}, Lek/f;-><init>()V

    invoke-static {}, Lrg/a1;->H()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lrg/a1;->F()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ltk/b;

    invoke-static {}, Lrg/a1;->O()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1}, Lek/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Lek/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "api"

    :goto_0
    invoke-direct {v3, v4, v1, v0}, Ltk/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    sget-object p0, Lyj/p2;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lrg/a1;->a1()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ltk/g;->j(Ljava/lang/String;)V

    invoke-static {}, Lyj/p2;->a()Ltk/b;

    move-result-object p0

    invoke-static {p0}, Ltk/g;->g(Ltk/b;)V

    new-instance p0, Lci/t;

    invoke-direct {p0}, Lci/t;-><init>()V

    invoke-static {p0}, Ltk/g;->f(Luk/a;)V

    new-instance p0, Luk/c;

    invoke-direct {p0}, Luk/c;-><init>()V

    invoke-static {p0}, Ltk/g;->h(Luk/f;)V

    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lfh/d;

    invoke-direct {v0, p0}, Lfh/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p0}, Lfh/d;->a(Landroid/content/Context;)Lfh/c;

    move-result-object v0

    invoke-static {p0, v0}, Lrg/a1;->i0(Landroid/content/Context;Lfh/c;)V

    return-void
.end method
